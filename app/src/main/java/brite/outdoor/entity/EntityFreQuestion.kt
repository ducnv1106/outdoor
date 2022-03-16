package brite.outdoor.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class EntityFreQuestion(
    var id:Int = 0,
    var content: String = "",
    var isLike : Boolean = false,
    var isSave : Boolean = false,
    var isQuestionYou : Boolean = false,
    val listComment: ArrayList<EntityCommentQuestion> = ArrayList()
):Parcelable

@Parcelize
data class EntityCommentQuestion(
    var id:Int = 0,
    var content: String = ""
):Parcelable