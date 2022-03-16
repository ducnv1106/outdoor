package brite.outdoor.ui.fragments.question

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import brite.outdoor.R
import brite.outdoor.adapter.AdapterCommentQuestion
import brite.outdoor.adapter.ImagePickAdapterAvatar
import brite.outdoor.adapter.utils.MarginDecoration
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.ApiConst.Companion.PARAM_API_COMMENT_ID
import brite.outdoor.constants.ApiConst.Companion.PARAM_API_REPLY_ID
import brite.outdoor.constants.ApiConst.Companion.PARAM_API_THREAD_ID
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.AppConst.Companion.FRM_COMMENT_QUESTION
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmCommentQuestionBinding
import brite.outdoor.ui.dialog.DialogDelete
import brite.outdoor.ui.dialog.DialogSuccess
import brite.outdoor.ui.fragments.BaseFragment
import brite.outdoor.utils.*
import brite.outdoor.utils.compressor.*
import brite.outdoor.utils.extension.ImageViewExtension.setLikeQuestion
import brite.outdoor.utils.extension.ImageViewExtension.setSaveQuestion
import brite.outdoor.viewmodel.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import java.io.File
import java.util.*
import kotlin.collections.ArrayList


@AndroidEntryPoint
class FrmCommentQuestion(val itemDeleteListener: (Int) -> Unit) : BaseFragment<FrmCommentQuestionBinding>() {

    private val questionViewModel by viewModels<QuestionViewModel>({requireParentFragment()})
    private val mViewModel by viewModels<CommentQuestionViewModel>()
    private val myPostViewModel by viewModels<MyPostViewModel>()
    private val authViewModel by activityViewModels<AuthViewModel>()
    private var adapter:AdapterCommentQuestion?=null
    private var imagePickerAdapter: ImagePickAdapterAvatar? =null
    private var contentSelected : ResponseQuestion.QuestionData?=null
    private var totalLoadMoreResult: Int = AppConst.DEFAULT_TOTAL_RESULT
    private var lastestId:String=""
    private lateinit var flow: Flow<ImagePicker>
    private val listImagePicker: ArrayList<ImagePicker> = ArrayList()
    private val jobInsertImagePicker = CoroutineScope(Dispatchers.Main)

    companion object{
        fun getInstance(itemDeleteListener: (Int) -> Unit): FrmCommentQuestion {
            return FrmCommentQuestion(itemDeleteListener)
        }
    }

