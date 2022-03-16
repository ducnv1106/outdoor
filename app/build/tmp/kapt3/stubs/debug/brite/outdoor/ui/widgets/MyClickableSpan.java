package brite.outdoor.ui.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0006\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lbrite/outdoor/ui/widgets/MyClickableSpan;", "Landroid/text/style/ClickableSpan;", "context", "Landroid/content/Context;", "textColor", "", "onClick", "Lkotlin/Function0;", "", "(Landroid/content/Context;ILkotlin/jvm/functions/Function0;)V", "typeface", "Landroid/graphics/Typeface;", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "app_debug"})
public final class MyClickableSpan extends android.text.style.ClickableSpan {
    private int textColor = 0;
    private android.graphics.Typeface typeface;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick = null;
    
    @java.lang.Override()
    public void updateDrawState(@org.jetbrains.annotations.NotNull()
    android.text.TextPaint ds) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View widget) {
    }
    
    public MyClickableSpan(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int textColor, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        super();
    }
}