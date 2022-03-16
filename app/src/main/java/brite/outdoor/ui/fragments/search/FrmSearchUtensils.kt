package brite.outdoor.ui.fragments.search

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
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
import brite.outdoor.data.api_entities.response.ResponseListLocation
import brite.outdoor.data.api_entities.response.ResponseListUtensils
import brite.outdoor.data.api_entities.response.ResponseSearchLocations
import brite.outdoor.data.api_entities.response.ResponseSearchUtensils
import brite.outdoor.data.entities.ObjectSearch
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.local.room.SaveListLocationLocal
import brite.outdoor.data.local.room.SaveListUtensilsLocal
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmSearchUtensilsBinding
import brite.outdoor.di.AppModule
import brite.outdoor.ui.fragments.BaseFragment
import brite.outdoor.utils.*
import brite.outdoor.viewmodel.SearchViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.greenrobot.eventbus.EventBus
import java.lang.reflect.Type

@AndroidEntryPoint
class FrmSearchUtensils : BaseFragment<FrmSearchUtensilsBinding>() {
    private var saveListLocation : SaveListLocationLocal?=null
    private val listLocations= arrayListOf<ObjectSearch.ResultSearchEntity>()
    private val searchViewModel by viewModels<SearchViewModel>()
    private var saveListUtensils : SaveListUtensilsLocal?=null
    private var adapterSearch: AdapterSearchWith? = null
    private val listUtensils= arrayListOf<ObjectSearch.ResultSearchEntity>()
    var numberPage: Int = AppConst.DEFAULT_FIRST_PAGE
    private var key : String = ""
    private var lastestId : String = ""
    private var total :Int = 0
    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmSearchUtensilsBinding {
        return FrmSearchUtensilsBinding.inflate(inflater, container, false)
    }
    companion object{
        const val FRM_SEARCH_UTENSILS=2
    }

