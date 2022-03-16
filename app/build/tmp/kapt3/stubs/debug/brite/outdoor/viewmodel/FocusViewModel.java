package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u00104\u001a\u000205J\u000e\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u0019J\u0006\u00108\u001a\u000205J\u000e\u00109\u001a\u0002052\u0006\u00107\u001a\u00020\u0019J2\u0010:\u001a\u0002052\"\u0010:\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u00142\u0006\u0010;\u001a\u00020\u0010J*\u0010<\u001a\u0002052\"\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u0014J*\u0010=\u001a\u0002052\"\u0010=\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u0014R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010\u0011\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0015\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0016\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0013j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001d\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010!R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002020#\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010&\u00a8\u0006>"}, d2 = {"Lbrite/outdoor/viewmodel/FocusViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_deletePostResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseDetailPost$DetailPostResult;", "_followUsersResult", "Lbrite/outdoor/data/api_entities/response/ResponseFollow$FollowResult;", "_listPostFocusResult", "Lbrite/outdoor/data/api_entities/response/ResponseListPostUser$ListPostUserResult;", "_postId", "", "_requestDeletePost", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_requestFollowUser", "_requestListPostFocus", "currentPlayingVideo", "Lkotlin/Pair;", "", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "getCurrentPlayingVideo", "()Lkotlin/Pair;", "setCurrentPlayingVideo", "(Lkotlin/Pair;)V", "deletePostResult", "getDeletePostResult", "()Landroidx/lifecycle/LiveData;", "entityNew", "Lbrite/outdoor/utils/SingleLiveEvent;", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "getEntityNew", "()Lbrite/outdoor/utils/SingleLiveEvent;", "followUserResult", "getFollowUserResult", "listPostFocusResult", "getListPostFocusResult", "playersMap", "", "getPlayersMap", "()Ljava/util/Map;", "setPlayersMap", "(Ljava/util/Map;)V", "resultLoadMore", "Lbrite/outdoor/data/api_entities/response/ListPostUserResponse;", "getResultLoadMore", "pauseCurrentPlayingVideo", "", "playIndexThenPausePreviousPlayer", "index", "releaseAllPlayers", "releaseRecycledPlayers", "requestDeletePost", "postId", "requestFollowUser", "requestListPostFocus", "app_debug"})
public final class FocusViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.Integer, com.google.android.exoplayer2.SimpleExoPlayer> playersMap;
    @org.jetbrains.annotations.Nullable()
    private kotlin.Pair<java.lang.Integer, ? extends com.google.android.exoplayer2.SimpleExoPlayer> currentPlayingVideo;
    @org.jetbrains.annotations.NotNull()
    private final brite.outdoor.utils.SingleLiveEvent<brite.outdoor.data.api_entities.response.ListPostUserResponse> resultLoadMore = null;
    @org.jetbrains.annotations.NotNull()
    private final brite.outdoor.utils.SingleLiveEvent<brite.outdoor.data.api_entities.response.ListPostUserData> entityNew = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestFollowUser = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseFollow.FollowResult>> _followUsersResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseFollow.FollowResult>> followUserResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListPostFocus = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> _listPostFocusResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> listPostFocusResult = null;
    private java.lang.String _postId = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeletePost = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> _deletePostResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> deletePostResult = null;
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, com.google.android.exoplayer2.SimpleExoPlayer> getPlayersMap() {
        return null;
    }
    
    public final void setPlayersMap(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, com.google.android.exoplayer2.SimpleExoPlayer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<java.lang.Integer, com.google.android.exoplayer2.SimpleExoPlayer> getCurrentPlayingVideo() {
        return null;
    }
    
    public final void setCurrentPlayingVideo(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.Integer, ? extends com.google.android.exoplayer2.SimpleExoPlayer> p0) {
    }
    
    public final void releaseAllPlayers() {
    }
    
    public final void releaseRecycledPlayers(int index) {
    }
    
    public final void pauseCurrentPlayingVideo() {
    }
    
    public final void playIndexThenPausePreviousPlayer(int index) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.utils.SingleLiveEvent<brite.outdoor.data.api_entities.response.ListPostUserResponse> getResultLoadMore() {
        return null;
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
    
    public final void requestListPostFocus(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListPostFocus) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> getListPostFocusResult() {
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
    public FocusViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
}