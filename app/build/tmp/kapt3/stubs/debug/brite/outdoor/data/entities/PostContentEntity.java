package brite.outdoor.data.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006\u00a2\u0006\u0002\u0010\nB5\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006\u00a2\u0006\u0002\u0010\rB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lbrite/outdoor/data/entities/PostContentEntity;", "Ljava/io/Serializable;", "()V", "content", "", "listImg", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/ImagePicker;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Landroidx/lifecycle/MutableLiveData;)V", "id", "", "(ILjava/lang/String;Landroidx/lifecycle/MutableLiveData;)V", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "setContent", "getId", "()I", "setId", "(I)V", "getListImg", "()Landroidx/lifecycle/MutableLiveData;", "setListImg", "(Landroidx/lifecycle/MutableLiveData;)V", "app_debug"})
public final class PostContentEntity implements java.io.Serializable {
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String content = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.ImagePicker>> listImg;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.ImagePicker>> getListImg() {
        return null;
    }
    
    public final void setListImg(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.ImagePicker>> p0) {
    }
    
    public PostContentEntity() {
        super();
    }
    
    public PostContentEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.ImagePicker>> listImg) {
        super();
    }
    
    public PostContentEntity(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.ImagePicker>> listImg) {
        super();
    }
    
    public PostContentEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String content) {
        super();
    }
}