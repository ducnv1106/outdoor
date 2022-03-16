package brite.outdoor.data.api_entities.response

object ResponsePostCommentHotNews {
    class PostCommentHotNewsResult : BaseApiResult()

    data class PostCommentHotNewsResponse(
        val id : Int,
        val hot_news_id: Int,
        val thread_id:Int?,
        val parent_id:Int?,
        val created_id:Int,
        val reply_id:Int?,
        val comment:String,
        val image:String,
        val weight_flag:Int?,
        val is_deleted:Int?,
        val created_time:String?,
        val modified_time:String,
        val user_name_created:String,
        val avatar_user:String,
        val user_name_reply:String,
        val url_prefix_avatar:String,
        val url_prefix_comment:String,
        val like_count:Int,
        val share_count:Int,
        val comment_count:Int


    )
}