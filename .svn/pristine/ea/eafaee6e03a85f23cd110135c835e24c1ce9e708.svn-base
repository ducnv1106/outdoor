package brite.outdoor.ui.fragments.my_page

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.TypedValue
import android.view.*
import android.view.animation.AnimationUtils
import androidx.appcompat.widget.AppCompatRadioButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.viewpager2.widget.ViewPager2
import brite.outdoor.R
import brite.outdoor.adapter.ViewPager2Adapter
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.ApiConst.Companion.PARAM_API_USER_ID
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.AppConst.Companion.FRM_MY_PAGE
import brite.outdoor.constants.AppConst.Companion.STATUS_BAR_MAIN
import brite.outdoor.constants.AppConst.Companion.STATUS_PEOPLE_FOLLOW
import brite.outdoor.constants.AppConst.Companion.STATUS_PEOPLE_FOLLOWERS
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmMyPageBinding
import brite.outdoor.ui.fragments.*
import brite.outdoor.utils.*
import brite.outdoor.viewmodel.AuthViewModel
import brite.outdoor.viewmodel.MyPageViewModel
import brite.outdoor.viewmodel.MyPostViewModel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.google.android.material.appbar.AppBarLayout
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.frm_my_page.*
import kotlinx.android.synthetic.main.frm_my_page.view.*
import kotlinx.android.synthetic.main.frm_my_post.*
import kotlinx.android.synthetic.main.layout_bottom_navigation_home.view.*
import kotlinx.coroutines.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import java.util.*

@AndroidEntryPoint
class FrmMyPage : BaseFragment<FrmMyPageBinding>(), View.OnClickListener {

    private val myPageViewModel by viewModels<MyPageViewModel>()

    private var urlAvatar: String? = null

    private val authViewModel by activityViewModels<AuthViewModel>()

    private val myPostViewModel by viewModels<MyPostViewModel>()

    private val frmMyPosts by lazy { FrmMyPost() }

    private val frmMyBookMart by lazy { FrmMyBookMart() }

    override fun isBackPreviousEnable() : Boolean{
        return true
    }

    override fun backToPrevious() {
        finish()
    }
    override fun loadControlsAndResize(binding: FrmMyPageBinding?) {
        binding?.apply {
            val heightToolBar = getSizeWithScale(80.0)
            val widthButtonNav = getSizeWithScale(56.0)
            val sizeAvatar = getSizeWithScale(80.0)
            val sizeImageHolder = getSizeWithScale(48.0)
            val sizeButtonAdd = getSizeWithScale(52.0)

            val textSizeH1 = getSizeWithScaleFloat(25.0)
            val textSizeH2 = getSizeWithScaleFloat(13.0)
            val textSizeTitlePin = getSizeWithScaleFloat(12.0)

            tvNumberFollowers.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSizeH1)
            tvNumberFollowersDes.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSizeH2)

            tvNumberLike.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSizeH1)
            imgNumberLike.resizeLayout(getSizeWithScale(20.0), getSizeWithScale(20.0))

            tvNumberFollow.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSizeH1)
            tvNumberFollowDes.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSizeH2)

            tvYourWriting.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSizeTitlePin)
            tvArticlesSave.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSizeTitlePin)
            tvLocationSave.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSizeTitlePin)

            toolbar.resizeHeight(heightToolBar)
//            toolbar.setContentInsetsRelative(getSizeWithScale(70.0), widthButtonNav)
            toolbar.titleMarginStart = getSizeWithScale(10.0)

            toolbarLayout.resizeLayout(getSizeWithScale(375.0), getSizeWithScale(321.0))
            toolbarLayout.expandedTitleMarginTop = getSizeWithScale(74.0)

            viewToolbar1.layoutParams.height =  getSizeWithScale(110.0)

            imageHolder.resizeLayout(sizeImageHolder, sizeImageHolder)

            clController.resizeHeight(heightToolBar)
            btnSetting.resizeLayout(getSizeWithScale(24.0), getSizeWithScale(24.0))

            naviBottomHome.ivBackGround.resizeLayout(getSizeWithScale(375.0),getSizeWithScale(89.0))
            naviBottomHome.btnHome.resizeLayout(getSizeWithScale(34.0),getSizeWithScale(34.0))
            naviBottomHome.btnMyPage.resizeLayout(getSizeWithScale(34.0),getSizeWithScale(34.0))
            naviBottomHome.btnNotification.resizeLayout(getSizeWithScale(34.0),getSizeWithScale(34.0))
