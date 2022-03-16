package brite.outdoor.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.databinding.ItemIntroBinding
import brite.outdoor.entity.EntityIntro
import brite.outdoor.utils.loadImageAvatar
import brite.outdoor.utils.urlImage
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

class AdapterIntro(val mContext: Context, private val arrayListIntro: ArrayList<EntityIntro>) : RecyclerView.Adapter<AdapterIntro.IntroHolder>() {

    override fun getItemCount(): Int = arrayListIntro.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroHolder {

        val  binding = DataBindingUtil.inflate<ItemIntroBinding>(LayoutInflater.from(mContext), R.layout.item_intro,parent,false)
        return IntroHolder(binding)
    }

    override fun onBindViewHolder(holder: IntroHolder, position: Int) {
        val item = arrayListIntro[position]
        holder.binData(holder.binding,item = item)
    }

    inner class IntroHolder(val binding:ItemIntroBinding) : RecyclerView.ViewHolder(binding.root){
        init {
            binding.apply {
                imgViewPageLogin.layoutParams.width = MyApplication.getInstance().getSizeWithScale(375.0)
                imgViewPageLogin.layoutParams.height = MyApplication.getInstance().getSizeWithScale(700.0)
            }
        }
        fun binData(binding: ItemIntroBinding,item:EntityIntro){
            binding.apply {
                tvTitle.text = mContext.resources.getText(item.title)
                tvIntro.text = mContext.resources.getText(item.content)
            }
            Glide.with(mContext).load(item.image)
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(binding.imgViewPageLogin)
        }
    }
}