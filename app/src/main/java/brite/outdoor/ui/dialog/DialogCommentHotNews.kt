package brite.outdoor.ui.dialog

import android.Manifest
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.Rect
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.text.Layout
import android.text.SpannableString
import android.util.DisplayMetrics
import android.util.Log
import android.view.*
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import brite.outdoor.R
import brite.outdoor.adapter.*
import brite.outdoor.adapter.utils.MarginDecoration
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.ExtraConst
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.LayoutCommentHotNewsBinding
import brite.outdoor.ui.activities.MainActivity
import brite.outdoor.utils.*
import brite.outdoor.utils.compressor.*
import brite.outdoor.viewmodel.*
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.layout_comment_hot_news.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File
import java.lang.Runnable
import java.util.HashMap

@AndroidEntryPoint
class DialogCommentHotNews : BottomSheetDialogFragment() {

    private val mViewModel by viewModels<CommentHotNewsViewModel>()
    private val authViewModel by activityViewModels<AuthViewModel>()
    private val shareViewModel by activityViewModels<ShareViewModel>()
    private val hotNewsViewModel by viewModels<HotNewsViewModel>({requireParentFragment()})
    private val myPostViewModel by viewModels<MyPostViewModel>()
    private var adapter: AdapterCommentHotNews?=null
    private var adapterReplyComment: AdapterCommentReplyHotNews?=null
    private var imagePickerAdapter: ImagePickAdapterAvatar? =null
    private var imagePickerAdapterReply: ImagePickAdapterAvatar? =null
    private var binding: LayoutCommentHotNewsBinding?=null
    private var mActivity : MainActivity? = null
    private var totalLoadMoreResult: Int = AppConst.DEFAULT_TOTAL_RESULT
    private var lastestId:String = ""
    private var postId :Int = 0
    private var positionPost:Int?=null
    private var heightScreen = 0
    private lateinit var flow: Flow<ImagePicker>
    private val listImagePicker: ArrayList<ImagePicker> = ArrayList()
    private val jobInsertImagePicker = CoroutineScope(Dispatchers.Main)

