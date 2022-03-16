package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u001e\u001a\u00020\u001f2\"\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0011j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u0012J2\u0010 \u001a\u00020\u001f2\"\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0011j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u00122\u0006\u0010!\u001a\u00020\u000eJ*\u0010\"\u001a\u00020\u001f2\"\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0011j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u0012R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010\u000f\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0011j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0013\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0011j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0014\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0011j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019\u00a8\u0006#"}, d2 = {"Lbrite/outdoor/viewmodel/MyBookmarkViewModel;", "Lbrite/outdoor/viewmodel/LoadingInPageViewModel;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "gson", "Lcom/google/gson/Gson;", "(Lbrite/outdoor/data/remote/ApiController;Lcom/google/gson/Gson;)V", "_bookMartResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseBookMart$BookMartResult;", "_deletePostResult", "Lbrite/outdoor/data/api_entities/response/ResponseDetailPost$DetailPostResult;", "_postId", "", "_requestBookMart", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_requestDeletePost", "_requestUnBookMark", "_unBookMarkResult", "Lbrite/outdoor/data/api_entities/response/ResponseUnBookMark$UnBookMarkResult;", "bookMartResult", "getBookMartResult", "()Landroidx/lifecycle/LiveData;", "deletePostResult", "getDeletePostResult", "unBookMarkResult", "getUnBookMarkResult", "requestBookMart", "", "requestDeletePost", "postId", "requestUnBookMark", "app_debug"})
public final class MyBookmarkViewModel extends brite.outdoor.viewmodel.LoadingInPageViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestUnBookMark = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseUnBookMark.UnBookMarkResult>> _unBookMarkResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseUnBookMark.UnBookMarkResult>> unBookMarkResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestBookMart = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseBookMart.BookMartResult>> _bookMartResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseBookMart.BookMartResult>> bookMartResult = null;
    private java.lang.String _postId = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeletePost = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> _deletePostResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> deletePostResult = null;
    private final com.google.gson.Gson gson = null;
    
    public final void requestUnBookMark(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestUnBookMark) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseUnBookMark.UnBookMarkResult>> getUnBookMarkResult() {
        return null;
    }
    
    public final void requestBookMart(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestBookMart) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseBookMart.BookMartResult>> getBookMartResult() {
        return null;
    }
    
    public final void requestDeletePost(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDeletePost, @org.jetbrains.annotations.NotNull()
    java.lang.String postId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> getDeletePostResult() {
        return null;
    }
    
    @javax.inject.Inject()
    public MyBookmarkViewModel(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        super();
    }
}