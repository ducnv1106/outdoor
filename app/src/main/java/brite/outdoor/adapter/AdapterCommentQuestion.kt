package brite.outdoor.adapter

import android.content.Context
import android.graphics.Color
import android.text.Layout
import android.text.SpannableString
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.BR
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.databinding.ItemCommentQuestionBinding
import brite.outdoor.utils.*
import kotlinx.android.synthetic.main.item_comment_question.view.*


class AdapterCommentQuestion(
    var listAnswerQuestion:ArrayList<ResponseAnswerQuestion.AnswerQuestion>,
    val urlPrefixAvatar: String,
    var context: Context,
    var listener: OnClickItemListener,
    val recyclerView: RecyclerView) : RecyclerView.Adapter<AdapterCommentQuestion.CommentQuestionHolder>() {

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
    private var urlPrefixComment: String? = null


    companion object {
        const val SCROLL_PERCENTAGE = 98
        const val LINES_TEXTVIEW_EXPANDED=100
        const val LINES_TEXTVIEW_COLLAPSE=4
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
        fun onClickReply(entity: ResponseAnswerQuestion.AnswerQuestion, position: Int)
        fun onClickReplyAnswerQuestion(entity: ResponseAnswerQuestion.AnswerQuestion,entityReply: ResponseAnswerQuestion.AnswerQuestionReply, positionAdapterComment: Int,position:Int)
        fun onClickDelete(entity: ResponseAnswerQuestion.AnswerQuestion, position: Int)
        fun onClickDeleteReplyAnswerQuestion(entity: ResponseAnswerQuestion.AnswerQuestionReply, positionAdapterComment: Int,position:Int)
        fun onClickUserName(entity: ResponseAnswerQuestion.AnswerQuestion)
        fun onClickSeeMore(entity: ResponseAnswerQuestion.AnswerQuestion,position: Int,lastestId:String)
    }

    fun insertItem(item: ResponseAnswerQuestion.AnswerQuestion) {
        try {
            listAnswerQuestion.add(item)
            notifyItemInserted(listAnswerQuestion.size - 1)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
    fun initUrlPrefixComment(urlPrefixComment: String){
        this.urlPrefixComment=urlPrefixComment
    }

    inner class CommentQuestionHolder(val binding: ItemCommentQuestionBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var adapterCommentReply : AdapterCommentReplyQuestion?=null
        init {
            binding.apply {
                MyApplication.getInstance().run {
                    imgAvatar.layoutParams?.width = getSizeWithScale(46.0)
                    imgAvatar.layoutParams?.height = getSizeWithScale(46.0)
                    imgComment.layoutParams?.width = getSizeWithScale(129.0)
                    imgComment.layoutParams?.height = getSizeWithScale(188.0)
                    (tvContentComment.layoutParams as ConstraintLayout.LayoutParams).marginStart = getSizeWithScale(46.0)
                }
            }
        }

        fun binData(item: ResponseAnswerQuestion.AnswerQuestion) {
            try {
                binding.apply {
                    initAdapterReplyQuestion(binding,item,this@CommentQuestionHolder.bindingAdapterPosition)

                    itemView.setSingleClick { AppUtils.hideKeyboard(itemView) }
                    imgAvatar.loadImageAvatar(item.avatar_user,urlPrefixAvatar,100)

                    tvDelete.text = context.resources.getString(R.string.lblDelete)
                    tvReply.text = context.resources.getString(R.string.lblReply)

                    if (!item.image.isNullOrEmpty() && !urlPrefixComment.isNullOrEmpty()){
                        imgComment.loadImageWithCustomCorners(urlImage(item.image, urlPrefixComment),10)
                        imgComment.visibility = View.VISIBLE
                    }else imgComment.visibility = View.GONE

                    val spannableString = SpannableString("${item.comment}")
                    tvContentComment.apply {
                        text = spannableString

                    }
                    if (!item.isMaxLine){
                        tvContentComment.maxLines = LINES_TEXTVIEW_COLLAPSE
                        btnSeeTextMore.text = context.resources?.getString(R.string.lblSeeMore)
                        btnSeeTextMore.setTextColor(Color.BLUE)
                    }else{
                        tvContentComment.maxLines= LINES_TEXTVIEW_EXPANDED
                        btnSeeTextMore.text =  context.resources?.getString(R.string.lbCollapse)
                        btnSeeTextMore.setTextColor(Color.RED)
                    }

                    tvName.text = item.user_name_created
                    if (userId?.toInt() == item.created_id ){
                        tvDelete.visibility = View.VISIBLE
                    }else{
                        tvDelete.visibility = View.GONE
                    }
                    if (item.question_comments_children.size < item.total_children){
                        btnSeeMore.visibility = View.VISIBLE
                    }else{
                        btnSeeMore.visibility = View.GONE
                    }

                    tvReply.setSingleClick {
                        mOnClickItemListener?.apply {
                            onClickReply(item,this@CommentQuestionHolder.bindingAdapterPosition)
                        }
                    }
                    tvDelete.setSingleClick {
                        mOnClickItemListener?.apply {
                            onClickDelete(item, this@CommentQuestionHolder.bindingAdapterPosition)
                        }
                    }
                    clAvatar.setSingleClick {
                        mOnClickItemListener?.apply {
                            onClickUserName(item)
                        }
                    }
                    btnSeeMore.setSingleClick {
                        mOnClickItemListener?.apply {
                            onClickSeeMore(item, this@CommentQuestionHolder.bindingAdapterPosition,item.lastedId.toString())
                        }
                    }
                    btnSeeTextMore.setSingleClick {
                        if (!item.isMaxLine){
                            tvContentComment.maxLines= LINES_TEXTVIEW_EXPANDED
                            btnSeeTextMore.text =  context.resources?.getString(R.string.lbCollapse)
                            btnSeeTextMore.setTextColor(Color.RED)
                        }else{
                            tvContentComment.maxLines = LINES_TEXTVIEW_COLLAPSE
                            btnSeeTextMore.text = context.resources?.getString(R.string.lblSeeMore)
                            btnSeeTextMore.setTextColor(Color.BLUE)
                        }
                        item.isMaxLine = !item.isMaxLine
                    }
                    tvContentComment.post(Runnable {
                        val layout: Layout = tvContentComment.layout
                        val lines: Int = layout.lineCount
                        if (lines > 0) {
                            val ellipsisCount: Int = layout.getEllipsisCount(lines - 1)
                            if (ellipsisCount > 0) {
                                btnSeeTextMore.visibility = View.VISIBLE
                            }else{
                                if (lines< LINES_TEXTVIEW_COLLAPSE) {
                                    btnSeeTextMore.visibility = View.GONE
                                }else{
                                    btnSeeTextMore.visibility = View.VISIBLE
                                }
                            }
                        }
                    })



                }
            }catch (e:Exception){
                e.printStackTrace()
            }

        }



        private fun initAdapterReplyQuestion(binding: ItemCommentQuestionBinding,item: ResponseAnswerQuestion.AnswerQuestion,positionAdapterComment: Int){
            binding.apply {
                adapterCommentReply = AdapterCommentReplyQuestion(item.question_comments_children ,urlPrefixAvatar,urlPrefixComment, context,object : AdapterCommentReplyQuestion.OnClickItemListener{
                    override fun onClickReply(entity: ResponseAnswerQuestion.AnswerQuestionReply, position: Int) {
                        mOnClickItemListener?.apply {
                            onClickReplyAnswerQuestion(item,entity,positionAdapterComment,position)
                        }
                    }

                    override fun onClickDelete(entity: ResponseAnswerQuestion.AnswerQuestionReply, position: Int) {
                        mOnClickItemListener?.apply {
                            onClickDeleteReplyAnswerQuestion(entity,positionAdapterComment,position)
                        }
                    }

                    override fun onClickUserName(entity: ResponseAnswerQuestion.AnswerQuestionReply) {

                    }

                },rcItemComment,item.total_children)
                rcItemComment.adapter = adapterCommentReply
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentQuestionHolder {
        val binding = DataBindingUtil.inflate<ItemCommentQuestionBinding>(
            LayoutInflater.from(context),
            R.layout.item_comment_question, parent, false
        )
        return CommentQuestionHolder(binding)
    }

    override fun onBindViewHolder(holder: CommentQuestionHolder, position: Int) {
        val item = listAnswerQuestion[position]
        holder.binData(item)
        holder.binding.setVariable(BR.item, item)
        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int = listAnswerQuestion.size


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

    fun addItemFirstPosition(item: ResponsePostAnswerQuestion.PostAnswerQuestionResponse){
        val itemAnswerQuestion = ResponseAnswerQuestion.AnswerQuestion(
            id = item.id,question_id = item.question_id,thread_id = item.thread_id,parent_id = item.parent_id,
            comment = item.comment,image = item.image,weight_flag = item.weight_flag,is_deleted = item.is_deleted,
            created_id = item.created_id,created_time = item.created_time,modified_time = item.modified_time,
            user_name_created = item.user_name_created,avatar_user = item.avatar_user,total_children = 0,
            question_comments_children = arrayListOf()
        )
        listAnswerQuestion.add(0,itemAnswerQuestion)
        notifyDataSetChanged()
        recyclerView.scrollToPosition(0)
    }
    fun addItemReplyAnswerQuestion(position: Int,item: ResponsePostAnswerQuestion.PostAnswerQuestionResponse){
        val itemAnswerQuestion = ResponseAnswerQuestion.AnswerQuestionReply(
            id = item.id,question_id = item.question_id,thread_id = item.thread_id,parent_id = item.parent_id,
            comment = item.comment,image = item.image,weight_flag = item.weight_flag,is_deleted = item.is_deleted,
            created_id = item.created_id,created_time = item.created_time,modified_time = item.modified_time,
            user_name_created = item.user_name_created,avatar_user = item.avatar_user,user_name_reply = item.user_name_reply,isAnswerQuestionNew = true

        )
        listAnswerQuestion[position].question_comments_children.add(itemAnswerQuestion)
        listAnswerQuestion[position].total_children += 1
        notifyItemChanged(position)
    }
    fun removeItem(position: Int) {
        listAnswerQuestion.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position,listAnswerQuestion.size)
        notifyItemChanged(listAnswerQuestion.size-1)
    }
    fun addListReplyAnswerQuestion(position: Int,list:List<ResponseAnswerQuestion.AnswerQuestionReply>){
        val listAnswer = getDistinctAnswerQuestionReply( listAnswerQuestion[position].question_comments_children,list)
        listAnswerQuestion[position].question_comments_children.addAll(listAnswer)
        notifyItemChanged(position)
    }
    private fun getDistinctAnswerQuestionReply(fisrtList: List<ResponseAnswerQuestion.AnswerQuestionReply>, secondList: List<ResponseAnswerQuestion.AnswerQuestionReply>): List<ResponseAnswerQuestion.AnswerQuestionReply> {
        return secondList.filter { it.id !in fisrtList.map { item -> item.id } }
    }


}