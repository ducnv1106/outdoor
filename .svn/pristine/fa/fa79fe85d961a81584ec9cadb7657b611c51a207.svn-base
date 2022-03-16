package brite.outdoor.adapter

import android.content.Context
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.databinding.ItemPickCameraBinding
import brite.outdoor.databinding.ItemPickImageBinding
import brite.outdoor.utils.resizeHeight
import brite.outdoor.utils.resizeLayout
import brite.outdoor.utils.setSingleClick
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class ImagePickerAdapter(
    private val isEditPost:Boolean=false,
    private val mContext: Context,
    private val listImageSelected: MutableLiveData<ArrayList<ImagePicker>>,
    private val wightItem: Int,
    private val wightCheckBox: Int,
    private val mgCheckBox: Int,
    private val textSize: Float,
    private val onClickItemCameraListener:()->Unit
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var listImage: ArrayList<ImagePicker> = ArrayList()
    private val TYPE_VIEW_CAMERA=1
    private val TYPE_VIEW_MEDIA=2
    val tmpListImageSelected = ArrayList<ImagePicker>()
    private var isUpdateListSelected :  Boolean = true


    fun insertImagePicker(itemInsert:ImagePicker){
            listImageSelected.value?.let {
                for (itemSelected in it){
                    if (itemInsert.uri==itemSelected.uri){
                        itemInsert.isChecked=true
                        itemInsert.numberSelect = itemSelected.numberSelect
                        tmpListImageSelected.add(itemInsert)
                    }

                    // media use camera app
                    var isContainMedia = false
                    if (itemSelected.path.isNotEmpty()){
                        tmpListImageSelected.forEach {
                            if (it.uri==itemSelected.uri) isContainMedia=true
                        }
                       if (!isContainMedia) tmpListImageSelected.add(itemSelected)
                    }
                }

            }
            if (isEditPost){
                listImageSelected.value?.let {
                    for (itemSelected in it){
                        if (itemSelected.isFileToSever) {
                            val position =  tmpListImageSelected.withIndex().filter { (_, value)->
                                value.uri==itemSelected.uri
                            }.map { (i, _)->i }.singleOrNull()
                            if (position==null) tmpListImageSelected.add(itemSelected)
                        }
                    }
                }
            }

            if (tmpListImageSelected.size==listImageSelected.value?.size && isUpdateListSelected){
                tmpListImageSelected.sortBy { selector(it) }
                listImageSelected.value = tmpListImageSelected
                isUpdateListSelected=false
            }
            this.listImage.add(itemInsert)
            notifyItemChanged(listImage.size-1)
    }
    fun insertFirstPositionImagePicker(itemInsert:ImagePicker){
        tmpListImageSelected.add(itemInsert)
        listImageSelected.value=tmpListImageSelected
        this.listImage.add(1,itemInsert)
        notifyDataSetChanged()
    }

    fun selector(p: ImagePicker): Int = p.numberSelect
    inner class CameraVewHolder(val binding: ItemPickCameraBinding):RecyclerView.ViewHolder(binding.root){
        init {
            binding.apply {
                rootView.resizeLayout(wightItem, wightItem)
                ivImage.resizeLayout(MyApplication.getInstance().getSizeWithScale(25.0),MyApplication.getInstance().getSizeWithScale(25.0))
            }
        }
        fun bind(imagePicker: ImagePicker, position: Int){
            binding.apply {
               rootView.setSingleClick {
                   onClickItemCameraListener()
               }
            }

        }
    }

    inner class ImageViewHolder(val binding: ItemPickImageBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.apply {
                rootView.resizeLayout(wightItem, wightItem)
                imgVideo.resizeLayout(wightCheckBox,wightCheckBox)
                rlCheckBox.resizeLayout(wightCheckBox, wightCheckBox)
                tvCountChecked.resizeLayout(wightCheckBox, wightCheckBox)
                tvCountChecked.setTextSize(TypedValue.COMPLEX_UNIT_PX,textSize)
                (rlCheckBox.layoutParams as ConstraintLayout.LayoutParams).marginEnd =
                    mgCheckBox
                (rlCheckBox.layoutParams as ConstraintLayout.LayoutParams).topMargin =
                    mgCheckBox
            }
        }

        fun bind(imagePicker: ImagePicker, position: Int) {
            binding.apply {
                if (imagePicker.isVideo) {
                    imgVideo.visibility = View.VISIBLE
                    ivBackGroundIcon.visibility = View.VISIBLE
                } else {
                    imgVideo.visibility = View.GONE
                    ivBackGroundIcon.visibility = View.GONE
                }
                imagePicker.position = this@ImageViewHolder.bindingAdapterPosition
                Glide.with(mContext)
                    .load(imagePicker.uri)
                    .apply(RequestOptions().centerCrop())
                    .into(ivImage)

                ivImage.setSingleClick {
                    imagePicker.isChecked = !imagePicker.isChecked
                    if (imagePicker.isChecked) {
                        resetCountSelected(imagePicker, true)
                    } else {
                        resetCountSelected(imagePicker, false)
                    }
                }

                rlCheckBox.setBackgroundResource(if (imagePicker.isChecked) R.drawable.bg_cb_selected else R.drawable.bg_cb)
                tvCountChecked.text =
                    if (imagePicker.numberSelect != 0) imagePicker.numberSelect.toString() else ""
            }
        }
    }

    fun resetCountSelected(imagePicker: ImagePicker, isAdd: Boolean) {
        listImageSelected.value?.let {
            var numberRemove = -1
            if (!isAdd) {
                imagePicker.isChecked = false
                numberRemove = imagePicker.numberSelect
                imagePicker.numberSelect = 0
                it.remove(imagePicker)
                notifyItemChanged(imagePicker.position)
            } else {
                it.add(imagePicker)
            }
            for (i in it.indices) {
                if (it[i].position != -1) {
                    if (isAdd) {
                        if (i == it.lastIndex) {
                            it[i].numberSelect = (i + 1)
                            notifyItemChanged(it[i].position)
                        }
                    } else {
                        if (it[i].numberSelect > numberRemove) {
                            it[i].numberSelect = (i + 1)
                            notifyItemChanged(it[i].position)
                        }
                    }
                }
            }
            listImageSelected.value = it
        }


    }

    fun findAndRemoveImageSelected(position: Int) {
        listImageSelected.value?.let { list ->
            if (list.size > position) {
                val imagePicker = list[position]
                imagePicker.isChecked = false
                resetCountSelected(imagePicker, false)
            }
        }

    }

    private fun from(parent: ViewGroup,viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        if (viewType==TYPE_VIEW_MEDIA){
            val binding = ItemPickImageBinding.inflate(layoutInflater, parent, false)
            return ImageViewHolder(binding)
        }else{
            val  binding = ItemPickCameraBinding.inflate(layoutInflater,parent,false)
            return CameraVewHolder(binding)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return from(parent,viewType)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ImageViewHolder){
            holder.apply {
                getItemAt(position)?.let {
                    holder.bind(it, position)
                }
            }

        }
        if (holder is CameraVewHolder){
            holder.apply {
                getItemAt(position)?.let {
                    holder.bind(it, position)
                }
            }
        }

    }

    override fun getItemViewType(position: Int): Int {
        if (listImage[position].isCamera){
            return TYPE_VIEW_CAMERA
        }else{
            return  TYPE_VIEW_MEDIA
        }
    }

    private fun getItemAt(position: Int): ImagePicker? {
        listImage.let {
            if (position < it.size) {
                return it[position]
            }
        }
        return null
    }

    override fun getItemCount(): Int {
        return listImage.size
    }
}