package brite.outdoor.ui.widgets

import android.content.Context
import android.graphics.Color
import android.text.Html
import android.text.Spannable
import android.text.SpannableString
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.ViewTreeObserver
import androidx.appcompat.widget.AppCompatTextView

class ShowMoreTextView @kotlin.jvm.JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0,
) : AppCompatTextView(context, attrs, defStyleAttr){
    interface  OnClickSeeMore{
        fun clickSeeMore()
        fun clickLessMore()
    }

    private var mOnClickSeeMore: OnClickSeeMore? = null
    private var showingLine = 1

    private var showMore = "Show more"
    private var showLess = "Show less"
    private val threeDot = "…"

    private var showMoreTextColor = Color.RED
    private var showLessTextColor = Color.RED

    private var mainText: String? = null

    private var isAlreadySet = false
    private var isCollapse = true
    private var textName: String? = null
    private var textContent: String? = null
    private var isSeeMore: Boolean = false
    fun setIsSeeMore(isSeeMore: Boolean){
        this.isSeeMore = isSeeMore
    }
    fun setOnClickSeeMore(onClickSeeMore: OnClickSeeMore) {
        this.mOnClickSeeMore = onClickSeeMore
    }
    fun setTextName(text: String) {
        textName = text
    }

    fun setTextContent(text: String) {
        textContent = text
    }
    init {
        val spannableString = SpannableString(text)
        setColorName(spannableString)
        text = spannableString
        val vto = viewTreeObserver

        vto.addOnPreDrawListener(
            object: ViewTreeObserver.OnPreDrawListener {
                override fun onPreDraw(): Boolean {
                    if (showingLine >= lineCount) return true
//                    showLessButton()
                    if (isSeeMore){
                        showLessButton()
                    }
                    else{
                        showMoreButton()
                    }
                    viewTreeObserver.removeOnPreDrawListener(this)
                    //Your code
                    return true
                }
            }
        )
    }
    private fun setColorName(spannableString: SpannableString){
        textName?.length?.let {
            spannableString.setSpan(
                ForegroundColorSpan(Color.BLUE),
                0,
                it,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }
    }
    override fun onFinishInflate() {
        super.onFinishInflate()
        mainText = text.toString()
    }

    private fun showMoreButton() {
        val text = text.toString()
        if (!isAlreadySet) {
            mainText = text
            isAlreadySet = true
        }
        var showingText = ""
        var start = 0
        var end: Int
        for (i in 0 until showingLine) {
            end = layout.getLineEnd(i)
            showingText += text.substring(start, end)
            start = end
        }
        var specialSpace = 0
        var newText: String
        do {
            newText = showingText.substring(
                0, showingText.length - (specialSpace)
            )
            newText += "$threeDot $showMore"
            val spannableString = SpannableString(newText)
            setColorName(spannableString)
            setText(spannableString)
            specialSpace++

        } while (lineCount > showingLine)
        isCollapse = true
        setShowMoreColoringAndClickable()
    }

    private fun setShowMoreColoringAndClickable() {
        val spannableString = SpannableString(text)
        spannableString.setSpan(
            object : ClickableSpan() {
                override fun updateDrawState(paint: TextPaint) {
                    paint.isUnderlineText = false
                }

                override fun onClick(view: View) {
                    text = mainText
                    isCollapse = false
                    isSeeMore = true
                    mOnClickSeeMore?.clickSeeMore()
                    showLessButton()
                }
            }, text.length - showMore.length, text.length, 0
        )
        spannableString.setSpan(
            ForegroundColorSpan(showMoreTextColor),
            text.length - showMore.length,
            text.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        setColorName(spannableString)
        movementMethod = LinkMovementMethod.getInstance()
        setText(spannableString, BufferType.SPANNABLE)
    }

    private fun showLessButton() {
        maxLines = Int.MAX_VALUE
        val textRemoveShowLess = if (text.contains(showLess)){
            text.toString().replace(showLess, "")
        }else{
            text.toString()
        }
        val text = "$textRemoveShowLess $showLess"
        val spannableString = SpannableString(text)
        spannableString.setSpan(
            object : ClickableSpan() {
                override fun updateDrawState(pain: TextPaint) {
                    pain.isUnderlineText = false
                }

                override fun onClick(view: View) {
                    maxLines = showingLine
                    isSeeMore = false
                    mOnClickSeeMore?.clickLessMore()
                    showMoreButton()
                }
            }, text.length - showLess.length, text.length, 0
        )
        spannableString.setSpan(
            ForegroundColorSpan(showLessTextColor),
            text.length - (threeDot.length + showLess.length),
            text.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        setColorName(spannableString)
        movementMethod = LinkMovementMethod.getInstance()
        setText(spannableString, BufferType.SPANNABLE)
    }

    fun setShowingLine(lineNumber: Int) {
        if (lineNumber == 0) return
        showingLine = lineNumber
        maxLines = showingLine
    }

    fun addShowMoreText(text: String) {
        showMore = text
    }

    fun addShowLessText(text: String) {
        showLess = text
    }

    fun setShowMoreTextColor(color: Int) {
        showMoreTextColor = color
    }

    fun setShowLessTextColor(color: Int) {
        showLessTextColor = color
    }
}