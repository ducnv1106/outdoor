package brite.outdoor.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lbrite/outdoor/utils/KeyboardUtil;", "", "act", "Landroid/app/Activity;", "contentView", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;)V", "decorView", "onGlobalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "getOnGlobalLayoutListener", "()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "setOnGlobalLayoutListener", "(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V", "disable", "", "enable", "Companion", "app_debug"})
public final class KeyboardUtil {
    private final android.view.View decorView = null;
    @org.jetbrains.annotations.NotNull()
    private android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.utils.KeyboardUtil.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener getOnGlobalLayoutListener() {
        return null;
    }
    
    public final void setOnGlobalLayoutListener(@org.jetbrains.annotations.NotNull()
    android.view.ViewTreeObserver.OnGlobalLayoutListener p0) {
    }
    
    public final void enable() {
    }
    
    public final void disable() {
    }
    
    public KeyboardUtil(@org.jetbrains.annotations.NotNull()
    android.app.Activity act, @org.jetbrains.annotations.NotNull()
    android.view.View contentView) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lbrite/outdoor/utils/KeyboardUtil$Companion;", "", "()V", "hideKeyboard", "", "act", "Landroid/app/Activity;", "app_debug"})
    public static final class Companion {
        
        /**
         * Helper to hide the keyboard
         *
         * @param act
         */
        public final void hideKeyboard(@org.jetbrains.annotations.Nullable()
        android.app.Activity act) {
        }
        
        private Companion() {
            super();
        }
    }
}