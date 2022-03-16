package brite.outdoor.data.local.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00120\u0011H\'J\u0010\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011H\'J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00120\u0011H\'J\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012H\'J\u001b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0010\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0011H\'J \u0010&\u001a\u00020\u00032\u0016\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020\u00130(j\b\u0012\u0004\u0012\u00020\u0013`)H\'J \u0010*\u001a\u00020\u00032\u0016\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020\u00150(j\b\u0012\u0004\u0012\u00020\u0015`)H\'J\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\'J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020\u0017H\'J\u0016\u0010/\u001a\u00020\u00032\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0017J\u0016\u00101\u001a\u00020\u00032\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0017J\u0019\u00102\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u0019\u00104\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u00105\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020!H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u0019\u00107\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020#H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020,0\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\'J\u0010\u0010:\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020%H\'J\u0019\u0010;\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0010\u0010<\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0013H\'J\u0019\u0010=\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0010\u0010>\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0015H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006?"}, d2 = {"Lbrite/outdoor/data/local/room/AppDao;", "", "clearAllreminders", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "reminder", "Lbrite/outdoor/entity/Reminders;", "(Lbrite/outdoor/entity/Reminders;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePushPost", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSelectPlace", "deleteSelectUtensils", "getLatestReminder", "getListLocation", "Landroidx/lifecycle/LiveData;", "", "Lbrite/outdoor/data/api_entities/response/ResponseListLocation$LocationData;", "getListUtensils", "Lbrite/outdoor/data/api_entities/response/ResponseListUtensils$UtensilsData;", "getLocationEntity", "Lbrite/outdoor/data/entities/LocationEntityConvert;", "getPushPosts", "Lbrite/outdoor/data/api_entities/response/ResponsePushPosts$PushPostsResponse;", "getReminderById", "reminderId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReminders", "getRemindersList", "getSelectPlace", "Lbrite/outdoor/data/entities/SelectPlace;", "getSelectUtensils", "Lbrite/outdoor/data/entities/SelectUtensils;", "getUtensilEntity", "Lbrite/outdoor/data/entities/UtensilEntityConvert;", "insertListLocation", "info", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "insertListUtensils", "insertLocation", "", "obj", "insertLocationEntity", "insertOrUpdateLocation", "objList", "insertOrUpdateUtensils", "insertPushPosts", "(Lbrite/outdoor/data/api_entities/response/ResponsePushPosts$PushPostsResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertReminder", "insertSelectPlace", "(Lbrite/outdoor/data/entities/SelectPlace;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSelectUtensils", "(Lbrite/outdoor/data/entities/SelectUtensils;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertUtensil", "insertUtensilEntity", "isCheckId", "updateLocation", "updateReminder", "updateUtensil", "app_debug"})
public abstract interface AppDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertPushPosts(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.api_entities.response.ResponsePushPosts.PushPostsResponse info, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT  * FROM pushPostsResponse WHERE id= :id")
    public abstract java.lang.Object getPushPosts(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super brite.outdoor.data.api_entities.response.ResponsePushPosts.PushPostsResponse> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM pushPostsResponse WHERE id = :id")
    public abstract java.lang.Object deletePushPost(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = " SELECT EXISTS(SELECT * from pushPostsResponse WHERE id= :id)")
    public abstract java.lang.Object isCheckId(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p1);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertListLocation(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> info);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertLocationEntity(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.LocationEntityConvert info);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT  * FROM locationEntity")
    public abstract androidx.lifecycle.LiveData<brite.outdoor.data.entities.LocationEntityConvert> getLocationEntity();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.util.List<java.lang.Long> insertLocation(@org.jetbrains.annotations.NotNull()
    java.util.List<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> obj);
    
    @androidx.room.Update()
    public abstract void updateLocation(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData obj);
    
    @androidx.room.Transaction()
    public abstract void insertOrUpdateLocation(@org.jetbrains.annotations.NotNull()
    java.util.List<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> objList);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT  * FROM location")
    public abstract androidx.lifecycle.LiveData<java.util.List<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData>> getListLocation();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertUtensilEntity(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.UtensilEntityConvert info);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertListUtensils(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData> info);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.util.List<java.lang.Long> insertUtensil(@org.jetbrains.annotations.NotNull()
    java.util.List<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData> obj);
    
    @androidx.room.Update()
    public abstract void updateUtensil(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData obj);
    
    @androidx.room.Transaction()
    public abstract void insertOrUpdateUtensils(@org.jetbrains.annotations.NotNull()
    java.util.List<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData> objList);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT  * FROM utensils")
    public abstract androidx.lifecycle.LiveData<java.util.List<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData>> getListUtensils();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT  * FROM utensilEntity")
    public abstract androidx.lifecycle.LiveData<brite.outdoor.data.entities.UtensilEntityConvert> getUtensilEntity();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertSelectPlace(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.SelectPlace info, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT  * FROM selectPlace WHERE id= :id")
    public abstract java.lang.Object getSelectPlace(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super brite.outdoor.data.entities.SelectPlace> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM selectPlace WHERE id = :id")
    public abstract java.lang.Object deleteSelectPlace(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertSelectUtensils(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.SelectUtensils info, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT  * FROM selectUtensils WHERE id= :id")
    public abstract java.lang.Object getSelectUtensils(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super brite.outdoor.data.entities.SelectUtensils> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM selectUtensils WHERE id = :id")
    public abstract java.lang.Object deleteSelectUtensils(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM reminders ORDER BY _id DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<brite.outdoor.entity.Reminders>> getReminders();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM reminders ORDER BY _id DESC")
    public abstract java.util.List<brite.outdoor.entity.Reminders> getRemindersList();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM reminders WHERE _id = :reminderId")
    public abstract java.lang.Object getReminderById(int reminderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super brite.outdoor.entity.Reminders> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertReminder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.entity.Reminders reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateReminder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.entity.Reminders reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    brite.outdoor.entity.Reminders reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM reminders")
    public abstract java.lang.Object clearAllreminders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM reminders ORDER BY _id DESC LIMIT 1")
    public abstract java.lang.Object getLatestReminder(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super brite.outdoor.entity.Reminders> p0);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void insertOrUpdateLocation(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.local.room.AppDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> objList) {
        }
        
        @androidx.room.Transaction()
        public static void insertOrUpdateUtensils(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.local.room.AppDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData> objList) {
        }
    }
}