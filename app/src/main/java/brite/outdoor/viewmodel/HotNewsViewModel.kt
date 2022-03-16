package brite.outdoor.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import brite.outdoor.data.api_entities.response.ResponseFollow
import brite.outdoor.data.api_entities.response.ResponseListPostHotNews
import brite.outdoor.data.api_entities.response.ResponseListPostUser
import brite.outdoor.data.api_entities.response.ResponseQuestion
import brite.outdoor.data.remote.ApiController
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.utils.performGetOperation
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HotNewsViewModel @Inject constructor(private val gson : Gson, apiController: ApiController) : ViewModel() {


    var contentSelected : ResponseListPostHotNews.HotNewsData? = null
    var positionSelected = 0

    @JvmName("setContentSelected1")
    fun setContentSelected(content: ResponseListPostHotNews.HotNewsData?){
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

    fun setActionSate(state: HotNewsViewModel.STATE){
        actionState.value=state
    }


    // list Post User Follow
    private val _requestListPostHotNews : MutableLiveData<HashMap<String, String>> = MutableLiveData()

    fun requestListPostHotNews(requestListPostHotNews : HashMap<String,String>) {
        _requestListPostHotNews.value = requestListPostHotNews
    }
    private val _listPostHotNewsResult = _requestListPostHotNews.switchMap {
        performGetOperation(gson) { apiController.listPostHotNews(it) }
    }
    val listPostHotNewsResult : LiveData<ApiResult<ResponseListPostHotNews.ListPostHotNewsResult>> = _listPostHotNewsResult
}