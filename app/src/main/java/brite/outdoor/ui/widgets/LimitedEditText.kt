package brite.outdoor.ui.widgets

import android.content.Context
import android.widget.Toast

import android.text.Editable

import android.text.TextWatcher
import android.util.AttributeSet


class LimitedEditText: androidx.appcompat.widget.AppCompatEditText {

    private var maxLines = 2
    private var maxCharacters = 80

    fun getMaxCharacters(): Int {
        return maxCharacters
    }

    fun setMaxCharacters(maxCharacters: Int) {
        this.maxCharacters = maxCharacters
    }

    override fun getMaxLines(): Int {
        return maxLines
    }

    override fun setMaxLines(maxLines: Int) {
        this.maxLines = maxLines
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(context!!, attrs, defStyle) {

    }

    constructor(context: Context?, attrs: AttributeSet?): super(context!!, attrs) {

    }

    constructor(context: Context?): super(context!!) {
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        val watcher: TextWatcher = object : TextWatcher {
            private var text: String? = null
            private var beforeCursorPosition = 0
            override fun onTextChanged(
                s: CharSequence, start: Int, before: Int,
                count: Int,
            ) {
                //TODO sth
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int,
            ) {
                text = s.toString()
                beforeCursorPosition = start
            }

            override fun afterTextChanged(s: Editable) {

                removeTextChangedListener(this)

                if (this@LimitedEditText.lineCount > maxLines) {
                    this@LimitedEditText.setText(text)
                    this@LimitedEditText.setSelection(beforeCursorPosition)
                }

                if (s.toString().length > maxCharacters) {
                    this@LimitedEditText.setText(text)
                    this@LimitedEditText.setSelection(beforeCursorPosition)
                }

                addTextChangedListener(this)
            }
        }
        addTextChangedListener(watcher)
    }
}