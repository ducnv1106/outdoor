package brite.outdoor.data.api_entities.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseDetailHotNews;", "", "()V", "DetailHotNewsResult", "DetailPostHotNewsData", "DetailPostHotNewsResponse", "app_debug"})
public final class ResponseDetailHotNews {
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.data.api_entities.response.ResponseDetailHotNews INSTANCE = null;
    
    private ResponseDetailHotNews() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseDetailHotNews$DetailHotNewsResult;", "Lbrite/outdoor/data/api_entities/response/BaseApiResult;", "()V", "app_debug"})
    public static final class DetailHotNewsResult extends brite.outdoor.data.api_entities.response.BaseApiResult {
        
        public DetailHotNewsResult() {
            super(null);
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001c\u0012\r\u0010\u0002\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\b\u0004H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J$\u0010\u000e\u001a\u00020\u00002\u000f\b\u0002\u0010\u0002\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\b\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001R\u0018\u0010\u0002\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\b\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseDetailHotNews$DetailPostHotNewsResponse;", "Landroid/os/Parcelable;", "data", "", "Lkotlinx/android/parcel/RawValue;", "total", "", "(Ljava/lang/Object;I)V", "getData", "()Ljava/lang/Object;", "getTotal", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "hashCode", "postHotNews", "Lbrite/outdoor/data/api_entities/response/ResponseDetailHotNews$DetailPostHotNewsData;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class DetailPostHotNewsResponse implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object data = null;
        private final int total = 0;
        public static final android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsResponse> CREATOR = null;
        
        @org.jetbrains.annotations.Nullable()
        public final brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsData postHotNews() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getData() {
            return null;
        }
        
        public final int getTotal() {
            return 0;
        }
        
        public DetailPostHotNewsResponse(@org.jetbrains.annotations.Nullable()
        java.lang.Object data, int total) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsResponse copy(@org.jetbrains.annotations.Nullable()
        java.lang.Object data, int total) {
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
        public static final class Creator implements android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsResponse> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsResponse[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsResponse createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bS\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00f6\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\r\u0010\u000e\u001a\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010!J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010N\u001a\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010H\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010R\u001a\u00020\u0015H\u00c6\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010U\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010e\u001a\u00020\u0005H\u00c6\u0003J\u00b3\u0002\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\u000f\b\u0002\u0010\u000e\u001a\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010gJ\b\u0010h\u001a\u0004\u0018\u00010iJ\t\u0010j\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010k\u001a\u00020\u00152\b\u0010l\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\u0016\u0010m\u001a\u0012\u0012\u0004\u0012\u00020o0nj\b\u0012\u0004\u0012\u00020o`pJ\t\u0010q\u001a\u00020\u0003H\u00d6\u0001J\u001a\u0010r\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010nj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`pJ\t\u0010s\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u000e\u001a\t\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0015\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010-R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010-R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010-\"\u0004\b:\u0010;R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b<\u00102R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010#R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010#R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bA\u00102R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010#R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\bC\u0010(\"\u0004\bD\u0010*R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010-R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\bF\u00102\"\u0004\bG\u0010HR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010#R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010#R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010#\u00a8\u0006y"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseDetailHotNews$DetailPostHotNewsData;", "Landroid/os/Parcelable;", "id", "", "title", "", "content", "like_count", "comment_count", "share_count", "attachment", "created_id", "created_time", "is_deleted", "admin", "", "Lkotlinx/android/parcel/RawValue;", "modified_time", "url_prefix", "url_prefix_avatar", "hot_news_likes", "", "location_id", "state_follow", "bookmarks", "name_locations", "name_utensils", "address_locations", "post_shares", "plans_note", "plans_status", "plans_time", "has_plans", "(ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getAddress_locations", "()Ljava/lang/String;", "getAdmin", "()Ljava/lang/Object;", "getAttachment", "getBookmarks", "()Ljava/lang/Boolean;", "setBookmarks", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getComment_count", "()I", "getContent", "getCreated_id", "getCreated_time", "getHas_plans", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHot_news_likes", "()Z", "setHot_news_likes", "(Z)V", "getId", "getLike_count", "setLike_count", "(I)V", "getLocation_id", "getModified_time", "getName_locations", "getName_utensils", "getPlans_note", "getPlans_status", "getPlans_time", "getPost_shares", "setPost_shares", "getShare_count", "getState_follow", "setState_follow", "(Ljava/lang/Integer;)V", "getTitle", "getUrl_prefix", "getUrl_prefix_avatar", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lbrite/outdoor/data/api_entities/response/ResponseDetailHotNews$DetailPostHotNewsData;", "dataAdmin", "Lbrite/outdoor/data/api_entities/response/ResponseListPostHotNews$Admin;", "describeContents", "equals", "other", "getContentHotNews", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseListPostHotNews$ResponseContentHotNews;", "Lkotlin/collections/ArrayList;", "hashCode", "listImage", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class DetailPostHotNewsData implements android.os.Parcelable {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String content = null;
        private int like_count;
        private final int comment_count = 0;
        private final int share_count = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String attachment = null;
        private final int created_id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String created_time = null;
        private final int is_deleted = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object admin = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String modified_time = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url_prefix = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url_prefix_avatar = null;
        private boolean hot_news_likes;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer location_id = null;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer state_follow;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean bookmarks;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name_locations = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name_utensils = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String address_locations = null;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean post_shares;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String plans_note = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer plans_status = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String plans_time = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer has_plans = null;
        public static final android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsData> CREATOR = null;
        
        @org.jetbrains.annotations.Nullable()
        public final brite.outdoor.data.api_entities.response.ResponseListPostHotNews.Admin dataAdmin() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<java.lang.String> listImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListPostHotNews.ResponseContentHotNews> getContentHotNews() {
            return null;
        }
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getContent() {
            return null;
        }
        
        public final int getLike_count() {
            return 0;
        }
        
        public final void setLike_count(int p0) {
        }
        
        public final int getComment_count() {
            return 0;
        }
        
        public final int getShare_count() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAttachment() {
            return null;
        }
        
        public final int getCreated_id() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCreated_time() {
            return null;
        }
        
        public final int is_deleted() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getAdmin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getModified_time() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl_prefix() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl_prefix_avatar() {
            return null;
        }
        
        public final boolean getHot_news_likes() {
            return false;
        }
        
        public final void setHot_news_likes(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getLocation_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getState_follow() {
            return null;
        }
        
        public final void setState_follow(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getBookmarks() {
            return null;
        }
        
        public final void setBookmarks(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
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
        public final java.lang.String getAddress_locations() {
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
        public final java.lang.String getPlans_note() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPlans_status() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPlans_time() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getHas_plans() {
            return null;
        }
        
        public DetailPostHotNewsData(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String content, int like_count, int comment_count, int share_count, @org.jetbrains.annotations.Nullable()
        java.lang.String attachment, int created_id, @org.jetbrains.annotations.NotNull()
        java.lang.String created_time, int is_deleted, @org.jetbrains.annotations.Nullable()
        java.lang.Object admin, @org.jetbrains.annotations.NotNull()
        java.lang.String modified_time, @org.jetbrains.annotations.NotNull()
        java.lang.String url_prefix, @org.jetbrains.annotations.NotNull()
        java.lang.String url_prefix_avatar, boolean hot_news_likes, @org.jetbrains.annotations.Nullable()
        java.lang.Integer location_id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer state_follow, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean bookmarks, @org.jetbrains.annotations.Nullable()
        java.lang.String name_locations, @org.jetbrains.annotations.Nullable()
        java.lang.String name_utensils, @org.jetbrains.annotations.Nullable()
        java.lang.String address_locations, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean post_shares, @org.jetbrains.annotations.Nullable()
        java.lang.String plans_note, @org.jetbrains.annotations.Nullable()
        java.lang.Integer plans_status, @org.jetbrains.annotations.Nullable()
        java.lang.String plans_time, @org.jetbrains.annotations.Nullable()
        java.lang.Integer has_plans) {
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
        
        public final int component4() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int component6() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        public final int component8() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        public final int component10() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object component11() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component14() {
            return null;
        }
        
        public final boolean component15() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component17() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component18() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component19() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component20() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component21() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component22() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component23() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component24() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component25() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component26() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsData copy(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String content, int like_count, int comment_count, int share_count, @org.jetbrains.annotations.Nullable()
        java.lang.String attachment, int created_id, @org.jetbrains.annotations.NotNull()
        java.lang.String created_time, int is_deleted, @org.jetbrains.annotations.Nullable()
        java.lang.Object admin, @org.jetbrains.annotations.NotNull()
        java.lang.String modified_time, @org.jetbrains.annotations.NotNull()
        java.lang.String url_prefix, @org.jetbrains.annotations.NotNull()
        java.lang.String url_prefix_avatar, boolean hot_news_likes, @org.jetbrains.annotations.Nullable()
        java.lang.Integer location_id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer state_follow, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean bookmarks, @org.jetbrains.annotations.Nullable()
        java.lang.String name_locations, @org.jetbrains.annotations.Nullable()
        java.lang.String name_utensils, @org.jetbrains.annotations.Nullable()
        java.lang.String address_locations, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean post_shares, @org.jetbrains.annotations.Nullable()
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
        public static final class Creator implements android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsData[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsData createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
}