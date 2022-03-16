package brite.outdoor.data.api_entities.response

object ResponseBookMarkQuestion {
    class BookMarkQuestionResult : BaseApiResult()
    data class BookMarkQuestionResponse(
        var bookMark: Boolean,
        var question_id: Int
    )
}