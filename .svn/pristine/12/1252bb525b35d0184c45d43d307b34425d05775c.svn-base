package brite.outdoor.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.TypedValue
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import brite.outdoor.R
import brite.outdoor.adapter.AdapterSearchLocation
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_IMAGE_PICK
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.api_entities.response.ResponseListUtensils
import brite.outdoor.data.api_entities.response.ResponseSearchUtensils
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.data.entities.ObjectSearch
import brite.outdoor.data.entities.UtensilsEntity
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.local.room.SaveListUtensilsLocal
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.DialogSelectedUtensilsBinding
import brite.outdoor.di.AppModule
import brite.outdoor.ui.fragments.select_place.FrmMapNew
import brite.outdoor.utils.*
import brite.outdoor.viewmodel.AuthViewModel
import brite.outdoor.viewmodel.SearchViewModel
import brite.outdoor.viewmodel.SelectPlaceViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.frm_select_places.*
import kotlinx.coroutines.*
import org.greenrobot.eventbus.EventBus

@AndroidEntryPoint
class FrmSelectedUtensilsNew : BaseDialogFragment<DialogSelectedUtensilsBinding>(),
    View.OnClickListener {
    private val selectPlaceViewModel by viewModels<SelectPlaceViewModel>()
    private val authViewModel by activityViewModels<AuthViewModel>()
    private var adapterSearch: AdapterSearchLocation? = null
    private val searchViewModel by viewModels<SearchViewModel>()
    private var saveListUtensils : SaveListUtensilsLocal?=null
    private val listUtensils = arrayListOf<ObjectSearch.ResultSearchEntity>()
    private var imagePicker: ImagePicker? = null
    var numberPage: Int = AppConst.DEFAULT_FIRST_PAGE
    private var key: String = ""
    private var lastestId: String = ""
    private var total: Int = 0

    companion object {
        const val FRM_POST_UTENSILS = 2
        const val TYPE_SEARCH_UTENSILS = 2
        fun getInstance(imagePicker: ImagePicker): DialogFragment {
            val dialog = FrmSelectedUtensilsNew()
            val bundle = Bundle()
            bundle.putParcelable(EXTRA_IMAGE_PICK, imagePicker)
            dialog.arguments = bundle
            return dialog
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.apply {
            imagePicker = this.getParcelable(EXTRA_IMAGE_PICK)
        }
    }

    override fun getTheme() = R.style.AddImageStyle

    override fun loadControlsAndResize(binding: DialogSelectedUtensilsBinding?) {
        binding?.apply {
            val sizeButtonSearch = getSizeWithScale(40.0)
            setupNavigation(this)
            edtSearchPlace.resizeHeight(getSizeWithScale(46.0))
            adapterSearch = AdapterSearchLocation(
                getSizeWithScale(100.0),
                getSizeWithScale(110.0),
                requireActivity(),
                false,
                recyclerView = getBinding()?.rcPlace!!,
                FrmMapNew.TYPE_SEARCH_LOCATION
            )
            rcPlace.apply {
                adapter = adapterSearch
            }
        }

    }

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): DialogSelectedUtensilsBinding {
        return DialogSelectedUtensilsBinding.inflate(inflater, container, false)
    }

    override fun initView(savedInstanceState: Bundle?) {
        val db = AppModule.provideDatabase(requireContext())
        saveListUtensils = SaveListUtensilsLocal(db.appDao())
        showDataUtensilsToListLocation()
        listenerSearchView()
        observerSearchUtensils()
        listenerItemClicked()
        eventLoadMore()
        AppUtils.hideKeyboard(getBinding()?.root)
        getBinding()?.rootView?.setSingleClick { // click rootView hide keyboard
            AppUtils.hideKeyboard(view)
        }
    }

    private fun showDataUtensilsToListLocation() {
        if (authViewModel.listUtensilLocal.size>0){
            try {
                val listUtensils = authViewModel.listUtensilLocal
                listUtensils.sortByDescending { i ->
                    i.cIndex
                } // sortby

                adapterSearch?.updateList(listUtensils)
            }catch (e:Exception){
                e.printStackTrace()
            }
        }else{
            saveListUtensils?.getUtensilEntity()?.observe(viewLifecycleOwner,{
                try {
                    GlobalScope.launch(Dispatchers.Main) {
                        val content = EncryptUtils.decrypt(it.listConTent?:"")
                        val listUtensil = convertJsonToListUtensil(content)
                        listUtensil.sortByDescending {
                                i->i.cIndex
                        }
                        adapterSearch?.updateList(listUtensil)

                    }

                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        }

    }

    private fun setupNavigation(frmSelectPlaceUtensilsBinding: DialogSelectedUtensilsBinding) {
        try {
            frmSelectPlaceUtensilsBinding.apply {
                clTopNav.resizeHeight(getSizeWithScale(56.0))
                btnTopNavButton.resizeLayout(getSizeWithScale(28.0), getSizeWithScale(28.0))
                tvTopNavTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(16.0))
                btnTopNavButton.setOnClickListener {
                    dismissAllowingStateLoss()
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun searchClick() {
        getBinding()?.apply {
            edtSearchPlace.setOnKeyListener { v, keyCode, event ->

                if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                    KeyboardUtil.hideKeyboard(mActivity)
                    val key = edtSearchPlace.text.toString()
                    numberPage = AppConst.DEFAULT_FIRST_PAGE // rest number Page
                    adapterSearch?.setLoaded() // cho phep load more
                    if (key.isNotEmpty()) {
                        callApiSearch(key)
                        this@FrmSelectedUtensilsNew.key = key
                    } else {
                        callApiSearch("")
                        this@FrmSelectedUtensilsNew.key = ""
                    }
                    getBinding()?.rcPlace?.scrollToPosition(0)
                    edtSearchPlace.isCursorVisible = false
                }

                false
            }
            edtSearchPlace.setOnTouchListener { _, _ ->
                edtSearchPlace.isCursorVisible = true
                false
            }
        }
    }

    private fun callApiSearch(key: String, lastestId: String = "") {
        startShimmerLayout()

        val requestParam = HashMap<String, String>()
        requestParam[ApiConst.PARAM_API] = ApiConst.API_KEY
        requestParam[ApiConst.PARAM_API_SEARCH] = key
        val token = PrefManager.getInstance(requireContext()).getString(PrefConst.PREF_TOKEN)
        token?.let {
            requestParam[ApiConst.PARAM_API_TOKEN] = token
        }
        requestParam[ApiConst.PARAM_API_LASTEST_ID] = lastestId
        searchViewModel.requestSearchUtensils(requestParam)
    }

    private fun observerSearchUtensils() {
        searchViewModel.apply {
            searchUtensilsResult.observe(viewLifecycleOwner, {
                try {
                    when (it.status) {
                        ApiResult.Status.SUCCESS -> {
                            stopShimmerLayout()
                            if (it.data?.response is ResponseSearchUtensils.SearchUtensilsResponse) {
                                try {
                                    (it.data.response as ResponseSearchUtensils.SearchUtensilsResponse).let { response ->
                                        listUtensils.clear()
                                        if (numberPage == AppConst.DEFAULT_FIRST_PAGE) { // update list first  search key
                                            response.getListData()?.let {
                                                adapterSearch?.updateList(it)
                                            }


                                        } else {  // load more
                                            response.getListData()?.let {
                                                adapterSearch?.insertList(it)
                                            }
                                        }
                                        total = response.total ?: 0
                                        adapterSearch?.setLoaded()
                                        if (total>0){
                                            response.getListData()?.size?.let { size ->
                                                lastestId =
                                                    response.getListData()?.get(size - 1)?.id.toString()
                                            }
                                            getBinding()?.tvNoData?.visibility=View.GONE
                                        }else{
                                            getBinding()?.tvNoData?.visibility=View.VISIBLE
                                        }

                                    }
                                } catch (e: Exception) {
                                    e.printStackTrace()
                                }
                            }

                        }
                        ApiResult.Status.ERROR_NETWORK -> {
                            shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status, null)
                            adapterSearch?.setLoaded()
                            stopShimmerLayout()
                        }
                        ApiResult.Status.ERROR, ApiResult.Status.ERROR_TOKEN -> {
                            shareViewModel.isNeedShowErr.value =
                                ApiNoticeEntity(it.status, it.message)
                            adapterSearch?.setLoaded()
                            stopShimmerLayout()
                        }
                        else -> {}
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        }
    }

    private fun listenerSearchView() {
        getBinding()?.edtSearchPlace?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                adapterSearch?.filter?.filter(s)
                adapterSearch?.setLoading() // block load more khi filter
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })
    }

    override fun onClick(v: View?) {
        if (!isClickAble()) return
        when (v?.id) {
            R.id.btnTopNavButton -> dismissAllowingStateLoss()
        }
    }

    private fun listenerItemClicked() {
        try {
            adapterSearch?.setOnItemListener(object : AdapterSearchLocation.OnItemListener {
                override fun onClickItem(item: Any) {
                    when (item) {
                        is ResponseSearchUtensils.SearchUtensilsData -> {
                            item.apply {
                                val utensils = UtensilsEntity(
                                    this.id,
                                    this.name, this.description, this.imageName, this.cIndex
                                )
                                sendDataToPushPostNew(utensils)
                            }

                        }
                        is ResponseListUtensils.UtensilsData -> {
                            item.apply {
                                val utensils = this.name?.let {
                                    UtensilsEntity(
                                        this.id,
                                        it, this.description, this.imageName, this.cIndex
                                    )
                                }
                                if (utensils != null) {
                                    sendDataToPushPostNew(utensils)
                                }
                            }

                        }
                    }
                }

                override fun onFilterResult(resultCount: Int, keySearch: String) {
                    if (resultCount == 0) {
                        GlobalScope.launch(Dispatchers.Main) {
                            callApiSearch(keySearch)
                        }
                        adapterSearch?.setLoaded()
                        this@FrmSelectedUtensilsNew.key = keySearch
                    }else{
                        getBinding()?.tvNoData?.visibility=View.GONE
                    }
                }

            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.getDefault().post(true)

    }

    private fun eventLoadMore() {
        adapterSearch?.setLoadMore(object : AdapterSearchLocation.ILoadMore {
            override fun onLoadMore() {
                try {
                    ++numberPage
                    if (adapterSearch?.listResult?.size ?: 0 < total) {
                        callApiSearch(lastestId = lastestId, key = key)
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }

        })
    }

    private fun sendDataToPushPostNew(utensilsEntity: UtensilsEntity) {
        EventBus.getDefault().post(utensilsEntity)
        dismissAllowingStateLoss()
    }

    fun startShimmerLayout() {
        getBinding()?.apply {
            shimmerFrameLayout.visibility = View.VISIBLE
            shimmerFrameLayout.startShimmer()
            rcPlace.visibility = View.GONE
        }

    }

    fun stopShimmerLayout() {
        getBinding()?.apply {
            shimmerFrameLayout.visibility = View.GONE
            shimmerFrameLayout.stopShimmer()
            rcPlace.visibility = View.VISIBLE
        }
    }


}