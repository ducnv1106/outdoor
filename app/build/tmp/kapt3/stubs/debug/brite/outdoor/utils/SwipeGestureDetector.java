package brite.outdoor.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J6\u0010\u0007\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lbrite/outdoor/utils/SwipeGestureDetector;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "()V", "swipeCallback", "Lbrite/outdoor/utils/SwipeGestureDetector$SwipeCallback;", "getSwipeCallback", "()Lbrite/outdoor/utils/SwipeGestureDetector$SwipeCallback;", "setSwipeCallback", "(Lbrite/outdoor/utils/SwipeGestureDetector$SwipeCallback;)V", "onFling", "", "e1", "Landroid/view/MotionEvent;", "e2", "velocityX", "", "velocityY", "", "left", "Lkotlin/Function0;", "right", "top", "Companion", "SwipeCallback", "app_debug"})
public final class SwipeGestureDetector extends android.view.GestureDetector.SimpleOnGestureListener {
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.utils.SwipeGestureDetector.SwipeCallback swipeCallback;
    private static final int MIN_SWIPE_DISTANCE_X = 100;
    private static final int MIN_SWIPE_DISTANCE_Y = 100;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.utils.SwipeGestureDetector.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.utils.SwipeGestureDetector.SwipeCallback getSwipeCallback() {
        return null;
    }
    
    public final void setSwipeCallback(@org.jetbrains.annotations.Nullable()
    brite.outdoor.utils.SwipeGestureDetector.SwipeCallback p0) {
    }
    
    @java.lang.Override()
    public boolean onFling(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e1, @org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
    
    public final void setSwipeCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> left, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> right, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> top) {
    }
    
    public SwipeGestureDetector() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/utils/SwipeGestureDetector$SwipeCallback;", "", "onLeftSwipe", "", "onRightSwipe", "onTopSwipe", "app_debug"})
    public static abstract interface SwipeCallback {
        
        public abstract void onLeftSwipe();
        
        public abstract void onRightSwipe();
        
        public abstract void onTopSwipe();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/utils/SwipeGestureDetector$Companion;", "", "()V", "MIN_SWIPE_DISTANCE_X", "", "MIN_SWIPE_DISTANCE_Y", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}