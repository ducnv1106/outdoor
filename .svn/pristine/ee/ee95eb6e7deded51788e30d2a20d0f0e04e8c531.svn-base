package brite.outdoor.viewmodel

import androidx.lifecycle.*
import brite.outdoor.data.api_entities.response.ResponseDeleteQuestion
import brite.outdoor.data.api_entities.response.ResponseEditQuestion
import brite.outdoor.data.remote.ApiController
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.utils.performGetOperation
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EditQuestionViewModel @Inject constructor(
    private val gson: Gson,
    apiController: ApiController
) : ViewModel() {
    val contentPost = MutableLiveData("")

    private val _lengthContent: LiveData<Int> = contentPost.switchMap {
        liveData {
            emit(it.length)
        }
    }
    val lengthContent: LiveData<Int> = _lengthContent

    //edit question
    private var _idQuestion: String = ""
    private val _requestEditQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestEditQuestion(requestEditQuestion : HashMap<String,String>,id:String) {
        _requestEditQuestion.value = requestEditQuestion
        _idQuestion = id
    }
    private val _editQuestionResult = _requestEditQuestion.switchMap {
        performGetOperation(gson) { apiController.editQuestion(it,_idQuestion) }
    }
    val editQuestionResult : LiveData<ApiResult<ResponseEditQuestion.EditQuestionResult>> = _editQuestionResult

}