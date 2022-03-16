package brite.outdoor.data.api_entities.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseListLocation;", "", "()V", "LocationData", "LocationResponse", "LocationResult", "app_debug"})
public final class ResponseListLocation {
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.data.api_entities.response.ResponseListLocation INSTANCE = null;
    
    private ResponseListLocation() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseListLocation$LocationResult;", "Lbrite/outdoor/data/api_entities/response/BaseApiResult;", "()V", "app_debug"})
    public static final class LocationResult extends brite.outdoor.data.api_entities.response.BaseApiResult {
        
        public LocationResult() {
            super(null);
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B(\u0012\r\u0010\u0002\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\b\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\b\u0004H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ7\u0010\u0014\u001a\u00020\u00002\u000f\b\u0002\u0010\u0002\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\b\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001dJ\t\u0010\u001e\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\bH\u00d6\u0001R\u0018\u0010\u0002\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\b\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006%"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseListLocation$LocationResponse;", "Landroid/os/Parcelable;", "data", "", "Lkotlinx/android/parcel/RawValue;", "url_prefix", "", "total", "", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)V", "getData", "()Ljava/lang/Object;", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl_prefix", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)Lbrite/outdoor/data/api_entities/response/ResponseListLocation$LocationResponse;", "describeContents", "equals", "", "other", "getListData", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseListLocation$LocationData;", "Lkotlin/collections/ArrayList;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class LocationResponse implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object data = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url_prefix = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer total = null;
        public static final android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationResponse> CREATOR = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> getListData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl_prefix() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTotal() {
            return null;
        }
        
        public LocationResponse(@org.jetbrains.annotations.Nullable()
        java.lang.Object data, @org.jetbrains.annotations.Nullable()
        java.lang.String url_prefix, @org.jetbrains.annotations.Nullable()
        java.lang.Integer total) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.data.api_entities.response.ResponseListLocation.LocationResponse copy(@org.jetbrains.annotations.Nullable()
        java.lang.Object data, @org.jetbrains.annotations.Nullable()
        java.lang.String url_prefix, @org.jetbrains.annotations.Nullable()
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
        public static final class Creator implements android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationResponse> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseListLocation.LocationResponse[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseListLocation.LocationResponse createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
    
    @androidx.room.Entity(tableName = "location")
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003Jo\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005H\u00c6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\u0006\u0010(\u001a\u00020)J\u001a\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010+j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`,J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001J\t\u0010.\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011\u00a8\u00064"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseListLocation$LocationData;", "Landroid/os/Parcelable;", "id", "", "name", "", "imageName", "description", "cIndex", "lat", "lng", "key_search", "modified_time", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCIndex", "()I", "getDescription", "()Ljava/lang/String;", "getId", "getImageName", "getKey_search", "getLat", "getLng", "getModified_time", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "getLastSync", "", "getListImage", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class LocationData implements android.os.Parcelable {
        @androidx.room.PrimaryKey(autoGenerate = false)
        private final int id = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String imageName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String description = null;
        private final int cIndex = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String lat = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String lng = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String key_search = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String modified_time = null;
        public static final android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> CREATOR = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<java.lang.String> getListImage() {
            return null;
        }
        
        public final long getLastSync() {
            return 0L;
        }
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImageName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        public final int getCIndex() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLat() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLng() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getKey_search() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getModified_time() {
            return null;
        }
        
        public LocationData(int id, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String imageName, @org.jetbrains.annotations.Nullable()
        java.lang.String description, int cIndex, @org.jetbrains.annotations.Nullable()
        java.lang.String lat, @org.jetbrains.annotations.Nullable()
        java.lang.String lng, @org.jetbrains.annotations.Nullable()
        java.lang.String key_search, @org.jetbrains.annotations.NotNull()
        java.lang.String modified_time) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        public final int component5() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData copy(int id, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String imageName, @org.jetbrains.annotations.Nullable()
        java.lang.String description, int cIndex, @org.jetbrains.annotations.Nullable()
        java.lang.String lat, @org.jetbrains.annotations.Nullable()
        java.lang.String lng, @org.jetbrains.annotations.Nullable()
        java.lang.String key_search, @org.jetbrains.annotations.NotNull()
        java.lang.String modified_time) {
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
        public static final class Creator implements android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
}