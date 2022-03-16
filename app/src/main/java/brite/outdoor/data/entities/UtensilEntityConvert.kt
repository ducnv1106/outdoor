package brite.outdoor.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import brite.outdoor.utils.TypeConvertUtils

@Entity(tableName = "utensilEntity")
@TypeConverters(TypeConvertUtils.SourceTypeConverter::class)
data class UtensilEntityConvert(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id") val id :Int=0,
    @ColumnInfo(name = "data") var listConTent: String?
)