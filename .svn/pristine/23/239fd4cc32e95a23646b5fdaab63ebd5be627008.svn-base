package brite.outdoor.data.api_entities.response

import android.os.Parcelable
import com.google.gson.GsonBuilder
import com.google.gson.annotations.Expose
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import kotlin.Exception

object ResponseListCadastral {
    class ListCadastralResult():BaseApiResult()

    @Parcelize
    data class ListCadastralResponse(
           val data: @RawValue Any?

    ):Parcelable{
        fun getListData() : ArrayList<ListCadastralDataProvince>?{
            try {
                val gson= GsonBuilder().create()
                val json = gson.toJson(data)
                return gson.fromJson(json,object : TypeToken<ArrayList<ListCadastralDataProvince>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null

        }
    }

    @Parcelize
    data class ListCadastralDataProvince(
        var id:Int?,
        var code: String?,
        var name:String?,
        var short_name:String?,
        var parent_id:String?,
        var children:@RawValue Any?
    ):Parcelable{
        fun getListDataDistrict() : ArrayList<ListCadastralDataDistrict>?{
            try {
                val gson= GsonBuilder().create()
                val json = gson.toJson(children)
                return gson.fromJson(json,object : TypeToken<ArrayList<ListCadastralDataDistrict>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null

        }
    }

    @Parcelize
    data class ListCadastralDataDistrict(
        var id:Int?,
        var code: String?,
        var name:String?,
        var short_name:String?,
        var parent_id:String?,
        var children:@RawValue Any?
    ):Parcelable{
        fun getListDataCommune() : ArrayList<ListCadastralDataCommune>?{
            try {
                val gson= GsonBuilder().create()
                val json = gson.toJson(children)
                return gson.fromJson(json,object : TypeToken<ArrayList<ListCadastralDataCommune>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null

        }
    }
    data class ListCadastralDataCommune(
        var id:Int?,
        var code: String?,
        var name:String?,
        var short_name:String?,
        var parent_id:String?,
        var children:@RawValue Any?
    )
}