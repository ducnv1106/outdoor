package brite.outdoor.ui.dialog

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.TimePicker
import androidx.fragment.app.viewModels
import brite.outdoor.constants.ApiConst.Companion.PARAM_API_LOCATION_ID
import brite.outdoor.constants.ApiConst.Companion.PARAM_NOTE
import brite.outdoor.constants.ApiConst.Companion.PARAM_TIME
import brite.outdoor.constants.AppConst.Companion.REQUEST_TIME
import brite.outdoor.constants.AppConst.Companion.millisHour
import brite.outdoor.constants.ExtraConst
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.response.ResponseCreateCamping
import brite.outdoor.data.api_entities.response.ResponseListCamping
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.DialogReminderBinding
import brite.outdoor.entity.EntityLocationSave
import brite.outdoor.ui.fragments.BaseDialogFragment
import brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior
import brite.outdoor.utils.resizeHeight
import brite.outdoor.utils.setSingleClick
import brite.outdoor.viewmodel.DetailViewModel
import brite.outdoor.viewmodel.LocationSaveViewModel
import brite.outdoor.viewmodel.QuestionViewModel
import brite.outdoor.viewmodel.ReminderViewModel
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.internal.notifyAll
import java.text.SimpleDateFormat
import java.util.*


@AndroidEntryPoint
class DialogFragmentReminder : BaseDialogFragment<DialogReminderBinding>() {
    private val viewModel by viewModels<ReminderViewModel>()
    private val locationSaveViewModel by viewModels<LocationSaveViewModel>({requireParentFragment()})
    private val detailViewModel by viewModels<DetailViewModel>({requireParentFragment()})

    private var entityLocationSave : ResponseListCamping.ListCampingData?=null
    companion object{
        fun getInstance(entity: ResponseListCamping.ListCampingData):DialogFragmentReminder{
            val dialog = DialogFragmentReminder()
            val bundle = Bundle()
            bundle.putParcelable(ExtraConst.EXTRA_LOCATION_SAVE_ENTITY,entity)
            dialog.arguments=bundle
            return dialog

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            entityLocationSave = it.getParcelable(ExtraConst.EXTRA_LOCATION_SAVE_ENTITY)
        }
    }
    override fun loadControlsAndResize(binding: DialogReminderBinding?) {
        binding?.apply {
            clTopNav.resizeHeight(getSizeWithScale(56.0))
            tvTopNavTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(14.0))
            tvOver.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(14.0))

            tvOver.setSingleClick {
                callApiCreateCamping()
            }
            imgBack.setSingleClick {
                dismissAllowingStateLoss()
            }
        }
    }

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): DialogReminderBinding {
        return DialogReminderBinding.inflate(inflater)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        dialog?.window?.setSoftInputMode(WindowManager.LayoutParams.FLAG_IGNORE_CHEEK_PRESSES)
        super.onActivityCreated(savedInstanceState)
    }

    override fun initView(savedInstanceState: Bundle?) {
        initViewModel()
        getBinding()?.mViewModel = viewModel
        getBinding()?.lifecycleOwner=this
        datePickerListener(setUpDatePicker(entityLocationSave))
        timePickerListener(setUpDatePicker(entityLocationSave))
        observerCreateCamping()
    }

