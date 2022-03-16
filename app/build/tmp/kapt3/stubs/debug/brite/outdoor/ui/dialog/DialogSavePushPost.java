package brite.outdoor.ui.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\fH\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lbrite/outdoor/ui/dialog/DialogSavePushPost;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isCancelAble", "", "listener", "Lbrite/outdoor/ui/dialog/DialogSavePushPost$OnListenerDialog;", "rlRoot", "Landroid/view/View;", "scaleValue", "", "tvConfirm", "Landroid/widget/TextView;", "tvDiscardPost", "tvKeepEditing", "tvSaveDraft", "tvTitle", "getScaleValue", "getSizeWithScale", "", "sizeDesign", "", "show", "", "OnListenerDialog", "app_debug"})
public final class DialogSavePushPost extends android.app.Dialog {
    private boolean isCancelAble = false;
    private android.widget.TextView tvTitle;
    private android.widget.TextView tvConfirm;
    private android.widget.TextView tvSaveDraft;
    private android.widget.TextView tvDiscardPost;
    private android.widget.TextView tvKeepEditing;
    private android.view.View rlRoot;
    private brite.outdoor.ui.dialog.DialogSavePushPost.OnListenerDialog listener;
    private float scaleValue = 0.0F;
    
    public final void show(boolean isCancelAble, @org.jetbrains.annotations.NotNull()
    brite.outdoor.ui.dialog.DialogSavePushPost.OnListenerDialog listener) {
    }
    
    private final float getScaleValue() {
        return 0.0F;
    }
    
    public final int getSizeWithScale(double sizeDesign) {
        return 0;
    }
    
    public DialogSavePushPost(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/ui/dialog/DialogSavePushPost$OnListenerDialog;", "", "onClickDiscardPost", "", "onClickKeepEditing", "onClickSaveDraft", "app_debug"})
    public static abstract interface OnListenerDialog {
        
        public abstract void onClickSaveDraft();
        
        public abstract void onClickDiscardPost();
        
        public abstract void onClickKeepEditing();
    }
}