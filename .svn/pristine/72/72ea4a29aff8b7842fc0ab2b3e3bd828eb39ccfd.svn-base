package brite.outdoor.ui.dialog

import android.Manifest
import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context.INPUT_METHOD_SERVICE
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.Rect
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.DisplayMetrics
import android.util.Log
import android.view.*
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.R
import brite.outdoor.adapter.AdapterComment
import brite.outdoor.adapter.AdapterCommentReply
import brite.outdoor.adapter.ImagePickAdapterAvatar
import brite.outdoor.adapter.utils.MarginDecoration
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.ApiConst.Companion.PARAM_API_COMMENT_ID
import brite.outdoor.constants.ApiConst.Companion.PARAM_API_LASTEST_ID
import brite.outdoor.constants.ApiConst.Companion.PARAM_API_LIMIT
import brite.outdoor.constants.ApiConst.Companion.PARAM_API_THREAD_ID
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.AppConst.Companion.DEFAULT_ITEM_PER_PAGE_COMMENT
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.api_entities.response.ResponseDeleteComment
import brite.outdoor.data.api_entities.response.ResponseListComment
import brite.outdoor.data.api_entities.response.ResponseListCommentLevel2
import brite.outdoor.data.api_entities.response.ResponsePostComment
import brite.outdoor.data.entities.CommentEntity
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.LayoutCommentBinding
import brite.outdoor.ui.activities.MainActivity
import brite.outdoor.utils.*
import brite.outdoor.utils.compressor.*
import brite.outdoor.viewmodel.*
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.layout_comment.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.flow.flowOn
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import org.greenrobot.eventbus.EventBus
import java.io.File
import kotlin.math.log


@AndroidEntryPoint
class DialogComment : BottomSheetDialogFragment() {
    companion object {
        private const val TAG = "DialogComment"
    }

    interface OnChangeNumberComment {
        fun onNumberComment(numberComment: Int?)
        fun onErrorDeletePost(position: Int?)
    }

    private var onChangeNumberComment: OnChangeNumberComment? = null
    private var binding: LayoutCommentBinding? = null

    private var adapterComment: AdapterComment? = null
    private var adapterCommentReply: AdapterComment? = null
    private var mActivity: MainActivity? = null

    private var postId: String? = null
    private var shareViewModel = ShareViewModel()
    private val authViewModel by activityViewModels<AuthViewModel>()
    private val myPostViewModel by viewModels<MyPostViewModel>()
    private val commentViewModel by viewModels<CommentViewModel>()
    private val detailViewModel by viewModels<DetailViewModel>({ requireParentFragment() })
    private var arrayList: ArrayList<ResponseListComment.ListCommentData> = ArrayList()
    private var arrayListReply: ArrayList<ResponseListComment.ListContentReplyData> = ArrayList()
    private var threadId:Int?=null
    private var parentId = 0
    private var replyId = 0
    private var statusDelete: Int? = null
    private var positionDelete: Int? = null
    private var urlAvatar: String = ""
    private var totalLoadMoreResult: Int = AppConst.DEFAULT_TOTAL_RESULT
    private var hashMap = HashMap<Int, ResponseListComment.ListContentReplyData>()
    private var DELETE_COMMENT  = 1
    private var DELETE_COMMENT_REPLY  = 2
    private var commentId : Int?=null
    private var listImage: ArrayList<ImagePicker>? = null
    private var imagePickerAdapter: ImagePickAdapterAvatar? =null
    private var imagePickerAdapterReply: ImagePickAdapterAvatar? =null
    private var imagePickerComment :ImagePicker?=null
    private var imagePickerCommentReply :ImagePicker?=null
    private var urlPrefixComment: String? = null
    private var positionPost:Int?=null
    private var listCommentReply : ArrayList<ResponseListComment.ListContentReplyData> = ArrayList()
    private var dataComment : ResponseListComment.ListCommentData?=null
    private var firstLoadSeeMoreCommentReply:Boolean=true
    private var firstLoadSeeMoreComment : Boolean=true
    private var isSeeMoreComment = true
    private var lastestIdSeeMore:Int?=null
    private var positionReplyCommentThread : Int?=null
    private var positionReplyCommentLevel2:Int?=null
    private lateinit var flow: Flow<ImagePicker>
    val listImagePicker: ArrayList<ImagePicker> = ArrayList()
    private var heightScreen = 0
    private val jobInsertImagePicker = CoroutineScope(Dispatchers.Main)
    private var lastestId :Int?=null

    fun loadControlsAndResize() {
        binding?.apply {
            val display: Display? = activity?.windowManager?.defaultDisplay
            val outMetrics = DisplayMetrics()
            display?.getMetrics(outMetrics)
            val screenHeight = outMetrics.heightPixels
            val width = resources.displayMetrics.widthPixels
            clComment.resizeLayout(width, (screenHeight.minus(220)))
            clCommentReply.resizeLayout(width, (screenHeight.minus(220)))
//            tvViewBlank.resizeHeight(getSizeWithScale(122.0))
//            clCommentReply.translationX = width.toFloat()
            btnClose.layoutParams?.width = getSizeWithScale(20.0)
            btnClose.layoutParams?.height = getSizeWithScale(20.0)
            btnCloseReply.layoutParams?.width = getSizeWithScale(20.0)
            btnCloseReply.layoutParams?.height = getSizeWithScale(20.0)

            btnSend.resizeLayout(getSizeWithScale(25.0), getSizeWithScale(25.0))
            btnSendReply.resizeLayout(getSizeWithScale(25.0), getSizeWithScale(25.0))

//            clHeaderComment.layoutParams?.height = getSizeWithScale(85.0)

            clEdtSendComment.minHeight = getSizeWithScale(40.0)
            clEdtSendCommentReply.minHeight = getSizeWithScale(40.0)

            btnImage.layoutParams.width = getSizeWithScale(30.81)
            btnImage.layoutParams.height = getSizeWithScale(25.48)

            btnImageReply.layoutParams.width = getSizeWithScale(30.81)
            btnImageReply.layoutParams.height = getSizeWithScale(25.48)

            clImageView.resizeLayout(getSizeWithScale(70.0),getSizeWithScale(90.0))
            clImageViewReply.resizeLayout(getSizeWithScale(70.0),getSizeWithScale(90.0))

            layoutBottom.layoutParams.height = MyApplication.getInstance().getSizeWithScale(230.0)
            layoutBottomReply.layoutParams.height = MyApplication.getInstance().getSizeWithScale(230.0)

            btnCloseImage.resizeLayout(getSizeWithScale(15.0),getSizeWithScale(15.0))
            btnCloseImageReply.resizeLayout(getSizeWithScale(15.0),getSizeWithScale(15.0))

            btnSeeMoreComment.setSingleClick {
                backToViewComment()
                binding?.layoutBottomReply?.hide()
            }
        }
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = BottomSheetDialog(requireContext(), theme)
        dialog.behavior.state = BottomSheetBehavior.STATE_EXPANDED
        dialog.behavior.skipCollapsed = true
        dialog.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING)

