package brite.outdoor.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@GX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lbrite/outdoor/receiver/BootReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "reminders", "", "Lbrite/outdoor/entity/Reminders;", "<set-?>", "Lbrite/outdoor/data/repository/AppRepository;", "repository", "getRepository", "()Lbrite/outdoor/data/repository/AppRepository;", "setRepository", "(Lbrite/outdoor/data/repository/AppRepository;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app_debug"})
public final class BootReceiver extends android.content.BroadcastReceiver {
    private java.util.List<brite.outdoor.entity.Reminders> reminders;
    public brite.outdoor.data.repository.AppRepository repository;
    private static final java.lang.String TAG = "BootReceiver";
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.receiver.BootReceiver.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.data.repository.AppRepository getRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.repository.AppRepository p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    public BootReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/receiver/BootReceiver$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}