package brite.outdoor.data.api_entities.response

import android.os.Parcelable
import com.google.gson.GsonBuilder
import com.google.gson.annotations.Expose
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import kotlin.Exception

object ResponseListCamping {
    class ListCampingResult():BaseApiResult()

    @Parcelize
    data class ListCampingResponse(
           val total:Int?,
           val data: @RawValue Any?,
           val url_prefix: String?

    ):Parcelable{
        fun getListData() : ArrayList<ListCampingData>?{
            try {
                val gson= GsonBuilder().create()
                val json = gson.toJson(data)
                return gson.fromJson(json,object : TypeToken<ArrayList<ListCampingData>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null

        }
    }

    @Parcelize
    data class ListCampingData(
        var id:Int,
        var id_loactions: Int,
        var name:String?,
        var address:String?,
        var description:String?,
        var imageName:String?,
        var lat:String?,
        var lng:String?,
        var plans_note: String?,
        var plans_status:Int?,
        var plans_time: String?,
        var has_plans:Int?
    ):Parcelable{
        fun getListImage() : ArrayList<String>?{
            try {
                val gson= GsonBuilder().create()
                return gson.fromJson(imageName,object : TypeToken<ArrayList<String>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null

        }
    }
}