package brite.outdoor.ui.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0007H\u0016R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lbrite/outdoor/ui/widgets/LimitedEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "maxCharacters", "maxLines", "getMaxCharacters", "getMaxLines", "onFinishInflate", "", "setMaxCharacters", "setMaxLines", "app_debug"})
public final class LimitedEditText extends androidx.appcompat.widget.AppCompatEditText {
    private int maxLines = 2;
    private int maxCharacters = 80;
    private java.util.HashMap _$_findViewCache;
    
    public final int getMaxCharacters() {
        return 0;
    }
    
    public final void setMaxCharacters(int maxCharacters) {
    }
    
    @java.lang.Override()
    public int getMaxLines() {
        return 0;
    }
    
    @java.lang.Override()
    public void setMaxLines(int maxLines) {
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    public LimitedEditText(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public LimitedEditText(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public LimitedEditText(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
}