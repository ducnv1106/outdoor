package brite.outdoor.data.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import brite.outdoor.data.api_entities.response.ResponseListLocation
import brite.outdoor.data.api_entities.response.ResponseListUtensils
import brite.outdoor.data.api_entities.response.ResponsePushPosts
import brite.outdoor.data.entities.*
import brite.outdoor.entity.Reminders

@Dao
interface AppDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPushPosts(info: ResponsePushPosts.PushPostsResponse)

    @Query("SELECT  * FROM pushPostsResponse WHERE id= :id")
    suspend fun getPushPosts(id: String): ResponsePushPosts.PushPostsResponse?

//    @Query("UPDATE pushPostsResponse SET listConTent = :list WHERE id = :id")
//    suspend fun updatePushPosts(list: ArrayList<PostContentEntity>, id: String): Int

    @Query("DELETE FROM pushPostsResponse WHERE id = :id")
    suspend fun deletePushPost(id: String)

    @Query(" SELECT EXISTS(SELECT * from pushPostsResponse WHERE id= :id)")
    suspend fun isCheckId( id: String): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertListLocation(info: ArrayList<ResponseListLocation.LocationData>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLocationEntity(info: LocationEntityConvert)

    @Query("SELECT  * FROM locationEntity")
    fun getLocationEntity(): LiveData<LocationEntityConvert>?

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertLocation(obj: List<ResponseListLocation.LocationData>): List<Long>
    @Update
    fun updateLocation(obj: ResponseListLocation.LocationData)

    @Transaction
    fun insertOrUpdateLocation(objList: List<ResponseListLocation.LocationData>) = insertLocation(objList)
        .withIndex()
        .filter { it.value == -1L }
        .forEach { updateLocation(objList[it.index]) }

    @Query("SELECT  * FROM location")
    fun getListLocation(): LiveData<List<ResponseListLocation.LocationData>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUtensilEntity(info: UtensilEntityConvert)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertListUtensils(info: ArrayList<ResponseListUtensils.UtensilsData>)


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertUtensil(obj: List<ResponseListUtensils.UtensilsData>): List<Long>
    @Update
    fun updateUtensil(obj: ResponseListUtensils.UtensilsData)

    @Transaction
    fun insertOrUpdateUtensils(objList: List<ResponseListUtensils.UtensilsData>) = insertUtensil(objList)
        .withIndex()
        .filter { it.value == -1L }
        .forEach { updateUtensil(objList[it.index]) }

    @Query("SELECT  * FROM utensils")
    fun getListUtensils(): LiveData<List<ResponseListUtensils.UtensilsData>>

    @Query("SELECT  * FROM utensilEntity")
    fun getUtensilEntity(): LiveData<UtensilEntityConvert>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSelectPlace(info: SelectPlace)

    @Query("SELECT  * FROM selectPlace WHERE id= :id")
    suspend fun getSelectPlace(id: String): SelectPlace?

    @Query("DELETE FROM selectPlace WHERE id = :id")
    suspend fun deleteSelectPlace(id: String)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSelectUtensils(info: SelectUtensils)

    @Query("SELECT  * FROM selectUtensils WHERE id= :id")
    suspend fun getSelectUtensils(id: String): SelectUtensils?

    @Query("DELETE FROM selectUtensils WHERE id = :id")
    suspend fun deleteSelectUtensils(id: String)

    /*Room automatically handle liveData on a background thread Reminder*/
    @Query("SELECT * FROM reminders ORDER BY _id DESC")
    fun getReminders():LiveData<List<Reminders>>

    @Query("SELECT * FROM reminders ORDER BY _id DESC")
    fun getRemindersList():List<Reminders>?

    @Query("SELECT * FROM reminders WHERE _id = :reminderId")
    suspend fun getReminderById(reminderId:Int):Reminders?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertReminder(reminder:Reminders)

    @Update
    suspend fun updateReminder(reminder:Reminders)

    @Delete
    suspend fun delete(reminder: Reminders)

    @Query("DELETE FROM reminders")
    suspend fun clearAllreminders()

    @Query("SELECT * FROM reminders ORDER BY _id DESC LIMIT 1")
    suspend fun getLatestReminder():Reminders?
}