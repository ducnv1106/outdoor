package brite.outdoor.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lbrite/outdoor/app/MyApplication;", "Landroid/app/Application;", "()V", "scaleValue", "", "createNotificationChannel", "", "channelId", "", "channelName", "description", "getRealSize", "Lbrite/outdoor/utils/ViewSize;", "sizeDesign", "getScaleValue", "getSizeWithScale", "", "", "getSizeWithScaleFloat", "onCreate", "onTerminate", "Companion", "app_debug"})
@dagger.hilt.android.HiltAndroidApp()
public final class MyApplication extends android.app.Application {
    private float scaleValue = 0.0F;
    private static brite.outdoor.app.MyApplication mInstance;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.app.MyApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onTerminate() {
    }
    
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
    
    public final void createNotificationChannel(@org.jetbrains.annotations.NotNull()
    java.lang.String channelId, @org.jetbrains.annotations.NotNull()
    java.lang.String channelName, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
    
    public MyApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/app/MyApplication$Companion;", "", "()V", "mInstance", "Lbrite/outdoor/app/MyApplication;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.app.MyApplication getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}