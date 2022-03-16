package brite.outdoor.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.data.api_entities.response.ListPostUserResponse
import brite.outdoor.data.entities.PostContentEntity
import brite.outdoor.data.entities.PostContentHotNewsEntity
import brite.outdoor.databinding.ItemContentDetailBinding
import brite.outdoor.databinding.ItemContentDetailHotNewsBinding
import brite.outdoor.databinding.ItemPushPostContentBinding
import brite.outdoor.utils.loadImageWithCustomCorners
import brite.outdoor.utils.resizeHeight
import brite.outdoor.utils.resizeLayout
import brite.outdoor.utils.urlImage
import brite.outdoor.viewmodel.DetailViewModel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.layour_image_picked_preview.view.*

class AdapterContentDetailHotNews(
    val mContent: Context,
    val heightButton: Int,
    val sizeTextContent: Float,
    val onClickImageListener: OnClickImageListener
) :
    RecyclerView.Adapter<AdapterContentDetailHotNews.ContentDetailViewHolder>() {
    interface OnClickImageListener {
        fun onClick(entityNew: PostContentEntity?,position: Int)
    }
    private var listContent : ArrayList<PostContentHotNewsEntity>? = null
    fun getListContent():ArrayList<PostContentHotNewsEntity>?{
        return listContent
    }
    fun updateList(list: ArrayList<PostContentHotNewsEntity>?) {
        list?.let {
            this.listContent = list
            notifyDataSetChanged()
        }

    }

    fun from(parent: ViewGroup): ContentDetailViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemContentDetailHotNewsBinding.inflate(layoutInflater, parent, false)
        return ContentDetailViewHolder(binding)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentDetailViewHolder {
        return from(parent)
    }

    override fun onBindViewHolder(holder: ContentDetailViewHolder, position: Int) {
        holder.bind(position)
    }

    fun getItemAt(position: Int): PostContentHotNewsEntity? {
        if (listContent?.size ?: 0 < position) return null
        return listContent!![position]
    }

    override fun getItemCount(): Int {
        return listContent?.size ?: 0
    }

    inner class ContentDetailViewHolder(private val binding: ItemContentDetailHotNewsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.apply {
                tvContent.setTextSize(TypedValue.COMPLEX_UNIT_PX, sizeTextContent)

                progress.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(45.0)
                progress.layoutParams?.width = MyApplication.getInstance().getSizeWithScale(45.0)

                image.layoutParams.height  =  MyApplication.getInstance().getSizeWithScale(256.0)
            }
        }

        private fun getLastPosition() : Int {
            return listContent!!.size - 1
        }


        fun bind(position: Int) {
            binding.apply {
                getItemAt(position)?.apply {
                    tvContent.text = content
                    if (this.imagePicker.value?.uri?.isEmpty()==true){
                        image.visibility = View.GONE
                        progress.visibility = View.GONE
                    }else{
                        binding.progress.visibility=View.VISIBLE
                        image.visibility = View.VISIBLE
                    }
                    binding.progress.setAnimation(12,800)
                    Glide.with(binding.image).load(this.imagePicker.value?.uri)
                        .listener(object : RequestListener<Drawable> {
                            override fun onLoadFailed(
                                e: GlideException?,
                                model: Any?,
                                target: Target<Drawable>?,
                                isFirstResource: Boolean
                            ): Boolean {
                                binding.progress.visibility=View.GONE
                                binding.progress.animation=null
                                return false
                            }

                            override fun onResourceReady(
                                resource: Drawable?,
                                model: Any?,
                                target: Target<Drawable>?,
                                dataSource: DataSource?,
                                isFirstResource: Boolean
                            ): Boolean {
                                binding.progress.visibility=View.GONE
                                binding.progress.animation=null
                                return false
                            }

                        })
                        .error(R.drawable.ic_no_image)
                        .transform(CenterCrop(), RoundedCorners(1))
                        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                        .into(binding.image)
                }
            }

        }
    }
}