package brite.outdoor.viewmodel

import androidx.lifecycle.*
import brite.outdoor.data.api_entities.response.*

import brite.outdoor.data.entities.PostContentEntity
import brite.outdoor.data.entities.PostContentHotNewsEntity
import brite.outdoor.utils.performGetOperation
import brite.outdoor.data.remote.ApiController
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.utils.performGetOperation
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.gson.Gson

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailHotNewsViewModel @Inject constructor(private val gson : Gson, apiController: ApiController) : ViewModel() {

    //is Parent Fragment Notification
    var isNotification:Boolean=false
    // for hold all players generated
    var playersMap: MutableMap<Int, SimpleExoPlayer>  = mutableMapOf()
    // for hold current player
    var currentPlayingVideo: Pair<Int, SimpleExoPlayer>? = null
    fun releaseAllPlayers(){
        playersMap.map {
            it.value.release()
        }
    }

    // call when item recycled to improve performance
    fun releaseRecycledPlayers(index: Int){
        playersMap[index]?.release()
    }

    // call when scroll to pause any playing player
    fun pauseCurrentPlayingVideo(){
        if (currentPlayingVideo != null){
            currentPlayingVideo?.second?.playWhenReady = false
        }
    }

    fun playIndexThenPausePreviousPlayer(index: Int){
        if (playersMap.get(index)?.playWhenReady == false) {
            pauseCurrentPlayingVideo()
            playersMap.get(index)?.playWhenReady = true
            currentPlayingVideo = Pair(index, playersMap.get(index)!!)
        }

    }
    var listContent: MutableLiveData<ArrayList<PostContentHotNewsEntity>> = MutableLiveData(ArrayList())
    var entityNews = MutableLiveData<ResponseDetailHotNews.DetailPostHotNewsData>()
    var idPost = MutableLiveData<Int>(0)


    //registered BookMart
    private val _requestBookMart : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestBookMart(requestBookMart : HashMap<String,String>) {
        _requestBookMart.value = requestBookMart
    }
    private val _bookMartResult = _requestBookMart.switchMap {
        performGetOperation(gson) { apiController.registeredBookMart(it) }
    }
    val bookMartResult : LiveData<ApiResult<ResponseBookMart.BookMartResult>> = _bookMartResult

    //API detail post
    private var _postId : String = ""
    private val _requestDetailPost : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestDetailPost(requestDetailPost : HashMap<String,String>, postId: String) {
        _requestDetailPost.value = requestDetailPost
        _postId = postId
    }
    private val _detailPostResult = _requestDetailPost.switchMap {
        performGetOperation(gson) { apiController.detailPostHotNews(it, _postId) }
    }
    val detailPostResult : LiveData<ApiResult<ResponseDetailHotNews.DetailHotNewsResult>> = _detailPostResult
    //location
    var location: ResponseListCamping.ListCampingData? = null

}