private fun setUpDatePicker(entityLocationSave: ResponseListCamping.ListCampingData?): Calendar{
    try {
        getBinding()?.apply {
        val calendar = Calendar.getInstance()
        if (entityLocationSave?.plans_time.isNullOrEmpty()){
            calendar.timeInMillis = System.currentTimeMillis()
            return calendar
        }else{
            val sdf =  SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            val date = sdf.parse(entityLocationSave?.plans_time)
            val cal = sdf.calendar
            cal.time = date
            return cal
        }
        }

    } catch (e: Exception) {
        e.printStackTrace()
    }
    return Calendar.getInstance()
}
   
    @SuppressLint("SimpleDateFormat")
    private fun datePickerListener(calendar: Calendar){
        getBinding()?.apply {
            datePicker.init(
                calendar[Calendar.YEAR],
                calendar[Calendar.MONTH], calendar[Calendar.DAY_OF_MONTH]
            ) { _, year, month, dayOfMonth ->
                val resultDate = GregorianCalendar(year, month, dayOfMonth).time
                val resultDateString = SimpleDateFormat("EEE d MMM yyyy").format(resultDate)
                viewModel.updateDateTextView(resultDateString)
            }
        }

    }
    @SuppressLint("SimpleDateFormat")
    private fun timePickerListener(calendar: Calendar){
        getBinding()?.apply {
            timePicker.setIs24HourView(true)
            timePicker.hour = calendar.get(Calendar.HOUR_OF_DAY)
            timePicker.minute = calendar.get(Calendar.MINUTE)
            timePicker.setOnTimeChangedListener { _, hourOfDay, minute ->
                val resultTime = GregorianCalendar(0, 0, 0,hourOfDay,minute).time
                val resultTimeString = SimpleDateFormat("HH:mm ").format(resultTime)
                viewModel.updateTimeTextView(resultTimeString)
            }
        }
    }
    @SuppressLint("SetTextI18n")
    private fun initViewModel(){
        viewModel._switchCompat.value = entityLocationSave?.has_plans == 1
        val resultInitTimeString = SimpleDateFormat("HH:mm ").format(setUpDatePicker(entityLocationSave).time)
        val resultInitDateString = SimpleDateFormat("EEE d MMM yyyy").format(setUpDatePicker(entityLocationSave).time)
        viewModel.updateTimeTextView(resultInitTimeString)
        viewModel.updateDateTextView(resultInitDateString)
        entityLocationSave?.let {
            it.plans_note?.let { it1 -> viewModel.updateContentTextView(it1) }
            viewModel.initReminderId(it.id)
            viewModel.initTextViewContent(it.name?: "")
            viewModel.initSwitchCompat(it.has_plans == 1)
        }
        viewModel.initializeReminder()
    }

    private fun callApiCreateCamping(){
        try {
            val format =  SimpleDateFormat("EEE d MMM yyyy")
            val dateFormat = SimpleDateFormat("yyyy/MM/dd")
            val date = format.parse(viewModel.dateText.value)
            val dateTimeString = dateFormat.format(date)
            val timePlan: String = if (viewModel.switchCompat){
                "$dateTimeString ${viewModel.timeText.value}"
            }else{
                ""
            }
            val requestParam = mActivity!!.getRequestParamWithToken()
            entityLocationSave?.let {
                val note = getBinding()?.edtNote?.text.toString()
                requestParam[PARAM_API_LOCATION_ID] = it.id_loactions.toString()
                requestParam[PARAM_NOTE] = note
                requestParam[PARAM_TIME] = timePlan

            }
            viewModel.requestCreateCamping(requestParam)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    private fun observerCreateCamping() {
        try {
            viewModel.createCampingResult.observe(viewLifecycleOwner, {
                try {
                    shareViewModel.showOrHideLoading(it)
                    if (it.status == ApiResult.Status.SUCCESS) {
                        it?.data?.message?.let {
                            mActivity?.showDialogSuccess(it)
                        }
                        if (it.data?.response is ResponseCreateCamping.CreateCampingResponse) {
                            (it.data.response as ResponseCreateCamping.CreateCampingResponse).let {reponse ->
                                viewModel.apply {
                                    entityLocationSave?.let {
                                        it.id = reponse.id
                                        it.id_loactions = reponse.id_loactions
                                        it.name = reponse.name
                                        it.address = reponse.address
                                        it.description = reponse.description
                                        it.imageName = reponse.imageName
                                        it.lat = reponse.lat
                                        it.lng = reponse.lng
                                        it.plans_note = reponse.plans_note
                                        it.plans_status = reponse.plans_status
                                        it.plans_time = reponse.plans_time
                                        it.has_plans = reponse.has_plans

                                        locationSaveViewModel.setLocation(it)
                                        detailViewModel.location = it
                                        locationSaveViewModel.entityLocation.value = it

                                        val position =  locationSaveViewModel.listLocation.withIndex().filter { (_, value)->
                                            value.id==it.id
                                        }.map { (i, _)->i }.singleOrNull()

                                        position?.let { _->
                                            locationSaveViewModel.listLocation[position] = it
                                            locationSaveViewModel.setActionSate(LocationSaveViewModel.STATE.NOTIFY_DATA)
                                        }
                                    }
                                    if (switchCompat){
                                        saveReminder()
                                    }else{
                                        deleteReminder()
                                    }
                                    dismissAllowingStateLoss()
                                }
                            }
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}


