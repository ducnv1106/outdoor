package brite.outdoor.data.repository

import androidx.annotation.WorkerThread
import brite.outdoor.data.api_entities.response.ResponsePushPosts
import brite.outdoor.data.entities.SelectPlace
import brite.outdoor.data.entities.SelectUtensils
import brite.outdoor.data.local.room.AppDao
import brite.outdoor.entity.Reminders
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AppRepository @Inject constructor(private val localDataSource: AppDao
) {
    @WorkerThread
    suspend fun insertPost(info: ResponsePushPosts.PushPostsResponse) = localDataSource.insertPushPosts(info)

    @WorkerThread
    suspend fun deletePost(id: String) = localDataSource.deletePushPost(id)

    @WorkerThread
    suspend fun getPushPosts(id: String) = localDataSource.getPushPosts(id)


    @WorkerThread
    suspend fun insertSelectPlace(info: SelectPlace) = localDataSource.insertSelectPlace(info)

    @WorkerThread
    suspend fun deleteSelectPlace(id: String) = localDataSource.deleteSelectPlace(id)

    @WorkerThread
    suspend fun getSelectPlace(id: String) = localDataSource.getSelectPlace(id)

    @WorkerThread
    suspend fun insertSelectUtensils(info: SelectUtensils) = localDataSource.insertSelectUtensils(info)

    @WorkerThread
    suspend fun deleteSelectUtensils(id: String) = localDataSource.deleteSelectUtensils(id)

    @WorkerThread
    suspend fun getSelectUtensils(id: String) = localDataSource.getSelectUtensils(id)

    fun getAllReminders() = localDataSource.getReminders()

    suspend fun getRemindersList():List<Reminders>?{
        return withContext(Dispatchers.IO){
            localDataSource.getRemindersList()
        }
    }

    suspend fun getReminderById(reminderId: Int): Reminders? {
        return withContext(Dispatchers.IO) {
            localDataSource.getReminderById(reminderId)
        }
    }

    suspend fun getLatestReminder():Reminders?{
        return  withContext(Dispatchers.IO){
            localDataSource.getLatestReminder()
        }
    }

    suspend fun insert(reminder: Reminders){
        withContext(Dispatchers.IO) {
            localDataSource.insertReminder(reminder)
        }
    }

    suspend fun update(reminder: Reminders) {
        withContext(Dispatchers.IO) {
            localDataSource.updateReminder(reminder)
        }
    }
    suspend fun delete(reminder: Reminders) {
        withContext(Dispatchers.IO) {
            localDataSource.delete(reminder)
        }
    }

}