//            btnNotification1.resizeLayout(getSizeWithScale(61.0),getSizeWithScale(87.0))
            naviBottomHome.btnSearch.resizeLayout(getSizeWithScale(34.0),getSizeWithScale(34.0))
//            naviBottomHome.imgBgIcAddHome.resizeLayout(getSizeWithScale(72.0),getSizeWithScale(72.0))
            naviBottomHome.btnAddHome.resizeLayout(getSizeWithScale(60.0),getSizeWithScale(60.0))
            naviBottomHome.vFakeButton.resizeLayout(getSizeWithScale(72.0),getSizeWithScale(72.0))
            naviBottomHome.btnMyPage.isChecked=true
            naviBottomHome.layoutBottom.resizeHeight(getSizeWithScale(60.0))
            naviBottomHome.btnNotificationUnread.resizeLayout(getSizeWithScale(18.0),getSizeWithScale(18.0))
            naviBottomHome.btnNotificationUnread.setTextSizePX(MyApplication.getInstance().getSizeWithScaleFloat(10.0))
            imgQuestion.resizeLayout(getSizeWithScale(56.0), getSizeWithScale(112.0))

//            btnAdd.resizeLayout(sizeButtonAdd, sizeButtonAdd)

            imgAvatar.resizeLayout(sizeAvatar, sizeAvatar)
            imgAvatar.layoutParams.let {
                if (it is CoordinatorLayout.LayoutParams) {
                    it.topMargin = getSizeWithScale(70.0)
                }
            }

            clInteractive.resizeLayout(getSizeWithScale(302.0), getSizeWithScale(88.0))
            clInteractive.layoutParams.let {
                if (it is ConstraintLayout.LayoutParams) {
                    it.topMargin = getSizeWithScale(223.0)
                }
            }
//            clTabLayout.layoutParams.width = getSizeWithScale(302.0)

            shimmerFrameLayout.resizeLayout(getSizeWithScale(302.0), getSizeWithScale(88.0))
            shimmerFrameLayout.layoutParams.let {
                if (it is ConstraintLayout.LayoutParams) {
                    it.topMargin = getSizeWithScale(223.0)
                }

            }

            appBarLayout.addOnOffsetChangedListener(object : AppBarStateChangeListener() {
                override fun onStateChanged(appBarLayout: AppBarLayout?, state: Int) {
                    myPageViewModel.isExpanded = state == EXPANDED
                    if (state == EXPANDED) toolbarLayout.setExpandedTitleColor(resources.getColor(R.color.colorBlack))
                    else toolbarLayout.setCollapsedTitleTextColor(resources.getColor(R.color.colorWhite))
                }

            })
