package brite.outdoor.data.api_entities.response

object ResponseDeleteCamping {
    class DeleteCampingResult : BaseApiResult()

    data class DeleteCampingResponse(
        val response:Boolean
    )
}