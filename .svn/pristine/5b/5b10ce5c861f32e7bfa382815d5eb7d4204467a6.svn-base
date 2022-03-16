package brite.outdoor.ui.fragments.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import brite.outdoor.R
import brite.outdoor.adapter.AdapterHome
import brite.outdoor.adapter.AdapterHomeHotNews
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.ExtraConst
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.api_entities.ResponseLikePostHotNews
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmHotNewsBinding
import brite.outdoor.ui.dialog.DialogComment
import brite.outdoor.ui.dialog.DialogCommentHotNews
import brite.outdoor.ui.dialog.DialogFragmentReport
import brite.outdoor.ui.fragments.BaseFragment
import brite.outdoor.ui.fragments.BottomSheetDialogFrHome
import brite.outdoor.utils.setSingleClick
import brite.outdoor.utils.setTextSizePX
import brite.outdoor.viewmodel.AuthViewModel
import brite.outdoor.viewmodel.HotNewsViewModel
import brite.outdoor.viewmodel.MyPostViewModel
import brite.outdoor.viewmodel.NewViewModel
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus

@AndroidEntryPoint
class FrmHotNews : BaseFragment<FrmHotNewsBinding>(), DialogFragmentReport.CallBackListener, DialogComment.OnChangeNumberComment,
    BottomSheetDialogFrHome.CallBackListener{
    private val hotNewsViewModel by viewModels<HotNewsViewModel>()
    private val authViewModel by activityViewModels<AuthViewModel>()
    private val myPostViewModel by viewModels<MyPostViewModel>()
    lateinit var adapter: AdapterHomeHotNews
    private var dialogComment: DialogCommentHotNews? = null
    private var postId : Int? = null
    private var lastestId:String = ""
    private var numberPage : Int = AppConst.DEFAULT_FIRST_PAGE
    private var totalLoadMoreResult : Int = AppConst.DEFAULT_TOTAL_RESULT
    private var positionRemoveItem = 0

    override fun loadControlsAndResize(binding: FrmHotNewsBinding?) {
        getBinding()?.apply {
            ltRetry.apply {
                tvErrMsg.setTextSizePX(getSizeWithScaleFloat(14.0))
                btnRetry.setSingleClick {
                    shimmerFrameLayout.startShimmer()
                    shimmerFrameLayout.visibility = View.VISIBLE
                    callApiListPostHotNews(AppConst.DEFAULT_FIRST_PAGE)
                    ltRetry.clRetryRoot.visibility=View.GONE
                }
            }
        }
    }

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmHotNewsBinding {
        return FrmHotNewsBinding.inflate(inflater,container,false)
    }

    override fun initView(savedInstanceState: Bundle?) {
        initAdapter()
        getBinding()?.rcView?.adapter = adapter
        onRefreshListener()
        callApiListPostHotNews(numberPage)
        observerListPostNew()
        observerHandleAPILoadingAndErr()
        observerLikeUser()
        observerSharePost()
        eventLoadMore()
        getBinding()?.apply {
            shimmerFrameLayout.startShimmer()
        }

    }
    private fun initAdapter() {
        try {
             adapter = AdapterHomeHotNews(requireContext(), object : AdapterHomeHotNews.OnClickItemListener {
                override fun onClickMenu(entityNew: ResponseListPostHotNews.HotNewsData?, position:Int) {
                    showBottomDialog(entityNew,position)
                    positionRemoveItem = position
                }

                override fun onClickItem(entityNew: ResponseListPostHotNews.HotNewsData?, position: Int) {
                    entityNew?.let {
                        adapter.updateListFollowUnFollow(shareViewModel.listIdFollow)
                        mActivity?.showDetailHotNews(
                            it.id,
                            entityNew,
                            position,
                            itemDeleteListener = {position:Int ->deleteItemFrmDetailCallBack(position)},
                            itemHideListener = {position:Int -> hideItemFrmDetailCallBack(position)},
                            itemReportListener = {position:Int->reportFrmDetailCallBack(position)})
                    }
                }

                override fun onClickLike(entityNew: ResponseListPostHotNews.HotNewsData?, position: Int) {
                    authViewModel.positionPostShareAndLikeNeedNotifyChange(postIdShareAndLikeParam = entityNew?.id,positionPostShareAndLikeParam = position,currentFragmentParam = AppConst.FRM_NEWS)
                    mActivity?.callApiLikePostHotNews(entityNew?.id)
                }

                override fun onClickComment(entityNew: ResponseListPostHotNews.HotNewsData?, position: Int) {
                    postId = entityNew?.id
                    entityNew?.id?.let { showDialogComment(it,position) }
                }

                override fun onClickShare(entityNew: ResponseListPostHotNews.HotNewsData?, position: Int) {
                    entityNew?.id?.let {
                        authViewModel.positionPostShareAndLikeNeedNotifyChange(it,position,AppConst.FRM_NEWS)
                    }
                    mActivity?.showDialogShare(entityNew,onClickShareListener = {content:String->onClickShareListener(content)})
                    //hide btnAddHome  Home
                    EventBus.getDefault().post("dialogShare")
                }

                override fun onClickItemGoToFrmPersonalPage(userId: Int?) {
                    userId?.let {
                        mActivity?.showPersonalPageOrMyPage(it)
                    }
                }

            },getBinding()?.rcView!!,false)
        }catch (e:Exception){
            e.printStackTrace()

        }
    }
    private fun observerLikeUser() {
        authViewModel.likeResultPostHotNews.value?.status=ApiResult.Status.CONSUMED
        try {
            authViewModel.likeResultPostHotNews.observe(viewLifecycleOwner, {
                try {
                    myPostViewModel.showOrHideLoading(it)
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            if (it.data?.response !is Boolean) {
                                if (it.data?.response is ResponseLikePostHotNews.LikePostHotNewsResponse) {
                                    (it.data.response as ResponseLikePostHotNews.LikePostHotNewsResponse).let {
                                        adapter.apply {
                                            val position =  arrayListNews.withIndex().filter { (_, value)->
                                                value.id==it.hot_news_id
                                            }.map { (i, _)->i }.single()
                                            arrayListNews[position].hot_news_likes=it.liked
                                            arrayListNews[position].like_count = it.like_count
                                            notifyItemChanged(position)
                                        }
                                    }
                                }
                            }
                        }
                        ApiResult.Status.ERROR_DELETE_POST->{
                            if (authViewModel.currentFragmentPostShareAndLike==AppConst.FRM_HOT_NEWS){
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
                            shareViewModel.isNeedShowErr.value= ApiNoticeEntity(it.status, it.message)
                        }
                        else->{}
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
        authViewModel.postHotNewsShareResult.value?.status=ApiResult.Status.CONSUMED
        authViewModel.postHotNewsShareResult.observe(viewLifecycleOwner,{
            try {
                when(it.status){
                    ApiResult.Status.SUCCESS->{
                        if (it.data?.response is ResponseSharePostHotNews.SharePostHotNewsResponse){
                            (it.data.response as ResponseSharePostHotNews.SharePostHotNewsResponse).let {
                                adapter.apply {
                                    val position =  arrayListNews.withIndex().filter { (_, value)->
                                        value.id==it.hot_news_id
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
                        if (authViewModel.currentFragmentPostShareAndLike == AppConst.FRM_HOT_NEWS){
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

    fun callApiListPostHotNews(page:Int,isRefresher:Boolean=false,lastestId:String="") {
        try {
            /**
            CallAPi when data.size=0 , isRefresher = true and loadMore (numberPage !=1)
             */
            if (adapter.arrayListNews.size>0 && page== AppConst.DEFAULT_FIRST_PAGE && !isRefresher) return

            getBinding()?.apply {
                shimmerFrameLayout.visibility = View.VISIBLE
                shimmerFrameLayout.startShimmer()
                rcView.visibility = View.GONE
            }
            val requestParam = mActivity!!.getRequestParamWithToken()
            hotNewsViewModel.requestListPostHotNews(requestParam)
//            requestParam[ApiConst.PARAM_API_PAGE]= page.toString()
            requestParam[ApiConst.PARAM_API_LASTEST_ID]=lastestId
            requestParam[ApiConst.PARAM_API_LIMIT] = AppConst.DEFAULT_ITEM_PER_PAGE.toString()

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    private fun observerListPostNew() {
        hotNewsViewModel.listPostHotNewsResult.observe(viewLifecycleOwner, {
            if (it.status != ApiResult.Status.CONSUMED) {
                try {
                    if (it.status != ApiResult.Status.CONSUMED) {
                        myPostViewModel.showOrHideLoading(it)
                        if (it.status == ApiResult.Status.SUCCESS) {
                            getBinding()?.apply {
                                ltRetry.clRetryRoot.visibility = View.GONE
                                shimmerFrameLayout.visibility = View.GONE
                                rcView.visibility=View.VISIBLE
                            }

                            if (it.data?.response is ResponseListPostHotNews.ListPostHotNewsResponse) {
                                (it.data.response as ResponseListPostHotNews.ListPostHotNewsResponse).let { response ->
                                    adapter.let { adapter ->
                                        response.listPostHotNews()?.let { it1 ->
                                            //updatelist refresh and reset loaded
                                            if (numberPage == AppConst.DEFAULT_FIRST_PAGE) {
                                                adapter.submitList(it1)
                                                adapter.setLoaded()

                                            }

                                            // updateList loadmore
                                            else {
                                                adapter.addAllItem(list = it1)
                                                adapter.setLoaded()
                                            }
                                            totalLoadMoreResult = response.total ?: 0
                                        }
                                    }
                                    response.listPostHotNews()?.let {  it1->
                                        if (it1.size>0) lastestId = it1.last().id.toString()
                                    }
                                }
                            }
                            myPostViewModel.isShowLoading.value = false
                        } else if (it.status== ApiResult.Status.ERROR_NETWORK) adapter?.setLoaded()
                    }
                    it.status = ApiResult.Status.CONSUMED
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        })
    }
    private fun observerHandleAPILoadingAndErr() {
        myPostViewModel.isNeedShowErr.observe(viewLifecycleOwner, {
            when (it.status) {
                ApiResult.Status.ERROR, ApiResult.Status.ERROR_NETWORK -> {
                    getBinding()?.apply {
                        if (adapter.arrayListNews.size == 0){
                            ltRetry.clRetryRoot.visibility = View.VISIBLE
                            ltRetry.tvErrMsg.text =
                                if (it.status == ApiResult.Status.ERROR_NETWORK) this@FrmHotNews.getString(
                                    R.string.no_internet_connection
                                ) else it.message
                        }else{
                            shareViewModel.isNeedShowErr.value = it
                        }
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
                else->{}
            }
        })

    }

    @SuppressLint("SetTextI18n")
    private fun showBottomDialog(entityNew: ResponseListPostHotNews.HotNewsData?,position:Int) {
        adapter.updateListFollowUnFollow(shareViewModel.listIdFollow)
        try {
            mActivity?.showBottomSheet(getPostUserData(entityNew),this@FrmHotNews,position)
        }catch (e:Exception){
            e.printStackTrace()
        }

    }

    override fun reportSuccess(position: Int?) {

    }

    override fun onNumberComment(numberComment: Int?) {

    }

    override fun onErrorDeletePost(position: Int?) {

    }
    private fun onClickShareListener(content:String){
        mActivity?.onShareLinkFacebook(content)

    }

    fun hideLtRetry(){
        getBinding()?.apply {
            if (ltRetry.clRetryRoot.isVisible) ltRetry.clRetryRoot.visibility = View.GONE
        }
    }

    override fun followUnFollowSuccess(
        follow: ResponseFollow.FollowResponse?,
        entityNew: ListPostUserData?
    ) {

    }

    override fun badReport(entityNew: ListPostUserData?, position: Int?) {

    }

    override fun hidePostSuccess(position: Int?) {

    }

    override fun editPost(entityNew: ListPostUserData?) {

    }

    override fun showDialogConfirmDelete(entityNew: ListPostUserData?) {

    }
    private fun showDialogComment(postId: Int,position: Int) {
        val mapData = HashMap<String, Any>().apply {
            put(ExtraConst.EXTRA_POST_ID,postId)

            put(ExtraConst.EXTRA_POSITION,position)

            put(ExtraConst.EXTRA_IS_NOTIFICATION,false)

        }
        dialogComment = DialogCommentHotNews.getInstance(mapData)
        dialogComment!!.show(childFragmentManager, "DialogCommentHotNews")
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

    fun refreshAndScrollToFirstItem(){
        try {
            numberPage= AppConst.DEFAULT_FIRST_PAGE
            callApiListPostHotNews(numberPage,true)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    private fun onRefreshListener() {
        getBinding()?.refreshLayout?.setOnRefreshListener {
            refreshAndScrollToFirstItem()
            getBinding()?.refreshLayout?.isRefreshing=false
        }
    }

    private fun updateTotalResultWhenRemoveItem(){
        totalLoadMoreResult--
    }

    fun updateUIAfterChangLanguage(){
        adapter.notifyDataSetChanged()
    }
    private fun eventLoadMore(){
        adapter.setLoadMore(object : AdapterHomeHotNews.ILoadMore{
            override fun onLoadMore() {
                try {
                    if (adapter.arrayListNews.size < totalLoadMoreResult) {
                        callApiListPostHotNews(++numberPage,lastestId = lastestId)
                    }
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        })
    }

    private fun getPostUserData(entity: ResponseListPostHotNews.HotNewsData?) : ListPostUserData?{
        return if (entity==null) null
               else ListPostUserData(id = entity.id,content = null,title = entity.title,location_id = entity.location_id,name_locations = null,
                    name_hashtags = null,name_utensils = null,hashtag_id = null,utensil_id = null,like_count = entity.like_count,comment_count = entity.like_count,
                    share_count = entity.share_count,is_deleted = false,created_id = entity.created_id,created_time = entity.created_time,modified_time = entity.modified_time,
                    url_prefix = entity.url_prefix,url_prefix_avatar = entity.url_prefix_avatar,avatar_user = entity.dataAdmin()?.avatar?.get(0),post_likes = entity.hot_news_likes,
                    state_follow = entity.state_follow,user_name_created = entity.dataAdmin()?.name)
    }

    override fun getCurrentFragment(): Int = 0

    override fun finish() {

    }
}