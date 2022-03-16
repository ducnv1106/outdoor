package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010A\u001a\u00020BJ\u000e\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u0019J\u0006\u0010E\u001a\u00020BJ\u000e\u0010F\u001a\u00020B2\u0006\u0010D\u001a\u00020\u0019J*\u0010G\u001a\u00020B2\"\u0010G\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0011j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u0012J2\u0010H\u001a\u00020B2\"\u0010H\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0011j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u00122\u0006\u0010I\u001a\u00020\u000eR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010\u000f\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0011j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0013\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0011j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R0\u0010/\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020100j\b\u0012\u0004\u0012\u000201`20\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\u00a8\u0006J"}, d2 = {"Lbrite/outdoor/viewmodel/DetailHotNewsViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_bookMartResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseBookMart$BookMartResult;", "_detailPostResult", "Lbrite/outdoor/data/api_entities/response/ResponseDetailHotNews$DetailHotNewsResult;", "_postId", "", "_requestBookMart", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_requestDetailPost", "bookMartResult", "getBookMartResult", "()Landroidx/lifecycle/LiveData;", "currentPlayingVideo", "Lkotlin/Pair;", "", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "getCurrentPlayingVideo", "()Lkotlin/Pair;", "setCurrentPlayingVideo", "(Lkotlin/Pair;)V", "detailPostResult", "getDetailPostResult", "entityNews", "Lbrite/outdoor/data/api_entities/response/ResponseDetailHotNews$DetailPostHotNewsData;", "getEntityNews", "()Landroidx/lifecycle/MutableLiveData;", "setEntityNews", "(Landroidx/lifecycle/MutableLiveData;)V", "idPost", "getIdPost", "setIdPost", "isNotification", "", "()Z", "setNotification", "(Z)V", "listContent", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/PostContentHotNewsEntity;", "Lkotlin/collections/ArrayList;", "getListContent", "setListContent", "location", "Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;", "getLocation", "()Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;", "setLocation", "(Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;)V", "playersMap", "", "getPlayersMap", "()Ljava/util/Map;", "setPlayersMap", "(Ljava/util/Map;)V", "pauseCurrentPlayingVideo", "", "playIndexThenPausePreviousPlayer", "index", "releaseAllPlayers", "releaseRecycledPlayers", "requestBookMart", "requestDetailPost", "postId", "app_debug"})
public final class DetailHotNewsViewModel extends androidx.lifecycle.ViewModel {
    private boolean isNotification = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.Integer, com.google.android.exoplayer2.SimpleExoPlayer> playersMap;
    @org.jetbrains.annotations.Nullable()
    private kotlin.Pair<java.lang.Integer, ? extends com.google.android.exoplayer2.SimpleExoPlayer> currentPlayingVideo;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentHotNewsEntity>> listContent;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsData> entityNews;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> idPost;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestBookMart = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseBookMart.BookMartResult>> _bookMartResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseBookMart.BookMartResult>> bookMartResult = null;
    private java.lang.String _postId = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDetailPost = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailHotNewsResult>> _detailPostResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailHotNewsResult>> detailPostResult = null;
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
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentHotNewsEntity>> getListContent() {
        return null;
    }
    
    public final void setListContent(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentHotNewsEntity>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsData> getEntityNews() {
        return null;
    }
    
    public final void setEntityNews(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsData> p0) {
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
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailHotNewsResult>> getDetailPostResult() {
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
    public DetailHotNewsViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
}