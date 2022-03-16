package brite.outdoor.ui.fragments.my_page

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.R
import brite.outdoor.adapter.AdapterBookMark
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmMyBookMartBinding
import brite.outdoor.ui.dialog.DialogDelete
import brite.outdoor.ui.dialog.DialogFragmentReport
import brite.outdoor.ui.fragments.BaseFragment
import brite.outdoor.ui.fragments.BottomSheetDialogFrHome
import brite.outdoor.ui.fragments.FrmPushPostsNew
import brite.outdoor.utils.setTextSizePX
import brite.outdoor.viewmodel.AuthViewModel
import brite.outdoor.viewmodel.MyBookmarkViewModel
import brite.outdoor.viewmodel.MyPageViewModel
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus

@AndroidEntryPoint
class FrmMyBookMart : BaseFragment<FrmMyBookMartBinding>(),  BottomSheetDialogFrHome.CallBackListener,  DialogFragmentReport.CallBackListener {
    var mAdapterBookMark: AdapterBookMark? = null
    private val authViewModel by activityViewModels<AuthViewModel>()
    private val myBookmarkViewModel by viewModels<MyBookmarkViewModel>()
    private val myPageViewModel by viewModels<MyPageViewModel>({ requireParentFragment() })
    private var positionRemoveItem = 0
    var totalLoadMoreResult: Int = AppConst.DEFAULT_TOTAL_RESULT
    override fun loadControlsAndResize(binding: FrmMyBookMartBinding?) {
        getBinding()?.apply {
            ltRetry.apply {
                tvErrMsg.setTextSizePX(getSizeWithScaleFloat(14.0))
                btnRetry.setOnClickListener {
                    if (parentFragment is FrmMyPage)
                        (parentFragment as FrmMyPage).apply {
                            callApiListMyBookMark()
                            callApiDetailUser()
                        }
                    this.clRetryRoot.visibility = View.GONE
                }
            }
        }
    }

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmMyBookMartBinding {
        return FrmMyBookMartBinding.inflate(inflater, container, false)
    }

    override fun initView(savedInstanceState: Bundle?) {
        prepareList()
        observerListBookMark()
        observerUnBookMark()
        observerHandleAPILoadingAndErr()
        observerSharePost()
        observerDeletePost()
        onRefreshListener()
    }

