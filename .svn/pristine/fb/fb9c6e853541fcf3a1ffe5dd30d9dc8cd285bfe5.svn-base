package brite.outdoor.ui.dialog


import android.app.Dialog
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import brite.outdoor.R
import brite.outdoor.constants.AppConst
import brite.outdoor.utils.resizeLayout
import brite.outdoor.utils.setSingleClick

class DialogSavePushPost(context: Context): Dialog(context, R.style.dialogWithoutBox){
    private var isCancelAble = false
    private var tvTitle: TextView? = null
    private var tvConfirm: TextView? = null
    private var tvSaveDraft : TextView?=null
    private var tvDiscardPost:TextView?=null
    private var tvKeepEditing:TextView?=null
    private var rlRoot: View? = null
    private var listener: OnListenerDialog? = null

    interface OnListenerDialog{
        fun onClickSaveDraft()
        fun onClickDiscardPost()
        fun onClickKeepEditing()
    }

    fun show(isCancelAble: Boolean, listener: OnListenerDialog) {
        try {
            this.isCancelAble = isCancelAble
            this.listener = listener
            show()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    init {
        setContentView(R.layout.dialog_save_push_post)
        val displayMetrics = context.resources.displayMetrics
        tvTitle = findViewById(R.id.tvTitle)
        tvConfirm = findViewById(R.id.tvConfirm)
        tvSaveDraft = findViewById(R.id.tvSaveDraft)
        tvDiscardPost = findViewById(R.id.tvDiscardPost)
        tvKeepEditing = findViewById(R.id.tvKeepEditing)

        rlRoot = findViewById(R.id.rlRoot)

        val vContainer = findViewById<View>(R.id.rlContent)
        vContainer.layoutParams.width = displayMetrics.widthPixels
        vContainer.layoutParams.height = displayMetrics.heightPixels
        vContainer.setSingleClick { if (isCancelAble) dismiss() }
        tvSaveDraft?.setSingleClick {
            listener?.onClickSaveDraft()
            dismiss()
        }
        tvDiscardPost?.setSingleClick {
            listener?.onClickDiscardPost()
            dismiss()
        }
        tvKeepEditing?.setSingleClick {
            dismiss()
        }
    }


    //Start Resize
    private var scaleValue = 0F
    private fun getScaleValue(): Float {
        if (scaleValue == 0F) {
            scaleValue =
                context.resources.displayMetrics.widthPixels * 1f / AppConst.SCREEN_WIDTH_DESIGN
        }
        return scaleValue
    }

    fun getSizeWithScale(sizeDesign: Double): Int {
        return (sizeDesign * getScaleValue()).toInt()
    }
}