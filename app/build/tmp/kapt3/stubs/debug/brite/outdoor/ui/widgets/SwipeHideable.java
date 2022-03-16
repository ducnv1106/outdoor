package brite.outdoor.ui.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H&J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\b\u0010\u0013\u001a\u00020\rH&J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u000b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lbrite/outdoor/ui/widgets/SwipeHideable;", "", "direction", "", "getDirection", "()I", "setDirection", "(I)V", "isSlideEnabled", "", "()Z", "isVisible", "enable", "", "hide", "speed", "setOnSwipeChangeListener", "listener", "Lbrite/outdoor/ui/widgets/OnSwipeChangeListener;", "show", "app_debug"})
public abstract interface SwipeHideable {
    
    /**
     * Sets direction of sliding
     *
     * @param direction direction constant from [SwipeToHideLayout]
     * @see SwipeToHideLayout directions constants
     */
    public abstract int getDirection();
    
    /**
     * Sets direction of sliding
     *
     * @param direction direction constant from [SwipeToHideLayout]
     * @see SwipeToHideLayout directions constants
     */
    public abstract void setDirection(int p0);
    
    /**
     * Shows view using default speed
     * Changes [View.getVisibility] param using animation
     */
    public abstract void show();
    
    /**
     * Shows view using defined speed
     * Changes [View.getVisibility] param using animation
     *
     * @param speed speed of sliding animation (ms)
     */
    public abstract void show(int speed);
    
    /**
     * Hide view using default speed
     * Changes [View.getVisibility] param using animation
     */
    public abstract void hide();
    
    /**
     * Hide view using defined speed
     * Changes [View.getVisibility] param using animation
     *
     * @param speed speed of sliding animation (speed)
     */
    public abstract void hide(int speed);
    
    /**
     * Check if view is visible
     *
     * @return is visible
     */
    public abstract boolean isVisible();
    
    /**
     * Enable/disable view for swiping (touching)
     *
     * @param enable enable/disable
     */
    public abstract void enable(boolean enable);
    
    /**
     * Check if view is enable for swiping (touching)
     *
     * @return is enabled
     */
    public abstract boolean isSlideEnabled();
    
    /**
     * Sets on swipe change listener
     *
     * @param listener listener
     */
    public abstract void setOnSwipeChangeListener(@org.jetbrains.annotations.Nullable()
    brite.outdoor.ui.widgets.OnSwipeChangeListener listener);
}