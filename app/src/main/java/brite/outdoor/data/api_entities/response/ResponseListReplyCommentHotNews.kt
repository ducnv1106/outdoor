package brite.outdoor.data.api_entities.response

import android.os.Parcelable
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

object ResponseListReplyCommentHotNews {
    class ListReplyCommentHotNewsResult : BaseApiResult()
    @Parcelize
    data class ListReplyCommentHotNewsResponse(
        val total:Int,
        val data:@RawValue Any?,
        val url_prefix_avatar:String,
        val url_prefix_comment:String
    ): Parcelable {
        fun getListReplyComment():ArrayList<ResponseListCommentHotNews.CommentHotNewsReply>?{
            try {
                val gson= GsonBuilder().create()
                val json=gson.toJson(data)
                return gson.fromJson(json,object : TypeToken<ArrayList<ResponseListCommentHotNews.CommentHotNewsReply>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null
        }
    }
}