package brite.outdoor.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u0004H&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbrite/outdoor/utils/AppBarStateChangeListener;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "()V", "mCurrentState", "", "onOffsetChanged", "", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "i", "onStateChanged", "state", "Companion", "app_debug"})
public abstract class AppBarStateChangeListener implements com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener {
    private int mCurrentState = 2;
    public static final int EXPANDED = 0;
    public static final int COLLAPSED = 1;
    public static final int IDLE = 2;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.utils.AppBarStateChangeListener.Companion Companion = null;
    
    @java.lang.Override()
    public void onOffsetChanged(@org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.AppBarLayout appBarLayout, int i) {
    }
    
    public abstract void onStateChanged(@org.jetbrains.annotations.Nullable()
    com.google.android.material.appbar.AppBarLayout appBarLayout, int state);
    
    public AppBarStateChangeListener() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lbrite/outdoor/utils/AppBarStateChangeListener$Companion;", "", "()V", "COLLAPSED", "", "EXPANDED", "IDLE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}