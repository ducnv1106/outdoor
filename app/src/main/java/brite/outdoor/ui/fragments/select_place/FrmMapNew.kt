package brite.outdoor.ui.fragments.select_place

import android.annotation.SuppressLint
import android.location.Address
import android.location.Geocoder
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.util.TypedValue
import android.view.*
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import brite.outdoor.R
import brite.outdoor.adapter.AdapterSearchLocation
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.api_entities.response.ResponseListCadastral
import brite.outdoor.data.api_entities.response.ResponseListCamping
import brite.outdoor.data.api_entities.response.ResponseListLocation
import brite.outdoor.data.api_entities.response.ResponseSearchLocations
import brite.outdoor.data.entities.LocationEntity
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.local.room.SaveListLocationLocal
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmMapNewBinding
import brite.outdoor.di.AppModule
import brite.outdoor.ui.fragments.BaseDialogFragment
import brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior
import brite.outdoor.utils.*
import brite.outdoor.viewmodel.AuthViewModel
import brite.outdoor.viewmodel.SearchViewModel
import brite.outdoor.viewmodel.SelectPlaceViewModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.frm_map.*
import kotlinx.android.synthetic.main.frm_map_new.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.greenrobot.eventbus.EventBus
import java.util.*
import kotlin.collections.ArrayList
import android.widget.Toast





