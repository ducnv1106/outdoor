package brite.outdoor.service

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.NotificationManager.IMPORTANCE_HIGH
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import brite.outdoor.R
import brite.outdoor.constants.AppConst.Companion.NOTIFICATION_APP
import brite.outdoor.constants.AppConst.Companion.NOTIFICATION_COUNT
import brite.outdoor.constants.AppConst.Companion.NOTIFICATION_DATA_TRANSFER
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.ui.activities.MainActivity
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class MyFirebaseMessagingService : FirebaseMessagingService() {
    private var broadcaster : LocalBroadcastManager?=null

    override fun onCreate() {
        super.onCreate()
        broadcaster = LocalBroadcastManager.getInstance(this)
    }
    override fun onNewToken(p0: String) {
        super.onNewToken(p0)

    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        try {
            val data = Bundle()
            for ((key, value) in remoteMessage.data) {
                data.putString(key, value)
            }
            val mNotificationManager =
                    applicationContext.getSystemService(
                            NOTIFICATION_SERVICE
                    ) as NotificationManager
            val channelId = getString(R.string.project_id)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                handleNotificationAndroidO(mNotificationManager, channelId)
            }

            val title = data.getString("title") ?: ""
            val body = data.getString("body") ?: ""
            val userId = data.getString("user_id") ?: ""
            val type = data.getString("type") ?: ""
            val p_id = data.getString("p_id") ?: ""
            val userFollowId = data.getString("user_follow_id")
            val postId = data.getString("post_id")
            val comment_id=data.getString("comment_id")
            val thread_id = data.getString("thread_id")
            val post_id = data.getString("post_id")

            var currentId: Int =
                PrefManager.getInstance(applicationContext).getInt(NOTIFICATION_COUNT)
            currentId++
            PrefManager.getInstance(applicationContext).writeInt(NOTIFICATION_COUNT, currentId)

            if (userId.isNotEmpty()){ // notify  app

                if (title.isNotEmpty() || body.isNotEmpty()) {
                    val context = applicationContext
                    val defaultAction = Intent(context, MainActivity::class.java)
                            .setAction(Intent.ACTION_DEFAULT)
                            .putExtra(NOTIFICATION_DATA_TRANSFER, data)
                    val mBuilder = NotificationCompat.Builder(context,channelId)
                            .setSmallIcon(R.drawable.ic_app)
                            .setColor(ContextCompat.getColor(this,R.color.colorMain))
                            .setContentTitle(title)
                            .setContentText(body)
                            .setAutoCancel(true)
                            .setWhen(System.currentTimeMillis())
                            .setDefaults(Notification.DEFAULT_ALL)
                            .setContentIntent(
                                    PendingIntent.getActivity(
                                            context,
                                            currentId,
                                            defaultAction,
                                            PendingIntent.FLAG_UPDATE_CURRENT
                                    )
                            )

                    mNotificationManager.notify(currentId,mBuilder.build())
                    val intent = Intent("notify-receive-listener");
                    broadcaster?.sendBroadcast(intent)
                }
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun handleNotificationAndroidO(
            notificationManager: NotificationManager,
            channelId: String
    ) {
        createNotificationChannel(notificationManager, channelId)
        notificationManager
                .getNotificationChannel(channelId)
                ?.canBypassDnd()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel(
            notificationManager: NotificationManager,
            channelId: String
    ) {
        val notificationChannel =
                NotificationChannel(channelId, getString(R.string.app_name), IMPORTANCE_HIGH)
        notificationManager.createNotificationChannel(notificationChannel)
    }
}

