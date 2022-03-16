package brite.outdoor.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.entities.ObjectSearch
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.databinding.ItemLocationNewBinding
import brite.outdoor.databinding.ItemNewsVer2Binding
import brite.outdoor.databinding.ItemSearchWithLocateOrToolBinding
import brite.outdoor.databinding.ItemSearchWithUserBinding
import brite.outdoor.utils.*
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import java.text.Normalizer
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayList

class AdapterSearchLocation(
    private val sizeAvatar: Int,
    private val sizeIcon: Int,
    private val context: Context,
    private val isShowBottomNavi: Boolean = true,
    var recyclerView: RecyclerView? = null,
    var typeSearch: Int
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(), Filterable {

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
    private var mOnItemListener: OnItemListener? = null

    var listResult = ArrayList<Any>()
    private var listData = ArrayList<Any>()
    var filterList = ArrayList<Any>()

    companion object {
        const val SCROLL_PERCENTAGE = 98
        const val TYPE_DATA_API_RESPONSE = 1
        const val TYPE_DATA_GOOGLE_MAP = 2
        const val SEARCH_GOOGLE_MAP = -1
        const val SEARCH_GOOGLE_MAP_NOT_FOUND = -2
        const val TYPE_SEARCH_UTENSILS = 2
    }

    interface OnItemListener {
        fun onClickItem(item: Any)
        fun onFilterResult(resultCount: Int, keySearch: String)
    }

    fun setOnItemListener(mOnItemListener: OnItemListener?) {
        this.mOnItemListener = mOnItemListener
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


    fun setLoaded() {
        isLoading = false
    }

    fun setLoading() {
        isLoading = true
    }

    @JvmName("setLoadMore1")
    fun setLoadMore(loadMore: ILoadMore?) {
        this.loadMore = loadMore
    }

    interface ILoadMore {
        fun onLoadMore()
    }

    inner class SearchLocationViewHolder(val binding: ItemSearchWithLocateOrToolBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private var pathImageLocation: String? = null
        private var pathImageUtensils: String? = null

        init {
            pathImageLocation =
                PrefManager.getInstance(context).getString(PrefConst.PREF_PATH_IMAGE_LIST_LOCATION)
            pathImageUtensils =
                PrefManager.getInstance(context).getString(PrefConst.PREF_PATH_IMAGE_LIST_UTENSILS)
            MyApplication.getInstance().run {
                binding.ivLogo.resizeHeight(sizeIcon)
                if (typeSearch == TYPE_SEARCH_UTENSILS) binding.tvContent.visibility = View.GONE
            }

        }


        fun bind(
            result: Any,
            position: Int
        ) {
            binding.apply {
                when (result) {
                    is ResponseListLocation.LocationData -> {
                        result.run {
                            tvTitle.text = this.name
                            tvContent.text = this.description
                            try {
                                if (this.getListImage()?.get(0) == null) {
                                    ivLogo.setImageResource(R.drawable.ic_item_search_locate)
                                } else {
                                    ivLogo.loadImageUrl(
                                        urlImage(
                                            this.getListImage()?.get(0), pathImageLocation
                                        )
                                    )
                                }
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                        }
                    }
                    is ResponseSearchLocations.SearchLocationData -> {
                        result.run {
                            tvTitle.text = this.name
                            tvContent.text = this.description
                            try {
                                if (!isDataGoogleMap) {
                                    if (result.getListImage()?.get(0) == null) {
                                        ivLogo.setImageResource(R.drawable.ic_item_search_locate)
                                    } else {
                                        ivLogo.loadImageWithCustomCorners(
                                            urlImage(
                                                result.getListImage()?.get(0),
                                                pathImageLocation
                                            ),
                                            10
                                        )
                                    }
                                } else {
                                    Glide.with(ivLogo)
                                        .load(ResourcesCompat.getDrawable(context.resources,R.drawable.ic_location_push_post,null))
                                        .transform(CenterCrop(), RoundedCorners(10))
                                        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                                        .into(ivLogo)
                                }

                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                        }
                    }
                    is ResponseListUtensils.UtensilsData -> {
                        result.run {
                            tvTitle.text = this.name
                            try {
                                if (this.getListImage()?.get(0) == null) {
                                    ivLogo.setImageResource(R.drawable.ic_item_search_tool)
                                } else {
                                    ivLogo.loadImageUrl(
                                        urlImage(
                                            this.getListImage()?.get(0), pathImageUtensils
                                        )
                                    )
                                }
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                        }
                    }
                    is ResponseSearchUtensils.SearchUtensilsData -> {
                        result.run {
                            tvTitle.text = this.name
                            try {
                                if (this.getListImage()?.get(0) == null) {
                                    ivLogo.setImageResource(R.drawable.ic_item_search_tool)
                                } else {
                                    ivLogo.loadImageUrl(
                                        urlImage(
                                            this.getListImage()?.get(0), pathImageUtensils
                                        )
                                    )
                                }
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                        }
                    }
                }

            }
            binding.root.setSingleClick {
                mOnItemListener?.onClickItem(result)
            }
        }
    }

    inner class SearchLocationGoogleViewHolder(val binding: ItemLocationNewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            MyApplication.getInstance().run {
                binding.img.resizeLayout(getSizeWithScale(36.0), getSizeWithScale(36.0))
            }

        }


        fun bind(
            result: Any,
            position: Int
        ) {
            binding.apply {
                when (result) {
                    is ResponseSearchLocations.SearchLocationData -> {
                        result.run {
                            tvContent.text = result.name
                            try {
                                if (this.id == SEARCH_GOOGLE_MAP) {
                                    Glide.with(img)
                                        .load(ResourcesCompat.getDrawable(context.resources,R.drawable.ic_location_push_post,null))
                                        .transform(CenterCrop(), RoundedCorners(10))
                                        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                                        .into(img)

                                } else {
                                    Glide.with(img)
                                        .load(ResourcesCompat.getDrawable(context.resources,R.drawable.ic_add_location_google,null))
                                        .transform(CenterCrop(), RoundedCorners(10))
                                        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                                        .into(img)
                                }

                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                        }
                    }
                }

            }
            binding.root.setSingleClick {
                mOnItemListener?.onClickItem(result)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            TYPE_DATA_API_RESPONSE -> {
                val binding = DataBindingUtil.inflate<ItemSearchWithLocateOrToolBinding>(
                    LayoutInflater.from(context),
                    R.layout.item_search_with_locate_or_tool,
                    parent,
                    false
                )
                return SearchLocationViewHolder(binding)
            }
            else -> {
                val binding = DataBindingUtil.inflate<ItemLocationNewBinding>(
                    LayoutInflater.from(context),
                    R.layout.item_location_new,
                    parent,
                    false
                )
                return SearchLocationGoogleViewHolder(binding)
            }

        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SearchLocationViewHolder -> {
                val item = listResult[holder.bindingAdapterPosition]
                holder.bind(item, holder.bindingAdapterPosition)
            }
            is SearchLocationGoogleViewHolder -> {
                val item = listResult[holder.bindingAdapterPosition]
                holder.bind(item, holder.bindingAdapterPosition)
            }
        }

    }

    override fun getItemCount(): Int = listResult.size

    override fun getItemViewType(position: Int): Int {
        when (listResult[position]) {
            is ResponseListLocation.LocationData, is ResponseListUtensils.UtensilsData, is ResponseSearchUtensils.SearchUtensilsData -> {
                return TYPE_DATA_API_RESPONSE
            }
            is ResponseSearchLocations.SearchLocationData -> {
                (listResult[position] as ResponseSearchLocations.SearchLocationData).apply {
                    return if (!this.isDataGoogleMap) TYPE_DATA_API_RESPONSE
                    else TYPE_DATA_GOOGLE_MAP
                }
            }
            else -> return TYPE_DATA_API_RESPONSE
        }


    }

    fun updateList(list: List<Any>) {
        list.let {
            listResult.clear()
            listResult.addAll(list)
            listData.clear()
            listData.addAll(list)
            notifyDataSetChanged()
        }
    }

    fun updateListSearchGoogleMap(list: List<Any>) {
        listResult.clear()
        listResult.addAll(list)
        notifyDataSetChanged()
    }

    fun insertList(list: List<Any>) {
        val sizeOld = listResult.size
        listResult.addAll(list)
        notifyItemChanged(sizeOld - 1, listResult.size - 1)

    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString().trim()
//                Log.e("TAG", "performFiltering: ${listData?.size}", )
                if (charSearch.isEmpty()) {
                    filterList = listData
                } else {
                    val resultList = ArrayList<Any>()
                    for (row in listData) {
                        when (row) {
                            is ResponseListLocation.LocationData -> {
                                val covertString = convertToString(row.name)
                                val convertStringSearch = convertToString(charSearch)
                                covertString?.let { name ->
                                    convertStringSearch?.let {
                                        if (name.contains(it)) resultList.add(row)
                                    }
                                }
                            }
                            is ResponseSearchLocations.SearchLocationData -> {
                                val covertString = convertToString(row.name)
                                val convertStringSearch = convertToString(charSearch)
                                covertString?.let { name ->
                                    convertStringSearch?.let {
                                        if (name.contains(it)) resultList.add(row)
                                    }
                                }
                            }
                            is ResponseListUtensils.UtensilsData->{
                                val covertString = convertToString(row.name)
                                val convertStringSearch = convertToString(charSearch)
                                covertString?.let { name ->
                                    convertStringSearch?.let {
                                        if (name.contains(it)) resultList.add(row)
                                    }
                                }
                            }
                            is ResponseSearchUtensils.SearchUtensilsData->{
                                val covertString = convertToString(row.name)
                                val convertStringSearch = convertToString(charSearch)
                                covertString?.let { name ->
                                    convertStringSearch?.let {
                                        if (name.contains(it)) resultList.add(row)
                                    }
                                }
                            }
                        }

                    }
                    filterList = resultList
                }
                val filterResults = FilterResults()
                filterResults.values = filterList
                mOnItemListener?.onFilterResult(filterList.size, charSearch)
                return filterResults
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                try {
                    results?.values.let {
                        listResult = it as ArrayList<Any>
                    }
                    notifyDataSetChanged()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
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