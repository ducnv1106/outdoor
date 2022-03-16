package brite.outdoor.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.data.api_entities.response.ListPostUserData
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.databinding.ItemImageContentBlockBinding
import brite.outdoor.utils.resizeHeight
import brite.outdoor.utils.resizeLayout
import brite.outdoor.utils.setSingleClick
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.squareup.picasso.Picasso
import java.util.concurrent.Executors

class AdapterContentBlock(
    private val mContext: Context,
    private val listImageSelected: MutableLiveData<ArrayList<ImagePicker>>,
    private val onClickItemRemoveListener: (position: Int) -> Unit
) : ListAdapter<ImagePicker,AdapterContentBlock.ContentBlockViewHolder>(
       AsyncDifferConfig.Builder<ImagePicker>(BlockUtilCallBack()).setBackgroundThreadExecutor(
           Executors.newSingleThreadExecutor()).build()) {


    private var listData = ArrayList<ImagePicker>()

    inner class ContentBlockViewHolder(val binding: ItemImageContentBlockBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            MyApplication.getInstance().apply {
                    binding.imgRemove.resizeLayout(getSizeWithScale(24.0),getSizeWithScale(24.0))
                    binding.image.resizeHeight(getSizeWithScale(300.0))
            }

        }

        fun binData(item: ImagePicker) {
            binding.apply {
                Glide.with(mContext)
                    .load(item.uri)
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                    .transform(CenterCrop(), RoundedCorners(1))
                    .error(R.drawable.ic_no_image)
                    .into(image)

                imgRemove.setSingleClick {
                    onClickItemRemoveListener(this@ContentBlockViewHolder.bindingAdapterPosition)
                    listData.removeAt(this@ContentBlockViewHolder.bindingAdapterPosition)
                    notifyItemRemoved(this@ContentBlockViewHolder.bindingAdapterPosition)
                    listImageSelected.value = listData
                }
            }
        }

    }
    class BlockUtilCallBack : DiffUtil.ItemCallback<ImagePicker>() {

        override fun areItemsTheSame(oldItem: ImagePicker, newItem: ImagePicker): Boolean {
            return oldItem.uri == newItem.uri
        }

        override fun areContentsTheSame(oldItem: ImagePicker, newItem: ImagePicker): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentBlockViewHolder {
        val binding = DataBindingUtil.inflate<ItemImageContentBlockBinding>(
            LayoutInflater.from(mContext),
            R.layout.item_image_content_block,
            parent,
            false
        )
        return ContentBlockViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContentBlockViewHolder, position: Int) {
        val item = listData[holder.bindingAdapterPosition]
        holder.binData(item)
    }


    fun updateData() {
        listData.clear()
        listImageSelected.value?.let {
            listData.addAll(it)
        }
        notifyDataSetChanged()
    }

    override fun submitList(list: List<ImagePicker>?) {
        listData.clear()
        listImageSelected.value?.let {
            listData.addAll(it)
        }
        super.submitList(listData)
        notifyDataSetChanged()

    }



}