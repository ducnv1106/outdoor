package brite.outdoor.data.api_entities.response;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u001e\u0012\r\u0010\u0002\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\b\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\b\u0004H\u00c6\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00002\u000f\b\u0002\u0010\u0002\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\b\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u00d6\u0001R\u0018\u0010\u0002\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\b\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\""}, d2 = {"Lbrite/outdoor/data/api_entities/response/ListPostUserResponse;", "Landroid/os/Parcelable;", "data", "", "Lkotlinx/android/parcel/RawValue;", "total", "", "(Ljava/lang/Object;Ljava/lang/Integer;)V", "getData", "()Ljava/lang/Object;", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Integer;)Lbrite/outdoor/data/api_entities/response/ListPostUserResponse;", "describeContents", "equals", "", "other", "getListData", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "Lkotlin/collections/ArrayList;", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class ListPostUserResponse implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer total = null;
    public static final int STATE_USER = 1;
    public static final int STATE_UNFOLLOW = 2;
    public static final int STATE_FOLLOW = 3;
    public static final boolean STATE_UNLIKE = false;
    public static final boolean STATE_LIKE = true;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.data.api_entities.response.ListPostUserResponse.Companion Companion = null;
    public static final android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ListPostUserResponse> CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ListPostUserData> getListData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal() {
        return null;
    }
    
    public ListPostUserResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Object data, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.data.api_entities.response.ListPostUserResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.Object data, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ListPostUserResponse> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final brite.outdoor.data.api_entities.response.ListPostUserResponse[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final brite.outdoor.data.api_entities.response.ListPostUserResponse createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ListPostUserResponse$Companion;", "", "()V", "STATE_FOLLOW", "", "STATE_LIKE", "", "STATE_UNFOLLOW", "STATE_UNLIKE", "STATE_USER", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}