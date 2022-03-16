package brite.outdoor.data.api_entities.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponsePostComment;", "", "()V", "ListCommentResponse", "PostCommentResult", "app_debug"})
public final class ResponsePostComment {
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.data.api_entities.response.ResponsePostComment INSTANCE = null;
    
    private ResponsePostComment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponsePostComment$PostCommentResult;", "Lbrite/outdoor/data/api_entities/response/BaseApiResult;", "()V", "app_debug"})
    public static final class PostCommentResult extends brite.outdoor.data.api_entities.response.BaseApiResult {
        
        public PostCommentResult() {
            super(null);
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00d3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012$\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018\u00a2\u0006\u0002\b\u0019\u00a2\u0006\u0002\b\u0019\u00a2\u0006\u0002\u0010\u001aJ\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u00106\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\'\u0010;\u001a \u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018\u00a2\u0006\u0002\b\u0019\u00a2\u0006\u0002\b\u0019H\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u00fa\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032&\b\u0002\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018\u00a2\u0006\u0002\b\u0019\u00a2\u0006\u0002\b\u0019H\u00c6\u0001\u00a2\u0006\u0002\u0010EJ\t\u0010F\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JH\u00d6\u0003J\u001a\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018J\t\u0010L\u001a\u00020\u0003H\u00d6\u0001J\t\u0010M\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b%\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR/\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018\u00a2\u0006\u0002\b\u0019\u00a2\u0006\u0002\b\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b*\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b,\u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001c\u00a8\u0006S"}, d2 = {"Lbrite/outdoor/data/api_entities/response/ResponsePostComment$ListCommentResponse;", "Landroid/os/Parcelable;", "id", "", "post_id", "thread_id", "", "parent_id", "created_id", "reply_id", "comment", "modified_time", "user_name_created", "avatar_user", "user_name_reply", "like_count", "url_prefix_comment", "image", "share_count", "comment_count", "total_children", "post_comments_children", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseListComment$ListContentReplyData;", "Lkotlin/collections/ArrayList;", "Lkotlinx/android/parcel/RawValue;", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/util/ArrayList;)V", "getAvatar_user", "()Ljava/lang/String;", "getComment", "getComment_count", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreated_id", "()I", "getId", "getImage", "getLike_count", "getModified_time", "getParent_id", "getPost_comments_children", "()Ljava/util/ArrayList;", "getPost_id", "getReply_id", "getShare_count", "getThread_id", "getTotal_children", "getUrl_prefix_comment", "getUser_name_created", "getUser_name_reply", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/util/ArrayList;)Lbrite/outdoor/data/api_entities/response/ResponsePostComment$ListCommentResponse;", "describeContents", "equals", "", "other", "", "getListCommentReply", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class ListCommentResponse implements android.os.Parcelable {
        private final int id = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer post_id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String thread_id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String parent_id = null;
        private final int created_id = 0;
        private final int reply_id = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String comment = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String modified_time = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String user_name_created = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String avatar_user = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String user_name_reply = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer like_count = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url_prefix_comment = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String image = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer share_count = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer comment_count = null;
        private final int total_children = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListComment.ListContentReplyData> post_comments_children = null;
        public static final android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponsePostComment.ListCommentResponse> CREATOR = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListComment.ListContentReplyData> getListCommentReply() {
            return null;
        }
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPost_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getThread_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getParent_id() {
            return null;
        }
        
        public final int getCreated_id() {
            return 0;
        }
        
        public final int getReply_id() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getComment() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getModified_time() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUser_name_created() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAvatar_user() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUser_name_reply() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getLike_count() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl_prefix_comment() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImage() {
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
        
        public final int getTotal_children() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListComment.ListContentReplyData> getPost_comments_children() {
            return null;
        }
        
        public ListCommentResponse(int id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer post_id, @org.jetbrains.annotations.Nullable()
        java.lang.String thread_id, @org.jetbrains.annotations.Nullable()
        java.lang.String parent_id, int created_id, int reply_id, @org.jetbrains.annotations.Nullable()
        java.lang.String comment, @org.jetbrains.annotations.Nullable()
        java.lang.String modified_time, @org.jetbrains.annotations.Nullable()
        java.lang.String user_name_created, @org.jetbrains.annotations.Nullable()
        java.lang.String avatar_user, @org.jetbrains.annotations.Nullable()
        java.lang.String user_name_reply, @org.jetbrains.annotations.Nullable()
        java.lang.Integer like_count, @org.jetbrains.annotations.Nullable()
        java.lang.String url_prefix_comment, @org.jetbrains.annotations.Nullable()
        java.lang.String image, @org.jetbrains.annotations.Nullable()
        java.lang.Integer share_count, @org.jetbrains.annotations.Nullable()
        java.lang.Integer comment_count, int total_children, @org.jetbrains.annotations.Nullable()
        java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListComment.ListContentReplyData> post_comments_children) {
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
        
        public final int component6() {
            return 0;
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
        public final java.lang.String component10() {
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component16() {
            return null;
        }
        
        public final int component17() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListComment.ListContentReplyData> component18() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.data.api_entities.response.ResponsePostComment.ListCommentResponse copy(int id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer post_id, @org.jetbrains.annotations.Nullable()
        java.lang.String thread_id, @org.jetbrains.annotations.Nullable()
        java.lang.String parent_id, int created_id, int reply_id, @org.jetbrains.annotations.Nullable()
        java.lang.String comment, @org.jetbrains.annotations.Nullable()
        java.lang.String modified_time, @org.jetbrains.annotations.Nullable()
        java.lang.String user_name_created, @org.jetbrains.annotations.Nullable()
        java.lang.String avatar_user, @org.jetbrains.annotations.Nullable()
        java.lang.String user_name_reply, @org.jetbrains.annotations.Nullable()
        java.lang.Integer like_count, @org.jetbrains.annotations.Nullable()
        java.lang.String url_prefix_comment, @org.jetbrains.annotations.Nullable()
        java.lang.String image, @org.jetbrains.annotations.Nullable()
        java.lang.Integer share_count, @org.jetbrains.annotations.Nullable()
        java.lang.Integer comment_count, int total_children, @org.jetbrains.annotations.Nullable()
        java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListComment.ListContentReplyData> post_comments_children) {
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
        public static final class Creator implements android.os.Parcelable.Creator<brite.outdoor.data.api_entities.response.ResponsePostComment.ListCommentResponse> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponsePostComment.ListCommentResponse[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final brite.outdoor.data.api_entities.response.ResponsePostComment.ListCommentResponse createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
}