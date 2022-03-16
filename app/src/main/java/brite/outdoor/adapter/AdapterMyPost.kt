package brite.outdoor.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.BR
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.data.api_entities.response.ListPostUserData
import brite.outdoor.data.api_entities.response.ListPostUserResponse
import brite.outdoor.databinding.ItemMyPostBinding
import brite.outdoor.databinding.ItemNewsVer2Binding
import brite.outdoor.utils.*
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.squareup.picasso.Picasso


class AdapterMyPost(
    var listMyPost : ArrayList<ListPostUserData>,
    private val onClickItemListener: OnClickItemListener,
    private val userId: String?,
    private val isBottomNav:Boolean=true,
    private val mContext:Context
) :
    RecyclerView.Adapter<AdapterMyPost.MyPostViewHolder>() {


    interface OnClickItemListener {
        fun onClickMenu(entityMyPage: ListPostUserData?, position: Int?)
        fun onClickItem(entityMyPage: ListPostUserData?,position: Int)
        fun onClickLike(entityNew: ListPostUserData?, position: Int)
        fun onClickComment(entityNew: ListPostUserData?,position: Int)
        fun onClickShare(entityNew: ListPostUserData?,position: Int)
    }


    fun updateData() {
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterMyPost.MyPostViewHolder {
        return from(parent)
    }

    fun from(parent: ViewGroup): AdapterMyPost.MyPostViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemNewsVer2Binding.inflate(layoutInflater, parent, false)
        return MyPostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AdapterMyPost.MyPostViewHolder, position: Int) {
        val entityNews = listMyPost[position]
        holder.binData(entityNews,holder.bindingAdapterPosition,holder.binding)
        holder.binding.setVariable(BR.item, entityNews)
        holder.binding.executePendingBindings()

    }

    override fun getItemCount(): Int {
        return listMyPost.size
    }

    inner class MyPostViewHolder(val binding: ItemNewsVer2Binding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.apply {
                MyApplication.getInstance().run {
                    clTitleAndImg.layoutParams?.height = getSizeWithScale(276.0)
                    imgAvatar.layoutParams?.width = getSizeWithScale(38.0)
                    imgAvatar.layoutParams?.height = getSizeWithScale(38.0)
                    imgMenu.layoutParams?.width = getSizeWithScale(20.0)
                    imgMenu.layoutParams?.height =getSizeWithScale(25.0)
                    val textSize =getSizeWithScaleFloat(16.0)

                    imgLike.layoutParams.width = MyApplication.getInstance().getSizeWithScale(22.48)
                    imgLike.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)

                    imgShare.layoutParams.width = MyApplication.getInstance().getSizeWithScale(22.48)
                    imgShare.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)

                    imgComment.layoutParams.width = MyApplication.getInstance().getSizeWithScale(22.48)
                    imgComment.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)

                    tvLike.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize)
                    tvShare.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize)
                    tvComment.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize)


                    viewLine.layoutParams?.height = getSizeWithScale(95.0)
                    viewFooter.layoutParams?.height = getSizeWithScale(35.0)
                    tvMonth.setTextSizePX(getSizeWithScaleFloat(18.0))
                    tvDay.setTextSizePX(getSizeWithScaleFloat(48.0))
                    progress.layoutParams?.height = getSizeWithScale(45.0)
                    progress.layoutParams?.width = getSizeWithScale(45.0)

                }

            }
        }

        @SuppressLint("SetTextI18n")
        fun binData(entityMyPage: ListPostUserData?,position: Int,binding: ItemNewsVer2Binding) {
            binding.apply {
                entityMyPage?.let { nonNullPost ->
                    if (nonNullPost.location_id == null || nonNullPost.location_id == 0) {
                        imgLocation.setImageResource(R.drawable.ic_utensil_item_news_ver2)
                    } else {
                        imgLocation.setImageResource(R.drawable.ic_location_item_news_ver2)
                    }
                    binding.progress.visibility=View.VISIBLE
                    binding.progress.setAnimation(12,800)
                    try {
                        if (nonNullPost.getListContent()?.size?:0 > 0 && (nonNullPost.getListContent()?.get(0)?.listImg?.size?:0 > 0)) {
                            try {
                                Glide.with(mContext).load(urlImage(nonNullPost.getListContent()?.get(0)?.listImg?.get(0), nonNullPost.url_prefix))
                                    .listener(object :RequestListener<Drawable>{
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
                                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                                    .into(binding.imgPost)
                            }catch (e:Exception){
                                binding.imgPost.loadImageWithCustomCorners("",1)
                            }
                        } else {
                            binding.imgPost.loadImageWithCustomCorners("",1)
                        }
                    } catch (e: Exception) {
                        imgPost.setImageBitmap(null)
                        e.printStackTrace()
                    }
                    nonNullPost.post_likes?.let {
                        setViewInteractive(it, nonNullPost)
                    }

                    if (isBottomNav){
                         if (position==listMyPost.size-1 && listMyPost.size>1){
                       viewFooter.visibility=View.VISIBLE
                   }else viewFooter.visibility=View.GONE
                    }
                    if (userId?.isNotEmpty() == true){
                        if (userId.toInt() == entityMyPage.created_id){
                            imgMenu.visibility = View.VISIBLE
                        }else imgMenu.visibility = View.GONE
                    }

                    // listener item
                    clTitleAndImg.setSingleClick {
                        onClickItemListener.onClickItem(
                            getItemAt(bindingAdapterPosition),
                            position = bindingAdapterPosition
                        )
                    }
                    clLike.setSingleClick {
                        onClickItemListener.onClickLike(
                            getItemAt(bindingAdapterPosition),
                            bindingAdapterPosition
                        )
                    }
                    clComment.setSingleClick {
                        onClickItemListener.onClickComment(getItemAt(bindingAdapterPosition),bindingAdapterPosition)
                    }
                    clShare.setSingleClick {
                        onClickItemListener.onClickShare(getItemAt(bindingAdapterPosition),bindingAdapterPosition)
                    }
                    imgMenu.setSingleClick {
                        onClickItemListener.onClickMenu(
                            getItemAt(bindingAdapterPosition),
                            bindingAdapterPosition
                        )
                    }


                }
            }

        }

        @SuppressLint("SetTextI18n")
        private fun setViewInteractive(statusLike: Boolean, listMyPost: ListPostUserData?) {
            binding.apply {
                if (listMyPost?.post_likes == true) {
                    binding.imgLike.apply {
                        setImageDrawable(ResourcesCompat.getDrawable(context.resources,R.drawable.ic_liked,null))
                    }

                } else {
                    binding.imgLike.apply {
                        setImageDrawable(ResourcesCompat.getDrawable(context.resources,R.drawable.ic_like,null))
                    }
                }
                tvLike.text = (listMyPost?.like_count ?: 0).toString()
                tvComment.text = (listMyPost?.comment_count ?: 0).toString()
                tvShare.text = (listMyPost?.share_count ?: 0).toString()
            }
        }
    }
    
    private fun getItemAt(position: Int) : ListPostUserData? {
        if (position >= 0 && position < listMyPost.size) {
            return listMyPost[position]
        }
        return null
    }
    fun removeItem(position: Int){
        listMyPost.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position,listMyPost.size)
        notifyItemChanged(listMyPost.size-1)
    }

}