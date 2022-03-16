package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001zB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010e\u001a\u00020f2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020C0hJ:\u0010i\u001a\u00020f2\"\u0010i\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`!2\u0006\u0010j\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020HJB\u0010k\u001a\u00020f2\"\u0010k\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`!2\u0006\u0010j\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020H2\u0006\u0010N\u001a\u00020HJ2\u0010l\u001a\u00020f2\"\u0010l\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`!2\u0006\u0010j\u001a\u00020\u000eJ2\u0010m\u001a\u00020f2\"\u0010m\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`!2\u0006\u0010j\u001a\u00020\u000eJ4\u0010n\u001a\u00020f2\"\u0010n\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`!2\b\u0010o\u001a\u0004\u0018\u00010$J+\u0010p\u001a\u00020f2\u0006\u0010q\u001a\u00020\u000e2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010H\u00a2\u0006\u0002\u0010rJ\u0010\u0010s\u001a\u00020f2\b\u0010t\u001a\u0004\u0018\u00010\u0015J\u000e\u0010u\u001a\u00020f2\u0006\u00105\u001a\u00020\u0017J\u000e\u0010v\u001a\u00020f2\u0006\u0010:\u001a\u00020\u0017J\'\u0010w\u001a\u00020f2\u0006\u0010x\u001a\u00020]2\u0006\u0010G\u001a\u00020H2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010H\u00a2\u0006\u0002\u0010yR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u001f\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`!0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\"\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`!0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010%\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`!0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010&\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`!0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\'\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`!0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010(\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u000e0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8F\u00a2\u0006\u0006\u001a\u0004\b2\u0010.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\b8F\u00a2\u0006\u0006\u001a\u0004\b4\u0010.R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00170\b8F\u00a2\u0006\u0006\u001a\u0004\b5\u0010.R\u001a\u00106\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00170\b8F\u00a2\u0006\u0006\u001a\u0004\b:\u0010.R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001d\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020C0<\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010?R\u001d\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010.R\u001e\u0010G\u001a\u0004\u0018\u00010HX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001e\u0010N\u001a\u0004\u0018\u00010HX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR\u001d\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010.R\u001e\u0010S\u001a\u0004\u0018\u00010HX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bT\u0010J\"\u0004\bU\u0010LR\u001e\u0010V\u001a\u0004\u0018\u00010HX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bW\u0010J\"\u0004\bX\u0010LR\u0014\u0010Y\u001a\u00020HX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010+R \u0010_\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010+\"\u0004\ba\u0010bR\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010+\u00a8\u0006{"}, d2 = {"Lbrite/outdoor/viewmodel/CommentHotNewsViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_deleteCommentResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseDeleteCommentHotNews$DeleteCommentHotNewsResult;", "_deleteReplyCommentResult", "_edtHint", "Landroidx/lifecycle/MutableLiveData;", "", "_idPost", "get_idPost", "()Ljava/lang/String;", "set_idPost", "(Ljava/lang/String;)V", "_imagePickerComment", "Lbrite/outdoor/data/entities/ImagePicker;", "_isNotification", "", "_isShowHideLayoutComment", "_listCommentHotNewsResult", "Lbrite/outdoor/data/api_entities/response/ResponseListCommentHotNews$ListCommentHotNewsResult;", "_listReplyCommentResult", "Lbrite/outdoor/data/api_entities/response/ResponseListReplyCommentHotNews$ListReplyCommentHotNewsResult;", "_postCommentResult", "Lbrite/outdoor/data/api_entities/response/ResponsePostCommentHotNews$PostCommentHotNewsResult;", "_requestDeleteComment", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_requestDeleteReplyComment", "_requestImg", "Lokhttp3/MultipartBody$Part;", "_requestListCommentHotNews", "_requestListReplyComment", "_requestPostComment", "contentPost", "kotlin.jvm.PlatformType", "getContentPost", "()Landroidx/lifecycle/MutableLiveData;", "deleteCommentResult", "getDeleteCommentResult", "()Landroidx/lifecycle/LiveData;", "deleteReplyCommentResult", "getDeleteReplyCommentResult", "edtHint", "getEdtHint", "imagePickerComment", "getImagePickerComment", "isNotification", "isPermissionReadWriteExternalStorage", "()Z", "setPermissionReadWriteExternalStorage", "(Z)V", "isShowHideLayoutComment", "listComment", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseListCommentHotNews$CommentHotNews;", "getListComment", "()Ljava/util/ArrayList;", "listCommentHotNewsResult", "getListCommentHotNewsResult", "listCommentReply", "Lbrite/outdoor/data/api_entities/response/ResponseListCommentHotNews$CommentHotNewsReply;", "getListCommentReply", "listReplyCommentResult", "getListReplyCommentResult", "positionComment", "", "getPositionComment", "()Ljava/lang/Integer;", "setPositionComment", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "positionReplyComment", "getPositionReplyComment", "setPositionReplyComment", "postCommentResult", "getPostCommentResult", "replyIdComment", "getReplyIdComment", "setReplyIdComment", "threadIdReplyComment", "getThreadIdReplyComment", "setThreadIdReplyComment", "total_children", "getTotal_children", "()I", "typeReply", "Lbrite/outdoor/viewmodel/CommentHotNewsViewModel$TYPE;", "getTypeReply", "url_prefix_avatar", "getUrl_prefix_avatar", "setUrl_prefix_avatar", "(Landroidx/lifecycle/MutableLiveData;)V", "url_prefix_avatar_comment", "getUrl_prefix_avatar_comment", "addAllListReply", "", "list", "", "requestDeleteComment", "id", "requestDeleteReplyComment", "requestListCommentHotNews", "requestListReplyComment", "requestPostComment", "requestImg", "setEdtHint", "content", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setImageImagePickerComment", "imagePicker", "setIsNotification", "setIsShowHideLayoutComment", "setTypeReply", "type", "(Lbrite/outdoor/viewmodel/CommentHotNewsViewModel$TYPE;ILjava/lang/Integer;)V", "TYPE", "app_debug"})
public final class CommentHotNewsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> contentPost = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer positionComment;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer positionReplyComment;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.CommentHotNewsViewModel.TYPE> typeReply = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isShowHideLayoutComment = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isNotification = null;
    private boolean isPermissionReadWriteExternalStorage = false;
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.ImagePicker> _imagePickerComment = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _edtHint = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer threadIdReplyComment;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer replyIdComment;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNews> listComment = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply> listCommentReply = null;
    private final int total_children = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> url_prefix_avatar;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> url_prefix_avatar_comment = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestPostComment = null;
    private final androidx.lifecycle.MutableLiveData<okhttp3.MultipartBody.Part> _requestImg = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponsePostCommentHotNews.PostCommentHotNewsResult>> _postCommentResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponsePostCommentHotNews.PostCommentHotNewsResult>> postCommentResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeleteComment = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteCommentHotNews.DeleteCommentHotNewsResult>> _deleteCommentResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteCommentHotNews.DeleteCommentHotNewsResult>> deleteCommentResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeleteReplyComment = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteCommentHotNews.DeleteCommentHotNewsResult>> _deleteReplyCommentResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteCommentHotNews.DeleteCommentHotNewsResult>> deleteReplyCommentResult = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String _idPost = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListCommentHotNews = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.ListCommentHotNewsResult>> _listCommentHotNewsResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.ListCommentHotNewsResult>> listCommentHotNewsResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListReplyComment = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListReplyCommentHotNews.ListReplyCommentHotNewsResult>> _listReplyCommentResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListReplyCommentHotNews.ListReplyCommentHotNewsResult>> listReplyCommentResult = null;
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getContentPost() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPositionComment() {
        return null;
    }
    
    public final void setPositionComment(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPositionReplyComment() {
        return null;
    }
    
    public final void setPositionReplyComment(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.CommentHotNewsViewModel.TYPE> getTypeReply() {
        return null;
    }
    
    public final void setTypeReply(@org.jetbrains.annotations.NotNull()
    brite.outdoor.viewmodel.CommentHotNewsViewModel.TYPE type, int positionComment, @org.jetbrains.annotations.Nullable()
    java.lang.Integer positionReplyComment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isShowHideLayoutComment() {
        return null;
    }
    
    public final void setIsShowHideLayoutComment(boolean isShowHideLayoutComment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isNotification() {
        return null;
    }
    
    public final void setIsNotification(boolean isNotification) {
    }
    
    public final boolean isPermissionReadWriteExternalStorage() {
        return false;
    }
    
    public final void setPermissionReadWriteExternalStorage(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.entities.ImagePicker> getImagePickerComment() {
        return null;
    }
    
    public final void setImageImagePickerComment(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.entities.ImagePicker imagePicker) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getEdtHint() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getThreadIdReplyComment() {
        return null;
    }
    
    public final void setThreadIdReplyComment(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReplyIdComment() {
        return null;
    }
    
    public final void setReplyIdComment(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final void setEdtHint(@org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.lang.Integer threadIdReplyComment, @org.jetbrains.annotations.Nullable()
    java.lang.Integer replyIdComment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNews> getListComment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply> getListCommentReply() {
        return null;
    }
    
    public final int getTotal_children() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUrl_prefix_avatar() {
        return null;
    }
    
    public final void setUrl_prefix_avatar(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUrl_prefix_avatar_comment() {
        return null;
    }
    
    public final void addAllListReply(@org.jetbrains.annotations.NotNull()
    java.util.List<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply> list) {
    }
    
    public final void requestPostComment(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestPostComment, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part requestImg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponsePostCommentHotNews.PostCommentHotNewsResult>> getPostCommentResult() {
        return null;
    }
    
    public final void requestDeleteComment(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDeleteComment, @org.jetbrains.annotations.NotNull()
    java.lang.String id, int positionComment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteCommentHotNews.DeleteCommentHotNewsResult>> getDeleteCommentResult() {
        return null;
    }
    
    public final void requestDeleteReplyComment(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDeleteReplyComment, @org.jetbrains.annotations.NotNull()
    java.lang.String id, int positionComment, int positionReplyComment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteCommentHotNews.DeleteCommentHotNewsResult>> getDeleteReplyCommentResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get_idPost() {
        return null;
    }
    
    public final void set_idPost(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void requestListCommentHotNews(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListCommentHotNews, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.ListCommentHotNewsResult>> getListCommentHotNewsResult() {
        return null;
    }
    
    public final void requestListReplyComment(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListReplyComment, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListReplyCommentHotNews.ListReplyCommentHotNewsResult>> getListReplyCommentResult() {
        return null;
    }
    
    @javax.inject.Inject()
    public CommentHotNewsViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/viewmodel/CommentHotNewsViewModel$TYPE;", "", "(Ljava/lang/String;I)V", "REPLY_COMMENT", "REPLY_COMMENT_LV2", "app_debug"})
    public static enum TYPE {
        /*public static final*/ REPLY_COMMENT /* = new REPLY_COMMENT() */,
        /*public static final*/ REPLY_COMMENT_LV2 /* = new REPLY_COMMENT_LV2() */;
        
        TYPE() {
        }
    }
}