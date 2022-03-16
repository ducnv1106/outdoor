package brite.outdoor.ui.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lbrite/outdoor/ui/dialog/BaseDialog;", "Landroid/app/Dialog;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getMContext", "()Landroid/content/Context;", "scaleValue", "", "getRealSize", "Lbrite/outdoor/utils/ViewSize;", "sizeDesign", "getScaleValue", "getSizeWithScale", "", "", "getSizeWithScaleFloat", "app_debug"})
public abstract class BaseDialog extends android.app.Dialog {
    private float scaleValue = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    
    private final float getScaleValue() {
        return 0.0F;
    }
    
    public final int getSizeWithScale(double sizeDesign) {
        return 0;
    }
    
    public final float getSizeWithScaleFloat(double sizeDesign) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.utils.ViewSize getRealSize(@org.jetbrains.annotations.NotNull()
    brite.outdoor.utils.ViewSize sizeDesign) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public BaseDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super(null);
    }
}