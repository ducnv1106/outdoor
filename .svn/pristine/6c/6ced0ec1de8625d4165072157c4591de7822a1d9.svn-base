package brite.outdoor.data.api_entities.response

import android.os.Parcelable
import android.util.Log
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

object ResponseDetailHotNews {
    class DetailHotNewsResult : BaseApiResult()

    @Parcelize
    data class DetailPostHotNewsResponse(
        val data : @RawValue Any?,
        val total:Int
    ): Parcelable{
        fun postHotNews() : DetailPostHotNewsData?{
            try {
                val gson= GsonBuilder().create()
                val json = gson.toJson(data)
                return gson.fromJson(json,object : TypeToken<DetailPostHotNewsData>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null
        }

    }
    @Parcelize
    data class DetailPostHotNewsData(
        val id:Int,
        val title:String,
        val content:String?,
        var like_count:Int,
        val comment_count:Int,
        val share_count:Int,
        val attachment:String?,
        val created_id:Int,
        val created_time:String,
        val is_deleted:Int,
        val admin:@RawValue Any?,
        val modified_time:String,
        val url_prefix:String,
        val url_prefix_avatar:String,
        var hot_news_likes: Boolean,
        val location_id:Int?,
        var state_follow:Int?,
        var bookmarks: Boolean?,
        val name_locations: String?,
        val name_utensils: String?,
        val address_locations:String?,
        var post_shares:Boolean?,
        val plans_note: String?,
        val plans_status:Int?,
        val plans_time: String?,
        val has_plans:Int?,
    ):Parcelable{
        fun dataAdmin(): ResponseListPostHotNews.Admin?{
            try {
                val gson=GsonBuilder().create()
                val json = gson.toJson(admin)
                return gson.fromJson(json,object : TypeToken<ResponseListPostHotNews.Admin>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null
        }
        fun listImage():ArrayList<String>?{
            try {
                val gson= GsonBuilder().create()
                return gson.fromJson(attachment,object : TypeToken<ArrayList<String>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null
        }
        fun getContentHotNews():ArrayList<ResponseListPostHotNews.ResponseContentHotNews>{
            val listContent  = ArrayList<ResponseListPostHotNews.ResponseContentHotNews>()
            try {
                val split = content?.split("{image}")
                split?.let {
                    for (i in it.indices){
                        val postHotNewsResponse = ResponseListPostHotNews.ResponseContentHotNews()
                        try {
                            postHotNewsResponse.content = it[i]
                            postHotNewsResponse.image = listImage()?.get(i) ?: ""
                        }catch (e:Exception){
                            e.printStackTrace()
                        }
                        listContent.add(postHotNewsResponse)
                    }
                }
            }catch (e:Exception){
                e.printStackTrace()
            }
            return listContent
        }
    }

}