package brite.outdoor.ui.fragments.question

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import brite.outdoor.R
import brite.outdoor.adapter.AdapterFreQuestion
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.AppConst.Companion.FRM_SAVE_QUESTION
import brite.outdoor.data.api_entities.ApiNoticeEntity
import brite.outdoor.data.api_entities.response.ResponseBookMarkQuestion
import brite.outdoor.data.api_entities.response.ResponseLikeQuestion
import brite.outdoor.data.api_entities.response.ResponseQuestion
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmSaveQuestionBinding
import brite.outdoor.ui.dialog.DialogDelete
import brite.outdoor.ui.fragments.BaseFragment
import brite.outdoor.utils.AppUtils
import brite.outdoor.viewmodel.MyPostViewModel
import brite.outdoor.viewmodel.QuestionViewModel
import brite.outdoor.viewmodel.SavedQuestionViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class FrmSaveQuestion : BaseFragment<FrmSaveQuestionBinding>() {

    private val mViewModel by viewModels<SavedQuestionViewModel>()
    private val questionViewModel by viewModels<QuestionViewModel>({requireParentFragment()})
    private var adapter: AdapterFreQuestion?=null
    private var totalLoadMoreResult: Int = AppConst.DEFAULT_TOTAL_RESULT
    private var lastestId:String=""
    private val myPostViewModel by viewModels<MyPostViewModel>()

    companion object{
        const val  QUESTION_YOU = "2"
    }

    override fun loadControlsAndResize(binding: FrmSaveQuestionBinding?) {
        binding?.apply {

        }
    }

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FrmSaveQuestionBinding {
       return FrmSaveQuestionBinding.inflate(inflater)
    }

    override fun initView(savedInstanceState: Bundle?) {
        getBinding()?.apply {
            mViewModel = this@FrmSaveQuestion.mViewModel
            lifecycleOwner=this@FrmSaveQuestion
        }
        initAdapter()
        callApiListQuestion()
        eventLoadMore()
        observerNeedRefreshData()
        observerListQuestion()
        observerLikeQuestion()
        observerBookMarkQuestion()
        observerDeleteQuestion()
        onRefreshListener()
        questionViewModel.actionState.observe(this,{
            when(it){
                QuestionViewModel.STATE.NOTIFY_DATA->{
                    questionViewModel.apply {
                        try {
                            adapter?.apply {
                                val position =  listFreQuestion.withIndex().filter { (_, value)->
                                    value.id==idQuestion
                                }.map { (i, _)->i }.single()
                                contentSelected?.let { contentSelected->
                                    listFreQuestion[position].content = contentSelected.content
                                }
                                notifyItemChanged(position)
                            }
                        }catch (e:Exception){
                            e.printStackTrace()
                        }
                    }
                }
                QuestionViewModel.STATE.DELETE->{
                    adapter?.notifyItemRemoved(questionViewModel.positionQuestion)
                }
                QuestionViewModel.STATE.POST_QUESTION->{
                    startShimmerLayout()
                }
                QuestionViewModel.STATE.EXECUTE_POST_QUESTION->{
                    stopShimmerLayout()
                }
                else->{}
            }
        })
    }

    override fun getCurrentFragment(): Int = FRM_SAVE_QUESTION

    override fun finish() {

    }

    private fun initAdapter(){
        getBinding()?.apply {
            adapter = AdapterFreQuestion(questionViewModel.listQuestionSave,requireContext(),object : AdapterFreQuestion.OnClickItemListener{
                override fun onClickLike(entityQuestion: ResponseQuestion.QuestionData?, position: Int) {
                   entityQuestion?.let {
                        callApiLike(entityQuestion.id)
                        questionViewModel.positionQuestionNeedNotifyChange(entityQuestion.id,position,FRM_SAVE_QUESTION)
                    }
                }

                override fun onClickComment(entityQuestion: ResponseQuestion.QuestionData?, position: Int) {
                    if (parentFragment is FrmQuestion){
                        (parentFragment as FrmQuestion).apply {
                            entityQuestion?.let {
                                questionViewModel.positionQuestionNeedNotifyChange(entityQuestion.id,position,FRM_SAVE_QUESTION,it)
                                questionViewModel.setContentSelected(entityQuestion)
                                AppUtils.hideKeyboard(root)
                                mActivity?.showCommentQuestion(this.childFragmentManager,itemDeleteListener = {position:Int ->deleteItemFrmCommentCallBack(position)})

                            }
                        }
                    }

                }

                override fun onClickSaved(entityQuestion: ResponseQuestion.QuestionData?, position: Int) {
                   entityQuestion?.let {
                        callApiBookMark(entityQuestion.id)
                        questionViewModel.positionQuestionNeedNotifyChange(entityQuestion.id,position,FRM_SAVE_QUESTION)
                    }
                }

                override fun onClickDelete(entityQuestion: ResponseQuestion.QuestionData?, position: Int) {
                    val dialogDelete = DialogDelete(requireContext())
                    dialogDelete.apply {
                        show(true, resources.getString(R.string.msgDeleteQuestion), resources.getString(R.string.msgConfirmDeleteQuestion), object :
                            DialogDelete.OnDeleteAgreeOrCancel{
                            override fun onAgree() {
                                entityQuestion?.let {
                                    questionViewModel.positionQuestionNeedNotifyChange(entityQuestion.id,position,
                                        FRM_SAVE_QUESTION
                                    )
                                    callApiDeleteQuestion(entityQuestion.id)
                                }
                            }
                        })
                    }

                }

                override fun onClickItem(entityQuestion: ResponseQuestion.QuestionData) {
                    mActivity?.showPersonalPageOrMyPage(entityQuestion.created_id)
                }

            },rcView)
            rcView.adapter=adapter
        }

    }
    private fun callApiListQuestion(lastestId:String=""){
        try {
            startShimmerLayout()
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_LASTEST_ID] = lastestId
            requestParam[ApiConst.PARAM_TYPE] = QUESTION_YOU
            mViewModel.requestListQuest(requestParam)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerListQuestion(){
        mViewModel.listQuestionResult.observe(this,{
            myPostViewModel.showOrHideLoading(it)
            when(it.status){
                ApiResult.Status.SUCCESS->{
                    stopShimmerLayout()
                    if (it.data?.response !is Boolean){
                        if (it.data?.response is ResponseQuestion.QuestionResponse){
                            (it.data.response as ResponseQuestion.QuestionResponse).let { response->
                                response.data?.apply {
                                    try {
                                        response.getListQuestion()?.let { list ->
                                            val startRange = if (questionViewModel.listQuestionSave.size == 0) 0 else (questionViewModel.listQuestionSave.size)
                                            val itemInsertCount = list.size
                                            questionViewModel.listQuestionSave.addAll(list)
                                            adapter?.notifyItemRangeInserted(
                                                startRange,
                                                itemInsertCount
                                            )
                                        }

                                    } catch (e: Exception) {
                                        e.printStackTrace()
                                    }
                                }
                                totalLoadMoreResult = response.total?:0
                                adapter?.setLoaded()
                                if (totalLoadMoreResult>0){
                                    response.getListQuestion()?.size?.let { size->
                                        lastestId =  response.getListQuestion()?.get(size-1)?.id.toString()
                                    }
                                }
                            }

                        }
                    }
                }
                ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                    stopShimmerLayout()
                    shareViewModel.isNeedShowErr.value= ApiNoticeEntity(it.status, it.message)
                }
                else->{}
            }
        })
    }
    private fun callApiLike(idQuestion: Int){
        try {
            startShimmerLayout()
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_QUESTION_ID] = idQuestion.toString()
            questionViewModel.requestLikeQuestion(requestParam)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerLikeQuestion(){
        questionViewModel.likeQuestionResult.value?.status=ApiResult.Status.CONSUMED
        try {
            questionViewModel.likeQuestionResult.observe(viewLifecycleOwner, {
                try {
                    myPostViewModel.showOrHideLoading(it)
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            stopShimmerLayout()
                            if (it.data?.response !is Boolean) {
                                if (it.data?.response is ResponseLikeQuestion.LikeQuestionResponse) {
                                    (it.data.response as ResponseLikeQuestion.LikeQuestionResponse).let {
                                        adapter?.apply {
                                            val position =  listFreQuestion.withIndex().filter { (_, value)->
                                                value.id==it.question_id
                                            }.map { (i, _)->i }.single()
                                            listFreQuestion[position].question_likes=it.liked
                                            listFreQuestion[position].like_count = it.like_count
                                            notifyItemChanged(position)
                                        }
                                    }
                                }
                            }
                        }
                        ApiResult.Status.ERROR_DELETE_POST->{
                            stopShimmerLayout()
                            if (questionViewModel.currentFragmentQuestion==FRM_SAVE_QUESTION){
                                adapter?.removeItem(questionViewModel.positionQuestion)
                                updateTotalResultWhenRemoveItem()
                                mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),null)
                            }else{
                                adapter?.apply {
                                    val position =  listFreQuestion.withIndex().filter { (_, value)->
                                        value.id==questionViewModel.idQuestion
                                    }.map { (i, _)->i }.singleOrNull()
                                    position?.let {
                                        removeItem(position)
                                        updateTotalResultWhenRemoveItem()
                                    }
                                }
                            }

                        }
                        ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                            stopShimmerLayout()
                            shareViewModel.isNeedShowErr.value= ApiNoticeEntity(it.status, it.message)
                        }
                        else->{}
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    private fun callApiBookMark(idQuestion: Int){
        try {
            startShimmerLayout()
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_QUESTION_ID] = idQuestion.toString()
            questionViewModel.requestBookmarkQuestion(requestParam)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerBookMarkQuestion(){
        questionViewModel.bookMarkQuestionResult.value?.status=ApiResult.Status.CONSUMED
        try {
            questionViewModel.bookMarkQuestionResult.observe(viewLifecycleOwner, {
                try {
                    myPostViewModel.showOrHideLoading(it)
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            stopShimmerLayout()
                            if (it.data?.response !is Boolean) {
                                if (it.data?.response is ResponseBookMarkQuestion.BookMarkQuestionResponse) {
                                    (it.data.response as ResponseBookMarkQuestion.BookMarkQuestionResponse).let { response->
                                        if (response.bookMark){
                                            questionViewModel.question?.let {
                                                adapter?.apply {
                                                    addItemFirstPosition(it)
                                                }
                                            }
                                        }else{
                                            adapter?.apply {
                                                val position =  listFreQuestion.withIndex().filter { (_, value)->
                                                    value.id==response.question_id
                                                }.map { (i, _)->i }.single()
                                                removeItem(position)
                                                updateTotalResultWhenRemoveItem()
                                            }
                                        }

                                    }
                                }
                            }
                        }
                        ApiResult.Status.ERROR_DELETE_POST->{
                            stopShimmerLayout()
                            if (questionViewModel.currentFragmentQuestion==FRM_SAVE_QUESTION){
                                adapter?.removeItem(questionViewModel.positionQuestion)
                                updateTotalResultWhenRemoveItem()
                                mActivity?.showDialogErrorDelete(resources.getString(R.string.titlePostNoLongerExists),it.message.toString(),null)
                            }else{
                                adapter?.apply {
                                    val position =  listFreQuestion.withIndex().filter { (_, value)->
                                        value.id==questionViewModel.idQuestion
                                    }.map { (i, _)->i }.singleOrNull()
                                    position?.let {
                                        removeItem(position)
                                        updateTotalResultWhenRemoveItem()
                                    }
                                }
                            }

                        }
                        ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                            stopShimmerLayout()
                            shareViewModel.isNeedShowErr.value= ApiNoticeEntity(it.status, it.message)
                        }
                        else->{}
                    }

                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun callApiDeleteQuestion(idQuestion: Int){
        try {
            startShimmerLayout()
            val requestParam = mActivity!!.getRequestParamWithToken()
            questionViewModel.requestDeleteQuestion(requestParam,idQuestion.toString())
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun observerDeleteQuestion(){
        questionViewModel.deleteQuestionResult.value?.status=ApiResult.Status.CONSUMED
        try {
            questionViewModel.deleteQuestionResult.observe(viewLifecycleOwner, {
                try {
                    myPostViewModel.showOrHideLoading(it)
                    when(it.status){
                        ApiResult.Status.SUCCESS->{
                            stopShimmerLayout()
                            adapter?.apply {
                                val position =  listFreQuestion.withIndex().filter { (_, value)->
                                    value.id==questionViewModel.idQuestion
                                }.map { (i, _)->i }.single()
                                removeItem(position)
                                updateTotalResultWhenRemoveItem()
                            }
                        }
                        ApiResult.Status.ERROR,ApiResult.Status.ERROR_TOKEN,ApiResult.Status.ERROR_NETWORK->{
                            stopShimmerLayout()
                            shareViewModel.isNeedShowErr.value= ApiNoticeEntity(it.status, it.message)
                        }
                        else->{}
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    private fun observerNeedRefreshData(){
        questionViewModel.isNeedRefreshDataSaveQuestion.observe(this,{
            if (it){
                refreshAndScrollToFirstItem()
            }
        })
    }
    private fun eventLoadMore() {
        adapter?.setLoadMore(object : AdapterFreQuestion.ILoadMore {
            override fun onLoadMore() {
                try {
                    if (adapter?.listFreQuestion?.size ?:0 < totalLoadMoreResult ) {
                        callApiListQuestion(lastestId=lastestId)
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }

        })
    }
    private fun updateTotalResultWhenRemoveItem(){
        totalLoadMoreResult--
    }

    fun updateUIAfterChangLanguage(){
        adapter?.notifyDataSetChanged()
    }

    private fun deleteItemFrmCommentCallBack(position:Int){
        adapter?.removeItem(position)
        updateTotalResultWhenRemoveItem()
    }
    private fun onRefreshListener() {
        getBinding()?.refreshLayout?.setOnRefreshListener {
            refreshAndScrollToFirstItem()
            getBinding()?.refreshLayout?.isRefreshing=false
        }
    }
    fun refreshAndScrollToFirstItem(){
        questionViewModel.listQuestionSave.clear()
        adapter?.notifyDataSetChanged()
        getBinding()?.rcView?.scrollToPosition(0)
        callApiListQuestion()
//        adapter?.recyclerView.scrollToPosition(0)
    }

    fun startShimmerLayout(){
        getBinding()?.apply {
            shimmerFrameLayout.visibility = View.VISIBLE
            shimmerFrameLayout.startShimmer()
            rcView.visibility = View.GONE
        }

    }
    fun stopShimmerLayout() {
        getBinding()?.apply {
            shimmerFrameLayout.visibility = View.GONE
            shimmerFrameLayout.stopShimmer()
            rcView.visibility = View.VISIBLE
        }
    }
}