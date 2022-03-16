package brite.outdoor.data.api_entities.response

object ResponseEditQuestion {
    class EditQuestionResult : BaseApiResult()
    data class EditQuestionResponse(
        val response:Boolean
    )
}