package brite.outdoor.ui.fragments.question

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.FrameLayout
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.viewpager.widget.ViewPager
import brite.outdoor.R
import brite.outdoor.adapter.HomePagerAdapter
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.AppConst.Companion.FRM_QUESTION
import brite.outdoor.constants.ExtraConst
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_COMMENT_ID
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_QUESTION_ID
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_THREAD_ID
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmQuestionBinding
import brite.outdoor.ui.dialog.DialogSuccess
import brite.outdoor.ui.fragments.BaseFragment
import brite.outdoor.utils.*
import brite.outdoor.viewmodel.AuthViewModel
import brite.outdoor.viewmodel.MyPostViewModel
import brite.outdoor.viewmodel.QuestionViewModel
import brite.outdoor.viewmodel.QuestionViewModel.CurrentFragment
import com.google.android.material.tabs.TabLayout
import dagger.hilt.android.AndroidEntryPoint
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import java.util.*


@AndroidEntryPoint
class FrmQuestion : BaseFragment<FrmQuestionBinding>(){

    private val questionViewModel by viewModels<QuestionViewModel>()
    private val myPostViewModel by viewModels<MyPostViewModel>()
    private val authViewModel by activityViewModels<AuthViewModel>()
    private val frmFrmQuestion by lazy { FrmFrequentQuestion() }
    private val frmSaveQuestion by lazy { FrmSaveQuestion() }
    private var indicatorWidth:Int?=null
    private lateinit var mAdapter : HomePagerAdapter

    private val tabIcon by lazy { arrayListOf(R.drawable.bg_ic_frequent_question_selector,R.drawable.bg_ic_saved_question_selector) }
    private val tabTitle by lazy { arrayListOf(resources.getString(R.string.str_general_question),resources.getString(R.string.str_question_saved)) }


