package brite.outdoor.ui.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lbrite/outdoor/ui/widgets/OnSwipeChangeListener;", "", "onSwipeChange", "", "visible", "", "swipeHideable", "Lbrite/outdoor/ui/widgets/SwipeHideable;", "app_debug"})
public abstract interface OnSwipeChangeListener {
    
    /**
     * Called when [SwipeHideable] is swiped (show/hide)
     *
     * @param visible       is now visible?
     * @param swipeHideable swipeHideable
     */
    public abstract void onSwipeChange(boolean visible, @org.jetbrains.annotations.Nullable()
    brite.outdoor.ui.widgets.SwipeHideable swipeHideable);
}