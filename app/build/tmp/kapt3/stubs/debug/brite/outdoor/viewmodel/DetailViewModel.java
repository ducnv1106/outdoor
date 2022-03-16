package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010F\u001a\u00020GJ\u000e\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u001cJ\u0006\u0010J\u001a\u00020GJ\u000e\u0010K\u001a\u00020G2\u0006\u0010I\u001a\u00020\u001cJ*\u0010L\u001a\u00020G2\"\u0010L\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u0014J2\u0010M\u001a\u00020G2\"\u0010M\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00142\u0006\u0010N\u001a\u00020\u000fJ2\u0010O\u001a\u00020G2\"\u0010O\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00142\u0006\u0010N\u001a\u00020\u000fR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010\u0011\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0015\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0016\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R \u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\u001a\u0010/\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00101\"\u0004\b2\u00103R0\u00104\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020605j\b\u0012\u0004\u0012\u000206`70\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010)\"\u0004\b9\u0010+R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R&\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E\u00a8\u0006P"}, d2 = {"Lbrite/outdoor/viewmodel/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_bookMartResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseBookMart$BookMartResult;", "_deletePostResult", "Lbrite/outdoor/data/api_entities/response/ResponseDetailPost$DetailPostResult;", "_detailPostResult", "_postId", "", "_postIdDelete", "_requestBookMart", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_requestDeletePost", "_requestDetailPost", "bookMartResult", "getBookMartResult", "()Landroidx/lifecycle/LiveData;", "currentPlayingVideo", "Lkotlin/Pair;", "", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "getCurrentPlayingVideo", "()Lkotlin/Pair;", "setCurrentPlayingVideo", "(Lkotlin/Pair;)V", "deletePostResult", "getDeletePostResult", "detailPostResult", "getDetailPostResult", "entityNews", "Lbrite/outdoor/data/api_entities/response/ResponseDetailPost$DataDetail;", "getEntityNews", "()Landroidx/lifecycle/MutableLiveData;", "setEntityNews", "(Landroidx/lifecycle/MutableLiveData;)V", "idPost", "getIdPost", "setIdPost", "isNotification", "", "()Z", "setNotification", "(Z)V", "listContent", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/PostContentEntity;", "Lkotlin/collections/ArrayList;", "getListContent", "setListContent", "location", "Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;", "getLocation", "()Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;", "setLocation", "(Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;)V", "playersMap", "", "getPlayersMap", "()Ljava/util/Map;", "setPlayersMap", "(Ljava/util/Map;)V", "pauseCurrentPlayingVideo", "", "playIndexThenPausePreviousPlayer", "index", "releaseAllPlayers", "releaseRecycledPlayers", "requestBookMart", "requestDeletePost", "postId", "requestDetailPost", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private boolean isNotification = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.Integer, com.google.android.exoplayer2.SimpleExoPlayer> playersMap;
    @org.jetbrains.annotations.Nullable()
    private kotlin.Pair<java.lang.Integer, ? extends com.google.android.exoplayer2.SimpleExoPlayer> currentPlayingVideo;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> listContent;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.response.ResponseDetailPost.DataDetail> entityNews;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> idPost;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestBookMart = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseBookMart.BookMartResult>> _bookMartResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseBookMart.BookMartResult>> bookMartResult = null;
    private java.lang.String _postId = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDetailPost = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> _detailPostResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> detailPostResult = null;
    private java.lang.String _postIdDelete = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeletePost = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> _deletePostResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> deletePostResult = null;
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData location;
    private final com.google.gson.Gson gson = null;
    
    public final boolean isNotification() {
        return false;
    }
    
    public final void setNotification(boolean p0) {
    }
    
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
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> getListContent() {
        return null;
    }
    
    public final void setListContent(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.response.ResponseDetailPost.DataDetail> getEntityNews() {
        return null;
    }
    
    public final void setEntityNews(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.response.ResponseDetailPost.DataDetail> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getIdPost() {
        return null;
    }
    
    public final void setIdPost(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    public final void requestBookMart(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestBookMart) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseBookMart.BookMartResult>> getBookMartResult() {
        return null;
    }
    
    public final void requestDetailPost(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDetailPost, @org.jetbrains.annotations.NotNull()
    java.lang.String postId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> getDetailPostResult() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData p0) {
    }
    
    @javax.inject.Inject()
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
}