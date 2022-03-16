package brite.outdoor.viewmodel

import android.util.Log
import androidx.databinding.Bindable
import androidx.lifecycle.*
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.entities.ObjectSearch
import brite.outdoor.data.remote.ApiController
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.utils.performGetOperation
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(private val gson: Gson, apiController: ApiController) :
    ViewModel() {
    val searchType = MutableLiveData(SearchType.CONSUMED)

    val isShowHideShimmerLayoutUser = MutableLiveData(false)
    val isShowHideShimmerLayoutLocationOrTool = MutableLiveData(false)
    var currentSearchType : Pair<String,SearchType>?=null


    fun setSearchType(type: SearchType) {
        searchType.value = type
    }

    enum class SearchType {
        LOCATE,
        TOOL,
        USER,
        CONSUMED
    }


    private val _resultSearchType = searchType.switchMap {
        liveData {
            when (it) {
                SearchType.LOCATE -> {
                    isShowHideShimmerLayoutLocationOrTool.value = true
                    isShowHideShimmerLayoutUser.value = false
                    emit(SearchType.LOCATE)
                }
                SearchType.TOOL -> {
                    isShowHideShimmerLayoutLocationOrTool.value = true
                    isShowHideShimmerLayoutUser.value = false
                    emit(SearchType.TOOL)
                }
                SearchType.USER -> {
                    isShowHideShimmerLayoutUser.value = true
                    isShowHideShimmerLayoutLocationOrTool.value = false
                    emit(SearchType.USER)
                }
                SearchType.CONSUMED ->{
                    isShowHideShimmerLayoutUser.value = false
                    isShowHideShimmerLayoutLocationOrTool.value = false
                    emit(SearchType.CONSUMED)
                }
            }
        }
    }
    val resultSearchType: LiveData<SearchType> = _resultSearchType

    //search locations
    private val _requestSearchLocations: MutableLiveData<HashMap<String, String>> =
        MutableLiveData()

    fun requestSearchLocations(requestSearchLocations: HashMap<String, String>) {
        _requestSearchLocations.value = requestSearchLocations
    }

    private val _searchLocationsResult = _requestSearchLocations.switchMap {
        performGetOperation(gson) { apiController.searchLocations(it) }
    }
    val searchLocationsResult: LiveData<ApiResult<ResponseSearchLocations.SearchLocationsResult>> =
        _searchLocationsResult

    //search utensils
    private val _requestSearchUtensils: MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestSearchUtensils(requestSearchUtensils: HashMap<String, String>) {
        _requestSearchUtensils.value = requestSearchUtensils
    }

    private val _searchUtensilsResult = _requestSearchUtensils.switchMap {
        performGetOperation(gson) { apiController.searchUtensils(it) }
    }
    val searchUtensilsResult: LiveData<ApiResult<ResponseSearchUtensils.SearchUtensilsResult>> =
        _searchUtensilsResult

    //search user

    private val _requestSearchUser: MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestSearchUser(requestSearchUser: HashMap<String, String>) {
        _requestSearchUser.value = requestSearchUser
    }

    private val _searchUserResult = _requestSearchUser.switchMap {
        performGetOperation(gson) { apiController.searchUser(it) }
    }
    val searchUserResult: LiveData<ApiResult<ResponseSearchUser.SearchUserResult>> =
        _searchUserResult

    // listCadastral
    fun getListCadastral(requestListCadastral: HashMap<String, String>){
        _requestListCadastral.value = requestListCadastral
    }
    private val _requestListCadastral : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    private val _listCadastralResult = _requestListCadastral.switchMap {
        performGetOperation(gson){
            apiController.listCadastrals(it)
        }
    }
    val listCadastralResult: LiveData<ApiResult<ResponseListCadastral.ListCadastralResult>> = _listCadastralResult

    val listCadastralProvince: MutableLiveData<ArrayList<ResponseListCadastral.ListCadastralDataProvince>> = MutableLiveData()
    val listCadastralDistrict: MutableLiveData<ArrayList<ResponseListCadastral.ListCadastralDataDistrict>> = MutableLiveData()
    val listCadastralCommune: MutableLiveData<ArrayList<ResponseListCadastral.ListCadastralDataCommune>> = MutableLiveData()
}