package brite.outdoor.utils.binding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lbrite/outdoor/utils/binding/PlayerStateCallback;", "", "onFinishedPlaying", "", "player", "Lcom/google/android/exoplayer2/Player;", "onStartedPlaying", "onVideoBuffering", "onVideoDurationRetrieved", "duration", "", "app_debug"})
public abstract interface PlayerStateCallback {
    
    /**
     * Callback to when the [PlayerView] has fetched the duration of video
     */
    public abstract void onVideoDurationRetrieved(long duration, @org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.Player player);
    
    public abstract void onVideoBuffering(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.Player player);
    
    public abstract void onStartedPlaying(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.Player player);
    
    public abstract void onFinishedPlaying(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.Player player);
}