    fun deleteItemFrmDetailCallBack(position: Int) {
        mAdapterBookMark?.removeItem(position)
        updateTotalResultWhenRemoveItem()
    }
    fun hideItemFrmDetailCallBack(position: Int) {
        mAdapterBookMark?.removeItem(position)
        updateTotalResultWhenRemoveItem()
    }
    fun reportFrmDetailCallBack(position: Int){
        mAdapterBookMark?.removeItem(position)
        updateTotalResultWhenRemoveItem()
    }
    @SuppressLint("SetTextI18n")
    private fun showBottomDialog(entityNew: ListPostUserData?, position: Int) {
        try {
            mActivity?.showBottomSheet(entityNew, this@FrmMyBookMart, position)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
    private fun prepareList() {
        mAdapterBookMark = AdapterBookMark(
            requireContext(),
            myPageViewModel.listMyBookmark,
            object : AdapterBookMark.OnClickItemListener {
                override fun onClickUnBook(
                    entitySavedPost: ResponseListBookMark.ListBookMarkData?,
                    position: Int
                ) {
                    showDialogCancel(entitySavedPost, position)
                }

                override fun onClickItem(
                    entitySavedPost: ResponseListBookMark.ListBookMarkData?,
                    position: Int
                ) {
                    try {
                        entitySavedPost?.let {
                            mActivity?.showDetail(
                                it.id,
                                ListPostUserData(
                                    it.id,
                                    it.title,
                                    it.content,
                                    it.location_id,
                                    it.name_locations,
                                    it.name_utensils,
                                    it.name_hashtags,
                                    it.hashtag_id,
                                    it.utensil_id,
                                    it.like_count,
                                    it.comment_count,
                                    it.share_count,
                                    false,
                                    it.created_id,
                                    null,
                                    it.modified_time,
                                    it.url_prefix,
                                    it.avatar_user,
                                    null,
                                    it.state_follow,
                                    it.url_prefix_avatar,
                                    it.user_name_created,
                                ),
                                position,
                                itemDeleteListener = { position: Int ->
                                    deleteItemFrmDetailCallBack(
                                        position
                                    )
                                }, itemHideListener = {position:Int->hideItemFrmDetailCallBack(position)},
                                itemReportListener = {position:Int->reportFrmDetailCallBack(position)})
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }

                }

                override fun onClickShare(entitySavedPost: ResponseListBookMark.ListBookMarkData?,position: Int) {
                    entitySavedPost?.let {
                        authViewModel.positionPostShareAndLikeNeedNotifyChange(postIdShareAndLikeParam = it.id,positionPostShareAndLikeParam = position,currentFragmentParam = AppConst.FRM_LIST_BOOKMARK )
                    }
                    mActivity?.showDialogShare(entitySavedPost,onClickShareListener = {content:String->onClickShareListener(content)})
                    EventBus.getDefault().post("dialogShare")
                }

                override fun onClickMenu(
                    entitySavedPost: ResponseListBookMark.ListBookMarkData?,
                    position: Int,
                ) {

                   entitySavedPost?.apply {
                       var type = 0
                       type = if (location_id == null){
                           2
                       }else {
                           1
                       }
                       mAdapterBookMark?.updateListFollowUnFollow(shareViewModel.listIdFollow)

                       showBottomDialog(cIndex?.let {
                           ListPostUserData(id, title, content, location_id, name_locations, name_utensils, name_hashtags, hashtag_id, utensil_id, like_count,
                               comment_count,share_count,false, created_id, created_time,modified_time, url_prefix, avatar_user, false, state_follow,
                               url_prefix_avatar, user_name_created,
                               it, type = type, post_shares
                           )
                       }, position)
                   }
                    positionRemoveItem=position
                }

            })

        //
        getBinding()?.rvBookMark?.apply {
            adapter = mAdapterBookMark
            setHasFixedSize(false)
            layoutManager = LinearLayoutManager(mActivity)
            addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {

                    if (!myPageViewModel.isCallingApiGetListMyBookmark && newState == RecyclerView.SCROLL_STATE_IDLE) {
                        val totalItemCount: Int = mAdapterBookMark?.itemCount ?: 0
                        if (totalItemCount < myPageViewModel.totalMyBookmark) {
                            var firstVisibleItem = 0
                            recyclerView.layoutManager?.apply {
                                if (this is LinearLayoutManager) {
                                    firstVisibleItem = this.findFirstVisibleItemPosition()
                                }
                            }
                            val visibleItemCount = recyclerView.childCount
                            val lastInScreen = firstVisibleItem + visibleItemCount
                            if (lastInScreen > 0 && lastInScreen >= totalItemCount) {
                                val nextPage = (myPageViewModel.pageNumberMyBookmark.value ?: 0) + 1
                                myPageViewModel.pageNumberMyBookmark.value = nextPage
                            }
                        }
                    }
                }
            })
        }
    }

    private fun observerHandleAPILoadingAndErr() {
        myBookmarkViewModel.isNeedShowErr.observe(viewLifecycleOwner, {
            when (it.status) {
                ApiResult.Status.ERROR_TOKEN -> {
                    shareViewModel.isNeedShowErr.value = it
                    stopShimmerLayout()
                }
                ApiResult.Status.ERROR, ApiResult.Status.ERROR_NETWORK -> {
                    stopShimmerLayout()
                    shareViewModel.isNeedShowErr.value = it
                    if (myPageViewModel.listMyBookmark.size > 0) {
                        showOrHideLoadingInItem(false)
                    } else {
                        getBinding()?.apply {
                            ltRetry.clRetryRoot.visibility = View.VISIBLE
                            ltRetry.tvErrMsg.text =
                                if (it.status == ApiResult.Status.ERROR_NETWORK) this@FrmMyBookMart.getString(
                                    R.string.no_internet_connection
                                ) else it.message
                        }
                    }
                    myPageViewModel.syncPageNumberMyBookmark()
                }
            }
        })
    }

    private fun showOrHideLoadingInItem(isShown: Boolean) {
        if (myPageViewModel.listMyBookmark.size > 0) {
            myPageViewModel.listMyBookmark.last().isShowLoading = isShown
            mAdapterBookMark?.notifyItemChanged(myPageViewModel.listMyBookmark.lastIndex)
        }
    }

    private fun observerListBookMark() {
        myPageViewModel.listBookMarkResult.observe(viewLifecycleOwner, {
            try {
                if (it.status != ApiResult.Status.CONSUMED) {
                    if (it.status == ApiResult.Status.LOADING) {
                        if (shareViewModel.isNeedRefreshPostDataInMyBookmark.value == true) {
                            mAdapterBookMark?.notifyDataSetChanged()
                        }
                    }
                    myBookmarkViewModel.showOrHideLoading(it)
                    if (it.status == ApiResult.Status.SUCCESS) {
                        getBinding()?.apply {
                            ltRetry.clRetryRoot.visibility = View.GONE
                            stopShimmerLayout()
                        }
                        myPageViewModel.isLoadMoreMyBookMark=false
                        if (it.data?.response is ResponseListBookMark.ListBookMarkResponse)
                            (it.data.response as ResponseListBookMark.ListBookMarkResponse).let { response ->
                                myPageViewModel.syncPageNumberMyBookmark()
                                response.total?.apply {
                                    try {
                                        myPageViewModel.totalMyBookmark = this.toInt()
                                        totalLoadMoreResult = this
                                    } catch (e: Exception) {
                                        e.printStackTrace()
                                    }
                                }

                                mAdapterBookMark?.let { adapter ->
                                    response.getListData()?.let { list ->
                                        shareViewModel.isNeedRefreshPostDataInMyBookmark.value = false
                                        val startRange = if (myPageViewModel.listMyBookmark.size == 0) 0 else (myPageViewModel.listMyBookmark.size)
                                        showOrHideLoadingInItem(false)
                                        val itemInsertCount = list.size
                                        myPageViewModel.listMyBookmark.addAll(list)
                                        adapter.notifyItemRangeInserted(
                                            startRange,
                                            itemInsertCount
                                        )

                                    }
                                }
                                if (response.getListData()?.size?:0 > 0){
                                    myPageViewModel.lastestIdBookmark = response.getListData()?.last()?.id.toString()
                                }
                            }

                        myBookmarkViewModel.isShowLoading.value = false
                    }
                }
                it.status = ApiResult.Status.CONSUMED
            } catch (e: Exception) {
                e.printStackTrace()
            }
        })
    }

    private fun callApiUnBookMark(entitySavedPost: ResponseListBookMark.ListBookMarkData?) {
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            entitySavedPost?.let {
                requestParam[ApiConst.PARAM_API_POST_ID] =
                    entitySavedPost.id.toString()
            }
            myBookmarkViewModel.requestBookMart(requestParam)
        } catch (e: Exception) {
        }
    }

