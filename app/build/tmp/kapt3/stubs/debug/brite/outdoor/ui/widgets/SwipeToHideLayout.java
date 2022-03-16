package brite.outdoor.ui.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u001eH\u0016J\u0010\u0010\u0016\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bH\u0016J0\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0014J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020(H\u0017J\u0012\u0010)\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010*\u001a\u00020\u001eH\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bH\u0016J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bH\u0002J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bH\u0002R\u0012\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lbrite/outdoor/ui/widgets/SwipeToHideLayout;", "Landroid/widget/FrameLayout;", "Lbrite/outdoor/ui/widgets/SwipeHideable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_x", "Ljava/lang/Integer;", "_xDelta", "_y", "_yDelta", "animating", "", "direction", "getDirection", "()I", "setDirection", "(I)V", "hide", "<set-?>", "isSlideEnabled", "()Z", "isVisible", "listener", "Lbrite/outdoor/ui/widgets/OnSwipeChangeListener;", "enable", "", "speed", "onLayout", "changed", "left", "top", "right", "bottom", "onTouchEvent", "ev", "Landroid/view/MotionEvent;", "setOnSwipeChangeListener", "show", "startHideAnimation", "startShowAnimation", "Companion", "app_debug"})
public final class SwipeToHideLayout extends android.widget.FrameLayout implements brite.outdoor.ui.widgets.SwipeHideable {
    private int _yDelta = 0;
    private int _xDelta = 0;
    private boolean hide = false;
    private boolean animating = false;
    private java.lang.Integer _y;
    private java.lang.Integer _x;
    
    /**
     * Sets direction of sliding
     *
     * @param direction direction constant from [SwipeToHideLayout]
     * @see SwipeToHideLayout directions constants
     */
    private int direction = 0;
    
    /**
     * Check if view is enable for swiping (touching)
     *
     * @return is enabled
     */
    private boolean isSlideEnabled = true;
    private brite.outdoor.ui.widgets.OnSwipeChangeListener listener;
    private static final java.lang.String TAG = null;
    
    /**
     * default no direction
     */
    public static final int DIRECTION_NOT_SET = 0;
    
    /**
     * left direction
     */
    public static final int DIRECTION_LEFT = 1;
    
    /**
     * top direction
     */
    public static final int DIRECTION_TOP = 2;
    
    /**
     * right direction
     */
    public static final int DIRECTION_RIGHT = 3;
    
    /**
     * bottom direction
     */
    public static final int DIRECTION_BOTTOM = 4;
    private static final int DEFAULT_SPEED = 300;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.widgets.SwipeToHideLayout.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getDirection() {
        return 0;
    }
    
    @java.lang.Override()
    public void setDirection(int p0) {
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    @java.lang.Override()
    public boolean isSlideEnabled() {
        return false;
    }
    
    /**
     * Shows view using default speed
     * Changes [android.view.View.getVisibility] param using animation
     */
    @java.lang.Override()
    public void show(int speed) {
    }
    
    @java.lang.Override()
    public void hide() {
    }
    
    /**
     * Hide view using default speed
     * Changes [android.view.View.getVisibility] param using animation
     */
    @java.lang.Override()
    public void hide(int speed) {
    }
    
    @java.lang.Override()
    public boolean isVisible() {
        return false;
    }
    
    /**
     * Enable/disable view for swiping (touching)
     *
     * @param enable enable/disable
     */
    @java.lang.Override()
    public void enable(boolean enable) {
    }
    
    /**
     * Sets on swipe change listener
     *
     * @param listener listener
     */
    @java.lang.Override()
    public void setOnSwipeChangeListener(@org.jetbrains.annotations.Nullable()
    brite.outdoor.ui.widgets.OnSwipeChangeListener listener) {
    }
    
    private final void startHideAnimation(int speed) {
    }
    
    private final void startShowAnimation(int speed) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent ev) {
        return false;
    }
    
    public SwipeToHideLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public SwipeToHideLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public SwipeToHideLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbrite/outdoor/ui/widgets/SwipeToHideLayout$Companion;", "", "()V", "DEFAULT_SPEED", "", "DIRECTION_BOTTOM", "DIRECTION_LEFT", "DIRECTION_NOT_SET", "DIRECTION_RIGHT", "DIRECTION_TOP", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}