package brite.outdoor.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.entities.ObjectSearch
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.databinding.ItemSearchWithLocateOrToolBinding
import brite.outdoor.databinding.ItemSearchWithUserBinding
import brite.outdoor.utils.*
import java.text.Normalizer
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayList

class AdapterSearchWith(private val sizeAvatar: Int, private val sizeIcon: Int,private val context:Context,private val isShowBottomNavi:Boolean=true,var recyclerView: RecyclerView?=null) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(),Filterable {

    var isLoading: Boolean = false
    var loadMore: ILoadMore? = null
    var lastVisibleItem: Int? = null
    var totalItemCount: Int? = null
    var visibleThreshold: Int = 1
    var visibleItemCount: Int? = null
    var offset: Int? = null
    var extent: Int? = null
    var range: Int? = null
    var percentage: Int? = null

    interface OnClickFollowListener {
        fun onClickFollow(userData: ResponseSearchUser.SearchUserData)
    }
    interface OnClickItemListener{
      fun onClicked(item:Any)
    }
    init {
       recyclerView?.let {
           val linearLayoutManager = recyclerView?.layoutManager as LinearLayoutManager
           recyclerView?.addOnScrollListener(object : RecyclerView.OnScrollListener() {
               override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                   super.onScrolled(recyclerView, dx, dy)
                   try {
                       totalItemCount = linearLayoutManager.itemCount
                       lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition()
                       visibleItemCount = linearLayoutManager.childCount
                       offset = recyclerView.computeVerticalScrollOffset()
                       extent = recyclerView.computeVerticalScrollExtent()
                       range = recyclerView.computeVerticalScrollRange()
                       percentage = ((100.0 * offset!! / (range!!.toFloat() - extent!!)).toInt())
                       if (!isLoading && ((totalItemCount!!) <= (lastVisibleItem!! + visibleThreshold)) && dy > 0 && percentage!! > AdapterHome.SCROLL_PERCENTAGE) {
                           if (loadMore != null) {
                               loadMore?.onLoadMore()
                           }

                           isLoading = true

                       }
                   } catch (e: Exception) {
                       e.printStackTrace()
                   }

               }
           })
       }
    }
    companion object{
        const val SCROLL_PERCENTAGE = 98
        const val FOLLOWED_FLAG=1
        const val USER=2
        const val UNFOLLOWED_FLAG=0
    }
    private var onClickFollowListener: OnClickFollowListener? = null
    private var onClickItemListener : OnClickItemListener?=null
    fun setOnClickFollow(mOnClickFollowListener: OnClickFollowListener?){
        this.onClickFollowListener = mOnClickFollowListener
    }
    fun setOnClickItem(mOnClick:OnClickItemListener?){
        this.onClickItemListener=mOnClick
    }
    var listResult = ArrayList<ObjectSearch.ResultSearchEntity>()

    private var listData= ArrayList<ObjectSearch.ResultSearchEntity>()

    var filterList = ArrayList<ObjectSearch.ResultSearchEntity>()

    fun initData(list: List<ObjectSearch.ResultSearchEntity>?) {
        list?.let {
            listData.clear()
            listData.addAll(list)

        }
    }

    fun updateList(list: List<ObjectSearch.ResultSearchEntity>) {
        list.let {
            listResult.clear()
            listResult.addAll(list)
            listData.clear()
            listData.addAll(list)
            notifyDataSetChanged()
        }
    }
    fun insertList(list: List<ObjectSearch.ResultSearchEntity>){
        val sizeOld = listResult.size
        listResult.addAll(list)
//        listData.addAll(list)
        notifyItemChanged(sizeOld-1,listResult.size-1)

    }
    fun refreshData(){
        listResult.clear()
        listResult.addAll(listData)
        notifyDataSetChanged()
    }

    fun clearData(){
        listResult.clear()
        listData.clear()
        notifyDataSetChanged()
    }
    inner class SearchWithUserHolder(private val binding: ItemSearchWithUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.ivAvatar.resizeLayout(sizeAvatar, sizeAvatar)
            binding.viewFooter.layoutParams.height = MyApplication.getInstance().getSizeWithScale(65.0)
        }

        fun bind(result: ObjectSearch.ResultSearchEntity,position: Int) {
            binding.ivAvatar.setImageResource(R.drawable.ic_item_search_locate)
            if (result.content is ResponseSearchUser.SearchUserData){
                (result.content as ResponseSearchUser.SearchUserData).let {
                    binding.apply {
                        when {
                            it.followed_flag.toInt() == USER -> {
                                btnFollow.visibility = View.GONE
                            }
                            it.followed_flag.toInt() == FOLLOWED_FLAG -> {
                                btnFollow.visibility = View.VISIBLE
                                btnFollow.setText(R.string.lb_unfollow_search)
                                btnFollow.isSelected = true
                                btnFollow.setTextColor(context.resources.getColor(R.color.colorMain))
                            }
                            it.followed_flag.toInt() == UNFOLLOWED_FLAG -> {
                                btnFollow.visibility = View.VISIBLE
                                btnFollow.setText(R.string.lb_follow_search)
                                btnFollow.isSelected = false
                                btnFollow.setTextColor(context.resources.getColor(R.color.white))
                            }
                        }
                    }

                    binding.btnFollow.setSingleClick { _->
                        onClickFollowListener?.apply {
                            onClickFollow(it)
                        }
                    }
                    binding.tvName.text=it.name
                    try {
                        binding.ivAvatar.loadImageAvatar(it.avatar,it.url_prefix_avatar,160)
                    }catch (e:Exception){
                        e.printStackTrace()
                    }
                }
                binding.root.setSingleClickSwitchScreen {
                    onClickItemListener?.apply {
                        onClicked(result.content)
                    }
                }

                if (position == listData.size-1 && listData.size>2) binding.viewFooter.visibility= View.VISIBLE
                else binding.viewFooter.visibility= View.GONE

                if (position == listResult.size-1 && listResult.size>2) binding.viewFooter.visibility= View.VISIBLE
                else binding.viewFooter.visibility= View.GONE
            }

        }
    }

    inner class SearchWithLocateOrToolHolder(private val binding: ItemSearchWithLocateOrToolBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private var pathImageLocation : String?=null
        private var pathImageUtensils : String?=null
        init {
            binding.ivLogo.resizeHeight(sizeIcon)
            pathImageLocation=PrefManager.getInstance(context).getString(PrefConst.PREF_PATH_IMAGE_LIST_LOCATION)
            pathImageUtensils=PrefManager.getInstance(context).getString(PrefConst.PREF_PATH_IMAGE_LIST_UTENSILS)
            binding.viewFooter.layoutParams.height = MyApplication.getInstance().getSizeWithScale(65.0)

        }


        fun bind(result: ObjectSearch.ResultSearchEntity,position: Int,isShowBottomNavi: Boolean) {
            if (result.content is ResponseSearchLocations.SearchLocationData){
                (result.content as ResponseSearchLocations.SearchLocationData).let {
                    binding.tvTitle.text = it.name
                    binding.tvContent.text = it.description
                    try {
                        if (it.getListImage()?.get(0) == null){
                            binding.ivLogo.setImageResource(R.drawable.ic_no_image)
                        }else binding.ivLogo.loadImageUrl(urlImage(it.getListImage()?.get(0),pathImageLocation))
                    }catch (e:Exception){
                        e.printStackTrace()
                    }
                }
            }
            if(result.content is ResponseListLocation.LocationData){
                (result.content as ResponseListLocation.LocationData).let {
                    binding.tvTitle.text = it.name
                    binding.tvContent.text = it.description
                    try {
                        if (it.getListImage()?.get(0) == null){
                            binding.ivLogo.setImageResource(R.drawable.ic_item_search_locate)
                        }else{
                            binding.ivLogo.loadImageUrl(urlImage(it.getListImage()?.get(0),pathImageLocation))
                        }
                    }catch (e:Exception){
                        e.printStackTrace()
                    }
                }
            }
            if (result.content is ResponseSearchUtensils.SearchUtensilsData){
                (result.content as ResponseSearchUtensils.SearchUtensilsData).let {
                    binding.tvTitle.text = it.name
                    try {
                        if (it.getListImage()?.get(0) == null){
                            binding.ivLogo.setImageResource(R.drawable.ic_item_search_tool)
                        }else
                            binding.ivLogo.loadImageUrl(urlImage(it.getListImage()?.get(0),pathImageUtensils))
                    }catch (e:Exception){
                        e.printStackTrace()
                    }
                }
            }


            if (result.content is ResponseListUtensils.UtensilsData){
                (result.content as ResponseListUtensils.UtensilsData).let {
                    binding.tvTitle.text=it.name
                    try {
                        if (it.getListImage()?.get(0) == null){
                            binding.ivLogo.setImageResource(R.drawable.ic_item_search_tool)
                        }else
                            binding.ivLogo.loadImageUrl(urlImage(it.getListImage()?.get(0),pathImageUtensils))
                    }catch (e:Exception){
                        e.printStackTrace()
                    }
                }
            }
            binding.container.setSingleClickSwitchScreen {
                onClickItemListener?.apply {
                    onClicked(result.content)
                }
            }

            if (isShowBottomNavi){
                if (position == listData.size-1 && listData.size>2) binding.viewFooter.visibility= View.VISIBLE
                else binding.viewFooter.visibility= View.GONE

                if (position == listResult.size-1 && listResult.size>2) binding.viewFooter.visibility= View.VISIBLE
                else binding.viewFooter.visibility= View.GONE
            }

        }
    }

    private fun fromWithUser(parent: ViewGroup): ItemSearchWithUserBinding {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ItemSearchWithUserBinding.inflate(layoutInflater, parent, false)
    }

    private fun fromWithLocateOrTool(parent: ViewGroup): ItemSearchWithLocateOrToolBinding {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ItemSearchWithLocateOrToolBinding.inflate(layoutInflater, parent, false)
    }


    override fun getItemViewType(position: Int): Int {
        return listResult[position].type
    }

    override fun getItemCount(): Int {
        return listResult.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SearchWithLocateOrToolHolder -> {
                holder.bind(listResult[position],position,isShowBottomNavi)
            }
            is SearchWithUserHolder -> {
                holder.bind(listResult[position],position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ObjectSearch.ResultSearchEntity.LOCATE -> {
                SearchWithLocateOrToolHolder(fromWithLocateOrTool(parent))
            }
            ObjectSearch.ResultSearchEntity.TOOL -> {
                SearchWithLocateOrToolHolder(fromWithLocateOrTool(parent))
            }
            ObjectSearch.ResultSearchEntity.USER -> {
                SearchWithUserHolder(fromWithUser(parent))
            }
            else -> {
                SearchWithLocateOrToolHolder(fromWithLocateOrTool(parent))
            }
        }
    }

    override fun getFilter(): Filter {
        return  object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if (charSearch.isEmpty()) {
                    filterList=listData
                } else {
                    val resultList = ArrayList<ObjectSearch.ResultSearchEntity>()
                    for (row in listData) {
                        when(row.type){
                            ObjectSearch.ResultSearchEntity.LOCATE -> {
                                if (row.content is ResponseListLocation.LocationData){
                                    (row.content as ResponseListLocation.LocationData).let {
                                        val covertString= convertToString(it.name)
                                        covertString?.let { name->
                                            if (name.contains(constraint.toString().toLowerCase(Locale.ROOT))) resultList.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.LOCATE,row.content))
                                        }
                                    }
                                }
                                if (row.content is ResponseSearchLocations.SearchLocationData){
                                    (row.content as ResponseSearchLocations.SearchLocationData).let {
                                        val covertString= convertToString(it.name)
                                        covertString?.let { name->
                                            if (name.contains(constraint.toString().toLowerCase(Locale.ROOT))) resultList.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.LOCATE,row.content))
                                        }
                                    }
                                }

                            }
                            ObjectSearch.ResultSearchEntity.TOOL -> {
                                if (row.content is ResponseListUtensils.UtensilsData){
                                    (row.content as ResponseListUtensils.UtensilsData).let {
                                        val covertString= convertToString(it.name)
                                        covertString?.let { name->
                                            if (name.contains(constraint.toString().toLowerCase(Locale.ROOT))) resultList.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.TOOL,row.content))
                                        }

                                    }
                                }
                                if (row.content is ResponseSearchUtensils.SearchUtensilsData){
                                    (row.content as ResponseSearchUtensils.SearchUtensilsData).let {
                                        val covertString= convertToString(it.name)
                                        covertString?.let { name->
                                            if (name.contains(constraint.toString().toLowerCase(Locale.ROOT))) resultList.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.TOOL,row.content))
                                        }

                                    }
                                }

                            }
                            ObjectSearch.ResultSearchEntity.USER -> {
//                                if (row.content is ResponseSearchUser.SearchUserData){
//                                    (row.content as ResponseSearchUser.SearchUserData).let {
//                                        val covertString= convertToString(it.name)
//                                        covertString?.let { name->
//                                            if (name.contains(constraint.toString().toLowerCase(Locale.ROOT))) resultList.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.USER,row.content))
//                                        }
//
//                                    }
//                                }
                                if (row.content is ResponseSearchUser.SearchUserData){
                                    (row.content as ResponseSearchUser.SearchUserData).let {
                                        val covertString= convertToString(it.name)
                                        covertString?.let { name->
                                            if (name.contains(constraint.toString().toLowerCase(Locale.ROOT))) resultList.add(ObjectSearch.ResultSearchEntity(ObjectSearch.ResultSearchEntity.USER,row.content))
                                        }

                                    }
                                }

                            }
                        }
                    }
                    filterList = resultList
                }
                val filterResults = FilterResults()
                filterResults.values = filterList
                return filterResults
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                try {
                    results?.values.let {
                        listResult=it as ArrayList<ObjectSearch.ResultSearchEntity>
                    }
                    notifyDataSetChanged()
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        }
    }
    fun setLoaded() {
        isLoading = false
    }
    fun setLoading(){
        isLoading=true
    }

    @JvmName("setLoadMore1")
    fun setLoadMore(loadMore: ILoadMore?) {
        this.loadMore = loadMore
    }
    interface ILoadMore {
        fun onLoadMore()
    }
    fun convertToString(str: String?): String? {
        try {
            val temp: String = Normalizer.normalize(str, Normalizer.Form.NFD)
            val pattern: Pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+")
            return pattern.matcher(temp).replaceAll("").toLowerCase(Locale.ROOT).replace("đ", "d")
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return null
    }

}