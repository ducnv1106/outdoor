package brite.outdoor.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u0011J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000b\u001a\u00020\fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010 \u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0016H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u001dH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u001fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0019\u0010(\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lbrite/outdoor/data/repository/AppRepository;", "", "localDataSource", "Lbrite/outdoor/data/local/room/AppDao;", "(Lbrite/outdoor/data/local/room/AppDao;)V", "delete", "", "reminder", "Lbrite/outdoor/entity/Reminders;", "(Lbrite/outdoor/entity/Reminders;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePost", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSelectPlace", "deleteSelectUtensils", "getAllReminders", "Landroidx/lifecycle/LiveData;", "", "getLatestReminder", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPushPosts", "Lbrite/outdoor/data/api_entities/response/ResponsePushPosts$PushPostsResponse;", "getReminderById", "reminderId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemindersList", "getSelectPlace", "Lbrite/outdoor/data/entities/SelectPlace;", "getSelectUtensils", "Lbrite/outdoor/data/entities/SelectUtensils;", "insert", "insertPost", "info", "(Lbrite/outdoor/data/api_entities/response/ResponsePushPosts$PushPostsResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSelectPlace", "(Lbrite/outdoor/data/entities/SelectPlace;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSelectUtensils", "(Lbrite/outdoor/data/entities/SelectUtensils;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public final class AppRepository {
    private final brite.outdoor.data.local.room.AppDao localDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object insertPost(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.api_entities.response.ResponsePushPosts.PushPostsResponse info, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object deletePost(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object getPushPosts(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super brite.outdoor.data.api_entities.response.ResponsePushPosts.PushPostsResponse> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object insertSelectPlace(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.SelectPlace info, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object deleteSelectPlace(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object getSelectPlace(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super brite.outdoor.data.entities.SelectPlace> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object insertSelectUtensils(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.SelectUtensils info, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object deleteSelectUtensils(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object getSelectUtensils(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super brite.outdoor.data.entities.SelectUtensils> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<brite.outdoor.entity.Reminders>> getAllReminders() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRemindersList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<brite.outdoor.entity.Reminders>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getReminderById(int reminderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super brite.outdoor.entity.Reminders> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLatestReminder(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super brite.outdoor.entity.Reminders> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    brite.outdoor.entity.Reminders reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    brite.outdoor.entity.Reminders reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    brite.outdoor.entity.Reminders reminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public AppRepository(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.local.room.AppDao localDataSource) {
        super();
    }
}