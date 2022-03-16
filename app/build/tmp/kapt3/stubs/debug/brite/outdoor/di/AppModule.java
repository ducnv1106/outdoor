package brite.outdoor.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lbrite/outdoor/di/AppModule;", "", "()V", "TIMEOUT", "", "provideApiController", "Lbrite/outdoor/data/remote/ApiController;", "apiService", "Lbrite/outdoor/data/remote/CallApiService;", "provideAppDap", "Lbrite/outdoor/data/local/room/AppDao;", "database", "Lbrite/outdoor/data/local/room/AppDatabase;", "provideCharacterService", "retrofit", "Lretrofit2/Retrofit;", "provideDatabase", "appContext", "Landroid/content/Context;", "provideGson", "Lcom/google/gson/Gson;", "provideRetrofit", "gson", "app_debug"})
@dagger.Module()
public final class AppModule {
    public static final int TIMEOUT = 60;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final brite.outdoor.data.remote.CallApiService provideCharacterService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final brite.outdoor.data.remote.ApiController provideApiController(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.CallApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final brite.outdoor.data.local.room.AppDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final brite.outdoor.data.local.room.AppDao provideAppDap(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.local.room.AppDatabase database) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}