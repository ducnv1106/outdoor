package brite.outdoor.entity

import android.content.Context
import android.location.Address
import android.location.Geocoder
import android.os.Parcelable
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class EntityLocationSave (
    var id :Int=0,
    var latitude:Double=0.0,
    var longitude:Double=0.0,
    var imgContent:String = "https://data.webnhiepanh.com/wp-content/uploads/2020/11/21105453/phong-canh-1.jpg",
    var content:String = "Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet.Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet.Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet.Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet.Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet.Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet.Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet.",
    var isSaveLocation : Boolean = true
): Parcelable{
    fun getNameLocation(context: Context):String?{
        return try {
            val geocoder = Geocoder(context, Locale.getDefault())
            val address = geocoder.getFromLocation(latitude, longitude, 1)
            address[0].getAddressLine(0)
        }catch (e:Exception){
            e.printStackTrace()
            null
        }

    }
}
