package brite.outdoor.data.api_entities.response

import android.os.Parcelable
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

object ResponseAnswerQuestion {
    class AnswerQuestionResult : BaseApiResult()

    @Parcelize
    data class AnswerQuestionResponse(
        val total:Int?,
        val data: @RawValue Any?,
        val url_prefix_avatar:String,
        val url_prefix_comment:String,
    ): Parcelable{
        fun getListAnswerQuestion():ArrayList<AnswerQuestion>?{
            try {
                val gson= GsonBuilder().create()
                val json=gson.toJson(data)
                return gson.fromJson(json,object : TypeToken<ArrayList<AnswerQuestion>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null
        }
    }
    data class AnswerQuestion(
        val id:Int,
        var question_id:Int,
        var thread_id:Int?,
        var parent_id:Int?,
        var comment:String,
        var image:String?,
        var weight_flag:Int?,
        var is_deleted:Int,
        var created_id:Int,
        var created_time:String,
        var modified_time:String,
        var user_name_created:String,
        var avatar_user:String,
        var total_children:Int,
        var question_comments_children : ArrayList<AnswerQuestionReply>,
        var isMaxLine: Boolean = false,
        var isAnswerQuestionNew :Boolean = false
    ){

        val lastedId
            get() = if(question_comments_children.size>0){
                  question_comments_children.withIndex().filter { (_, value)->
                    !value.isAnswerQuestionNew
                }.map { (_, value)->value }.lastOrNull()?.id
            } else null
    }
    data class AnswerQuestionReply(
        val id:Int,
        var question_id:Int,
        var thread_id:Int?,
        var parent_id:Int?,
        var comment:String,
        var image:String?,
        var weight_flag:Int?,
        var is_deleted:Int,
        var created_id:Int,
        var created_time:String,
        var modified_time:String,
        var user_name_created:String,
        var avatar_user:String,
        var user_name_reply:String?,
        var isMaxLine: Boolean = false,
        var isAnswerQuestionNew :Boolean = false
    )
}