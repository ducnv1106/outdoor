package brite.outdoor.ui.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\tR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lbrite/outdoor/ui/dialog/DialogExit;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "btnCancel", "Landroid/widget/TextView;", "btnOk", "isCancelAble", "", "listener", "Lbrite/outdoor/ui/dialog/DialogExit$CallbackListenerExit;", "rlRoot", "Landroid/view/View;", "scaleValue", "", "tvConfirm", "tvTitle", "getScaleValue", "getSizeWithScale", "", "sizeDesign", "", "show", "", "title", "", "confirm", "isHideTitle", "CallbackListenerExit", "app_debug"})
public final class DialogExit extends android.app.Dialog {
    private boolean isCancelAble = false;
    private android.widget.TextView tvTitle;
    private android.widget.TextView tvConfirm;
    private android.widget.TextView btnOk;
    private android.widget.TextView btnCancel;
    private android.view.View rlRoot;
    private brite.outdoor.ui.dialog.DialogExit.CallbackListenerExit listener;
    private float scaleValue = 0.0F;
    
    public final void show(boolean isCancelAble, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String confirm, @org.jetbrains.annotations.NotNull()
    brite.outdoor.ui.dialog.DialogExit.CallbackListenerExit listener, boolean isHideTitle) {
    }
    
    private final float getScaleValue() {
        return 0.0F;
    }
    
    public final int getSizeWithScale(double sizeDesign) {
        return 0;
    }
    
    public DialogExit(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/ui/dialog/DialogExit$CallbackListenerExit;", "", "onCancel", "", "onOk", "app_debug"})
    public static abstract interface CallbackListenerExit {
        
        public abstract void onOk();
        
        public abstract void onCancel();
    }
}