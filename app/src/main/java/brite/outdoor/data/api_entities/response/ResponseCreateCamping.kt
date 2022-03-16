package brite.outdoor.data.api_entities.response

import android.os.Parcelable
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize

object ResponseCreateCamping {
    class CreateCampingResult : BaseApiResult()
    @Parcelize
    data class CreateCampingResponse(
        val id:Int,
        var id_loactions: Int,
        val name:String?,
        val address:String?,
        val description:String?,
        val imageName:String?,
        val lat:String?,
        val lng:String?,
        val plans_note: String?,
        val plans_status:Int?,
        val plans_time: String?,
        val has_plans:Int?
    ): Parcelable {
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