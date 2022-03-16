package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J2\u0010(\u001a\u00020)2\"\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u00142\u0006\u0010*\u001a\u00020\u0010J*\u0010+\u001a\u00020)2\"\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u0014J*\u0010,\u001a\u00020)2\"\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u0014R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010\u0011\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0015\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0016\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010 \u00a8\u0006-"}, d2 = {"Lbrite/outdoor/viewmodel/FollowViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_deletePostResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseDetailPost$DetailPostResult;", "_followUsersResult", "Lbrite/outdoor/data/api_entities/response/ResponseFollow$FollowResult;", "_listPostUserFollowResult", "Lbrite/outdoor/data/api_entities/response/ResponseListPostUser$ListPostUserResult;", "_postId", "", "_requestDeletePost", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_requestFollowUser", "_requestListPostUserFollow", "consumed", "Lbrite/outdoor/utils/SingleLiveEvent;", "", "getConsumed", "()Lbrite/outdoor/utils/SingleLiveEvent;", "setConsumed", "(Lbrite/outdoor/utils/SingleLiveEvent;)V", "deletePostResult", "getDeletePostResult", "()Landroidx/lifecycle/LiveData;", "entityNew", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "getEntityNew", "followUserResult", "getFollowUserResult", "listPostUserFollowResult", "getListPostUserFollowResult", "requestDeletePost", "", "postId", "requestFollowUser", "requestListPostUserFollow", "app_debug"})
public final class FollowViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private brite.outdoor.utils.SingleLiveEvent<java.lang.Boolean> consumed;
    @org.jetbrains.annotations.NotNull()
    private final brite.outdoor.utils.SingleLiveEvent<brite.outdoor.data.api_entities.response.ListPostUserData> entityNew = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestFollowUser = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseFollow.FollowResult>> _followUsersResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseFollow.FollowResult>> followUserResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListPostUserFollow = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> _listPostUserFollowResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> listPostUserFollowResult = null;
    private java.lang.String _postId = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeletePost = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> _deletePostResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> deletePostResult = null;
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.utils.SingleLiveEvent<java.lang.Boolean> getConsumed() {
        return null;
    }
    
    public final void setConsumed(@org.jetbrains.annotations.NotNull()
    brite.outdoor.utils.SingleLiveEvent<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.utils.SingleLiveEvent<brite.outdoor.data.api_entities.response.ListPostUserData> getEntityNew() {
        return null;
    }
    
    public final void requestFollowUser(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestFollowUser) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseFollow.FollowResult>> getFollowUserResult() {
        return null;
    }
    
    public final void requestListPostUserFollow(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListPostUserFollow) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> getListPostUserFollowResult() {
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
    public FollowViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
}