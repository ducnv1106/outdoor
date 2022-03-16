package brite.outdoor.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\fH\u0016J\u0012\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\u0012\u0010\u001f\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J\b\u0010#\u001a\u00020\u0012H\u0002J\b\u0010$\u001a\u00020\u0012H\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\'H\u0002J\u001a\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\'H\u0002J\b\u0010/\u001a\u00020\u0012H\u0002J\b\u00100\u001a\u00020\u0017H\u0016J\b\u00101\u001a\u00020\u0012H\u0002J\b\u00102\u001a\u00020\u0012H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\b\u00a8\u00063"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmSetting;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmSettingBinding;", "Landroid/view/View$OnClickListener;", "()V", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "isCheckedChangeByCode", "", "isShowOnOffNotification", "viewModel", "getViewModel", "viewModel$delegate", "backToPrevious", "", "callApiLogout", "changeStateNotificationSetting", "finish", "getCurrentFragment", "", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isBackPreviousEnable", "loadControlsAndResize", "binding", "observeLogoutResult", "onClick", "v", "Landroid/view/View;", "onDestroyView", "onListenerRadio", "onResume", "openBrowser", "link", "", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setLocale", "lang", "showDialogLogout", "statusBarColor", "turnOnOffNotification", "updateUIAfterChangeLanguage", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmSetting extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmSettingBinding> implements android.view.View.OnClickListener {
    private final kotlin.Lazy authViewModel$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isShowOnOffNotification = false;
    
    /**
     * check and change state notification setting
     */
    private boolean isCheckedChangeByCode = false;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmSettingBinding binding) {
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmSettingBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void openBrowser(java.lang.String link) {
    }
    
    private final void showDialogLogout() {
    }
    
    private final void callApiLogout() {
    }
    
    private final void observeLogoutResult() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void turnOnOffNotification() {
    }
    
    private final void changeStateNotificationSetting() {
    }
    
    private final void onListenerRadio() {
    }
    
    private final void setLocale(java.lang.String lang) {
    }
    
    private final void updateUIAfterChangeLanguage() {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isBackPreviousEnable() {
        return false;
    }
    
    @java.lang.Override()
    public void backToPrevious() {
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public int statusBarColor() {
        return 0;
    }
    
    public FrmSetting() {
        super();
    }
}