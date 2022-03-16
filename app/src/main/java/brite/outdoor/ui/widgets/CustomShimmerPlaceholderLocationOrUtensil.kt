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

class CustomShimmerPlaceholderLocationOrUtensil : ConstraintLayout {

    constructor(context: Context) : super(context) {
        init(context)
    }
    constructor(context: Context, attrs: AttributeSet) : super(context,attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int): super(context, attrs, defStyle) {
        init(context)
    }
    private var mContext:Context?=null
    private var ivLogo : AppCompatImageView?=null
    private var tvTitle: AppCompatTextView?=null
    private var tvContent: AppCompatTextView?=null

    private fun init(context: Context){
        this.mContext=context
        val view= inflate(context, R.layout.item_location_or_untensil_shimmer_placerholder,this)

        ivLogo = view.findViewById(R.id.ivLogo)
        tvTitle = view.findViewById(R.id.tvTitle)
        tvContent = view.findViewById(R.id.tvContent)


        MyApplication.getInstance().run {
            ivLogo?.resizeHeight(getSizeWithScale(110.0))
            tvTitle?.resizeHeight(getSizeWithScale(18.0))
            tvContent?.resizeHeight(getSizeWithScale(25.0))
        }
    }
}