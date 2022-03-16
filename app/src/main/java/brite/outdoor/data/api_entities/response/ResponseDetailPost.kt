package brite.outdoor.data.api_entities.response

import android.os.Parcelable
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

object ResponseDetailPost {
    class DetailPostResult : BaseApiResult()

    @Parcelize
    data class DetailPostResponse(
        val data: DataDetail?,
        val nexData: NextDataDetail?,
        val totalRelated:Int?,
        val related:@RawValue Any?,
        ):Parcelable{
        fun getListData() : ArrayList<ListDataRelated>?{
            try {
                val gson= GsonBuilder().create()
                val json = gson.toJson(related)
                return gson.fromJson(json,object : TypeToken<ArrayList<ListDataRelated>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null

        }
    }
    @Parcelize
    data class DataDetail(
        val id:Int?,
        val title:String,
        val content:String,
        val location_id:Int?,
        val hashtag_id:Int?,
        val utensil_id:Int?,
        var like_count:Int?,
        var comment_count:Int?,
        var share_count:Int?,
        val is_deleted:Boolean,
        val created_id:Int,
        val created_time:String,
        val modified_time:String,
        val url_prefix: String,
        val name_hashtags:String?,
        var post_likes:Boolean?,
        var post_shares:Boolean?,
        var bookmarks: Boolean?,
        val user_name_created: String,
        val avatar_user: String,
        val name_locations: String,
        val address_locations:String?,
        val name_utensils: String,
        val plans_note: String,
        val plans_status:Int,
        val plans_time: String,
        val has_plans:Int,
        var state_follow:Int?
    ):Parcelable {
        fun getListContent(): ArrayList<ResponseListPostUser.ResponseContent>? {
            val gson = GsonBuilder().create()
            return gson.fromJson(content,
                object : TypeToken<ArrayList<ResponseListPostUser.ResponseContent>>() {}.type)

        }
    }

    @Parcelize
    data class NextDataDetail(
        val id:Int?,
        val title:String,
        val content:String,
        val location_id:Int?,
        val hashtag_id:Int?,
        val utensil_id:Int?,
        var like_count:Int?,
        var comment_count:Int?,
        var share_count:Int?,
        val is_deleted:Boolean,
        val created_id:Int,
        val created_time:String,
        val modified_time:String,
        val url_prefix: String,
        val name_hashtags:String?,
        var post_likes:Boolean?,
        var post_shares:Boolean?,
        var bookmarks: Boolean?,
        val user_name_created: String,
        val avatar_user: String,
        val name_locations: String,
        val name_utensils: String,
        var state_follow:Int?
    ):Parcelable {
        fun getListContent(): ArrayList<ResponseListPostUser.ResponseContent>? {
            val gson = GsonBuilder().create()
            return gson.fromJson(content,
                object : TypeToken<ArrayList<ResponseListPostUser.ResponseContent>>() {}.type)

        }
    }
    @Parcelize
    data class ListDataRelated(
        val id:Int?,
        val title:String,
        val content:String,
        val location_id:Int?,
        val hashtag_id:Int?,
        val utensil_id:Int?,
        var like_count:Int?,
        var comment_count:Int?,
        var share_count:Int?,
        val is_deleted:Boolean,
        val created_id:Int,
        val created_time:String,
        val modified_time:String,
        val url_prefix: String,
        val name_hashtags:String?,
        var post_likes:Boolean?,
        var post_shares:Boolean?,
        var bookmarks: Boolean?,
        val user_name_created: String,
        val avatar_user: String,
        val name_locations: String,
        val name_utensils: String,
        var state_follow:Int?
    ):Parcelable {
        fun getListContent(): ArrayList<ResponseListPostUser.ResponseContent>? {
            val gson = GsonBuilder().create()
            return gson.fromJson(content,
                object : TypeToken<ArrayList<ResponseListPostUser.ResponseContent>>() {}.type)

        }
    }
}
