package brite.outdoor.ui.fragments

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import brite.outdoor.R
import brite.outdoor.adapter.AdapterContentDetail
import brite.outdoor.constants.ApiConst.Companion.PARAM_API_POST_ID
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.AppConst.Companion.FRM_POST_DETAIL
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_BACK_STACK
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_COMMENT_ID
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_ENTITY
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_IS_NOTIFICATION
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_POSITION
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_POST_ID
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_THREAD_ID
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.entities.BackStackData
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.data.entities.PostContentEntity
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmDetailBinding
import brite.outdoor.ui.activities.MediaActivity
import brite.outdoor.ui.dialog.*
import brite.outdoor.utils.*
import brite.outdoor.viewmodel.AuthViewModel
import brite.outdoor.viewmodel.DetailViewModel
import brite.outdoor.viewmodel.LikeViewModel
import brite.outdoor.viewmodel.MyPostViewModel
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.set


@AndroidEntryPoint
class FrmDetail(
    val itemDeleteListener: (Int) -> Unit = { _: Int -> },
    val itemHideListener: (Int) -> Unit = { _: Int -> },
    val itemReportListener:(Int)->Unit={_:Int->}
) : BaseFragment<FrmDetailBinding>(),
    View.OnClickListener,
    DialogComment.OnChangeNumberComment,
    BottomSheetDialogFrHome.CallBackListener,
    DialogFragmentReport.CallBackListener {
    private val detailViewModel by viewModels<DetailViewModel>()
    private val myPostViewModel by viewModels<MyPostViewModel>()
    private var mAdapter: AdapterContentDetail? = null
    private var dialogComment: DialogComment? = null
    private val likeViewModel by viewModels<LikeViewModel>()
    private val authViewModel by activityViewModels<AuthViewModel>()
    private var postId: Int = 0
    private var entity: ListPostUserData? = null
    private var position: Int? = null
    private var commentId : Int? =null
    private var threadId : Int?=null
    private var detailResponse : ResponseDetailPost.DataDetail?=null

    companion object {
        fun getInstance(
            arrayList: ArrayList<BackStackData>?,
            mapData: HashMap<String, Any>?,
            itemDeleteListener: (Int) -> Unit,
            itemHideListener: (Int) -> Unit,
            itemReportListener: (Int) -> Unit
        ): FrmDetail {
            val fragment = FrmDetail(itemDeleteListener, itemHideListener,itemReportListener)
            val data = Bundle()
            if (mapData != null) {
                if (mapData.containsKey(EXTRA_POST_ID))
                    data.putInt(
                        EXTRA_POST_ID, mapData[EXTRA_POST_ID] as Int
                    )

                if (mapData.containsKey(EXTRA_ENTITY))
                    data.putParcelable(EXTRA_ENTITY, mapData[EXTRA_ENTITY] as ListPostUserData)

                if (mapData.containsKey(EXTRA_POSITION))
                    data.putInt(EXTRA_POSITION, mapData[EXTRA_POSITION] as Int)

                if (mapData.containsKey(EXTRA_IS_NOTIFICATION)){
                    data.putBoolean(EXTRA_IS_NOTIFICATION,mapData[EXTRA_IS_NOTIFICATION] as Boolean)
                }
                if (mapData.containsKey(EXTRA_COMMENT_ID)){
                    data.putInt(EXTRA_COMMENT_ID,mapData[EXTRA_COMMENT_ID] as Int)
                }
                if (mapData.containsKey(EXTRA_THREAD_ID)){
                    data.putInt(EXTRA_THREAD_ID,mapData[EXTRA_THREAD_ID] as Int)
                }
            }
            if (arrayList != null) data.putSerializable(EXTRA_BACK_STACK, arrayList)
            fragment.arguments = data
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.apply {
            postId = getInt(EXTRA_POST_ID)
            entity = getParcelable(EXTRA_ENTITY)
            position = getInt(EXTRA_POSITION)
            detailViewModel.isNotification = getBoolean(EXTRA_IS_NOTIFICATION)
            commentId = getInt(EXTRA_COMMENT_ID)
            threadId = getInt(EXTRA_THREAD_ID)
        }
    }

    override fun loadControlsAndResize(binding: FrmDetailBinding?) {
        binding?.apply {
            imgTopDetail.resizeLayout(getSizeWithScale(375.0), getSizeWithScale(301.0))
            clBottom.resizeHeight(getSizeWithScale(112.0))
            btnBack.resizeLayout(getSizeWithScale(36.0), getSizeWithScale(60.0))
            btnMenu.resizeLayout(getSizeWithScale(33.0), getSizeWithScale(36.0))
            clHeader.resizeHeight(getSizeWithScale(56.0))
            imgPin.resizeLayout(getSizeWithScale(39.0), getSizeWithScale(39.0))
            imgSetPlan.resizeLayout(getSizeWithScale(30.0), getSizeWithScale(30.0))
            tvViewBlank.resizeHeight(getSizeWithScale(122.0))

            btnComment.setOnClickListener(this@FrmDetail)
            btnBack.setOnClickListener(this@FrmDetail)
            btnLike.setOnClickListener(this@FrmDetail)
            btnShare.setOnClickListener(this@FrmDetail)
            imgPin.setOnClickListener(this@FrmDetail)
            imgSetPlan.setOnClickListener(this@FrmDetail)
            tvPostedBy.setOnClickListener(this@FrmDetail)
            btnMenu.setOnClickListener(this@FrmDetail)
        }
    }

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmDetailBinding {
        return FrmDetailBinding.inflate(inflater, container, false)
    }

    override fun initView(savedInstanceState: Bundle?) {
        getBinding()?.apply {
            setupContent(this)
        }
        detailViewModel.idPost.value = postId
        observerBookMart()
        callApiDetailPost()
        observerDetailPost()
        observerLikeUser()
        observerDeletePost()
        observerSharePost()
        observerChangeLanguage()

    }

    private fun setViewInteractive() {
        try {
            getBinding()?.apply {
                btnLike.setText(resources.getString(R.string.str_frm_detail_like))
                imgSetPlan.setImageResource(R.drawable.icon_set_plan)
                detailViewModel.entityNews.observe(viewLifecycleOwner, {
                    if (it.post_likes == true) {
                        btnLike.setIconAndSize(
                            R.drawable.ic_liked,
                            getSizeWithScale(22.48),
                            getSizeWithScale(20.01)
                        )
                        btnLike.setColorText(R.color.colorMain)
                    } else {
                        btnLike.setIconAndSize(
                            R.drawable.ic_like,
                            getSizeWithScale(22.48),
                            getSizeWithScale(20.01)
                        )
                        btnLike.setColorText(R.color.black)
                    }

                    btnComment.setText(resources.getString(R.string.str_frm_detail_comment))
                    btnComment.setIconAndSize(
                        R.drawable.ic_comment,
                        getSizeWithScale(20.0),
                        getSizeWithScale(20.0)
                    )

                    btnShare.setText(resources.getString(R.string.str_frm_detail_share))
                    btnShare.setIconAndSize(
                        R.drawable.ic_share,
                        getSizeWithScale(20.5),
                        getSizeWithScale(20.5)
                    )
                    btnShare.setColorText(R.color.black)

                    if (it.bookmarks == true) {
                        imgPin.setImageResource(R.drawable.ic_pin)
                    } else imgPin.setImageResource(R.drawable.ic_un_book)
                })

            }
        } catch (e: Exception) {
        }
    }

    private fun setupContent(frmDetailBinding: FrmDetailBinding) {
        try {
            frmDetailBinding.apply {
                mAdapter = AdapterContentDetail(
                    mActivity!!,
                    getSizeWithScale(46.0),
                    getSizeWithScaleFloat(14.0),
                    object : AdapterContentDetail.OnClickImageListener {
                        override fun onClick(entityNew: PostContentEntity?,position: Int) {
                            entityNew?.listImg?.value?.let { showPopupImages(it,position) }
                        }

                    })
                rcDetail.apply {
                    layoutManager =
                        LinearLayoutManager(mActivity!!, LinearLayoutManager.VERTICAL, false)
                    adapter = mAdapter
                }
            }
        } catch (e: Exception) {
        }
    }
    private fun showPopupImages(list: ArrayList<ImagePicker>,position: Int) {
        try {
            val intent = Intent(requireContext(),MediaActivity::class.java)
            val bundel = Bundle()
            bundel.putParcelableArrayList("data",list)
            bundel.putInt("indexImagePicker",position)
            intent.putExtras(bundel)
            startActivity(intent)
        } catch (e: Exception) {
        }

    }


    override fun onClick(v: View?) {
        try {
            if (!isClickAble()) return
            when (v?.id) {
                R.id.btnBack -> backToPrevious()
                R.id.btnComment -> {
                    showDialogComment(position = position)
                }
                R.id.btnLike ->{
                    authViewModel.positionPostShareAndLikeNeedNotifyChange(postIdShareAndLikeParam = postId,currentFragmentParam = AppConst.FRM_POST_DETAIL)
                    mActivity?.callApiLike(postId)
                }
                R.id.btnShare ->{ entity?.id?.let {
                    authViewModel.positionPostShareAndLikeNeedNotifyChange(postIdShareAndLikeParam = it,currentFragmentParam = FRM_POST_DETAIL)
                    mActivity?.showDialogShare(
                        detailViewModel.entityNews.value,
                        onClickShareListener = { content: String -> onClickShareListener(content) },
                        mActivity?.getUrlPrefixAvatar())

                     }
                }
                R.id.imgPin -> callApiBookMart()
                R.id.tvPostedBy->{
                     detailViewModel.entityNews.value?.created_id?.let {
                        mActivity?.showPersonalPageOrMyPage(it)
                     }
                }
                R.id.btnMenu->{
                    position?.let {
                        showBottomDialog(entity, it)
                    }
                }
                R.id.imgSetPlan ->{
                    goToFrmReminder()
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun showDialogComment(isNotification : Boolean=false,comment:Int?=null,position: Int?=null) {
        dialogComment = DialogComment()
        mActivity?.dialogComment= dialogComment
        dialogComment!!.show(childFragmentManager, "DialogComment")
        dialogComment?.apply {
            mActivity?.getAvatarId()
                ?.let {
                    if (isNotification) setData(it, mActivity, postId, shareViewModel, this@FrmDetail,isNotification,comment?:0,position=position,threadId = threadId)
                    else setData(it,mActivity,postId,shareViewModel,this@FrmDetail)
                }
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
                                        detailViewModel.entityNews.observe(viewLifecycleOwner,
                                            { response ->
                                                if (response.id == it.post_id) {
                                                    response.post_likes = it.liked
                                                    response.like_count = it.like_count
                                                }
                                            })
                                    }
                                }
                            }
                        }
                        ApiResult.Status.ERROR_DELETE_POST->{
                            if (authViewModel.currentFragmentPostShareAndLike==AppConst.FRM_POST_DETAIL){
                                 val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
                                position?.let {
                                    itemDeleteListener(it)
                                }
                                finish()
                            }
                                mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                            }

                        }
                        ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                            shareViewModel.isNeedShowErr.value=ApiNoticeEntity(it.status, it.message)
                        }
                    }
                    detailViewModel.entityNews.observe(viewLifecycleOwner, {
                        try {
                            getBinding()?.apply {
                                setViewInteractive()
                                tvTitle.apply {
                                    text = it.title
                                    setShowingLine(3)
                                    setShowLessTextColor(Color.RED)
                                    setShowMoreTextColor(Color.BLUE)
                                    addShowLessText(resources.getString(R.string.lbCollapse))
                                    addShowMoreText(resources.getString(R.string.lblSeeMore))
                                }
                                tvDate.text = getDate(it.created_time)
                                tvLikes.text =
                                    convertLikeCommentShare(it.like_count) + " " + resources.getString(
                                        R.string.str_like_count
                                    )
                                tvPostedBy.text = it.user_name_created
                                if (it.getListContent()?.get(0)?.listImg?.size!! > 0) {
                                    imgTopDetail.loadImageWithCustomCorners(
                                        urlImage(it.getListContent()?.get(0)?.listImg?.get(0), it.url_prefix), 1
                                    )
                                }
                            }
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }

                    })
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
    @SuppressLint("SetTextI18n")
    private fun observerSharePost(){
        authViewModel.postShareResult.value?.status=ApiResult.Status.CONSUMED
        authViewModel.postShareResult.observe(viewLifecycleOwner,{
            try {
                when(it.status){
                    ApiResult.Status.SUCCESS->{
                        if (it.data?.response is ResponseShares.ShareResponse){
                            (it.data.response as ResponseShares.ShareResponse).let {
                                detailViewModel.entityNews.value?.post_shares=true
                                setViewInteractive()
                                getBinding()?.tvShare?.text = convertLikeCommentShare(it.share_count) + " " + resources.getString(R.string.str_share_count)

                            }
                        }
                        mActivity?.showDialogNotify(resources.getString(R.string.str_sharefb_success))
                    }
                    ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN->shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status, it.message)
                    ApiResult.Status.ERROR_NETWORK->shareViewModel.isNeedShowErr.value == ApiNoticeEntity(it.status,null)
                    ApiResult.Status.ERROR_DELETE_POST->{
                        if (authViewModel.currentFragmentPostShareAndLike==AppConst.FRM_POST_DETAIL){
                            val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
                                position?.let {
                                    itemDeleteListener(it)
                                }
                                finish()
                            }
                            mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                        }
                    }

                }
            }catch (e:Exception){
                e.printStackTrace()
            }

        })
    }

    private fun callApiBookMart() {
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()

            detailViewModel.entityNews.value?.let {
                requestParam[PARAM_API_POST_ID] = it.id.toString()
            }

            detailViewModel.requestBookMart(requestParam)
        } catch (e: Exception) {
        }
    }

    private fun observerBookMart() {
        try {
            detailViewModel.bookMartResult.observe(viewLifecycleOwner, {
                try {
                    shareViewModel.showOrHideLoading(it)
                    if (it.status == ApiResult.Status.SUCCESS) {
                        if (it.data?.response is ResponseBookMart.BookMartResponse) {
                            (it.data.response as ResponseBookMart.BookMartResponse).let {
                                detailViewModel.entityNews.observe(viewLifecycleOwner, { response ->
                                    if (response.id == it.post_id) {
                                        response.bookmarks = it.bookMark
                                        if (response.bookmarks == true) {
                                            getBinding()?.imgPin?.setImageResource(R.drawable.ic_pin)
                                        } else getBinding()?.imgPin?.setImageResource(R.drawable.ic_un_book)
                                    }
                                })
                            }
                        }
                    }else if(it.status==ApiResult.Status.ERROR_DELETE_POST) {
                        val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
                            position?.let { itemDeleteListener(it) }
                            finish()

                        }
                        mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
        }
    }


    private fun callApiDetailPost() {
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            detailViewModel.apply {
                this.idPost.observe(viewLifecycleOwner, {
                    try {
                        detailViewModel.requestDetailPost(requestParam, it.toString())
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }

                })
            }
        } catch (e: Exception) {
        }

    }

    @SuppressLint("SetTextI18n")
    private fun observerDetailPost() {
        detailViewModel.detailPostResult.observe(viewLifecycleOwner, {
            try {
                if (it.status!=ApiResult.Status.CONSUMED){
                    myPostViewModel.showOrHideLoading(it)
                    if (it.status == ApiResult.Status.SUCCESS) {
                        setViewInteractive()
                        if (it.data?.response !is Boolean) {
                            (it.data?.response as ResponseDetailPost.DetailPostResponse).let { response ->
                                postId = response.data?.id ?: 0
                                detailViewModel.entityNews.value = response.data
                                if (entity==null){
                                    response.data?.let {
                                        entity = ListPostUserData(
                                            it.id?:0,
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
                                            null,
                                            it.user_name_created,
                                            address_locations = it.address_locations
                                        )
                                    }

                                }
                                var index=0
                                for (i in 1 until detailViewModel.entityNews.value?.getListContent()?.size!!) {
                                    val imgPicker: MutableLiveData<ArrayList<ImagePicker>> =MutableLiveData(ArrayList())
                                    for (j in 0 until detailViewModel.entityNews.value?.getListContent()?.get(i)?.listImg?.size!!) {
                                        val url = "${detailViewModel.entityNews.value?.url_prefix}${
                                            detailViewModel.entityNews.value?.getListContent()
                                                ?.get(i)?.listImg!![j]
                                        }"
                                        index++
                                        imgPicker.value?.add(
                                            ImagePicker(
                                                url,isVideo = AppUtils.isVideo(url),id = index,thumbnail = AppUtils.getPathUrlThumbnail(url)
                                            )
                                        )
                                    }
                                    detailViewModel.listContent.observe(viewLifecycleOwner, { list ->
                                        try {
                                            var index = i
                                            list.add(
                                                PostContentEntity((++index),
                                                    detailViewModel.entityNews.value?.getListContent()
                                                        ?.get(i)?.content!!, imgPicker
                                                )
                                            )
                                        } catch (e: Exception) {
                                            e.printStackTrace()
                                        }
                                    })
                                }
                                detailViewModel.listContent.observe(viewLifecycleOwner, Observer {
                                    mAdapter?.apply {
                                        updateList(it)

                                    }
                                })

                                if (detailViewModel.isNotification){
                                    showDialogComment(true,commentId)
                                }
                            }
                        }
                    }
                    myPostViewModel.isNeedShowErr.observe(viewLifecycleOwner, {
                        if (it.status!=ApiResult.Status.CONSUMED){
                            when(it.status){
                                ApiResult.Status.ERROR_DELETE_POST->{
                                    position?.let { itemDeleteListener(it) }
                                    val dismissListener:    DialogInterface.OnDismissListener = DialogInterface.OnDismissListener { finish() }
                                    mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                                    it.status=ApiResult.Status.CONSUMED
                                }
                                ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                                    shareViewModel.isNeedShowErr.value=it

                                }
                          }
                        }
                    })
                    //show loading
                    myPostViewModel.isShowLoading.observe(viewLifecycleOwner,{
                        shareViewModel.isShowLoading.value = it
                    })
                }

            } catch (e: Exception) {
            }
        })
        detailViewModel.entityNews.observe(viewLifecycleOwner, {
            try {
                getBinding()?.apply {
                    tvTitle.apply {
                        text = it.title
                        setShowingLine(3)
                        setShowLessTextColor(Color.RED)
                        setShowMoreTextColor(Color.BLUE)
                        addShowLessText(resources.getString(R.string.lbCollapse))
                        addShowMoreText(resources.getString(R.string.lblSeeMore))
                    }
                    detailResponse = it
                    tvDate.text = getDate(it.created_time)
                    tvComment.text = convertLikeCommentShare(it.comment_count) + " " + resources.getString(R.string.str_comment_count)
                    tvLikes.text = convertLikeCommentShare(it.like_count) + " " + resources.getString(R.string.str_like_count)
                    tvShare.text = convertLikeCommentShare(it.share_count) + " " + resources.getString(R.string.str_share_count)

                    if (it.name_locations.isEmpty()) {
                        imgLocation.setImageResource(R.drawable.ic_utensils_main)
                        tvAddress.text = it.name_utensils
                        imgSetPlan.visibility = View.GONE
                    }else{
                        imgLocation.setImageResource(R.drawable.ic_location)
                        tvAddress.text = "${it.name_locations}\n${it.address_locations ?:""}"
                        imgSetPlan.visibility = View.VISIBLE
                    }
                    tvPostedBy.text = it.user_name_created
                    if (it.getListContent()?.get(0)?.listImg?.size!! > 0) {
                        imgTopDetail.loadImageWithCustomCorners(
                            urlImage(
                                it.getListContent()?.get(0)?.listImg?.get(0), it.url_prefix
                            ), 1
                        )
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        })
    }

    private fun convertLikeCommentShare(count: Int?): String {
        return if (count == null) "0"
        else {
            if (count > 1000) {
                (count / 1000).toString() + "K" + (count % 1000 / 100).toString().replace("0", "")
            } else (count).toString()
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onNumberComment(numberComment: Int?) {
        getBinding()?.apply {
            tvComment.text =
                convertLikeCommentShare(numberComment) + " " + resources.getString(R.string.str_comment_count)
        }
    }

    override fun onErrorDeletePost(position: Int?) {
        position?.let {
            itemDeleteListener(position)
        }
        mActivity?.closeDetailScreen(this)
    }

    override fun isBackPreviousEnable(): Boolean {
        return true
    }

    override fun backToPrevious() {
        finish()
    }

    override fun getCurrentFragment(): Int {
        return FRM_POST_DETAIL
    }

    override fun finish() {
        mActivity?.closeDetailScreen(this)
        mActivity?.clearLightStatusBar()

    }

    override fun statusBarColor() = AppConst.STATUS_BAR_WHITE

    @SuppressLint("SetTextI18n")
    private fun showBottomDialog(entityNew: ListPostUserData?, position: Int) {

        try {
            mActivity?.showBottomSheet(entityNew, this@FrmDetail, position)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    override fun followUnFollowSuccess(
        follow: ResponseFollow.FollowResponse?,
        entityNew: ListPostUserData?
    ) {
        follow?.follows?.let { it1 ->
            entityNew?.created_id?.let { id ->
                val requestFollowUnFollow = HashMap<Int, Int>()
                if (it1) {
                    requestFollowUnFollow[id] = ListPostUserResponse.STATE_FOLLOW
                    entityNew.state_follow = ListPostUserResponse.STATE_FOLLOW
                } else {
                    requestFollowUnFollow[id] = ListPostUserResponse.STATE_UNFOLLOW
                    entityNew.state_follow = ListPostUserResponse.STATE_UNFOLLOW
                }
                shareViewModel.listIdFollow.putAll(requestFollowUnFollow)
            }
        }
    }

    override fun badReport(entityNew: ListPostUserData?, position: Int?) {
        mActivity?.showDialogReport(entity, this@FrmDetail, position)
    }

    override fun hidePostSuccess(position: Int?) {
        mActivity?.bottomSheet?.dismiss()
        position?.let {
            itemHideListener(position)
        }
        backToPrevious()
    }

    override fun editPost(entityNew: ListPostUserData?) {
        if (entityNew?.name_locations.isNullOrEmpty()){
            FrmPushPostsNew.getInstance(entityNew, typeFragment = AppConst.FRM_POST_UTENSILS, true).show(childFragmentManager,"FrmPushPost")
        }else{
            FrmPushPostsNew.getInstance(entityNew, typeFragment = AppConst.FRM_POST_LOCATION, true).show(childFragmentManager,"FrmPushPost")
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
                detailViewModel.requestDeletePost(it,entityNew?.id.toString())
            }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    private fun observerDeletePost(){
        try {
            detailViewModel.deletePostResult.observe(viewLifecycleOwner,{
                if (it.status!= ApiResult.Status.CONSUMED){
                    shareViewModel.showOrHideLoading(it)
                    if (it.status==ApiResult.Status.SUCCESS){
                        position?.let {
                            itemDeleteListener(it)
                        }
                         backToPrevious()
                        it?.data?.message?.let {
                            mActivity?.showDialogSuccess(it)
                        }
                    }
                }
                it.status= ApiResult.Status.CONSUMED
            })
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    override fun reportSuccess(position: Int?) {
        mActivity?.bottomSheet?.dismiss()
        if (position != -1){ // report succes
            position?.let {
                itemHideListener(position)
            }
        }
        backToPrevious()
    }

    private fun onClickShareListener(content: String) {
        mActivity?.onShareLinkFacebook(content)

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
        EventBus.getDefault().post("FrmDetail")
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

    @SuppressLint("SetTextI18n")
    private fun observerChangeLanguage(){
        authViewModel.isChangeLanguage.observe(viewLifecycleOwner,{
            if (it){
                detailResponse?.let {
                    getBinding()?.apply {
                        tvComment.text = convertLikeCommentShare(it.comment_count) + " " + resources.getString(R.string.str_comment_count)
                        tvLikes.text = convertLikeCommentShare(it.like_count) + " " + resources.getString(R.string.str_like_count)
                        tvShare.text = convertLikeCommentShare(it.share_count) + " " + resources.getString(R.string.str_share_count)

                        btnComment.setText(resources.getString(R.string.str_frm_detail_comment))
                        btnShare.setText(resources.getString(R.string.str_frm_detail_share))
                        btnLike.setText(resources.getString(R.string.str_frm_detail_like))

                        tvBy.text=resources.getString(R.string.lblBy)
                    }
                }
            }
        })
    }

    private fun goToFrmReminder() {
        if (detailViewModel.location == null){
            detailViewModel.location = detailResponse?.location_id?.let { ResponseListCamping.ListCampingData(0, it, detailResponse?.name_locations, detailResponse?.address_locations, "", "", "", "", detailResponse?.plans_note, detailResponse?.plans_status, detailResponse?.plans_time, detailResponse?.has_plans)}
        }
        detailViewModel.location
            val dialog = detailViewModel.location?.let { DialogFragmentReminder.getInstance(it) }
            dialog?.show(this.childFragmentManager, "DialogFragmentReminder")

        }
    }