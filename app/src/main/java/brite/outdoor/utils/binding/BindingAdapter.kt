package brite.outdoor.utils.binding

import android.annotation.SuppressLint
import android.content.Intent
import android.location.Address
import android.net.Uri
import android.text.SpannableString
import android.text.method.DigitsKeyListener
import android.text.style.UnderlineSpan
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import brite.outdoor.R
import brite.outdoor.constants.AppConst.Companion.LIMIT_LINE_EDITTEXT
import brite.outdoor.data.api_entities.response.ResponseListCamping
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.entity.EntityLocationSave
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.facebook.shimmer.ShimmerFrameLayout


class BindingAdapter {
    companion object {
        @BindingAdapter("android:setMyTextSpan")
        @JvmStatic
        fun setCustomTextSpan(view: TextView, value: String) {
            val content = SpannableString(value)
            content.setSpan(UnderlineSpan(), 0, content.length, 0)
            view.text = content
        }

        @BindingAdapter("android:setSelectedImageView")
        @JvmStatic
        fun setSelectedImageView(view: ImageView, isSelected: MutableLiveData<Boolean>) {
            view.isSelected = isSelected.value == true
        }


        @BindingAdapter("android:changeToBrowser")
        @JvmStatic
        fun changeToBrowser(view: TextView, url: String) {
            view.setOnClickListener {
                view.context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
            }
        }

        @BindingAdapter("android:actionGlobal2Home")
        @JvmStatic
        fun actionGlobal2Home(view: Button, url: Int) {
            view.setOnClickListener {
//                view.findNavController().navigate(R.id.action_global_frmHome)
            }
        }

        @BindingAdapter("showOrHideShimmerLayout")
        @JvmStatic
        fun ShimmerFrameLayout.setShowOrHideShimmerLayout(showOrHideShimmerLayout:MutableLiveData<Boolean>?){
            if (showOrHideShimmerLayout?.value == true) {
                this.visibility = View.VISIBLE
                this.startShimmer()
            } else {
                this.stopShimmer()
                this.visibility = View.GONE
            }
        }

        @BindingAdapter("setSelectedView")
        @JvmStatic
        fun View.setSelectedView(isSelected: MutableLiveData<Boolean>){
            this.isSelected = isSelected.value==true
        }

        @BindingAdapter("android:showOrHideLoading")
        @JvmStatic
        fun showOrHideLoading(view: ProgressBar, isShowLoading: MutableLiveData<Boolean>) {
            if (isShowLoading.value == true) {
                view.visibility = View.VISIBLE
            } else {
                view.visibility = View.GONE
            }
        }

        @BindingAdapter("android:text")
        fun setLiveDataText(editText: EditText, liveData: LiveData<String>) {
            editText.setText(liveData.value)
        }

        @SuppressLint("SetTextI18n")
        @BindingAdapter("android:lengthText")
        @JvmStatic
        fun TextView.setLiveDataLength(liveData: LiveData<Int>){
            val length = liveData.value ?: 0
            this.text =  "${liveData.value.toString()}/250"
            if (length<250) {
                this.setTextColor(resources.getColor(R.color.grey_400))
            }else{
                this.setTextColor(resources.getColor(R.color.colorMain2))
            }

        }
        @BindingAdapter("digits")
        @JvmStatic
        fun EditText.digits(liveData: LiveData<String>){
            this.keyListener = DigitsKeyListener.getInstance(liveData.value ?: "")
        }
        @BindingAdapter("setImage")
        @JvmStatic
        fun AppCompatImageView.setImage(liveData: LiveData<EntityLocationSave>){
            var requestOptions = RequestOptions()
            requestOptions = requestOptions.transforms(CenterCrop(),
                GranularRoundedCorners(70f, 70f, 0f, 0f))
            Glide.with(context).load(liveData.value?.imgContent)
                .apply(requestOptions)
                .placeholder(R.drawable.progress_animation)
                .error(R.drawable.ic_no_image)
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(this)
        }

        @BindingAdapter("setImagePicker")
        @JvmStatic
        fun AppCompatImageView.setImagePicker(liveData: LiveData<ImagePicker?>){
            liveData.value?.let {
                val uri = Uri.parse(it.uri)
                Glide.with(context).load(uri).into(this)
            }

        }


        @BindingAdapter("setText")
        @JvmStatic
        fun TextView.setText(liveData: LiveData<ResponseListCamping.ListCampingData>){
            this.text = liveData.value?.description
        }

        @BindingAdapter("setNameLocation")
        @JvmStatic
        fun TextView.setNameLocation(liveData: LiveData<String>){
            this.text = liveData.value
        }

        @BindingAdapter("android:setSelectedImageViewSend")
        @JvmStatic
        fun ImageView.setSelectedImageViewSend(isSelected: MediatorLiveData<Boolean>) {
            if (isSelected.value==true){
                this.setImageDrawable( ContextCompat.getDrawable(
                    context,
                    R.drawable.ic_send_red_new
                ))
            }else{
                this.setImageDrawable( ContextCompat.getDrawable(
                    context,
                    R.drawable.ic_send_gray_new
                ))
            }
        }
        @BindingAdapter("limitLineEdt")
        @JvmStatic
        fun EditText.limitLineEdt(content:LiveData<String>){
            if (this.layout?.lineCount ?: 0 > LIMIT_LINE_EDITTEXT)
                this.text?.delete(this.text.length - 1, this.text.length);
        }


    }

}