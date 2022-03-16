package brite.outdoor.ui.fragments.search

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import brite.outdoor.R
import brite.outdoor.adapter.AdapterSearchWith
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.entities.ObjectSearch
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmSearchUserBinding
import brite.outdoor.ui.fragments.BaseFragment
import brite.outdoor.utils.AppUtils
import brite.outdoor.utils.KeyboardUtil
import brite.outdoor.utils.resizeHeight
import brite.outdoor.utils.setSingleClick
import brite.outdoor.viewmodel.FollowViewModel
import brite.outdoor.viewmodel.SearchViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.AndroidEntryPoint
import java.lang.reflect.Type

@AndroidEntryPoint
class FrmSearchUser : BaseFragment<FrmSearchUserBinding>() {
    private val followViewModel by viewModels<FollowViewModel>()
    private val listLocations= arrayListOf<ObjectSearch.ResultSearchEntity>()
    private val searchViewModel by viewModels<SearchViewModel>()
    private var adapterSearch: AdapterSearchWith? = null
    private val listUser= arrayListOf<ObjectSearch.ResultSearchEntity>()
    var numberPage: Int = AppConst.DEFAULT_FIRST_PAGE
    private var key : String = ""
    private var lastestId : String = ""
    private var total :Int = 0
    override fun loadControlsAndResize(binding: FrmSearchUserBinding?) {
        binding?.apply {
            tvDescFindWith.setTextSize(TypedValue.COMPLEX_UNIT_PX,getSizeWithScaleFloat(18.0))
            clFindBox.resizeHeight(getSizeWithScale(46.0))
            adapterSearch = AdapterSearchWith(getSizeWithScale(46.0), getSizeWithScale(46.0),requireActivity(),recyclerView = getBinding()?.rvSearchWith!!)
            rvSearchWith.apply {
                adapter = adapterSearch
            }
        }
    }

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmSearchUserBinding {
       return FrmSearchUserBinding.inflate(inflater, container, false)
    }

