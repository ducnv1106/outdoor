package brite.outdoor.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u001d\u001a\u00020\fH\u0002J\b\u0010\u001e\u001a\u00020\fH\u0002J\u0012\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0002J\u001a\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J.\u0010)\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0+H\u0002J\b\u0010,\u001a\u00020\fH\u0002J\b\u0010-\u001a\u00020\u0011H\u0016J\u0010\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u000200H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u00062"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmLogin;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmLoginBinding;", "Landroid/view/View$OnClickListener;", "()V", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "createHashAndSendEmail", "", "userId", "", "finish", "getCurrentFragment", "", "initView", "savedInstanceState", "Landroid/os/Bundle;", "insertToStringBuilder", "stringBuilder", "Landroid/text/SpannableStringBuilder;", "resId", "isFirstOpenApp", "", "loadControlsAndResize", "binding", "observeLoginResult", "observerCreateHash", "onClick", "v", "Landroid/view/View;", "openBrowser", "link", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setSpanToStringBuilder", "needInsertSpace", "Lkotlin/Function0;", "setupPolicyClickable", "statusBarColor", "writeDataPref", "data", "Lbrite/outdoor/data/api_entities/response/ResponseLogin$Response;", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmLogin extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmLoginBinding> implements android.view.View.OnClickListener {
    private final kotlin.Lazy authViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.FrmLogin.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmLoginBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmLoginBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupPolicyClickable() {
    }
    
    private final void openBrowser(java.lang.String link) {
    }
    
    private final void insertToStringBuilder(android.text.SpannableStringBuilder stringBuilder, int resId) {
    }
    
    private final void setSpanToStringBuilder(android.text.SpannableStringBuilder stringBuilder, int resId, boolean needInsertSpace, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    private final boolean isFirstOpenApp() {
        return false;
    }
    
    private final void observeLoginResult() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void writeDataPref(brite.outdoor.data.api_entities.response.ResponseLogin.Response data) {
    }
    
    private final void createHashAndSendEmail(java.lang.String userId) {
    }
    
    private final void observerCreateHash() {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    public int statusBarColor() {
        return 0;
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    public FrmLogin() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u00a8\u0006\u000b"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmLogin$Companion;", "", "()V", "getInstance", "Lbrite/outdoor/ui/fragments/FrmLogin;", "arrayList", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/BackStackData;", "mapData", "Ljava/util/HashMap;", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.ui.fragments.FrmLogin getInstance(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<brite.outdoor.data.entities.BackStackData> arrayList, @org.jetbrains.annotations.Nullable()
        java.util.HashMap<java.lang.String, java.lang.Object> mapData) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}