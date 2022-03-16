package brite.outdoor.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lbrite/outdoor/utils/ThreadExecutor;", "Ljava/util/concurrent/Executor;", "handler", "Landroid/os/Handler;", "(Landroid/os/Handler;)V", "getHandler", "()Landroid/os/Handler;", "execute", "", "runnable", "Ljava/lang/Runnable;", "app_debug"})
public class ThreadExecutor implements java.util.concurrent.Executor {
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable runnable) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.os.Handler getHandler() {
        return null;
    }
    
    public ThreadExecutor(@org.jetbrains.annotations.NotNull()
    android.os.Handler handler) {
        super();
    }
}