    companion object{
        fun getInstance(mapData: HashMap<String, Any>?):FrmQuestion{
            val fragment = FrmQuestion()
            val data = Bundle()
            if (mapData != null) {
                if (mapData.containsKey(EXTRA_QUESTION_ID))
                    data.putInt(
                        EXTRA_QUESTION_ID, mapData[EXTRA_QUESTION_ID] as Int
                    )

                if (mapData.containsKey(ExtraConst.EXTRA_IS_NOTIFICATION)){
                    data.putBoolean(ExtraConst.EXTRA_IS_NOTIFICATION,mapData[ExtraConst.EXTRA_IS_NOTIFICATION] as Boolean)
                }
                if (mapData.containsKey(EXTRA_COMMENT_ID)){
                    data.putInt(EXTRA_COMMENT_ID,mapData[EXTRA_COMMENT_ID] as Int)
                }
                if (mapData.containsKey(EXTRA_THREAD_ID)){
                    data.putInt(EXTRA_THREAD_ID,mapData[EXTRA_THREAD_ID] as Int)
                }
            }
            fragment.arguments = data
            return fragment
        }
    }
    override fun loadControlsAndResize(binding: FrmQuestionBinding?) {
      binding?.apply {
          clTopNav.resizeHeight(getSizeWithScale(56.0))
          tvTopNavTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(14.0))
          edtContent.minHeight = getSizeWithScale(50.0)
          tab.layoutParams.height = getSizeWithScale(38.0)
          indicator2.layoutParams.height = getSizeWithScale(38.0)

          imgBack.setSingleClick {
              AppUtils.hideKeyboard(root)
              finish()
          }
          layoutSend.setSingleClick {
              handlerPostQuestion()
          }
      }
    }
    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmQuestionBinding {
        return  FrmQuestionBinding.inflate(inflater)
    }

    override fun initView(savedInstanceState: Bundle?) {
        getBinding()?.mQuestionViewModel = questionViewModel
        getBinding()?.lifecycleOwner=this
        initViewPager()
        setupTabIcons()
        observerCreateQuestion()
        observerChangeLanguage()
        questionViewModel.resultTypeFragment.observe(this@FrmQuestion,{

        })
        questionViewModel.isFromNotification.observe(this,{
            if (it){
                mActivity?.showCommentQuestion(this.childFragmentManager,itemDeleteListener = {})
            }
        })
        onListenerTabLayout()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        arguments?.apply {
            this@FrmQuestion.questionViewModel.isFromNotification.value = getBoolean(ExtraConst.EXTRA_IS_NOTIFICATION)
            val questionId = getInt(EXTRA_QUESTION_ID)
            val threadId = getInt(EXTRA_THREAD_ID)
            val commentId = getInt(EXTRA_COMMENT_ID)
            this@FrmQuestion.questionViewModel.prepareDataCommentQuestion(questionId,threadId,commentId)
        }
    }


    override fun getCurrentFragment(): Int = FRM_QUESTION

    override fun finish() {
        mActivity?.closeQuestion(this)
        mActivity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)


    }

    override fun backToPrevious() {
        finish()
    }
    override fun isBackPreviousEnable(): Boolean {
        return true
    }

    private fun initViewPager(){
        mAdapter = HomePagerAdapter(this.childFragmentManager, arrayListOf(frmFrmQuestion,frmSaveQuestion),tabTitle)

        getBinding()?.apply {
            viewPager.addOnPageChangeListener(object :ViewPager.OnPageChangeListener{
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {

                    val params = getBinding()?.indicator?.layoutParams as FrameLayout.LayoutParams
                    //Multiply positionOffset with indicatorWidth to get translation
                    val translationOffset: Float = (positionOffset + position) * (indicatorWidth?:0) + (getBinding()?.tab?.x?:0).toFloat()
                    params.leftMargin = translationOffset.toInt()
                    getBinding()?.indicator?.layoutParams = params
                }

                override fun onPageSelected(position: Int) {
                    when(position){
                        0->{
                            questionViewModel.setCurrentFragment(CurrentFragment.FrequentQuestion)
                            getBinding()?.indicator?.setBackgroundResource(R.drawable.gradient_bg_question_left)
                        }
                        1->{
                            questionViewModel.setCurrentFragment(CurrentFragment.SavedQuestion)
                            getBinding()?.indicator?.setBackgroundResource(R.drawable.gradient_bg_question_right)
                        }
                    }
                }

                override fun onPageScrollStateChanged(state: Int) {

                }

            })

            viewPager.offscreenPageLimit = 3
            viewPager.adapter = mAdapter
            getBinding()?.tab?.setupWithViewPager(getBinding()?.viewPager)


            getBinding()?.tab?.post {
                indicatorWidth = getBinding()?.tab?.let { getBinding()?.tab?.width?.div(it.tabCount) }

                //Assign new width
                val indicatorParams = getBinding()?.indicator?.layoutParams
                indicatorParams?.let {
                    if (indicatorWidth != null) {
                        (indicatorParams as FrameLayout.LayoutParams).width = indicatorWidth as Int
                        indicatorParams.height = getSizeWithScale(38.0)
                    }
                    getBinding()?.indicator?.layoutParams = indicatorParams
                }

            }


        }

    }

    private fun setupTabIcons() {
        getBinding()?.apply {
            tab.getTabAt(0)?.setIcon(tabIcon[0])
            tab.getTabAt(1)?.setIcon(tabIcon[1])

        }

    }

    private fun handlerPostQuestion(){
        getBinding()?.apply {
            val length = edtContent.text.toString().trim().length
            val content = edtContent.text.toString().trim()
            if (length>0){
                callApiCreateQuestion(content)
                clearEditText()
            }
        }
    }
    private fun clearEditText(){
        questionViewModel.contentPost.value=""
        AppUtils.hideKeyboard(getBinding()?.root)
        getBinding()?.edtContent?.clearFocus()

    }
    private fun callApiCreateQuestion(content:String){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_CONTENT] = content
            questionViewModel.requestCreateQuestion(requestParam)
            questionViewModel.setActionSate(QuestionViewModel.STATE.POST_QUESTION)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerCreateQuestion(){
        questionViewModel.createQuestionResult.observe(this,{
            myPostViewModel.showOrHideLoading(it)
            when(it.status){
                ApiResult.Status.SUCCESS->{
                    questionViewModel.setActionSate(QuestionViewModel.STATE.EXECUTE_POST_QUESTION)
                    questionViewModel.setNeedRefreshDataQuestion()
                    it.data?.message?.let { message->
                        showDialogSuccess(message)
                    }
                }
                ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                    questionViewModel.setActionSate(QuestionViewModel.STATE.EXECUTE_POST_QUESTION)
                    shareViewModel.isNeedShowErr.value= ApiNoticeEntity(it.status, it.message)
                }
                else->{}
            }
        })
    }
    private fun observerChangeLanguage(){
        authViewModel.isChangeLanguage.observe(viewLifecycleOwner,{
            if (it){
                mAdapter.updateTitle(arrayListOf(resources.getString(R.string.str_general_question),resources.getString(R.string.str_question_saved)))
                frmFrmQuestion.updateUIAfterChangLanguage()
                frmSaveQuestion.updateUIAfterChangLanguage()
                getBinding()?.apply {
                    tvTopNavTitle.text = resources.getString(R.string.str_frequent_question)
                    edtContent.hint = resources.getString(R.string.str_enter_your_question)
                }

            }

        })
    }
    private fun onListenerTabLayout(){
        getBinding()?.apply {
            tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
                override fun onTabSelected(tab: TabLayout.Tab?) {

                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {

                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                    when (viewPager.currentItem){
                        0 -> frmFrmQuestion.refreshAndScrollToFirstItem()
                        1 -> frmSaveQuestion.refreshAndScrollToFirstItem()
                    }
                }

            })
        }
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
    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.getDefault().post("StatusBar")

    }

    override fun statusBarColor() = AppConst.STATUS_BAR_WHITE

    @SuppressLint("ResourceType")
    @Subscribe
    fun onEvent(event: Any) {
        when(event){
            is String ->{
                event.apply {
                    if (this == "StatusBar"){
                        mActivity?.updateStatusBarColor(resources.getString(R.color.colorWhite))
                        mActivity?.setLightStatusBar()
                    }
                }
            }
        }
    }


}