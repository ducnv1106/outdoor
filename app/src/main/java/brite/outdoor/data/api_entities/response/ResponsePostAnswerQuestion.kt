package brite.outdoor.data.api_entities.response

object ResponsePostAnswerQuestion {
    class PostAnswerQuestionResult : BaseApiResult()
    data class PostAnswerQuestionResponse(
        val id:Int,
        val question_id:Int,
        val thread_id:Int?,
        val parent_id:Int?,
        val comment:String,
        val image:String?,
        val weight_flag:Int,
        val is_deleted:Int,
        val created_id:Int,
        val created_time:String,
        val modified_time:String,
        val user_name_created:String,
        val avatar_user:String,
        val url_prefix_avatar:String,
        val url_prefix_comment:String,
        val like_count:Int?,
        var user_name_reply:String?,
        val comment_count:Int


    )
}