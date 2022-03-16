package brite.outdoor.ui.fragments

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.graphics.Rect
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import brite.outdoor.R
import brite.outdoor.adapter.AdapterHome
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.AppConst.Companion.FRM_LIST_POST_LOCATION
import brite.outdoor.constants.ExtraConst
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_LOCATION_ID
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_LOCATION_NAME
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_TYPE_FRAGMENT
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.entities.BackStackData
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmListPostLocationBinding
import brite.outdoor.ui.dialog.*
import brite.outdoor.utils.resizeHeight
import brite.outdoor.utils.resizeLayout
import brite.outdoor.utils.setTextSizePX
import brite.outdoor.viewmodel.AuthViewModel
import brite.outdoor.viewmodel.LikeViewModel
import brite.outdoor.viewmodel.ListPostLocationViewModel
import brite.outdoor.viewmodel.MyPostViewModel
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

@AndroidEntryPoint
class FrmListPostLocation : BaseFragment<FrmListPostLocationBinding>(),BottomSheetDialogFrHome.CallBackListener,DialogFragmentReport.CallBackListener, DialogComment.OnChangeNumberComment, View.OnClickListener {
    private val viewMode by viewModels<ListPostLocationViewModel>()
    private val likeViewModel by viewModels<LikeViewModel>()
    private var numberPage : Int = AppConst.DEFAULT_FIRST_PAGE
    private var locationId:String?=null
    private var typeFragment:Int?=null
    private val myPostViewModel by viewModels<MyPostViewModel>()
    private val authViewModel by activityViewModels<AuthViewModel>()
    private lateinit var adapter: AdapterHome
    var totalLoadMoreResult : Int = AppConst.DEFAULT_TOTAL_RESULT
    private var dialogComment: DialogComment? = null
    private var postId: Int? = null
    private var positionRemoveItem = 0
    private var lastest_id:String=""
    private var locationName:String?=null
    override fun loadControlsAndResize(binding: FrmListPostLocationBinding?) {
        binding?.apply {
            val heightToolBar = getSizeWithScale(80.0)
            val widthButtonNav = getSizeWithScale(56.0)
            clTopNav.resizeHeight(heightToolBar)
            tvTopNavTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX,getSizeWithScaleFloat(16.0))
            btnBack.resizeLayout(getSizeWithScale(36.0), getSizeWithScale(60.0))
            btnBack.setOnClickListener(this@FrmListPostLocation)
            ltRetry.apply {
                tvErrMsg.setTextSizePX(getSizeWithScaleFloat(14.0))
                btnRetry.setOnClickListener(this@FrmListPostLocation)
            }
            val rect = Rect();
            refreshLayout.getDrawingRect(rect)
            refreshLayout.setProgressViewOffset(false, 200, 350)
        }
    }
    companion object{
       const val FRM_SEARCH_UTENSILS=2
       const val FRM_SEARCH_LOCATION=1
        fun getInstance(
            arrayList: ArrayList<BackStackData>?,
            mapData: java.util.HashMap<String, Any>?
        ): FrmListPostLocation {
            val fragment = FrmListPostLocation()
            val data = Bundle()
            if (mapData != null) {
                if (mapData.containsKey(EXTRA_LOCATION_ID))
                    data.putString(EXTRA_LOCATION_ID, mapData[EXTRA_LOCATION_ID] as String)
                if (mapData.containsKey(EXTRA_TYPE_FRAGMENT))
                    data.putInt(EXTRA_TYPE_FRAGMENT, mapData[EXTRA_TYPE_FRAGMENT] as Int)
                if (mapData.containsKey(EXTRA_LOCATION_NAME)){
                    data.putString(EXTRA_LOCATION_NAME, mapData[EXTRA_LOCATION_NAME] as String)
                }
            }
            if (arrayList != null) data.putSerializable(ExtraConst.EXTRA_BACK_STACK, arrayList)
            fragment.arguments = data
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.apply {
            locationId=getString(EXTRA_LOCATION_ID)
            typeFragment= getInt(EXTRA_TYPE_FRAGMENT)
            locationName= getString(EXTRA_LOCATION_NAME)
        }
    }

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmListPostLocationBinding {
        return FrmListPostLocationBinding.inflate(inflater,container,false)
    }

    override fun initView(savedInstanceState: Bundle?) {
        initAdapter()
        getBinding()?.apply {
            shimmerFrameLayout.startShimmer()
        }
        locationId?.let {
            typeFragment?.let {  typeFragment ->
                if (typeFragment == FRM_SEARCH_LOCATION){
                    callApiLocation(numberPage,it)
                }else if (typeFragment== FRM_SEARCH_UTENSILS){
                    callApiUtensils(numberPage,it)
                }
            }

        }
        locationName?.let {
            getBinding()?.tvTopNavTitle?.text = it
        }
        observerListPostLocation()
        observerListPostUtensils()
        onRefreshListener()
        eventLoadMore()
        observerLikeUser()
        observerHandleAPILoadingAndErr()
        observerDeletePost()
        observerSharePost()
        observerNeedUpdateDataPostInListLocation()
        observerComment()
        observerChangeLanguage()
    }
    private fun initAdapter(){
        try {
            adapter= AdapterHome(requireContext(),object : AdapterHome.OnClickItemListener{
                override fun onClickMenu(entityNew: ListPostUserData?, position: Int) {
                    showBottomDialog(entityNew,position)
                    positionRemoveItem = position
                }

                override fun onClickItem(entityNew: ListPostUserData?,position: Int) {
                    entityNew?.let {
                        mActivity?.showDetail(
                                it.id,
                                it,
                                position,
                                itemDeleteListener = {position:Int ->deleteItemFrmDetailCallBack(position)},
                                itemHideListener = {position:Int -> hideItemFrmDetailCallBack(position)},
                                itemReportListener = {position:Int->reportFrmDetailCallBack(position)})
                    }
                }

                override fun onClickLike(entityNew: ListPostUserData?,position: Int) {
                    authViewModel.positionPostShareAndLikeNeedNotifyChange(postIdShareAndLikeParam = entityNew?.id,positionPostShareAndLikeParam = position,currentFragmentParam = AppConst.FRM_LIST_POST_LOCATION)
                    mActivity?.callApiLike(entityNew?.id)
                }

                override fun onClickComment(entityNew: ListPostUserData?,position: Int) {
                    postId = entityNew?.id
                    entityNew?.id?.let { showDialogComment(it,position) }
                }

                override fun onClickShare(entityNew: ListPostUserData?,position: Int) {
                    entityNew?.id?.let {
                        authViewModel.positionPostShareAndLikeNeedNotifyChange(it,position,AppConst.FRM_LIST_POST_LOCATION)
                    }
                    mActivity?.showDialogShare(entityNew,onClickShareListener = {content:String ->onClickShareListener(content)})
                }

                override fun onClickItemGoToFrmPersonalPage(userId: Int?) {
                    if (userId != null) {
                        mActivity?.showPersonalPageOrMyPage(userId)
                    }

                }

            },getBinding()?.rcView!!,false)
            getBinding()?.rcView?.adapter=adapter
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun callApiLocation(page:Int,locationId:String,lastest_id:String=""){
        try {
            getBinding()?.apply {
                shimmerFrameLayout.visibility = View.VISIBLE
                shimmerFrameLayout.startShimmer()
                rcView.visibility = View.GONE
            }
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_PAGE]= page.toString()
            requestParam[ApiConst.PARAM_API_LIMIT] = AppConst.DEFAULT_ITEM_PER_PAGE.toString()
            requestParam[ApiConst.PARAM_API_LASTEST_ID]=lastest_id
            viewMode.requestListPostLocation(requestParam,locationId)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun callApiUtensils(page:Int,locationId:String,lastest_id:String=""){
        try {
            getBinding()?.apply {
                shimmerFrameLayout.visibility = View.VISIBLE
                shimmerFrameLayout.startShimmer()
                rcView.visibility = View.GONE
            }
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_PAGE]= page.toString()
            requestParam[ApiConst.PARAM_API_LIMIT] = AppConst.DEFAULT_ITEM_PER_PAGE.toString()
            requestParam[ApiConst.PARAM_API_LASTEST_ID]=lastest_id
            viewMode.requestListPostUtensils(requestParam,locationId)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerLikeUser() {
        authViewModel.likeResult.value?.status=ApiResult.Status.CONSUMED
        try {
            authViewModel.likeResult.observe(viewLifecycleOwner, {
                try {
                    myPostViewModel.showOrHideLoading(it)
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            if (it.data?.response !is Boolean) {
                                if (it.data?.response is ResponseLike.LikeResponse) {
                                    (it.data.response as ResponseLike.LikeResponse).let {
                                        adapter.apply {
                                            val position =  arrayListNews.withIndex().filter { (_, value)->
                                                value.id==it.post_id
                                            }.map { (i, _)->i }.single()
                                            arrayListNews[position].post_likes=it.liked
                                            arrayListNews[position].like_count = it.like_count
                                            notifyItemChanged(position)
                                        }
                                    }
                                }
                            }
                        }
                        ApiResult.Status.ERROR_DELETE_POST->{
                            if (authViewModel.currentFragmentPostShareAndLike==AppConst.FRM_LIST_POST_LOCATION){
                                adapter.removeItem(authViewModel.positionPostShareAndLike)
                                updateTotalResultWhenRemoveItem()
                                mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),null)
                            }else{
                                adapter.apply {
                                    val position =  arrayListNews.withIndex().filter { (_, value)->
                                        value.id==authViewModel.postIdShareAndLike
                                    }.map { (i, _)->i }.singleOrNull()
                                    position?.let {
                                        removeItem(position)
                                        updateTotalResultWhenRemoveItem()
                                    }
                                }
                            }

                        }
                        ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                            shareViewModel.isNeedShowErr.value=ApiNoticeEntity(it.status, it.message)
                        }
                    }
                    // show loading
                    myPostViewModel.isShowLoading.observe(viewLifecycleOwner,{
                        shareViewModel.isShowLoading.value=it
                    })
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    private fun observerSharePost(){
        authViewModel.postShareResult.value?.status=ApiResult.Status.CONSUMED
            authViewModel.postShareResult.observe(viewLifecycleOwner,{
                try {
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            if (it.data?.response is ResponseShares.ShareResponse){
                                (it.data.response as ResponseShares.ShareResponse).let {
                                    adapter?.apply {
                                        val position =  arrayListNews.withIndex().filter { (_, value)->
                                            value.id==it.post_id
                                        }.map { (i, _)->i }.single()
                                        arrayListNews[position].post_shares=true
                                        arrayListNews[position].share_count = it.share_count
                                        notifyItemChanged(position)
                                    }
                                }
                            }
                            mActivity?.showDialogNotify(resources.getString(R.string.str_sharefb_success))
                        }
                        ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN->shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status, it.message)
                        ApiResult.Status.ERROR_NETWORK->shareViewModel.isNeedShowErr.value == ApiNoticeEntity(it.status,null)
                        ApiResult.Status.ERROR_DELETE_POST->{
                            if (authViewModel.currentFragmentPostShareAndLike == AppConst.FRM_LIST_POST_LOCATION){
                                adapter.removeItem(authViewModel.positionPostShareAndLike)
                                updateTotalResultWhenRemoveItem()
                                mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),null)
                            }else{
                                adapter.apply {
                                    val position =  arrayListNews.withIndex().filter { (_, value)->
                                        value.id==authViewModel.postIdShareAndLike
                                    }.map { (i, _)->i }.singleOrNull()
                                    position?.let {
                                        removeItem(position)
                                        updateTotalResultWhenRemoveItem()
                                    }
                                }
                            }
                        }
                    }
                }catch (e:Exception){
                    e.printStackTrace()
                }

            })
    }
    private fun observerListPostLocation(){
        try {
            viewMode.listPostLocationResult.observe(viewLifecycleOwner,{
                if (it.status != ApiResult.Status.CONSUMED){
                    if (adapter.arrayListNews.size==0) myPostViewModel.showOrHideLoading(it) else shareViewModel.showOrHideLoading(it)
                    if (it.status == ApiResult.Status.SUCCESS){
                        getBinding()?.apply {
                            ltRetry.clRetryRoot.visibility=View.GONE
                            shimmerFrameLayout.visibility = View.GONE
                            rcView.visibility=View.VISIBLE
                        }
                        if (it.data?.response is ListPostUserResponse){
                            (it.data.response as ListPostUserResponse).apply {
                                this.getListData()?.let { it ->
                                    if (numberPage==AppConst.DEFAULT_FIRST_PAGE){
                                        adapter.submitList(it)
                                        adapter.setLoaded()
                                        totalLoadMoreResult = this.total ?: 0
                                    }else{
                                        adapter.addAllItem(it)
                                        adapter.setLoaded()
                                    }
                                   
                                    if (it.size>0) lastest_id = it.last().id.toString()
                                }
                            }
                        }
                        myPostViewModel.isShowLoading.value = false
                    }else if (it.status==ApiResult.Status.ERROR_NETWORK) adapter.setLoaded()
                }
                it.status=ApiResult.Status.CONSUMED
            })
        }catch (e:Exception){
            e.printStackTrace()
        }

    }
    private fun observerListPostUtensils(){
        try {
            viewMode.listPostUtensilsResult.observe(viewLifecycleOwner,{
                if (it.status != ApiResult.Status.CONSUMED){
                    if (adapter.arrayListNews.size==0) myPostViewModel.showOrHideLoading(it) else shareViewModel.showOrHideLoading(it)
                    if (it.status == ApiResult.Status.SUCCESS){
                       getBinding()?.apply {
                           ltRetry.clRetryRoot.visibility=View.GONE
                           shimmerFrameLayout.visibility = View.GONE
                           rcView.visibility=View.VISIBLE
                       }
                        if (it.data?.response is ListPostUserResponse){
                            (it.data.response as ListPostUserResponse).apply {
                                this.getListData()?.let { it ->
                                    if (numberPage==AppConst.DEFAULT_FIRST_PAGE){
                                        adapter.submitList(it)
                                        adapter.setLoaded()
                                        totalLoadMoreResult = this.total ?:0
                                    }else{
                                        adapter.addAllItem(it)
                                        adapter.setLoaded()
                                    }
                                   if (it.size>0) lastest_id = it.last().id.toString()
                                }
                            }
                        }
                        myPostViewModel.isShowLoading.value = false
                    }else if (it.status==ApiResult.Status.ERROR_NETWORK) adapter.setLoaded()
                }
                it.status = ApiResult.Status.CONSUMED
            })
        }catch (e:Exception){
            e.printStackTrace()
        }

    }
    private fun observerHandleAPILoadingAndErr() {
        try {
            myPostViewModel.isNeedShowErr.observe(viewLifecycleOwner, {
                when (it.status) {
                    ApiResult.Status.ERROR, ApiResult.Status.ERROR_NETWORK -> {

                        shareViewModel.isNeedShowErr.value = it
                        if (adapter.arrayListNews.size == 0) {
                            getBinding()?.apply {
                                ltRetry.clRetryRoot.visibility = View.VISIBLE
                                ltRetry.tvErrMsg.text =
                                        if (it.status == ApiResult.Status.ERROR_NETWORK) this@FrmListPostLocation.getString(
                                                R.string.no_internet_connection
                                        ) else it.message
                            }
                        }else{
                            shareViewModel.isNeedShowErr.value = it
                        }
                        getBinding()?.apply {
                            shimmerFrameLayout.visibility = View.GONE
                            shimmerFrameLayout.stopShimmer()
                            rcView.visibility = View.VISIBLE
                        }
                    }
                    ApiResult.Status.ERROR_TOKEN ->{
                    shareViewModel.isNeedShowErr.value = it
                    getBinding()?.apply {
                        shimmerFrameLayout.visibility = View.GONE
                        shimmerFrameLayout.stopShimmer()
                        rcView.visibility = View.VISIBLE
                    }
                }
                }
            })
        }catch (e:Exception){
            e.printStackTrace()
        }

    }
    private fun onRefreshListener(){
        getBinding()?.apply {
            refreshLayout.setOnRefreshListener {
                locationId?.let {
                    numberPage=AppConst.DEFAULT_FIRST_PAGE
                    if (typeFragment == FRM_SEARCH_LOCATION){
                        callApiLocation(AppConst.DEFAULT_FIRST_PAGE,it)
                    }else if (typeFragment == FRM_SEARCH_UTENSILS){
                        callApiUtensils(AppConst.DEFAULT_FIRST_PAGE,it)
                    }

                }
                refreshLayout.isRefreshing=false
            }

        }
    }
    private fun eventLoadMore(){
        try {
            adapter.setLoadMore(object : AdapterHome.ILoadMore{
                override fun onLoadMore() {
                    if (adapter.arrayListNews.size < totalLoadMoreResult){
                        locationId?.let {
                            if (typeFragment == FRM_SEARCH_LOCATION){
                                callApiLocation(++numberPage,it,lastest_id)
                            }else if (typeFragment == FRM_SEARCH_UTENSILS){
                                callApiUtensils(++numberPage,it,lastest_id)
                            }
                        }
                    }
                }

            })
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun showBottomDialog(entityNew: ListPostUserData?,position:Int) {
        try {
            adapter.updateListFollowUnFollow(shareViewModel.listIdFollow)
            mActivity?.showBottomSheet(entityNew,this,position)
        }catch (e:Exception){
            e.printStackTrace()
        }

    }

    override fun followUnFollowSuccess(follow: ResponseFollow.FollowResponse?, entityNew: ListPostUserData?) {
        try {
            follow?.follows?.let { it1 ->
                entityNew?.created_id?.let { id ->
                    val requestFollowUnFollow = HashMap<Int,Int>()
                    if (it1)   requestFollowUnFollow[id]= ListPostUserResponse.STATE_FOLLOW
                    else requestFollowUnFollow[id]= ListPostUserResponse.STATE_UNFOLLOW
                    adapter.updateListFollowUnFollow(requestFollowUnFollow)
                    shareViewModel.listIdFollow.putAll(requestFollowUnFollow)
                }
            }
        }catch (e:Exception){
            e.printStackTrace()
        }

    }

    override fun badReport(entityNew: ListPostUserData?, position: Int?) {
        mActivity?.showDialogReport(entityNew,this,position)
    }

    override fun hidePostSuccess(position: Int?) {
        try {
            position?.let {
                adapter.removeItem(it)
                updateTotalResultWhenRemoveItem()
            }
            mActivity?.bottomSheet?.dismiss()
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    override fun editPost(entityNew: ListPostUserData?) {
        if (entityNew?.type == AppConst.FRM_POST_UTENSILS){
            mActivity?.let {
                FrmPushPostsNew.getInstance(entityNew, typeFragment = AppConst.FRM_POST_UTENSILS, true).show(it.supportFragmentManager,"FrmPushPostNew")
            }
        }else{
            mActivity?.let {
                FrmPushPostsNew.getInstance(entityNew, typeFragment = AppConst.FRM_POST_LOCATION, true).show(it.supportFragmentManager,"FrmPushPostNew")
            }
        }
    }

    override fun showDialogConfirmDelete(entityNew: ListPostUserData?) {
        val dialogDelete = DialogDelete(requireContext())
        dialogDelete.apply {
            show(true, resources.getString(R.string.msgDeletePost), resources.getString(R.string.msgConfirmDeletePost), object :
                DialogDelete.OnDeleteAgreeOrCancel{
                override fun onAgree() {
                    callApiDeletePost(entityNew)
                }

            })
        }
    }
    private fun callApiDeletePost(entityNew:ListPostUserData?){
        try {
            val requestParam = mActivity?.getRequestParamWithToken()
            requestParam?.let {
                viewMode.requestDeletePost(it,entityNew?.id.toString())
            }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    private fun observerDeletePost(){
        try {
            viewMode.deletePostResult.observe(viewLifecycleOwner,{
                if (it.status!= ApiResult.Status.CONSUMED){
                    shareViewModel.showOrHideLoading(it)
                    if (it.status==ApiResult.Status.SUCCESS){
                        it?.data?.message?.let {
                            mActivity?.showDialogSuccess(it)
                        }
                        adapter.removeItem(positionRemoveItem)
                        updateTotalResultWhenRemoveItem()
                    }
                }
                it.status= ApiResult.Status.CONSUMED
            })
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    override fun reportSuccess(position: Int?) {
       try {
           if (position !=-1){ // report succes
               position?.let {
                   adapter.removeItem(it)
                   updateTotalResultWhenRemoveItem()
               }
           }
           mActivity?.bottomSheet?.dismiss()
       }catch (e:Exception){
           e.printStackTrace()
       }
    }
    private fun showDialogComment(postId: Int,position: Int) {
        dialogComment = DialogComment()
        mActivity?.dialogComment= dialogComment
        dialogComment!!.show(childFragmentManager, "DialogComment")
        dialogComment?.apply {
            mActivity?.getAvatarId()?.let { setData(it, mActivity, postId, shareViewModel, this@FrmListPostLocation,position=position) }

        }
    }

    override fun onNumberComment(numberComment: Int?) {}
    private fun observerComment(){
        authViewModel.syncComment.observe(viewLifecycleOwner,{
            adapter.apply {
                val position =  arrayListNews.withIndex().filter { (_, value)->
                    value.id==it.id
                }.map { (i, _)->i }.singleOrNull()
                if (position!=null){
                    arrayListNews[position].comment_count = it.count_comment
                    notifyItemChanged(position)
                }

            }
        })
    }

    override fun onErrorDeletePost(position: Int?) {
        position?.let {
            adapter.removeItem(position)
            updateTotalResultWhenRemoveItem()
        }
    }

    private fun onClickShareListener(content:String){
        mActivity?.onShareLinkFacebook(content)
    }
    fun deleteItemFrmDetailCallBack(position: Int){
        adapter.removeItem(position)
        updateTotalResultWhenRemoveItem()
    }
    fun hideItemFrmDetailCallBack(position: Int){
        adapter.removeItem(position)
        updateTotalResultWhenRemoveItem()
    }
    fun reportFrmDetailCallBack(position: Int){
        adapter.removeItem(position)
        updateTotalResultWhenRemoveItem()
    }

    override fun getCurrentFragment(): Int {
        return FRM_LIST_POST_LOCATION
    }

    override fun isBackPreviousEnable(): Boolean {
        return true
    }

    override fun backToPrevious() {
        finish()
    }

    override fun finish() {
        mActivity?.closeFuncChildScreen(this)
    }
    private fun observerNeedUpdateDataPostInListLocation(){
        shareViewModel.isNeedUpdateDataWhenEditPostInListLocation.observe(viewLifecycleOwner,{
            if (it){
                try {
                    adapter.apply {
                        val position =  arrayListNews.withIndex().filter { (_, value)->
                            value.id==shareViewModel.editPost?.getDataEditPost()?.id
                        }.map { (i, _)->i }.single()
                        shareViewModel.editPost?.getDataEditPost()?.let {
                            arrayListNews[position]=it
                        }
                        notifyItemChanged(position)

                    }
                    shareViewModel.isNeedUpdateDataWhenEditPostInListLocation.value=false
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        })
    }

    override fun onClick(v: View?) {
        try {
            if (!isClickAble()) return
            when(v?.id){
                R.id.btnBack ->  backToPrevious()
                R.id.btnRetry->{
                    getBinding()?.shimmerFrameLayout?.startShimmer()
                    getBinding()?.shimmerFrameLayout?.visibility = View.VISIBLE
                    locationId?.let {
                        if (typeFragment == FRM_SEARCH_LOCATION){
                            callApiLocation(AppConst.DEFAULT_FIRST_PAGE,it)
                        }else if (typeFragment == FRM_SEARCH_UTENSILS){
                            callApiUtensils(AppConst.DEFAULT_FIRST_PAGE,it)
                        }
                    }
                }
            }
        }catch (e: Exception){
            e.printStackTrace()
        }
    }
    private fun updateTotalResultWhenRemoveItem(){
        totalLoadMoreResult--
    }
    private fun observerChangeLanguage(){
        authViewModel.isChangeLanguage.observe(viewLifecycleOwner,{
            if (it){
              adapter.notifyDataSetChanged()
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
    @SuppressLint("ResourceType")
    @Subscribe
    fun onEvent(event: Any) {
        when(event){
            is String ->{
                event.apply {
                    if (this == "StatusBar"){
                        mActivity?.updateStatusBarColor(resources.getString(R.color.colorWhite))
                        mActivity?.setLightStatusBar()
                    }
                }
            }
        }
    }
}