    private fun observerUnBookMark() {
        myBookmarkViewModel.bookMartResult.observe(viewLifecycleOwner, {
            try {
                if (it.status != ApiResult.Status.CONSUMED) {
                    shareViewModel.showOrHideLoading(it)
                    if (it.status == ApiResult.Status.SUCCESS) {
                        if (it.data?.response !is Boolean) {
                            myPageViewModel.itemPosition.value?.let { it1 ->
                                mAdapterBookMark?.removeItem(
                                    it1
                                )
                                updateTotalResultWhenRemoveItem()
                            }
                        }
                    }
                }
                it.status = ApiResult.Status.CONSUMED
            } catch (e: Exception) {
            }
        })
    }
    private fun observerSharePost(){
        authViewModel.postShareResult.value?.status=ApiResult.Status.CONSUMED
        authViewModel.postShareResult.observe(viewLifecycleOwner,{
            try {
                when(it.status){
                    ApiResult.Status.SUCCESS->{
                        if (it.data?.response is ResponseShares.ShareResponse){
                            (it.data.response as ResponseShares.ShareResponse).let {
                                mAdapterBookMark?.apply {
                                    mAdapterBookMark?.apply {
                                        val position =  listBookmark.withIndex().filter { (_, value)->
                                            value.id==it.post_id
                                        }.map { (i, _)->i }.single()
                                        listBookmark[position].post_shares=true
                                        notifyItemChanged(position)
                                    }
                                }


                            }
                        }
                        mActivity?.showDialogNotify(resources.getString(R.string.str_sharefb_success))
                    }
                    ApiResult.Status.ERROR_DELETE_POST->{
                        if (authViewModel.currentFragmentPostShareAndLike == AppConst.FRM_LIST_BOOKMARK){
                            mAdapterBookMark?.removeItem(authViewModel.positionPostShareAndLike)
                            updateTotalResultWhenRemoveItem()
                            mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),null)
                        }else{
                            mAdapterBookMark?.apply {
                                val position =  listBookmark.withIndex().filter { (_, value)->
                                    value.id==authViewModel.postIdShareAndLike
                                }.map { (i, _)->i }.singleOrNull()
                                position?.let {
                                    removeItem(position)
                                    updateTotalResultWhenRemoveItem()
                                }
                            }
                        }

                    }
                    ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN->shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status, it.message)
                    ApiResult.Status.ERROR_NETWORK->shareViewModel.isNeedShowErr.value == ApiNoticeEntity(it.status,null)

                }
            }catch (e:Exception){
                e.printStackTrace()
            }
        })
    }
    private fun onClickShareListener(content:String){
        mActivity?.onShareLinkFacebook(content)
    }

    private fun showDialogCancel(
        entitySavedPost: ResponseListBookMark.ListBookMarkData?,
        position: Int
    ) {
        AlertDialog.Builder(mActivity!!).apply {
            myPageViewModel.itemPosition.value = position
            callApiUnBookMark(entitySavedPost)

        }
    }
    override fun getCurrentFragment(): Int {
        return 0
    }

    override fun finish() {

    }
    fun startShimmerLayout(){
        getBinding()?.apply {
            shimmerFrameLayout.visibility = View.VISIBLE
            shimmerFrameLayout.startShimmer()
            rvBookMark.visibility = View.GONE
            if (ltRetry.clRetryRoot.isShown) ltRetry.clRetryRoot.visibility = View.GONE
        }

    }
    fun stopShimmerLayout(){
        getBinding()?.apply {
            shimmerFrameLayout.visibility = View.GONE
            rvBookMark.visibility = View.VISIBLE
        }
    }

    override fun followUnFollowSuccess(
        follow: ResponseFollow.FollowResponse?,
        entityNew: ListPostUserData?,
    ) {
        follow?.follows?.let { it1 ->
            entityNew?.created_id?.let { id ->

                for (i in 0 until mAdapterBookMark?.listBookmark?.size!!){
                    if (mAdapterBookMark?.listBookmark?.get(i)?.id == entityNew.id){
                        if (it1)
                        mAdapterBookMark?.listBookmark?.get(i)?.state_follow = ListPostUserResponse.STATE_FOLLOW
                        else mAdapterBookMark?.listBookmark?.get(i)?.state_follow = ListPostUserResponse.STATE_UNFOLLOW

                        mAdapterBookMark?.notifyItemChanged(i)
                    }

                }
                val requestFollowUnFollow = HashMap<Int, Int>()
                if (it1){
                    requestFollowUnFollow[id] = ListPostUserResponse.STATE_FOLLOW
                }
                else{
                    requestFollowUnFollow[id] = ListPostUserResponse.STATE_UNFOLLOW
                }
                shareViewModel.listIdFollow.putAll(requestFollowUnFollow)
            }
        }
    }

    override fun badReport(entityNew: ListPostUserData?, position: Int?) {
        mActivity?.showDialogReport(entityNew, this@FrmMyBookMart, position)
    }

    override fun hidePostSuccess(position: Int?) {
        position?.let {
            mAdapterBookMark?.removeItem(it)
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
                myBookmarkViewModel.requestDeletePost(it,entityNew?.id.toString())
            }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    override fun reportSuccess(position: Int?) {
        mActivity?.bottomSheet?.dismiss()
        if (position !=-1){ // report succes
            position?.let {
                mAdapterBookMark?.removeItem(position)
                updateTotalResultWhenRemoveItem()
            }
        }
    }
    private fun observerDeletePost(){
        myBookmarkViewModel.deletePostResult.observe(viewLifecycleOwner, {
            try {
                shareViewModel.showOrHideLoading(it)
                if (it.status == ApiResult.Status.SUCCESS) {
                    it?.data?.message?.let {
                        mActivity?.showDialogSuccess(it)
                    }
                    mAdapterBookMark?.removeItem(positionRemoveItem)

                    updateTotalResultWhenRemoveItem()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        })
    }
    private fun onRefreshListener() {
        getBinding()?.refreshLayout?.setOnRefreshListener {
            onRefresherData()
            getBinding()?.refreshLayout?.isRefreshing=false
        }

    }
    private fun onRefresherData(){
        if (parentFragment is FrmMyPage){
            (parentFragment as FrmMyPage).apply {
                callApiListMyBookMark(true)
                shareViewModel.isNeedRefreshPostDataInMyBookmark.value=true
                myPageViewModel.isLoadMoreMyBookMark=false
            }
        }
    }
    fun onRefresherDataScrollToFirst(){
        try {
            getBinding()?.rvBookMark?.scrollToPosition(0)
        }catch (e:Exception){
            e.printStackTrace()
        }

    }
    private fun updateTotalResultWhenRemoveItem(){
        totalLoadMoreResult--
        myPageViewModel.totalMyBookmark--
    }
    fun updateUIAfterChangLanguage(){
        mAdapterBookMark?.notifyDataSetChanged()
    }
}
