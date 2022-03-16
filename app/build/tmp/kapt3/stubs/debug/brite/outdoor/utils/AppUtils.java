package brite.outdoor.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lbrite/outdoor/utils/AppUtils;", "", "()V", "Companion", "app_debug"})
public final class AppUtils {
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.utils.AppUtils.Companion Companion = null;
    
    public AppUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0018\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004\u00a8\u0006\u001b"}, d2 = {"Lbrite/outdoor/utils/AppUtils$Companion;", "", "()V", "getAndroidId", "", "context", "Landroid/content/Context;", "getPathUrlThumbnail", "fileName", "getRealPathFromURI", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "hideKeyboard", "", "view", "Landroid/view/View;", "isFormatImage", "", "isFormatVideo", "isVideo", "parseInt", "", "value", "NullStringToEmptyAdapterFactory", "StringAdapter", "app_debug"})
    public static final class Companion {
        
        public final int parseInt(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        @android.annotation.SuppressLint(value = {"HardwareIds"})
        public final java.lang.String getAndroidId(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return null;
        }
        
        public final void hideKeyboard(@org.jetbrains.annotations.Nullable()
        android.view.View view) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRealPathFromURI(@org.jetbrains.annotations.Nullable()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
            return null;
        }
        
        public final boolean isVideo(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName) {
            return false;
        }
        
        public final boolean isFormatVideo(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName) {
            return false;
        }
        
        public final boolean isFormatImage(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName) {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPathUrlThumbnail(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J0\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u0005\"\u0004\b\u0001\u0010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lbrite/outdoor/utils/AppUtils$Companion$NullStringToEmptyAdapterFactory;", "T", "Lcom/google/gson/TypeAdapterFactory;", "()V", "create", "Lcom/google/gson/TypeAdapter;", "gson", "Lcom/google/gson/Gson;", "type", "Lcom/google/gson/reflect/TypeToken;", "app_debug"})
        public static final class NullStringToEmptyAdapterFactory<T extends java.lang.Object> implements com.google.gson.TypeAdapterFactory {
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public <T extends java.lang.Object>com.google.gson.TypeAdapter<T> create(@org.jetbrains.annotations.Nullable()
            com.google.gson.Gson gson, @org.jetbrains.annotations.Nullable()
            com.google.gson.reflect.TypeToken<T> type) {
                return null;
            }
            
            public NullStringToEmptyAdapterFactory() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\f"}, d2 = {"Lbrite/outdoor/utils/AppUtils$Companion$StringAdapter;", "Lcom/google/gson/TypeAdapter;", "", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "writer", "Lcom/google/gson/stream/JsonWriter;", "value", "app_debug"})
        public static final class StringAdapter extends com.google.gson.TypeAdapter<java.lang.String> {
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.String read(@org.jetbrains.annotations.Nullable()
            com.google.gson.stream.JsonReader reader) {
                return null;
            }
            
            @java.lang.Override()
            public void write(@org.jetbrains.annotations.Nullable()
            com.google.gson.stream.JsonWriter writer, @org.jetbrains.annotations.Nullable()
            java.lang.String value) {
            }
            
            public StringAdapter() {
                super();
            }
        }
    }
}