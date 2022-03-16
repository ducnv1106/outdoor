package brite.outdoor.data.api_entities.response

object ResponseLikeQuestion {
    class LikeQuestionResult : BaseApiResult()
    data class LikeQuestionResponse(
        var question_id : Int,
        var liked : Boolean,
        var like_count:Int,
        var commet_count:Int
    )
}