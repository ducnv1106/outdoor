package brite.outdoor.data.api_entities.response;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\bZ\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u001fJ\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\t\u0010Q\u001a\u00020\u0011H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010;J\t\u0010X\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010^\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010;J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u00bc\u0002\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010hJ\t\u0010i\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010j\u001a\u00020\u00112\b\u0010k\u001a\u0004\u0018\u00010lH\u00d6\u0003J\u001a\u0010m\u001a\u0016\u0012\u0004\u0012\u00020o\u0018\u00010nj\n\u0012\u0004\u0012\u00020o\u0018\u0001`pJ\t\u0010q\u001a\u00020\u0003H\u00d6\u0001J\t\u0010r\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\b-\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u001e\u0010/\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u00100R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\b5\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010>\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010>\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\bA\u0010&\"\u0004\bB\u0010(R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\bC\u0010&\"\u0004\bD\u0010(R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010!\"\u0004\bF\u0010GR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\bH\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010!R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010!R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\bL\u0010&\u00a8\u0006x"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "Landroid/os/Parcelable;", "id", "", "title", "", "content", "location_id", "name_locations", "name_utensils", "name_hashtags", "hashtag_id", "utensil_id", "like_count", "comment_count", "share_count", "is_deleted", "", "created_id", "created_time", "modified_time", "url_prefix", "avatar_user", "post_likes", "state_follow", "url_prefix_avatar", "user_name_created", "cIndex", "type", "post_shares", "address_locations", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAddress_locations", "()Ljava/lang/String;", "getAvatar_user", "getCIndex", "()I", "getComment_count", "()Ljava/lang/Integer;", "setComment_count", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getContent", "getCreated_id", "getCreated_time", "getHashtag_id", "getId", "isShowLoading", "()Z", "setShowLoading", "(Z)V", "getLike_count", "setLike_count", "getLocation_id", "getModified_time", "getName_hashtags", "getName_locations", "getName_utensils", "getPost_likes", "()Ljava/lang/Boolean;", "setPost_likes", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPost_shares", "setPost_shares", "getShare_count", "setShare_count", "getState_follow", "setState_follow", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getType", "getUrl_prefix", "getUrl_prefix_avatar", "getUser_name_created", "getUtensil_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "describeContents", "equals", "other", "", "getListContent", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseListPostUser$ResponseContent;", "Lkotlin/collections/ArrayList;", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class ListPostUserData implements android.os.Parcelable {
    @com.google.gson.annotations.Expose()
    private boolean isShowLoading = false;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String content = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer location_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name_locations = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name_utensils = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name_hashtags = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer hashtag_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer utensil_id = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer like_count;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer comment_count;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer share_count;
    private final boolean is_deleted = false;
    private final int created_id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String created_time = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String modified_time = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url_prefix = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String avatar_user = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean post_likes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer state_follow;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url_prefix_avatar = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String user_name_created = null;
    private final int cIndex = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer type = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean post_shares;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String address_locations = null;
    public static final android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ListPostUserData> CREATOR = null;
    
    public final boolean isShowLoading() {
        return false;
    }
    
    public final void setShowLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListPostUser.ResponseContent> getListContent() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLocation_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName_locations() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName_utensils() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName_hashtags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHashtag_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUtensil_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLike_count() {
        return null;
    }
    
    public final void setLike_count(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getComment_count() {
        return null;
    }
    
    public final void setComment_count(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getShare_count() {
        return null;
    }
    
    public final void setShare_count(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean is_deleted() {
        return false;
    }
    
    public final int getCreated_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreated_time() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getModified_time() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl_prefix() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvatar_user() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPost_likes() {
        return null;
    }
    
    public final void setPost_likes(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getState_follow() {
        return null;
    }
    
    public final void setState_follow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl_prefix_avatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_name_created() {
        return null;
    }
    
    public final int getCIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPost_shares() {
        return null;
    }
    
    public final void setPost_shares(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress_locations() {
        return null;
    }
    
    public ListPostUserData(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.lang.Integer location_id, @org.jetbrains.annotations.Nullable()
    java.lang.String name_locations, @org.jetbrains.annotations.Nullable()
    java.lang.String name_utensils, @org.jetbrains.annotations.Nullable()
    java.lang.String name_hashtags, @org.jetbrains.annotations.Nullable()
    java.lang.Integer hashtag_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer utensil_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer like_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer comment_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer share_count, boolean is_deleted, int created_id, @org.jetbrains.annotations.Nullable()
    java.lang.String created_time, @org.jetbrains.annotations.Nullable()
    java.lang.String modified_time, @org.jetbrains.annotations.Nullable()
    java.lang.String url_prefix, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar_user, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean post_likes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer state_follow, @org.jetbrains.annotations.Nullable()
    java.lang.String url_prefix_avatar, @org.jetbrains.annotations.Nullable()
    java.lang.String user_name_created, int cIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean post_shares, @org.jetbrains.annotations.Nullable()
    java.lang.String address_locations) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
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
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final int component14() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    public final int component23() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.data.api_entities.response.ListPostUserData copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.lang.Integer location_id, @org.jetbrains.annotations.Nullable()
    java.lang.String name_locations, @org.jetbrains.annotations.Nullable()
    java.lang.String name_utensils, @org.jetbrains.annotations.Nullable()
    java.lang.String name_hashtags, @org.jetbrains.annotations.Nullable()
    java.lang.Integer hashtag_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer utensil_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer like_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer comment_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer share_count, boolean is_deleted, int created_id, @org.jetbrains.annotations.Nullable()
    java.lang.String created_time, @org.jetbrains.annotations.Nullable()
    java.lang.String modified_time, @org.jetbrains.annotations.Nullable()
    java.lang.String url_prefix, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar_user, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean post_likes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer state_follow, @org.jetbrains.annotations.Nullable()
    java.lang.String url_prefix_avatar, @org.jetbrains.annotations.Nullable()
    java.lang.String user_name_created, int cIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean post_shares, @org.jetbrains.annotations.Nullable()
    java.lang.String address_locations) {
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
    public static final class Creator implements android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ListPostUserData> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final brite.outdoor.data.api_entities.response.ListPostUserData[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final brite.outdoor.data.api_entities.response.ListPostUserData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}