package brite.outdoor.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.R
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.response.ListPostUserData
import brite.outdoor.data.api_entities.response.ResponseFollowUser
import brite.outdoor.data.api_entities.response.ResponseSearchUser
import brite.outdoor.data.entities.ObjectSearch
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.databinding.ItemPeopleInteractiveBinding
import brite.outdoor.utils.*

class AdapterPeopleInteractive(val mContext: Context,val urlPrefixAvatar: String?, var onClickItemListener: OnClickItemListener,var recyclerView: RecyclerView) : RecyclerView.Adapter<AdapterPeopleInteractive.PeopleInteractiveViewHolder>() {
    private var listFollowUser: ArrayList<ResponseFollowUser.FollowUserData>? = null

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

    companion object{
        const val SCROLL_PERCENTAGE = 98
    }
    init {
        recyclerView.let {
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
                        if (!isLoading && ((totalItemCount!!) <= (lastVisibleItem!! + visibleThreshold)) && dy > 0 && percentage!! > AdapterHome.SCROLL_PERCENTAGE) {
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
    }
    interface OnClickItemListener {
        fun onClickItem(entityFollowUser: ResponseFollowUser.FollowUserData?)
        fun onClickFollow(entityFollowUser: ResponseFollowUser.FollowUserData?)
    }
    private var mOnClickItemListener: OnClickItemListener? = onClickItemListener

    fun getListFollowUser():ArrayList<ResponseFollowUser.FollowUserData>?{
        return listFollowUser
    }
    fun updateList(list: ArrayList<ResponseFollowUser.FollowUserData>?){
        list?.let {
            this.listFollowUser = list
            notifyDataSetChanged()
        }
    }
    fun insertList(list: ArrayList<ResponseFollowUser.FollowUserData>){
        val sizeOld = listFollowUser?.size
        listFollowUser?.addAll(list )
        if (sizeOld ?:0>0 && listFollowUser?.size?:0>0) notifyItemChanged(sizeOld ?:0 -1,listFollowUser?.size ?:0 -1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterPeopleInteractive.PeopleInteractiveViewHolder {
        return from(parent)
    }
    fun from(parent: ViewGroup): PeopleInteractiveViewHolder{
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemPeopleInteractiveBinding.inflate(layoutInflater, parent, false)
        return PeopleInteractiveViewHolder(binding)
    }
    override fun onBindViewHolder(holder: AdapterPeopleInteractive.PeopleInteractiveViewHolder, position: Int) {
        holder.bind(position)
    }
    fun getItemAt(position: Int):ResponseFollowUser.FollowUserData?{
        if (listFollowUser?.size?:0 < position) return null
        return listFollowUser!![position]
    }
    override fun getItemCount(): Int {
        return listFollowUser?.size ?: 0
    }

    inner class PeopleInteractiveViewHolder(private val binding: ItemPeopleInteractiveBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            binding.apply {
                clItemPeopleInteractive.resizeHeight(getSizeWithScale(80.0))
                imgAvatar.resizeLayout(getSizeWithScale(60.0), getSizeWithScale(60.0))
                btnFollow.resizeLayout(getSizeWithScale(110.0), getSizeWithScale(40.0))
                itemView.setSingleClick { mOnClickItemListener?.onClickItem(getItemAt(bindingAdapterPosition))}
                btnFollow.setSingleClick {
                    onClickItemListener.onClickFollow(getItemAt(bindingAdapterPosition))
                }
            }
        }

        fun bind(position: Int){
            binding.apply {
                getItemAt(position)?.apply {
                    tvName.text = username
                    imgAvatar.loadImageAvatar(this.avatar_user,urlPrefixAvatar,100)

                    val userId = PrefManager.getInstance(context =mContext).getString(PrefConst.PREF_USER_ID)
                    if (userId?.toInt() ==this.user_id )btnFollow.visibility = View.GONE

                    when (followed_flag) {
                        1 -> {
                            btnFollow.setTextColor(mContext.resources.getColor(R.color.colorMain))
                            btnFollow.setText(R.string.lblUnFollow)
                            btnFollow.isSelected = true
                        }
                        0 -> {
                            btnFollow.setTextColor(mContext.resources.getColor(R.color.white))
                            btnFollow.setText(R.string.lblFollow)
                            btnFollow.isSelected = false
                        }
                        else -> btnFollow.visibility = View.GONE
                    }
                }
            }
        }
    }
    @JvmName("setLoadMore1")
    fun setLoadMore(loadMore: ILoadMore?) {
        this.loadMore = loadMore
    }
    fun setLoaded() {
        isLoading = false
    }
    interface ILoadMore {
        fun onLoadMore()
    }


    private var scaleValue = 0F
    private fun getScaleValue(): Float {
        if (scaleValue == 0F) {
            scaleValue =
                mContext.resources.displayMetrics.widthPixels * 1f / AppConst.SCREEN_WIDTH_DESIGN
        }
        return scaleValue
    }

    fun getSizeWithScale(sizeDesign: Double): Int {
        return (sizeDesign * getScaleValue()).toInt()
    }

}