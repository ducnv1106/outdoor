package brite.outdoor.ui.widgets

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.utils.resizeHeight
import brite.outdoor.utils.resizeLayout
import brite.outdoor.utils.resizeWidth

class CustomShimmerPlaceholderSearchUser : ConstraintLayout {

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init(context)
    }

    private var mContext: Context? = null
    private var clRoot: ConstraintLayout? = null
    private var ivAvatar: AppCompatImageView? = null
    private var tvName: AppCompatTextView? = null
    private var btnFollow: AppCompatTextView? = null


    private fun init(context: Context) {
        this.mContext = context
        val view = inflate(context, R.layout.item_search_user_shimmer_placerholder, this)

        clRoot = view.findViewById(R.id.clRoot)
        ivAvatar = view.findViewById(R.id.ivAvatar)
        tvName = view.findViewById(R.id.tvName)
        btnFollow = view.findViewById(R.id.btnFollow)


        MyApplication.getInstance().run {
            ivAvatar?.resizeLayout(getSizeWithScale(50.0), getSizeWithScale(50.0))
            tvName?.resizeLayout(getSizeWithScale(150.0), getSizeWithScale(20.0))
            btnFollow?.resizeLayout(getSizeWithScale(80.0), getSizeWithScale(20.0))
        }
    }
}