    override fun loadControlsAndResize(binding: FrmCommentQuestionBinding?) {

        binding?.apply {
            clTopNav.resizeHeight(getSizeWithScale(56.0))

            layoutQuestion.imgAvatar.layoutParams?.width = MyApplication.getInstance().getSizeWithScale(46.0)
            layoutQuestion.imgAvatar.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(46.0)

            val sizeHeightIcon = MyApplication.getInstance().getSizeWithScale(18.0)
            val sizeWidthIcon = MyApplication.getInstance().getSizeWithScale(18.0)

            layoutQuestion.imgLike.resizeLayout(sizeHeightIcon, sizeWidthIcon)
            layoutQuestion.imgComment.resizeLayout(sizeHeightIcon, sizeWidthIcon)
            layoutQuestion.imgSaved.resizeLayout(sizeHeightIcon, sizeWidthIcon)

            btnImage.layoutParams.width = getSizeWithScale(30.81)
            btnImage.layoutParams.height = getSizeWithScale(25.48)
            layoutBottom.layoutParams.height = MyApplication.getInstance().getSizeWithScale(230.0)
            btnCloseImage.resizeLayout(getSizeWithScale(15.0),getSizeWithScale(15.0))
            clEdtSendComment.minHeight = getSizeWithScale(40.0)
            clImageView.resizeLayout(getSizeWithScale(70.0),getSizeWithScale(90.0))

            imgBack.setSingleClick {
                finish()
            }
            layoutSend.setSingleClick {
                this@FrmCommentQuestion.mViewModel.apply {
                    if (threadIdReplyAnswerQuestion==null) handlerPostAnswerQuestion()
                    else handlerPostReplyCommentQuestion(threadId = threadIdReplyAnswerQuestion?.toString() ?:"",replyId = replyIdAnswerQuestion?.toString() ?:"")
                }
            }
            layoutQuestion.layoutSave.setSingleClick {
                contentSelected?.let {
                    callApiBookMark(it.id)
                }
            }
            layoutQuestion.layoutLike.setSingleClick {
                contentSelected?.let {
                    callApiLike(it.id)
                }
            }
            layoutQuestion.layoutEdit.setSingleClick {
                goToFrmEditQuestion()
            }
            layoutQuestion.layoutTrash.setSingleClick {
                contentSelected?.let {
                    callApiDeleteQuestion(it.id)
                }
            }
            layoutQuestion.clAvatar.setSingleClick {
                contentSelected?.let {
                    mActivity?.showPersonalPageOrMyPage(it.created_id)
                }
            }
            btnImage.setSingleClick {
                if (!this@FrmCommentQuestion.mViewModel.isPermissionReadWriteExternalStorage){
                    if (allPermissionsGranted()){
                        onPermissionGranted()
                    }else{
                        permissionRequest.launch(permissions.toTypedArray())
                    }
                }
                AppUtils.hideKeyboard(view)
                edtContent.clearFocus()
                if (layoutBottom.isVisible) {
                    layoutBottom.hide()
                } else {
                    layoutBottom.show()

                }

            }
            btnCloseImage.setOnClickListener {
                clImageView.visibility=View.GONE
                this@FrmCommentQuestion.mViewModel.setImageImagePickerComment(null)
            }
            rootView.setSingleClick {
                AppUtils.hideKeyboard(view)
                this@FrmCommentQuestion.mViewModel.setEdtHint(resources.getString(R.string.lblAddComment))
            }
            btnSeeMoreComment.setSingleClick {
                if (questionViewModel.isFromNotification.value==true){
                    callApiListAnswerQuestion(questionViewModel.questionId.toString())
                    this@FrmCommentQuestion.mViewModel.setShowSeerMore(false)
                }

            }

        }
    }

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FrmCommentQuestionBinding {
        return FrmCommentQuestionBinding.inflate(inflater)
    }

    override fun initView(savedInstanceState: Bundle?) {
        initViewModel()
        getBinding()?.mViewModel = mViewModel
        getBinding()?.lifecycleOwner = this
        questionViewModel.contentSelected?.let {
            contentSelected = it
            getBinding()?.layoutQuestion?.item = it
            initAdapter(it)
            initViewLayoutComment(it)
            showOrHideItemViewQuestion(it)
        }
        questionViewModel.isFromNotification.observe(this,{
            if (it){
                mViewModel.setShowSeerMore(true)
                callApiDetailQuestion(questionViewModel.questionId.toString())
                callApiListAnswerQuestion(questionViewModel.questionId.toString(),threadId = questionViewModel.threadId.toString(),commentId = questionViewModel.commentId.toString())
            }
        })

        questionViewModel.actionState.observe(this,{
            when(it){
                QuestionViewModel.STATE.NOTIFY_DATA->{
                    getBinding()?.layoutQuestion?.item = questionViewModel.contentSelected
                }
                else -> {}
            }

        })
        contentSelected?.let {
            callApiListAnswerQuestion(it.id.toString(),lastestId)
        }
        observerListAnswerQuestion()
        observerPostAnswerQuestion()
        eventLoadMore()
        observerLikeQuestion()
        observerBookMarkQuestion()
        observerDeleteQuestion()
        observerDeleteAnswerQuestion()
        observerOpenKeyboard()
        observerListReplyAnswerQuestion()
        observerDeleteReplyAnswerQuestion()
        observerDetailQuestion()
        observerChangeLanguage()


    }