@AndroidEntryPoint
class FrmMapNew(val onShowPushPost: (LocationEntity) -> Unit = { _: LocationEntity -> }) :
    BaseDialogFragment<FrmMapNewBinding>(), View.OnClickListener {
    private var midLatLng: LatLng? = null
    private var mapFragment: SupportMapFragment? = null
    private val authViewModel by activityViewModels<AuthViewModel>()
    private var saveListLocation : SaveListLocationLocal?=null
    private val selectPlaceViewModel by viewModels<SelectPlaceViewModel>()
    private val searchViewModel by viewModels<SearchViewModel>()
    private var initMapPosition: LatLng? = null
    private var mMap: GoogleMap? = null
    private var adapterSearch: AdapterSearchLocation? = null
    var numberPage: Int = AppConst.DEFAULT_FIRST_PAGE
    private var total: Int = 0
    private var lastestId: String = ""
    private var keySearch: String = ""
    private var behavior: AnchorBottomSheetBehavior<View>? = null
    private var isFirstSearchGoogleMap = false
    private val callback = OnMapReadyCallback { googleMap ->
        mMap = googleMap
        mMap?.let {
            initMapPosition = LatLng(21.038171768188477, 105.79374694824219)

            it.animateCamera(CameraUpdateFactory.newLatLngZoom(initMapPosition, 15f))
            it.setOnCameraMoveListener(OnCameraMoveListener {
                midLatLng = googleMap.cameraPosition.target
            })
            it.setOnCameraIdleListener {
                try {
                    midLatLng = googleMap.cameraPosition.target
                    val geocoder = Geocoder(requireContext(), Locale.getDefault())
                    val addresses: List<Address> =
                        geocoder.getFromLocation(midLatLng?.latitude!!, midLatLng?.longitude!!, 1)

                    if (isFirstSearchGoogleMap) {
                        val list = arrayListOf<ResponseSearchLocations.SearchLocationData>(
                            itemSearchGoogleMap(
                                addresses[0].getAddressLine(0),
                                midLatLng?.latitude.toString(),
                                midLatLng?.longitude.toString()
                            )
                        )
                        adapterSearch?.updateListSearchGoogleMap(list)
                    }
                    getBinding()?.tvNameLocation?.text = addresses[0].getAddressLine(0)

                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }
    private val listNameCommune= ArrayList<String>()
    private val listNameProvince = ArrayList<String>()
    private val listNameDistrict= ArrayList<String>()

    //    listFragment.add(FrmMap(onShowPushPost={location:LocationEntity->onShowPushPost(location)}))
    override fun loadControlsAndResize(binding: FrmMapNewBinding?) {
        getBinding()?.apply {
            val sizeButtonSearch = getSizeWithScale(40.0)
            clTopNav.resizeHeight(getSizeWithScale(56.0))
            imgMaker.resizeLayout(getSizeWithScale(24.0), getSizeWithScale(24.0))
            imgMap.resizeLayout(getSizeWithScale(24.0), getSizeWithScale(24.0))
            tvTopNavTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(16.0))
            tvOver.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(16.0))
            spnProvince.resizeLayout(getSizeWithScale(150.0), getSizeWithScale(25.0))
            spnProvince.dropDownWidth = getSizeWithScale(150.0)
            spnDistrict.resizeLayout(getSizeWithScale(150.0), getSizeWithScale(25.0))
            spnDistrict.dropDownWidth = getSizeWithScale(150.0)
            spnDistrict.isEnabled = false
            spnCommune.isEnabled = false
            spnCommune.resizeLayout(getSizeWithScale(150.0), getSizeWithScale(25.0))
            spnCommune.dropDownWidth = getSizeWithScale(150.0)
            btnTopNavButton.resizeLayout(getSizeWithScale(28.0), getSizeWithScale(28.0))
            btnTopNavButton.setOnClickListener(this@FrmMapNew)
            tvOver.setOnClickListener(this@FrmMapNew)
            adapterSearch = AdapterSearchLocation(
                getSizeWithScale(100.0),
                getSizeWithScale(110.0),
                requireActivity(),
                false,
                recyclerView = getBinding()?.rcLocation!!,
                TYPE_SEARCH_LOCATION
            )
            rcLocation.apply {
                adapter = adapterSearch
            }
            imgSearch.setSingleClick {
                val key = getBinding()?.edtLocation?.text.toString()
                searchViewModel.currentSearchType?.let {
                    if (it.first==keySearch) return@setSingleClick
                }
                numberPage=AppConst.DEFAULT_FIRST_PAGE // rest number Page
                adapterSearch?.setLoaded() // cho phep load more
                if (key.isNotEmpty()) {
                    //  handler call api location,utensils
                    callApiSearch(key)
                    this@FrmMapNew.keySearch=key
                }else {
                    callApiSearch("")
                    this@FrmMapNew.keySearch=""
                }
                searchViewModel.currentSearchType = Pair(keySearch,SearchViewModel.SearchType.LOCATE)
                getBinding()?.rcLocation?.scrollToPosition(0)
                getBinding()?.edtLocation?.isCursorVisible=false
                KeyboardUtil.hideKeyboard(mActivity)
            }

        }
    }

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmMapNewBinding {
        return FrmMapNewBinding.inflate(inflater, container, false)
    }

    override fun initView(savedInstanceState: Bundle?) {
        mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
        val db = AppModule.provideDatabase(requireContext())
        saveListLocation = SaveListLocationLocal(db.appDao())
        showDataLocationToListLocal()
        listenerSearchView()
        initAdapter()
        initBottomSheet()
        observerSearchLocation()
        eventLoadMore()
        searchClick()
        AppUtils.hideKeyboard(getBinding()?.root)
        getBinding()?.bottomSheet?.setSingleClick {
            AppUtils.hideKeyboard(it)
        }
        callApiListCadastral()
        observerListCadastral()
        observerListSpinnerProvince()
        observerListSpinnerDistrict()
        observerListSpinnerCommune()
    }

    override fun getTheme() = R.style.AddImageStyle

    private fun showDataLocationToListLocal() {
        if (authViewModel.listLocationLocal.size>0){
            try {
                val listLocation = authViewModel.listLocationLocal
                listLocation.sortByDescending { i ->
                    i.cIndex
                } // sort by
                adapterSearch?.updateList(listLocation)
            }catch (e:Exception){
                e.printStackTrace()
            }
        }else{
            saveListLocation?.getLocationEntity()?.observe(viewLifecycleOwner,{
                try {
                    GlobalScope.launch(Dispatchers.Main) {
                        val content = EncryptUtils.decrypt(it.listConTent?:"")
                        val listLocation = convertJsonToListLocation(content)
                        listLocation.sortByDescending { i->
                            i.cIndex
                        }
                        adapterSearch?.updateList(listLocation)
                    }
                }catch (e:Exception){
                    e.printStackTrace()
                }
            })
        }
    }

    private fun initAdapter() {
        adapterSearch?.setOnItemListener(object : AdapterSearchLocation.OnItemListener {
            override fun onClickItem(item: Any) {
                when(item){
                    is ResponseSearchLocations.SearchLocationData ->{
                        item.apply {
                            if (item.id == SEARCH_GOOGLE_MAP_NOT_FOUND){
                                getBinding()?.apply {
                                    AppUtils.hideKeyboard(this.root)
                                    tvOver.visibility = View.VISIBLE
                                }
                                getBinding()?.rootBottom?.visibility=View.GONE

                                mMap?.animateCamera(CameraUpdateFactory.newLatLngZoom(initMapPosition, 15f))
                            }else{
                                val location  = LocationEntity(lat?.toDouble()?:0.0, lng?.toDouble()?:0.0, id.toString(), name, item.id==SEARCH_GOOGLE_MAP)
                                sendDataToPushPostNew(location)
                            }
                        }

                    }
                    is ResponseListLocation.LocationData->{
                        item.apply {
                            val location  = LocationEntity(lat?.toDouble() ?:0.0, lng?.toDouble() ?:0.0, id.toString(), name?:"")
                            sendDataToPushPostNew(location)
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
                    this@FrmMapNew.keySearch = keySearch
                }else{
                    getBinding()?.tvNoData?.visibility = View.GONE
                }
            }

        })
    }

    private fun initBottomSheet() {
        getBinding()?.apply {
            behavior = AnchorBottomSheetBehavior.from(this.bottomSheet)
            behavior?.state = AnchorBottomSheetBehavior.STATE_EXPANDED
            behavior?.allowUserDragging = false

            behavior?.addBottomSheetCallback(object :
                AnchorBottomSheetBehavior.BottomSheetCallback() {
                override fun onStateChanged(bottomSheet: View, oldState: Int, newState: Int) {

                }

                override fun onSlide(bottomSheet: View, slideOffset: Float) {

                }

            })
        }
    }

    private fun searchPlace(keySeach: String) {
        try {
            val geocoder = Geocoder(requireContext(), Locale.getDefault())
            val addresses: List<Address> =
                geocoder.getFromLocationName(keySeach, 5)
            if (addresses.isNotEmpty()) {
                mMap?.animateCamera(
                    CameraUpdateFactory.newLatLngZoom(
                        LatLng(
                            addresses[0].latitude,
                            addresses[0].longitude
                        ), 17f
                    )
                )
                getBinding()?.tvNoData?.visibility = View.GONE
            } else {
                val list = arrayListOf<ResponseSearchLocations.SearchLocationData>(itemSearchGoogleMapNotFound())
                adapterSearch?.updateListSearchGoogleMap(list)
                getBinding()?.tvNoData?.visibility = View.VISIBLE
            }


        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onClick(v: View?) {
        if (!isClickAble()) return
        when (v?.id) {
            R.id.btnSearch -> {
//                if (getBinding()?.edtSearchPlace?.text.toString() != "") searchPlace()
            }
            R.id.btnTopNavButton -> dismissAllowingStateLoss()
            R.id.btnAddPlace -> {
                selectPlaceViewModel.locationSelected.value = LocationEntity(
                    midLatLng?.latitude ?: 0.0,
                    midLatLng?.longitude ?: 0.0,
                    "",
                    edtNameLocation.text.toString()
                )
                val location = LocationEntity(
                    midLatLng?.latitude ?: 0.0,
                    midLatLng?.longitude ?: 0.0,
                    "",
                    edtNameLocation.text.toString()
                )
                if (edtNameLocation.text.isNotEmpty()) onShowPushPost(location)
            }
            R.id.tvOver ->{
                val location = LocationEntity(
                    midLatLng?.latitude ?: 0.0,
                    midLatLng?.longitude ?: 0.0,
                    SEARCH_GOOGLE_MAP_NOT_FOUND.toString(),
                    tvNameLocation.text.toString(),true
                )
                sendDataToPushPostNew(location)
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
        searchViewModel.requestSearchLocations(requestParam)
    }

    private fun observerSearchLocation() {
        searchViewModel.apply {
            searchLocationsResult.observe(viewLifecycleOwner, {
                try {
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            if (it.data?.response !is Boolean) {
                                stopShimmerLayout()
                                if (it.data?.response is ResponseSearchLocations.SearchLocationsResponse) {
                                    val response =
                                        it.data.response as ResponseSearchLocations.SearchLocationsResponse?
                                    if (response != null) {
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
                                        if (total > 0) {
                                            response.getListData()?.size?.let { size ->
                                                lastestId =
                                                    response.getListData()?.get(size - 1)?.id.toString()
                                            }
                                            getBinding()?.tvNoData?.visibility = View.GONE
                                        } else {
                                            searchPlace(keySearch)
                                            isFirstSearchGoogleMap = true
                                        }

                                    }


                                }


                            }
                        }
                        ApiResult.Status.ERROR_NETWORK ->{
                            shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status,null)
                            adapterSearch?.setLoaded()
                            stopShimmerLayout()
                        }
                        ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN->{
                            shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status, it.message)
                            adapterSearch?.setLoaded()
                            stopShimmerLayout()
                        }

                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        }
    }

    private fun listenerSearchView() {
        getBinding()?.edtLocation?.addTextChangedListener(object : TextWatcher {
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

    @SuppressLint("ClickableViewAccessibility")
    private fun searchClick() {
        getBinding()?.edtLocation?.setOnKeyListener { v, keyCode, event ->

            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                val key = getBinding()?.edtLocation?.text.toString()
                searchViewModel.currentSearchType?.let {
                    if (it.first==keySearch) return@setOnKeyListener false
                }
                numberPage=AppConst.DEFAULT_FIRST_PAGE // rest number Page
                adapterSearch?.setLoaded() // cho phep load more
                if (key.isNotEmpty()) {
                    //  handler call api location,utensils
                    callApiSearch(key)
                    this.keySearch=key
                }else {
                    callApiSearch("")
                    this.keySearch=""
                }
                searchViewModel.currentSearchType = Pair(keySearch,SearchViewModel.SearchType.LOCATE)
                getBinding()?.rcLocation?.scrollToPosition(0)
                getBinding()?.edtLocation?.isCursorVisible=false
                KeyboardUtil.hideKeyboard(mActivity)
            }

            false
        }
        getBinding()?.edtLocation?.setOnTouchListener { _, _ ->
            getBinding()?.edtLocation?.isCursorVisible = true
            false
        }
    }

    private fun eventLoadMore() {
        adapterSearch?.setLoadMore(object : AdapterSearchLocation.ILoadMore {
            override fun onLoadMore() {
                try {
                    ++numberPage
                    if (adapterSearch?.listResult?.size ?:0 < total ) {
                        callApiSearch(lastestId=lastestId,key = keySearch)
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }

        })
    }

    private fun itemSearchGoogleMap(
        name: String,
        lat: String?,
        lng: String?,
    ): ResponseSearchLocations.SearchLocationData = ResponseSearchLocations.SearchLocationData(
        id = SEARCH_GOOGLE_MAP,
        name = name,
        description = null,
        imageName = null,
        cIndex = null,
        lat = lat,
        lng = lng,
        key_search = null,
        modified_time = null,
        isDataGoogleMap = true
    )
    private fun itemSearchGoogleMapNotFound(): ResponseSearchLocations.SearchLocationData = ResponseSearchLocations.SearchLocationData(
        id=SEARCH_GOOGLE_MAP_NOT_FOUND, // Not found search gg map
        name = "Thêm vị trí",
        description = null,
        imageName = null,
        cIndex = null,
        lat = null,
        lng = null,
        key_search=null,
        modified_time = null,
        isDataGoogleMap = true
    )
    companion object{
        const val SEARCH_GOOGLE_MAP=-1
        const val SEARCH_GOOGLE_MAP_NOT_FOUND=-2
        const val TYPE_SEARCH_LOCATION=1
    }
    private fun sendDataToPushPostNew(locationEntity: LocationEntity){
        EventBus.getDefault().post(locationEntity)
        dismissAllowingStateLoss()
    }

    fun startShimmerLayout(){
        getBinding()?.apply {
            shimmerFrameLayout.visibility = View.VISIBLE
            shimmerFrameLayout.startShimmer()
            rcLocation.visibility = View.GONE
        }

    }
    fun stopShimmerLayout(){
        getBinding()?.apply {
            shimmerFrameLayout.visibility = View.GONE
            shimmerFrameLayout.stopShimmer()
            rcLocation.visibility = View.VISIBLE
        }
    }

    private fun callApiListCadastral() {
        val requestParam = mActivity!!.getRequestParamWithToken()
        searchViewModel.getListCadastral(requestParam)
    }
    private fun observerListCadastral() {
        try {
            searchViewModel.listCadastralResult.observe(viewLifecycleOwner, { it ->
                shareViewModel.showOrHideLoading(it)
                if (it.status == ApiResult.Status.SUCCESS) {
                    if (it.data?.response is ResponseListCadastral.ListCadastralResponse) {
                        (it.data.response as ResponseListCadastral.ListCadastralResponse).let {
                            searchViewModel.listCadastralProvince.value = it.getListData()
                        }
                    }
                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    
    private fun observerListSpinnerProvince(){
       searchViewModel.listCadastralProvince.observe(viewLifecycleOwner,  {
           listNameProvince.add("Tỉnh/Thành Phố ")
           it.forEach { entity ->
               entity.short_name?.let { it1 -> listNameProvince.add(it1) }
           }
           getBinding()?.apply {
               val arrayAdapterProvince: ArrayAdapter<String> = ArrayAdapter(requireContext(),R.layout.item_spinner,listNameProvince)
               arrayAdapterProvince.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
               spnProvince.adapter = arrayAdapterProvince
               spnProvince.onItemSelectedListener = object : OnItemSelectedListener {
                   override fun onItemSelected(parentView: AdapterView<*>?, selectedItemView: View?, position: Int, id: Long, ) {
                       if (position >0){
                           spnDistrict.isEnabled = true
                           val keySeach = it[position-1].name
                           if (keySeach != null) {
                               searchPlace(keySeach)
                           }
                           listNameDistrict.clear()
                           searchViewModel.listCadastralDistrict.value = it[position-1].getListDataDistrict()
                       }else{
                           spnDistrict.isEnabled = false
                       }
                   }

                   override fun onNothingSelected(parentView: AdapterView<*>?) {
                       Toast.makeText(requireContext(), "onNothingSelected", Toast.LENGTH_SHORT).show()
                   }
               }
           }
       })
    }

    private fun observerListSpinnerDistrict(){
        searchViewModel.listCadastralDistrict.observe(viewLifecycleOwner,  {
            listNameDistrict.add("Quận/Huyện ")
            it.forEach { entity ->
                entity.short_name?.let { it1 -> listNameDistrict.add(it1) }
            }
            getBinding()?.apply {
                val arrayAdapterProvince: ArrayAdapter<String> = ArrayAdapter(requireContext(),R.layout.item_spinner,listNameDistrict)
                arrayAdapterProvince.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spnDistrict.adapter = arrayAdapterProvince
                spnDistrict.onItemSelectedListener = object : OnItemSelectedListener {
                    override fun onItemSelected(parentView: AdapterView<*>?, selectedItemView: View?, position: Int, id: Long, ) {
                        if (position >0){
                            spnCommune.isEnabled = true
                            val keySeach = it[position-1].name
                            if (keySeach != null) {
                                searchPlace(keySeach)
                            }
                            listNameCommune.clear()
                            searchViewModel.listCadastralCommune.value = it[position -1].getListDataCommune()
                        }else{
                            searchViewModel.listCadastralCommune.value = arrayListOf()
                            spnCommune.isEnabled = false
                        }
                    }

                    override fun onNothingSelected(parentView: AdapterView<*>?) {
                        Toast.makeText(requireContext(), "onNothingSelected", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        })
    }

    private fun observerListSpinnerCommune(){
        searchViewModel.listCadastralCommune.observe(viewLifecycleOwner,  {
            listNameCommune.add("Xã/Phường")
            it.forEach { entity ->
                entity.short_name?.let { it1 -> listNameCommune.add(it1) }
            }
            getBinding()?.apply {
                val arrayAdapterProvince: ArrayAdapter<String> = ArrayAdapter(requireContext(),R.layout.item_spinner,listNameCommune)
                arrayAdapterProvince.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spnCommune.adapter = arrayAdapterProvince
                spnCommune.onItemSelectedListener = object : OnItemSelectedListener {
                    override fun onItemSelected(parentView: AdapterView<*>?, selectedItemView: View?, position: Int, id: Long, ) {
                        if (position >0){
                            val keySeach = it[position-1].name
                            if (keySeach != null) {
                                searchPlace(keySeach)
                            }
                        }else{
                            arrayAdapterProvince.notifyDataSetChanged()
                        }
                    }

                    override fun onNothingSelected(parentView: AdapterView<*>?) {
                        Toast.makeText(requireContext(), "onNothingSelected", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        })
    }

}