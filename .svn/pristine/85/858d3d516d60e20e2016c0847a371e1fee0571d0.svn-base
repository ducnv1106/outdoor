package brite.outdoor.data.entities

import androidx.lifecycle.MutableLiveData
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import brite.outdoor.data.api_entities.response.ResponseListLocation
import brite.outdoor.utils.TypeConvertUtils
import java.io.Serializable

@Entity(tableName = "locationEntity")
@TypeConverters(TypeConvertUtils.SourceTypeConverter::class)
data class LocationEntityConvert(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id") val id : Int=0,
    @ColumnInfo(name = "data") var listConTent: String?
)