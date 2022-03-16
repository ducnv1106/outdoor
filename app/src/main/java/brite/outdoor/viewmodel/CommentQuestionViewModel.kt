package brite.outdoor.viewmodel

import android.util.Log
import androidx.lifecycle.*
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.data.remote.ApiController
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.utils.performGetOperation
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.combine
import okhttp3.MultipartBody
import javax.inject.Inject

@HiltViewModel
class CommentQuestionViewModel @Inject constructor(
    private val gson: Gson,
    apiController: ApiController
) : ViewModel() {

    private val _isShowSeeMoreComment = MutableLiveData<Boolean>(false)
    val isShowSeeMoreComment: LiveData<Boolean>
        get() = _isShowSeeMoreComment
    fun setShowSeerMore(isShow:Boolean){
        _isShowSeeMoreComment.value=isShow
    }
    var countCallApiReplyQuestion = 0
    val typeReply = MutableLiveData<TYPE>(TYPE.REPLY_ANSWER_QUESTION)
    fun setTypeReply(type:TYPE,positionAnswerQuestion: Int,positionReplyAnswerQuestion: Int?=null){
        typeReply.value=type
        this.positionAnswerQuestion = positionAnswerQuestion
        this.positionReplyAnswerQuestion = positionReplyAnswerQuestion
    }
    enum class TYPE{
        REPLY_ANSWER_QUESTION,
        REPLY_ANSWER_QUESTION_LEVEL2
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
    var threadIdReplyAnswerQuestion : Int?=null
    var replyIdAnswerQuestion:Int?=null

    fun setEdtHint(content:String,threadIdReplyAnswerQuestion:Int?=null,replyIdAnswerQuestion:Int?=null){
        _edtHint.value=content
        this.threadIdReplyAnswerQuestion = threadIdReplyAnswerQuestion
        this.replyIdAnswerQuestion = replyIdAnswerQuestion
    }

    val contentPost = MutableLiveData("")

    private val _lengthContent: LiveData<Int> = contentPost.switchMap {
        liveData {
            emit(it.length)
        }
    }
    val lengthContent: LiveData<Int> = _lengthContent

    private val _isSelectedTextView  : LiveData<Boolean> = contentPost.switchMap {
        liveData {
            if (it.isEmpty()) emit(false)
            else emit(true)
        }

    }
    private val _isSelectedImage : LiveData<Boolean> = imagePickerComment.switchMap {
        liveData {
            if (it==null) emit(false)
            else emit(true)
        }
    }
    val isSelectedSend : MediatorLiveData<Boolean> = MediatorLiveData<Boolean>().apply {
        addSource(_isSelectedTextView) {
            value = it
        }
        addSource(_isSelectedImage) {
            value = it
        }
    }

    var positionAnswerQuestion :Int? = null
    var positionReplyAnswerQuestion:Int?=null

    val listAnswerQuestion = ArrayList<ResponseAnswerQuestion.AnswerQuestion>()

    //answer question
    private var _idQuestion: String = ""
    private val _requestListAnswerQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestListAnswerQuestion(requestListAnswerQuestion : HashMap<String,String>,id:String) {
        _requestListAnswerQuestion.value = requestListAnswerQuestion
        _idQuestion = id
    }
    private val _listAnswerQuestionResult = _requestListAnswerQuestion.switchMap {
        performGetOperation(gson) { apiController.listAnswerQuestion(it,_idQuestion) }
    }
    val listAnswerQuestionResult : LiveData<ApiResult<ResponseAnswerQuestion.AnswerQuestionResult>> = _listAnswerQuestionResult

    //detail question
    private val _requestDetailQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestDetailQuestion(requestDetailQuestion : HashMap<String,String>,id:String) {
        _requestDetailQuestion.value = requestDetailQuestion
        _idQuestion = id
    }
    private val _detailQuestionResult = _requestDetailQuestion.switchMap {
        performGetOperation(gson) { apiController.detailQuestion(it,_idQuestion) }
    }
    val detailQuestionResult : LiveData<ApiResult<ResponseDetailQuestion.DetailQuestionResult>> = _detailQuestionResult

    // post answer
    private val _requestPostAnswerQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    private val _requestImg : MutableLiveData<MultipartBody.Part> = MutableLiveData()
    fun requestPostAnswerQuestion(requestPostAnswerQuestion : HashMap<String,String>,requestImg: MultipartBody.Part?) {
        _requestPostAnswerQuestion.value = requestPostAnswerQuestion
        _requestImg.value = requestImg
    }
    private val _postAnswerQuestionResult = _requestPostAnswerQuestion.switchMap {
        performGetOperation(gson) { apiController.postAnswerQuestion(it,_requestImg.value) }
    }
    val postAnswerQuestionResult : LiveData<ApiResult<ResponsePostAnswerQuestion.PostAnswerQuestionResult>> = _postAnswerQuestionResult

    // delete answer question
    private val _requestDeleteAnswerQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestDeleteAnswerQuestion(requestDeleteAnswerQuestion : HashMap<String,String>,id:String,positionAnswerQuestion:Int) {
        _requestDeleteAnswerQuestion.value = requestDeleteAnswerQuestion
        _idQuestion = id
        this.positionAnswerQuestion = positionAnswerQuestion
    }
    private val _deleteAnswerQuestionResult = _requestDeleteAnswerQuestion.switchMap {
        performGetOperation(gson) { apiController.deleteAnswerQuestion(it,_idQuestion) }
    }
    val deleteAnswerQuestionResult : LiveData<ApiResult<ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResult>> = _deleteAnswerQuestionResult

    // delete reply answer question
    private val _requestDeleteReplyAnswerQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestDeleteReplyAnswerQuestion(requestDeleteReplyAnswerQuestion : HashMap<String,String>,id:String,positionAnswerQuestion:Int,positionReplyAnswerQuestion:Int) {
        _requestDeleteReplyAnswerQuestion.value = requestDeleteReplyAnswerQuestion
        _idQuestion = id
        this.positionAnswerQuestion = positionAnswerQuestion
        this.positionReplyAnswerQuestion = positionReplyAnswerQuestion
    }
    private val _deleteReplyAnswerQuestionResult = _requestDeleteReplyAnswerQuestion.switchMap {
        performGetOperation(gson) { apiController.deleteAnswerQuestion(it,_idQuestion) }
    }
    val deleteReplyAnswerQuestionResult : LiveData<ApiResult<ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResult>> = _deleteReplyAnswerQuestionResult

    // list Reply answer question
    private val _requestListReplyAnswerQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestListReplyAnswerQuestion(requestDeleteAnswerQuestion : HashMap<String,String>,id:String) {
        _requestListReplyAnswerQuestion.value = requestDeleteAnswerQuestion
        _idQuestion = id
    }
    private val _listReplyAnswerQuestionResult = _requestListReplyAnswerQuestion.switchMap {
        performGetOperation(gson) { apiController.listReplyAnswerQuestion(it,_idQuestion) }
    }
    val listReplyAnswerQuestionResult : LiveData<ApiResult<ResponseListReplyAnswerQuestion.ListReplyAnswerQuestionResult>> = _listReplyAnswerQuestionResult


}