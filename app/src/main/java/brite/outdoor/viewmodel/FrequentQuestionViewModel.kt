package brite.outdoor.viewmodel

import android.text.Editable
import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import brite.outdoor.data.api_entities.response.ResponseQuestion
import brite.outdoor.data.remote.ApiController
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.utils.performGetOperation
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class FrequentQuestionViewModel @Inject constructor(
    private val gson: Gson,
    apiController: ApiController
) : ViewModel() {
    val contentPost = MutableLiveData("")

    private val _lengthContent: LiveData<Int> = contentPost.switchMap {
        liveData {
            emit(it.length)
        }
    }
    private val content = Transformations.switchMap(contentPost) {
        liveData {
            emit(it)
        }
    }
    val lengthContent: LiveData<Int> = _lengthContent

    //list Question
    private val _requestListQuestion : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestListQuest(requestDeletePost : HashMap<String,String>) {
        _requestListQuestion.value = requestDeletePost
    }
    private val _listQuestionResult = _requestListQuestion.switchMap {
        performGetOperation(gson) { apiController.listQuestion(it) }
    }
    val listQuestionResult : LiveData<ApiResult<ResponseQuestion.QuestionResult>> = _listQuestionResult

}