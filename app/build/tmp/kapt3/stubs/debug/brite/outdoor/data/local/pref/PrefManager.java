package brite.outdoor.data.local.pref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0013\u001a\u00020\u00112\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0015j\b\u0012\u0004\u0012\u00020\u0006`\u0016J\u0006\u0010\u0017\u001a\u00020\u0011J\u001f\u0010\u0018\u001a\u00020\u00112\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0019\"\u00020\u001a\u00a2\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00112\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u0015j\b\u0012\u0004\u0012\u00020\u001d`\u0016J\u001e\u0010\u001e\u001a\u00020\u00112\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u0015j\b\u0012\u0004\u0012\u00020\u001f`\u0016J\u0016\u0010 \u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010\"\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\nJ\u001f\u0010#\u001a\u00020\u00112\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u0019\"\u00020\u001d\u00a2\u0006\u0002\u0010$J\u0016\u0010#\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\fJ\u0016\u0010%\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u000eJ\u001f\u0010&\u001a\u00020\u00112\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u0019\"\u00020\u001f\u00a2\u0006\u0002\u0010\'J\u0016\u0010(\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006\u00a8\u0006*"}, d2 = {"Lbrite/outdoor/data/local/pref/PrefManager;", "", "()V", "containsKey", "", "key", "", "getBoolean", "keyDefault", "getFloat", "", "getInt", "", "getLong", "", "getString", "releaseMemory", "", "releaseMemoryFromKey", "releaseMemoryFromKeys", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "releaseUserDataWhenLogout", "writeArr", "", "Lbrite/outdoor/data/local/pref/PrefEntity;", "([Lbrite/outdoor/data/local/pref/PrefEntity;)V", "writeArrInt", "Lbrite/outdoor/data/local/pref/PrefInt;", "writeArrStr", "Lbrite/outdoor/data/local/pref/PrefStr;", "writeBoolean", "holder", "writeFloat", "writeInt", "([Lbrite/outdoor/data/local/pref/PrefInt;)V", "writeLong", "writeStr", "([Lbrite/outdoor/data/local/pref/PrefStr;)V", "writeString", "Companion", "app_debug"})
public final class PrefManager {
    private static final java.lang.String PREF_NAME = "_App_Pref";
    private static brite.outdoor.data.local.pref.PrefManager mInstance;
    private static final java.lang.String masterKeyAlias = null;
    private static android.content.SharedPreferences mSettings;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.data.local.pref.PrefManager.Companion Companion = null;
    
    public final void writeArr(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.local.pref.PrefEntity... list) {
    }
    
    public final void writeBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean holder) {
    }
    
    public final void writeLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long holder) {
    }
    
    public final void writeFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float holder) {
    }
    
    public final void writeInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int holder) {
    }
    
    public final void writeInt(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.local.pref.PrefInt... list) {
    }
    
    public final void writeArrInt(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.local.pref.PrefInt> list) {
    }
    
    public final void writeString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String holder) {
    }
    
    public final void writeStr(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.local.pref.PrefStr... list) {
    }
    
    public final void writeArrStr(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.local.pref.PrefStr> list) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String keyDefault) {
        return null;
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean keyDefault) {
        return false;
    }
    
    public final long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0L;
    }
    
    public final long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long keyDefault) {
        return 0L;
    }
    
    public final float getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0.0F;
    }
    
    public final float getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float keyDefault) {
        return 0.0F;
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int keyDefault) {
        return 0;
    }
    
    public final boolean containsKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    public final void releaseMemoryFromKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public final void releaseMemoryFromKeys(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> list) {
    }
    
    public final void releaseMemory() {
    }
    
    public final void releaseUserDataWhenLogout() {
    }
    
    public PrefManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbrite/outdoor/data/local/pref/PrefManager$Companion;", "", "()V", "PREF_NAME", "", "mInstance", "Lbrite/outdoor/data/local/pref/PrefManager;", "mSettings", "Landroid/content/SharedPreferences;", "masterKeyAlias", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.data.local.pref.PrefManager getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}