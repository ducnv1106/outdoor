package brite.outdoor.utils.keyboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006\u0014"}, d2 = {"Lbrite/outdoor/utils/keyboard/KeyboardVisibilityEvent;", "", "()V", "getActivityRoot", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "getActivityRoot$app_debug", "getContentRoot", "Landroid/view/ViewGroup;", "isKeyboardVisible", "", "registerEventListener", "Lbrite/outdoor/utils/keyboard/Unregistrar;", "listener", "Lbrite/outdoor/utils/keyboard/KeyboardVisibilityEventListener;", "setEventListener", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "app_debug"})
public final class KeyboardVisibilityEvent {
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.utils.keyboard.KeyboardVisibilityEvent INSTANCE = null;
    
    /**
     * Set keyboard visibility event listener.
     * This automatically removes registered event listener when lifecycle owner is destroyed.
     * This function is intended to be used by fragments so the listener is removed when fragment
     * is no longer displayed. Prevents fragment leaks and crashes.
     *
     * @param activity Activity on which the keyboard changes are to be detected
     * @param lifecycleOwner Owner of the lifecycle who's destruction causes the event to be
     * automatically unregistered. Typically a fragment.
     * @param listener Event listener
     */
    @kotlin.Suppress(names = {"unused"})
    public static final void setEventListener(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    brite.outdoor.utils.keyboard.KeyboardVisibilityEventListener listener) {
    }
    
    /**
     * Set keyboard visibility change event listener.
     * This automatically remove registered event listener when the Activity is destroyed
     *
     * @param activity Activity
     * @param listener KeyboardVisibilityEventListener
     */
    @kotlin.Suppress(names = {"unused"})
    public static final void setEventListener(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    brite.outdoor.utils.keyboard.KeyboardVisibilityEventListener listener) {
    }
    
    /**
     * Set keyboard visibility change event listener.
     *
     * @param activity Activity
     * @param listener KeyboardVisibilityEventListener
     * @return Unregistrar
     */
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.utils.keyboard.Unregistrar registerEventListener(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    brite.outdoor.utils.keyboard.KeyboardVisibilityEventListener listener) {
        return null;
    }
    
    /**
     * Determine if keyboard is visible
     *
     * @param activity Activity
     * @return Whether keyboard is visible or not
     */
    public final boolean isKeyboardVisible(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getActivityRoot$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return null;
    }
    
    private final android.view.ViewGroup getContentRoot(android.app.Activity activity) {
        return null;
    }
    
    private KeyboardVisibilityEvent() {
        super();
    }
}