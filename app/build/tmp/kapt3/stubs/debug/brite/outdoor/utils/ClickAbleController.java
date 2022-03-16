package brite.outdoor.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lbrite/outdoor/utils/ClickAbleController;", "", "()V", "isClickable", "", "release", "", "Companion", "app_debug"})
public final class ClickAbleController {
    private static brite.outdoor.utils.ClickAbleController mInstance;
    public static final long TIME_DELAY = 350L;
    private static long prevClickedTime = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.utils.ClickAbleController.Companion Companion = null;
    
    public final void release() {
    }
    
    public final boolean isClickable() {
        return false;
    }
    
    public ClickAbleController() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbrite/outdoor/utils/ClickAbleController$Companion;", "", "()V", "TIME_DELAY", "", "mInstance", "Lbrite/outdoor/utils/ClickAbleController;", "prevClickedTime", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.utils.ClickAbleController getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}