    companion object{
        const val LINES_TEXTVIEW_EXPANDED=100
        const val LINES_TEXTVIEW_COLLAPSE=4

        fun getInstance(mapData: HashMap<String, Any>?):DialogCommentHotNews{
            val dialog = DialogCommentHotNews()
            val bundle = Bundle()
            if (mapData != null) {
                if (mapData.containsKey(ExtraConst.EXTRA_POST_ID))
                    bundle.putInt(
                        ExtraConst.EXTRA_POST_ID, mapData[ExtraConst.EXTRA_POST_ID] as Int
                    )

                if (mapData.containsKey(ExtraConst.EXTRA_POSITION))
                    bundle.putInt(ExtraConst.EXTRA_POSITION, mapData[ExtraConst.EXTRA_POSITION] as Int)

                if (mapData.containsKey(ExtraConst.EXTRA_IS_NOTIFICATION))
                    bundle.putBoolean(ExtraConst.EXTRA_IS_NOTIFICATION,mapData[ExtraConst.EXTRA_IS_NOTIFICATION] as Boolean)
            }
            dialog.arguments=bundle
            return dialog
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
        setStyle(STYLE_NORMAL, R.style.DialogCommentStyle)
        arguments?.apply {
            postId = getInt(ExtraConst.EXTRA_POST_ID)
            positionPost = getInt(ExtraConst.EXTRA_POSITION)
            mViewModel.setIsNotification(getBoolean(ExtraConst.EXTRA_IS_NOTIFICATION))
        }

    }


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
            MyApplication.getInstance().run {
                btnClose.layoutParams?.width = getSizeWithScale(20.0)
                btnClose.layoutParams?.height = getSizeWithScale(20.0)
                btnCloseReply.layoutParams?.width = getSizeWithScale(20.0)
                btnCloseReply.layoutParams?.height = getSizeWithScale(20.0)

                btnSend.resizeLayout(getSizeWithScale(25.0), getSizeWithScale(25.0))
                btnSendReply.resizeLayout(getSizeWithScale(25.0), getSizeWithScale(25.0))

//              clHeaderComment.layoutParams?.height = getSizeWithScale(85.0)

                clEdtSendComment.minHeight = getSizeWithScale(40.0)
                clEdtSendCommentReply.minHeight = getSizeWithScale(40.0)

                btnImage.layoutParams.width = getSizeWithScale(30.81)
                btnImage.layoutParams.height = getSizeWithScale(25.48)

                btnImageReply.layoutParams.width = getSizeWithScale(30.81)
                btnImageReply.layoutParams.height = getSizeWithScale(25.48)

                clImageView.resizeLayout(getSizeWithScale(70.0),getSizeWithScale(90.0))
                clImageViewReply.resizeLayout(getSizeWithScale(70.0),getSizeWithScale(90.0))

                layoutBottom.layoutParams.height = getSizeWithScale(230.0)
                layoutBottomReply.layoutParams.height = getSizeWithScale(230.0)

                btnCloseImage.resizeLayout(getSizeWithScale(15.0),getSizeWithScale(15.0))
                btnCloseImageReply.resizeLayout(getSizeWithScale(15.0),getSizeWithScale(15.0))

                itemComment.apply {
                    imgAvatar.layoutParams?.width = MyApplication.getInstance().getSizeWithScale(46.0)
                    imgAvatar.layoutParams?.height = getSizeWithScale(46.0)
                    imgComment.layoutParams?.width = getSizeWithScale(129.0)
                    imgComment.layoutParams?.height = getSizeWithScale(188.0)
                    (tvContentComment.layoutParams as ConstraintLayout.LayoutParams).marginStart = getSizeWithScale(46.0)
                }
                (rcCommentReply.layoutParams as ConstraintLayout.LayoutParams).marginStart = getSizeWithScale(46.0)
            }

            btnSend.setSingleClick {
                handlerPostComment()
            }
            btnSendReply.setSingleClick {
               this@DialogCommentHotNews.mViewModel.apply {
                   handlerPostReplyComment(threadId = threadIdReplyComment?.toString() ?:"",replyId = replyIdComment?.toString() ?:"")
               }
            }

//            btnSeeMoreComment.setSingleClick {
//                backToViewComment()
//                binding?.layoutBottomReply?.hide()
//            }
            btnClose.setSingleClick {
                dismissAllowingStateLoss()
            }
            btnCloseReply.setSingleClick {
                dismissAllowingStateLoss()
            }
            icBackReply.setSingleClick {
               showLayoutComment()
            }

            btnImage.setSingleClick {
                if (!this@DialogCommentHotNews.mViewModel.isPermissionReadWriteExternalStorage){
                    if (allPermissionsGranted()){
                        onPermissionGranted()
                    }else{
                        permissionRequest.launch(permissions.toTypedArray())
                    }
                }
                binding.apply {
                    rcViewImage.adapter=imagePickerAdapter
                    AppUtils.hideKeyboard(view)
                    edtContent.clearFocus()
                    if (layoutBottom.isVisible) {
                        layoutBottom.hide()
                    } else {
                        layoutBottom.show()
                    }
                    layoutBottomReply.hide()
                }

            }
            btnImageReply.setSingleClick {
                if (!this@DialogCommentHotNews.mViewModel.isPermissionReadWriteExternalStorage){
                    if (allPermissionsGranted()){
                        onPermissionGranted()
                    }else{
                        permissionRequest.launch(permissions.toTypedArray())
                    }
                }
                binding?.apply {
                    rcViewImageReply.adapter=imagePickerAdapterReply
                    AppUtils.hideKeyboard(view)
                    edtContentReply.clearFocus()
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
                this@DialogCommentHotNews.mViewModel.setImageImagePickerComment(null)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LayoutCommentHotNewsBinding.inflate(inflater, container, false)
        initView()
        return binding?.root!!
    }
    private fun initView(){
        binding?.mViewModel = mViewModel
        binding?.lifecycleOwner = this
        mViewModel.setEdtHint(resources.getString(R.string.lblAddComment),0,0)
        loadControlsAndResize()
        initAdapter()
        initMainActivity()
        callApiListComment(idPost = postId.toString())
        observerListComment()
        eventLoadMore()
        observerOpenKeyboard()
        getHeightScreen()
        showViewKeyBoard()
        observerPostComment()
        observerDeleteComment()
        observerDeleteReplyComment()
        observerListReplyAnswerQuestion()

    }
    private fun initMainActivity(){
        if (activity is MainActivity){
            (activity as MainActivity).apply {
                mActivity = this
            }
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

    // handler after the permission check
    private fun onPermissionGranted(){
        mViewModel.isPermissionReadWriteExternalStorage=true
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

                            val fDelete: File = if(Build.VERSION.SDK_INT >= 29){
                                File(Uri.parse(imgPicker.uri).path)
                            }else{
                                File(getRealPathFromURI(Uri.parse(imgPicker.uri),requireContext()))

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

    private fun initAdapter(){
        binding?.apply {
            adapter = AdapterCommentHotNews(this@DialogCommentHotNews.mViewModel.listComment,this@DialogCommentHotNews.mViewModel.url_prefix_avatar,requireContext(),object :AdapterCommentHotNews.OnClickItemListener{
                override fun onClickReply(entity: ResponseListCommentHotNews.CommentHotNews, position: Int) {
                    this@DialogCommentHotNews.mViewModel.apply {
                        setEdtHint("${resources.getString(R.string.lblReply)} ${entity.user_name_created}",entity.id,entity.created_id)
                    }
                    showViewReply(entity,position)
                    focusEdt()
                    this@DialogCommentHotNews.mViewModel.setTypeReply(CommentHotNewsViewModel.TYPE.REPLY_COMMENT_LV2,position,0)
                }

                override fun onClickReplyComment(entity: ResponseListCommentHotNews.CommentHotNews, entityReply: ResponseListCommentHotNews.CommentHotNewsReply, positionAdapterComment: Int, position: Int) {
                    this@DialogCommentHotNews.mViewModel.apply {
                        setEdtHint("${resources.getString(R.string.lblReply)} ${entityReply.user_name_created}",entity.id,entityReply.created_id)
                    }
                    focusEdt()
                    showViewReply(entity,positionAdapterComment)
                    this@DialogCommentHotNews.mViewModel.setTypeReply(CommentHotNewsViewModel.TYPE.REPLY_COMMENT_LV2,positionAdapterComment,position)
                }

                override fun onClickDelete(entity: ResponseListCommentHotNews.CommentHotNews, position: Int) {
                    showDialogDeleteComment(entity.id,position,entity.hot_news_id)
                }

                override fun onClickDeleteCommentReply(entity: ResponseListCommentHotNews.CommentHotNewsReply, positionAdapterComment:Int, position: Int) {
                    showDialogDeleteReplyComment(entity.id,positionAdapterComment,position,entity.hot_news_id)

                }

                override fun onClickUserName(entity: ResponseListCommentHotNews.CommentHotNews) {
                    mActivity?.showPersonalPageOrMyPage(entity.created_id)
                }

                override fun onClickSeeMore(entity: ResponseListCommentHotNews.CommentHotNews, position: Int, lastestId: String) {
                    if (this@DialogCommentHotNews.mViewModel.isNotification.value==true){
//                        if (this@DialogCommentHotNews.mViewModel.countCallApiReplyQuestion==0){
//                            callApiListReplyAnswerQuestion(entity.id.toString(),"")
//                        }else{
//                            callApiListReplyAnswerQuestion(entity.id.toString(),lastestId)
//                        }

                    }else{
                        callApiListReplyAnswerQuestion(entity.id.toString(),lastestId)
                    }

                }


            },rcComment)
            rcComment.adapter=adapter
            adapterReplyComment = AdapterCommentReplyHotNews(this@DialogCommentHotNews.mViewModel.listCommentReply,this@DialogCommentHotNews.mViewModel.url_prefix_avatar ,this@DialogCommentHotNews.mViewModel.url_prefix_avatar_comment,requireContext(),object : AdapterCommentReplyHotNews.OnClickItemListener{
                override fun onClickReply(
                    entity: ResponseListCommentHotNews.CommentHotNewsReply,
                    position: Int
                ) {

                }

                override fun onClickDelete(
                    entity: ResponseListCommentHotNews.CommentHotNewsReply,
                    position: Int
                ) {
                    val positionComment = this@DialogCommentHotNews.mViewModel.listComment.withIndex().filter { (_, value)->
                        value.id==entity.thread_id
                    }.map { (i, _)->i }.singleOrNull()
                    this@DialogCommentHotNews.mViewModel.setTypeReply(CommentHotNewsViewModel.TYPE.REPLY_COMMENT_LV2,positionComment ?: 0,position)
                    callApiDeleteReplyComment(entity.id,positionComment ?: 0,position,entity.hot_news_id)
                }

                override fun onClickUserName(entity: ResponseListCommentHotNews.CommentHotNewsReply) {
                }

            },rcCommentReply,this@DialogCommentHotNews.mViewModel.total_children)
            rcCommentReply.adapter=adapterReplyComment
        }
        activity?.let {
            imagePickerAdapter = ImagePickAdapterAvatar(
                it,
                MyApplication.getInstance().getSizeWithScale(111.0),
                MyApplication.getInstance().getSizeWithScale(16.0),
                MyApplication.getInstance().getSizeWithScale(6.0),
                itemClickListener = { imagePicker -> setDataToViewImage(imagePicker) },
                MyApplication.getInstance().getSizeWithScaleFloat(10.0)
            )
            imagePickerAdapterReply = ImagePickAdapterAvatar(
                it,
                MyApplication.getInstance().getSizeWithScale(111.0),
                MyApplication.getInstance().getSizeWithScale(16.0),
                MyApplication.getInstance().getSizeWithScale(6.0),
                itemClickListener = { imagePicker -> setDataToViewImage(imagePicker) },
                MyApplication.getInstance().getSizeWithScaleFloat(10.0)
            )
            binding?.rcViewImage?.apply {
                addItemDecoration(MarginDecoration(MyApplication.getInstance().getSizeWithScale(9.0), 3))
                layoutManager = GridLayoutManager(
                    it, 3,
                    LinearLayoutManager.VERTICAL, false
                )
                adapter?.setHasStableIds(true)
                adapter = imagePickerAdapter
            }
            binding?.rcViewImageReply?.apply {
                addItemDecoration(MarginDecoration(MyApplication.getInstance().getSizeWithScale(9.0), 3))
                layoutManager = GridLayoutManager(
                    it, 3,
                    LinearLayoutManager.VERTICAL, false
                )
                adapter?.setHasStableIds(true)
                adapter = imagePickerAdapterReply
            }

        }
    }
    private fun setDataToViewImage(imagePick:ImagePicker?=null) {
        imagePick?.let {
            mViewModel.setImageImagePickerComment(it)
            binding?.clImageView?.visibility=View.VISIBLE

        }
    }

    private fun callApiListComment(idPost: String,lastestId:String="",threadId:String="",commentId:String=""){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_LASTEST_ID] = lastestId
            requestParam[ApiConst.PARAM_API_THREAD_ID] = threadId
            requestParam[ApiConst.PARAM_API_COMMENT_ID] = commentId
            mViewModel.requestListCommentHotNews(requestParam,idPost)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerListComment(){
        mViewModel.listCommentHotNewsResult.observe(this,{
            when(it.status){
                ApiResult.Status.SUCCESS->{
                    if (it.data?.response is ResponseListCommentHotNews.ListCommentHotNewsResponse){
                        (it.data.response as ResponseListCommentHotNews.ListCommentHotNewsResponse).let { response->
                            try {
//                                if (questionViewModel.isFromNotification.value==true && mViewModel.countCallApiReplyQuestion==0 && questionViewModel.threadId!=0){
//                                    response.getListAnswerQuestion()?.let { list ->
//                                        val startRange = if (mViewModel.listAnswerQuestion.size == 0) 0 else (mViewModel.listAnswerQuestion.size)
//                                        val itemInsertCount = list.size
//                                        list.forEach { answer->
//                                            answer.question_comments_children.forEach {  answerQuestionReply ->
//                                                answerQuestionReply.isAnswerQuestionNew = true
//                                            }
//                                        }
//                                        val listAdd = getDistinctAnswerQuestionReply(mViewModel.listAnswerQuestion,list)
//                                        mViewModel.listAnswerQuestion.addAll(listAdd)
//                                        adapter?.notifyItemRangeInserted(
//                                            startRange,
//                                            itemInsertCount
//                                        )
//                                    }
//                                }else{
//                                    response.listCommentHotNews()?.let { list ->
//                                        val startRange = if (mViewModel.listComment.size == 0) 0 else (mViewModel.listComment.size)
//                                        val itemInsertCount = list.size
//                                        val listAdd = getDistinctAnswerQuestionReply(mViewModel.listComment,list)
//                                        mViewModel.listComment.addAll(listAdd)
//                                        adapter?.notifyItemRangeInserted(
//                                            startRange,
//                                            itemInsertCount
//                                        )
//                                    }urlPrefixAvatar
//                                }
                                mViewModel.url_prefix_avatar.value = response.url_prefix_avatar
                                mViewModel.url_prefix_avatar_comment.value = response.url_prefix_comment

                                response.listCommentHotNews()?.let { list ->
                                    val startRange = if (mViewModel.listComment.size == 0) 0 else (mViewModel.listComment.size)
                                    val itemInsertCount = list.size
                                    val listAdd = getDistinctComment(mViewModel.listComment,list)
                                    mViewModel.listComment.addAll(listAdd)
                                    adapter?.notifyItemRangeInserted(
                                        startRange,
                                        itemInsertCount
                                    )
                                }



                            } catch (e: Exception) {
                                e.printStackTrace()
                            }

                            totalLoadMoreResult = response.total?:0
                            adapter?.setLoaded()
                            adapter?.initUrlPrefixComment(response.url_prefix_comment)
                            if (totalLoadMoreResult>0){
                                response.listCommentHotNews()?.size?.let { size->
                                    lastestId =  response.listCommentHotNews()?.get(size-1)?.id.toString()
                                }
                            }
                        }
                    }
                }
                else->{}
            }
        })
    }

    private fun callApiDeleteComment(idComment: Int,positionComment:Int,idPost: Int){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_HOT_NEWS_ID] = idPost.toString()
            mViewModel.requestDeleteComment(requestParam,idComment.toString(),positionComment)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    private fun observerDeleteComment(){
        mViewModel.deleteCommentResult.observe(this,{
            myPostViewModel.showOrHideLoading(it)
            when(it.status){
                ApiResult.Status.SUCCESS->{
                    if (it.data?.response !is Boolean){
                        if (it.data?.response is ResponseDeleteCommentHotNews.DeleteCommentHotNewsResponse){
                            (it.data.response as ResponseDeleteCommentHotNews.DeleteCommentHotNewsResponse).let { response->
                                adapter?.apply {
                                    mViewModel.positionComment?.let { position->
                                        removeItem(position)
                                        updateTotalResultWhenRemoveItem()
                                        showLayoutComment()
                                    }
                                }
                            }
                        }
                    }
                }
                ApiResult.Status.ERROR_DELETE_POST -> {
                    val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
//                        if (questionViewModel.currentFragmentQuestion !=0){
//                            itemDeleteListener(questionViewModel.positionQuestion)
//                        }
//                        finish()
                    }
                    mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                }
                ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                    shareViewModel.isNeedShowErr.value= ApiNoticeEntity(it.status, it.message)
                }
                else->{}
            }
            // show loading
            myPostViewModel.isShowLoading.observe(viewLifecycleOwner,{ isShowLoading->
                shareViewModel.isShowLoading.value=isShowLoading
            })
        })
    }

    private fun callApiDeleteReplyComment(idComment: Int,positionComment:Int,positionReplyComment:Int,idPost: Int){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_HOT_NEWS_ID] = idPost.toString()
            mViewModel.requestDeleteReplyComment(requestParam,idComment.toString(),positionComment,positionReplyComment)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    private fun observerDeleteReplyComment(){
        mViewModel.deleteReplyCommentResult.observe(this,{
            myPostViewModel.showOrHideLoading(it)
            when(it.status){
                ApiResult.Status.SUCCESS->{
                    if (it.data?.response !is Boolean){
                        if (it.data?.response is ResponseDeleteCommentHotNews.DeleteCommentHotNewsResponse){
                            (it.data.response as ResponseDeleteCommentHotNews.DeleteCommentHotNewsResponse).let {
                                when(this@DialogCommentHotNews.mViewModel.typeReply.value){
                                    CommentHotNewsViewModel.TYPE.REPLY_COMMENT->{
                                        adapter?.apply {
                                            this@DialogCommentHotNews.mViewModel.positionComment?.let { positionComment->
                                                val viewHolder = recyclerView.findViewHolderForAdapterPosition(positionComment)
                                                viewHolder?.let {
                                                    if (viewHolder is AdapterCommentHotNews.CommentHotNewsHolder){
                                                        (viewHolder).apply {
                                                            this@DialogCommentHotNews.mViewModel.positionReplyComment?.let { positionReplyComment->
                                                                this.adapterCommentReply?.removeItem(positionReplyComment)
                                                                listComment[positionReplyComment].total_children-=1
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    CommentHotNewsViewModel.TYPE.REPLY_COMMENT_LV2->{
                                        adapterReplyComment?.apply {
                                            this@DialogCommentHotNews.mViewModel.positionReplyComment?.let { position->
                                                removeItem(position)
                                            }
                                        }
                                        adapter?.apply {
                                            this@DialogCommentHotNews.mViewModel.positionComment?.let { positionComment->
                                                val viewHolder = recyclerView.findViewHolderForAdapterPosition(positionComment)
                                                viewHolder?.let {
                                                    if (viewHolder is AdapterCommentHotNews.CommentHotNewsHolder){
                                                        (viewHolder).apply {
//                                                            this@DialogCommentHotNews.mViewModel.positionReplyComment?.let { positionReplyComment->
//                                                                this.adapterCommentReply?.removeItem(positionReplyComment)
//                                                                listComment[positionReplyComment].total_children-=1
//                                                            }
                                                            val position =  this@DialogCommentHotNews.mViewModel.listComment[positionComment].post_comments_children.withIndex().filter { (_, value)->
                                                                value.id==this@DialogCommentHotNews.mViewModel._idPost.toInt()
                                                            }.map { (i, _)->i }.singleOrNull()
                                                            position?.let { it ->
                                                                this.adapterCommentReply?.removeItem(it)
                                                            }
                                                            listComment[positionComment].total_children-=1
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    else->{}
                                }

                            }
                        }
                    }
                }
                ApiResult.Status.ERROR_DELETE_POST -> {
                    val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
//                        if (questionViewModel.currentFragmentQuestion !=0){
//                            itemDeleteListener(questionViewModel.positionQuestion)
//                        }
//                        finish()
                    }
                    mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                }
                ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                    shareViewModel.isNeedShowErr.value= ApiNoticeEntity(it.status, it.message)
                }
                else->{}
            }
            // show loading
            myPostViewModel.isShowLoading.observe(viewLifecycleOwner,{ isShowLoading->
                shareViewModel.isShowLoading.value=isShowLoading
            })
        })
    }

    private fun callApiPostComment(idPost: String,content:String){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_HOT_NEWS_ID] = idPost
            requestParam[ApiConst.PARAM_API_COMMENT] = content
            var imagePost: MultipartBody.Part?=null
            mViewModel.imagePickerComment.value?.let {
                prepareFilePart("image", Uri.parse(it.uri))?.let { imgPost ->
                    imagePost = imgPost
                }
            }
            if (!binding?.edtContent?.text.isNullOrEmpty() || imagePost!=null) {
                mViewModel.requestPostComment(requestParam,imagePost)

            }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerPostComment(){
        mViewModel.postCommentResult.observe(this,{
            myPostViewModel.showOrHideLoading(it)
            when(it.status){
                ApiResult.Status.SUCCESS->{
                    if (it.data?.response is ResponsePostCommentHotNews.PostCommentHotNewsResponse){
                        (it.data.response as ResponsePostCommentHotNews.PostCommentHotNewsResponse).let { response->
                            adapter?.apply {
                                if (response.thread_id==null){
                                    addItemFirstPosition(response)
                                    updateTotalResultWhenAddItem()
                                    hotNewsViewModel.contentSelected?.comment_count = response.comment_count
                                    hotNewsViewModel.setActionSate(HotNewsViewModel.STATE.NOTIFY_DATA)

//                                    it.data.message?.let { message->
//                                        showDialogSuccess(message)
//                                    }

                                }else{
                                    val position =  listComment.withIndex().filter { (_, value)->
                                        value.id==response.thread_id
                                    }.map { (i, _)->i }.singleOrNull()
                                    position?.let { value->
                                        addItemReplyComment(value,response)
                                    }

                                    try {
                                        mViewModel.listCommentReply.add(getItemReplyComment(response))
                                        adapterReplyComment?.notifyItemChanged(mViewModel.listCommentReply.size)
                                    }catch (e:Exception){
                                        e.printStackTrace()
                                    }

                                }

                            }
                        }
                    }
                }

                else->{}
            }
            // show loading
            myPostViewModel.isShowLoading.observe(viewLifecycleOwner,{ isShowLoading->
                shareViewModel.isShowLoading.value=isShowLoading
            })
        })
    }

    private fun callApiListReplyAnswerQuestion(idPost: String,lastestId:String=""){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_LASTEST_ID] = lastestId
            mViewModel.requestListReplyComment(requestParam,idPost)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerListReplyAnswerQuestion(){
        try {
            mViewModel.listReplyCommentResult.observe(this,{
                myPostViewModel.showOrHideLoading(it)
                when(it.status){
                    ApiResult.Status.SUCCESS->{
                        if (it.data?.response !is Boolean){
                            if (it.data?.response is ResponseListReplyCommentHotNews.ListReplyCommentHotNewsResponse){
                                (it.data.response as ResponseListReplyCommentHotNews.ListReplyCommentHotNewsResponse).let { response->
                                    response.getListReplyComment()?.let { listReply ->
                                        adapter?.apply {
                                            if (listReply.size>0){
                                                val position =  listComment.withIndex().filter { (_, value)->
                                                    value.id==listReply.first().thread_id
                                                }.map { (i, _)->i }.singleOrNull()
                                                position?.let {
                                                    addListReplyComment(position,listReply)
                                                    Log.e("TAG", "${listReply.size}",)
                                                }
                                            }
//                                            mViewModel.countCallApiReplyQuestion+=1
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ApiResult.Status.ERROR_DELETE_POST->{
                        val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
//                            if (questionViewModel.currentFragmentQuestion !=0){
//                                itemDeleteListener(questionViewModel.positionQuestion)
//                            }
//                            finish()
                        }
                        mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                    }
                    ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                        shareViewModel.isNeedShowErr.value= ApiNoticeEntity(it.status, it.message)
                    }
                    else -> {}
                }
                // show loading
                myPostViewModel.isShowLoading.observe(viewLifecycleOwner,{ isShowLoading->
                    shareViewModel.isShowLoading.value=isShowLoading
                })
            })
        }catch (e:Exception){
            e.printStackTrace()
        }

    }

    private fun callApiPostReplyComment(idPost: String,content:String,threadId:String,replyId:String){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_HOT_NEWS_ID] = idPost
            requestParam[ApiConst.PARAM_API_THREAD_ID] = threadId
            requestParam[ApiConst.PARAM_API_COMMENT] = content
            requestParam[ApiConst.PARAM_API_REPLY_ID] = replyId
            var imagePost: MultipartBody.Part?=null
            mViewModel.imagePickerComment.value?.let {
                prepareFilePart("image", Uri.parse(it.uri))?.let { imgPost ->
                    imagePost = imgPost
                }
            }
            if (!binding?.edtContent?.text.isNullOrEmpty() || imagePost!=null) {
                mViewModel.requestPostComment(requestParam,imagePost)

            }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    private fun handlerPostComment(){
        binding?.apply {
            val content = edtContent.text.toString().trim()
            callApiPostComment(postId.toString(),content)
            clearEditText()
        }
    }
    private fun handlerPostReplyComment(threadId: String,replyId: String){
        binding?.apply {
            val content = edtContentReply.text.toString().trim()
            callApiPostReplyComment(postId.toString(),content,threadId,replyId)
            clearEditText()
        }
    }

    private fun eventLoadMore() {
        adapter?.setLoadMore(object : AdapterCommentHotNews.ILoadMore {
            override fun onLoadMore() {
                try {
                    if (adapter?.listComment?.size ?:0 < totalLoadMoreResult ) {
                        callApiListComment(postId.toString(),lastestId=lastestId)
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }

        })
    }

    private fun updateTotalResultWhenRemoveItem(){
        totalLoadMoreResult--
    }
    private fun updateTotalResultWhenAddItem(){
        totalLoadMoreResult++
    }

    private fun focusEdt(){
        binding?.apply {
            edtContentReply.requestFocus()
            val imm: InputMethodManager? = mActivity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
            imm?.showSoftInput(edtContentReply, InputMethodManager.SHOW_IMPLICIT)
        }
    }
    private fun showViewReply(entity: ResponseListCommentHotNews.CommentHotNews,positionComment: Int){
        binding?.apply {
            this@DialogCommentHotNews.mViewModel.setIsShowHideLayoutComment(false)
            this@DialogCommentHotNews.mViewModel.addAllListReply(entity.post_comments_children)
            adapterReplyComment?.notifyDataSetChanged()
            itemComment.item = entity
            initViewReply(entity,positionComment)

        }
    }
    private fun initViewReply(entity: ResponseListCommentHotNews.CommentHotNews,positionComment: Int){
        try {
            binding?.apply {
                itemComment.apply {
                    MyApplication.getInstance().run {
                        imgAvatar.loadImageAvatar(entity.avatar_user,this@DialogCommentHotNews.mViewModel.url_prefix_avatar.value,100)
                        tvDelete.text = resources.getString(R.string.lblDelete)
                        tvReply.text = resources.getString(R.string.lblReply)

                        tvName.text = entity.user_name_created

                        val userId = PrefManager.getInstance(requireContext()).getString(PrefConst.PREF_USER_ID)
                        if (userId?.toInt() == entity.created_id ){
                            tvDelete.visibility = View.VISIBLE
                        }else{
                            tvDelete.visibility = View.GONE
                        }

                        if (!entity.image.isNullOrEmpty() && !this@DialogCommentHotNews.mViewModel.url_prefix_avatar_comment.value.isNullOrEmpty()){
                            imgComment.loadImageWithCustomCorners(urlImage(entity.image, this@DialogCommentHotNews.mViewModel.url_prefix_avatar_comment.value),10)
                            imgComment.visibility = View.VISIBLE
                        }else imgComment.visibility = View.GONE

                        val spannableString = SpannableString("${entity.comment}")
                        tvContentComment.apply {
                            text = spannableString

                        }
                        if (!entity.isMaxLine){
                            tvContentComment.maxLines = LINES_TEXTVIEW_COLLAPSE
                            btnSeeTextMore.text = resources?.getString(R.string.lblSeeMore)
                            btnSeeTextMore.setTextColor(Color.BLUE)
                        }else{
                            tvContentComment.maxLines= LINES_TEXTVIEW_EXPANDED
                            btnSeeTextMore.text =  resources?.getString(R.string.lbCollapse)
                            btnSeeTextMore.setTextColor(Color.RED)
                        }

                        tvDelete.setSingleClick {
                            showDialogDeleteComment(entity.id,positionComment,entity.hot_news_id)
                        }

                        btnSeeTextMore.setSingleClick {
                            if (!entity.isMaxLine){
                                tvContentComment.maxLines= LINES_TEXTVIEW_EXPANDED
                                btnSeeTextMore.text = resources?.getString(R.string.lbCollapse)
                                btnSeeTextMore.setTextColor(Color.RED)
                            }else{
                                tvContentComment.maxLines =
                                    AdapterCommentHotNews.LINES_TEXTVIEW_COLLAPSE
                                btnSeeTextMore.text = resources?.getString(R.string.lblSeeMore)
                                btnSeeTextMore.setTextColor(Color.BLUE)
                            }
                            entity.isMaxLine = !entity.isMaxLine
                        }
                        tvContentComment.post(Runnable {
                            val layout: Layout? = tvContentComment.layout
                            val lines: Int? = layout?.lineCount
                            if (lines==null){
                                btnSeeMore.visibility = View.GONE
                                return@Runnable
                            }
                            if (lines > 0) {
                                val ellipsisCount: Int = lines.minus(1).let {
                                    layout.getEllipsisCount(
                                        it
                                    )
                                }
                                if (ellipsisCount  > 0) {
                                    btnSeeTextMore.visibility = View.VISIBLE
                                }else{
                                    if (lines< LINES_TEXTVIEW_COLLAPSE) {
                                        btnSeeTextMore.visibility = View.GONE
                                    }else{
                                        btnSeeTextMore.visibility = View.VISIBLE
                                    }
                                }
                            }

                        })
                    }
                }

            }
        }catch (e:Exception){
            e.printStackTrace()
        }

    }
    private fun clearEditText(){
        mViewModel.contentPost.value=""
        mViewModel.setImageImagePickerComment(null)
//        mViewModel.setEdtHint(resources.getString(R.string.lblAddComment))
        AppUtils.hideKeyboard(binding?.root)
        binding?.apply {
            edtContent.clearFocus()
            edtContentReply.clearFocus()
            clImageView.visibility = View.GONE
            clImageViewReply.visibility = View.GONE
            layoutBottom.hide()
            layoutBottomReply.hide()
        }

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

    private fun showDialogDeleteComment(idComment: Int,positionComment:Int,idPost: Int) {
        val dialogDelete = DialogDelete(requireContext())
        dialogDelete.apply {
            show(true, resources.getString(R.string.msgDeleteComment), resources.getString(R.string.msgConfirmDeleteComment), object :
                DialogDelete.OnDeleteAgreeOrCancel{
                override fun onAgree() {
                    callApiDeleteComment(idComment,positionComment,idPost)
                }
            })
        }
    }
    private fun showDialogDeleteReplyComment(idComment: Int,positionComment:Int,positionReplyComment:Int,idPost: Int) {
        val dialogDelete = DialogDelete(requireContext())
        dialogDelete.apply {
            show(true, resources.getString(R.string.msgDeleteComment), resources.getString(R.string.msgConfirmDeleteComment), object :
                DialogDelete.OnDeleteAgreeOrCancel{
                override fun onAgree() {
                    callApiDeleteReplyComment(idComment,positionComment,positionReplyComment,idPost)
                }
            })
        }
    }
    private fun showLayoutComment(){
        this@DialogCommentHotNews.mViewModel.setTypeReply(CommentHotNewsViewModel.TYPE.REPLY_COMMENT,0,0)
        this@DialogCommentHotNews.mViewModel.setIsShowHideLayoutComment(true)
        this@DialogCommentHotNews.mViewModel.setEdtHint(resources.getString(R.string.lblAddComment),0,0)
        AppUtils.hideKeyboard(view)
    }

    private fun getDistinctComment(fisrtList: List<ResponseListCommentHotNews.CommentHotNews>, secondList: List<ResponseListCommentHotNews.CommentHotNews>): List<ResponseListCommentHotNews.CommentHotNews> {
        return secondList.filter { it.id !in fisrtList.map { item -> item.id } }
    }
    private fun getItemReplyComment(item: ResponsePostCommentHotNews.PostCommentHotNewsResponse):ResponseListCommentHotNews.CommentHotNewsReply{
        return ResponseListCommentHotNews.CommentHotNewsReply(
            id = item.id,hot_news_id = item.hot_news_id,thread_id = item.thread_id,parent_id = item.parent_id,
            comment = item.comment,image = item.image,weight_flag = item.weight_flag,is_deleted = item.is_deleted,
            created_id = item.created_id,created_time = item.created_time,modified_time = item.modified_time,
            user_name_created = item.user_name_created,avatar_user = item.avatar_user,user_name_reply = item.user_name_reply,isCommentNew = true

        )
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }



}