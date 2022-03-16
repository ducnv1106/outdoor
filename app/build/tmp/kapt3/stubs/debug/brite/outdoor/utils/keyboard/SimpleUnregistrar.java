package brite.outdoor.utils.keyboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbrite/outdoor/utils/keyboard/SimpleUnregistrar;", "Lbrite/outdoor/utils/keyboard/Unregistrar;", "activity", "Landroid/app/Activity;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "onGlobalLayoutListenerWeakReference", "unregister", "", "app_debug"})
public final class SimpleUnregistrar implements brite.outdoor.utils.keyboard.Unregistrar {
    private final java.lang.ref.WeakReference<android.app.Activity> activityWeakReference = null;
    private final java.lang.ref.WeakReference<android.view.ViewTreeObserver.OnGlobalLayoutListener> onGlobalLayoutListenerWeakReference = null;
    
    @java.lang.Override()
    public void unregister() {
    }
    
    public SimpleUnregistrar(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.view.ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener) {
        super();
    }
}