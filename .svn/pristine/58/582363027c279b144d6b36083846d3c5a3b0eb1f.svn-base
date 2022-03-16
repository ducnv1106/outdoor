package brite.outdoor.adapter

import android.content.Context
import android.location.Geocoder
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import brite.outdoor.R
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.databinding.ItemLocationSaveBinding
import brite.outdoor.entity.EntityLocationSave
import brite.outdoor.utils.setSingleClick
import com.google.android.gms.maps.model.LatLng
import java.text.Normalizer
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayList

class AdapterLocationSave(var context: Context, val itemClicked: (position:Int,item:ResponseListCamping.ListCampingData,address:String) -> Unit)  : RecyclerView.Adapter<AdapterLocationSave.LocationSaveViewHolder>(),
    Filterable {

    private var listLocation :ArrayList<ResponseListCamping.ListCampingData> = ArrayList()
    private var listData:ArrayList<ResponseListCamping.ListCampingData> = ArrayList()
    private var filterList :ArrayList<ResponseListCamping.ListCampingData> = ArrayList()

    inner class LocationSaveViewHolder(val binding: ItemLocationSaveBinding) : RecyclerView.ViewHolder(binding.root){

        fun binData(item:ResponseListCamping.ListCampingData){
            binding.apply {
                val address = item.name
                tvContent.text = address

                root.setSingleClick {
                    if (address != null) {
                        itemClicked(this@LocationSaveViewHolder.bindingAdapterPosition,item,address)
                    }
                }
            }
        }
    }

    fun initData(list:List<ResponseListCamping.ListCampingData>){
        listLocation.addAll(list)
        listData.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationSaveViewHolder {
        val binding = DataBindingUtil.inflate<ItemLocationSaveBinding>(LayoutInflater.from(context),
            R.layout.item_location_save,parent,false)
        return LocationSaveViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LocationSaveViewHolder, position: Int) {
        val item = listLocation[position]
        holder.binData(item)
    }

    override fun getItemCount(): Int = listLocation.size

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString().trim()
//                Log.e("TAG", "performFiltering: ${listData?.size}", )
                if (charSearch.isEmpty()) {
                    filterList = listData
                } else {
                    val resultList = ArrayList<ResponseListCamping.ListCampingData>()
                    for (row in listData) {
                        val covertString = convertToString(row.name)
                        val convertStringSearch = convertToString(charSearch)
                        covertString?.let { name ->
                            convertStringSearch?.let {
                                if (name.contains(it)) resultList.add(row)
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
                        listLocation = it as ArrayList<ResponseListCamping.ListCampingData>
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