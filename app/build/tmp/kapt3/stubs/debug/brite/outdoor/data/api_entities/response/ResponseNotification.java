package brite.outdoor.data.api_entities.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseNotification;", "", "()V", "ListNotificationData", "NotificationResponse", "NotificationResult", "app_debug"})
public final class ResponseNotification {
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.data.api_entities.response.ResponseNotification INSTANCE = null;
    
    private ResponseNotification() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseNotification$NotificationResult;", "Lbrite/outdoor/data/api_entities/response/BaseApiResult;", "()V", "app_debug"})
    public static final class NotificationResult extends brite.outdoor.data.api_entities.response.BaseApiResult {
        
        public NotificationResult() {
            super(null);
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\r\u0010\u0004\u001a\t\u0018\u00010\u0005\u00a2\u0006\u0002\b\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0011\u001a\t\u0018\u00010\u0005\u00a2\u0006\u0002\b\u0006H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000f\b\u0002\u0010\u0004\u001a\t\u0018\u00010\u0005\u00a2\u0006\u0002\b\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00d6\u0003J\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001bJ\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0004\u001a\t\u0018\u00010\u0005\u00a2\u0006\u0002\b\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006#"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseNotification$NotificationResponse;", "Landroid/os/Parcelable;", "total", "", "data", "", "Lkotlinx/android/parcel/RawValue;", "url_prefix_avatar", "", "(ILjava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "getTotal", "()I", "getUrl_prefix_avatar", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "getListNotification", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseNotification$ListNotificationData;", "Lkotlin/collections/ArrayList;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class NotificationResponse implements android.os.Parcelable {
        private final int total = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object data = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url_prefix_avatar = null;
        public static final android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseNotification.NotificationResponse> CREATOR = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseNotification.ListNotificationData> getListNotification() {
            return null;
        }
        
        public final int getTotal() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl_prefix_avatar() {
            return null;
        }
        
        public NotificationResponse(int total, @org.jetbrains.annotations.Nullable()
        java.lang.Object data, @org.jetbrains.annotations.Nullable()
        java.lang.String url_prefix_avatar) {
            super();
        }
        
        public final int component1() {
            return 0;
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
        public final brite.outdoor.data.api_entities.response.ResponseNotification.NotificationResponse copy(int total, @org.jetbrains.annotations.Nullable()
        java.lang.Object data, @org.jetbrains.annotations.Nullable()
        java.lang.String url_prefix_avatar) {
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
        public static final class Creator implements android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseNotification.NotificationResponse> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseNotification.NotificationResponse[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseNotification.NotificationResponse createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012\u00a8\u0006!"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseNotification$ListNotificationData;", "", "id", "", "user_id", "user_created_id", "type", "p_id", "c_id", "question_id", "c_comment", "", "created_time", "user_name_created", "avatar_user", "thread_id", "(IIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAvatar_user", "()Ljava/lang/String;", "getC_comment", "getC_id", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreated_time", "getId", "()I", "getP_id", "getQuestion_id", "getThread_id", "getType", "getUser_created_id", "getUser_id", "getUser_name_created", "app_debug"})
    public static final class ListNotificationData {
        private final int id = 0;
        private final int user_id = 0;
        private final int user_created_id = 0;
        private final int type = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer p_id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer c_id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer question_id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String c_comment = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String created_time = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String user_name_created = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String avatar_user = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer thread_id = null;
        
        public final int getId() {
            return 0;
        }
        
        public final int getUser_id() {
            return 0;
        }
        
        public final int getUser_created_id() {
            return 0;
        }
        
        public final int getType() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getP_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getC_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getQuestion_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getC_comment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCreated_time() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUser_name_created() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAvatar_user() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getThread_id() {
            return null;
        }
        
        public ListNotificationData(int id, int user_id, int user_created_id, int type, @org.jetbrains.annotations.Nullable()
        java.lang.Integer p_id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer c_id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer question_id, @org.jetbrains.annotations.Nullable()
        java.lang.String c_comment, @org.jetbrains.annotations.NotNull()
        java.lang.String created_time, @org.jetbrains.annotations.NotNull()
        java.lang.String user_name_created, @org.jetbrains.annotations.NotNull()
        java.lang.String avatar_user, @org.jetbrains.annotations.Nullable()
        java.lang.Integer thread_id) {
            super();
        }
    }
}