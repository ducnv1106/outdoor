package brite.outdoor.data.api_entities.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseListCamping;", "", "()V", "ListCampingData", "ListCampingResponse", "ListCampingResult", "app_debug"})
public final class ResponseListCamping {
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.data.api_entities.response.ResponseListCamping INSTANCE = null;
    
    private ResponseListCamping() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingResult;", "Lbrite/outdoor/data/api_entities/response/BaseApiResult;", "()V", "app_debug"})
    public static final class ListCampingResult extends brite.outdoor.data.api_entities.response.BaseApiResult {
        
        public ListCampingResult() {
            super(null);
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B(\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\r\u0010\u0004\u001a\t\u0018\u00010\u0005\u00a2\u0006\u0002\b\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\t\u0018\u00010\u0005\u00a2\u0006\u0002\b\u0006H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u00c6\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000f\b\u0002\u0010\u0004\u001a\t\u0018\u00010\u0005\u00a2\u0006\u0002\b\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00d6\u0003J\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001dJ\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\bH\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0004\u001a\t\u0018\u00010\u0005\u00a2\u0006\u0002\b\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006%"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingResponse;", "Landroid/os/Parcelable;", "total", "", "data", "", "Lkotlinx/android/parcel/RawValue;", "url_prefix", "", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl_prefix", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;)Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingResponse;", "describeContents", "equals", "", "other", "getListData", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;", "Lkotlin/collections/ArrayList;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class ListCampingResponse implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer total = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object data = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url_prefix = null;
        public static final android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingResponse> CREATOR = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> getListData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTotal() {
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
        
        public ListCampingResponse(@org.jetbrains.annotations.Nullable()
        java.lang.Integer total, @org.jetbrains.annotations.Nullable()
        java.lang.Object data, @org.jetbrains.annotations.Nullable()
        java.lang.String url_prefix) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingResponse copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer total, @org.jetbrains.annotations.Nullable()
        java.lang.Object data, @org.jetbrains.annotations.Nullable()
        java.lang.String url_prefix) {
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
        public static final class Creator implements android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingResponse> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingResponse[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingResponse createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b9\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u00102\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u009a\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010=J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u00d6\u0003J\u001a\u0010C\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010Dj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`EJ\t\u0010F\u001a\u00020\u0003H\u00d6\u0001J\t\u0010G\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0012\"\u0004\b\'\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014\u00a8\u0006M"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;", "Landroid/os/Parcelable;", "id", "", "id_loactions", "name", "", "address", "description", "imageName", "lat", "lng", "plans_note", "plans_status", "plans_time", "has_plans", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getHas_plans", "()Ljava/lang/Integer;", "setHas_plans", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getId", "()I", "setId", "(I)V", "getId_loactions", "setId_loactions", "getImageName", "setImageName", "getLat", "setLat", "getLng", "setLng", "getName", "setName", "getPlans_note", "setPlans_note", "getPlans_status", "setPlans_status", "getPlans_time", "setPlans_time", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;", "describeContents", "equals", "", "other", "", "getListImage", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class ListCampingData implements android.os.Parcelable {
        private int id;
        private int id_loactions;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String address;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String description;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String imageName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String lat;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String lng;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String plans_note;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer plans_status;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String plans_time;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer has_plans;
        public static final android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> CREATOR = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<java.lang.String> getListImage() {
            return null;
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        public final int getId_loactions() {
            return 0;
        }
        
        public final void setId_loactions(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddress() {
            return null;
        }
        
        public final void setAddress(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImageName() {
            return null;
        }
        
        public final void setImageName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLat() {
            return null;
        }
        
        public final void setLat(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLng() {
            return null;
        }
        
        public final void setLng(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPlans_note() {
            return null;
        }
        
        public final void setPlans_note(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPlans_status() {
            return null;
        }
        
        public final void setPlans_status(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPlans_time() {
            return null;
        }
        
        public final void setPlans_time(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getHas_plans() {
            return null;
        }
        
        public final void setHas_plans(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        public ListCampingData(int id, int id_loactions, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String address, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String imageName, @org.jetbrains.annotations.Nullable()
        java.lang.String lat, @org.jetbrains.annotations.Nullable()
        java.lang.String lng, @org.jetbrains.annotations.Nullable()
        java.lang.String plans_note, @org.jetbrains.annotations.Nullable()
        java.lang.Integer plans_status, @org.jetbrains.annotations.Nullable()
        java.lang.String plans_time, @org.jetbrains.annotations.Nullable()
        java.lang.Integer has_plans) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component12() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData copy(int id, int id_loactions, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String address, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String imageName, @org.jetbrains.annotations.Nullable()
        java.lang.String lat, @org.jetbrains.annotations.Nullable()
        java.lang.String lng, @org.jetbrains.annotations.Nullable()
        java.lang.String plans_note, @org.jetbrains.annotations.Nullable()
        java.lang.Integer plans_status, @org.jetbrains.annotations.Nullable()
        java.lang.String plans_time, @org.jetbrains.annotations.Nullable()
        java.lang.Integer has_plans) {
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
        public static final class Creator implements android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
}