package brite.outdoor.data.api_entities.response

import android.os.Parcelable
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

object ResponseListCommentHotNews {
    class ListCommentHotNewsResult : BaseApiResult()

    @Parcelize
    data class ListCommentHotNewsResponse(
        val total : Int,
        val data: @RawValue Any?,
        val url_prefix_avatar:String,
        val url_prefix_comment:String
    ):Parcelable{
        fun listCommentHotNews():ArrayList<CommentHotNews>?{
            try {
                val gson= GsonBuilder().create()
                val json=gson.toJson(data)
                return gson.fromJson(json,object : TypeToken<ArrayList<CommentHotNews>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null
        }
    }

    data class CommentHotNews(
        val id:Int,
        val hot_news_id:Int,
        val thread_id: Int?,
        val parent_id: Int?,
        val created_id:Int,
        val comment:String,
        val image:String,
        val created_time:String?,
        val modified_time:String,
        val user_name_created:String,
        val avatar_user:String,
        var total_children:Int,
        val post_comments_children :ArrayList<CommentHotNewsReply>,
        var isMaxLine: Boolean = false,
        var isCommentNew :Boolean = false
    ){
        val lastedId
            get() = if(post_comments_children.size>0){
                post_comments_children.withIndex().filter { (_, value)->
                    !value.isCommentNew
                }.map { (_, value)->value }.lastOrNull()?.id
            } else null
    }
    data class CommentHotNewsReply(
        val id: Int,
        val hot_news_id:Int,
        val thread_id:Int?,
        val parent_id:Int?,
        val comment:String,
        val image:String,
        val weight_flag:Int?,
        val is_deleted:Int?,
        val created_id:Int,
        val created_time:String?,
        val modified_time:String,
        val user_name_created:String,
        val avatar_user:String,
        val user_name_reply:String?,
        var isMaxLine: Boolean = false,
        var isCommentNew :Boolean = false
    )
}