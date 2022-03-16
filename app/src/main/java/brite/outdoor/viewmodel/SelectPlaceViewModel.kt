package brite.outdoor.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import brite.outdoor.data.api_entities.response.ResponseDetail
import brite.outdoor.data.api_entities.response.ResponseListCommentLevel2
import brite.outdoor.data.entities.LocationEntity
import brite.outdoor.data.entities.ObjectSearch
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.utils.performGetOperation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SelectPlaceViewModel @Inject constructor(): ViewModel() {
    var locationSelected = MutableLiveData<LocationEntity>(null)
    var listLocation: MutableLiveData<ArrayList<ObjectSearch.ResultSearchEntity>> = MutableLiveData(arrayListOf())


}