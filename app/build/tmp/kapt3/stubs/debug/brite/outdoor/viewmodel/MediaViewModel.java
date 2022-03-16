package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001fH\u0002J\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fJ\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\tJ\u0006\u0010%\u001a\u00020\u001fJ\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\tJ\u0016\u0010\'\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\t2\u0006\u0010(\u001a\u00020)R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0010\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a\u00a8\u0006*"}, d2 = {"Lbrite/outdoor/viewmodel/MediaViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "currentPlayingVideo", "Lkotlin/Pair;", "", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "getCurrentPlayingVideo", "()Lkotlin/Pair;", "setCurrentPlayingVideo", "(Lkotlin/Pair;)V", "currentView", "Landroid/view/View;", "getCurrentView", "setCurrentView", "mHandler", "Landroid/os/Handler;", "playersMap", "", "getPlayersMap", "()Ljava/util/Map;", "setPlayersMap", "(Ljava/util/Map;)V", "viewCloseMap", "getViewCloseMap", "setViewCloseMap", "handlerMemoryLeaks", "", "hideIndexViewClose", "pauseAllVideo", "pauseCurrentPlayingVideo", "playIndexThenPausePreviousPlayer", "index", "releaseAllPlayers", "releaseRecycledPlayers", "showIndexViewClose", "context", "Landroid/content/Context;", "app_debug"})
public final class MediaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.Integer, com.google.android.exoplayer2.SimpleExoPlayer> playersMap;
    @org.jetbrains.annotations.Nullable()
    private kotlin.Pair<java.lang.Integer, ? extends com.google.android.exoplayer2.SimpleExoPlayer> currentPlayingVideo;
    private android.os.Handler mHandler;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.Integer, android.view.View> viewCloseMap;
    @org.jetbrains.annotations.Nullable()
    private kotlin.Pair<java.lang.Integer, ? extends android.view.View> currentView;
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
    
    public final void pauseAllVideo() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, android.view.View> getViewCloseMap() {
        return null;
    }
    
    public final void setViewCloseMap(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, android.view.View> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<java.lang.Integer, android.view.View> getCurrentView() {
        return null;
    }
    
    public final void setCurrentView(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.Integer, ? extends android.view.View> p0) {
    }
    
    private final void hideIndexViewClose() {
    }
    
    public final void showIndexViewClose(int index, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void handlerMemoryLeaks() {
    }
    
    @javax.inject.Inject()
    public MediaViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
}