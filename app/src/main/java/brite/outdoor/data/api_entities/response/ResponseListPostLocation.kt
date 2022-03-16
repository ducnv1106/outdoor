package brite.outdoor.data.api_entities.response

import android.os.Parcelable
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

object ResponseListPostLocation {
     class ListPostLocationResult:BaseApiResult()
    @Parcelize
     data class ListPostLocationResponse(
            val data:@RawValue Any?,
            val total:Int?
    ):Parcelable{
        fun getListData(): ArrayList<ListPostLocationData>?{
            try {
                val gson=GsonBuilder().create()
                val json = gson.toJson(data)
                return gson.fromJson(json,object : TypeToken<ArrayList<ListPostLocationData>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null
        }
    }
    @Parcelize
    data class ListPostLocationData(
            val id:Int,
            val title:String?,
            val content:String?,
            val location_id:Int?,
            val hashtag_id:Int?,
            val utensil_id:Int?,
            val like_count:Int?,
            val comment_count:Int?,
            val share_count:Int?,
            val cIndex:Int?,
            val is_sticky:Int?,
            val is_deleted:Boolean?,
            val created_id:Int,
            val created_time:String?,
            val modified_time:String?,
            val user_name_created:String?,
            val avatar_user:String?,
            val name_locations:String?,
            val name_utensils:String?,
            val name_hashtags:String,
            val bookmarks:Boolean?,
            val post_shares:Boolean?,
            val post_likes:Boolean,
            val state_follow:Int,
            val url_prefix:String?,
            val url_prefix_avatar:String?
    ):Parcelable{

        fun getListContent() : ArrayList<ResponseListPostUser.ResponseContent>?{
            try {
                val gson = GsonBuilder().create()
                return gson.fromJson(content,object : TypeToken<ArrayList<ResponseListPostUser.ResponseContent>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null
        }
    }

}