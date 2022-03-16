package brite.outdoor.utils.extension

import android.content.Context
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import brite.outdoor.R
import brite.outdoor.ui.widgets.CustomImageButton
import brite.outdoor.utils.extension.ImageViewExtension.setSaveQuestion

object ImageViewExtension {
    fun AppCompatImageView.setLikeQuestion(isLike:Boolean,context:Context){
        if (isLike) {
            this.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.ic_happy_main
                )
            )
        } else {
            this.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.ic_happy_gray
                )
            )
        }
    }
    fun AppCompatImageView.setSaveQuestion(isSave:Boolean,context:Context){
        if (isSave) {
            this.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.ic_star_yellow
                )
            )
        } else {
            this.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.ic_star_gray
                )
            )
        }
    }
    fun AppCompatImageView.setCommentQuestion(countComment:Int,context:Context){
        if (countComment>0){
            this.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.icon_bulb_red
                )
            )
        }else{
            this.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.ic_bulb_gray
                )
            )
        }
    }


}