    private fun initContentSelected(response:ResponseDetailQuestion.DetailQuestionResponse){
        if (contentSelected==null){
            contentSelected = ResponseQuestion.QuestionData(
                id = response.id,content = response.content,like_count = 0,comment_count = 0,
                is_deleted = 0,created_id = response.created_id,created_time = response.created_time,
                modified_time = response.modified_time,user_name_created = response.user_name_created,
                avatar_user = response.avatar_user,question_likes = response.question_likes,question_bookmarks = response.question_bookmarks,
                state_follow = response.state_follow,url_prefix_avatar = response.url_prefix_avatar
            )
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

    private fun initViewModel(){
        mViewModel.apply {
            setEdtHint(resources.getString(R.string.lblAddComment))
        }
    }


    private fun initAdapter(contentSelected:ResponseQuestion.QuestionData){
        getBinding()?.apply {
            adapter = AdapterCommentQuestion(this@FrmCommentQuestion.mViewModel.listAnswerQuestion,contentSelected.url_prefix_avatar,requireContext(),object :AdapterCommentQuestion.OnClickItemListener{
                override fun onClickReply(entity: ResponseAnswerQuestion.AnswerQuestion, position: Int) {
                    this@FrmCommentQuestion.mViewModel.apply {
                        setEdtHint("${resources.getString(R.string.lblReply)} ${entity.user_name_created}",entity.id,entity.created_id)
                    }
                    focusEdt()
                    this@FrmCommentQuestion.mViewModel.setTypeReply(CommentQuestionViewModel.TYPE.REPLY_ANSWER_QUESTION,position)
                }

                override fun onClickReplyAnswerQuestion(entity: ResponseAnswerQuestion.AnswerQuestion,entityReply: ResponseAnswerQuestion.AnswerQuestionReply, positionAdapterComment: Int,position: Int) {
                    this@FrmCommentQuestion.mViewModel.apply {
                        setEdtHint("${resources.getString(R.string.lblReply)} ${entityReply.user_name_created}",entity.id,entityReply.created_id)
                    }
                    focusEdt()
                    this@FrmCommentQuestion.mViewModel.setTypeReply(CommentQuestionViewModel.TYPE.REPLY_ANSWER_QUESTION_LEVEL2,positionAdapterComment,position)
                }

                override fun onClickDelete(entity: ResponseAnswerQuestion.AnswerQuestion, position: Int) {
                    showDialogDeleteAnswerQuestion(entity.id,position)
                }

                override fun onClickDeleteReplyAnswerQuestion(entity: ResponseAnswerQuestion.AnswerQuestionReply,positionAdapterComment:Int ,position: Int) {
                    showDialogDeleteReplyAnswerQuestion(entity.id,positionAdapterComment,position)

                }

                override fun onClickUserName(entity: ResponseAnswerQuestion.AnswerQuestion) {
                    mActivity?.showPersonalPageOrMyPage(entity.created_id)
                }

                override fun onClickSeeMore(entity: ResponseAnswerQuestion.AnswerQuestion, position: Int,lastestId: String) {
                    if (questionViewModel.isFromNotification.value==true){
                        if (this@FrmCommentQuestion.mViewModel.countCallApiReplyQuestion==0){
                            callApiListReplyAnswerQuestion(entity.id.toString(),"")
                        }else{
                            callApiListReplyAnswerQuestion(entity.id.toString(),lastestId)
                        }

                    }else{
                        callApiListReplyAnswerQuestion(entity.id.toString(),lastestId)
                    }


                }


            },rcView)
            rcView.adapter=adapter
        }
        activity?.let {
            imagePickerAdapter = ImagePickAdapterAvatar(
                it,
                getSizeWithScale(111.0),
                getSizeWithScale(16.0),
                getSizeWithScale(6.0),
                itemClickListener = { imagePicker -> setDataToViewImage(imagePicker) },
                MyApplication.getInstance().getSizeWithScaleFloat(10.0)
            )
            getBinding()?.rcViewImage?.apply {
                addItemDecoration(MarginDecoration(getSizeWithScale(9.0), 3))
                layoutManager = GridLayoutManager(
                    it, 3,
                    LinearLayoutManager.VERTICAL, false
                )
                adapter?.setHasStableIds(true)
                adapter = imagePickerAdapter
            }

        }
    }
    private fun setDataToViewImage(imagePick:ImagePicker?=null) {
        imagePick?.let {
            mViewModel.setImageImagePickerComment(it)
            getBinding()?.clImageView?.visibility=View.VISIBLE

        }
    }
    private fun handlerPostAnswerQuestion(){
        getBinding()?.apply {
            val content = edtContent.text.toString().trim()
            if(this@FrmCommentQuestion.mViewModel.isSelectedSend.value==true){
                contentSelected?.let {
                    callApiPostAnswerQuestion(it.id.toString(),content)
                    clearEditText()
                }
            }
        }
    }
    private fun handlerPostReplyCommentQuestion(threadId: String,replyId: String){
        getBinding()?.apply {
            val content = edtContent.text.toString().trim()
            if(this@FrmCommentQuestion.mViewModel.isSelectedSend.value==true){
                contentSelected?.let {
                    callApiPostReplyAnswerQuestion(it.id.toString(),content,threadId,replyId)
                    clearEditText()
                }
            }
        }
    }
    private fun goToFrmEditQuestion(){
        if (parentFragment is FrmQuestion){
            (parentFragment as FrmQuestion).apply {
                val dialog  = FrmEditQuestion()
                dialog.show(this.childFragmentManager,"FrmEditQuestion")
            }
        }
    }
    private fun handlerDeleteQuestion(){
        finish()
    }

    private fun clearEditText(){
        mViewModel.contentPost.value=""
        mViewModel.setImageImagePickerComment(null)
        mViewModel.setEdtHint(resources.getString(R.string.lblAddComment))
        AppUtils.hideKeyboard(getBinding()?.root)
        getBinding()?.edtContent?.clearFocus()
        getBinding()?.clImageView?.visibility = View.GONE
        getBinding()?.layoutBottom?.hide()

    }


    private fun initViewLayoutComment(item:ResponseQuestion.QuestionData){
        getBinding()?.layoutQuestion?.apply {
            imgLike.setLikeQuestion(item.question_likes,requireContext())
            imgSaved.setSaveQuestion(item.question_bookmarks,requireContext())

        }
    }

    private fun showOrHideItemViewQuestion(item:ResponseQuestion.QuestionData){
        getBinding()?.apply {
            val userId = PrefManager.getInstance(requireContext()).getString(PrefConst.PREF_USER_ID)
            
            layoutQuestion.layoutComment.visibility = View.GONE

            this.layoutQuestion.isQuestionYou = item.created_id == userId?.toInt()

            if (item.created_id == userId?.toInt()){
                layoutQuestion.layoutEdit.visibility = View.VISIBLE
            }

        }
    }

    private fun callApiDetailQuestion(idQuestion: String){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            mViewModel.requestDetailQuestion(requestParam,idQuestion)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerDetailQuestion(){
        mViewModel.detailQuestionResult.observe(this,{
            myPostViewModel.showOrHideLoading(it)
            when(it.status){
                ApiResult.Status.SUCCESS->{
                    if (it.data?.response !is Boolean){
                        if (it.data?.response is ResponseDetailQuestion.DetailQuestionResponse){
                            (it.data.response as ResponseDetailQuestion.DetailQuestionResponse).let { response->
                                initContentSelected(response)
                                contentSelected?.let { item->
                                    questionViewModel.setContentSelected(item)
                                    questionViewModel.idQuestion=response.id
                                    getBinding()?.layoutQuestion?.item = item
                                    initAdapter(item)
                                    initViewLayoutComment(item)
                                    showOrHideItemViewQuestion(item)
                                }
                            }
                        }
                    }
                }
                ApiResult.Status.ERROR_DELETE_POST->{
                    val dismissListener:    DialogInterface.OnDismissListener = DialogInterface.OnDismissListener { finish() }
                    mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                    handlerDeleteQuestion()
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
    }

    private fun callApiListAnswerQuestion(idQuestion: String,lastestId:String="",threadId:String="",commentId:String=""){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_LASTEST_ID] = lastestId
            requestParam[PARAM_API_THREAD_ID] = threadId
            requestParam[PARAM_API_COMMENT_ID] = commentId
            mViewModel.requestListAnswerQuestion(requestParam,idQuestion)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerListAnswerQuestion(){
        mViewModel.listAnswerQuestionResult.observe(this,{
            myPostViewModel.showOrHideLoading(it)
            when(it.status){
                ApiResult.Status.SUCCESS->{
                    if (it.data?.response is ResponseAnswerQuestion.AnswerQuestionResponse){
                        (it.data.response as ResponseAnswerQuestion.AnswerQuestionResponse).let { response->
                            try {
                                if (questionViewModel.isFromNotification.value==true && mViewModel.countCallApiReplyQuestion==0 && questionViewModel.threadId!=0){
                                    response.getListAnswerQuestion()?.let { list ->
                                        val startRange = if (mViewModel.listAnswerQuestion.size == 0) 0 else (mViewModel.listAnswerQuestion.size)
                                        val itemInsertCount = list.size
                                        list.forEach { answer->
                                           answer.question_comments_children.forEach {  answerQuestionReply ->
                                               answerQuestionReply.isAnswerQuestionNew = true
                                           }
                                        }
                                        val listAdd = getDistinctAnswerQuestionReply(mViewModel.listAnswerQuestion,list)
                                        mViewModel.listAnswerQuestion.addAll(listAdd)
                                        adapter?.notifyItemRangeInserted(
                                            startRange,
                                            itemInsertCount
                                        )
                                    }
                                }else{
                                    response.getListAnswerQuestion()?.let { list ->
                                        val startRange = if (mViewModel.listAnswerQuestion.size == 0) 0 else (mViewModel.listAnswerQuestion.size)
                                        val itemInsertCount = list.size
                                        val listAdd = getDistinctAnswerQuestionReply(mViewModel.listAnswerQuestion,list)
                                        mViewModel.listAnswerQuestion.addAll(listAdd)
                                        adapter?.notifyItemRangeInserted(
                                            startRange,
                                            itemInsertCount
                                        )
                                    }
                                }


                            } catch (e: Exception) {
                                e.printStackTrace()
                            }

                            totalLoadMoreResult = response.total?:0
                            adapter?.setLoaded()
                            adapter?.initUrlPrefixComment(response.url_prefix_comment)
                            if (totalLoadMoreResult>0){
                                response.getListAnswerQuestion()?.size?.let { size->
                                    lastestId =  response.getListAnswerQuestion()?.get(size-1)?.id.toString()
                                }
                            }
                        }
                    }
                }
                ApiResult.Status.ERROR_DELETE_POST->{
                    val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
                        if (questionViewModel.currentFragmentQuestion !=0){
                            itemDeleteListener(questionViewModel.positionQuestion)
                        }
                        finish()
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
    }

    private fun callApiListReplyAnswerQuestion(idQuestion: String,lastestId:String=""){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_LASTEST_ID] = lastestId
            mViewModel.requestListReplyAnswerQuestion(requestParam,idQuestion)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerListReplyAnswerQuestion(){
        try {
            mViewModel.listReplyAnswerQuestionResult.observe(this,{
                myPostViewModel.showOrHideLoading(it)
                when(it.status){
                    ApiResult.Status.SUCCESS->{
                        if (it.data?.response !is Boolean){
                            if (it.data?.response is ResponseListReplyAnswerQuestion.ListReplyAnswerQuestionResponse){
                                (it.data.response as ResponseListReplyAnswerQuestion.ListReplyAnswerQuestionResponse).let { response->
                                    response.getListReplyAnswerQuestion()?.let { listReply ->
                                        adapter?.apply {
                                           if (listReply.size>0){
                                               val position =  listAnswerQuestion.withIndex().filter { (_, value)->
                                                   value.id==listReply.first().thread_id
                                               }.map { (i, _)->i }.singleOrNull()
                                               position?.let {
                                                   addListReplyAnswerQuestion(position,listReply)
                                               }
                                           }
                                            mViewModel.countCallApiReplyQuestion+=1
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ApiResult.Status.ERROR_DELETE_POST->{
                        val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
                            if (questionViewModel.currentFragmentQuestion !=0){
                                itemDeleteListener(questionViewModel.positionQuestion)
                            }
                            finish()
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
    private fun callApiPostAnswerQuestion(idQuestion: String,content:String){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_QUESTION_ID] = idQuestion
            requestParam[ApiConst.PARAM_API_COMMENT] = content
            var imagePost: MultipartBody.Part?=null
            mViewModel.imagePickerComment.value?.let {
                prepareFilePart("image", Uri.parse(it.uri))?.let { imgPost ->
                    imagePost = imgPost
                }
            }
            if (!getBinding()?.edtContent?.text.isNullOrEmpty() || imagePost!=null) {
                mViewModel.requestPostAnswerQuestion(requestParam,imagePost)

            }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerPostAnswerQuestion(){
        mViewModel.postAnswerQuestionResult.observe(this,{
            myPostViewModel.showOrHideLoading(it)
            when(it.status){
                ApiResult.Status.SUCCESS->{
                    if (it.data?.response is ResponsePostAnswerQuestion.PostAnswerQuestionResponse){
                        (it.data.response as ResponsePostAnswerQuestion.PostAnswerQuestionResponse).let { response->
                            adapter?.apply {
                                if (response.thread_id==null){
                                    addItemFirstPosition(response)
                                    updateTotalResultWhenAddItem()
                                    contentSelected?.comment_count = response.comment_count
                                    questionViewModel.setActionSate(QuestionViewModel.STATE.NOTIFY_DATA)

                                    it.data.message?.let { message->
                                        showDialogSuccess(message)
                                    }

                                }else{
                                    val position =  listAnswerQuestion.withIndex().filter { (_, value)->
                                        value.id==response.thread_id
                                    }.map { (i, _)->i }.singleOrNull()
                                    position?.let { value->
                                        addItemReplyAnswerQuestion(value,response)
                                    }

                                }

                            }
                        }
                    }
                }
                ApiResult.Status.ERROR_DELETE_POST -> {
                    val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
                        if (questionViewModel.currentFragmentQuestion !=0){
                            itemDeleteListener(questionViewModel.positionQuestion)
                        }

                        finish()

                    }
                    mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                }
                ApiResult.Status.ERROR_DELETE_COMMENT->{
                    val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
                        mViewModel.apply {
                            when(typeReply.value){
                                CommentQuestionViewModel.TYPE.REPLY_ANSWER_QUESTION->{
                                    positionAnswerQuestion?.let { it1 -> adapter?.removeItem(it1) }
                                    updateTotalResultWhenRemoveItem()
                                }
                                CommentQuestionViewModel.TYPE.REPLY_ANSWER_QUESTION_LEVEL2->{
                                    adapter?.apply {
                                        positionAnswerQuestion?.let { positionAnswerQuestion->
                                            val viewHolder = recyclerView.findViewHolderForAdapterPosition(positionAnswerQuestion)
                                            viewHolder?.let {
                                                if (viewHolder is AdapterCommentQuestion.CommentQuestionHolder){
                                                    (viewHolder).apply {
                                                            positionReplyAnswerQuestion?.let { positionReplyAnswerQuestion->
                                                            this.adapterCommentReply?.removeItem(positionReplyAnswerQuestion)
                                                            listAnswerQuestion[positionAnswerQuestion].total_children-=1
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }

                            }
                        }

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
    }
    private fun callApiPostReplyAnswerQuestion(idQuestion: String,content:String,threadId:String,replyId:String){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_QUESTION_ID] = idQuestion
            requestParam[PARAM_API_THREAD_ID] = threadId
            requestParam[ApiConst.PARAM_API_COMMENT] = content
            requestParam[PARAM_API_REPLY_ID] = replyId
            var imagePost: MultipartBody.Part?=null
            mViewModel.imagePickerComment.value?.let {
                prepareFilePart("image", Uri.parse(it.uri))?.let { imgPost ->
                    imagePost = imgPost
                }
            }
            if (!getBinding()?.edtContent?.text.isNullOrEmpty() || imagePost!=null) {
                mViewModel.requestPostAnswerQuestion(requestParam,imagePost)

            }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun callApiLike(idQuestion: Int){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_QUESTION_ID] = idQuestion.toString()
            questionViewModel.requestLikeQuestion(requestParam)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerLikeQuestion(){
        questionViewModel.likeQuestionResult.value?.status=ApiResult.Status.CONSUMED
        try {
            questionViewModel.likeQuestionResult.observe(viewLifecycleOwner, {
                try {
                    myPostViewModel.showOrHideLoading(it)
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            if (it.data?.response !is Boolean) {
                                if (it.data?.response is ResponseLikeQuestion.LikeQuestionResponse) {
                                    (it.data.response as ResponseLikeQuestion.LikeQuestionResponse).let { response->
                                        contentSelected?.question_likes = response.liked
                                        getBinding()?.layoutQuestion?.imgLike?.setLikeQuestion(response.liked,requireContext())
                                    }
                                }
                            }
                        }
                        ApiResult.Status.ERROR_DELETE_POST->{
                            val dismissListener:    DialogInterface.OnDismissListener = DialogInterface.OnDismissListener { finish() }
                            mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                            handlerDeleteQuestion()

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
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun callApiBookMark(idQuestion: Int){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_QUESTION_ID] = idQuestion.toString()
            questionViewModel.requestBookmarkQuestion(requestParam)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerBookMarkQuestion(){
        questionViewModel.bookMarkQuestionResult.value?.status=ApiResult.Status.CONSUMED
        try {
            questionViewModel.bookMarkQuestionResult.observe(viewLifecycleOwner, {
                try {
                    myPostViewModel.showOrHideLoading(it)
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            if (it.data?.response !is Boolean) {
                                if (it.data?.response is ResponseBookMarkQuestion.BookMarkQuestionResponse) {
                                    (it.data.response as ResponseBookMarkQuestion.BookMarkQuestionResponse).let { response->
                                        contentSelected?.question_bookmarks = response.bookMark
                                        getBinding()?.layoutQuestion?.imgSaved?.setSaveQuestion(response.bookMark,requireContext())
                                    }
                                }
                            }
                        }
                        ApiResult.Status.ERROR_DELETE_POST->{
                            val dismissListener:    DialogInterface.OnDismissListener = DialogInterface.OnDismissListener { finish() }
                            mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),dismissListener)
                            handlerDeleteQuestion()


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
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun callApiDeleteQuestion(idQuestion: Int){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            questionViewModel.requestDeleteQuestion(requestParam,idQuestion.toString())
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerDeleteQuestion(){
        questionViewModel.deleteQuestionResult.value?.status=ApiResult.Status.CONSUMED
        try {
            questionViewModel.deleteQuestionResult.observe(viewLifecycleOwner, {
                try {
                    myPostViewModel.showOrHideLoading(it)
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            finish()
                        }
                        ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                            shareViewModel.isNeedShowErr.value= ApiNoticeEntity(it.status, it.message)
                        }
                        else ->{}
                    }
                    // show loading
                    myPostViewModel.isShowLoading.observe(viewLifecycleOwner,{ isShowLoading->
                        shareViewModel.isShowLoading.value=isShowLoading
                    })
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun callApiDeleteAnswerQuestion(idQuestion: Int,positionAnswerQuestion:Int){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            mViewModel.requestDeleteAnswerQuestion(requestParam,idQuestion.toString(),positionAnswerQuestion)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerDeleteAnswerQuestion(){
        mViewModel.deleteAnswerQuestionResult.observe(this,{
            myPostViewModel.showOrHideLoading(it)
            when(it.status){
                ApiResult.Status.SUCCESS->{
                    if (it.data?.response !is Boolean){
                        if (it.data?.response is ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResponse){
                            (it.data.response as ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResponse).let { response->
                                adapter?.apply {
                                    mViewModel.positionAnswerQuestion?.let { position->
                                        removeItem(position)
                                        updateTotalResultWhenRemoveItem()
                                        contentSelected?.comment_count = response.comment_count
                                        questionViewModel.setActionSate(QuestionViewModel.STATE.NOTIFY_DATA)
                                    }
                                }
                            }
                        }
                    }
                }
                ApiResult.Status.ERROR_DELETE_POST -> {
                    val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
                        if (questionViewModel.currentFragmentQuestion !=0){
                            itemDeleteListener(questionViewModel.positionQuestion)
                        }
                        finish()
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
    }

    private fun callApiDeleteReplyAnswerQuestion(idQuestion: Int,positionAnswerQuestion:Int,positionReplyAnswerQuestion:Int){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            mViewModel.requestDeleteReplyAnswerQuestion(requestParam,idQuestion.toString(),positionAnswerQuestion,positionReplyAnswerQuestion)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    private fun observerDeleteReplyAnswerQuestion(){
        mViewModel.deleteReplyAnswerQuestionResult.observe(this,{
            myPostViewModel.showOrHideLoading(it)
            when(it.status){
                ApiResult.Status.SUCCESS->{
                    if (it.data?.response !is Boolean){
                        if (it.data?.response is ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResponse){
                            (it.data.response as ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResponse).let {
                                adapter?.apply {
                                   this@FrmCommentQuestion.mViewModel.positionAnswerQuestion?.let { positionAnswerQuestion->
                                       val viewHolder = recyclerView.findViewHolderForAdapterPosition(positionAnswerQuestion)
                                       viewHolder?.let {
                                           if (viewHolder is AdapterCommentQuestion.CommentQuestionHolder){
                                               (viewHolder).apply {
                                                   this@FrmCommentQuestion.mViewModel.positionReplyAnswerQuestion?.let { positionReplyAnswerQuestion->
                                                       this.adapterCommentReply?.removeItem(positionReplyAnswerQuestion)
                                                       listAnswerQuestion[positionAnswerQuestion].total_children-=1
                                                   }
                                               }
                                           }
                                       }
                                   }
                                }
                            }
                        }
                    }
                }
                ApiResult.Status.ERROR_DELETE_POST -> {
                    val dismissListener: DialogInterface.OnDismissListener = DialogInterface.OnDismissListener {
                        if (questionViewModel.currentFragmentQuestion !=0){
                            itemDeleteListener(questionViewModel.positionQuestion)
                        }
                        finish()
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
    }

    private fun showDialogDeleteAnswerQuestion(idQuestion: Int,positionAnswerQuestion:Int) {
        val dialogDelete = DialogDelete(requireContext())
        dialogDelete.apply {
            show(true, resources.getString(R.string.msgDeleteComment), resources.getString(R.string.msgConfirmDeleteComment), object :
                DialogDelete.OnDeleteAgreeOrCancel{
                override fun onAgree() {
                    callApiDeleteAnswerQuestion(idQuestion,positionAnswerQuestion)
                }
            })
        }
    }
    private fun showDialogDeleteReplyAnswerQuestion(idQuestion: Int,positionAnswerQuestion:Int,positionReplyAnswerQuestion:Int) {
        val dialogDelete = DialogDelete(requireContext())
        dialogDelete.apply {
            show(true, resources.getString(R.string.msgDeleteComment), resources.getString(R.string.msgConfirmDeleteComment), object :
                DialogDelete.OnDeleteAgreeOrCancel{
                override fun onAgree() {
                    callApiDeleteReplyAnswerQuestion(idQuestion,positionAnswerQuestion,positionReplyAnswerQuestion)
                }
            })
        }
    }

    private fun eventLoadMore() {
        adapter?.setLoadMore(object : AdapterCommentQuestion.ILoadMore {
            override fun onLoadMore() {
                try {
                    if (adapter?.listAnswerQuestion?.size ?:0 < totalLoadMoreResult ) {
                        contentSelected?.let {
                            callApiListAnswerQuestion(it.id.toString(),lastestId=lastestId)
                        }

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
        getBinding()?.apply {
            edtContent.requestFocus()
            val imm: InputMethodManager? = mActivity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
            imm?.showSoftInput(edtContent, InputMethodManager.SHOW_IMPLICIT)
        }
    }
    private fun observerOpenKeyboard(){
        authViewModel.isOpenKeyboard.observe(viewLifecycleOwner,{
            if (it){
                getBinding()?.layoutBottom?.hide()
            }

        })
    }

    private fun observerChangeLanguage(){
        authViewModel.isChangeLanguage.observe(viewLifecycleOwner,{
            if (it){
                getBinding()?.apply {
                    tvTopNavTitle.text = resources.getString(R.string.lblCommentVn)
                    adapter?.notifyDataSetChanged()
                    edtContent.hint = resources.getString(R.string.lblAddComment)

                    layoutQuestion.tvEdit.text = resources.getText(R.string.lblEditQuestion)
                    layoutQuestion.tvLike.text = resources.getText(R.string.lblLike)
                    layoutQuestion.tvSave.text = resources.getText(R.string.lblSaved)
                    layoutQuestion.tvTrash.text = resources.getText(R.string.lblDeleteQuestion)
                }
            }

        })
    }


    private fun getDistinctAnswerQuestionReply(fisrtList: List<ResponseAnswerQuestion.AnswerQuestion>, secondList: List<ResponseAnswerQuestion.AnswerQuestion>): List<ResponseAnswerQuestion.AnswerQuestion> {
        return secondList.filter { it.id !in fisrtList.map { item -> item.id } }
    }

    override fun getCurrentFragment(): Int = FRM_COMMENT_QUESTION

    override fun finish() {
        parentFragment?.childFragmentManager?.let {
            mActivity?.closeCommentQuestion(this,it)
            questionViewModel.isFromNotification.value=false
        }

    }

    private fun showDialogSuccess(tvMessage: String) {
        try {
            val dialogSuccess = DialogSuccess(requireContext())
            dialogSuccess.show(tvMessage, false)
            val timeDismiss = Timer()
            timeDismiss.schedule(object : TimerTask() {
                override fun run() {
                    dialogSuccess.dismiss()
                    dialogSuccess.cancel()
                }
            }, 2000)

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun isBackPreviousEnable(): Boolean {
        return false
    }

    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }
    override fun statusBarColor() = AppConst.STATUS_BAR_WHITE

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