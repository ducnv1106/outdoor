package brite.outdoor.ui.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbrite/outdoor/ui/dialog/DialogCancel;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isCancelAble", "", "onClickYes", "Lbrite/outdoor/ui/dialog/DialogCancel$OnClickYes;", "show", "", "message", "", "cancelAble", "", "OnClickYes", "app_debug"})
public final class DialogCancel extends android.app.Dialog {
    private boolean isCancelAble = false;
    private brite.outdoor.ui.dialog.DialogCancel.OnClickYes onClickYes;
    
    public final void show(int message, boolean cancelAble, @org.jetbrains.annotations.NotNull()
    brite.outdoor.ui.dialog.DialogCancel.OnClickYes onClickYes) {
    }
    
    public final void show(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence message, boolean cancelAble, @org.jetbrains.annotations.NotNull()
    brite.outdoor.ui.dialog.DialogCancel.OnClickYes onClickYes) {
    }
    
    public DialogCancel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lbrite/outdoor/ui/dialog/DialogCancel$OnClickYes;", "", "onClickBtnYes", "", "app_debug"})
    public static abstract interface OnClickYes {
        
        public abstract void onClickBtnYes();
    }
}