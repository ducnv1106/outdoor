package brite.outdoor.ui.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0011J\u001e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u001bR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lbrite/outdoor/ui/widgets/CustomLayoutInteractive;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageView", "Landroid/widget/ImageView;", "mContext", "textView", "Landroid/widget/TextView;", "init", "", "setColorText", "color", "", "setIcon", "resld", "setIconAndSize", "w", "h", "setSize", "size", "", "setText", "", "OnClickListener", "app_debug"})
public final class CustomLayoutInteractive extends androidx.constraintlayout.widget.ConstraintLayout {
    private android.widget.TextView textView;
    private android.widget.ImageView imageView;
    private android.content.Context mContext;
    private java.util.HashMap _$_findViewCache;
    
    private final void init(android.content.Context context) {
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String textView) {
    }
    
    public final void setIconAndSize(int resld, int w, int h) {
    }
    
    public final void setIcon(int resld) {
    }
    
    public final void setColorText(int color) {
    }
    
    public final void setSize(float size) {
    }
    
    public CustomLayoutInteractive(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public CustomLayoutInteractive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/ui/widgets/CustomLayoutInteractive$OnClickListener;", "", "onClick", "", "isClick", "", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(boolean isClick);
    }
}