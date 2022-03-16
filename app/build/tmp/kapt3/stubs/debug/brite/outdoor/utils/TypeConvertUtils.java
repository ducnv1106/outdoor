package brite.outdoor.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lbrite/outdoor/utils/TypeConvertUtils;", "", "()V", "SourceTypeConverter", "app_debug"})
public final class TypeConvertUtils {
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.utils.TypeConvertUtils INSTANCE = null;
    
    private TypeConvertUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J&\u0010\u0010\u001a\u00020\t2\u001c\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004H\u0007J\u0012\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0007\u00a8\u0006\u0018"}, d2 = {"Lbrite/outdoor/utils/TypeConvertUtils$SourceTypeConverter;", "", "()V", "jsonToList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/PostContentEntity;", "Lkotlin/collections/ArrayList;", "source", "", "jsonToObject", "Lbrite/outdoor/data/entities/ImagePicker;", "jsonToObjectLocation", "Lbrite/outdoor/data/entities/LocationEntity;", "jsonToObjectUtensils", "Lbrite/outdoor/data/entities/UtensilsEntity;", "listToJson", "list", "objectLocationToJson", "locationEntity", "objectToJson", "data", "objectUtensilsToJson", "utensils", "app_debug"})
    public static final class SourceTypeConverter {
        
        @org.jetbrains.annotations.NotNull()
        @androidx.room.TypeConverter()
        public final java.lang.String listToJson(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> list) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.room.TypeConverter()
        public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> jsonToList(@org.jetbrains.annotations.Nullable()
        java.lang.String source) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.room.TypeConverter()
        public final java.lang.String objectToJson(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.entities.ImagePicker data) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @androidx.room.TypeConverter()
        public final brite.outdoor.data.entities.ImagePicker jsonToObject(@org.jetbrains.annotations.Nullable()
        java.lang.String source) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.room.TypeConverter()
        public final java.lang.String objectUtensilsToJson(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.entities.UtensilsEntity utensils) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @androidx.room.TypeConverter()
        public final brite.outdoor.data.entities.UtensilsEntity jsonToObjectUtensils(@org.jetbrains.annotations.Nullable()
        java.lang.String source) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.room.TypeConverter()
        public final java.lang.String objectLocationToJson(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.entities.LocationEntity locationEntity) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @androidx.room.TypeConverter()
        public final brite.outdoor.data.entities.LocationEntity jsonToObjectLocation(@org.jetbrains.annotations.Nullable()
        java.lang.String source) {
            return null;
        }
        
        public SourceTypeConverter() {
            super();
        }
    }
}