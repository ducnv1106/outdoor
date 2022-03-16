package brite.outdoor.ui.fragments.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import brite.outdoor.R
import brite.outdoor.adapter.AdapterHome
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmHomeNewsBinding
import brite.outdoor.ui.dialog.*
import brite.outdoor.ui.fragments.BaseFragment
import brite.outdoor.ui.fragments.BottomSheetDialogFrHome
import brite.outdoor.ui.fragments.FrmPushPostsNew
import brite.outdoor.utils.setSingleClick
import brite.outdoor.utils.setTextSizePX
import brite.outdoor.viewmodel.AuthViewModel
import brite.outdoor.viewmodel.MyPostViewModel
import brite.outdoor.viewmodel.NewViewModel
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus


@AndroidEntryPoint
class FrmNew : BaseFragment<FrmHomeNewsBinding>(),DialogFragmentReport.CallBackListener, DialogComment.OnChangeNumberComment,
    BottomSheetDialogFrHome.CallBackListener {
    private val newViewModel by viewModels<NewViewModel>()
    var adapter: AdapterHome? = null
    private val myPostViewModel by viewModels<MyPostViewModel>()
    private val authViewModel by activityViewModels<AuthViewModel>()
    var numberPage : Int = AppConst.DEFAULT_FIRST_PAGE
    var totalLoadMoreResult : Int = AppConst.DEFAULT_TOTAL_RESULT
    private var dialogComment: DialogComment? = null
    private var postId : Int? = null
    private var lastestId:String = ""
    private var positionRemoveItem = 0
    override fun loadControlsAndResize(binding: FrmHomeNewsBinding?) {
        getBinding()?.apply {
            ltRetry.apply {
                tvErrMsg.setTextSizePX(getSizeWithScaleFloat(14.0))
                btnRetry.setSingleClick {
                    shimmerFrameLayout.startShimmer()
                    shimmerFrameLayout.visibility = View.VISIBLE
                    callApiListPostNew(AppConst.DEFAULT_FIRST_PAGE)
                    ltRetry.clRetryRoot.visibility=View.GONE
                }
            }
        }
    }


    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmHomeNewsBinding {
        return FrmHomeNewsBinding.inflate(inflater, container, false)
    }

    override fun initView(savedInstanceState: Bundle?) {
        initAdapter()
        getBinding()?.rcView?.adapter = adapter
        callApiListPostNew(numberPage)
        observerListPostNew()
        eventLoadMore()
        observerLikeUser()
        observerHandleAPILoadingAndErr()
        observerDeletePost()
        onRefreshListener()
        getBinding()?.apply {
            shimmerFrameLayout.startShimmer()
        }
        observerSharePost()
        observerComment()
    }


    private fun initAdapter() {
        try {
            if (adapter == null) adapter = AdapterHome(requireContext(), object : AdapterHome.OnClickItemListener {
                override fun onClickMenu(entityNew: ListPostUserData?,position:Int) {
                    showBottomDialog(entityNew,position)
                    positionRemoveItem = position
                }

                override fun onClickItem(entityNew: ListPostUserData?,position: Int) {
                    entityNew?.let {
                        adapter?.updateListFollowUnFollow(shareViewModel.listIdFollow)
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
                    authViewModel.positionPostShareAndLikeNeedNotifyChange(postIdShareAndLikeParam = entityNew?.id,positionPostShareAndLikeParam = position,currentFragmentParam = AppConst.FRM_NEWS)
                    mActivity?.callApiLike(entityNew?.id)
                }

                override fun onClickComment(entityNew: ListPostUserData?,position: Int) {
                    postId = entityNew?.id
                entityNew?.id?.let { showDialogComment(it,position) }
                }

                override fun onClickShare(entityNew: ListPostUserData?,position: Int) {
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
                                        adapter?.apply {
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
                            if (authViewModel.currentFragmentPostShareAndLike==AppConst.FRM_NEWS){
                                adapter?.removeItem(authViewModel.positionPostShareAndLike)
                                updateTotalResultWhenRemoveItem()
                                mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),null)
                            }else{
                                adapter?.apply {
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
                            if (authViewModel.currentFragmentPostShareAndLike == AppConst.FRM_NEWS){
                                adapter?.removeItem(authViewModel.positionPostShareAndLike)
                                updateTotalResultWhenRemoveItem()
                                mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),null)
                            }else{
                                adapter?.apply {
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
    private fun observerComment(){
        authViewModel.syncComment.observe(viewLifecycleOwner,{
            adapter?.apply {
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
    private fun showDialogComment(postId: Int,position: Int) {
        dialogComment = DialogComment()
        mActivity?.dialogComment= dialogComment
        dialogComment!!.show(childFragmentManager, "DialogComment")
        dialogComment?.apply {
            mActivity?.getAvatarId()?.let { setData(it, mActivity, postId, shareViewModel, this@FrmNew,position = position) }

    }
    }
    fun callApiListPostNew(page:Int,isRefresher:Boolean=false,lastestId:String="") {
        try {
            /**
                 CallAPi when data.size=0 , isRefresher = true and loadMore (numberPage !=1)
             */
            if (adapter?.arrayListNews?.size!!>0 && page==AppConst.DEFAULT_FIRST_PAGE && !isRefresher) return

            getBinding()?.apply {
                shimmerFrameLayout.visibility = View.VISIBLE
                shimmerFrameLayout.startShimmer()
                rcView.visibility = View.GONE
            }
            val requestParam = mActivity!!.getRequestParamWithToken()
            newViewModel.requestListPostNew(requestParam)
//            requestParam[ApiConst.PARAM_API_PAGE]= page.toString()
            requestParam[ApiConst.PARAM_API_LASTEST_ID]=lastestId
            requestParam[ApiConst.PARAM_API_LIMIT] = AppConst.DEFAULT_ITEM_PER_PAGE.toString()

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun observerListPostNew() {
        newViewModel.listPostNewResult.observe(viewLifecycleOwner, {
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

                            if (it.data?.response is ListPostUserResponse) {
                                (it.data.response as ListPostUserResponse).let { response ->
                                    adapter?.let { adapter ->
                                        response.getListData()?.let { it1 ->
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
                                    response.getListData()?.let {  it1->
                                        if (it1.size>0) lastestId = it1.last().id.toString()
                                    }
                                }
                            }
                            myPostViewModel.isShowLoading.value = false
                        } else if (it.status==ApiResult.Status.ERROR_NETWORK) adapter?.setLoaded()
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
                        if (adapter?.arrayListNews?.size == 0){
                            ltRetry.clRetryRoot.visibility = View.VISIBLE
                            ltRetry.tvErrMsg.text =
                                    if (it.status == ApiResult.Status.ERROR_NETWORK) this@FrmNew.getString(
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
            }
        })

    }

    @SuppressLint("SetTextI18n")
    private fun showBottomDialog(entityNew: ListPostUserData?,position:Int) {
        adapter?.updateListFollowUnFollow(shareViewModel.listIdFollow)
        try {
           mActivity?.showBottomSheet(entityNew,this@FrmNew,position)
        }catch (e:Exception){
            e.printStackTrace()
        }

    }
    private fun eventLoadMore(){
        adapter?.setLoadMore(object : AdapterHome.ILoadMore{
            override fun onLoadMore() {
                try {
                    if (adapter?.arrayListNews?.size ?:0 < totalLoadMoreResult) {
                        callApiListPostNew(++numberPage,lastestId = lastestId)
                    }
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        })
    }

    override fun onDestroyView() {
        newViewModel.consumed.value=true
        super.onDestroyView()
    }

    override fun reportSuccess(position: Int?) {
        mActivity?.bottomSheet?.dismiss()
        if (position!=-1){ // report success
            position?.let {
                adapter?.removeItem(position)
                updateTotalResultWhenRemoveItem()
            }
        }
    }

    override fun followUnFollowSuccess(follow: ResponseFollow.FollowResponse?,entityNew: ListPostUserData?) {
        follow?.follows?.let { it1 ->
            entityNew?.created_id?.let { id ->
                val requestFollowUnFollow = HashMap<Int,Int>()
                if (it1)   requestFollowUnFollow[id]= ListPostUserResponse.STATE_FOLLOW
                else requestFollowUnFollow[id]= ListPostUserResponse.STATE_UNFOLLOW
                adapter?.updateListFollowUnFollow(requestFollowUnFollow)
                shareViewModel.listIdFollow.putAll(requestFollowUnFollow)
            }
        }
    }

    override fun badReport(entityNew: ListPostUserData?,position: Int?) {
        mActivity?.showDialogReport(entityNew,this@FrmNew,position)

    }

    override fun hidePostSuccess(position: Int?) {
        position?.let {
            adapter?.removeItem(it)
            updateTotalResultWhenRemoveItem()
        }
        mActivity?.bottomSheet?.dismiss()
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
                newViewModel.requestDeletePost(it,entityNew?.id.toString())
            }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    private fun observerDeletePost(){
        try {
            newViewModel.deletePostResult.observe(viewLifecycleOwner,{
                if (it.status!= ApiResult.Status.CONSUMED){
                    shareViewModel.showOrHideLoading(it)
                    if (it.status==ApiResult.Status.SUCCESS){
                        it?.data?.message?.let {
                            mActivity?.showDialogSuccess(it)
                        }
                        adapter?.removeItem(positionRemoveItem)
                        updateTotalResultWhenRemoveItem()
                    }
                }
                it.status= ApiResult.Status.CONSUMED
            })
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    fun deleteItemFrmDetailCallBack(position: Int){
        adapter?.removeItem(position)
        updateTotalResultWhenRemoveItem()
    }
    fun hideItemFrmDetailCallBack(position: Int){
        adapter?.removeItem(position)
        updateTotalResultWhenRemoveItem()
    }
    fun reportFrmDetailCallBack(position: Int){
        adapter?.removeItem(position)
        updateTotalResultWhenRemoveItem()
    }
    fun refreshAndScrollToFirstItem(){
        try {
            numberPage= AppConst.DEFAULT_FIRST_PAGE
            callApiListPostNew(numberPage,true)
        }catch (e:Exception){
            e.printStackTrace()
        }

//        adapter?.recyclerView.scrollToPosition(0)
    }

    override fun onNumberComment(numberComment: Int?) {}

    override fun onErrorDeletePost(position: Int?) {
        position?.let {
            adapter?.removeItem(position)
            updateTotalResultWhenRemoveItem()

        }
    }

    private fun onClickShareListener(content:String){
       mActivity?.onShareLinkFacebook(content)

    }
    fun hideLtRetry(){
        getBinding()?.apply {
            if (ltRetry.clRetryRoot.isVisible) ltRetry.clRetryRoot.visibility = View.GONE
        }
    }

    override fun getCurrentFragment(): Int {
        return 0
    }

    override fun finish() {

    }
    private fun updateTotalResultWhenRemoveItem(){
        totalLoadMoreResult--
    }
    fun updateUIAfterChangLanguage(){
        adapter?.notifyDataSetChanged()
    }
    private fun onRefreshListener() {
        getBinding()?.refreshLayout?.setOnRefreshListener {
            refreshAndScrollToFirstItem()
            getBinding()?.refreshLayout?.isRefreshing=false
        }
    }

}