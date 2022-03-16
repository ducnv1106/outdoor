package brite.outdoor.viewmodel

import android.security.identity.AccessControlProfileId
import android.util.Log
import androidx.lifecycle.*
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.remote.ApiController
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.entity.EntityFreQuestion
import brite.outdoor.utils.performGetOperation
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuestionViewModel @Inject constructor(private val gson: Gson, apiController: ApiController) :
    ViewModel() {

    val contentPost = MutableLiveData("")

    private val _lengthContent: LiveData<Int> = contentPost.switchMap {
        liveData {
            emit(it.length)
        }
    }
    val lengthContent: LiveData<Int> = _lengthContent

    private val _isSelectedSend  : LiveData<Boolean> = contentPost.switchMap {
        liveData {
            if (it.isEmpty()) emit(false)
            else emit(true)
        }
    }
    val isSelectedSend : MediatorLiveData<Boolean> = MediatorLiveData<Boolean>().apply {
        addSource(_isSelectedSend) {
            value = it
        }
    }

    val isFromNotification = MutableLiveData<Boolean>()
    var questionId :Int = 0
    var threadId:Int = 0
    var commentId:Int = 0
    fun prepareDataCommentQuestion(questionId:Int,threadId: Int,commentId:Int){
        this.questionId = questionId
        this.threadId = threadId
        this.commentId =commentId
    }
    val isSelectedFrequentQuestion = MutableLiveData(true)
    val isSelectedSavedQuestion = MutableLiveData(false)

    val isNeedRefreshDataFreQuestion = MutableLiveData(false)
    val isNeedRefreshDataSaveQuestion = MutableLiveData(false)
    fun setNeedRefreshDataQuestion(){
        isNeedRefreshDataFreQuestion.value = true
        isNeedRefreshDataSaveQuestion.value = true
    }

    val currentFragment = MutableLiveData(CurrentFragment.FrequentQuestion)

    enum class CurrentFragment {
        FrequentQuestion,
        SavedQuestion,
        CONSUMED
    }

    fun setCurrentFragment(typeCurrentFragment: CurrentFragment){
        currentFragment.value = typeCurrentFragment
    }

    private val _resultTypeFragment = currentFragment.switchMap {
        liveData {
            when (it) {
                CurrentFragment.FrequentQuestion-> {
                    isSelectedFrequentQuestion.value = true
                    isSelectedSavedQuestion.value = false
                    emit(CurrentFragment.FrequentQuestion)
                }
                CurrentFragment.SavedQuestion-> {
                    isSelectedSavedQuestion.value = true
                    isSelectedFrequentQuestion.value = false
                    emit(CurrentFragment.SavedQuestion)
                }
                CurrentFragment.CONSUMED ->{
                    emit(CurrentFragment.CONSUMED)
                }
            }
        }
    }
    val resultTypeFragment: LiveData<CurrentFragment> = _resultTypeFragment

    // list Question
    val listQuestion = ArrayList<ResponseQuestion.QuestionData>()
    val listQuestionSave = ArrayList<ResponseQuestion.QuestionData>()

    var contentSelected : ResponseQuestion.QuestionData? = null
    var positionSelected = 0

    @JvmName("setContentSelected1")
    fun setContentSelected(content:ResponseQuestion.QuestionData){
        contentSelected = content

    }
    enum class STATE{
        NOTHING,
        NOTIFY_DATA,
        DELETE,
        POST_QUESTION,
        EXECUTE_POST_QUESTION
    }
    val actionState : MutableLiveData<STATE> = MutableLiveData(STATE.NOTHING)

    fun setActionSate(state:STATE){
        actionState.value=state
    }
    fun removeItem(){
        try {
            listQuestionSave.removeAt(positionSelected)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    // create Question
    private val _createQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestCreateQuestion(createQuestion : HashMap<String,String>) {
        _createQuestion.value = createQuestion
    }
    private val _createQuestionResult = _createQuestion.switchMap {
        performGetOperation(gson) { apiController.createQuestion(it) }
    }
    val createQuestionResult : LiveData<ApiResult<ResponseCreateQuestion.CreateQuestionResult>> = _createQuestionResult

    //like question
    var idQuestion :Int = 0
    var positionQuestion : Int=0
    var currentFragmentQuestion:Int=0
    var question:ResponseQuestion.QuestionData?=null
    fun positionQuestionNeedNotifyChange(idQuestion:Int,positionQuestion:Int=0,currentFragmentQuestion:Int,question:ResponseQuestion.QuestionData?=null){
        this.idQuestion = idQuestion
        this.positionQuestion = positionQuestion
        this.currentFragmentQuestion=currentFragmentQuestion
        this.question = question
    }

    private val _requestLikeQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestLikeQuestion(requestLikeQuestion : HashMap<String,String>) {
        _requestLikeQuestion.value = requestLikeQuestion
    }
    private val _likeQuestionResult = _requestLikeQuestion.switchMap {
        performGetOperation(gson) { apiController.likeQuestion(it) }
    }
    val likeQuestionResult : LiveData<ApiResult<ResponseLikeQuestion.LikeQuestionResult>> = _likeQuestionResult

    //bookmark question
    private val _requestBookmarkQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestBookmarkQuestion(requestBookmarkQuestion : HashMap<String,String>) {
        _requestBookmarkQuestion.value = requestBookmarkQuestion
    }
    private val _bookMarkQuestionResult = _requestBookmarkQuestion.switchMap {
        performGetOperation(gson) { apiController.bookMarkQuestion(it) }
    }
    val bookMarkQuestionResult : LiveData<ApiResult<ResponseBookMarkQuestion.BookMarkQuestionResult>> = _bookMarkQuestionResult

    //delete question
    private var _idQuestion: String = ""
    private val _requestDeleteQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestDeleteQuestion(requestDeleteQuestion : HashMap<String,String>,id:String) {
        _requestDeleteQuestion.value = requestDeleteQuestion
        _idQuestion = id
    }
    private val _deleteQuestionResult = _requestDeleteQuestion.switchMap {
        performGetOperation(gson) { apiController.deleteQuestion(it,_idQuestion) }
    }
    val deleteQuestionResult : LiveData<ApiResult<ResponseDeleteQuestion.DeleteQuestionResult>> = _deleteQuestionResult




}