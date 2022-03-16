package brite.outdoor.data.local.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AppDao _appDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `pushPostsResponse` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `listConTent` TEXT NOT NULL, `avatar` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `location` (`id` INTEGER NOT NULL, `name` TEXT, `imageName` TEXT, `description` TEXT, `cIndex` INTEGER NOT NULL, `lat` TEXT, `lng` TEXT, `key_search` TEXT, `modified_time` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `utensils` (`id` INTEGER NOT NULL, `name` TEXT, `description` TEXT, `cIndex` INTEGER NOT NULL, `imageName` TEXT, `key_search` TEXT, `modified_time` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `selectPlace` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `listConTent` TEXT NOT NULL, `avatar` TEXT, `location` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `selectUtensils` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `listConTent` TEXT NOT NULL, `avatar` TEXT, `utensils` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `locationEntity` (`id` INTEGER NOT NULL, `data` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `utensilEntity` (`id` INTEGER NOT NULL, `data` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `reminders` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `reminder_identifier` TEXT NOT NULL, `title` TEXT NOT NULL, `content` TEXT NOT NULL, `date` TEXT NOT NULL, `time` TEXT NOT NULL, `repeat` INTEGER NOT NULL, `repeat_value` INTEGER NOT NULL, `repeat_unit` TEXT NOT NULL, `active` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '418732db3983fa19c62160e5e963254e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `pushPostsResponse`");
        _db.execSQL("DROP TABLE IF EXISTS `location`");
        _db.execSQL("DROP TABLE IF EXISTS `utensils`");
        _db.execSQL("DROP TABLE IF EXISTS `selectPlace`");
        _db.execSQL("DROP TABLE IF EXISTS `selectUtensils`");
        _db.execSQL("DROP TABLE IF EXISTS `locationEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `utensilEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `reminders`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPushPostsResponse = new HashMap<String, TableInfo.Column>(4);
        _columnsPushPostsResponse.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushPostsResponse.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushPostsResponse.put("listConTent", new TableInfo.Column("listConTent", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPushPostsResponse.put("avatar", new TableInfo.Column("avatar", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPushPostsResponse = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPushPostsResponse = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPushPostsResponse = new TableInfo("pushPostsResponse", _columnsPushPostsResponse, _foreignKeysPushPostsResponse, _indicesPushPostsResponse);
        final TableInfo _existingPushPostsResponse = TableInfo.read(_db, "pushPostsResponse");
        if (! _infoPushPostsResponse.equals(_existingPushPostsResponse)) {
          return new RoomOpenHelper.ValidationResult(false, "pushPostsResponse(brite.outdoor.data.api_entities.response.ResponsePushPosts.PushPostsResponse).\n"
                  + " Expected:\n" + _infoPushPostsResponse + "\n"
                  + " Found:\n" + _existingPushPostsResponse);
        }
        final HashMap<String, TableInfo.Column> _columnsLocation = new HashMap<String, TableInfo.Column>(9);
        _columnsLocation.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("imageName", new TableInfo.Column("imageName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("cIndex", new TableInfo.Column("cIndex", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("lat", new TableInfo.Column("lat", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("lng", new TableInfo.Column("lng", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("key_search", new TableInfo.Column("key_search", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("modified_time", new TableInfo.Column("modified_time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLocation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLocation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLocation = new TableInfo("location", _columnsLocation, _foreignKeysLocation, _indicesLocation);
        final TableInfo _existingLocation = TableInfo.read(_db, "location");
        if (! _infoLocation.equals(_existingLocation)) {
          return new RoomOpenHelper.ValidationResult(false, "location(brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData).\n"
                  + " Expected:\n" + _infoLocation + "\n"
                  + " Found:\n" + _existingLocation);
        }
        final HashMap<String, TableInfo.Column> _columnsUtensils = new HashMap<String, TableInfo.Column>(7);
        _columnsUtensils.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtensils.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtensils.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtensils.put("cIndex", new TableInfo.Column("cIndex", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtensils.put("imageName", new TableInfo.Column("imageName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtensils.put("key_search", new TableInfo.Column("key_search", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtensils.put("modified_time", new TableInfo.Column("modified_time", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUtensils = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUtensils = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUtensils = new TableInfo("utensils", _columnsUtensils, _foreignKeysUtensils, _indicesUtensils);
        final TableInfo _existingUtensils = TableInfo.read(_db, "utensils");
        if (! _infoUtensils.equals(_existingUtensils)) {
          return new RoomOpenHelper.ValidationResult(false, "utensils(brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData).\n"
                  + " Expected:\n" + _infoUtensils + "\n"
                  + " Found:\n" + _existingUtensils);
        }
        final HashMap<String, TableInfo.Column> _columnsSelectPlace = new HashMap<String, TableInfo.Column>(5);
        _columnsSelectPlace.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSelectPlace.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSelectPlace.put("listConTent", new TableInfo.Column("listConTent", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSelectPlace.put("avatar", new TableInfo.Column("avatar", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSelectPlace.put("location", new TableInfo.Column("location", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSelectPlace = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSelectPlace = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSelectPlace = new TableInfo("selectPlace", _columnsSelectPlace, _foreignKeysSelectPlace, _indicesSelectPlace);
        final TableInfo _existingSelectPlace = TableInfo.read(_db, "selectPlace");
        if (! _infoSelectPlace.equals(_existingSelectPlace)) {
          return new RoomOpenHelper.ValidationResult(false, "selectPlace(brite.outdoor.data.entities.SelectPlace).\n"
                  + " Expected:\n" + _infoSelectPlace + "\n"
                  + " Found:\n" + _existingSelectPlace);
        }
        final HashMap<String, TableInfo.Column> _columnsSelectUtensils = new HashMap<String, TableInfo.Column>(5);
        _columnsSelectUtensils.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSelectUtensils.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSelectUtensils.put("listConTent", new TableInfo.Column("listConTent", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSelectUtensils.put("avatar", new TableInfo.Column("avatar", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSelectUtensils.put("utensils", new TableInfo.Column("utensils", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSelectUtensils = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSelectUtensils = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSelectUtensils = new TableInfo("selectUtensils", _columnsSelectUtensils, _foreignKeysSelectUtensils, _indicesSelectUtensils);
        final TableInfo _existingSelectUtensils = TableInfo.read(_db, "selectUtensils");
        if (! _infoSelectUtensils.equals(_existingSelectUtensils)) {
          return new RoomOpenHelper.ValidationResult(false, "selectUtensils(brite.outdoor.data.entities.SelectUtensils).\n"
                  + " Expected:\n" + _infoSelectUtensils + "\n"
                  + " Found:\n" + _existingSelectUtensils);
        }
        final HashMap<String, TableInfo.Column> _columnsLocationEntity = new HashMap<String, TableInfo.Column>(2);
        _columnsLocationEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationEntity.put("data", new TableInfo.Column("data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLocationEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLocationEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLocationEntity = new TableInfo("locationEntity", _columnsLocationEntity, _foreignKeysLocationEntity, _indicesLocationEntity);
        final TableInfo _existingLocationEntity = TableInfo.read(_db, "locationEntity");
        if (! _infoLocationEntity.equals(_existingLocationEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "locationEntity(brite.outdoor.data.entities.LocationEntityConvert).\n"
                  + " Expected:\n" + _infoLocationEntity + "\n"
                  + " Found:\n" + _existingLocationEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsUtensilEntity = new HashMap<String, TableInfo.Column>(2);
        _columnsUtensilEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtensilEntity.put("data", new TableInfo.Column("data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUtensilEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUtensilEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUtensilEntity = new TableInfo("utensilEntity", _columnsUtensilEntity, _foreignKeysUtensilEntity, _indicesUtensilEntity);
        final TableInfo _existingUtensilEntity = TableInfo.read(_db, "utensilEntity");
        if (! _infoUtensilEntity.equals(_existingUtensilEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "utensilEntity(brite.outdoor.data.entities.UtensilEntityConvert).\n"
                  + " Expected:\n" + _infoUtensilEntity + "\n"
                  + " Found:\n" + _existingUtensilEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsReminders = new HashMap<String, TableInfo.Column>(10);
        _columnsReminders.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReminders.put("reminder_identifier", new TableInfo.Column("reminder_identifier", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReminders.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReminders.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReminders.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReminders.put("time", new TableInfo.Column("time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReminders.put("repeat", new TableInfo.Column("repeat", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReminders.put("repeat_value", new TableInfo.Column("repeat_value", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReminders.put("repeat_unit", new TableInfo.Column("repeat_unit", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReminders.put("active", new TableInfo.Column("active", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysReminders = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesReminders = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoReminders = new TableInfo("reminders", _columnsReminders, _foreignKeysReminders, _indicesReminders);
        final TableInfo _existingReminders = TableInfo.read(_db, "reminders");
        if (! _infoReminders.equals(_existingReminders)) {
          return new RoomOpenHelper.ValidationResult(false, "reminders(brite.outdoor.entity.Reminders).\n"
                  + " Expected:\n" + _infoReminders + "\n"
                  + " Found:\n" + _existingReminders);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "418732db3983fa19c62160e5e963254e", "38c013cf49be54ec979ae00f84eef2b0");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "pushPostsResponse","location","utensils","selectPlace","selectUtensils","locationEntity","utensilEntity","reminders");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `pushPostsResponse`");
      _db.execSQL("DELETE FROM `location`");
      _db.execSQL("DELETE FROM `utensils`");
      _db.execSQL("DELETE FROM `selectPlace`");
      _db.execSQL("DELETE FROM `selectUtensils`");
      _db.execSQL("DELETE FROM `locationEntity`");
      _db.execSQL("DELETE FROM `utensilEntity`");
      _db.execSQL("DELETE FROM `reminders`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public AppDao appDao() {
    if (_appDao != null) {
      return _appDao;
    } else {
      synchronized(this) {
        if(_appDao == null) {
          _appDao = new AppDao_Impl(this);
        }
        return _appDao;
      }
    }
  }
}
