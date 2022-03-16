package brite.outdoor.data.local.room;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import brite.outdoor.data.api_entities.response.ResponseListLocation;
import brite.outdoor.data.api_entities.response.ResponseListUtensils;
import brite.outdoor.data.api_entities.response.ResponsePushPosts;
import brite.outdoor.data.entities.ImagePicker;
import brite.outdoor.data.entities.LocationEntity;
import brite.outdoor.data.entities.LocationEntityConvert;
import brite.outdoor.data.entities.PostContentEntity;
import brite.outdoor.data.entities.SelectPlace;
import brite.outdoor.data.entities.SelectUtensils;
import brite.outdoor.data.entities.UtensilEntityConvert;
import brite.outdoor.data.entities.UtensilsEntity;
import brite.outdoor.entity.Reminders;
import brite.outdoor.utils.TypeConvertUtils;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ResponsePushPosts.PushPostsResponse> __insertionAdapterOfPushPostsResponse;

  private final TypeConvertUtils.SourceTypeConverter __sourceTypeConverter = new TypeConvertUtils.SourceTypeConverter();

  private final EntityInsertionAdapter<ResponseListLocation.LocationData> __insertionAdapterOfLocationData;

  private final EntityInsertionAdapter<LocationEntityConvert> __insertionAdapterOfLocationEntityConvert;

  private final EntityInsertionAdapter<ResponseListLocation.LocationData> __insertionAdapterOfLocationData_1;

  private final EntityInsertionAdapter<UtensilEntityConvert> __insertionAdapterOfUtensilEntityConvert;

  private final EntityInsertionAdapter<ResponseListUtensils.UtensilsData> __insertionAdapterOfUtensilsData;

  private final EntityInsertionAdapter<ResponseListUtensils.UtensilsData> __insertionAdapterOfUtensilsData_1;

  private final EntityInsertionAdapter<SelectPlace> __insertionAdapterOfSelectPlace;

  private final EntityInsertionAdapter<SelectUtensils> __insertionAdapterOfSelectUtensils;

  private final EntityInsertionAdapter<Reminders> __insertionAdapterOfReminders;

  private final EntityDeletionOrUpdateAdapter<Reminders> __deletionAdapterOfReminders;

  private final EntityDeletionOrUpdateAdapter<ResponseListLocation.LocationData> __updateAdapterOfLocationData;

  private final EntityDeletionOrUpdateAdapter<ResponseListUtensils.UtensilsData> __updateAdapterOfUtensilsData;

  private final EntityDeletionOrUpdateAdapter<Reminders> __updateAdapterOfReminders;

  private final SharedSQLiteStatement __preparedStmtOfDeletePushPost;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSelectPlace;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSelectUtensils;

  private final SharedSQLiteStatement __preparedStmtOfClearAllreminders;

  public AppDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPushPostsResponse = new EntityInsertionAdapter<ResponsePushPosts.PushPostsResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `pushPostsResponse` (`id`,`title`,`listConTent`,`avatar`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ResponsePushPosts.PushPostsResponse value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        final String _tmp;
        _tmp = __sourceTypeConverter.listToJson(value.getListConTent());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __sourceTypeConverter.objectToJson(value.getAvatar());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
      }
    };
    this.__insertionAdapterOfLocationData = new EntityInsertionAdapter<ResponseListLocation.LocationData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `location` (`id`,`name`,`imageName`,`description`,`cIndex`,`lat`,`lng`,`key_search`,`modified_time`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ResponseListLocation.LocationData value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImageName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImageName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getCIndex());
        if (value.getLat() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLat());
        }
        if (value.getLng() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLng());
        }
        if (value.getKey_search() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getKey_search());
        }
        if (value.getModified_time() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getModified_time());
        }
      }
    };
    this.__insertionAdapterOfLocationEntityConvert = new EntityInsertionAdapter<LocationEntityConvert>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `locationEntity` (`id`,`data`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocationEntityConvert value) {
        stmt.bindLong(1, value.getId());
        if (value.getListConTent() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getListConTent());
        }
      }
    };
    this.__insertionAdapterOfLocationData_1 = new EntityInsertionAdapter<ResponseListLocation.LocationData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `location` (`id`,`name`,`imageName`,`description`,`cIndex`,`lat`,`lng`,`key_search`,`modified_time`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ResponseListLocation.LocationData value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImageName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImageName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getCIndex());
        if (value.getLat() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLat());
        }
        if (value.getLng() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLng());
        }
        if (value.getKey_search() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getKey_search());
        }
        if (value.getModified_time() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getModified_time());
        }
      }
    };
    this.__insertionAdapterOfUtensilEntityConvert = new EntityInsertionAdapter<UtensilEntityConvert>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `utensilEntity` (`id`,`data`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UtensilEntityConvert value) {
        stmt.bindLong(1, value.getId());
        if (value.getListConTent() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getListConTent());
        }
      }
    };
    this.__insertionAdapterOfUtensilsData = new EntityInsertionAdapter<ResponseListUtensils.UtensilsData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `utensils` (`id`,`name`,`description`,`cIndex`,`imageName`,`key_search`,`modified_time`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ResponseListUtensils.UtensilsData value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        stmt.bindLong(4, value.getCIndex());
        if (value.getImageName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImageName());
        }
        if (value.getKey_search() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getKey_search());
        }
        if (value.getModified_time() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getModified_time());
        }
      }
    };
    this.__insertionAdapterOfUtensilsData_1 = new EntityInsertionAdapter<ResponseListUtensils.UtensilsData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `utensils` (`id`,`name`,`description`,`cIndex`,`imageName`,`key_search`,`modified_time`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ResponseListUtensils.UtensilsData value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        stmt.bindLong(4, value.getCIndex());
        if (value.getImageName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImageName());
        }
        if (value.getKey_search() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getKey_search());
        }
        if (value.getModified_time() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getModified_time());
        }
      }
    };
    this.__insertionAdapterOfSelectPlace = new EntityInsertionAdapter<SelectPlace>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `selectPlace` (`id`,`title`,`listConTent`,`avatar`,`location`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SelectPlace value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        final String _tmp;
        _tmp = __sourceTypeConverter.listToJson(value.getListConTent());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __sourceTypeConverter.objectToJson(value.getAvatar());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __sourceTypeConverter.objectLocationToJson(value.getLocation());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
      }
    };
    this.__insertionAdapterOfSelectUtensils = new EntityInsertionAdapter<SelectUtensils>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `selectUtensils` (`id`,`title`,`listConTent`,`avatar`,`utensils`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SelectUtensils value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        final String _tmp;
        _tmp = __sourceTypeConverter.listToJson(value.getListConTent());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __sourceTypeConverter.objectToJson(value.getAvatar());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __sourceTypeConverter.objectUtensilsToJson(value.getUtensils());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
      }
    };
    this.__insertionAdapterOfReminders = new EntityInsertionAdapter<Reminders>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `reminders` (`_id`,`reminder_identifier`,`title`,`content`,`date`,`time`,`repeat`,`repeat_value`,`repeat_unit`,`active`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Reminders value) {
        stmt.bindLong(1, value.getId());
        if (value.getReminderIndentifier() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getReminderIndentifier());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getContent() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContent());
        }
        if (value.getDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDate());
        }
        if (value.getTime() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTime());
        }
        final int _tmp;
        _tmp = value.getRepeat() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        stmt.bindLong(8, value.getRepeatValue());
        if (value.getRepeatUnit() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getRepeatUnit());
        }
        final int _tmp_1;
        _tmp_1 = value.isActive() ? 1 : 0;
        stmt.bindLong(10, _tmp_1);
      }
    };
    this.__deletionAdapterOfReminders = new EntityDeletionOrUpdateAdapter<Reminders>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `reminders` WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Reminders value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfLocationData = new EntityDeletionOrUpdateAdapter<ResponseListLocation.LocationData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `location` SET `id` = ?,`name` = ?,`imageName` = ?,`description` = ?,`cIndex` = ?,`lat` = ?,`lng` = ?,`key_search` = ?,`modified_time` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ResponseListLocation.LocationData value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImageName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImageName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getCIndex());
        if (value.getLat() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLat());
        }
        if (value.getLng() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLng());
        }
        if (value.getKey_search() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getKey_search());
        }
        if (value.getModified_time() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getModified_time());
        }
        stmt.bindLong(10, value.getId());
      }
    };
    this.__updateAdapterOfUtensilsData = new EntityDeletionOrUpdateAdapter<ResponseListUtensils.UtensilsData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `utensils` SET `id` = ?,`name` = ?,`description` = ?,`cIndex` = ?,`imageName` = ?,`key_search` = ?,`modified_time` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ResponseListUtensils.UtensilsData value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        stmt.bindLong(4, value.getCIndex());
        if (value.getImageName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImageName());
        }
        if (value.getKey_search() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getKey_search());
        }
        if (value.getModified_time() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getModified_time());
        }
        stmt.bindLong(8, value.getId());
      }
    };
    this.__updateAdapterOfReminders = new EntityDeletionOrUpdateAdapter<Reminders>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `reminders` SET `_id` = ?,`reminder_identifier` = ?,`title` = ?,`content` = ?,`date` = ?,`time` = ?,`repeat` = ?,`repeat_value` = ?,`repeat_unit` = ?,`active` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Reminders value) {
        stmt.bindLong(1, value.getId());
        if (value.getReminderIndentifier() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getReminderIndentifier());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getContent() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContent());
        }
        if (value.getDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDate());
        }
        if (value.getTime() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTime());
        }
        final int _tmp;
        _tmp = value.getRepeat() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        stmt.bindLong(8, value.getRepeatValue());
        if (value.getRepeatUnit() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getRepeatUnit());
        }
        final int _tmp_1;
        _tmp_1 = value.isActive() ? 1 : 0;
        stmt.bindLong(10, _tmp_1);
        stmt.bindLong(11, value.getId());
      }
    };
    this.__preparedStmtOfDeletePushPost = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM pushPostsResponse WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSelectPlace = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM selectPlace WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSelectUtensils = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM selectUtensils WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearAllreminders = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM reminders";
        return _query;
      }
    };
  }

  @Override
  public Object insertPushPosts(final ResponsePushPosts.PushPostsResponse info,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPushPostsResponse.insert(info);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void insertListLocation(final ArrayList<ResponseListLocation.LocationData> info) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLocationData.insert(info);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertLocationEntity(final LocationEntityConvert info) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLocationEntityConvert.insert(info);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertLocation(final List<ResponseListLocation.LocationData> obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfLocationData_1.insertAndReturnIdsList(obj);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertUtensilEntity(final UtensilEntityConvert info) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUtensilEntityConvert.insert(info);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertListUtensils(final ArrayList<ResponseListUtensils.UtensilsData> info) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUtensilsData.insert(info);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Long> insertUtensil(final List<ResponseListUtensils.UtensilsData> obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfUtensilsData_1.insertAndReturnIdsList(obj);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object insertSelectPlace(final SelectPlace info, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSelectPlace.insert(info);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertSelectUtensils(final SelectUtensils info,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSelectUtensils.insert(info);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertReminder(final Reminders reminder, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfReminders.insert(reminder);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final Reminders reminder, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfReminders.handle(reminder);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void updateLocation(final ResponseListLocation.LocationData obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfLocationData.handle(obj);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateUtensil(final ResponseListUtensils.UtensilsData obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfUtensilsData.handle(obj);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object updateReminder(final Reminders reminder, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfReminders.handle(reminder);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void insertOrUpdateLocation(final List<ResponseListLocation.LocationData> objList) {
    __db.beginTransaction();
    try {
      AppDao.DefaultImpls.insertOrUpdateLocation(AppDao_Impl.this, objList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertOrUpdateUtensils(final List<ResponseListUtensils.UtensilsData> objList) {
    __db.beginTransaction();
    try {
      AppDao.DefaultImpls.insertOrUpdateUtensils(AppDao_Impl.this, objList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object deletePushPost(final String id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePushPost.acquire();
        int _argIndex = 1;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeletePushPost.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object deleteSelectPlace(final String id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSelectPlace.acquire();
        int _argIndex = 1;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteSelectPlace.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object deleteSelectUtensils(final String id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSelectUtensils.acquire();
        int _argIndex = 1;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteSelectUtensils.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object clearAllreminders(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAllreminders.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearAllreminders.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object getPushPosts(final String id,
      final Continuation<? super ResponsePushPosts.PushPostsResponse> p1) {
    final String _sql = "SELECT  * FROM pushPostsResponse WHERE id= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<ResponsePushPosts.PushPostsResponse>() {
      @Override
      public ResponsePushPosts.PushPostsResponse call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfListConTent = CursorUtil.getColumnIndexOrThrow(_cursor, "listConTent");
          final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final ResponsePushPosts.PushPostsResponse _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final MutableLiveData<ArrayList<PostContentEntity>> _tmpListConTent;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfListConTent);
            _tmpListConTent = __sourceTypeConverter.jsonToList(_tmp);
            final ImagePicker _tmpAvatar;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfAvatar);
            _tmpAvatar = __sourceTypeConverter.jsonToObject(_tmp_1);
            _result = new ResponsePushPosts.PushPostsResponse(_tmpId,_tmpTitle,_tmpListConTent,_tmpAvatar);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object isCheckId(final String id, final Continuation<? super Integer> p1) {
    final String _sql = " SELECT EXISTS(SELECT * from pushPostsResponse WHERE id= ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<LocationEntityConvert> getLocationEntity() {
    final String _sql = "SELECT  * FROM locationEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"locationEntity"}, false, new Callable<LocationEntityConvert>() {
      @Override
      public LocationEntityConvert call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfListConTent = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final LocationEntityConvert _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpListConTent;
            _tmpListConTent = _cursor.getString(_cursorIndexOfListConTent);
            _result = new LocationEntityConvert(_tmpId,_tmpListConTent);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<ResponseListLocation.LocationData>> getListLocation() {
    final String _sql = "SELECT  * FROM location";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"location"}, false, new Callable<List<ResponseListLocation.LocationData>>() {
      @Override
      public List<ResponseListLocation.LocationData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImageName = CursorUtil.getColumnIndexOrThrow(_cursor, "imageName");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfCIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "cIndex");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final int _cursorIndexOfLng = CursorUtil.getColumnIndexOrThrow(_cursor, "lng");
          final int _cursorIndexOfKeySearch = CursorUtil.getColumnIndexOrThrow(_cursor, "key_search");
          final int _cursorIndexOfModifiedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "modified_time");
          final List<ResponseListLocation.LocationData> _result = new ArrayList<ResponseListLocation.LocationData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ResponseListLocation.LocationData _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpImageName;
            _tmpImageName = _cursor.getString(_cursorIndexOfImageName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final int _tmpCIndex;
            _tmpCIndex = _cursor.getInt(_cursorIndexOfCIndex);
            final String _tmpLat;
            _tmpLat = _cursor.getString(_cursorIndexOfLat);
            final String _tmpLng;
            _tmpLng = _cursor.getString(_cursorIndexOfLng);
            final String _tmpKey_search;
            _tmpKey_search = _cursor.getString(_cursorIndexOfKeySearch);
            final String _tmpModified_time;
            _tmpModified_time = _cursor.getString(_cursorIndexOfModifiedTime);
            _item = new ResponseListLocation.LocationData(_tmpId,_tmpName,_tmpImageName,_tmpDescription,_tmpCIndex,_tmpLat,_tmpLng,_tmpKey_search,_tmpModified_time);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<ResponseListUtensils.UtensilsData>> getListUtensils() {
    final String _sql = "SELECT  * FROM utensils";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"utensils"}, false, new Callable<List<ResponseListUtensils.UtensilsData>>() {
      @Override
      public List<ResponseListUtensils.UtensilsData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfCIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "cIndex");
          final int _cursorIndexOfImageName = CursorUtil.getColumnIndexOrThrow(_cursor, "imageName");
          final int _cursorIndexOfKeySearch = CursorUtil.getColumnIndexOrThrow(_cursor, "key_search");
          final int _cursorIndexOfModifiedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "modified_time");
          final List<ResponseListUtensils.UtensilsData> _result = new ArrayList<ResponseListUtensils.UtensilsData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ResponseListUtensils.UtensilsData _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final int _tmpCIndex;
            _tmpCIndex = _cursor.getInt(_cursorIndexOfCIndex);
            final String _tmpImageName;
            _tmpImageName = _cursor.getString(_cursorIndexOfImageName);
            final String _tmpKey_search;
            _tmpKey_search = _cursor.getString(_cursorIndexOfKeySearch);
            final String _tmpModified_time;
            _tmpModified_time = _cursor.getString(_cursorIndexOfModifiedTime);
            _item = new ResponseListUtensils.UtensilsData(_tmpId,_tmpName,_tmpDescription,_tmpCIndex,_tmpImageName,_tmpKey_search,_tmpModified_time);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<UtensilEntityConvert> getUtensilEntity() {
    final String _sql = "SELECT  * FROM utensilEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"utensilEntity"}, false, new Callable<UtensilEntityConvert>() {
      @Override
      public UtensilEntityConvert call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfListConTent = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final UtensilEntityConvert _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpListConTent;
            _tmpListConTent = _cursor.getString(_cursorIndexOfListConTent);
            _result = new UtensilEntityConvert(_tmpId,_tmpListConTent);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getSelectPlace(final String id, final Continuation<? super SelectPlace> p1) {
    final String _sql = "SELECT  * FROM selectPlace WHERE id= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<SelectPlace>() {
      @Override
      public SelectPlace call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfListConTent = CursorUtil.getColumnIndexOrThrow(_cursor, "listConTent");
          final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final SelectPlace _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final MutableLiveData<ArrayList<PostContentEntity>> _tmpListConTent;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfListConTent);
            _tmpListConTent = __sourceTypeConverter.jsonToList(_tmp);
            final ImagePicker _tmpAvatar;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfAvatar);
            _tmpAvatar = __sourceTypeConverter.jsonToObject(_tmp_1);
            final LocationEntity _tmpLocation;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfLocation);
            _tmpLocation = __sourceTypeConverter.jsonToObjectLocation(_tmp_2);
            _result = new SelectPlace(_tmpId,_tmpTitle,_tmpListConTent,_tmpAvatar,_tmpLocation);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getSelectUtensils(final String id, final Continuation<? super SelectUtensils> p1) {
    final String _sql = "SELECT  * FROM selectUtensils WHERE id= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<SelectUtensils>() {
      @Override
      public SelectUtensils call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfListConTent = CursorUtil.getColumnIndexOrThrow(_cursor, "listConTent");
          final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final int _cursorIndexOfUtensils = CursorUtil.getColumnIndexOrThrow(_cursor, "utensils");
          final SelectUtensils _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final MutableLiveData<ArrayList<PostContentEntity>> _tmpListConTent;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfListConTent);
            _tmpListConTent = __sourceTypeConverter.jsonToList(_tmp);
            final ImagePicker _tmpAvatar;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfAvatar);
            _tmpAvatar = __sourceTypeConverter.jsonToObject(_tmp_1);
            final UtensilsEntity _tmpUtensils;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfUtensils);
            _tmpUtensils = __sourceTypeConverter.jsonToObjectUtensils(_tmp_2);
            _result = new SelectUtensils(_tmpId,_tmpTitle,_tmpListConTent,_tmpAvatar,_tmpUtensils);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<Reminders>> getReminders() {
    final String _sql = "SELECT * FROM reminders ORDER BY _id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"reminders"}, false, new Callable<List<Reminders>>() {
      @Override
      public List<Reminders> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfReminderIndentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_identifier");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfRepeat = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat");
          final int _cursorIndexOfRepeatValue = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_value");
          final int _cursorIndexOfRepeatUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_unit");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final List<Reminders> _result = new ArrayList<Reminders>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Reminders _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpReminderIndentifier;
            _tmpReminderIndentifier = _cursor.getString(_cursorIndexOfReminderIndentifier);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpContent;
            _tmpContent = _cursor.getString(_cursorIndexOfContent);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            final String _tmpTime;
            _tmpTime = _cursor.getString(_cursorIndexOfTime);
            final boolean _tmpRepeat;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfRepeat);
            _tmpRepeat = _tmp != 0;
            final int _tmpRepeatValue;
            _tmpRepeatValue = _cursor.getInt(_cursorIndexOfRepeatValue);
            final String _tmpRepeatUnit;
            _tmpRepeatUnit = _cursor.getString(_cursorIndexOfRepeatUnit);
            final boolean _tmpIsActive;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_1 != 0;
            _item = new Reminders(_tmpId,_tmpReminderIndentifier,_tmpTitle,_tmpContent,_tmpDate,_tmpTime,_tmpRepeat,_tmpRepeatValue,_tmpRepeatUnit,_tmpIsActive);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<Reminders> getRemindersList() {
    final String _sql = "SELECT * FROM reminders ORDER BY _id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfReminderIndentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_identifier");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final int _cursorIndexOfRepeat = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat");
      final int _cursorIndexOfRepeatValue = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_value");
      final int _cursorIndexOfRepeatUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_unit");
      final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
      final List<Reminders> _result = new ArrayList<Reminders>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Reminders _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpReminderIndentifier;
        _tmpReminderIndentifier = _cursor.getString(_cursorIndexOfReminderIndentifier);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpContent;
        _tmpContent = _cursor.getString(_cursorIndexOfContent);
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        final String _tmpTime;
        _tmpTime = _cursor.getString(_cursorIndexOfTime);
        final boolean _tmpRepeat;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfRepeat);
        _tmpRepeat = _tmp != 0;
        final int _tmpRepeatValue;
        _tmpRepeatValue = _cursor.getInt(_cursorIndexOfRepeatValue);
        final String _tmpRepeatUnit;
        _tmpRepeatUnit = _cursor.getString(_cursorIndexOfRepeatUnit);
        final boolean _tmpIsActive;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsActive);
        _tmpIsActive = _tmp_1 != 0;
        _item = new Reminders(_tmpId,_tmpReminderIndentifier,_tmpTitle,_tmpContent,_tmpDate,_tmpTime,_tmpRepeat,_tmpRepeatValue,_tmpRepeatUnit,_tmpIsActive);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object getReminderById(final int reminderId, final Continuation<? super Reminders> p1) {
    final String _sql = "SELECT * FROM reminders WHERE _id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, reminderId);
    return CoroutinesRoom.execute(__db, false, new Callable<Reminders>() {
      @Override
      public Reminders call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfReminderIndentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_identifier");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfRepeat = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat");
          final int _cursorIndexOfRepeatValue = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_value");
          final int _cursorIndexOfRepeatUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_unit");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final Reminders _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpReminderIndentifier;
            _tmpReminderIndentifier = _cursor.getString(_cursorIndexOfReminderIndentifier);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpContent;
            _tmpContent = _cursor.getString(_cursorIndexOfContent);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            final String _tmpTime;
            _tmpTime = _cursor.getString(_cursorIndexOfTime);
            final boolean _tmpRepeat;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfRepeat);
            _tmpRepeat = _tmp != 0;
            final int _tmpRepeatValue;
            _tmpRepeatValue = _cursor.getInt(_cursorIndexOfRepeatValue);
            final String _tmpRepeatUnit;
            _tmpRepeatUnit = _cursor.getString(_cursorIndexOfRepeatUnit);
            final boolean _tmpIsActive;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_1 != 0;
            _result = new Reminders(_tmpId,_tmpReminderIndentifier,_tmpTitle,_tmpContent,_tmpDate,_tmpTime,_tmpRepeat,_tmpRepeatValue,_tmpRepeatUnit,_tmpIsActive);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getLatestReminder(final Continuation<? super Reminders> p0) {
    final String _sql = "SELECT * FROM reminders ORDER BY _id DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<Reminders>() {
      @Override
      public Reminders call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfReminderIndentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_identifier");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfRepeat = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat");
          final int _cursorIndexOfRepeatValue = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_value");
          final int _cursorIndexOfRepeatUnit = CursorUtil.getColumnIndexOrThrow(_cursor, "repeat_unit");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final Reminders _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpReminderIndentifier;
            _tmpReminderIndentifier = _cursor.getString(_cursorIndexOfReminderIndentifier);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpContent;
            _tmpContent = _cursor.getString(_cursorIndexOfContent);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            final String _tmpTime;
            _tmpTime = _cursor.getString(_cursorIndexOfTime);
            final boolean _tmpRepeat;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfRepeat);
            _tmpRepeat = _tmp != 0;
            final int _tmpRepeatValue;
            _tmpRepeatValue = _cursor.getInt(_cursorIndexOfRepeatValue);
            final String _tmpRepeatUnit;
            _tmpRepeatUnit = _cursor.getString(_cursorIndexOfRepeatUnit);
            final boolean _tmpIsActive;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_1 != 0;
            _result = new Reminders(_tmpId,_tmpReminderIndentifier,_tmpTitle,_tmpContent,_tmpDate,_tmpTime,_tmpRepeat,_tmpRepeatValue,_tmpRepeatUnit,_tmpIsActive);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
