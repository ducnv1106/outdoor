package brite.outdoor.utils

import android.app.AlarmManager
import android.content.ComponentName
import android.content.Context
import android.content.pm.PackageManager
import android.os.SystemClock
import android.util.Log
import androidx.core.app.AlarmManagerCompat
import brite.outdoor.constants.AppConst.Companion.millisDay
import brite.outdoor.constants.AppConst.Companion.millisHour
import brite.outdoor.constants.AppConst.Companion.millisMinute
import brite.outdoor.constants.AppConst.Companion.millisMonth
import brite.outdoor.constants.AppConst.Companion.millisWeek
import brite.outdoor.entity.Reminders
import brite.outdoor.receiver.AlarmReceiver
import brite.outdoor.receiver.BootReceiver
import java.text.SimpleDateFormat
import java.util.*

class AlarmUtil {
    companion object {
        private const val TAG = "AlarmUtil"

        private fun getTriggerTime(dateString: String, timeString: String): Long {
            val date = SimpleDateFormat("EEE d MMM yyyy").parse(dateString)
            val time = SimpleDateFormat("h:mm").parse(timeString)
            val calendar = Calendar.getInstance()
            calendar.time = date ?: Date()
            val initialYear = calendar.get(Calendar.YEAR)
            val initialMonth = calendar.get(Calendar.MONTH)
            val initialDate = calendar.get(Calendar.DAY_OF_MONTH)
            calendar.time = time ?: Date()
            val initialHourOfDay = calendar.get(Calendar.HOUR_OF_DAY)
            val initialMinute = calendar.get(Calendar.MINUTE)
            calendar.set(initialYear, initialMonth, initialDate, initialHourOfDay, initialMinute)
            val timeDiff = calendar.timeInMillis - Calendar.getInstance().timeInMillis
            return SystemClock.elapsedRealtime() + timeDiff
        }

        private fun getRepeatTime(value: Int, unit: String): Long {
            return when (unit) {
                "Minute" ->
                    value * millisMinute
                "Hour" ->
                    value * millisHour
                "Day" ->
                    value * millisDay
                "Week" ->
                    value * millisWeek
                "Month" ->
                    value * millisMonth
                else ->
                    value * millisDay
            }
        }

        fun createAlarm(
            context: Context,
            reminder: Reminders,
            alarmManager: AlarmManager
        ) {
            val alarmPendingIntent = AlarmReceiver.getAlarmPendingIntent(
                context,
                reminder
            )

            AlarmManagerCompat.setExactAndAllowWhileIdle(
                alarmManager,
                AlarmManager.ELAPSED_REALTIME_WAKEUP,
                getTriggerTime(reminder.date, reminder.time),
                alarmPendingIntent
            )
            updateAlarmWhenReboot(context, PackageManager.COMPONENT_ENABLED_STATE_ENABLED)
        }

        fun cancelAlarm(
            context: Context,
            reminder: Reminders,
            alarmManager: AlarmManager
        ) {
            val alarmPendingIntent = AlarmReceiver.getAlarmPendingIntent(
                context,
                reminder
            )
            Log.d(TAG, "cancelAlarm: ")
            alarmManager.cancel(alarmPendingIntent)
            updateAlarmWhenReboot(context, PackageManager.COMPONENT_ENABLED_STATE_DISABLED)
        }


        private fun updateAlarmWhenReboot(context: Context, state:Int){
            val receiver = ComponentName(context, BootReceiver::class.java)
            context.packageManager.setComponentEnabledSetting(
                receiver,
                state,
                PackageManager.DONT_KILL_APP
            )
        }
    }
}