        return dialog
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding?.rcViewImage?.isNestedScrollingEnabled = false
        setStyle(STYLE_NORMAL, R.style.DialogCommentStyle)

    }

    fun setData(
        urlAvatar: String,
        mActivity: MainActivity?,
        postId: Int,
        shareViewModel: ShareViewModel,
        mOnChangeNumberComment: OnChangeNumberComment?,
        isNotification : Boolean = false,
        commentId : Int?=null,
        threadId: Int?=null,
        position:Int?=null
    ) {
        this.urlAvatar = urlAvatar
        this.mActivity = mActivity
        this.postId = postId.toString()
        this.shareViewModel = shareViewModel
        this.onChangeNumberComment = mOnChangeNumberComment
        this.commentId=commentId
        this.positionPost=position
        this.threadId = threadId
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LayoutCommentBinding.inflate(inflater, container, false)
        loadControlsAndResize()
        setupOnClickListener()
        setDataListComment()
        setDataListCommentReply()
        if (threadId==null){
            callApiGetComment(0)
        } else {
            callApiGetComment(0,commentId,threadId)
        }
        observerGetListComment()
        observerPostComment()
        observerGetListCommentLevel2()
        observerDeleteComment()
        initAdapter()
        listenerFocusEdittext()
        observerOpenKeyboard()
        getHeightScreen()
        showViewKeyBoard()
        hideAllLayoutBottom()
        return binding!!.root
    }

    private fun setupOnClickListener() {
        binding?.apply {

            btnClose.setSingleClick {
                dismiss()
            }
            btnSend.setSingleClick {
                postComment()
                AppUtils.hideKeyboard(view)
                clImageView.visibility=View.GONE
                imagePickerComment = null
                layoutBottom.hide()
            }
            btnSendReply.setSingleClick {
                AppUtils.hideKeyboard(view)
                postCommentReply()
                clImageViewReply.visibility=View.GONE
                imagePickerCommentReply = null
                layoutBottomReply.hide()

            }
            btnCloseReply.setSingleClick {
                dismiss()
            }
            clHeaderComment.setSingleClick {
                dismiss()
            }
            icBackReply.setSingleClick {
                if (detailViewModel.isNotification) backToViewComment()
                else{
                    AppUtils.hideKeyboard(view)
                    visibleViewComment(clComment)
                    goneViewComment(clCommentReply, clCommentReply.width.toFloat())
                    threadId = 0
                    detailViewModel.isNotification=false
                }
                binding?.layoutBottomReply?.hide()

            }
            clComment.setSingleClick {
                AppUtils.hideKeyboard(view)
            }
            clCommentReply.setSingleClick {
                AppUtils.hideKeyboard(view)
            }
            rcComment.setSingleClick {
                AppUtils.hideKeyboard(view)
            }
            rcCommentReply.setSingleClick {
                AppUtils.hideKeyboard(view)
            }
            btnImage.setSingleClick {
                if (!commentViewModel.isPermissionReadWriteExternalStorage){
                    if (allPermissionsGranted()){
                        onPermissionGranted()
                    }else{
                        permissionRequest.launch(permissions.toTypedArray())
                    }
                }
                binding?.apply {
                    rcViewImage.adapter=imagePickerAdapter
                    AppUtils.hideKeyboard(view)
                    edtSendComment.clearFocus()
                    if (layoutBottom.isVisible) {
                        layoutBottom.hide()
                    } else {
                        layoutBottom.show()
                    }
                    layoutBottomReply.hide()
                }

            }
            btnImageReply.setSingleClick {
                if (!commentViewModel.isPermissionReadWriteExternalStorage){
                    if (allPermissionsGranted()){
                        onPermissionGranted()
                    }else{
                        permissionRequest.launch(permissions.toTypedArray())
                    }
                }
                binding?.apply {
                    rcViewImageReply.adapter=imagePickerAdapterReply
                    AppUtils.hideKeyboard(view)
                    edtSendCommentReply.clearFocus()
                    if (layoutBottomReply.isVisible) {
                        layoutBottomReply.hide()
                    } else {
                        layoutBottomReply.show()

                    }
                    layoutBottom.hide()
                }

            }
            btnCloseImage.setOnClickListener {
                clImageView.visibility=View.GONE
                imagePickerComment = null
            }
            btnCloseImageReply.setOnClickListener {
                clImageViewReply.visibility=View.GONE
                imagePickerCommentReply = null
            }
        }
    }

    private fun goneViewComment(view: View, float: Float) {
        view.visibility = View.GONE
    }

    private fun visibleViewComment(view: View) {
        view.visibility = View.VISIBLE
//        view.animate().translationX(0f).duration = 300
//        ObjectAnimator.ofFloat(view, "translationX", 0f).apply {
//            duration = 300
//            start()
//        }
    }

    private fun callApiGetComment(lastestId: Int?,comment_id:Int?=null,thread_id: Int?=null) {
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[PARAM_API_LASTEST_ID] = lastestId.toString()
            requestParam[PARAM_API_LIMIT] = DEFAULT_ITEM_PER_PAGE_COMMENT.toString()
            comment_id?.let {
                requestParam[PARAM_API_COMMENT_ID]=it.toString()
            }
            thread_id?.let {
                requestParam[PARAM_API_THREAD_ID]=it.toString()
            }
            commentViewModel.getListComment(requestParam, postId.toString())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    private fun prepareFilePart(partName: String, fileUri: Uri): MultipartBody.Part? {
        try {
            var file = File(getRealPathFromURI(fileUri))
            if (file.getSizeInKB()>(5*1024) ){ // check file photo and
                runBlocking {
                    file = Compressor.compress(requireContext(),file){
                        resolution(1280, 720)
                        quality(80)
                        format(Bitmap.CompressFormat.JPEG)
                        size(5_242_880)
                    }

                }
            }
            val requestFile: RequestBody =
                    RequestBody.create(
                            mActivity?.contentResolver?.getType(fileUri)?.toMediaTypeOrNull(),
                            file
                    )
            return MultipartBody.Part.createFormData(
                    partName, file.name.replace(" ".toRegex(), "%20"), requestFile
            )
        } catch (e: Exception) {
        }
        return null
    }
    private fun getRealPathFromURI(uri: Uri): String {
        try {
            var path = ""
            val proj = arrayOf(MediaStore.MediaColumns.DATA)
            val cursor: Cursor? = mActivity?.contentResolver?.query(uri, proj, null, null, null)
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    val columnIndex: Int =
                            cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATA)
                    path = cursor.getString(columnIndex)
                }
            }
            cursor?.close()
            return path
        } catch (e: Exception) {
        }
        return ""
    }


    private fun callApiGetCommentReply(lastestId: Int?, threadId: Int?) {
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[PARAM_API_LASTEST_ID] = lastestId.toString()
            commentViewModel.getListCommentLevel2(requestParam, threadId.toString())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun observerGetListCommentLevel2() {
        binding?.apply {
            commentViewModel.listCommentLevel2Result.observe(viewLifecycleOwner, {
                try {
                    shareViewModel.showOrHideLoading(it)
                    if (it.status == ApiResult.Status.SUCCESS) {
                            if (it.data?.response is ResponseListCommentLevel2.ListCommentLevel2Response) {
                                (it.data.response as ResponseListCommentLevel2.ListCommentLevel2Response).let { response ->
                                    adapterComment?.apply {
                                        response.getListCommentLevel2Data().let { it1 ->
                                            if (detailViewModel.isNotification){
                                                if (firstLoadSeeMoreCommentReply){
                                                    arrayListReply.clear() // clear data
                                                    arrayListReply.addAll(listCommentReply) // add comment reply first item
                                                    var countNotInsertCommentReply = 0
                                                     it1?.forEach { commentReply->
                                                            val position =  this@DialogComment.listCommentReply.withIndex().filter { (_, value)->
                                                                value.id==commentReply.id
                                                            }.map { (i, _)->i }.singleOrNull()
                                                            if (position==null){
                                                                arrayListReply.add(
                                                                    ResponseListComment.ListContentReplyData(
                                                                        commentReply.id,
                                                                        commentReply.post_id,
                                                                        commentReply.thread_id,
                                                                        commentReply.parent_id,
                                                                        commentReply.created_id,
                                                                        commentReply.reply_id,
                                                                        commentReply.comment,
                                                                        commentReply.user_name_created,
                                                                        commentReply.avatar_user,
                                                                        commentReply.image,
                                                                        commentReply.modified_time,
                                                                        commentReply.user_name_reply
                                                                    )
                                                                )
                                                            }else{
                                                                countNotInsertCommentReply++
                                                            }
                                                        }
                                                    if (countNotInsertCommentReply==it1?.size){
                                                        if (it1.size>0) lastestId=it1.last().id
                                                    }

                                                    firstLoadSeeMoreCommentReply=false
                                                }else{
                                                    var countNotInsertCommentReply = 0
                                                    it1?.forEach { commentReply->
                                                        val position =  this@DialogComment.arrayListReply.withIndex().filter { (_, value)->
                                                            value.id==commentReply.id
                                                        }.map { (i, _)->i }.singleOrNull()
                                                        if (position==null){
                                                            arrayListReply.add(
                                                                ResponseListComment.ListContentReplyData(
                                                                    commentReply.id,
                                                                    commentReply.post_id,
                                                                    commentReply.thread_id,
                                                                    commentReply.parent_id,
                                                                    commentReply.created_id,
                                                                    commentReply.reply_id,
                                                                    commentReply.comment,
                                                                    commentReply.user_name_created,
                                                                    commentReply.avatar_user,
                                                                    commentReply.image,
                                                                    commentReply.modified_time,
                                                                    commentReply.user_name_reply
                                                                )
                                                            )
                                                        }else{
                                                            countNotInsertCommentReply++
                                                        }
                                                    }
                                                    if (countNotInsertCommentReply==it1?.size){
                                                        if (it1.size>0) lastestId=it1.last().id
                                                    }
                                                }
                                                adapterComment?.arrayListComment?.get(0)?.post_comments_children?.clear()
                                                adapterComment?.arrayListComment?.get(0)?.post_comments_children?.addAll(arrayListReply)

                                            }else{
                                                firstLoadSeeMoreComment = false
                                                for (i in 0 until arrayList.size) {
                                                    if (arrayList[i].id == threadId) {
                                                        if (arrayList[0].id==threadId && !isSeeMoreComment){
                                                            arrayListReply.clear()
                                                            if (it1 != null) {
                                                                arrayListReply.clear()
                                                                for (item in it1){
                                                                    if (hashMap.containsKey(item.id)){
                                                                        arrayList[i].post_comments_children?.remove(hashMap[item.id])
                                                                        hashMap.remove(item.id)
                                                                    }
                                                                    var isContains = false
                                                                    arrayList[0].post_comments_children?.forEach {
                                                                        if (it.id==item.id) isContains=true
                                                                    }
                                                                    if (!isContains) arrayListReply.add(
                                                                            ResponseListComment.ListContentReplyData(
                                                                                item.id,
                                                                                item.post_id,
                                                                                item.thread_id,
                                                                                item.parent_id,
                                                                                item.created_id,
                                                                                item.reply_id,
                                                                                item.comment,
                                                                                item.user_name_created,
                                                                                item.avatar_user,
                                                                                item.image,
                                                                                item.modified_time,
                                                                                item.user_name_reply
                                                                            )
                                                                        )
                                                                }
                                                            }
                                                            if (it1?.size?:0>0 && arrayListReply.size==0){
                                                                lastestIdSeeMore=it1?.last()?.id
                                                            }else   lastestIdSeeMore=null
                                                            arrayList[i].post_comments_children?.addAll(arrayListReply)
                                                            adapterComment?.notifyItemChanged(i)
                                                        }else{
                                                            if (it1 != null) {
                                                                arrayListReply.clear()
                                                                for (item in it1){
                                                                    if (hashMap.containsKey(item.id)){
                                                                        arrayList[i].post_comments_children?.remove(hashMap[item.id])
                                                                        hashMap.remove(item.id)
                                                                    }
                                                                    val position =  arrayList[i].post_comments_children?.withIndex()?.filter { (_, value)->
                                                                        value.id==item.id
                                                                    }?.map { (position, _)->position }?.singleOrNull()
                                                                    if (position==null){
                                                                        arrayListReply.add(
                                                                            ResponseListComment.ListContentReplyData(
                                                                                item.id,
                                                                                item.post_id,
                                                                                item.thread_id,
                                                                                item.parent_id,
                                                                                item.created_id,
                                                                                item.reply_id,
                                                                                item.comment,
                                                                                item.user_name_created,
                                                                                item.avatar_user,
                                                                                item.image,
                                                                                item.modified_time,
                                                                                item.user_name_reply
                                                                            )
                                                                        )
                                                                    }
                                                                }
                                                            }

                                                            arrayList[i].post_comments_children?.addAll(arrayListReply)
                                                            adapterComment?.notifyItemChanged(i)
                                                        }

                                                    }
                                                }
                                            }
                                            adapterCommentReply?.notifyDataSetChanged()
                                        }
                                        notifyDataSetChanged()
                                    }
                                }
                            }
                    }else if (it.status==ApiResult.Status.ERROR_DELETE_COMMENT){
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        }
    }

    private fun setDataListComment() {
        try {
            binding?.apply {
                if (adapterComment == null) adapterComment =
                    AdapterComment(
                        requireContext(),
                        mActivity?.getUserId()?.toInt(),
                        mActivity?.getUrlPrefixAvatar(),
                        object : AdapterComment.OnClickReplyListener {
                            override fun onClickReply(comment: ResponseListComment.ListCommentData?,position: Int) {
                                AppUtils.hideKeyboard(view)
                                if (comment != null) {
                                    setDataLayoutDataReply(comment, comment.user_name_created)
                                    replyId=comment.created_id
                                }
                                focusEdtReply()
                                layoutBottom.hide()
                                positionReplyCommentThread=position // check vi tri reply comment thread
                                positionReplyCommentLevel2=null //  null khi dang reply comment thread
                            }

                            override fun onClickDelete(comment: ResponseListComment.ListCommentData?, position: Int) {
                                AppUtils.hideKeyboard(view)
                                positionDelete = position
                                statusDelete = DELETE_COMMENT
                                comment?.id?.let { showDialogDelete(it) }
                            }

                            override fun onClickUserName(comment: ResponseListComment.ListCommentData?) {
                                comment?.created_id?.let {
                                    mActivity?.showPersonalPageOrMyPage(it)
                                    this@DialogComment.dismiss()
                                }
                            }
                        },
                        object : AdapterCommentReply.OnClickCommentReplyListener {
                            override fun onClickReply(comment: ResponseListComment.ListCommentData?, commentReply: ResponseListComment.ListContentReplyData?,position: Int) {
                                AppUtils.hideKeyboard(view)
                                if (comment != null) {
                                    commentReply?.apply {
                                        setDataLayoutDataReply(comment, user_name_created)
                                        parentId = id
                                        replyId = created_id

                                    }

                                    positionReplyCommentThread=null // null khi dang reply comment cap 2
                                    positionReplyCommentLevel2=position // tra ve vi tri reply comment level 2
                                }
                                focusEdtReply()
                                layoutBottom.hide()
                            }

                            override fun onClickSeeMore(threadId: Int?, lastestId: Int?) {
                                Log.e(TAG, "onClickSeeMore: 2", )
                                try {
                                    if (threadId != null) {
                                        this@DialogComment.threadId = threadId
                                    }
                                    if (arrayListReply.size != 0 && arrayListReply[arrayListReply.size.minus(1)].thread_id != threadId.toString()){
                                        AppUtils.hideKeyboard(view)
                                        arrayListReply.clear()
                                    }

                                    if (arrayListReply.size == 0){
                                        if ( adapterComment?.arrayListComment?.get(0)?.id==threadId?.toInt() && !isSeeMoreComment){
                                            if (firstLoadSeeMoreComment) {
                                                callApiGetCommentReply(0, threadId)
                                            }else{
                                               if (lastestIdSeeMore!=null){
                                                   callApiGetCommentReply(lastestIdSeeMore,threadId)
                                               }else{
                                                   callApiGetCommentReply(lastestId,threadId)
                                               }
                                            }
                                        }else{
                                            var lastestIdOld = 0
                                            arrayList.forEach {
                                                if (it.id==threadId){
                                                    it.post_comments_children?.forEach { commentReply->
                                                        if (!commentReply.isCommentReplyAddNew) lastestIdOld = commentReply.id
                                                    }
                                                }
                                            }
                                            callApiGetCommentReply(lastestIdOld, threadId)
                                        }

                                    }else{
                                       callApiGetCommentReply(arrayListReply[arrayListReply.size.minus(1)].id, threadId)
                                    }
                                } catch (e: Exception) {
                                    e.printStackTrace()
                                }
                            }
                            override fun onClickDelete(comment: ResponseListComment.ListCommentData?,commentReply: ResponseListComment.ListContentReplyData?, position: Int) {
                                AppUtils.hideKeyboard(view)
                                threadId = comment?.id?:0
                                positionDelete = position
                                statusDelete = DELETE_COMMENT_REPLY
                                commentReply?.id?.let { showDialogDelete(it) }
                            }

                            override fun onClickUserName(commentReply: ResponseListComment.ListContentReplyData?) {
                                commentReply?.created_id?.let {
                                    mActivity?.showPersonalPageOrMyPage(it)
                                    this@DialogComment.dismiss()
                                }
                            }

                        })

                rcComment.adapter = adapterComment
                rcComment.layoutManager = LinearLayoutManager(requireContext())

                rcComment.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                        super.onScrolled(recyclerView, dx, dy)
                        try {

                            val linearLayoutManager =
                                rcComment.layoutManager as LinearLayoutManager?
                            if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition()
                                    .plus(1) == linearLayoutManager.itemCount
                            ) {
                                try {
                                    adapterComment?.apply {
                                        if (totalLoadMoreResult > arrayListComment.size && dy != 0 ){
                                            callApiGetComment(
                                                arrayListComment[(linearLayoutManager.itemCount).minus(
                                                    1
                                                )].id
                                            )
                                        }
                                    }
                                } catch (e: Exception) {
                                    e.printStackTrace()
                                }
                            }
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }

                    }
                })
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setDataLayoutDataReply(comment: ResponseListComment.ListCommentData, userNameCreated: String?) {
        binding?.apply {
            threadId = comment.id
            edtSendCommentReply.hint = "${resources.getString(R.string.lblReply)} $userNameCreated"
            adapterCommentReply?.updateList(arrayListOf(comment), urlPrefixComment)
            comment.post_comments_children?.let { arrayListReply.addAll(it) }
            visibleViewComment(clCommentReply)
            goneViewComment(clComment, -(clComment.width.toFloat()))
            if (detailViewModel.isNotification && totalLoadMoreResult > 1)btnSeeMoreComment.visibility=View.VISIBLE
            else btnSeeMoreComment.visibility=View.GONE
        }

    }

    private fun setDataListCommentReply() {
        try {
            binding?.apply {
                adapterCommentReply = AdapterComment(
                    requireContext(),
                    mActivity?.getUserId()?.toInt(),
                    mActivity?.getUrlPrefixAvatar(),
                    object : AdapterComment.OnClickReplyListener {
                        override fun onClickReply(comment: ResponseListComment.ListCommentData?,position: Int) {
                            AppUtils.hideKeyboard(view)
                            edtSendCommentReply.hint = "${resources.getString(R.string.lblReply)} ${comment?.user_name_created}"
                            focusEdtReply()
                            positionReplyCommentThread=position // check vi tri reply comment thread
                            positionReplyCommentLevel2=null //  null khi dang reply comment thread
                        }

                        override fun onClickDelete(comment: ResponseListComment.ListCommentData?, position: Int) {
                            AppUtils.hideKeyboard(view)
                            positionDelete = position
                            statusDelete = DELETE_COMMENT
                            comment?.id?.let { showDialogDelete(it) }
                        }

                        override fun onClickUserName(comment: ResponseListComment.ListCommentData?) {
                            comment?.created_id?.let {
                                mActivity?.showPersonalPageOrMyPage(it)
                                this@DialogComment.dismiss()
                            }
                        }
                    },
                    object : AdapterCommentReply.OnClickCommentReplyListener {
                        override fun onClickReply(
                            comment: ResponseListComment.ListCommentData?,
                            commentReply: ResponseListComment.ListContentReplyData?,
                            position: Int
                        ) {
                            AppUtils.hideKeyboard(view)
                            commentReply?.apply {
                                edtSendCommentReply.hint = "${resources.getString(R.string.lblReply)} $user_name_created"
                                parentId = id
                                replyId = created_id
                                focusEdtReply()
                            }
                            positionReplyCommentThread=null // null khi dang reply comment cap 2
                            positionReplyCommentLevel2=position // tra ve vi tri reply comment level 2
                        }

                        override fun onClickSeeMore(threadId: Int?, lastestId: Int?) {
                            AppUtils.hideKeyboard(view)
                            if (arrayListReply.size == 0){
                                callApiGetCommentReply(lastestId, threadId)
                            }else{
                                if (detailViewModel.isNotification){
                                    if (firstLoadSeeMoreCommentReply) {
                                        callApiGetCommentReply(0, threadId)
                                    }else{
                                        if (this@DialogComment.lastestId==null){
                                            callApiGetCommentReply(lastestId,threadId)
                                        }else{
                                            callApiGetCommentReply(this@DialogComment.lastestId,threadId)
                                            this@DialogComment.lastestId=null
                                        }

                                    }
                                } else{
                                    callApiGetCommentReply(arrayListReply[arrayListReply.size.minus(1)].id, threadId)

                                    
                                }
                            }
                        }

                        override fun onClickDelete(comment: ResponseListComment.ListCommentData?,commentReply: ResponseListComment.ListContentReplyData?, position: Int) {
                            AppUtils.hideKeyboard(view)
                            positionDelete = position
                            statusDelete = DELETE_COMMENT_REPLY
                            threadId = comment?.id?:0
                            commentReply?.id?.let { showDialogDelete(it) }
                        }

                        override fun onClickUserName(commentReply: ResponseListComment.ListContentReplyData?) {
                            commentReply?.created_id?.let {
                                mActivity?.showPersonalPageOrMyPage(it)
                                this@DialogComment.dismiss()
                            }
                        }

                    })
                rcCommentReply.adapter = adapterCommentReply
                rcCommentReply.layoutManager = LinearLayoutManager(requireContext())
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun callApiDeleteComment(id: Int){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            commentViewModel.requestDeleteComment(requestParam, id.toString())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    private fun showDialogDelete(id: Int?) {
        val dialogDelete = DialogDelete(requireContext())
        dialogDelete.apply {
            show(true, resources.getString(R.string.msgDeleteComment), resources.getString(R.string.msgConfirmDeleteComment), object :DialogDelete.OnDeleteAgreeOrCancel{
                override fun onAgree() {
                    if (id != null) {
                        callApiDeleteComment(id)
                    }
                }
            })
        }
    }

    private fun observerDeleteComment(){
        try {
            commentViewModel.deleteCommentResult.observe(viewLifecycleOwner,{
                shareViewModel.showOrHideLoading(it)
                if (it.status == ApiResult.Status.SUCCESS){
                    if (it.data?.response is ResponseDeleteComment.DeleteCommentResponse) {
                        (it.data.response as ResponseDeleteComment.DeleteCommentResponse).let { response ->
                            response.data?.comment_count?.let {
                                authViewModel.syncComment.value=CommentEntity(postId?.toInt() ?: 0,it)
                            }
                            onChangeNumberComment?.onNumberComment(response.data?.comment_count)
                            when(statusDelete){
                                DELETE_COMMENT->{
                                    positionDelete?.let { it1 -> adapterComment?.arrayListComment?.removeAt(it1)
                                        arrayList.removeAt(it1)
                                        adapterCommentReply?.updateList(arrayListOf(),"")
                                        adapterComment?.notifyItemRemoved(it1)
                                    }
                                    adapterComment?.notifyDataSetChanged()
                                }
                                DELETE_COMMENT_REPLY->{
                                    for (i in 0 until  adapterComment?.arrayListComment?.size!!){
                                        if (adapterComment?.arrayListComment?.get(i)?.id == threadId){
                                            positionDelete?.let { it1 ->
                                                adapterComment?.arrayListComment?.get(i)?.total_children =
                                                    adapterComment?.arrayListComment?.get(i)?.total_children?.minus(1)!!
//                                                adapterCommentReply?.notifyItemRemoved(it1)
                                                adapterComment?.arrayListComment?.get(i)?.post_comments_children?.removeAt(it1)
//                                                adapterComment?.notifyItemChanged(i)
                                            }
                                        }
                                    }
                                    adapterCommentReply?.notifyDataSetChanged()
                                    adapterComment?.notifyDataSetChanged()

                                }
                                else -> return@observe
                            }

                        }
                        }
            }}
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun postComment() {
        try {
            binding?.apply {
                val requestParamPostComment = mActivity!!.getRequestParamWithToken()
                requestParamPostComment[ApiConst.PARAM_API_COMMENT] = edtSendComment.text.toString()
                requestParamPostComment[ApiConst.PARAM_API_PARENT_ID] = ""
                requestParamPostComment[ApiConst.PARAM_API_THREAD_ID] = ""
                requestParamPostComment[ApiConst.PARAM_API_POST_ID] = postId.toString()
                val listImg: ArrayList<MultipartBody.Part> = ArrayList()
                imagePickerComment?.let {
                    prepareFilePart("image", Uri.parse(it.uri))?.let {
                        listImg.add(it)
                    }
                }
                if (!edtSendComment.text.isNullOrEmpty() || !listImg.isNullOrEmpty()) {
                    commentViewModel.postComment(requestParamPostComment,listImg)
                    adapterComment?.arrayListComment?.add(
                        0,
                        ResponseListComment.ListCommentData(
                            0,
                            0,
                            "",
                            "",
                            edtSendComment.text.toString(),
                            0,
                            0,
                            "",
                            mActivity?.getUserName(),
                            mActivity?.getAvatarId(),
                            "",
                            0,
                            null,
                            true
                        )
                    )
                    adapterComment?.notifyItemInserted(0)
//                    adapterComment?.updateList(arrayList, "")
                    edtSendComment.setText("")
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun postCommentReply() {
        try {
            binding?.apply {
                val requestParamPostComment = mActivity!!.getRequestParamWithToken()
                requestParamPostComment[ApiConst.PARAM_API_COMMENT] =
                    edtSendCommentReply.text.toString()
                requestParamPostComment[ApiConst.PARAM_API_PARENT_ID] = parentId.toString()
                requestParamPostComment[ApiConst.PARAM_API_THREAD_ID] = threadId.toString()
                requestParamPostComment[ApiConst.PARAM_API_REPLY_ID] = replyId.toString()
                requestParamPostComment[ApiConst.PARAM_API_POST_ID] = postId.toString()
                val listImg: ArrayList<MultipartBody.Part> = ArrayList()
                imagePickerCommentReply?.let {
                    prepareFilePart("image", Uri.parse(it.uri))?.let {
                        listImg.add(it)
                    }
                }
                if (edtSendCommentReply.text.toString() != "" || !listImg.isNullOrEmpty()){
                    commentViewModel.postComment(requestParamPostComment,listImg)
                    for (i in 0 until arrayList.size) {
                        if (arrayList[i].id == threadId?.toInt()) {
                            arrayList[i].post_comments_children?.add(ResponseListComment.ListContentReplyData(
                                0,
                                0,
                                "",
                                "",
                                0,
                                0,
                                edtSendCommentReply.text.toString(),
                                mActivity?.getUserName(),
                                mActivity?.getAvatarId(),
                                "",
                                "",
                                "",
                                true
                            ))
                            adapterComment?.notifyItemChanged(i)
                        }
                    }
                    adapterCommentReply?.notifyDataSetChanged()
                    edtSendCommentReply.setText("")
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun observerGetListComment() {
        binding?.apply {
            commentViewModel.listCommentResult.observe(viewLifecycleOwner, {
                try {
                    myPostViewModel.showOrHideLoading(it)
                    if (it.status == ApiResult.Status.SUCCESS) {
                            if (it.data?.response is ResponseListComment.ListCommentResponse) {
                                (it.data.response as ResponseListComment.ListCommentResponse).let { response ->
                                    urlPrefixComment = response.url_prefix_comment
                                    totalLoadMoreResult = response.total?:0
                                    if (dataComment==null){
                                        adapterComment?.apply {
                                            if (arrayList.size == 0) {
                                                response.getListCommentData()?.let {
                                                    arrayList = it
                                                    updateList(it, response.url_prefix_comment)
                                                }

                                            } else {
                                                response.getListCommentData()?.let { it1 ->
                                                    arrayList.addAll(it1)
                                                    insertList(it1)
                                                }
                                            }
                                        }
                                    } else{
                                        if (arrayList.size==0){
                                            dataComment?.let {
                                                arrayList.add(it)
                                            }
                                            response.getListCommentData()?.forEach {
                                                if (it.id !=dataComment?.id)  arrayList.add(it)
                                            }
                                            adapterComment?.updateList(arrayList, response.url_prefix_comment)
                                        }else{
                                            response.getListCommentData()?.forEach {
                                                if (it.id !=dataComment?.id)  arrayList.add(it)
                                            }
                                            adapterComment?.updateList(arrayList, response.url_prefix_comment)
                                            adapterComment?.notifyDataSetChanged()
                                        }

                                    }
                                    foCusCommentReplyFromNotification()
                                }
                            }
                    }
                    myPostViewModel.isNeedShowErr.observe(viewLifecycleOwner, {
                        when(it.status){
                            ApiResult.Status.ERROR_DELETE_POST->{
                                val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
                                    positionPost?.let {
                                        onChangeNumberComment?.onErrorDeletePost(positionPost)
                                    }
                                    dismiss()

                                }
                                mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                            }
                            ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                                shareViewModel.isNeedShowErr.value=it
                            }
                        }

                    })
                    //show loading
                    myPostViewModel.isShowLoading.observe(viewLifecycleOwner,{
                        shareViewModel.isShowLoading.value = it
                    })


                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        }
    }

    private fun focusEdtReply(){
        binding?.apply {
            edtSendCommentReply.requestFocus()
            val imm: InputMethodManager? = mActivity?.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager?
            imm?.showSoftInput(edtSendCommentReply, InputMethodManager.SHOW_IMPLICIT)
        }
    }

    private fun observerPostComment() {
        binding?.apply {
            commentViewModel.postCommentResult.observe(viewLifecycleOwner, {
                try {
                    if (it.status == ApiResult.Status.SUCCESS) {
                            if (it.data?.response is ResponsePostComment.ListCommentResponse) {
                                (it.data.response as ResponsePostComment.ListCommentResponse).let { response ->
                                    onChangeNumberComment?.onNumberComment(response.comment_count)
                                    if (response.thread_id == "") {
                                        adapterComment?.arrayListComment?.set(0, ResponseListComment.ListCommentData(
                                            response.id,
                                            response.post_id,
                                            response.thread_id,
                                            response.parent_id,
                                            response.comment,
                                            response.created_id,
                                            response.reply_id,
                                            response.modified_time,
                                            response.user_name_created,
                                            response.avatar_user,
                                            response.image,
                                            response.total_children,
                                            response.getListCommentReply(),
                                            false
                                        ))
                                        arrayList.clear()
                                        adapterComment?.arrayListComment?.let { it1 ->
                                            arrayList.addAll(it1)
                                        }
//                                        adapterComment?.notifyItemChanged(0)
                                        adapterComment?.notifyDataSetChanged()
                                        edtSendComment.setText("")
                                    } else {
                                        for (i in 0 until arrayList.size) {
                                            if (arrayList[i].id == threadId) {
                                                arrayList[i].total_children = arrayList[i].total_children.plus(1)
                                                hashMap[response.id] = ResponseListComment.ListContentReplyData(
                                                    response.id,
                                                    response.post_id,
                                                    response.thread_id,
                                                    response.parent_id,
                                                    response.created_id,
                                                    response.reply_id,
                                                    response.comment,
                                                    response.user_name_created,
                                                    response.avatar_user,
                                                    response.image,
                                                    response.modified_time,
                                                    response.user_name_reply
                                                )
                                                arrayList[i].post_comments_children?.lastIndex?.let { it1 ->
                                                    arrayList[i].post_comments_children?.set(it1, ResponseListComment.ListContentReplyData(
                                                        response.id,
                                                        response.post_id,
                                                        response.thread_id,
                                                        response.parent_id,
                                                        response.created_id,
                                                        response.reply_id,
                                                        response.comment,
                                                        response.user_name_created,
                                                        response.avatar_user,
                                                        response.image,
                                                        response.modified_time,
                                                        response.user_name_reply,
                                                        false,
                                                        isCommentReplyAddNew=true
                                                    ))
                                                }
                                                adapterComment?.notifyItemChanged(i)

                                            }
                                        }
                                        adapterCommentReply?.notifyDataSetChanged()
                                        adapterComment?.notifyDataSetChanged()
                                        edtSendCommentReply.setText("")
                                    }

                                    response.comment_count?.let {
                                        authViewModel.syncComment.value=CommentEntity(response.post_id!!,it)
                                    }

                                }

                            }
                    }else if (it.status==ApiResult.Status.ERROR || it.status==ApiResult.Status.ERROR_TOKEN){
                        if (threadId == null || threadId == 0){
                            adapterComment?.arrayListComment?.removeAt(0)
                            adapterComment?.notifyDataSetChanged()
                            arrayList.clear()
                            adapterComment?.arrayListComment?.let { it1 ->
                                arrayList.addAll(it1)
                            }
                        }else{
                            for (i in 0 until arrayList.size) {
                                if (arrayList[i].id == threadId) {
                                    arrayList[i].post_comments_children?.lastIndex?.let { position->
                                        arrayList[i].post_comments_children?.removeAt(position)
                                        adapterCommentReply?.notifyDataSetChanged()
                                        adapterComment?.notifyDataSetChanged()
                                    }
                                    break
                                }
                            }
                        }
                        shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status, it.message)
                    }else if (it.status==ApiResult.Status.ERROR_NETWORK){
                        shareViewModel.isNeedShowErr.value=ApiNoticeEntity(it.status,null)
                    } else if (it.status==ApiResult.Status.ERROR_DELETE_POST){
                        val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
                            positionPost?.let {
                                onChangeNumberComment?.onErrorDeletePost(positionPost)
                            }
                            dismiss()

                        }
                        mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                    }else if (it.status==ApiResult.Status.ERROR_DELETE_COMMENT){
                        val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
                            if (positionReplyCommentThread==null && positionReplyCommentLevel2!=null){
                                adapterCommentReply?.removeItem(positionReplyCommentLevel2!!)
                            }
                            if (positionReplyCommentLevel2==null && positionReplyCommentThread!=null) {
                                adapterComment?.removeItem(positionReplyCommentThread!!)
                            }

                            AppUtils.hideKeyboard(view)
                            visibleViewComment(clComment)
                            goneViewComment(clCommentReply, clCommentReply.width.toFloat())
                            threadId = 0
                            detailViewModel.isNotification=false
                            adapterComment?.notifyDataSetChanged()
                        }
                        mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)

                    }

                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        }
    }

    private fun foCusCommentReplyFromNotification(){
            if (detailViewModel.isNotification){
                adapterComment?.arrayListComment?.forEach { commentData ->
                    if (commentData.id==threadId){
                        commentData.post_comments_children?.let {
                            listCommentReply.addAll(commentData.post_comments_children)
                        }
                        setDataLayoutDataReply(commentData,commentData.user_name_created)
                        parentId = commentData.id
                        replyId = commentData.created_id
                    }
                }
            }
    }
    private fun setDataToViewImage(imagePick:ImagePicker?=null) {
        imagePick?.let {
          val uri = Uri.parse(it.uri)
            binding?.clImageView?.visibility=View.VISIBLE
            binding?.imgView?.let {
                Glide.with(it).load(uri).into(it)
            }
            this.imagePickerComment = it
        }
    }

    private fun setDataToViewImageReply(imagePick:ImagePicker?=null) {
        imagePick?.let {
            val uri = Uri.parse(it.uri)
            binding?.clImageViewReply?.visibility=View.VISIBLE
            binding?.imgViewReply?.let {
                Glide.with(it).load(uri).into(it)
            }
            this.imagePickerCommentReply = it
        }
    }

    private fun initAdapter(){
        activity?.let {
            imagePickerAdapter = ImagePickAdapterAvatar(
                    it,
                    getSizeWithScale(111.0),
                    getSizeWithScale(16.0),
                    getSizeWithScale(6.0),
                    itemClickListener = { imagePicker -> setDataToViewImage(imagePicker) },
                    MyApplication.getInstance().getSizeWithScaleFloat(10.0)
            )
            imagePickerAdapterReply = ImagePickAdapterAvatar(
                it,
                getSizeWithScale(111.0),
                getSizeWithScale(16.0),
                getSizeWithScale(6.0),
                itemClickListener = { imagePicker -> setDataToViewImageReply(imagePicker) },
                MyApplication.getInstance().getSizeWithScaleFloat(10.0)
            )
            binding?.rcViewImage?.apply {
                addItemDecoration(MarginDecoration(getSizeWithScale(9.0), 3))
                layoutManager = GridLayoutManager(
                        it, 3,
                        LinearLayoutManager.VERTICAL, false
                )
                adapter?.setHasStableIds(true)
                adapter = imagePickerAdapter
            }
            binding?.rcViewImageReply?.apply {
                addItemDecoration(MarginDecoration(getSizeWithScale(9.0), 3))
                layoutManager = GridLayoutManager(
                    it, 3,
                    LinearLayoutManager.VERTICAL, false
                )
                adapter?.setHasStableIds(true)
                adapter = imagePickerAdapterReply
            }
        }
    }
    // The permissions we need for the app to work properly
    private val permissions = mutableListOf(
        Manifest.permission.CAMERA,
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_EXTERNAL_STORAGE
    ).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            add(Manifest.permission.ACCESS_MEDIA_LOCATION)
        }
    }

    private fun allPermissionsGranted() = permissions.all {
        ContextCompat.checkSelfPermission(requireContext(), it) == PackageManager.PERMISSION_GRANTED
    }

    private val permissionRequest = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
        if (permissions.all { it.value }) {
            onPermissionGranted()
        } else {
            Toast.makeText(activity, resources.getString(R.string.str_no_memory_assess), Toast.LENGTH_SHORT)
                .show()
        }
    }

    // handler after the permission check
    private fun onPermissionGranted(){
        commentViewModel.isPermissionReadWriteExternalStorage=true
        getPicturePaths()
        jobInsertImagePicker.launch {
            flow.collect {
                imagePickerAdapter?.insertImagePicker(it)
                imagePickerAdapterReply?.insertImagePicker(it)
            }
        }
    }

    private fun getPicturePaths(){
        flow= flow {

            val uriExternal = MediaStore.Files.getContentUri("external")

            //read file local image
            val collectionImage = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            val projectionImage = arrayOf(
                MediaStore.Images.Media._ID,
                MediaStore.Images.Media.DISPLAY_NAME,
                MediaStore.Images.Media.SIZE,
            )

            // check file image <5mb
            val thresholdImage = 5 * 1024 * 1024
            val selectionImage = "${MediaStore.Images.ImageColumns.SIZE} <= ?"
            val selectionArgsImage = arrayOf(thresholdImage.toString())
            val sortOder = "${MediaStore.Images.ImageColumns.DATE_MODIFIED} DESC"
            val cursorImage: Cursor? =
                activity?.contentResolver?.query(
                    collectionImage,
                    projectionImage,
                    null,
                    null,
                    sortOder
                )
            var columnIndexIDImage: String
            try {
                cursorImage?.let {
                    cursorImage.moveToFirst()
                    do {
                        val name =
                            cursorImage.getString(cursorImage.getColumnIndexOrThrow(MediaStore.Images.Media.DISPLAY_NAME))
                        columnIndexIDImage =
                            cursorImage.getString(cursorImage.getColumnIndexOrThrow(MediaStore.Images.Media._ID))
                        val uriImage =
                            Uri.withAppendedPath(uriExternal, "" + columnIndexIDImage)
                        val imgPicker = ImagePicker(uriImage.toString(),isVideo = false)
                        activity?.apply {
                            imgPicker.isFormatImage = AppUtils.isFormatImage(AppUtils.getRealPathFromURI(this,uriImage))
                        }
                        if (imgPicker.isFormatImage){
                            listImagePicker.add(imgPicker)
                            emit(imgPicker)
                        }else{
                            val bitmap = MediaStore.Images.Media.getBitmap(requireContext().contentResolver, Uri.parse(imgPicker.uri))
                            val uri = bitmap.compress(context = requireContext()) // uri photos convert

                            var fDelete:File?

                            if(android.os.Build.VERSION.SDK_INT >= 29){
                                fDelete = File(Uri.parse(imgPicker.uri).path)
                            }else{
                                fDelete = File(getRealPathFromURI(Uri.parse(imgPicker.uri),requireContext()))

                            }
                            fDelete.delete(requireContext()) // delete malformed photos

                            imgPicker.uri=uri.toString()
                            imgPicker.isFormatImage=true

                            listImagePicker.add(imgPicker)
                            emit(imgPicker)

                        }
                    } while (cursorImage.moveToNext())
                    cursorImage.close()
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }.flowOn(Dispatchers.IO)
    }

    private fun listenerFocusEdittext(){
        binding?.edtSendComment?.onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus ->
            if (hasFocus){
                binding?.layoutBottom?.hide()
            }
        }
        binding?.edtSendCommentReply?.onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus ->
            if (hasFocus){
                binding?.layoutBottomReply?.hide()
            }
        }
    }
    
    //Start Resize
    private var scaleValue = 0F
    private fun getScaleValue(): Float {
        if (scaleValue == 0F) {
            scaleValue =
                resources.displayMetrics.widthPixels * 1f / AppConst.SCREEN_WIDTH_DESIGN
        }
        return scaleValue
    }

    fun getSizeWithScale(sizeDesign: Double): Int {
        return (sizeDesign * getScaleValue()).toInt()
    }
    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.getDefault().post("dialogComment")
    }
    private fun backToViewComment(){
        try {
            dataComment = adapterComment?.arrayListComment?.get(0)
        }catch (e:Exception){
            e.printStackTrace()
        }
        isSeeMoreComment=false
        detailViewModel.isNotification=false
        AppUtils.hideKeyboard(view)
        visibleViewComment(clComment)
        goneViewComment(clCommentReply, clCommentReply.width.toFloat())
        arrayListReply.clear()
        arrayList.clear()
        adapterComment?.arrayListComment?.clear()
        callApiGetComment(0)
    }

    private fun observerOpenKeyboard(){
        authViewModel.isOpenKeyboard.observe(viewLifecycleOwner,{
            if (it){
                binding?.apply {
                    layoutBottom.hide()
                    layoutBottomReply.hide()
                    layoutBottomKeyboard.show()

                }
            }
            else{
                binding?.layoutBottomKeyboard?.hide()
            }
        })
    }
    private fun getHeightScreen(){
        val mRootWindow: Window = mActivity?.window!!
        val mRootView: View = mRootWindow.decorView.findViewById(android.R.id.content)

        val r = Rect()
        val view = mRootWindow.decorView
        view.getWindowVisibleDisplayFrame(r)
        heightScreen = r.height()
    }
    private fun showViewKeyBoard(){
        val mRootWindow: Window = mActivity?.window!!
        val mRootView: View = mRootWindow.decorView.findViewById(android.R.id.content)

        mRootView.viewTreeObserver.addOnGlobalLayoutListener {
            val r = Rect()
            val view = mRootWindow.decorView
            view.getWindowVisibleDisplayFrame(r)
            val heightKeyboard = heightScreen - r.height()

            binding?.apply {
                layoutBottomKeyboard.layoutParams.height = heightKeyboard

            }

        }
    }
    private fun hideAllLayoutBottom(){
        binding?.apply {
            layoutBottom.hide()
            layoutBottomReply.hide()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        detailViewModel.isNotification=false
        try {
            if ( jobInsertImagePicker.isActive)   jobInsertImagePicker.cancel() // stop coroutine
            flow.cancellable()  // stop flow
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

}