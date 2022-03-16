package brite.outdoor.data.entities;

import java.lang.System;

@androidx.room.TypeConverters(value = {brite.outdoor.utils.TypeConvertUtils.SourceTypeConverter.class})
@androidx.room.Entity(tableName = "selectUtensils")
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u001e\b\u0002\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R,\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0019R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lbrite/outdoor/data/entities/SelectUtensils;", "", "id", "", "title", "listConTent", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/PostContentEntity;", "Lkotlin/collections/ArrayList;", "avatar", "Lbrite/outdoor/data/entities/ImagePicker;", "utensils", "Lbrite/outdoor/data/entities/UtensilsEntity;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/MutableLiveData;Lbrite/outdoor/data/entities/ImagePicker;Lbrite/outdoor/data/entities/UtensilsEntity;)V", "getAvatar", "()Lbrite/outdoor/data/entities/ImagePicker;", "setAvatar", "(Lbrite/outdoor/data/entities/ImagePicker;)V", "getId", "()Ljava/lang/String;", "getListConTent", "()Landroidx/lifecycle/MutableLiveData;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getUtensils", "()Lbrite/outdoor/data/entities/UtensilsEntity;", "setUtensils", "(Lbrite/outdoor/data/entities/UtensilsEntity;)V", "app_debug"})
public final class SelectUtensils {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "listConTent")
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> listConTent = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "avatar")
    private brite.outdoor.data.entities.ImagePicker avatar;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "utensils")
    private brite.outdoor.data.entities.UtensilsEntity utensils;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> getListConTent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.data.entities.ImagePicker getAvatar() {
        return null;
    }
    
    public final void setAvatar(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.entities.ImagePicker p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.data.entities.UtensilsEntity getUtensils() {
        return null;
    }
    
    public final void setUtensils(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.entities.UtensilsEntity p0) {
    }
    
    public SelectUtensils(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> listConTent, @org.jetbrains.annotations.Nullable()
    brite.outdoor.data.entities.ImagePicker avatar, @org.jetbrains.annotations.Nullable()
    brite.outdoor.data.entities.UtensilsEntity utensils) {
        super();
    }
}