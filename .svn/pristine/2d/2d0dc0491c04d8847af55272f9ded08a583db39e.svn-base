package brite.outdoor.ui.fragments.search

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.util.TypedValue
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.appcompat.widget.AppCompatRadioButton
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import brite.outdoor.R
import brite.outdoor.adapter.AdapterSearchWith
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.entities.ObjectSearch
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.local.room.SaveListLocationLocal
import brite.outdoor.data.local.room.SaveListUtensilsLocal
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmSearchVer2Binding
import brite.outdoor.di.AppModule
import brite.outdoor.ui.fragments.BaseFragment
import brite.outdoor.ui.fragments.FrmPushPostsNew
import brite.outdoor.utils.*
import brite.outdoor.viewmodel.AuthViewModel
import brite.outdoor.viewmodel.FollowViewModel
import brite.outdoor.viewmodel.SearchViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import java.lang.reflect.Type


@AndroidEntryPoint
class FrmSearchVer2: BaseFragment<FrmSearchVer2Binding>(), View.OnClickListener {
    private var adapterSearch: AdapterSearchWith? = null
    private val authViewModel by activityViewModels<AuthViewModel>()
    private val searchViewModel by viewModels<SearchViewModel>()
    private var saveListUtensils : SaveListUtensilsLocal?=null
    private var saveListLocation : SaveListLocationLocal?=null
    private val followViewModel by viewModels<FollowViewModel>()
    private val listSearch= arrayListOf<ObjectSearch.ResultSearchEntity>()
    private var status = SearchViewModel.SearchType.LOCATE
    private var numberPage: Int = AppConst.DEFAULT_FIRST_PAGE
    private var key : String = ""
    private var lastestId : String = ""
    private var total :Int = 0
    override fun loadControlsAndResize(binding: FrmSearchVer2Binding?) {
        binding?.apply {
            icFilter.resizeLayout(getSizeWithScale(24.0), getSizeWithScale(24.0))
            icFilter.setOnClickListener(this@FrmSearchVer2)
            clSearchUser.setOnClickListener(this@FrmSearchVer2)
            clSearchLocation.setOnClickListener(this@FrmSearchVer2)
            clSearchTool.setOnClickListener(this@FrmSearchVer2)
            adapterSearch = AdapterSearchWith(getSizeWithScale(50.0), getSizeWithScale(110.0),requireActivity(),recyclerView = getBinding()?.rvSearchWith!!)
            getBinding()?.rvSearchWith?.apply {
                adapter = adapterSearch
            }
            naviBottomHome.btnHome.resizeLayout(getSizeWithScale(34.0),getSizeWithScale(34.0))
            naviBottomHome.btnMyPage.resizeLayout(getSizeWithScale(34.0),getSizeWithScale(34.0))
            naviBottomHome.btnNotification.resizeLayout(getSizeWithScale(34.0),getSizeWithScale(34.0))
            naviBottomHome.ivBackGround.resizeLayout(getSizeWithScale(375.0),getSizeWithScale(89.0))
//            btnNotification1.resizeLayout(getSizeWithScale(61.0),getSizeWithScale(87.0))

            naviBottomHome.btnSearch.resizeLayout(getSizeWithScale(34.0),getSizeWithScale(34.0))
//            naviBottHome.imgBgIcAddHome.resizeLayout(getSizeWithScale(71.0),getSizeWithScale(100.0))
            naviBottomHome.btnAddHome.resizeLayout(getSizeWithScale(60.0),getSizeWithScale(60.0))
            naviBottomHome.vFakeButton.resizeLayout(getSizeWithScale(72.0),getSizeWithScale(72.0))
            naviBottomHome.btnSearch.isChecked=true
            naviBottomHome.layoutBottom.resizeHeight(getSizeWithScale(60.0))

            naviBottomHome.btnNotificationUnread.resizeLayout(getSizeWithScale(18.0),getSizeWithScale(18.0))
            naviBottomHome.btnNotificationUnread.setTextSizePX(MyApplication.getInstance().getSizeWithScaleFloat(10.0))
            imgQuestion.resizeLayout(getSizeWithScale(56.0), getSizeWithScale(112.0))

            tvTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(16.0))

            naviBottomHome.apply {
                btnAddHome.setOnClickListener {
                    showPopupWindow()
                }
                btnAddPlace.setSingleClickSwitchScreen{
                    mActivity?.let {
                        FrmPushPostsNew.getInstance(typeFragment = AppConst.FRM_POST_LOCATION).show(it.supportFragmentManager,"FrmPushPostNew")
                        hideBtnAddHomeBackToScreenHome()
                    }
                }
                btnAddUtensils.setSingleClickSwitchScreen {
                    mActivity?.let {
                        FrmPushPostsNew.getInstance(typeFragment = AppConst.FRM_POST_UTENSILS).show(it.supportFragmentManager,"FrmPushPostNew")
                        hideBtnAddHomeBackToScreenHome()
                    }

                }
            }
            imgQuestion.setSingleClick {
                mActivity?.showQuestion()
            }
            imgSearch.setSingleClick {
                val key = getBinding()?.edtSearch?.text.toString()
                searchViewModel.currentSearchType?.let {
                    if (it.first == key && status == it.second) return@setSingleClick
                }
                numberPage=AppConst.DEFAULT_FIRST_PAGE // rest number Page
                adapterSearch?.setLoaded() // cho phep load more
                if (key.isNotEmpty()) {
                    //  handler call api location,utensils
                    callApiSearch(key)
                    this@FrmSearchVer2.key=key
                }else {
                    callApiSearch("")
                    this@FrmSearchVer2.key=""
                }
                when(status){
                    SearchViewModel.SearchType.LOCATE -> searchViewModel.currentSearchType = Pair(key,SearchViewModel.SearchType.LOCATE)
                    SearchViewModel.SearchType.TOOL -> searchViewModel.currentSearchType = Pair(key,SearchViewModel.SearchType.TOOL)
                    SearchViewModel.SearchType.USER -> searchViewModel.currentSearchType = Pair(key,SearchViewModel.SearchType.USER)
                    else->{}
                }
                getBinding()?.rvSearchWith?.scrollToPosition(0)
                getBinding()?.edtSearch?.isCursorVisible=false
                KeyboardUtil.hideKeyboard(mActivity)
            }
        }
    }

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmSearchVer2Binding {
        return FrmSearchVer2Binding.inflate(inflater, container, false)
    }

    override fun initView(savedInstanceState: Bundle?) {
        getBinding()?.mSearchViewModel = searchViewModel
        getBinding()?.lifecycleOwner = this
        observerSearchLocation()
        observerSearchUtensils()
        observerSearchUser()
        observerFollowUser()
        val db = AppModule.provideDatabase(requireContext())
        saveListLocation = SaveListLocationLocal(db.appDao())
        saveListUtensils = SaveListUtensilsLocal(db.appDao())
        searchClick()
        showDataLocationToList()
        listenerSearchView()
        onListenerNaviBottom()
        followAndUnFollowUser()
        observerNotifyUnread()
        observerChangeLanguage()
        eventLoadMore()
        listenerItemClicked()
        searchViewModel.resultSearchType.observe(viewLifecycleOwner,{
            when(it){
                SearchViewModel.SearchType.CONSUMED->{
                    getBinding()?.rvSearchWith?.visibility=View.VISIBLE
                }
                else ->{
                    getBinding()?.rvSearchWith?.visibility=View.GONE
                }
            }
        })
    }

    override fun getCurrentFragment(): Int {
        return AppConst.FRM_SEARCH
    }

    override fun finish() {
        mActivity?.closeMainFuncScreen(this)
    }
    override fun isBackPreviousEnable(): Boolean {
        return true
    }

    override fun backToPrevious() {
        finish()
    }

    override fun onClick(p0: View?) {
        if (!isClickAble()) return
        when(p0?.id){
            R.id.icFilter-> {
                showFilter()
            }
            R.id.clSearchLocation-> {
                setClSearchFollow(SearchViewModel.SearchType.LOCATE)
                showDataLocationToList()
                adapterSearch?.setLoading() // block load more
                searchViewModel.setSearchType(SearchViewModel.SearchType.CONSUMED)
            }
            R.id.clSearchTool-> {
                setClSearchFollow(SearchViewModel.SearchType.TOOL)
                showDataUtensilsToList()
                adapterSearch?.setLoading() // block load more
                searchViewModel.setSearchType(SearchViewModel.SearchType.CONSUMED)
            }
            R.id.clSearchUser-> {
                searchViewModel.setSearchType(SearchViewModel.SearchType.CONSUMED)
                setClSearchFollow(SearchViewModel.SearchType.USER)
                showDataUserList()
            }
        }
    }
    private fun showFilter(){
        getBinding()?.apply {
            icFilter.isSelected = !icFilter.isSelected
            clSearchLocation.apply {
                if (isVisible){
                    startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.scale_anim_out_top))
                    visibility=View.GONE
                }else{
                    visibility=View.VISIBLE
                    startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.scale_anim_to_bot))
                }
            }
            clSearchUser.apply {
                if (isVisible){
                    startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.scale_anim_out_top))
                    visibility=View.GONE
                }else{
                    visibility=View.VISIBLE
                    startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.scale_anim_to_bot))
                }
            }
            clSearchTool.apply {
                if (isVisible){
                    startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.scale_anim_out_top))
                    visibility=View.GONE
                }else{
                    visibility=View.VISIBLE
                    startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.scale_anim_to_bot))
                }
            }

        }
    }
    private fun callApiSearch(key:String,lastestId : String = ""){
        val requestParam = HashMap<String,String>()
        requestParam[ApiConst.PARAM_API]= ApiConst.API_KEY
        requestParam[ApiConst.PARAM_API_SEARCH]=key
        val token= PrefManager.getInstance(requireContext()).getString(PrefConst.PREF_TOKEN)
        token?.let {
            requestParam[ApiConst.PARAM_API_TOKEN]=token
        }
        requestParam[ApiConst.PARAM_API_LASTEST_ID] = lastestId

        when(status){
            SearchViewModel.SearchType.LOCATE->{
                searchViewModel.requestSearchLocations(requestParam)
                searchViewModel.setSearchType(SearchViewModel.SearchType.LOCATE)
            }
            SearchViewModel.SearchType.TOOL->{
                searchViewModel.requestSearchUtensils(requestParam)
                searchViewModel.setSearchType(SearchViewModel.SearchType.TOOL)
            }
            SearchViewModel.SearchType.USER->{
                searchViewModel.requestSearchUser(requestParam)
                searchViewModel.setSearchType(SearchViewModel.SearchType.USER)
            }
            else->{}
        }
        getBinding()?.tvNoData?.visibility=View.GONE
    }
    private fun showDataLocationToList(){
        if (authViewModel.listLocationLocal.size>0){
            val listLocation = authViewModel.listLocationLocal
                val list= arrayListOf<ObjectSearch.ResultSearchEntity>()
                val tmpList = listLocation.toTypedArray()
                tmpList.sortByDescending { i->
                    i.cIndex
                }
                tmpList.forEach { i->
                    list.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.LOCATE,i))
                }
                adapterSearch?.updateList(list)
                adapterSearch?.initData(list)
        }else{
            saveListLocation?.getLocationEntity()?.observe(viewLifecycleOwner,{
                try {
                    GlobalScope.launch(Dispatchers.Main) {
                        val content = EncryptUtils.decrypt(it.listConTent?:"")
                        val listLocation = convertJsonToListLocation(content)

                        val list= arrayListOf<ObjectSearch.ResultSearchEntity>()
                        val tmpList = listLocation.toTypedArray()
                        tmpList.sortByDescending { i->
                            i.cIndex
                        }
                        tmpList.forEach { i->
                            list.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.LOCATE,i))
                        }
                        adapterSearch?.updateList(list)
                        adapterSearch?.initData(list)
                    }
                }catch (e:Exception){
                    e.printStackTrace()
                }
            })
        }

    }
    private fun setClSearchFollow(statusSearch: SearchViewModel.SearchType){
        getBinding()?.apply {
            showFilter()
            getBinding()?.edtSearch?.apply {
                text.clear()
                clearFocus()
            }
            when(statusSearch){
                SearchViewModel.SearchType.LOCATE -> {
                    status = SearchViewModel.SearchType.LOCATE
                    icClSearchFollow.setImageResource(R.drawable.ic_map_pin)
                    clSearchFollow.setBackgroundResource(R.drawable.bg_cl_search_location)
                    tvSearchFollow.setText(R.string.lblSearchByLocation)
                }
                SearchViewModel.SearchType.TOOL -> {
                    status = SearchViewModel.SearchType.TOOL
                    icClSearchFollow.setImageResource(R.drawable.ic_vector)
                    clSearchFollow.setBackgroundResource(R.drawable.bg_cl_search_tool)
                    tvSearchFollow.setText(R.string.lblSearchByTool)
                }
                SearchViewModel.SearchType.USER -> {
                    status = SearchViewModel.SearchType.USER
                    icClSearchFollow.setImageResource(R.drawable.ic_smile)
                    clSearchFollow.setBackgroundResource(R.drawable.bg_cl_search_user)
                    numberPage = AppConst.DEFAULT_FIRST_PAGE
                    callApiSearch("")
                    tvSearchFollow.setText(R.string.lblSearchByPerson)
                }
            }
        }
    }
    private fun showDataUtensilsToList(){
        if (authViewModel.listUtensilLocal.size>0){
            try {
                val listUtensil = authViewModel.listUtensilLocal
                val list= arrayListOf<ObjectSearch.ResultSearchEntity>()
                val tmpList = listUtensil.toTypedArray()
                tmpList.sortByDescending {
                        i->i.cIndex
                }
                tmpList.forEach { i->
                    list.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.TOOL,i))
                }
                adapterSearch?.updateList(list)
                adapterSearch?.initData(list)
            }catch (e:Exception){
                e.printStackTrace()
            }
        }else{
            saveListUtensils?.getUtensilEntity()?.observe(viewLifecycleOwner,{
                try {
                    GlobalScope.launch(Dispatchers.Main) {
                        val content = EncryptUtils.decrypt(it.listConTent?:"")
                        val listUtensil = convertJsonToListUtensil(content)
                        val list= arrayListOf<ObjectSearch.ResultSearchEntity>()
                        val tmpList = listUtensil.toTypedArray()
                        tmpList.sortByDescending {
                                i->i.cIndex
                        }
                        tmpList.forEach { i->
                            list.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.TOOL,i))
                        }
                        adapterSearch?.updateList(list)
                        adapterSearch?.initData(list)
                    }

                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        }

    }
    private fun listenerSearchView(){
        getBinding()?.edtSearch?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                adapterSearch?.filter?.filter(s)
                adapterSearch?.setLoading() // block load more khi filter
                Handler(Looper.getMainLooper()).postDelayed({
                   if (adapterSearch?.itemCount == 0){
                       callApiSearch(s.toString())
                       this@FrmSearchVer2.key=s.toString()
                   }
                }, 300)
                EventBus.getDefault().post("frgSearchUtensils")
            }
            override fun afterTextChanged(s: Editable?) {
            }

        })
    }

    private fun showDataUserList(){
        try {
            adapterSearch?.updateList(listSearch)
            adapterSearch?.initData(listSearch)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    @SuppressLint("ClickableViewAccessibility")
    private fun searchClick() {
        getBinding()?.edtSearch?.setOnKeyListener { v, keyCode, event ->

            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                val key = getBinding()?.edtSearch?.text.toString()
                searchViewModel.currentSearchType?.let {
                    if (it.first == key && status == it.second)  return@setOnKeyListener false
                }
                numberPage=AppConst.DEFAULT_FIRST_PAGE // rest number Page
                adapterSearch?.setLoaded() // cho phep load more
                if (key.isNotEmpty()) {
                    //  handler call api location,utensils
                    callApiSearch(key)
                    this.key=key
                }else {
                    callApiSearch("")
                    this.key=""
                }

                when(status){
                    SearchViewModel.SearchType.LOCATE -> searchViewModel.currentSearchType = Pair(key,SearchViewModel.SearchType.LOCATE)
                    SearchViewModel.SearchType.TOOL -> searchViewModel.currentSearchType = Pair(key,SearchViewModel.SearchType.TOOL)
                    SearchViewModel.SearchType.USER -> searchViewModel.currentSearchType = Pair(key,SearchViewModel.SearchType.USER)
                    else->{}
                }

                getBinding()?.rvSearchWith?.scrollToPosition(0)
                getBinding()?.edtSearch?.isCursorVisible=false
                KeyboardUtil.hideKeyboard(mActivity)
            }

            false
        }
        getBinding()?.edtSearch?.setOnTouchListener { _, _ ->
            getBinding()?.edtSearch?.isCursorVisible = true
            false
        }
    }

    private fun observerSearchUtensils(){
        searchViewModel.apply {
            searchUtensilsResult.observe(viewLifecycleOwner,{
                try {
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            searchViewModel.setSearchType(SearchViewModel.SearchType.CONSUMED)
                            if (it.data?.response !is Boolean){
                                val list= arrayListOf<ObjectSearch.ResultSearchEntity>()
                                if (it.data?.response is ResponseSearchUtensils.SearchUtensilsResponse){
                                    (it.data.response as ResponseSearchUtensils.SearchUtensilsResponse).let { response->
                                        listSearch.clear()

                                        if (status==SearchViewModel.SearchType.TOOL){
                                            if (numberPage == AppConst.DEFAULT_FIRST_PAGE) { // update list first  search key
                                                response.getListData()?.forEach { result ->
                                                    listSearch.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.TOOL,result))
                                                }
                                                adapterSearch?.updateList(listSearch)

                                            }else{  // load more
                                                response.getListData()?.forEach { result ->
                                                    listSearch.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.TOOL,result))
                                                }
                                                adapterSearch?.insertList(listSearch)

                                            }
                                            total = response.total?:0
                                            adapterSearch?.setLoaded()

                                            if (total>0){
                                                response.getListData()?.size?.let { size->
                                                    lastestId= response.getListData()?.get(size-1)?.id.toString()
                                                }
                                            }else{
                                                getBinding()?.tvNoData?.visibility=View.VISIBLE
                                            }

                                        }


                                    }

                                }

                            }
                        }
                        ApiResult.Status.ERROR_NETWORK ->{
                            shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status,null)
                            searchViewModel.setSearchType(SearchViewModel.SearchType.CONSUMED)
                            adapterSearch?.setLoaded()
                        }
                        ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN->{
                            shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status, it.message)
                            searchViewModel.setSearchType(SearchViewModel.SearchType.CONSUMED)
                            adapterSearch?.setLoaded()
                        }
                        else -> {}
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        }
    }

    private fun observerSearchUser(){
        searchViewModel.apply {
            searchUserResult.observe(viewLifecycleOwner, {
                try {
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            searchViewModel.setSearchType(SearchViewModel.SearchType.CONSUMED)
                            if (it.data?.response !is Boolean){
                                if (it.data?.response is ResponseSearchUser.SearchUserResponse){
                                    (it.data.response as ResponseSearchUser.SearchUserResponse).let { response->
                                        listSearch.clear()

                                        if (status==SearchViewModel.SearchType.USER){
                                            if (numberPage == AppConst.DEFAULT_FIRST_PAGE) { // update list first  search key
                                                response.getListData()?.forEach { result ->
                                                    listSearch.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.USER,result))
                                                }
                                                getBinding()?.rvSearchWith?.scrollToPosition(0)
                                                adapterSearch?.updateList(listSearch)
                                            }else{  // load more
                                                response.getListData()?.forEach { result ->
                                                    listSearch.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.USER,result))
                                                }
                                                adapterSearch?.insertList(listSearch)
                                            }
                                            total = response.total?:0
                                            adapterSearch?.setLoaded()

                                            if (total>0){
                                                response.getListData()?.size?.let { size->
                                                    lastestId= response.getListData()?.get(size-1)?.id.toString()
                                                }
                                            }else{
                                                getBinding()?.tvNoData?.visibility=View.VISIBLE
                                            }
                                        }

                                    }

                                }

                            }
                        }
                        ApiResult.Status.ERROR_NETWORK ->{
                            shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status,null)
                            searchViewModel.setSearchType(SearchViewModel.SearchType.CONSUMED)
                            adapterSearch?.setLoaded()
                        }
                        ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN->{
                            shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status, it.message)
                            searchViewModel.setSearchType(SearchViewModel.SearchType.CONSUMED)
                            adapterSearch?.setLoaded()
                        }
                        else -> {}
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        }}

    private fun observerSearchLocation(){
        searchViewModel.apply {
            searchLocationsResult.observe(viewLifecycleOwner,{
                try {
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            searchViewModel.setSearchType(SearchViewModel.SearchType.CONSUMED)
                            if(it.data?.response !is Boolean){
                                if (it.data?.response is ResponseSearchLocations.SearchLocationsResponse){
                                    (it.data.response as ResponseSearchLocations.SearchLocationsResponse).let { response->
                                        listSearch.clear()
                                        if (status==SearchViewModel.SearchType.LOCATE){
                                            if (numberPage == AppConst.DEFAULT_FIRST_PAGE) { // update list first  search key
                                                response.getListData()?.forEach { result ->
                                                    listSearch.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.LOCATE,result))
                                                }
                                                adapterSearch?.updateList(listSearch)

                                            }else{  // load more
                                                response.getListData()?.forEach { result ->
                                                    listSearch.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.LOCATE,result))
                                                }
                                                adapterSearch?.insertList(listSearch)
                                            }
                                            total = response.total?:0
                                            adapterSearch?.setLoaded()
                                            if (total>0){
                                                response.getListData()?.size?.let { size->
                                                    lastestId =  response.getListData()?.get(size-1)?.id.toString()
                                                }
                                            }else{
                                                getBinding()?.tvNoData?.visibility=View.VISIBLE
                                            }
                                        }

                                    }
                                }

                            }
                        }
                        ApiResult.Status.ERROR_NETWORK ->{
                            shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status,null)
                            searchViewModel.setSearchType(SearchViewModel.SearchType.CONSUMED)
                            adapterSearch?.setLoaded()
                        }
                        ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN->{
                            shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status, it.message)
                            searchViewModel.setSearchType(SearchViewModel.SearchType.CONSUMED)
                            adapterSearch?.setLoaded()
                        }
                        else -> {}
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        }
    }

    private fun showPopupWindow(){
        try {
            getBinding()?.naviBottomHome?.apply {
                btnAddPlace.apply {
                    if (isVisible){
                        startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.hide_item_left))
                        visibility=View.GONE

                    }else{
                        visibility=View.VISIBLE
                        startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.show_item_left))
                    }
                }
                btnAddUtensils.apply {
                    if (isVisible){
                        startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.hide_item_right))
                        visibility=View.GONE

                    }else{
                        visibility=View.VISIBLE
                        startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.show_item_right))
                    }
                }
                if (btnAddHome.isChecked){
                    btnAddHome.startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.rotate_ic_add_home_checked))
                }
                else{
                    btnAddHome.startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.rotate_ic_add_home_unchecked))
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
    private fun hideBtnAddHomeBackToScreenHome() {
        try {
            getBinding()?.apply {
                naviBottomHome.btnAddHome.post {
                    if (naviBottomHome.btnAddHome.isChecked) {
                        naviBottomHome.btnAddPlace.visibility = View.GONE
                        naviBottomHome.btnAddUtensils.visibility = View.GONE
                        naviBottomHome.btnAddHome.startAnimation(AnimationUtils.loadAnimation(
                            requireContext(),
                            R.anim.rotate_ic_add_home_unchecked))
                    }

                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun hideBtnAddHome(isRefresh :Boolean = false) {
        try {
            getBinding()?.apply {
                naviBottomHome.btnAddHome.post {
                    if (naviBottomHome.btnAddHome.isChecked) {
                        naviBottomHome.btnAddPlace.startAnimation(AnimationUtils.loadAnimation(
                            requireContext(),
                            R.anim.hide_item_left))
                        naviBottomHome.btnAddPlace.visibility = View.GONE

                        naviBottomHome.btnAddUtensils.startAnimation(AnimationUtils.loadAnimation(
                            requireContext(),
                            R.anim.hide_item_right))
                        naviBottomHome.btnAddUtensils.visibility = View.GONE

                        naviBottomHome.btnAddHome.startAnimation(AnimationUtils.loadAnimation(
                            requireContext(),
                            R.anim.rotate_ic_add_home_unchecked))
                        naviBottomHome.btnAddHome.isChecked = false
                        if (isRefresh) naviBottomHome.btnSearch.isChecked = true
                        else naviBottomHome.btnSearch.isChecked =
                            !naviBottomHome.btnSearch.isChecked
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    private fun onListenerNaviBottom(){
        try {
            getBinding()?.naviBottomHome?.apply {
                var currentSelected = this.btnMyPage
                listOf<AppCompatRadioButton>(
                    this.btnHome, this.btnMyPage, this.btnNotification,this.btnSearch
                ).forEach {
                    it.setSingleClick { view ->
                        currentSelected.isChecked = false
                        currentSelected = it
                        currentSelected.isChecked = true

                        when(view.id){
                            btnHome.id->{
                                finish()
                                mActivity?.clearLightStatusBar()
                            }
                            btnMyPage.id->{
                                mActivity?.showMyPage()
                                hideBtnAddHomeBackToScreenHome()
                            }
                            btnNotification.id->{
                                mActivity?.showNotification()
                                hideBtnAddHomeBackToScreenHome()
                            }
                            btnSearch.id->{
                                hideBtnAddHome(true)
                            }
                        }

                    }
                }
            }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerChangeLanguage(){
        authViewModel.isChangeLanguage.observe(viewLifecycleOwner,{
            if (it){
                getBinding()?.apply {
                    tvSearchUser.text = resources.getText(R.string.lblSearchByPerson)
                    tvSearchLocation.text = resources.getText(R.string.lblSearchByLocation)
                    tvSearchTool.text = resources.getText(R.string.lblSearchByTool)
                    tvTitle.text = resources.getText(R.string.lblTitleSearch)
                    when(status){
                        SearchViewModel.SearchType.LOCATE -> {
                            tvSearchFollow.setText(R.string.lblSearchByLocation)
                        }
                        SearchViewModel.SearchType.TOOL -> {
                            tvSearchFollow.setText(R.string.lblSearchByTool)
                        }
                        SearchViewModel.SearchType.USER -> {
                            tvSearchFollow.setText(R.string.lblSearchByPerson)
                        }
                    }
                }
                adapterSearch?.notifyDataSetChanged()
            }

        })
    }
    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.getDefault().post(true)
    }
    override fun statusBarColor() = AppConst.STATUS_BAR_WHITE

    @SuppressLint("ResourceType")
    @Subscribe
    fun onEvent(event: Any) {
        when(event){
            is Boolean ->{
                event.apply {
                    getBinding()?.apply {
                        naviBottomHome.btnHome.isChecked=false
                        naviBottomHome.btnMyPage.isChecked=false
                        naviBottomHome.btnNotification.isChecked=false
                        naviBottomHome.btnSearch.isChecked=true
                        naviBottomHome.btnAddHome.isChecked=false
                    }
                }
            }
            is String ->{
                event.apply {
                    hideBtnAddHome()
                    if (this == "StatusBar"){
                        if (this=="StatusBar"){
                            mActivity?.updateStatusBarColor(resources.getString(R.color.colorWhite))
                            mActivity?.setLightStatusBar()
                        }
                    }
                }
            }
        }
    }
    @SuppressLint("SetTextI18n")
    private fun observerNotifyUnread(){
        authViewModel.countNotifyUnread.observe(viewLifecycleOwner,{
            getBinding()?.naviBottomHome?.apply {
                if (it!=0){
                    btnNotificationUnread.visibility = View.VISIBLE
                    if (it>99) btnNotificationUnread.text ="${it}+"
                    else btnNotificationUnread.text = it.toString()
                }else{
                    btnNotificationUnread.visibility = View.GONE

                }
            }
        })
    }
    private fun followAndUnFollowUser(){
        adapterSearch?.apply {
            setOnClickFollow(object : AdapterSearchWith.OnClickFollowListener{
                override fun onClickFollow(userData: ResponseSearchUser.SearchUserData) {
                    callApiFollow(userData.id)
                }

            })
        }
    }
    private fun callApiFollow(idUser: Int?) {
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            idUser?.let {
                requestParam[ApiConst.PARAM_API_FOLLOW_ID] = it.toString()

            }
            followViewModel.requestFollowUser(requestParam)
        } catch (e: Exception) {
        }
    }
    private fun observerFollowUser() {
        try {
            followViewModel.followUserResult.observe(viewLifecycleOwner, {
                try {
                    if (it.status != ApiResult.Status.CONSUMED) {
                        shareViewModel.showOrHideLoading(it)
                        if (it.status == ApiResult.Status.SUCCESS) {
                            if (it.data?.response !is Boolean) {
                                if (it.data?.response is ResponseFollow.FollowResponse) {
                                    (it.data.response as ResponseFollow.FollowResponse).let {
                                        adapterSearch?.apply {
                                            val position =  listResult.withIndex().filter { (_, value)->

                                                val userData =  value.content as ResponseSearchUser.SearchUserData
                                                userData.id==it.follower_id
                                            }.map { (i, _)->i }.single()

                                            if (listResult[position].content is ResponseSearchUser.SearchUserData ){
                                                (listResult[position].content as ResponseSearchUser.SearchUserData ).apply {
                                                    if (it.follows==true) this.followed_flag="1"
                                                    else this.followed_flag="0"
                                                }
                                            }
                                            notifyItemChanged(position)

                                            it.follows?.let { it1 ->
                                                it.follower_id?.let { id ->
                                                    val requestFollowUnFollow = HashMap<Int, Int>()
                                                    if (it1) requestFollowUnFollow[id] = ListPostUserResponse.STATE_FOLLOW
                                                    else requestFollowUnFollow[id] = ListPostUserResponse.STATE_UNFOLLOW
                                                    shareViewModel.listIdFollow.putAll(requestFollowUnFollow)
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    it.status = ApiResult.Status.CONSUMED
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
        }
    }
    private fun eventLoadMore() {
        adapterSearch?.setLoadMore(object : AdapterSearchWith.ILoadMore {
            override fun onLoadMore() {
                try {
                    ++numberPage
                    if (adapterSearch?.listResult?.size ?:0 < total ) {
                        callApiSearch(lastestId=lastestId,key = key)
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }

        })
    }

    private fun listenerItemClicked(){
        adapterSearch?.setOnClickItem(object : AdapterSearchWith.OnClickItemListener{
            override fun onClicked(item: Any) {
                if (item is ResponseSearchLocations.SearchLocationData){
                    item.apply {
                        mActivity!!.showListPostLocation(this.id.toString(),
                            FrmSearchLocation.FRM_SEARCH_LOCATION, this.name)
                    }
                }
                if (item is ResponseListLocation.LocationData){
                    item.apply {
                        this.name?.let {
                            mActivity!!.showListPostLocation(this.id.toString(),
                                FrmSearchLocation.FRM_SEARCH_LOCATION,
                                it)
                        }
                    }
                }
                if (item is ResponseSearchUtensils.SearchUtensilsData){
                    item.apply {
                        mActivity!!.showListPostLocation(this.id.toString(),
                            FrmSearchUtensils.FRM_SEARCH_UTENSILS, this.name)
                    }
                }
                if (item is ResponseListUtensils.UtensilsData){
                    item.apply {
                        this.name?.let {
                            mActivity!!.showListPostLocation(this.id.toString(),
                                FrmSearchUtensils.FRM_SEARCH_UTENSILS,
                                it)
                        }
                    }
                }
                if (item is ResponseSearchUser.SearchUserData){
                    item.apply {
                        this.id?.let { mActivity?.showPersonalPageOrMyPage(it) }
                    }
                }

            }

        })
    }
}