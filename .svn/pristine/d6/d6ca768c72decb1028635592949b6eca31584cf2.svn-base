package brite.outdoor.adapter

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.data.entities.PostContentEntity
import brite.outdoor.databinding.ItemPushPostContentNewBinding
import brite.outdoor.ui.widgets.LayoutImagePickedPreview
import brite.outdoor.utils.*


class AdapterPostContentNew(
    val mContent: Context,
    val heightButton: Int,
    val sizeIconAddImages: Int,
    val sizeTextContent: Float,
    val minHeightContent: Int,
    val scrollToNewContent: (lastPosition: Int) -> Unit,
    val transToSelectImages: (position: Int) -> Unit
) :
    RecyclerView.Adapter<AdapterPostContentNew.PostContentViewHolder>() {

    private var listContent : ArrayList<PostContentEntity>? = null
    fun getListContent():ArrayList<PostContentEntity>?{
        return listContent
    }
    fun updateList(list: ArrayList<PostContentEntity>?) {
        list?.let {
            this.listContent = list
            notifyDataSetChanged()
        }

    }

    fun from(parent: ViewGroup): PostContentViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemPushPostContentNewBinding.inflate(layoutInflater, parent, false)
        return PostContentViewHolder(binding)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostContentViewHolder {
        return from(parent)
    }

    override fun onBindViewHolder(holder: PostContentViewHolder, position: Int) {
        holder.bind(position)
    }

    fun getItemAt(position: Int): PostContentEntity? {
        if (listContent?.size ?: 0 < position) return null
        return listContent!![position]
    }

    override fun getItemCount(): Int {
        return listContent?.size ?: 0
    }

    inner class PostContentViewHolder(val binding: ItemPushPostContentNewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.apply {
                edtContent.minHeight = minHeightContent
                edtContent.setTextSize(TypedValue.COMPLEX_UNIT_PX, sizeTextContent)
                //
                edtContent.addTextChangedListener(object :TextWatcher{
                    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                    }

                    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                        getItemAt(position)?.content=s.toString()
                    }

                    override fun afterTextChanged(s: Editable?) {

                    }

                })

                if (listContent?.size ?:0>0){
                    this.rootView.topMargin = MyApplication.getInstance().getSizeWithScale(10.0)

                }
            }
        }

        private fun getLastPosition() : Int {
            return listContent!!.size - 1
        }


        fun bind(position: Int) {
            binding.apply {
                getItemAt(position)?.apply {
                    if (this@PostContentViewHolder.bindingAdapterPosition>0){
                        edtContent.hint = mContent.resources.getString(R.string.str_hint_content_item_push_post_block2)
                    }else edtContent.hint = mContent.resources.getString(R.string.str_hint_content_item_push_post)
                    edtContent.setText(content)
                    if (listImg.value.isNullOrEmpty()) {
                        vImagePreview.visibility = View.GONE
                    } else {
                        vImagePreview.visibility = View.VISIBLE
                        vImagePreview.initData(
                            mContent,
                            listImg.value
                        )
                    }

                    vImagePreview.setSingleClick {
                        content = edtContent.text.toString()
                        if (position < listContent!!.size)
                            transToSelectImages(position)
                    }
                }
                vImagePreview.setOnClickListener(object : LayoutImagePickedPreview.OnClickListener{
                    override fun onClickImage(position: Int) {

                    }

                    override fun onClickDelete(position: Int) {
                        findAndRemoveImageSelected(position,this@PostContentViewHolder.bindingAdapterPosition)
                        notifyItemChanged(this@PostContentViewHolder.bindingAdapterPosition)
                    }

                })
            }
        }
    }
    fun findAndRemoveImageSelected(position: Int,bindingAdapterPosition:Int) {
        listContent?.get(bindingAdapterPosition)?.listImg?.value?.let { list ->
            if (list.size > position) {
                val imagePicker = list[position]
                imagePicker.isChecked = false
                resetCountSelected(imagePicker, false,bindingAdapterPosition)

            }
        }

    }
    private fun resetCountSelected(imagePicker: ImagePicker, isAdd: Boolean, bindingAdapterPosition: Int) {
        listContent?.get(bindingAdapterPosition)?.listImg?.value?.let {
            var numberRemove = -1
            if (!isAdd) {
                imagePicker.isChecked = false
                numberRemove = imagePicker.numberSelect
                imagePicker.numberSelect = 0
                it.remove(imagePicker)
                notifyItemChanged(bindingAdapterPosition)
            } else {
                it.add(imagePicker)
            }
            for (i in it.indices) {
                if (it[i].position != -1) {
                    if (isAdd) {
                        if (i == it.lastIndex) {
                            it[i].numberSelect = (i + 1)
                            notifyItemChanged(bindingAdapterPosition)
                        }
                    } else {
                        if (it[i].numberSelect > numberRemove) {
                            it[i].numberSelect = (i + 1)
                            notifyItemChanged(bindingAdapterPosition)
                        }
                    }
                }
            }
            listContent?.get(bindingAdapterPosition)?.listImg?.value = it
        }


    }
}