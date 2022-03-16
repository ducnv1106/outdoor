package brite.outdoor.ui.dialog

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import brite.outdoor.R
import brite.outdoor.adapter.AdapterContentBlock
import brite.outdoor.adapter.ImagePickerAdapter
import brite.outdoor.adapter.utils.MarginDecoration
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.ExtraConst
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.data.entities.LocationEntity
import brite.outdoor.data.entities.UtensilsEntity
import brite.outdoor.databinding.FrmEditBlockPostBinding
import brite.outdoor.databinding.FrmPickImageBinding
import brite.outdoor.databinding.FrmPickImageNewBinding
import brite.outdoor.entity.Media
import brite.outdoor.ui.activities.CameraActivity
import brite.outdoor.ui.fragments.FrmPushPostsNew
import brite.outdoor.ui.widgets.LayoutImagePickedPreview
import brite.outdoor.utils.*
import brite.outdoor.viewmodel.PushPostViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import java.io.File
import java.util.concurrent.TimeUnit

@AndroidEntryPoint
class FrmEditBlockPost : DialogFragment() {

    companion object {
        private const val TAG = "TestDialogFragment"
    }
    private var binding: FrmEditBlockPostBinding? = null
    private var adapter: AdapterContentBlock? = null
    private var lisImageDelete: ArrayList<String?>? = ArrayList()
    private var listSelect: ArrayList<ImagePicker>? = ArrayList()
    private val pickImageViewModel by viewModels<PushPostViewModel>({ requireParentFragment() })
    val listImagePicker: ArrayList<ImagePicker> = ArrayList()
    private var listImagePickerOldEdit: ArrayList<ImagePicker> = ArrayList()

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

    private var listDataDialogFrmImagePager = arrayListOf<ImagePicker>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.FullScreenDialogStyle)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FrmEditBlockPostBinding.inflate(inflater, container, false)
        loadControlsAndResize(binding)
        initView()
        return binding!!.root
    }

    override fun getTheme() = R.style.AddImageStyle

    fun loadControlsAndResize(binding: FrmEditBlockPostBinding?) {
        binding?.apply {
            setupTopNavigation(this)
            setupOnClickListener(this)
        }
    }

    fun initView() {

        listImagePickerOldEdit.addAll(
            pickImageViewModel.contentSelected.value?.listImg?.value ?: arrayListOf<ImagePicker>()
        )

        pickImageViewModel.contentSelected.value?.listImg?.let { list ->
            setupListView(list)
            observeListImageSelected(list)
        }
        pickImageViewModel.contentSelected.value?.content?.let { content->
            binding?.edtContent?.setText(content)
        }
    }

    private fun observeListImageSelected(list: MutableLiveData<ArrayList<ImagePicker>>) {
        list.observe(viewLifecycleOwner, {
            try {
                it?.let {
                    if (!listSelect.isNullOrEmpty()) listSelect?.clear()
                    listSelect?.addAll(it)
                    listDataDialogFrmImagePager.clear()
                    listDataDialogFrmImagePager.addAll(it)
                    binding?.tvOver?.isSelected = it.size > 0
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        })
    }

    private fun setupListView(list: MutableLiveData<ArrayList<ImagePicker>>) {
        activity?.let {
            adapter = AdapterContentBlock(
               requireContext(),
                list
            ){ position->
                try {
                    if (listSelect?.get(position)?.isChecked == false){
                        lisImageDelete?.let {
                            if (!it.contains(pickImageViewModel.listNameImage?.get(position))){
                                if (!pickImageViewModel.listImgDelete.value.isNullOrEmpty()){
                                    for (j in 0 until  pickImageViewModel.listImgDelete.value?.size!!){
                                        if(pickImageViewModel.listNameImage?.contains( pickImageViewModel.listImgDelete.value?.get(j)) == true){
                                            pickImageViewModel.listNameImage?.remove(pickImageViewModel.listImgDelete.value?.get(j))
                                        }
                                    }
                                }
                                it.add(pickImageViewModel.listNameImage?.get(position))
                                pickImageViewModel.listNameImage?.removeAt(position)
                                pickImageViewModel.listDelete.addAll(it)
                                pickImageViewModel.listImgDelete.value = pickImageViewModel.listDelete
                            }
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            binding?.rcContentImage?.apply {
                adapter = this@FrmEditBlockPost.adapter
//                setHasFixedSize(true)
            }

        }
        adapter?.submitList(list.value)

    }

    private fun setupOnClickListener(frmPickImageBinding: FrmEditBlockPostBinding) {
        frmPickImageBinding.apply {

            tvOver.setSingleClick {
                pickImageViewModel.actionState.value = PushPostViewModel.STATE.NOTIFY_DATA
                pickImageViewModel.contentSelected.value?.content = edtContent.text.toString()
                dismiss()
            }
            btnBack.setSingleClick {
                pickImageViewModel.contentSelected.value?.listImg?.value = listImagePickerOldEdit
                pickImageViewModel.actionState.value = PushPostViewModel.STATE.NOTIFY_DATA
                dismiss()
            }
            imgBlock.setSingleClick {
                try {
                    if (parentFragment is FrmPushPostsNew){
                        (parentFragment as FrmPushPostsNew).apply {
                            val dlgAddImage = DialogFragmentAddImagesNew()
                            dlgAddImage.show(this.childFragmentManager, "DialogFragmentAddImagesNew")
                        }
                    }

                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }

    private fun setupTopNavigation(frmPickImageBinding: FrmEditBlockPostBinding) {
        frmPickImageBinding.apply {
            clTopNav.resizeHeight(getSizeWithScale(56.0))
            tvTopNavTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(16.0))
            tvOver.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(16.0))
            btnBack.resizeLayout(getSizeWithScale(28.0), getSizeWithScale(28.0))
            imgBlock.resizeLayout(getSizeWithScale(24.0), getSizeWithScale(24.0))
        }

    }


    //Start Resize
    private var scaleValue = 0F
    private fun getScaleValue(): Float {
        if (scaleValue == 0F) {
            scaleValue = resources.displayMetrics.widthPixels * 1f / AppConst.SCREEN_WIDTH_DESIGN
        }
        return scaleValue
    }

    fun getSizeWithScale(sizeDesign: Double): Int {
        return (sizeDesign * getScaleValue()).toInt()
    }

    fun getSizeWithScaleFloat(sizeDesign: Double): Float {
        return (sizeDesign * getScaleValue()).toFloat()
    }

    fun getRealSize(sizeDesign: ViewSize): ViewSize {
        return ViewSize(sizeDesign.width * getScaleValue(), sizeDesign.height * getScaleValue())
    }
    //End Resize
    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this);
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this);
    }
    @Subscribe
    fun onEvent(event: Any) {
       if (event is String){
           event.apply { 
               if (event=="notifi_data"){
                   adapter?.submitList(null)
               }
           }
       }
    }

}