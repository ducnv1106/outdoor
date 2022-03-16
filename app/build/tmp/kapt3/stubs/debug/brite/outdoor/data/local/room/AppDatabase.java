package brite.outdoor.data.local.room;

import java.lang.System;

@androidx.room.Database(entities = {brite.outdoor.data.api_entities.response.ResponsePushPosts.PushPostsResponse.class, brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData.class, brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData.class, brite.outdoor.data.entities.SelectPlace.class, brite.outdoor.data.entities.SelectUtensils.class, brite.outdoor.data.entities.LocationEntityConvert.class, brite.outdoor.data.entities.UtensilEntityConvert.class, brite.outdoor.entity.Reminders.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/data/local/room/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "appDao", "Lbrite/outdoor/data/local/room/AppDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static volatile brite.outdoor.data.local.room.AppDatabase instance;
    @org.jetbrains.annotations.NotNull()
    private static androidx.room.migration.Migration MIGRATION_1_TO_2;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.data.local.room.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract brite.outdoor.data.local.room.AppDao appDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbrite/outdoor/data/local/room/AppDatabase$Companion;", "", "()V", "MIGRATION_1_TO_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_TO_2", "()Landroidx/room/migration/Migration;", "setMIGRATION_1_TO_2", "(Landroidx/room/migration/Migration;)V", "instance", "Lbrite/outdoor/data/local/room/AppDatabase;", "buildDatabase", "appContext", "Landroid/content/Context;", "getDatabase", "context", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.data.local.room.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_1_TO_2() {
            return null;
        }
        
        public final void setMIGRATION_1_TO_2(@org.jetbrains.annotations.NotNull()
        androidx.room.migration.Migration p0) {
        }
        
        private final brite.outdoor.data.local.room.AppDatabase buildDatabase(android.content.Context appContext) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}