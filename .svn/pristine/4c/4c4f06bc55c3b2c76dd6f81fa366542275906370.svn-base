package brite.outdoor.data.api_entities.response

import android.os.Parcelable
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

object ResponseQuestion {
    class QuestionResult : BaseApiResult()

    @Parcelize
    data class QuestionResponse(
        val data: @RawValue Any?,
        val total:Int?,
    ): Parcelable{
        fun getListQuestion():ArrayList<QuestionData>?{
            try {
                val gson= GsonBuilder().create()
                val json=gson.toJson(data)
                return gson.fromJson(json,object : TypeToken<ArrayList<QuestionData>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null
        }
    }

    data class QuestionData(
        var id:Int,
        var content:String,
        var like_count:Int,
        var comment_count:Int,
        var is_deleted:Int,
        var created_id:Int,
        var created_time:String,
        var modified_id:String?=null,
        var modified_time:String,
        var user_name_created:String,
        var avatar_user:String,
        var question_bookmarks:Boolean,
        var question_likes:Boolean,
        var state_follow:Int,
        var url_prefix_avatar:String

    )
}