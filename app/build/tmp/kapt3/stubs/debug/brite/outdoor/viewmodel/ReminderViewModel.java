package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010%H\u0002J\u0012\u00108\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010%H\u0002J\u0006\u00109\u001a\u000206J\u000e\u0010:\u001a\u0002062\u0006\u0010(\u001a\u00020)J\u000e\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020\u0019J\u000e\u0010=\u001a\u0002062\u0006\u0010>\u001a\u00020\rJ\u0006\u0010?\u001a\u000206J*\u0010@\u001a\u0002062\"\u0010@\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0016j\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r`\u0017J\u0006\u0010A\u001a\u000206J\u000e\u0010B\u001a\u0002062\u0006\u00107\u001a\u00020%J\u000e\u0010C\u001a\u0002062\u0006\u0010>\u001a\u00020\rJ\u000e\u0010D\u001a\u0002062\u0006\u0010E\u001a\u00020\rJ\u0006\u0010F\u001a\u000206J\u000e\u0010F\u001a\u0002062\u0006\u00107\u001a\u00020%J\u000e\u0010G\u001a\u0002062\u0006\u0010H\u001a\u00020\rJ\u0006\u0010I\u001a\u000206R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0015\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0016j\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r`\u00170\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F\u00a2\u0006\u0006\u001a\u0004\b#\u0010!R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010&\u001a\u0010\u0012\f\u0012\n \'*\u0004\u0018\u00010\u00190\u00190\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0012\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010*R\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0,0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b/\u00100R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F\u00a2\u0006\u0006\u001a\u0004\b2\u0010!R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F\u00a2\u0006\u0006\u001a\u0004\b4\u0010!\u00a8\u0006K"}, d2 = {"Lbrite/outdoor/viewmodel/ReminderViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "repository", "Lbrite/outdoor/data/repository/AppRepository;", "app", "Landroid/app/Application;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;Lbrite/outdoor/data/repository/AppRepository;Landroid/app/Application;)V", "_contentEditText", "Landroidx/lifecycle/MutableLiveData;", "", "get_contentEditText", "()Landroidx/lifecycle/MutableLiveData;", "_createCampingResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseCreateCamping$CreateCampingResult;", "_dateText", "_requestCreateCamping", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_switchCompat", "", "get_switchCompat", "_timeText", "_title", "alarmManager", "Landroid/app/AlarmManager;", "createCampingResult", "getCreateCampingResult", "()Landroidx/lifecycle/LiveData;", "dateText", "getDateText", "editableReminder", "Lbrite/outdoor/entity/Reminders;", "isEmpty", "kotlin.jvm.PlatformType", "reminderId", "", "Ljava/lang/Integer;", "reminders", "", "getReminders", "switchCompat", "getSwitchCompat", "()Z", "timeText", "getTimeText", "title", "getTitle", "cancelExistingAlarm", "", "reminder", "createReminderAlarm", "deleteReminder", "initReminderId", "initSwitchCompat", "checked", "initTextViewContent", "content", "initializeReminder", "requestCreateCamping", "saveReminder", "updateAlarm", "updateContentTextView", "updateDateTextView", "date", "updateReminder", "updateTimeTextView", "time", "updateUI", "Companion", "app_debug"})
public final class ReminderViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _contentEditText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _switchCompat = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _dateText = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _timeText = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _title = null;
    private brite.outdoor.entity.Reminders editableReminder;
    private java.lang.Integer reminderId;
    private final android.app.AlarmManager alarmManager = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<brite.outdoor.entity.Reminders>> reminders = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isEmpty = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestCreateCamping = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCreateCamping.CreateCampingResult>> _createCampingResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCreateCamping.CreateCampingResult>> createCampingResult = null;
    private final com.google.gson.Gson gson = null;
    private final brite.outdoor.data.repository.AppRepository repository = null;
    private final android.app.Application app = null;
    private static final java.lang.String TAG = "RemindersListViewModel";
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.viewmodel.ReminderViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> get_contentEditText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_switchCompat() {
        return null;
    }
    
    public final boolean getSwitchCompat() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getDateText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTimeText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<brite.outdoor.entity.Reminders>> getReminders() {
        return null;
    }
    
    public final void initReminderId(int reminderId) {
    }
    
    public final void initTextViewContent(@org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
    
    public final void initSwitchCompat(boolean checked) {
    }
    
    public final void initializeReminder() {
    }
    
    public final void updateUI() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isEmpty() {
        return null;
    }
    
    public final void updateReminder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.entity.Reminders reminder) {
    }
    
    public final void updateAlarm(@org.jetbrains.annotations.NotNull()
    brite.outdoor.entity.Reminders reminder) {
    }
    
    public final void saveReminder() {
    }
    
    public final void deleteReminder() {
    }
    
    public final void updateReminder() {
    }
    
    private final void createReminderAlarm(brite.outdoor.entity.Reminders reminder) {
    }
    
    private final void cancelExistingAlarm(brite.outdoor.entity.Reminders reminder) {
    }
    
    public final void updateDateTextView(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
    }
    
    public final void updateTimeTextView(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
    }
    
    public final void updateContentTextView(@org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
    
    public final void requestCreateCamping(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestCreateCamping) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCreateCamping.CreateCampingResult>> getCreateCampingResult() {
        return null;
    }
    
    @javax.inject.Inject()
    public ReminderViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.repository.AppRepository repository, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/viewmodel/ReminderViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}