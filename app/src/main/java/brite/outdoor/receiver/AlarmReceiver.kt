package brite.outdoor.receiver

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import brite.outdoor.R
import brite.outdoor.constants.AppConst.Companion.INTENT_EXTRA_CONTENT
import brite.outdoor.constants.AppConst.Companion.INTENT_EXTRA_REMINDER_IDENTIFIER
import brite.outdoor.constants.AppConst.Companion.INTENT_EXTRA_ROW_ID
import brite.outdoor.constants.AppConst.Companion.INTENT_EXTRA_TITLE
import brite.outdoor.entity.Reminders
import brite.outdoor.ui.activities.MainActivity

class AlarmReceiver: BroadcastReceiver(){

    override fun onReceive(context: Context?, intent: Intent?) {
        //notification Extras..
        val notificationId = intent?.extras?.getInt(INTENT_EXTRA_ROW_ID)?:0
        val reminderIdentifier = intent?.extras?.getString(INTENT_EXTRA_REMINDER_IDENTIFIER)
        val title = intent?.extras?.getString(INTENT_EXTRA_TITLE)
        val content = intent?.extras?.getString(INTENT_EXTRA_CONTENT)

        val notificationIntent = Intent(context, MainActivity::class.java)
        notificationIntent.putExtra(INTENT_EXTRA_REMINDER_IDENTIFIER,reminderIdentifier)
        val pendingIntent = PendingIntent.getActivity(context,notificationId,notificationIntent,
            PendingIntent.FLAG_UPDATE_CURRENT
        )

        val notificationBuilder = NotificationCompat.Builder(context!!,context.getString(R.string.reminder_notification_channel_id))
            .setSmallIcon(R.drawable.ic_app)
            .setContentTitle(title)
            .setContentText(content)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .setOnlyAlertOnce(true)
            .setPriority(NotificationCompat.PRIORITY_HIGH)

        val notificationManager = ContextCompat.getSystemService(context,
            NotificationManager::class.java) as NotificationManager
        notificationManager.notify(notificationId,notificationBuilder.build())

    }


    companion object {

        private const val TAG = "AlarmReceiver"

        fun getAlarmPendingIntent(
            pckgContext: Context,
            reminder: Reminders
        ): PendingIntent {
            val intent = Intent(pckgContext, AlarmReceiver::class.java)
            intent.apply {
                putExtra(INTENT_EXTRA_REMINDER_IDENTIFIER, reminder.reminderIndentifier)
                putExtra(INTENT_EXTRA_ROW_ID, reminder.id)
                putExtra(INTENT_EXTRA_TITLE, reminder.title)
                putExtra(INTENT_EXTRA_CONTENT,reminder.content)
            }
            val pendingIntent = PendingIntent.getBroadcast(
                pckgContext,
                reminder.id,
                intent,
                PendingIntent.FLAG_CANCEL_CURRENT
            )
            Log.d(TAG, "getAlarmPendingIntent: ${reminder.id}")
            return pendingIntent
        }


    }

}