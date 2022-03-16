package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J2\u0010\u001f\u001a\u00020 2\"\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00142\u0006\u0010!\u001a\u00020\u000fJ2\u0010\"\u001a\u00020 2\"\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00142\u0006\u0010$\u001a\u00020\u000fJ2\u0010%\u001a\u00020 2\"\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00142\u0006\u0010&\u001a\u00020\u000fR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010\u0011\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0015\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0016\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001a\u00a8\u0006\'"}, d2 = {"Lbrite/outdoor/viewmodel/ListPostLocationViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_deletePostResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseDetailPost$DetailPostResult;", "_listPostLocationResult", "Lbrite/outdoor/data/api_entities/response/ResponseListPostUser$ListPostUserResult;", "_listPostUtensilsResult", "_locationId", "", "_postId", "_requestDeletePost", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_requestListPostLocation", "_requestListPostUtensils", "_utensilsId", "deletePostResult", "getDeletePostResult", "()Landroidx/lifecycle/LiveData;", "listPostLocationResult", "getListPostLocationResult", "listPostUtensilsResult", "getListPostUtensilsResult", "requestDeletePost", "", "postId", "requestListPostLocation", "requestListLocationPost", "locationId", "requestListPostUtensils", "utensilsId", "app_debug"})
public final class ListPostLocationViewModel extends androidx.lifecycle.ViewModel {
    private java.lang.String _locationId = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListPostLocation = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> _listPostLocationResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> listPostLocationResult = null;
    private java.lang.String _utensilsId = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListPostUtensils = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> _listPostUtensilsResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> listPostUtensilsResult = null;
    private java.lang.String _postId = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeletePost = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> _deletePostResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> deletePostResult = null;
    private final com.google.gson.Gson gson = null;
    
    public final void requestListPostLocation(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListLocationPost, @org.jetbrains.annotations.NotNull()
    java.lang.String locationId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> getListPostLocationResult() {
        return null;
    }
    
    public final void requestListPostUtensils(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListPostUtensils, @org.jetbrains.annotations.NotNull()
    java.lang.String utensilsId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> getListPostUtensilsResult() {
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
    public ListPostLocationViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
}