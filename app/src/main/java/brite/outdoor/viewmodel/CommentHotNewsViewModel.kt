package brite.outdoor.viewmodel

import androidx.lifecycle.*
import brite.outdoor.R
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.data.remote.ApiController
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.utils.performGetOperation
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import okhttp3.MultipartBody
import javax.inject.Inject

@HiltViewModel
class CommentHotNewsViewModel @Inject constructor(
    private val gson: Gson,
    apiController: ApiController
) : ViewModel() {

    val contentPost = MutableLiveData("")

    var positionComment :Int? = null
    var positionReplyComment:Int?=null

    val typeReply = MutableLiveData<TYPE>(TYPE.REPLY_COMMENT)
    fun setTypeReply(type:TYPE,positionComment: Int,positionReplyComment: Int?=null){
        typeReply.value=type
        this.positionComment = positionComment
        this.positionReplyComment = positionReplyComment
    }
    enum class TYPE{
        REPLY_COMMENT,
        REPLY_COMMENT_LV2
    }

    private  val _isShowHideLayoutComment = MutableLiveData<Boolean>(true)
    val isShowHideLayoutComment: LiveData<Boolean>
        get()=_isShowHideLayoutComment
    fun setIsShowHideLayoutComment(isShowHideLayoutComment:Boolean){
        _isShowHideLayoutComment.value = isShowHideLayoutComment
    }

    private val _isNotification = MutableLiveData<Boolean>()
    val isNotification: LiveData<Boolean>
        get() = _isNotification
    fun setIsNotification(isNotification:Boolean){
        _isNotification.value = isNotification
    }

    var isPermissionReadWriteExternalStorage : Boolean=false
    private val _imagePickerComment = MutableLiveData<ImagePicker?>()
    val imagePickerComment: LiveData<ImagePicker?>
        get() = _imagePickerComment
    fun setImageImagePickerComment(imagePicker: ImagePicker?){
        _imagePickerComment.value=imagePicker
    }

    private val _edtHint = MutableLiveData<String>()
    val edtHint: LiveData<String>
        get() = _edtHint
    var threadIdReplyComment : Int?=null
    var replyIdComment:Int?=null


    fun setEdtHint(content:String,threadIdReplyComment:Int?=null,replyIdComment:Int?=null){
        _edtHint.value=content
        this.threadIdReplyComment = threadIdReplyComment
        this.replyIdComment = replyIdComment
    }

    val listComment = ArrayList<ResponseListCommentHotNews.CommentHotNews>()
    val listCommentReply = ArrayList<ResponseListCommentHotNews.CommentHotNewsReply>()
    val total_children : Int =0
    var url_prefix_avatar = MutableLiveData<String>()
    val url_prefix_avatar_comment = MutableLiveData<String>()

    fun addAllListReply(list:List<ResponseListCommentHotNews.CommentHotNewsReply>){
        listCommentReply.clear()
        listCommentReply.addAll(list)
    }

    // post Comment
    private val _requestPostComment : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    private val _requestImg : MutableLiveData<MultipartBody.Part> = MutableLiveData()
    fun requestPostComment(requestPostComment : HashMap<String,String>,requestImg: MultipartBody.Part?) {
        _requestPostComment.value = requestPostComment
        _requestImg.value = requestImg
    }
    private val _postCommentResult = _requestPostComment.switchMap {
        performGetOperation(gson) { apiController.postCommentHotNews(it,_requestImg.value) }
    }
    val postCommentResult : LiveData<ApiResult<ResponsePostCommentHotNews.PostCommentHotNewsResult>> = _postCommentResult

    // delete comment
    private val _requestDeleteComment : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestDeleteComment(requestDeleteComment : HashMap<String,String>,id:String,positionComment:Int) {
        _requestDeleteComment.value = requestDeleteComment
        _idPost = id
        this.positionComment = positionComment
    }
    private val _deleteCommentResult = _requestDeleteComment.switchMap {
        performGetOperation(gson) { apiController.deleteCommentHotNews(it,_idPost) }
    }
    val deleteCommentResult : LiveData<ApiResult<ResponseDeleteCommentHotNews.DeleteCommentHotNewsResult>> = _deleteCommentResult

    // delete reply comment
    private val _requestDeleteReplyComment : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestDeleteReplyComment(requestDeleteReplyComment : HashMap<String,String>,id:String,positionComment:Int,positionReplyComment:Int) {
        _requestDeleteReplyComment.value = requestDeleteReplyComment
        _idPost = id
        this.positionComment = positionComment
        this.positionReplyComment = positionReplyComment
    }
    private val _deleteReplyCommentResult = _requestDeleteReplyComment.switchMap {
        performGetOperation(gson) { apiController.deleteCommentHotNews(it,_idPost) }
    }
    val deleteReplyCommentResult : LiveData<ApiResult<ResponseDeleteCommentHotNews.DeleteCommentHotNewsResult>> = _deleteReplyCommentResult

    //list comment Hot News
    var _idPost: String = ""
    private val _requestListCommentHotNews : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestListCommentHotNews(requestListCommentHotNews : HashMap<String,String>,id:String) {
        _requestListCommentHotNews.value = requestListCommentHotNews
        _idPost = id
    }
    private val _listCommentHotNewsResult = _requestListCommentHotNews.switchMap {
        performGetOperation(gson) { apiController.listCommentHotNews(it,_idPost) }
    }
    val listCommentHotNewsResult : LiveData<ApiResult<ResponseListCommentHotNews.ListCommentHotNewsResult>> = _listCommentHotNewsResult

    // list Reply comment
    private val _requestListReplyComment : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestListReplyComment(requestListReplyComment : HashMap<String,String>,id:String) {
        _requestListReplyComment.value = requestListReplyComment
        _idPost = id
    }
    private val _listReplyCommentResult = _requestListReplyComment.switchMap {
        performGetOperation(gson) { apiController.listReplyCommentHotNews(it,_idPost) }
    }
    val listReplyCommentResult : LiveData<ApiResult<ResponseListReplyCommentHotNews.ListReplyCommentHotNewsResult>> = _listReplyCommentResult


}