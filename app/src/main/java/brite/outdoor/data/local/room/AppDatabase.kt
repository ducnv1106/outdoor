package brite.outdoor.data.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import brite.outdoor.data.api_entities.response.ResponseListLocation
import brite.outdoor.data.api_entities.response.ResponseListUtensils
import brite.outdoor.data.api_entities.response.ResponsePushPosts
import brite.outdoor.data.entities.LocationEntityConvert
import brite.outdoor.data.entities.SelectPlace
import brite.outdoor.data.entities.SelectUtensils
import brite.outdoor.data.entities.UtensilEntityConvert
import brite.outdoor.entity.Reminders


@Database(entities = [ResponsePushPosts.PushPostsResponse::class,ResponseListLocation.LocationData::class,ResponseListUtensils.UtensilsData::class,SelectPlace::class,SelectUtensils::class,LocationEntityConvert::class,UtensilEntityConvert::class,Reminders::class], version = 2, exportSchema = false)

abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): AppDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase =
            instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }

        var MIGRATION_1_TO_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("CREATE TABLE reminders (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, reminder_identifier TEXT NOT NULL, title TEXT NOT NULL,content TEXT NOT NULL,date TEXT NOT NULL,time TEXT NOT NULL,repeat INTEGER  NOT NULL,repeat_value INTEGER NOT NULL,repeat_unit TEXT NOT NULL,active INTEGER NOT NULL )")
                database.execSQL("CREATE TABLE IF NOT EXISTS `utensilEntity` (`id` INTEGER, PRIMARY KEY(`id`))")
                database.execSQL("CREATE TABLE IF NOT EXISTS `locationEntity` (`id` INTEGER, PRIMARY KEY(`id`))")

            }
        }

        private fun buildDatabase(appContext: Context) =
            Room.databaseBuilder(appContext, AppDatabase::class.java, "DataBs")
                .addMigrations(MIGRATION_1_TO_2)
                .fallbackToDestructiveMigration()
                .build()
    }
}