    override fun initView(savedInstanceState: Bundle?) {
        val db = AppModule.provideDatabase(requireContext())
        saveListUtensils = SaveListUtensilsLocal(db.appDao())
        getBinding()?.mSearchViewModel = searchViewModel
        searchClick()
        observerSearchUtensils()
        getBinding()?.btnSearch?.setSingleClick {
            val key = getBinding()?.searchEdit?.text.toString()
            numberPage=AppConst.DEFAULT_FIRST_PAGE // rest number Page
            adapterSearch?.setLoaded() // cho phep load more
            if (key.isNotEmpty()) {
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
        showDataUtensilsToList()
        listenerSearchView()
        listenerItemClicked()
        eventLoadMore()
        getBinding()?.rootView?.setSingleClick { // click rootView hide keyboard
            AppUtils.hideKeyboard(view)
        }
    }

    override fun loadControlsAndResize(binding: FrmSearchUtensilsBinding?) {
        binding?.apply {
            tvDescFindWith.setTextSize(TypedValue.COMPLEX_UNIT_PX,getSizeWithScaleFloat(18.0))
            clFindBox.resizeHeight(getSizeWithScale(46.0))
            adapterSearch = AdapterSearchWith(getSizeWithScale(80.0), getSizeWithScale(140.0),requireActivity(),recyclerView = getBinding()?.rvSearchWith!!)
            rvSearchWith.apply {
                adapter = adapterSearch
            }
        }
    }

    private fun callApiSearch(key:String,lastestId:String=""){
        val requestParam = HashMap<String,String>()
        requestParam[ApiConst.PARAM_API]= ApiConst.API_KEY
        requestParam[ApiConst.PARAM_API_SEARCH]=key
        val token= PrefManager.getInstance(requireContext()).getString(PrefConst.PREF_TOKEN)
        token?.let {
            requestParam[ApiConst.PARAM_API_TOKEN]=token
        }
        requestParam[ApiConst.PARAM_API_LASTEST_ID] = lastestId
        searchViewModel. requestSearchUtensils(requestParam)


    }

    @SuppressLint("ClickableViewAccessibility")
    private fun searchClick() {
        getBinding()?.searchEdit?.setOnKeyListener { v, keyCode, event ->

            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                val key = getBinding()?.searchEdit?.text.toString()
                numberPage=AppConst.DEFAULT_FIRST_PAGE // rest number Page
                adapterSearch?.setLoaded() // cho phep load more
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
    private fun observerSearchUtensils(){
        searchViewModel.apply {
            searchUtensilsResult.observe(viewLifecycleOwner,{
                try {
                    shareViewModel.showOrHideLoading(it)
                    if (it.status== ApiResult.Status.SUCCESS){
                        if (it.data?.response !is Boolean){
                            val list= arrayListOf<ObjectSearch.ResultSearchEntity>()
                            if (it.data?.response is ResponseSearchUtensils.SearchUtensilsResponse){
                                (it.data.response as ResponseSearchUtensils.SearchUtensilsResponse).let { response->

                                    listUtensils.clear()
                                    if (numberPage == AppConst.DEFAULT_FIRST_PAGE) { // update list first  search key
                                        response.getListData()?.forEach { result ->
                                            listUtensils.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.TOOL,result))
                                        }
                                        adapterSearch?.updateList(listUtensils)

                                    }else{  // load more
                                        response.getListData()?.forEach { result ->
                                            listUtensils.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.TOOL,result))
                                        }
                                        adapterSearch?.insertList(listUtensils)
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
        }
    }
    private fun showDataUtensilsToList(){
        saveListUtensils?.getUtensilEntity()?.observe(viewLifecycleOwner,{
            try {
                GlobalScope.launch(Dispatchers.Main) {
                    val content = EncryptUtils.decrypt(it.listConTent?:"")
                    val listUtensil = convertJsonToList(content)
                    val list= arrayListOf<ObjectSearch.ResultSearchEntity>()
                    val tmpList = listUtensil.toTypedArray()
                    tmpList.sortByDescending {
                            i->i.cIndex
                    }
                    tmpList.forEach { i->
                        list.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.TOOL,i))
                    }
                    adapterSearch?.updateList(list)
                    adapterSearch?.initData(list)
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        })
    }
    fun onRefreshData(){
        callApiSearch("")
        numberPage=AppConst.DEFAULT_FIRST_PAGE // rest number Page
        getBinding()?.searchEdit?.text?.clear()
        getBinding()?.searchEdit?.clearFocus()
    }

    private fun listenerSearchView(){
        getBinding()?.searchEdit?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                adapterSearch?.filter?.filter(s)
                adapterSearch?.setLoading() // block load more khi filter
                EventBus.getDefault().post("frgSearchUtensils")
            }
            override fun afterTextChanged(s: Editable?) {
            }

        })
    }
    private fun listenerItemClicked(){
        adapterSearch?.setOnClickItem(object : AdapterSearchWith.OnClickItemListener{
            override fun onClicked(item: Any) {
                if (item is ResponseSearchUtensils.SearchUtensilsData){
                    item.apply {
                        mActivity!!.showListPostLocation(this.id.toString(),FRM_SEARCH_UTENSILS, this.name)
                    }
                }
                if (item is ResponseListUtensils.UtensilsData){
                    item.apply {
                        this.name?.let {
                            mActivity!!.showListPostLocation(this.id.toString(),FRM_SEARCH_UTENSILS,
                                it)
                        }
                    }
                }
            }

        })
    }


    override fun getCurrentFragment(): Int {
        return 0
    }

    override fun finish() {

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
    private fun convertJsonToList(source:String):ArrayList<ResponseListUtensils.UtensilsData>{
        val type : Type =object : TypeToken<ArrayList<ResponseListUtensils.UtensilsData>>(){}.type
        return Gson().fromJson(source,type)
    }
    fun updateUIAfterChangeLanguage(){
        getBinding()?.apply {
            searchEdit.hint = resources.getString(R.string.str_hint_search_utensil)
            tvDescFindWith.text = resources.getString(R.string.lblSearchWithToolSuffixes)
            adapterSearch?.notifyDataSetChanged()
        }
    }
}