    override fun initView(savedInstanceState: Bundle?) {
        getBinding()?.mSearchViewModel = searchViewModel
        observerSearchUser()
        searchClick()
        getBinding()?.btnSearch?.setSingleClick {
            val key = getBinding()?.searchEdit?.text.toString()
            numberPage=AppConst.DEFAULT_FIRST_PAGE // rest number Page
            if (key.isNotEmpty()) {
                callApiSearch(key)
                this.key=""
            }else {
                callApiSearch("")
                this.key=""
            }
            getBinding()?.rvSearchWith?.scrollToPosition(0)
            getBinding()?.searchEdit?.isCursorVisible=false
            KeyboardUtil.hideKeyboard(mActivity)
        }
        goToFrmPersonalPage()
        showDataUserList()
        observerFollowUser()
        followAndUnFollowUser()
        eventLoadMore()
        getBinding()?.rootView?.setSingleClick { // click rootView hide keyboard
            AppUtils.hideKeyboard(view)
        }
    }
    private fun callApiSearch(key:String,lastestId : String = ""){
        val requestParam = HashMap<String,String>()
        requestParam[ApiConst.PARAM_API]= ApiConst.API_KEY
        requestParam[ApiConst.PARAM_API_SEARCH]=key
        val token= PrefManager.getInstance(requireContext()).getString(PrefConst.PREF_TOKEN)
        token?.let {
            requestParam[ApiConst.PARAM_API_TOKEN]=token
        }
        requestParam[ApiConst.PARAM_API_LASTEST_ID] = lastestId
        searchViewModel.requestSearchUser(requestParam)
    }
    @SuppressLint("ClickableViewAccessibility")
    private fun searchClick() {
        getBinding()?.searchEdit?.setOnKeyListener { v, keyCode, event ->

            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                val key = getBinding()?.searchEdit?.text.toString()
                numberPage=AppConst.DEFAULT_FIRST_PAGE // rest number Page
                if (key.isNotEmpty()) {
                    //  handler call api location,utensils
                    callApiSearch(key)
                    this.key=key
                }else {
                    callApiSearch("")
                    this.key=""
                }
                getBinding()?.rvSearchWith?.scrollToPosition(0)
                getBinding()?.searchEdit?.isCursorVisible=false
                KeyboardUtil.hideKeyboard(mActivity)
            }

            false
        }
        getBinding()?.searchEdit?.setOnTouchListener { _, _ ->
            getBinding()?.searchEdit?.isCursorVisible = true
            false
        }
    }

    private fun showDataUserList(){
        try {
            adapterSearch?.updateList(listUser)
            adapterSearch?.initData(listUser)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun observerSearchUser(){
        searchViewModel.apply {
            searchUserResult.observe(viewLifecycleOwner, {
                try {
                    shareViewModel.showOrHideLoading(it)
                    if (it.status==ApiResult.Status.SUCCESS){
                        if (it.data?.response !is Boolean){
                            if (it.data?.response is ResponseSearchUser.SearchUserResponse){
                                (it.data.response as ResponseSearchUser.SearchUserResponse).let { response->
                                    listUser.clear()

                                    if (numberPage == AppConst.DEFAULT_FIRST_PAGE) { // update list first  search key
                                        response.getListData()?.forEach { result ->
                                            listUser.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.USER,result))
                                        }
                                        getBinding()?.rvSearchWith?.scrollToPosition(0)
                                        adapterSearch?.updateList(listUser)

                                    }else{  // load more
                                        response.getListData()?.forEach { result ->
                                            listUser.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.USER,result))
                                        }
                                        adapterSearch?.insertList(listUser)
                                    }
                                    total = response.total?:0
                                    adapterSearch?.setLoaded()
                                    response.getListData()?.size?.let { size->
                                        lastestId= response.getListData()?.get(size-1)?.id.toString()
                                    }

                                }

                            }

                        }
                    }else if (it.status==ApiResult.Status.ERROR_NETWORK || it.status==ApiResult.Status.ERROR) adapterSearch?.setLoaded()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
    }}
    private fun followAndUnFollowUser(){
        adapterSearch?.apply {
            setOnClickFollow(object : AdapterSearchWith.OnClickFollowListener{
                override fun onClickFollow(userData: ResponseSearchUser.SearchUserData) {
                    callApiFollow(userData.id)
                }

            })
        }
    }
    private fun observerFollowUser() {
        try {
            followViewModel.followUserResult.observe(viewLifecycleOwner, {
                try {
                    if (it.status != ApiResult.Status.CONSUMED) {
                        shareViewModel.showOrHideLoading(it)
                        if (it.status == ApiResult.Status.SUCCESS) {
                            if (it.data?.response !is Boolean) {
                                if (it.data?.response is ResponseFollow.FollowResponse) {
                                    (it.data.response as ResponseFollow.FollowResponse).let {
                                        adapterSearch?.apply {
                                            val position =  listResult.withIndex().filter { (_, value)->

                                            val userData =  value.content as ResponseSearchUser.SearchUserData
                                             userData.id==it.follower_id
                                            }.map { (i, _)->i }.single()

                                            if (listResult[position].content is ResponseSearchUser.SearchUserData ){
                                                (listResult[position].content as ResponseSearchUser.SearchUserData ).apply {
                                                    if (it.follows==true) this.followed_flag="1"
                                                    else this.followed_flag="0"
                                                }
                                            }
                                            notifyItemChanged(position)

                                            it.follows?.let { it1 ->
                                                it.follower_id?.let { id ->
                                                    val requestFollowUnFollow = HashMap<Int, Int>()
                                                    if (it1) requestFollowUnFollow[id] = ListPostUserResponse.STATE_FOLLOW
                                                    else requestFollowUnFollow[id] = ListPostUserResponse.STATE_UNFOLLOW
                                                    shareViewModel.listIdFollow.putAll(requestFollowUnFollow)
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    it.status = ApiResult.Status.CONSUMED
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
        }
    }
    private fun callApiFollow(idUser: Int?) {
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            idUser?.let {
                requestParam[ApiConst.PARAM_API_FOLLOW_ID] = it.toString()

            }
            followViewModel.requestFollowUser(requestParam)
        } catch (e: Exception) {
        }
    }
    fun onRefreshData(){
        callApiSearch("")
        numberPage=AppConst.DEFAULT_FIRST_PAGE // rest number Page
        getBinding()?.searchEdit?.text?.clear()
        getBinding()?.searchEdit?.clearFocus()
    }
    private fun goToFrmPersonalPage(){
        adapterSearch?.apply {
            setOnClickItem(object : AdapterSearchWith.OnClickItemListener{
                override fun onClicked(item: Any) {
                   if (item is ResponseSearchUser.SearchUserData ){
                       item.apply {
                          this.id?.let { mActivity?.showPersonalPageOrMyPage(it) }
                       }
                   }
                }

            })
        }
    }

    private fun eventLoadMore() {
        adapterSearch?.setLoadMore(object : AdapterSearchWith.ILoadMore {
            override fun onLoadMore() {
                try {
                    ++numberPage
                    if (adapterSearch?.listResult?.size ?:0 < total ) {
                        callApiSearch(lastestId=lastestId,key = key)
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }

        })
    }

    override fun getCurrentFragment(): Int {
        return 0
    }

    override fun finish() {

    }
    fun updateUIAfterChangeLanguage(){
        getBinding()?.apply {
            searchEdit.hint = resources.getString(R.string.str_hint_search_friend)
            tvDescFindWith.text = resources.getString(R.string.lblSearchWithUserSuffixes)
            adapterSearch?.notifyDataSetChanged()
        }
    }

}