package brite.outdoor.utils.extension

import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.BindingAdapter

object ViewExtension {

    @BindingAdapter("setShowOrHide")
    @JvmStatic
    fun View.setShowOrHide(isHide : Boolean){
        if (isHide){
            this.visibility = View.GONE
        }else{
            this.visibility = View.VISIBLE
        }
    }
}