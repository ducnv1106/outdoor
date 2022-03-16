package brite.outdoor.adapter

import android.content.Context
import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.BR
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.databinding.ItemReplyCommentQuestionBinding
import brite.outdoor.ui.widgets.ShowMoreTextView
import brite.outdoor.utils.*

class AdapterCommentReplyQuestion(
    var listAnswerQuestion:ArrayList<ResponseAnswerQuestion.AnswerQuestionReply>,
    val urlPrefixAvatar: String,
    val urlPrefixComment:String?,
    var context: Context,
    var listener: OnClickItemListener,
    val recyclerView: RecyclerView,
    var total_children:Int
) : RecyclerView.Adapter<AdapterCommentReplyQuestion.CommentReplyQuestionHolder>() {

    var isLoading: Boolean = false
    var lastVisibleItem: Int? = null
    var totalItemCount: Int? = null
    var visibleThreshold: Int = 1
    var visibleItemCount: Int? = null
    var offset: Int? = null
    var extent: Int? = null
    var range: Int? = null
    var percentage: Int? = null
    val userId = PrefManager.getInstance(context).getString(PrefConst.PREF_USER_ID)


    companion object {
        const val SCROLL_PERCENTAGE = 98
    }


    interface OnClickItemListener {
        fun onClickReply(entity: ResponseAnswerQuestion.AnswerQuestionReply, position: Int)
        fun onClickDelete(entity: ResponseAnswerQuestion.AnswerQuestionReply, position: Int)
        fun onClickUserName(entity: ResponseAnswerQuestion.AnswerQuestionReply)
    }

    fun insertItem(item: ResponseAnswerQuestion.AnswerQuestionReply) {
        try {
            listAnswerQuestion.add(item)
            notifyItemInserted(listAnswerQuestion.size - 1)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    inner class CommentReplyQuestionHolder(val binding: ItemReplyCommentQuestionBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.apply {
                MyApplication.getInstance().run {
                    imgAvatar.layoutParams?.width = getSizeWithScale(46.0)
                    imgAvatar.layoutParams?.height = getSizeWithScale(46.0)
                    imgComment.layoutParams?.width = getSizeWithScale(129.0)
                    imgComment.layoutParams?.height = getSizeWithScale(188.0)
                    (tvContentComment.layoutParams as ConstraintLayout.LayoutParams).marginStart = getSizeWithScale(46.0)

                }
                tvContentComment.apply {
                    setShowingLine(4)
                    setShowLessTextColor(Color.RED)
                    setShowMoreTextColor(Color.BLUE)
                    addShowLessText(context.resources.getString(R.string.lbCollapse))
                    addShowMoreText(context.resources.getString(R.string.lblSeeMore))
                }
            }
        }

        fun binData(item: ResponseAnswerQuestion.AnswerQuestionReply) {
            binding.apply {

                if (!item.image.isNullOrEmpty() && !urlPrefixComment.isNullOrEmpty()){
                    imgComment.loadImageWithCustomCorners(urlImage(item.image, urlPrefixComment),10)
                    imgComment.visibility = View.VISIBLE
                }else imgComment.visibility = View.GONE

                itemView.setSingleClick { AppUtils.hideKeyboard(itemView) }
                imgAvatar.loadImageAvatar(item.avatar_user,urlPrefixAvatar,100)

                val textComment = item.comment.replace("\n", "<br>")
                val spannableString = SpannableString("${item.user_name_reply} ${item.comment}")
                item.user_name_reply?.length?.let {
                    spannableString.setSpan(
                        ForegroundColorSpan(Color.BLUE),
                        0,
                        it,
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    )
                }
                tvContentComment.apply {
                    text = spannableString
                    setOnClickSeeMore(object : ShowMoreTextView.OnClickSeeMore{
                        override fun clickSeeMore() {
                            item.isMaxLine = true
                        }

                        override fun clickLessMore() {
                            item.isMaxLine = false
                        }

                    })
                    setIsSeeMore(item.isMaxLine)
                    setShowingLine(4)
                    if (textComment != null) {
                        setTextContent(textComment)
                    }
//                    if (ite != null) {
//                        setTextName(user_name_reply)
//                    }
                    setShowLessTextColor(Color.RED)
                    setShowMoreTextColor(Color.BLUE)
                    context?.resources?.getString(R.string.lbCollapse)?.let { addShowLessText(it) }
                    context?.resources?.getString(R.string.lblSeeMore)?.let { addShowMoreText(it) }
                }

                tvName.text = item.user_name_created
                if (userId?.toInt() == item.created_id ){
                    tvDelete.visibility = View.VISIBLE
                }else{
                    tvDelete.visibility = View.GONE
                }

//                if (!item.isSending){
//                    tvSending.visibility = View.GONE
//                    clDateAndReply.visibility = View.VISIBLE
//                }else{
//                    tvSending.visibility = View.VISIBLE
//                    clDateAndReply.visibility = View.GONE
//                }


                tvReply.setSingleClick {
                    listener.onClickReply(item,this@CommentReplyQuestionHolder.bindingAdapterPosition)
                }
                tvDelete.setSingleClick {

                    listener.onClickDelete(item, this@CommentReplyQuestionHolder.bindingAdapterPosition)

                }
                clAvatar.setSingleClick {
                    listener.onClickUserName(item)

                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentReplyQuestionHolder {
        val binding = DataBindingUtil.inflate<ItemReplyCommentQuestionBinding>(
            LayoutInflater.from(context),
            R.layout.item_reply_comment_question, parent, false
        )
        return CommentReplyQuestionHolder(binding)
    }

    override fun onBindViewHolder(holder: CommentReplyQuestionHolder, position: Int) {
        val item = listAnswerQuestion[position]
        holder.binData(item)
        holder.binding.setVariable(BR.item, item)
        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int = listAnswerQuestion.size

    fun removeItem(position: Int) {
        listAnswerQuestion.removeAt(position)
        total_children--
        notifyItemRemoved(position)
        notifyItemRangeChanged(position,listAnswerQuestion.size)
        notifyItemChanged(listAnswerQuestion.size-1)

    }


}