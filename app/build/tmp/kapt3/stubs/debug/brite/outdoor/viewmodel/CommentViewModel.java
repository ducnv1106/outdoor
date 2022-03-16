package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J2\u0010.\u001a\u00020/2\"\u00100\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u00172\u0006\u00101\u001a\u00020\fJ2\u00102\u001a\u00020/2\"\u00103\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u00172\u0006\u00104\u001a\u00020\fJB\u00105\u001a\u00020/2\"\u00106\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u00172\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eJ2\u00108\u001a\u00020/2\"\u00108\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u00172\u0006\u00109\u001a\u00020\fR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010\u0014\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u00170\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0018\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u00170\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0019\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u00170\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u001a\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u00170\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010%\"\u0004\b&\u0010\'R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\"\u00a8\u0006:"}, d2 = {"Lbrite/outdoor/viewmodel/CommentViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_deleteCommentResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseDeleteComment$DeleteCommentResult;", "_idComment", "", "_listCommentLevel2Result", "Lbrite/outdoor/data/api_entities/response/ResponseListCommentLevel2$ListCommentLevel2Result;", "_listCommentResult", "Lbrite/outdoor/data/api_entities/response/ResponseListComment$ListCommentResult;", "_postCommentResult", "Lbrite/outdoor/data/api_entities/response/ResponsePostComment$PostCommentResult;", "_postId", "_requestComment", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_requestDeleteComment", "_requestListComment", "_requestListCommentLevel2", "_requestListImg", "Ljava/util/ArrayList;", "Lokhttp3/MultipartBody$Part;", "Lkotlin/collections/ArrayList;", "_threadId", "deleteCommentResult", "getDeleteCommentResult", "()Landroidx/lifecycle/LiveData;", "isPermissionReadWriteExternalStorage", "", "()Z", "setPermissionReadWriteExternalStorage", "(Z)V", "listCommentLevel2Result", "getListCommentLevel2Result", "listCommentResult", "getListCommentResult", "postCommentResult", "getPostCommentResult", "getListComment", "", "requestListComment", "postId", "getListCommentLevel2", "requestListCommentLevel2", "threadId", "postComment", "requestComment", "requestListImg", "requestDeleteComment", "idComment", "app_debug"})
public final class CommentViewModel extends androidx.lifecycle.ViewModel {
    private boolean isPermissionReadWriteExternalStorage = false;
    private java.lang.String _postId = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListComment = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentResult>> _listCommentResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentResult>> listCommentResult = null;
    private java.lang.String _threadId = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListCommentLevel2 = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListCommentLevel2.ListCommentLevel2Result>> _listCommentLevel2Result = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListCommentLevel2.ListCommentLevel2Result>> listCommentLevel2Result = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestComment = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<okhttp3.MultipartBody.Part>> _requestListImg = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponsePostComment.PostCommentResult>> _postCommentResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponsePostComment.PostCommentResult>> postCommentResult = null;
    private java.lang.String _idComment = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeleteComment = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteComment.DeleteCommentResult>> _deleteCommentResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteComment.DeleteCommentResult>> deleteCommentResult = null;
    private final com.google.gson.Gson gson = null;
    
    public final boolean isPermissionReadWriteExternalStorage() {
        return false;
    }
    
    public final void setPermissionReadWriteExternalStorage(boolean p0) {
    }
    
    public final void getListComment(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListComment, @org.jetbrains.annotations.NotNull()
    java.lang.String postId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentResult>> getListCommentResult() {
        return null;
    }
    
    public final void getListCommentLevel2(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListCommentLevel2, @org.jetbrains.annotations.NotNull()
    java.lang.String threadId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListCommentLevel2.ListCommentLevel2Result>> getListCommentLevel2Result() {
        return null;
    }
    
    public final void postComment(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestComment, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<okhttp3.MultipartBody.Part> requestListImg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponsePostComment.PostCommentResult>> getPostCommentResult() {
        return null;
    }
    
    public final void requestDeleteComment(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDeleteComment, @org.jetbrains.annotations.NotNull()
    java.lang.String idComment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteComment.DeleteCommentResult>> getDeleteCommentResult() {
        return null;
    }
    
    @javax.inject.Inject()
    public CommentViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
}