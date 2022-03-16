package brite.outdoor.ui.widgets.anchorbottomsheet;

import java.lang.System;

/**
 * An interaction behavior plugin for a child view of [CoordinatorLayout] to make it work as
 * a bottom sheet.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 \u0091\u0001*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\f\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020 J(\u0010^\u001a\u00020\\2\u0006\u0010_\u001a\u00020\u00022\u0006\u0010`\u001a\u00020)2\u0006\u0010a\u001a\u00020)2\u0006\u0010b\u001a\u00020cH\u0002J\u000e\u0010d\u001a\u00020\\2\u0006\u0010e\u001a\u00020\u0011J\u0014\u0010f\u001a\u0004\u0018\u00010\u00022\b\u0010g\u001a\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010h\u001a\u00020\\J%\u0010i\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020k2\u0006\u0010_\u001a\u00028\u00002\u0006\u0010l\u001a\u00020mH\u0016\u00a2\u0006\u0002\u0010nJ%\u0010o\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020k2\u0006\u0010_\u001a\u00028\u00002\u0006\u0010p\u001a\u00020\u0011H\u0016\u00a2\u0006\u0002\u0010qJ5\u0010r\u001a\u00020\u000b2\u0006\u0010s\u001a\u00020k2\u0006\u0010_\u001a\u00028\u00002\u0006\u0010t\u001a\u00020\u00022\u0006\u0010u\u001a\u00020)2\u0006\u0010v\u001a\u00020)H\u0016\u00a2\u0006\u0002\u0010wJ=\u0010x\u001a\u00020\\2\u0006\u0010s\u001a\u00020k2\u0006\u0010_\u001a\u00028\u00002\u0006\u0010t\u001a\u00020\u00022\u0006\u0010y\u001a\u00020\u00112\u0006\u0010z\u001a\u00020\u00112\u0006\u0010{\u001a\u00020cH\u0016\u00a2\u0006\u0002\u0010|J%\u0010}\u001a\u00020\\2\u0006\u0010j\u001a\u00020k2\u0006\u0010_\u001a\u00028\u00002\u0006\u0010X\u001a\u00020~H\u0016\u00a2\u0006\u0002\u0010\u007fJ!\u0010\u0080\u0001\u001a\u0004\u0018\u00010~2\u0006\u0010j\u001a\u00020k2\u0006\u0010_\u001a\u00028\u0000H\u0016\u00a2\u0006\u0003\u0010\u0081\u0001J9\u0010\u0082\u0001\u001a\u00020\u000b2\u0006\u0010s\u001a\u00020k2\u0006\u0010_\u001a\u00028\u00002\u0007\u0010\u0083\u0001\u001a\u00020\u00022\u0006\u0010t\u001a\u00020\u00022\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0016\u00a2\u0006\u0003\u0010\u0085\u0001J\'\u0010\u0086\u0001\u001a\u00020\\2\u0006\u0010s\u001a\u00020k2\u0006\u0010_\u001a\u00028\u00002\u0006\u0010t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0003\u0010\u0087\u0001J&\u0010\u0088\u0001\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020k2\u0006\u0010_\u001a\u00028\u00002\u0006\u0010l\u001a\u00020mH\u0016\u00a2\u0006\u0002\u0010nJ\u000f\u0010\u0089\u0001\u001a\u00020\\2\u0006\u0010]\u001a\u00020 J\t\u0010\u008a\u0001\u001a\u00020\\H\u0002J\u0011\u0010\u008b\u0001\u001a\u00020\\2\b\b\u0001\u0010X\u001a\u00020\u0011J\u0017\u0010\u008c\u0001\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u00022\u0006\u0010a\u001a\u00020)J\u0017\u0010\u008d\u0001\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u00022\u0006\u0010a\u001a\u00020)J\u0017\u0010\u008e\u0001\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u00022\u0006\u0010a\u001a\u00020)J\u0017\u0010\u008f\u0001\u001a\u00020\\2\u0006\u0010_\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u001a\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u000e\u0010\u001d\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b\'\u0010\u0015R\u000e\u0010(\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R\u000e\u0010-\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0013\"\u0004\b7\u0010\u0015R\u000e\u00108\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010:\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0013\"\u0004\b=\u0010\u0015R\u001a\u0010>\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\r\"\u0004\b@\u0010\u000fR\u0010\u0010A\u001a\u0004\u0018\u00010BX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010I\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u00102\"\u0004\bK\u00104R$\u0010L\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\u00118F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bM\u0010\u0013\"\u0004\bN\u0010\u0015R \u0010P\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118G@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0013R\u001a\u0010R\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\r\"\u0004\bT\u0010\u000fR\u001a\u0010U\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\r\"\u0004\bW\u0010\u000fR$\u0010X\u001a\u00020\u00112\u0006\u0010X\u001a\u00020\u00118G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bY\u0010\u0013\"\u0004\bZ\u0010\u0015\u00a8\u0006\u0096\u0001"}, d2 = {"Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior;", "V", "Landroid/view/View;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "()V", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "allowUserDragging", "", "getAllowUserDragging", "()Z", "setAllowUserDragging", "(Z)V", "anchorOffset", "", "getAnchorOffset", "()I", "setAnchorOffset", "(I)V", "isDisableExpanded", "setDisableExpanded", "isHideable", "setHideable", "mActivePointerId", "getMActivePointerId", "setMActivePointerId", "mAnchorOffset", "mCallbacks", "", "Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior$BottomSheetCallback;", "mDragCallback", "Landroidx/customview/widget/ViewDragHelper$Callback;", "mIgnoreEvents", "mInitialY", "mMaxOffset", "getMMaxOffset", "setMMaxOffset", "mMaximumVelocity", "", "mMinOffset", "getMMinOffset", "setMMinOffset", "mMinimumVelocity", "mNestedScrolled", "mNestedScrollingChildRef", "Ljava/lang/ref/WeakReference;", "getMNestedScrollingChildRef", "()Ljava/lang/ref/WeakReference;", "setMNestedScrollingChildRef", "(Ljava/lang/ref/WeakReference;)V", "mParentHeight", "getMParentHeight", "setMParentHeight", "mPeekHeight", "mPeekHeightAuto", "mState", "getMState$annotations", "getMState", "setMState", "mTouchingScrollingChild", "getMTouchingScrollingChild", "setMTouchingScrollingChild", "mVelocityTracker", "Landroid/view/VelocityTracker;", "mViewDragHelper", "Landroidx/customview/widget/ViewDragHelper;", "getMViewDragHelper", "()Landroidx/customview/widget/ViewDragHelper;", "setMViewDragHelper", "(Landroidx/customview/widget/ViewDragHelper;)V", "mViewRef", "getMViewRef", "setMViewRef", "peekHeight", "getPeekHeight", "setPeekHeight", "<set-?>", "peekHeightMin", "getPeekHeightMin", "skipAnchored", "getSkipAnchored", "setSkipAnchored", "skipCollapsed", "getSkipCollapsed", "setSkipCollapsed", "state", "getState", "setState", "addBottomSheetCallback", "", "callback", "calculateTopAndTargetState", "child", "xvel", "yvel", "out", "", "dispatchOnSlide", "top", "findScrollingChild", "view", "invalidateScrollingChild", "onInterceptTouchEvent", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "event", "Landroid/view/MotionEvent;", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z", "onLayoutChild", "layoutDirection", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z", "onNestedPreFling", "coordinatorLayout", "target", "velocityX", "velocityY", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z", "onNestedPreScroll", "dx", "dy", "consumed", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[I)V", "onRestoreInstanceState", "Landroid/os/Parcelable;", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V", "onSaveInstanceState", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;", "onStartNestedScroll", "directTargetChild", "nestedScrollAxes", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;I)Z", "onStopNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)V", "onTouchEvent", "removeBottomSheetCallback", "reset", "setStateInternal", "shouldCollapse", "shouldExpand", "shouldHide", "startSettlingAnimation", "BottomSheetCallback", "Companion", "SavedState", "SettleRunnable", "SimpleBottomSheetCallback", "State", "app_debug"})
public final class AnchorBottomSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    private float mMinimumVelocity = 0.0F;
    private float mMaximumVelocity = 0.0F;
    private int mPeekHeight = 0;
    private boolean mPeekHeightAuto = false;
    private int peekHeightMin = 0;
    private int mAnchorOffset = 0;
    private boolean allowUserDragging = true;
    private int mMinOffset = 0;
    private int mMaxOffset = 0;
    
    /**
     * Sets whether this bottom sheet can hide when it is swiped down.
     *
     * @param hideable `true` to make this bottom sheet hideable.
     * @attr ref android.support.design.R.styleable#BottomSheetBehavior_Layout_behavior_hideable
     */
    private boolean isHideable = false;
    
    /**
     * Sets whether this bottom sheet should skip the collapsed state when it is being hidden
     * after it is expanded once. Setting this to true has no effect unless the sheet is hideable.
     *
     * @param skipCollapsed True if the bottom sheet should skip the collapsed state.
     * @attr ref android.support.design.R.styleable#BottomSheetBehavior_Layout_behavior_skipCollapsed
     */
    private boolean skipCollapsed = false;
    
    /**
     * Sets whether this bottom sheet should skip the anchored state when it is being collapsed from
     * an expanded state or when it is being expanded from a collapsed state.
     *
     * @param skipAnchored True if the bottom sheet should skip the anchored state.
     * @attr ref R.styleable#AnchorBottomSheetBehavior_Layout_behavior_skipAnchored
     */
    private boolean skipAnchored = false;
    private boolean isDisableExpanded = false;
    private int mState = 4;
    @org.jetbrains.annotations.Nullable()
    private androidx.customview.widget.ViewDragHelper mViewDragHelper;
    private boolean mIgnoreEvents = false;
    private boolean mNestedScrolled = false;
    private int mParentHeight = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.ref.WeakReference<V> mViewRef;
    @org.jetbrains.annotations.Nullable()
    private java.lang.ref.WeakReference<android.view.View> mNestedScrollingChildRef;
    private final java.util.List<brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.BottomSheetCallback> mCallbacks = null;
    private android.view.VelocityTracker mVelocityTracker;
    private int mActivePointerId = 0;
    private int mInitialY = 0;
    private boolean mTouchingScrollingChild = false;
    private final androidx.customview.widget.ViewDragHelper.Callback mDragCallback = null;
    
    /**
     * The bottom sheet is dragging.
     */
    public static final int STATE_DRAGGING = 1;
    
    /**
     * The bottom sheet is settling.
     */
    public static final int STATE_SETTLING = 2;
    
    /**
     * The bottom sheet is expanded.
     */
    public static final int STATE_EXPANDED = 3;
    
    /**
     * The bottom sheet is collapsed.
     */
    public static final int STATE_COLLAPSED = 4;
    
    /**
     * The bottom sheet is hidden.
     */
    public static final int STATE_HIDDEN = 5;
    
    /**
     * The bottom sheet is anchored.
     */
    public static final int STATE_ANCHORED = 6;
    
    /**
     * Peek at the 16:9 ratio keyline of its parent.
     *
     *
     *
     * This can be used as a parameter for [.setPeekHeight].
     * [.getPeekHeight] will return this when the value is set.
     */
    public static final int PEEK_HEIGHT_AUTO = -1;
    private static final float HIDE_THRESHOLD = 0.5F;
    private static final float HIDE_FRICTION = 0.1F;
    private static final float EXPAND_FRICTION = 0.2F;
    private static final float COLLAPSE_FRICTION = 0.2F;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.Companion Companion = null;
    
    @androidx.annotation.VisibleForTesting()
    public final int getPeekHeightMin() {
        return 0;
    }
    
    public final boolean getAllowUserDragging() {
        return false;
    }
    
    public final void setAllowUserDragging(boolean p0) {
    }
    
    public final int getMMinOffset() {
        return 0;
    }
    
    public final void setMMinOffset(int p0) {
    }
    
    public final int getMMaxOffset() {
        return 0;
    }
    
    public final void setMMaxOffset(int p0) {
    }
    
    public final boolean isHideable() {
        return false;
    }
    
    public final void setHideable(boolean p0) {
    }
    
    public final boolean getSkipCollapsed() {
        return false;
    }
    
    public final void setSkipCollapsed(boolean p0) {
    }
    
    public final boolean getSkipAnchored() {
        return false;
    }
    
    public final void setSkipAnchored(boolean p0) {
    }
    
    public final boolean isDisableExpanded() {
        return false;
    }
    
    public final void setDisableExpanded(boolean p0) {
    }
    
    @brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.State()
    @java.lang.Deprecated()
    public static void getMState$annotations() {
    }
    
    public final int getMState() {
        return 0;
    }
    
    public final void setMState(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.customview.widget.ViewDragHelper getMViewDragHelper() {
        return null;
    }
    
    public final void setMViewDragHelper(@org.jetbrains.annotations.Nullable()
    androidx.customview.widget.ViewDragHelper p0) {
    }
    
    public final int getMParentHeight() {
        return 0;
    }
    
    public final void setMParentHeight(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.ref.WeakReference<V> getMViewRef() {
        return null;
    }
    
    public final void setMViewRef(@org.jetbrains.annotations.Nullable()
    java.lang.ref.WeakReference<V> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.ref.WeakReference<android.view.View> getMNestedScrollingChildRef() {
        return null;
    }
    
    public final void setMNestedScrollingChildRef(@org.jetbrains.annotations.Nullable()
    java.lang.ref.WeakReference<android.view.View> p0) {
    }
    
    public final int getMActivePointerId() {
        return 0;
    }
    
    public final void setMActivePointerId(int p0) {
    }
    
    public final boolean getMTouchingScrollingChild() {
        return false;
    }
    
    public final void setMTouchingScrollingChild(boolean p0) {
    }
    
    public final void invalidateScrollingChild() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.Parcelable onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, V child) {
        return null;
    }
    
    @java.lang.Override()
    public void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, V child, @org.jetbrains.annotations.NotNull()
    android.os.Parcelable state) {
    }
    
    @java.lang.Override()
    public boolean onLayoutChild(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, V child, int layoutDirection) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, V child, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, V child, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V child, @org.jetbrains.annotations.NotNull()
    android.view.View directTargetChild, @org.jetbrains.annotations.NotNull()
    android.view.View target, int nestedScrollAxes) {
        return false;
    }
    
    @java.lang.Override()
    public void onNestedPreScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int dx, int dy, @org.jetbrains.annotations.NotNull()
    int[] consumed) {
    }
    
    @java.lang.Override()
    public void onStopNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V child, @org.jetbrains.annotations.NotNull()
    android.view.View target) {
    }
    
    @java.lang.Override()
    public boolean onNestedPreFling(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V child, @org.jetbrains.annotations.NotNull()
    android.view.View target, float velocityX, float velocityY) {
        return false;
    }
    
    public final int getPeekHeight() {
        return 0;
    }
    
    public final void setPeekHeight(int peekHeight) {
    }
    
    public final int getAnchorOffset() {
        return 0;
    }
    
    public final void setAnchorOffset(int anchorOffset) {
    }
    
    /**
     * Registers a callback to be notified of bottom sheet events.
     *
     * @param callback The callback to notify when bottom sheet events occur.
     */
    public final void addBottomSheetCallback(@org.jetbrains.annotations.NotNull()
    brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.BottomSheetCallback callback) {
    }
    
    public final void removeBottomSheetCallback(@org.jetbrains.annotations.NotNull()
    brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.BottomSheetCallback callback) {
    }
    
    @brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.State()
    public final int getState() {
        return 0;
    }
    
    public final void setState(int state) {
    }
    
    public final void setStateInternal(@brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.State()
    int state) {
    }
    
    private final void reset() {
    }
    
    private final void calculateTopAndTargetState(android.view.View child, float xvel, float yvel, int[] out) {
    }
    
    public final boolean shouldHide(@org.jetbrains.annotations.NotNull()
    android.view.View child, float yvel) {
        return false;
    }
    
    public final boolean shouldExpand(@org.jetbrains.annotations.NotNull()
    android.view.View child, float yvel) {
        return false;
    }
    
    public final boolean shouldCollapse(@org.jetbrains.annotations.NotNull()
    android.view.View child, float yvel) {
        return false;
    }
    
    private final android.view.View findScrollingChild(android.view.View view) {
        return null;
    }
    
    public final void startSettlingAnimation(@org.jetbrains.annotations.NotNull()
    android.view.View child, int state) {
    }
    
    public final void dispatchOnSlide(int top) {
    }
    
    /**
     * Default constructor for instantiating AnchorBottomSheetBehaviors.
     */
    public AnchorBottomSheetBehavior() {
        super();
    }
    
    /**
     * Default constructor for inflating AnchorBottomSheetBehaviors from layout.
     *
     * @param context The [Context].
     * @param attrs   The [AttributeSet].
     */
    public AnchorBottomSheetBehavior(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super();
    }
    
    /**
     * Callback for monitoring events about bottom sheets.
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J$\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior$BottomSheetCallback;", "", "()V", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "oldState", "", "newState", "app_debug"})
    public static abstract class BottomSheetCallback {
        
        /**
         * Called when the bottom sheet changes its state.
         *
         * @param bottomSheet The bottom sheet view.
         * @param oldState    The old state. This will be one of [.STATE_DRAGGING],
         * [.STATE_SETTLING], [.STATE_EXPANDED],
         * [.STATE_COLLAPSED], [.STATE_ANCHORED] or
         * [.STATE_HIDDEN].
         * @param newState    The new state. This will be one of [.STATE_DRAGGING],
         * [.STATE_SETTLING], [.STATE_EXPANDED],
         * [.STATE_COLLAPSED], [.STATE_ANCHORED] or
         * [.STATE_HIDDEN].
         */
        public abstract void onStateChanged(@org.jetbrains.annotations.NotNull()
        android.view.View bottomSheet, @brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.State()
        int oldState, @brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.State()
        int newState);
        
        /**
         * Called when the bottom sheet is being dragged.
         *
         * @param bottomSheet The bottom sheet view.
         * @param slideOffset The new offset of this bottom sheet within [-1,1] range. Offset
         * increases as this bottom sheet is moving upward. From 0 to 1 the sheet
         * is between collapsed and expanded states and from -1 to 0 it is
         * between hidden and collapsed states.
         */
        public abstract void onSlide(@org.jetbrains.annotations.NotNull()
        android.view.View bottomSheet, float slideOffset);
        
        public BottomSheetCallback() {
            super();
        }
    }
    
    /**
     * Stub/no-op implementations of all methods of [BottomSheetCallback].
     * Override this if you only care about a few of the available callback methods.
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0016\u00a8\u0006\r"}, d2 = {"Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior$SimpleBottomSheetCallback;", "Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior$BottomSheetCallback;", "()V", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "oldState", "", "newState", "app_debug"})
    public static abstract class SimpleBottomSheetCallback extends brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.BottomSheetCallback {
        
        @java.lang.Override()
        public void onStateChanged(@org.jetbrains.annotations.NotNull()
        android.view.View bottomSheet, @brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.State()
        int oldState, @brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.State()
        int newState) {
        }
        
        @java.lang.Override()
        public void onSlide(@org.jetbrains.annotations.NotNull()
        android.view.View bottomSheet, float slideOffset) {
        }
        
        public SimpleBottomSheetCallback() {
            super();
        }
    }
    
    /**
     * @hide
     */
    @androidx.annotation.IntDef(value = {3, 4, 1, 2, 5, 6})
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.GROUP_ID})
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior$State;", "", "app_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    public static abstract @interface State {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior$SettleRunnable;", "Ljava/lang/Runnable;", "mView", "Landroid/view/View;", "mTargetState", "", "(Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior;Landroid/view/View;I)V", "run", "", "app_debug"})
    final class SettleRunnable implements java.lang.Runnable {
        private final android.view.View mView = null;
        @brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.State()
        private final int mTargetState = 0;
        
        @java.lang.Override()
        public void run() {
        }
        
        public SettleRunnable(@org.jetbrains.annotations.NotNull()
        android.view.View mView, @brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.State()
        int mTargetState) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B\u001b\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior$SavedState;", "Landroidx/customview/view/AbsSavedState;", "source", "Landroid/os/Parcel;", "loader", "Ljava/lang/ClassLoader;", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V", "superState", "Landroid/os/Parcelable;", "state", "", "(Landroid/os/Parcelable;I)V", "getState$annotations", "()V", "getState", "()I", "writeToParcel", "", "out", "flags", "Companion", "app_debug"})
    public static final class SavedState extends androidx.customview.view.AbsSavedState {
        private final int state = 0;
        @org.jetbrains.annotations.Nullable()
        public static final android.os.Parcelable.Creator<brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.SavedState> CREATOR = null;
        @org.jetbrains.annotations.NotNull()
        public static final brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.SavedState.Companion Companion = null;
        
        @brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.State()
        @java.lang.Deprecated()
        public static void getState$annotations() {
        }
        
        public final int getState() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel out, int flags) {
        }
        
        public SavedState(@org.jetbrains.annotations.NotNull()
        android.os.Parcel source, @org.jetbrains.annotations.Nullable()
        java.lang.ClassLoader loader) {
            super(null);
        }
        
        public SavedState(@org.jetbrains.annotations.NotNull()
        android.os.Parcel source) {
            super(null);
        }
        
        public SavedState(@org.jetbrains.annotations.Nullable()
        android.os.Parcelable superState, @brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior.State()
        int state) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior$SavedState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior$SavedState;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\n\b\u0001\u0010\u0012*\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u0002H\u0012\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior$Companion;", "", "()V", "COLLAPSE_FRICTION", "", "EXPAND_FRICTION", "HIDE_FRICTION", "HIDE_THRESHOLD", "PEEK_HEIGHT_AUTO", "", "STATE_ANCHORED", "STATE_COLLAPSED", "STATE_DRAGGING", "STATE_EXPANDED", "STATE_HIDDEN", "STATE_SETTLING", "from", "Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior;", "V", "Landroid/view/View;", "view", "(Landroid/view/View;)Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior;", "app_debug"})
    public static final class Companion {
        
        /**
         * A utility function to get the [AnchorBottomSheetBehavior] associated with the `view`.
         *
         * @param view The [View] with [AnchorBottomSheetBehavior].
         * @return The [AnchorBottomSheetBehavior] associated with the `view`.
         */
        @org.jetbrains.annotations.NotNull()
        public final <V extends android.view.View>brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior<V> from(V view) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}