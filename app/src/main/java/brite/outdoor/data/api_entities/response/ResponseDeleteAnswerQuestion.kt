package brite.outdoor.data.api_entities.response

object ResponseDeleteAnswerQuestion {
    class DeleteAnswerQuestionResult : BaseApiResult()
    data class DeleteAnswerQuestionResponse(
        val comment_count:Int
    )
}