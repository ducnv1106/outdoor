package brite.outdoor.viewmodel

import androidx.lifecycle.*
import brite.outdoor.data.api_entities.response.ResponseDeleteCamping
import brite.outdoor.data.api_entities.response.ResponseListCamping
import brite.outdoor.data.remote.ApiController
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.utils.performGetOperation
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LocationSaveViewModel @Inject constructor(
    private val gson: Gson,
    apiController: ApiController,
) : ViewModel() {
    var isPermissionReadWriteExternalStorage : Boolean=false
    val listLocation = ArrayList<ResponseListCamping.ListCampingData>()
    val entityLocation: MutableLiveData<ResponseListCamping.ListCampingData> = MutableLiveData()
    private val _location: MutableLiveData<ResponseListCamping.ListCampingData> = MutableLiveData()
    fun setLocation(entity: ResponseListCamping.ListCampingData) {
        _location.value = entity
    }

    val location = _location.switchMap {
        liveData {
            emit(it)
        }
    }

    enum class STATE{
        NOTHING,
        NOTIFY_DATA,
    }
    val actionState : MutableLiveData<STATE> = MutableLiveData(STATE.NOTHING)

    fun setActionSate(state:STATE){
        actionState.value=state
    }

    // list camping
    private val _requestListCamping: MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestListCamping(requestListCamping: HashMap<String, String>) {
        _requestListCamping.value = requestListCamping
    }

    private val _listCampingResult = _requestListCamping.switchMap {
        performGetOperation(gson) { apiController.listCamping(it) }
    }
    val listCampingResult: LiveData<ApiResult<ResponseListCamping.ListCampingResult>> =
        _listCampingResult

    //
// delete camping
    private var _idQuestion: String = ""
    private val _requestDeleteCamping: MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestDeleteCamping(requestDeleteCamping: HashMap<String, String>,id:String) {
        _requestDeleteCamping.value = requestDeleteCamping
        _idQuestion = id
    }

    private val _deleteCampingResult = _requestDeleteCamping.switchMap {
        performGetOperation(gson) { apiController.deleteCamping(it, _idQuestion) }
    }
    val deleteCampingResult: LiveData<ApiResult<ResponseDeleteCamping.DeleteCampingResult>> = _deleteCampingResult

    //
    private val _address: MutableLiveData<String> = MutableLiveData()
    fun setAddress(address: String) {
        _address.value = address
    }

    val address = _address.switchMap {
        liveData {
            emit(it)
        }
    }

    //
    private val _urlPrefix: MutableLiveData<String> = MutableLiveData()
    fun setUrlPrefix(address: String) {
        _urlPrefix.value = address
    }

    val urlPrefix = _urlPrefix.switchMap {
        liveData {
            emit(it)
        }
    }
}