//            btnAdd.setOnClickListener(this@FrmMyPage)
            tvYourWriting.setOnClickListener(this@FrmMyPage)
            tvArticlesSave.setOnClickListener(this@FrmMyPage)
            tvLocationSave.setOnClickListener(this@FrmMyPage)
            btnSetting.setOnClickListener(this@FrmMyPage)
            btnFollow.setOnClickListener(this@FrmMyPage)
            btnFollowers.setOnClickListener(this@FrmMyPage)
            naviBottomHome.apply {
                btnAddHome.setOnClickListener {
                    showPopupWindow()
                }
                btnAddPlace.setSingleClickSwitchScreen{
                    mActivity?.let {
                        FrmPushPostsNew.getInstance(typeFragment = AppConst.FRM_POST_LOCATION).show(it.supportFragmentManager,"FrmPushPostNew")
                        hideBtnAddHomeBackToScreenHome()
                    }
                }
                btnAddUtensils.setSingleClickSwitchScreen {
                    mActivity?.let {
                        FrmPushPostsNew.getInstance(typeFragment = AppConst.FRM_POST_UTENSILS).show(it.supportFragmentManager,"FrmPushPostNew")
                        hideBtnAddHomeBackToScreenHome()
                    }

                }
            }
            imgQuestion.setSingleClick {
                mActivity?.showQuestion()
            }

          val name = PrefManager.getInstance(requireContext()).getString(PrefConst.PREF_NAME)
          getBinding()?.toolbarLayout?.title = name
            Glide.with(requireContext()).load(R.drawable.ic_avatar_default)
                    .placeholder(R.drawable.progress_animation)
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                    .transform(CenterCrop(), RoundedCorners(150))
                    .into(imgAvatar)

        }
    }

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmMyPageBinding {
        return FrmMyPageBinding.inflate(inflater, container, false)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun initView(savedInstanceState: Bundle?) {
        val mAdapter = ViewPager2Adapter(this@FrmMyPage)
        getBinding()?.apply {

            appBarLayout.setExpanded(myPageViewModel.isExpanded, true)
            vpPosts.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    mAdapter.getFragment(position)?.apply {
                        when (this) {
                            is FrmMyPost -> {
                                getBinding()?.tvYourWriting?.isSelected = true
                                getBinding()?.tvArticlesSave?.isSelected = false
                                getBinding()?.tvLocationSave?.isSelected=false
                                checkAndCallApiListMyPostIfNeed()
                                hideBtnAddHome()
                            }
                            is FrmMyBookMart -> {
                                getBinding()?.tvYourWriting?.isSelected = false
                                getBinding()?.tvArticlesSave?.isSelected = true
                                getBinding()?.tvLocationSave?.isSelected=false
                                checkAndApiListMyBookMarkIfNeed()
                                hideBtnAddHome()
                            }
                        }
                    }

                }
            })
            mAdapter.addFragment(frmMyPosts)
            mAdapter.addFragment(frmMyBookMart)
            vpPosts.offscreenPageLimit = 3
            vpPosts.adapter = mAdapter
            vpPosts.isUserInputEnabled=false


            if (myPageViewModel.detailUserResult.value?.status != ApiResult.Status.SUCCESS) {
                callApiDetailUser()
            }

            observerDetailUser()
            myPageViewModel.detailUser.observe(viewLifecycleOwner, {
                try {
                    tvNumberFollow.text = convertNumberInteractive(it.follow_counts)
                    tvNumberFollowers.text = convertNumberInteractive(it.follower_counts)
                    tvNumberLike.text = convertNumberInteractive(it.like_counts)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        }

        myPageViewModel.pageNumberMyPost.observe(viewLifecycleOwner, {//Load more
            if (it > 1)
                checkAndCallApiListMyPostIfNeed()
            else if (shareViewModel.isNeedRefreshPostDataInMyPage.value == true) {
                callApiListMyPost(true)
            }
        })
        myPageViewModel.pageNumberMyBookmark.observe(viewLifecycleOwner, {//Load more
            if (it > 1)
                checkAndApiListMyBookMarkIfNeed()
            else if (shareViewModel.isNeedRefreshPostDataInMyBookmark.value==true)
                callApiListMyBookMark(true)
        })

        shareViewModel.isNeedRefreshPostDataInMyPage.observe(viewLifecycleOwner, {
            if (it) {
                myPageViewModel.pageNumberMyPost.value = 1
                myPageViewModel.totalMyPost = 0
                myPageViewModel.listMyPost.clear()
            }
        })
        shareViewModel.isNeedRefreshPostDataInMyBookmark.observe(viewLifecycleOwner,{
            if (it){
                myPageViewModel.pageNumberMyBookmark.value=1
                myPageViewModel.totalMyBookmark = 0
                myPageViewModel.listMyBookmark.clear()
            }
        })
        shareViewModel.isNeedUpdateDataWhenEditPostInMyPost.observe(viewLifecycleOwner,{
            if (it){
                try {
                    frmMyPosts.mAdapterMyPost?.apply {
                        val position =  listMyPost.withIndex().filter { (_, value)->
                            value.id==shareViewModel.editPost?.getDataEditPost()?.id
                        }.map { (i, _)->i }.single()
                        shareViewModel.editPost?.getDataEditPost()?.let {
                            listMyPost[position]=it
                        }
                        notifyItemChanged(position)
                    }
                    shareViewModel.isNeedUpdateDataWhenEditPostInMyPost.value=false
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        })
        shareViewModel.isNeedUpdateDataWhenEditPostInMyBookMark.observe(viewLifecycleOwner,{ it ->
            if (it){
                try {
                    frmMyBookMart.mAdapterBookMark?.apply {
                        val position =  listBookmark.withIndex().filter { (_, value)->
                            value.id==shareViewModel.editPost?.getDataEditPost()?.id
                        }.map { (i, _)->i }.single()
                        var bookMark : ResponseListBookMark.ListBookMarkData?=null

                        shareViewModel.editPost?.getDataEditPost()?.let {
                             bookMark = ResponseListBookMark.ListBookMarkData(
                                 id =it.id,
                                 title = it.title,
                                 content = it.content,
                                 location_id = it.location_id,
                                 hashtag_id = it.hashtag_id,
                                 utensil_id = it.utensil_id,
                                 like_count = it.like_count,
                                 comment_count = it.comment_count,
                                 cIndex = it.cIndex,
                                 is_sticky = null,
                                 share_count = it.share_count,
                                 created_id = it.created_id,
                                 modified_time = it.modified_time,
                                 created_time = it.created_time,
                                 id_bookmark = null,
                                 state_follow = it.state_follow,
                                 user_name_created = it.user_name_created,
                                 avatar_user = it.avatar_user,
                                 name_locations = it.name_locations,
                                 name_utensils = it.name_utensils,
                                 name_hashtags = null,
                                 url_prefix = it.url_prefix,
                                 url_prefix_avatar = it.url_prefix_avatar,
                                 post_shares = it.post_shares
                             )
                        }
                        bookMark?.let {
                            listBookmark[position]=it
                        }
                        notifyItemChanged(position)
                    }
                    shareViewModel.isNeedUpdateDataWhenEditPostInMyBookMark.value=false
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        })
        onListenerNaviBottom()
        observerHandleAPILoadingAndErr()
        getBinding()?.apply {
            shimmerFrameLayout.startShimmer()

        }
        observerCountLike()
        observerNotifyUnread()
        observerChangeLanguage()
    }

    fun checkAndCallApiListMyPostIfNeed() {
        if (myPageViewModel.isNeedGetListMyPost()) {
            callApiListMyPost()
        }
    }

    fun callApiListMyPost(isNeedRefreshPostDataInMyPage:Boolean=false) {
        try {
            frmMyPosts.startShimmerLayout()
            val requestParam = mActivity!!.getRequestParamWithToken()
//            requestParam[ApiConst.PARAM_API_PAGE] =
//                (myPageViewModel.pageNumberMyPost.value ?: 1).toString()
//            requestParam[ApiConst.PARAM_API_LIMIT] = AppConst.DEFAULT_ITEM_PER_PAGE.toString()
            if (isNeedRefreshPostDataInMyPage) myPageViewModel.lastestId = ""
            requestParam[ApiConst.PARAM_API_LASTEST_ID] = myPageViewModel.lastestId
            myPageViewModel.requestListPostUser(requestParam)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun checkAndApiListMyBookMarkIfNeed() {
        if (!myPageViewModel.isNeedGetListMyBookmark()) return
        callApiListMyBookMark()
    }

    fun callApiListMyBookMark(isNeedRefreshPostDataInMyBookMart:Boolean=false) {
        try {
            frmMyBookMart.startShimmerLayout()
            val requestParam = mActivity!!.getRequestParamWithToken()
            requestParam[ApiConst.PARAM_API_PAGE] =
                (myPageViewModel.pageNumberMyBookmark.value ?: 0).toString()
            if (isNeedRefreshPostDataInMyBookMart) myPageViewModel.lastestIdBookmark = ""
            requestParam[ApiConst.PARAM_API_LASTEST_ID] = myPageViewModel.lastestIdBookmark
            requestParam[ApiConst.PARAM_API_LIMIT] = AppConst.DEFAULT_ITEM_PER_PAGE.toString()
            myPageViewModel.requestListBookMark(requestParam)

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onClick(v: View?) {
        if (!isClickAble()) return
        when (v?.id) {
            R.id.tvYourWriting -> {
                getBinding()?.vpPosts?.apply {
                    val currentTab = currentItem
                    if (currentTab != 0) {
                        currentItem = 0
                    }
                }
            }
            R.id.tvArticlesSave -> {
                getBinding()?.vpPosts?.apply {
                    val currentTab = currentItem
                    if (currentTab != 1) {
                        currentItem = 1
                    }
                }
            }
            R.id.tvLocationSave->{
                mActivity?.showLocationSave()
                hideBtnAddHomeBackToScreenHome()
            }
            R.id.btnSetting ->{
                mActivity?.showSetting()
                hideBtnAddHomeBackToScreenHome()
            }
            R.id.btnFollow ->{
                mActivity?.showPeopleInteractive(STATUS_PEOPLE_FOLLOW, mActivity?.getUserId())
                hideBtnAddHomeBackToScreenHome()
            }
            R.id.btnFollowers ->{
                mActivity?.showPeopleInteractive(STATUS_PEOPLE_FOLLOWERS, mActivity?.getUserId())
                hideBtnAddHomeBackToScreenHome()
            }
        }
    }

     fun callApiDetailUser() {
        try {
            getBinding()?.apply {
                shimmerFrameLayout.visibility = View.VISIBLE
                shimmerFrameLayout.startShimmer()
                clInteractive.visibility = View.GONE
            }
            val requestParam = mActivity!!.getRequestParamWithToken()
            val userId = PrefManager.getInstance(requireContext()).getString(PrefConst.PREF_USER_ID)
            userId?.let {
                requestParam[PARAM_API_USER_ID] = userId
            }

            myPageViewModel.requestDetailUser(requestParam)
        } catch (e: Exception) {
        }

    }

    private fun observerDetailUser() {
        myPageViewModel.detailUserResult.observe(viewLifecycleOwner, {
            try {
                myPostViewModel.showOrHideLoading(it)
                if (it.status == ApiResult.Status.SUCCESS) {
                    if (it.data?.response !is Boolean) {
                        if (it.data?.response is ResponseDetail.DetailResponse) {
                            (it.data.response as ResponseDetail.DetailResponse).let { response ->
                                myPageViewModel.detailUser.value = response
                                urlAvatar = response.avatar
                                myPageViewModel.setNumberLike(response.like_counts)
                            }
                        }

                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        })
        myPageViewModel.detailUser.observe(viewLifecycleOwner, {
            getBinding()?.apply {
                shimmerFrameLayout.visibility = View.GONE
                shimmerFrameLayout.stopShimmer()

                clInteractive.visibility = View.VISIBLE
            }

            getBinding()?.toolbarLayout?.title = it.name
            getBinding()?.imgAvatar?.let { imageView ->
                it.avatar?.let { it1 ->
                    imageView.loadImageAvatar(
                       it1,it.url_prefix_avatar,150
                    )
                }
            }

        })
    }
    private fun observerCountLike(){
        myPageViewModel.numberLike.observe(viewLifecycleOwner,{
            getBinding()?.tvNumberLike?.text = it.toString()
        })
    }

    private fun observerHandleAPILoadingAndErr() {
        myPostViewModel.isNeedShowErr.observe(viewLifecycleOwner, {
            when (it.status) {
                ApiResult.Status.ERROR, ApiResult.Status.ERROR_NETWORK,ApiResult.Status.ERROR_TOKEN  -> {
                    shareViewModel.isNeedShowErr.value = it
                        getBinding()?.apply {
                            shimmerFrameLayout.visibility = View.GONE
                            shimmerFrameLayout.stopShimmer()
                            clInteractive.visibility = View.VISIBLE
                        }

                }
            }
        })
    }
    private fun convertNumberInteractive(counts: Int): String {
        return if (counts > 1000) {
            (counts / 1000).toString() + " K"
        } else counts.toString()
    }

    override fun getCurrentFragment(): Int {
        return FRM_MY_PAGE
    }

    override fun statusBarColor() = STATUS_BAR_MAIN

    override fun finish() {
        mActivity?.closeMainFuncScreen(this)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.getDefault().post(true)
    }
    private fun onListenerNaviBottom(){
        try {
            getBinding()?.naviBottomHome?.apply {
                var currentSelected = this.btnMyPage
                listOf<AppCompatRadioButton>(
                        this.btnHome, this.btnMyPage, this.btnNotification,this.btnSearch
                ).forEach {
                    it.setSingleClick { view ->
                        currentSelected.isChecked = false
                        currentSelected = it
                        currentSelected.isChecked = true

                        when(view.id){
                            btnHome.id->{
                                finish()
                                mActivity?.clearLightStatusBar()
                            }
                            btnMyPage.id->{
                                onRefreshData()
                                frmMyPosts.onRefresherDataScrollToFirst()
                                frmMyBookMart.onRefresherDataScrollToFirst()
                                getBinding()?.appBarLayout?.setExpanded(true,true)

                            }
                            btnNotification.id->{
                                mActivity?.showNotification()
                                hideBtnAddHomeBackToScreenHome()
                            }
                            btnSearch.id->{
                                mActivity?.showSearch()
                                hideBtnAddHomeBackToScreenHome()
                            }
                        }

                    }
                }
            }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun hideBtnAddHomeBackToScreenHome(){
        try {
            getBinding()?.apply {
                naviBottomHome.btnAddHome.post {
                    if (naviBottomHome.btnAddHome.isChecked){
                        naviBottomHome.btnAddPlace.visibility=View.GONE
                        naviBottomHome.btnAddUtensils.visibility=View.GONE
                        naviBottomHome.btnAddHome.startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.rotate_ic_add_home_unchecked))
                    }

                }
            }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    private fun hideBtnAddHome(isRefresh :Boolean = false){
        try {
            getBinding()?.apply {
                naviBottomHome.btnAddHome.post {
                    if (naviBottomHome.btnAddHome.isChecked){
                        naviBottomHome.btnAddPlace.startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.hide_item_left))
                        naviBottomHome.btnAddPlace.visibility=View.GONE

                        naviBottomHome. btnAddUtensils.startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.hide_item_right))
                        naviBottomHome.btnAddUtensils.visibility=View.GONE

                        naviBottomHome.btnAddHome.startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.rotate_ic_add_home_unchecked))

                        naviBottomHome.btnAddHome.isChecked=false
                        if (isRefresh) naviBottomHome.btnMyPage.isChecked = true
                        else naviBottomHome.btnMyPage.isChecked=!naviBottomHome.btnMyPage.isChecked
                    }

                }
            }
        }catch (e:Exception){
            e.printStackTrace()
        }

    }
    private fun showPopupWindow(){
        try {
            getBinding()?.naviBottomHome?.apply {
                btnAddPlace.apply {
                    if (isVisible){
                        startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.hide_item_left))
                        visibility=View.GONE

                    }else{
                        visibility=View.VISIBLE
                        startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.show_item_left))
                    }
                }
                btnAddUtensils.apply {
                    if (isVisible){
                        startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.hide_item_right))
                        visibility=View.GONE

                    }else{
                        visibility=View.VISIBLE
                        startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.show_item_right))
                    }
                }
                if (btnAddHome.isChecked){
                    btnAddHome.startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.rotate_ic_add_home_checked))
                }
                else{
                    btnAddHome.startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.rotate_ic_add_home_unchecked))
                }
            }
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
        getBinding()?.naviBottomHome?.apply {
            if (this.btnAddHome.isChecked){
                this.btnAddHome.startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.rotate_ic_add_home_checked))
                this.btnMyPage.isChecked=false
            }

            else{
                this.btnAddHome.startAnimation(AnimationUtils.loadAnimation(requireContext(),R.anim.rotate_ic_add_home_unchecked))
                this.btnMyPage.isChecked=true
            }


        }
    }
    @Subscribe
    fun onEvent(event: Any) {
        when(event){
            is Boolean ->{
                event.apply {
                    getBinding()?.apply {
                        naviBottomHome.btnHome.isChecked=false
                        naviBottomHome.btnMyPage.isChecked=true
                        naviBottomHome.btnNotification.isChecked=false
                        naviBottomHome.btnSearch.isChecked=false
                        naviBottomHome.btnAddHome.isChecked=false
                    }
                }
            }
            is String ->{
                event.apply {
                    hideBtnAddHome()
                }
            }
        }
    }
    private  fun onRefreshData(){
        try {
            if (getBinding()?.naviBottomHome?.btnAddHome?.isChecked==true){
                hideBtnAddHome(true)
                Handler(Looper.getMainLooper()).postDelayed({
                    shareViewModel.isNeedRefreshPostDataInMyPage.value=true
                    shareViewModel.isNeedRefreshPostDataInMyBookmark.value=true
                    callApiListMyPost(true)
                    callApiDetailUser()
                    callApiListMyBookMark(true)
                    myPageViewModel.isLoadMoreMyPost=false
                    myPageViewModel.isLoadMoreMyBookMark=false
                }, 325L)

            }else{
                shareViewModel.isNeedRefreshPostDataInMyPage.value=true
                shareViewModel.isNeedRefreshPostDataInMyBookmark.value=true
                callApiListMyPost(true)
                callApiDetailUser()
                callApiListMyBookMark(true)
                myPageViewModel.isLoadMoreMyPost=false
                myPageViewModel.isLoadMoreMyBookMark=false
            }

        }catch (e:Exception){
            e.printStackTrace()
        }

    }
    @SuppressLint("SetTextI18n")
    private fun observerNotifyUnread(){
        authViewModel.countNotifyUnread.observe(viewLifecycleOwner,{
            getBinding()?.naviBottomHome?.apply {
                if (it!=0){
                    btnNotificationUnread.visibility = View.VISIBLE
                    if (it>99) btnNotificationUnread.text ="${it}+"
                    else btnNotificationUnread.text = it.toString()
                }else{
                    btnNotificationUnread.visibility = View.GONE

                }
            }
        })
    }
    private fun observerChangeLanguage(){
        authViewModel.isChangeLanguage.observe(viewLifecycleOwner,{
            if (it){
                getBinding()?.apply {
                    tvNumberFollowDes.text = resources.getText(R.string.lblFollowing)
                    tvNumberFollowersDes.text = resources.getText(R.string.lblFollowers)

                    tvYourWriting.text = resources.getText(R.string.lblYourWriting)
                    tvArticlesSave.text = resources.getText(R.string.lblArticlesSave)
                    tvLocationSave.text = resources.getText(R.string.lblLocationSave)
                }
                frmMyPosts.updateUIAfterChangLanguage()
                frmMyBookMart.updateUIAfterChangLanguage()
            }

        })
    }
}


