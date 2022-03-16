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
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.*
import brite.outdoor.BR
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.data.api_entities.response.ListPostUserData
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
import java.util.concurrent.Executors
import kotlin.math.log


class AdapterHome(var context: Context, var onClickItemListener: OnClickItemListener, var recyclerView: RecyclerView, private val isShowViewLine: Boolean = true) :
        ListAdapter<ListPostUserData, AdapterHome.HomeViewHolder>(
                AsyncDifferConfig.Builder<ListPostUserData>(HomeDiffUtilCallBack()).setBackgroundThreadExecutor(Executors.newSingleThreadExecutor()).build()) {
    private var mContext: Context? = null
    var arrayListNews = ArrayList<ListPostUserData>()
    var isLoading: Boolean = false
    var loadMore: ILoadMore? = null
    var lastVisibleItem: Int? = null
    var totalItemCount: Int? = null
    var visibleThreshold: Int = 1
    var visibleItemCount: Int? = null
    var offset: Int? = null
    var extent: Int? = null
    var range: Int? = null
    var percentage: Int? = null

    companion object {
        const val SCROLL_PERCENTAGE = 98
    }

    interface OnClickItemListener {
        fun onClickMenu(entityNew: ListPostUserData?, position: Int)
        fun onClickItem(entityNew: ListPostUserData?, position: Int)
        fun onClickLike(entityNew: ListPostUserData?,position: Int)
        fun onClickComment(entityNew: ListPostUserData?,position: Int)
        fun onClickShare(entityNew: ListPostUserData?,position: Int)
        fun onClickItemGoToFrmPersonalPage(userId:Int?)
    }

    private var mOnClickItemListener: OnClickItemListener?

    init {
        mContext = context
        mOnClickItemListener = onClickItemListener

        val linearLayoutManager = recyclerView.layoutManager as LinearLayoutManager
        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                try {
                    totalItemCount = linearLayoutManager.itemCount
                    lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition()
                    visibleItemCount = linearLayoutManager.childCount
                    offset = recyclerView.computeVerticalScrollOffset()
                    extent = recyclerView.computeVerticalScrollExtent()
                    range = recyclerView.computeVerticalScrollRange()
                    percentage = ((100.0 * offset!! / (range!!.toFloat() - extent!!)).toInt())
                    if (!isLoading && ((totalItemCount!!) <= (lastVisibleItem!! + visibleThreshold)) && dy > 0 && percentage!! > SCROLL_PERCENTAGE) {
                        if (loadMore != null) {
                            loadMore?.onLoadMore()
                        }

                        isLoading = true

                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }
        })

    }

    override fun submitList(list: List<ListPostUserData>?) {
        arrayListNews.clear()
        if (list != null) {
            arrayListNews.addAll(list)
        }
        super.submitList(arrayListNews)
        notifyDataSetChanged()
        this.recyclerView.scrollToPosition(0)

//        notifyDataSetChanged()
    }
    fun clearAllData(){
        arrayListNews.clear()
        super.submitList(arrayListNews)
        notifyDataSetChanged()
    }

    fun addAllItem(list: ArrayList<ListPostUserData>) {
        val oldSize = arrayListNews.size
        arrayListNews.addAll(list)
        try {
            super.submitList(arrayListNews)
            notifyItemChanged(oldSize-1)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun updateListFollowUnFollow(hashMap: HashMap<Int, Int>) {
        for ((key, value) in hashMap) {
            currentList.forEach {
                if (it.created_id == key) {
                    if (it.state_follow != value) {
                        it.state_follow = value
                    }

                }
            }
        }
    }
    fun removeUnFollow(id:Int){
        val data = arrayListNews.filterNot {
                id==it.created_id
            }
        arrayListNews.clear()
        arrayListNews.addAll(data)
        super.submitList(data)
        notifyDataSetChanged()
    }

    fun removeItem(position: Int) {
        arrayListNews.removeAt(position)
        notifyItemRemoved(position)
        notifyItemChanged(arrayListNews.size-1)
//        notifyDataSetChanged()
    }

    fun setLoaded() {
        isLoading = false
    }

    @JvmName("setLoadMore1")
    fun setLoadMore(loadMore: ILoadMore?) {
        this.loadMore = loadMore
    }

    interface ILoadMore {
        fun onLoadMore()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding = DataBindingUtil.inflate<ItemNewsVer2Binding>(LayoutInflater.from(context), R.layout.item_news_ver2, parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = getItem(position)
        holder.binData(holder.binding, item, holder.bindingAdapterPosition)
        holder.binding.setVariable(BR.item, item)
        holder.binding.executePendingBindings()
//            holder.setIsRecyclable(false)
//        if (isShowViewLine) {
//            if (position == 0) {
//                holder.binding.viewLine.visibility = View.VISIBLE
//            } else holder.binding.viewLine.visibility = View.GONE
//
//            if (position == currentList.size.minus(1)) {
//                holder.binding.viewFooter.visibility = View.VISIBLE
//            } else holder.binding.viewFooter.visibility = View.GONE
//        }
    }

    class HomeDiffUtilCallBack : DiffUtil.ItemCallback<ListPostUserData>() {

        override fun areItemsTheSame(oldItem: ListPostUserData, newItem: ListPostUserData): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ListPostUserData, newItem: ListPostUserData): Boolean {
            return oldItem == newItem
        }

    }

    inner class HomeViewHolder(val binding: ItemNewsVer2Binding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.apply {
//                clItemNews.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(412.0)
//                clTitleAndImg.layoutParams?.width = MyApplication.getInstance().getSizeWithScale(326.0)

                clTitleAndImg.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(276.0)
                imgAvatar.layoutParams?.width = MyApplication.getInstance().getSizeWithScale(38.0)
                imgAvatar.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(38.0)
                imgMenu.layoutParams?.width = MyApplication.getInstance().getSizeWithScale(20.0)
                imgMenu.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(25.0)

                val textSize = MyApplication.getInstance().getSizeWithScaleFloat(16.0)

                imgLike.layoutParams.width = MyApplication.getInstance().getSizeWithScale(22.48)
                imgLike.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)

                imgShare.layoutParams.width = MyApplication.getInstance().getSizeWithScale(22.48)
                imgShare.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)

                imgComment.layoutParams.width = MyApplication.getInstance().getSizeWithScale(22.48)
                imgComment.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)

                tvLike.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize)
                tvShare.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize)
                tvComment.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize)


                viewLine.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(95.0)
                viewFooter.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(35.0)
                tvMonth.setTextSizePX(MyApplication.getInstance().getSizeWithScaleFloat(18.0))
                tvDay.setTextSizePX(MyApplication.getInstance().getSizeWithScaleFloat(48.0))
                imgLocation.layoutParams?.width = MyApplication.getInstance().getSizeWithScale(24.0)
                imgLocation.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(24.0)
                progress.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(45.0)
                progress.layoutParams?.width = MyApplication.getInstance().getSizeWithScale(45.0)

            }
        }

        fun binData(binding: ItemNewsVer2Binding, item: ListPostUserData, position: Int) {
            binding.apply {
                setViewInteractive(binding, item)
                imgMenu.setSingleClick {
                    mOnClickItemListener?.onClickMenu(entityNew = item, this@HomeViewHolder.bindingAdapterPosition)
                }
                clComment.setSingleClick {
                    mOnClickItemListener?.onClickComment(entityNew = item,this@HomeViewHolder.bindingAdapterPosition)
                }
                clLike.setSingleClick {
                    mOnClickItemListener?.onClickLike(entityNew = item,this@HomeViewHolder.bindingAdapterPosition)
                }
                clShare.setSingleClick {
                    mOnClickItemListener?.onClickShare(entityNew = item,this@HomeViewHolder.bindingAdapterPosition)
                }
                clTitleAndImg.setSingleClick {
                    mOnClickItemListener?.onClickItem(entityNew = item, position = this@HomeViewHolder.bindingAdapterPosition)
                }
                if (item.location_id == null || item.location_id == 0) {
                    imgLocation.setImageResource(R.drawable.ic_utensil_item_news_ver2)
                } else {
                    imgLocation.setImageResource(R.drawable.ic_location_item_news_ver2)
                }
                clAvatar.setSingleClick {
                    mOnClickItemListener?.onClickItemGoToFrmPersonalPage(userId = item.created_id)
                }

                if (position==arrayListNews.size-1){
                       viewFooter.visibility=View.VISIBLE
                }else viewFooter.visibility=View.GONE

                binding.progress.visibility=View.VISIBLE
                binding.progress.setAnimation(12,800)

                try {
                    if (item.getListContent()?.size?:0 > 0 && (item.getListContent()?.get(0)?.listImg?.size?:0 > 0)){
                        item.getListContent()?.get(0)?.listImg?.get(0)?.let {
                            Glide.with(binding.imgPost).load(urlImage(it,item.url_prefix))
                                .listener(object : RequestListener<Drawable>{
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
                                .into(binding.imgPost)
                        }
                    }
                }catch (e:Exception){
                    binding.imgPost.loadImageWithCustomCorners("",1)
                }

            }

        }

        @SuppressLint("SetTextI18n")
        fun setViewInteractive(binding: ItemNewsVer2Binding, item: ListPostUserData) {
            binding.apply {
                if (item.post_likes == true) {
                    binding.imgLike.apply {
                        setImageDrawable(ResourcesCompat.getDrawable(context.resources,R.drawable.ic_liked,null))
                    }

                } else {
                    binding.imgLike.apply {
                        setImageDrawable(ResourcesCompat.getDrawable(context.resources,R.drawable.ic_like,null))
                    }

                }
                tvLike.text = (item.like_count ?: 0).toString()
                tvComment.text = (item.comment_count ?: 0).toString()
                tvShare.text = (item.share_count ?: 0).toString()
            }

        }
    }
}