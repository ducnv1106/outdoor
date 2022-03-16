package brite.outdoor.data.api_entities.response

import android.os.Parcelable
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

object ResponseListReplyAnswerQuestion {
    class ListReplyAnswerQuestionResult : BaseApiResult()
    @Parcelize
    data class ListReplyAnswerQuestionResponse(
        val total:Int,
        val data:@RawValue Any?,
        val url_prefix_avatar:String,
        val url_prefix_comment:String
    ):Parcelable{
        fun getListReplyAnswerQuestion():ArrayList<ResponseAnswerQuestion.AnswerQuestionReply>?{
            try {
                val gson= GsonBuilder().create()
                val json=gson.toJson(data)
                return gson.fromJson(json,object : TypeToken<ArrayList<ResponseAnswerQuestion.AnswerQuestionReply>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null
        }
    }
}