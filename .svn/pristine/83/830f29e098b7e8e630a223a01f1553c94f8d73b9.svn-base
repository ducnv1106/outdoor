package brite.outdoor.viewmodel

import androidx.lifecycle.*
import brite.outdoor.data.api_entities.response.ResponseQuestion
import brite.outdoor.data.remote.ApiController
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.utils.performGetOperation
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SavedQuestionViewModel @Inject constructor(
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

    //list Question
    private val _requestListQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestListQuest(requestListQuest : HashMap<String,String>) {
        _requestListQuestion.value = requestListQuest
    }
    private val _listQuestionResult = _requestListQuestion.switchMap {
        performGetOperation(gson) { apiController.listQuestion(it) }
    }
    val listQuestionResult : LiveData<ApiResult<ResponseQuestion.QuestionResult>> = _listQuestionResult

}