package brite.outdoor.ui.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.utils.setTextSizePX

class CustomShimmerPlaceholderQuestion: ConstraintLayout {
    constructor(context: Context) : super(context) {
        init(context)
    }
    constructor(context: Context, attrs: AttributeSet) : super(context,attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int): super(context, attrs, defStyle) {
        init(context)
    }
    private var mContext: Context? = null
    private var imgAvatar: CustomImageButton? = null
    private var tvName: TextView?=null
    private var tvTime: TextView?=null
    private var tvContent:TextView?=null
    private var layoutBottom:LinearLayout?=null

    private fun init(context: Context) {
        this.mContext = context
        val view = inflate(context, R.layout.item_question_shimmer_placeholder, this)
        imgAvatar = view.findViewById(R.id.imgAvatar)
        tvName = view.findViewById(R.id.tvName)
        tvTime = view.findViewById(R.id.tvTime)
        tvContent = view.findViewById(R.id.tvContent)
        layoutBottom = view.findViewById(R.id.layout_bottom)

        imgAvatar?.layoutParams?.width = MyApplication.getInstance().getSizeWithScale(46.0)
        imgAvatar?.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(46.0)

        tvName?.layoutParams?.width = MyApplication.getInstance().getSizeWithScale(130.0)
        tvName?.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(16.0)

        tvTime?.layoutParams?.width = MyApplication.getInstance().getSizeWithScale(80.0)
        tvTime?.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(16.0)

        tvContent?.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(120.0)

        layoutBottom?.layoutParams?.height = MyApplication.getInstance().getSizeWithScale(48.0)


    }

}