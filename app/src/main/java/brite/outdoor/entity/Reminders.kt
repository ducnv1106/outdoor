package brite.outdoor.entity

import android.annotation.SuppressLint
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.android.gms.maps.model.LatLng
import java.text.SimpleDateFormat
import java.util.*

@Entity(tableName = "reminders")
data class Reminders (
    @ColumnInfo(name = "_id")
    @PrimaryKey(autoGenerate = true)
    val id:Int =0,
    @ColumnInfo(name="reminder_identifier")
    val reminderIndentifier:String = UUID.randomUUID().toString(),
    var title: String = "",
    var content: String = "",
    @SuppressLint("SimpleDateFormat")
    var date: String = SimpleDateFormat("EEE d MMM yyyy").format(Date()),
    var time: String = SimpleDateFormat("HH:mm ").format(Date()),
    var repeat:Boolean = false,
    @ColumnInfo(name = "repeat_value")
    var repeatValue:Int = 1,
    @ColumnInfo(name = "repeat_unit")
    var repeatUnit:String="Day",
    @ColumnInfo(name = "active")
    var isActive:Boolean = true,


)