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
import brite.outdoor.adapter.AdapterHomeNew
import brite.outdoor.adapter.AdapterSearchWith
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.response.ResponseListLocation
import brite.outdoor.data.api_entities.response.ResponseSearchLocations
import brite.outdoor.data.api_entities.response.ResponseSearchUser
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.data.entities.ObjectSearch
import brite.outdoor.data.entities.PostContentEntity
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.local.room.SaveListLocationLocal
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmSearchLocationBinding
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
class FrmSearchLocation : BaseFragment<FrmSearchLocationBinding>(){
    private var saveListLocation : SaveListLocationLocal?=null
    private val listLocations= arrayListOf<ObjectSearch.ResultSearchEntity>()
    private val searchViewModel by viewModels<SearchViewModel>()
    private var adapterSearch: AdapterSearchWith? = null
    var numberPage: Int = AppConst.DEFAULT_FIRST_PAGE
    private var key : String = ""
    private var lastestId : String = ""
    private var total :Int = 0
    companion object{
        const val FRM_SEARCH_LOCATION=1
    }
    override fun loadControlsAndResize(binding: FrmSearchLocationBinding?) {
        binding?.apply {
            tvDescFindWith.setTextSize(TypedValue.COMPLEX_UNIT_PX,getSizeWithScaleFloat(18.0))
            clFindBox.resizeHeight(getSizeWithScale(46.0))
            adapterSearch = AdapterSearchWith(getSizeWithScale(80.0), getSizeWithScale(140.0),requireActivity(),recyclerView = getBinding()?.rvSearchWith!!)
            getBinding()?.rvSearchWith?.apply {
                adapter = adapterSearch
            }
        }
    }

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FrmSearchLocationBinding {
        return FrmSearchLocationBinding.inflate(inflater, container, false)
    }

    override fun initView(savedInstanceState: Bundle?) {
        val db = AppModule.provideDatabase(requireContext())
        saveListLocation = SaveListLocationLocal(db.appDao())
        getBinding()?.mSearchViewModel = searchViewModel
        observerSearchLocation()
        searchClick()
        getBinding()?.btnSearch?.setSingleClick {
            val key = getBinding()?.searchEdit?.text.toString()
            numberPage=AppConst.DEFAULT_FIRST_PAGE // rest number Page
            adapterSearch?.setLoaded() // cho phep load more
            if (key.isNotEmpty()) {
                callApiSearch(key)
                this.key=key

            }else{
                callApiSearch("")
                this.key=""
            }
            getBinding()?.rvSearchWith?.scrollToPosition(0)
            getBinding()?.searchEdit?.isCursorVisible=false
            KeyboardUtil.hideKeyboard(mActivity)
        }
        showDataLocationToList()
        listenerSearchView()
        listenerItemClicked()
        eventLoadMore()
        getBinding()?.rootView?.setSingleClick { // click rootView hide keyboard
            AppUtils.hideKeyboard(view)
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
        searchViewModel. requestSearchLocations(requestParam)
    }

    private fun observerSearchLocation(){
        searchViewModel.apply {
            searchLocationsResult.observe(viewLifecycleOwner,{
                try {
                    shareViewModel.showOrHideLoading(it)
                    if (it.status == ApiResult.Status.SUCCESS ){
                        if(it.data?.response !is Boolean){
                            if (it.data?.response is ResponseSearchLocations.SearchLocationsResponse){
                                (it.data.response as ResponseSearchLocations.SearchLocationsResponse).let { response->

                                    listLocations.clear()
                                    if (numberPage == AppConst.DEFAULT_FIRST_PAGE) { // update list first  search key
                                        response.getListData()?.forEach { result ->
                                            listLocations.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.LOCATE,result))
                                        }
                                        adapterSearch?.updateList(listLocations)

                                    }else{  // load more
                                        response.getListData()?.forEach { result ->
                                            listLocations.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.LOCATE,result))
                                        }
                                        adapterSearch?.insertList(listLocations)
                                    }
                                    total = response.total?:0
                                    adapterSearch?.setLoaded()
                                    response.getListData()?.size?.let { size->
                                        lastestId =  response.getListData()?.get(size-1)?.id.toString()
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
                }else{
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

    private fun showDataLocationToList(){
        saveListLocation?.getLocationEntity()?.observe(viewLifecycleOwner,{
            try {
                GlobalScope.launch(Dispatchers.Main) {
                    val content = EncryptUtils.decrypt(it.listConTent?:"")
                    val listLocation = convertJsonToList(content)

                    val list= arrayListOf<ObjectSearch.ResultSearchEntity>()
                    val tmpList = listLocation.toTypedArray()
                    tmpList.sortByDescending { i->
                        i.cIndex
                    }
                    tmpList.forEach { i->
                        list.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.LOCATE,i))
                    }
                    adapterSearch?.updateList(list)
                    adapterSearch?.initData(list)
                }
            }catch (e:Exception){
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
                EventBus.getDefault().post("frgSearchLocation")
            }
            override fun afterTextChanged(s: Editable?) {
            }

        })
    }
    private fun listenerItemClicked(){
       adapterSearch?.setOnClickItem(object : AdapterSearchWith.OnClickItemListener{
           override fun onClicked(item: Any) {
              if (item is ResponseSearchLocations.SearchLocationData){
                  item.apply {
                        mActivity!!.showListPostLocation(this.id.toString(), FRM_SEARCH_LOCATION, this.name)
                  }
              }
               if (item is ResponseListLocation.LocationData){
                   item.apply {
                       this.name?.let {
                           mActivity!!.showListPostLocation(this.id.toString(),FRM_SEARCH_LOCATION,
                               it)
                       }
                   }
               }
           }

       })
    }

    override fun getCurrentFragment(): Int {
        return FRM_SEARCH_LOCATION
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
    private fun convertJsonToList(source:String):ArrayList<ResponseListLocation.LocationData>{
        val type : Type=object :TypeToken<ArrayList<ResponseListLocation.LocationData>>(){}.type
        return Gson().fromJson(source,type)
    }
    fun updateUIAfterChangeLanguage(){
        getBinding()?.apply {
            searchEdit.hint = resources.getString(R.string.str_hint_search_location)
            tvDescFindWith.text = resources.getString(R.string.lblSearchWithLocateSuffixes)
            adapterSearch?.notifyDataSetChanged()
        }
    }

}