package brite.outdoor.data.api_entities.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponsePushPosts;", "", "()V", "PushPostResult", "PushPostsResponse", "PushPostsResponseApi", "app_debug"})
public final class ResponsePushPosts {
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.data.api_entities.response.ResponsePushPosts INSTANCE = null;
    
    private ResponsePushPosts() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponsePushPosts$PushPostResult;", "Lbrite/outdoor/data/api_entities/response/BaseApiResult;", "()V", "app_debug"})
    public static final class PushPostResult extends brite.outdoor.data.api_entities.response.BaseApiResult {
        
        public PushPostResult() {
            super(null);
        }
    }
    
    @androidx.room.TypeConverters(value = {brite.outdoor.utils.TypeConvertUtils.SourceTypeConverter.class})
    @androidx.room.Entity(tableName = "pushPostsResponse")
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u001e\b\u0002\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u001f\u0010\u001a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001e\b\u0002\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R,\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponsePushPosts$PushPostsResponse;", "", "id", "", "title", "listConTent", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/PostContentEntity;", "Lkotlin/collections/ArrayList;", "avatar", "Lbrite/outdoor/data/entities/ImagePicker;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/MutableLiveData;Lbrite/outdoor/data/entities/ImagePicker;)V", "getAvatar", "()Lbrite/outdoor/data/entities/ImagePicker;", "setAvatar", "(Lbrite/outdoor/data/entities/ImagePicker;)V", "getId", "()Ljava/lang/String;", "getListConTent", "()Landroidx/lifecycle/MutableLiveData;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class PushPostsResponse {
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
        
        public PushPostsResponse(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> listConTent, @org.jetbrains.annotations.Nullable()
        brite.outdoor.data.entities.ImagePicker avatar) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final brite.outdoor.data.entities.ImagePicker component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.data.api_entities.response.ResponsePushPosts.PushPostsResponse copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> listConTent, @org.jetbrains.annotations.Nullable()
        brite.outdoor.data.entities.ImagePicker avatar) {
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
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u001e\b\u0002\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u001f\u0010*\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u0083\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001e\b\u0002\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u00020\u0003H\u00d6\u0001R,\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017\u00a8\u00068"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponsePushPosts$PushPostsResponseApi;", "", "id", "", "title", "content", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/PostContentEntity;", "Lkotlin/collections/ArrayList;", "location_id", "hashtag_id", "utensil_id", "token", "created_id", "created_time", "modified_time", "(Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/MutableLiveData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Landroidx/lifecycle/MutableLiveData;", "getCreated_id", "()Ljava/lang/String;", "setCreated_id", "(Ljava/lang/String;)V", "getCreated_time", "setCreated_time", "getHashtag_id", "setHashtag_id", "getId", "getLocation_id", "setLocation_id", "getModified_time", "setModified_time", "getTitle", "setTitle", "getToken", "setToken", "getUtensil_id", "setUtensil_id", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class PushPostsResponseApi {
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "id")
        @androidx.room.PrimaryKey(autoGenerate = false)
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "title")
        private java.lang.String title;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "listConTent")
        private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> content = null;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "location_id")
        private java.lang.String location_id;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "hashtag_id")
        private java.lang.String hashtag_id;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "utensil_id")
        private java.lang.String utensil_id;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "token")
        private java.lang.String token;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "created_id")
        private java.lang.String created_id;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "created_time")
        private java.lang.String created_time;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "modified_time")
        private java.lang.String modified_time;
        
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
        public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> getContent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLocation_id() {
            return null;
        }
        
        public final void setLocation_id(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHashtag_id() {
            return null;
        }
        
        public final void setHashtag_id(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUtensil_id() {
            return null;
        }
        
        public final void setUtensil_id(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getToken() {
            return null;
        }
        
        public final void setToken(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCreated_id() {
            return null;
        }
        
        public final void setCreated_id(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCreated_time() {
            return null;
        }
        
        public final void setCreated_time(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getModified_time() {
            return null;
        }
        
        public final void setModified_time(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public PushPostsResponseApi(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> content, @org.jetbrains.annotations.NotNull()
        java.lang.String location_id, @org.jetbrains.annotations.NotNull()
        java.lang.String hashtag_id, @org.jetbrains.annotations.NotNull()
        java.lang.String utensil_id, @org.jetbrains.annotations.NotNull()
        java.lang.String token, @org.jetbrains.annotations.NotNull()
        java.lang.String created_id, @org.jetbrains.annotations.NotNull()
        java.lang.String created_time, @org.jetbrains.annotations.NotNull()
        java.lang.String modified_time) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.data.api_entities.response.ResponsePushPosts.PushPostsResponseApi copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> content, @org.jetbrains.annotations.NotNull()
        java.lang.String location_id, @org.jetbrains.annotations.NotNull()
        java.lang.String hashtag_id, @org.jetbrains.annotations.NotNull()
        java.lang.String utensil_id, @org.jetbrains.annotations.NotNull()
        java.lang.String token, @org.jetbrains.annotations.NotNull()
        java.lang.String created_id, @org.jetbrains.annotations.NotNull()
        java.lang.String created_time, @org.jetbrains.annotations.NotNull()
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
    }
}