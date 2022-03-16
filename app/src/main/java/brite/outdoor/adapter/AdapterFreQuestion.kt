package brite.outdoor.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.BR
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.response.ListPostUserData
import brite.outdoor.data.api_entities.response.ResponseQuestion
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.databinding.ItemFrequentQuestionBinding
import brite.outdoor.entity.EntityFreQuestion
import brite.outdoor.utils.extension.ImageViewExtension.setCommentQuestion
import brite.outdoor.utils.extension.ImageViewExtension.setLikeQuestion
import brite.outdoor.utils.extension.ImageViewExtension.setSaveQuestion
import brite.outdoor.utils.resizeLayout
import brite.outdoor.utils.setSingleClick

class AdapterFreQuestion(
    var listFreQuestion: ArrayList<ResponseQuestion.QuestionData>,
    var context: Context,
    var listener: OnClickItemListener,
    val recyclerView: RecyclerView
) :
    RecyclerView.Adapter<AdapterFreQuestion.FreQuestionHolder>() {

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
    private var mOnClickItemListener: OnClickItemListener? = null
    val userId = PrefManager.getInstance(context).getString(PrefConst.PREF_USER_ID)

    companion object {
        const val SCROLL_PERCENTAGE = 98
    }

    init {
        this.mOnClickItemListener = listener

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

    interface OnClickItemListener {
        fun onClickLike(entityQuestion: ResponseQuestion.QuestionData?, position: Int)
        fun onClickComment(entityQuestion: ResponseQuestion.QuestionData?, position: Int)
        fun onClickSaved(entityQuestion: ResponseQuestion.QuestionData?, position: Int)
        fun onClickDelete(entityQuestion: ResponseQuestion.QuestionData?, position: Int)
        fun onClickItem(entityQuestion: ResponseQuestion.QuestionData)
    }

    inner class FreQuestionHolder(val binding: ItemFrequentQuestionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.apply {
                imgAvatar.layoutParams?.width = MyApplication.getInstance().getSizeWithScale(46.0)
                imgAvatar.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(46.0)

                val sizeHeightIcon = MyApplication.getInstance().getSizeWithScale(18.0)
                val sizeWidthIcon = MyApplication.getInstance().getSizeWithScale(18.0)

                imgLike.resizeLayout(sizeHeightIcon, sizeWidthIcon)
                imgComment.resizeLayout(sizeHeightIcon, sizeWidthIcon)
                imgSaved.resizeLayout(sizeHeightIcon, sizeWidthIcon)
            }
        }

        fun binData(item: ResponseQuestion.QuestionData) {
            binding.apply {
                imgLike.setLikeQuestion(item.question_likes,context)
                imgSaved.setSaveQuestion(item.question_bookmarks,context)
                imgComment.setCommentQuestion(item.comment_count,context)

                layoutLike.setSingleClick {
                    mOnClickItemListener?.onClickLike(
                        item,
                        this@FreQuestionHolder.bindingAdapterPosition
                    )
                }
                root.setSingleClick {
                    mOnClickItemListener?.onClickComment(
                        item,
                        this@FreQuestionHolder.bindingAdapterPosition
                    )
                }
                layoutSave.setSingleClick {
                    mOnClickItemListener?.onClickSaved(
                        item,
                        this@FreQuestionHolder.bindingAdapterPosition
                    )
                }
                layoutTrash.setSingleClick {
                    mOnClickItemListener?.onClickDelete(
                        item,
                        this@FreQuestionHolder.bindingAdapterPosition
                    )
                }
                clAvatar.setSingleClick {
                    mOnClickItemListener?.onClickItem(item)
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FreQuestionHolder {
        val binding = DataBindingUtil.inflate<ItemFrequentQuestionBinding>(
            LayoutInflater.from(context),
            R.layout.item_frequent_question, parent, false
        )
        return FreQuestionHolder(binding)
    }

    override fun onBindViewHolder(holder: FreQuestionHolder, position: Int) {
        val item = listFreQuestion[position]
        holder.binData(item)
        holder.binding.setVariable(BR.item, item)
        if (item.created_id==userId?.toInt()) holder.binding.setVariable(BR.isQuestionYou,true)
        else holder.binding.setVariable(BR.isQuestionYou,false)
        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int = listFreQuestion.size

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

    fun removeItem(position: Int) {
        listFreQuestion.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position,listFreQuestion.size)
        notifyItemChanged(listFreQuestion.size-1)
    }
    fun addItemFirstPosition(item: ResponseQuestion.QuestionData){
        listFreQuestion.add(0,item)
        notifyDataSetChanged()
        recyclerView.scrollToPosition(0)
    }
}