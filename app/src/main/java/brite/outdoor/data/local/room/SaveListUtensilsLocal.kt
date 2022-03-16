package brite.outdoor.data.local.room

import brite.outdoor.data.api_entities.response.ResponseListLocation
import brite.outdoor.data.api_entities.response.ResponseListUtensils
import brite.outdoor.data.entities.LocationEntityConvert
import brite.outdoor.data.entities.UtensilEntityConvert
import javax.inject.Inject

class SaveListUtensilsLocal @Inject constructor(private val localDataSource: AppDao) {
    fun saveListUtensils( list:List<ResponseListUtensils.UtensilsData>) {
        localDataSource.insertOrUpdateUtensils(list)
    }
    fun getListUtensils() = localDataSource.getListUtensils()

    fun saveUtensilEntity(entity:UtensilEntityConvert){
        localDataSource.insertUtensilEntity(entity)
    }
    fun getUtensilEntity()=localDataSource.getUtensilEntity()
}