package brite.outdoor.ui.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rJ,\u0010\u0007\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rJ \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbrite/outdoor/ui/dialog/DialogNotice;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isCancelAble", "", "show", "", "message", "", "cancelAble", "dismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "title", "", "app_debug"})
public final class DialogNotice extends android.app.Dialog {
    private boolean isCancelAble = false;
    
    public final void show(int message, boolean cancelAble, @org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnDismissListener dismissListener) {
    }
    
    public final void show(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence message, boolean cancelAble, @org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnDismissListener dismissListener) {
    }
    
    public final void show(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence message, boolean cancelAble, @org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnDismissListener dismissListener) {
    }
    
    public DialogNotice(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}