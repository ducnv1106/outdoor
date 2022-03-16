package brite.outdoor.ui.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0017H\u0003J\u0012\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010!\u001a\u00020\u0017H\u0002J\u0012\u0010\"\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010#\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0012\u0010)\u001a\u00020\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0003R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006,"}, d2 = {"Lbrite/outdoor/ui/dialog/DialogFragmentReminder;", "Lbrite/outdoor/ui/fragments/BaseDialogFragment;", "Lbrite/outdoor/databinding/DialogReminderBinding;", "()V", "detailViewModel", "Lbrite/outdoor/viewmodel/DetailViewModel;", "getDetailViewModel", "()Lbrite/outdoor/viewmodel/DetailViewModel;", "detailViewModel$delegate", "Lkotlin/Lazy;", "entityLocationSave", "Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;", "locationSaveViewModel", "Lbrite/outdoor/viewmodel/LocationSaveViewModel;", "getLocationSaveViewModel", "()Lbrite/outdoor/viewmodel/LocationSaveViewModel;", "locationSaveViewModel$delegate", "viewModel", "Lbrite/outdoor/viewmodel/ReminderViewModel;", "getViewModel", "()Lbrite/outdoor/viewmodel/ReminderViewModel;", "viewModel$delegate", "callApiCreateCamping", "", "datePickerListener", "calendar", "Ljava/util/Calendar;", "initView", "savedInstanceState", "Landroid/os/Bundle;", "initViewModel", "loadControlsAndResize", "binding", "observerCreateCamping", "onActivityCreated", "onCreate", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setUpDatePicker", "timePickerListener", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DialogFragmentReminder extends brite.outdoor.ui.fragments.BaseDialogFragment<brite.outdoor.databinding.DialogReminderBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy locationSaveViewModel$delegate = null;
    private final kotlin.Lazy detailViewModel$delegate = null;
    private brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData entityLocationSave;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.dialog.DialogFragmentReminder.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.ReminderViewModel getViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.LocationSaveViewModel getLocationSaveViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.DetailViewModel getDetailViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.DialogReminderBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.DialogReminderBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.util.Calendar setUpDatePicker(brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData entityLocationSave) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final void datePickerListener(java.util.Calendar calendar) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final void timePickerListener(java.util.Calendar calendar) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initViewModel() {
    }
    
    private final void callApiCreateCamping() {
    }
    
    private final void observerCreateCamping() {
    }
    
    public DialogFragmentReminder() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lbrite/outdoor/ui/dialog/DialogFragmentReminder$Companion;", "", "()V", "getInstance", "Lbrite/outdoor/ui/dialog/DialogFragmentReminder;", "entity", "Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.ui.dialog.DialogFragmentReminder getInstance(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData entity) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}