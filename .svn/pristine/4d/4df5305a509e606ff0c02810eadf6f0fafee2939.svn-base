package brite.outdoor.data.api_entities.response

import android.os.Parcelable
import brite.outdoor.data.entities.ImagePicker
import com.google.gson.GsonBuilder
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import com.google.gson.reflect.TypeToken

object ResponseListPostHotNews {
    class ListPostHotNewsResult : BaseApiResult()
    @Parcelize
    data class ListPostHotNewsResponse(
        val data:@RawValue Any?,
        val total:Int?
    ):Parcelable{
        fun listPostHotNews() : ArrayList<HotNewsData>?{
            try {
                val gson=GsonBuilder().create()
                val json = gson.toJson(data)
                return gson.fromJson(json,object : TypeToken<ArrayList<HotNewsData>>(){}.type)
            }catch (e:Exception){
                e.printStackTrace()
            }
            return null
        }

    }
    @Parcelize
    data class HotNewsData(
        val id:Int,
        val title:String,
        val content:String?,
        var like_count:Int,
        var comment_count:Int,
        var share_count:Int,
        val attachment:String?,
        val created_id:Int,
        val created_time:String,
        val is_deleted:Int,
        val admin:@RawValue Any?,
        val modified_time:String,
        val url_prefix:String,
        val url_prefix_avatar:String,
        val location_id:Int?,
        var state_follow:Int?,
        var post_shares:Boolean?=null,
        var hot_news_likes:Boolean
    ):Parcelable{
        fun dataAdmin():Admin?{
            try {
                val gson=GsonBuilder().create()
                val json = gson.toJson(admin)
                return gson.fromJson(json,object : TypeToken<Admin>(){}.type)
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
        fun getContentHotNews():ArrayList<ResponseContentHotNews>{
            val listContent  = ArrayList<ResponseContentHotNews>()
            try {
                val split = content?.split("{image}")
                split?.let {
                    for (i in it.indices){
                        listContent.add(ResponseContentHotNews(it[i],listImage()?.get(i) ?: ""))
                    }
                }
            }catch (e:Exception){
                e.printStackTrace()
            }
            return listContent
        }
    }
    data class Admin(
        val name:String,
        val avatar:ArrayList<String>
    )
    class ResponseContentHotNews{
        var content: String = ""
        var image: String =""
        constructor(content: String,image:String){
            this.content=content
            this.image=image
        }
        constructor()
    }
}