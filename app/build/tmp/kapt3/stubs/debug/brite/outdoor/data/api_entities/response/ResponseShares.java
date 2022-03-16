package brite.outdoor.data.api_entities.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseShares;", "", "()V", "ShareResponse", "SharesResult", "app_debug"})
public final class ResponseShares {
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.data.api_entities.response.ResponseShares INSTANCE = null;
    
    private ResponseShares() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseShares$SharesResult;", "Lbrite/outdoor/data/api_entities/response/BaseApiResult;", "()V", "app_debug"})
    public static final class SharesResult extends brite.outdoor.data.api_entities.response.BaseApiResult {
        
        public SharesResult() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ<\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000e\u0010\t\u00a8\u0006\u001b"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponseShares$ShareResponse;", "", "post_id", "", "like_count", "share_count", "comment_count", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getComment_count", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLike_count", "getPost_id", "()I", "getShare_count", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lbrite/outdoor/data/api_entities/response/ResponseShares$ShareResponse;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class ShareResponse {
        private final int post_id = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer like_count = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer share_count = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer comment_count = null;
        
        public final int getPost_id() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getLike_count() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getShare_count() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getComment_count() {
            return null;
        }
        
        public ShareResponse(int post_id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer like_count, @org.jetbrains.annotations.Nullable()
        java.lang.Integer share_count, @org.jetbrains.annotations.Nullable()
        java.lang.Integer comment_count) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.data.api_entities.response.ResponseShares.ShareResponse copy(int post_id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer like_count, @org.jetbrains.annotations.Nullable()
        java.lang.Integer share_count, @org.jetbrains.annotations.Nullable()
        java.lang.Integer comment_count) {
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