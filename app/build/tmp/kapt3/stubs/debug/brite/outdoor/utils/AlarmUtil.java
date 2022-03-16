package brite.outdoor.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lbrite/outdoor/utils/AlarmUtil;", "", "()V", "Companion", "app_debug"})
public final class AlarmUtil {
    private static final java.lang.String TAG = "AlarmUtil";
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.utils.AlarmUtil.Companion Companion = null;
    
    public AlarmUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lbrite/outdoor/utils/AlarmUtil$Companion;", "", "()V", "TAG", "", "cancelAlarm", "", "context", "Landroid/content/Context;", "reminder", "Lbrite/outdoor/entity/Reminders;", "alarmManager", "Landroid/app/AlarmManager;", "createAlarm", "getRepeatTime", "", "value", "", "unit", "getTriggerTime", "dateString", "timeString", "updateAlarmWhenReboot", "state", "app_debug"})
    public static final class Companion {
        
        private final long getTriggerTime(java.lang.String dateString, java.lang.String timeString) {
            return 0L;
        }
        
        private final long getRepeatTime(int value, java.lang.String unit) {
            return 0L;
        }
        
        public final void createAlarm(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        brite.outdoor.entity.Reminders reminder, @org.jetbrains.annotations.NotNull()
        android.app.AlarmManager alarmManager) {
        }
        
        public final void cancelAlarm(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        brite.outdoor.entity.Reminders reminder, @org.jetbrains.annotations.NotNull()
        android.app.AlarmManager alarmManager) {
        }
        
        private final void updateAlarmWhenReboot(android.content.Context context, int state) {
        }
        
        private Companion() {
            super();
        }
    }
}