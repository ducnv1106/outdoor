package brite.outdoor.ui.fragments.question

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import brite.outdoor.R
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmEditQuestionBinding
import brite.outdoor.ui.dialog.DialogSuccess
import brite.outdoor.ui.fragments.BaseDialogFragment
import brite.outdoor.utils.AppUtils
import brite.outdoor.utils.resizeHeight
import brite.outdoor.utils.setSingleClick
import brite.outdoor.viewmodel.EditQuestionViewModel
import brite.outdoor.viewmodel.MyPostViewModel
import brite.outdoor.viewmodel.QuestionViewModel
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.Subscribe
import java.util.*

@AndroidEntryPoint
class FrmEditQuestion : BaseDialogFragment<FrmEditQuestionBinding>() {

    private val questionViewModel by viewModels<QuestionViewModel>({ requireParentFragment() })
    private val mViewModel by viewModels<EditQuestionViewModel>()
    private val myPostViewModel by viewModels<MyPostViewModel>()

    override fun loadControlsAndResize(binding: FrmEditQuestionBinding?) {
        binding?.apply {
            clTopNav.resizeHeight(getSizeWithScale(56.0))
            edtContent.minHeight = getSizeWithScale(100.0)

            imgBack.setSingleClick {
                dismissAllowingStateLoss()
            }

            tvOver.setSingleClick {
                handlerEditQuestion()
            }
        }
    }

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FrmEditQuestionBinding {
        return FrmEditQuestionBinding.inflate(inflater)
    }

    override fun initView(savedInstanceState: Bundle?) {
        getBinding()?.mViewModel = mViewModel
        getBinding()?.lifecycleOwner = this

        questionViewModel.contentSelected?.let {
            mViewModel.contentPost.value = it.content
        }
        observerEditQuestion()
    }
    private fun handlerEditQuestion(){
        getBinding()?.apply {
            val length = edtContent.text.toString().trim().length
            val content = edtContent.text.toString().trim()
            if(length>0){
                questionViewModel.contentSelected?.let {
                    callApiEditQuestion(content,it.id.toString())
                    AppUtils.hideKeyboard(root)
                }
            }
        }

    }

    private fun callApiEditQuestion(content:String,idQuestion:String){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_CONTENT] = content
            mViewModel.requestEditQuestion(requestParam,idQuestion)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerEditQuestion(){
        mViewModel.editQuestionResult.observe(this,{
            myPostViewModel.showOrHideLoading(it)
            when(it.status){
                ApiResult.Status.SUCCESS->{
                    questionViewModel.apply {
                        contentSelected?.content = getBinding()?.edtContent?.text.toString().trim()
                        setActionSate(QuestionViewModel.STATE.NOTIFY_DATA)
                    }
                    it?.data?.message?.let { message->
                        showDialogSuccess(message)
                    }
                    dismissAllowingStateLoss()
                }
                ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN->shareViewModel.isNeedShowErr.value = ApiNoticeEntity(it.status, it.message)
                ApiResult.Status.ERROR_NETWORK->shareViewModel.isNeedShowErr.value == ApiNoticeEntity(it.status,null)
                else->{}

            }
            // show loading
            myPostViewModel.isShowLoading.observe(viewLifecycleOwner,{ isShowLoading->
                shareViewModel.isShowLoading.value=isShowLoading
            })
        })
    }
    private fun showDialogSuccess(tvMessage: String) {
        try {
            val dialogSuccess = DialogSuccess(requireContext())
            dialogSuccess.show(tvMessage, false)
            val timeDismiss = Timer()
            timeDismiss.schedule(object : TimerTask() {
                override fun run() {
                    dialogSuccess.dismiss()
                    dialogSuccess.cancel()
                }
            }, 2000)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


}