package brite.outdoor.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0019\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\b\u0010$\u001a\u00020%H\u0014J\b\u0010&\u001a\u00020\u0018H\u0014J\u0018\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020\u001f0(j\b\u0012\u0004\u0012\u00020\u001f`)H\u0002J\u0012\u0010*\u001a\u00020%2\b\b\u0002\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020%H\u0002J\u0012\u0010.\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u000100H\u0015J\b\u00101\u001a\u00020%H\u0002J\u0012\u00102\u001a\u00020%2\b\u00103\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u00104\u001a\u00020%H\u0003J\b\u00105\u001a\u00020%H\u0002J\b\u00106\u001a\u00020%H\u0002J\b\u00107\u001a\u00020%H\u0002J\b\u00108\u001a\u00020%H\u0003J\u0010\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020\"H\u0007J\b\u0010;\u001a\u00020%H\u0002J\b\u0010<\u001a\u00020%H\u0002J\b\u0010=\u001a\u00020%H\u0002J\b\u0010>\u001a\u00020%H\u0002J\b\u0010?\u001a\u00020%H\u0016J\b\u0010@\u001a\u00020%H\u0016J\u001a\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\b\u0010F\u001a\u00020%H\u0002J\b\u0010G\u001a\u00020\u0018H\u0016J\u0018\u0010H\u001a\u00020%2\u0006\u0010I\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020KH\u0002J\u0018\u0010L\u001a\u00020%2\u0006\u0010I\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006N"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmHome;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmHomeBinding;", "()V", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "fragmentFollow", "Lbrite/outdoor/ui/fragments/home/FrmFollow;", "fragmentHotNews", "Lbrite/outdoor/ui/fragments/home/FrmHotNews;", "fragmentNew", "Lbrite/outdoor/ui/fragments/home/FrmNew;", "homePagerAdapter", "Lbrite/outdoor/adapter/HomePagerAdapter;", "homeViewModel", "Lbrite/outdoor/viewmodel/HomeViewModel;", "getHomeViewModel", "()Lbrite/outdoor/viewmodel/HomeViewModel;", "homeViewModel$delegate", "indicatorWidth", "", "Ljava/lang/Integer;", "saveListLocation", "Lbrite/outdoor/data/local/room/SaveListLocationLocal;", "saveListUtensils", "Lbrite/outdoor/data/local/room/SaveListUtensilsLocal;", "userId", "", "encryptData", "list", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finish", "", "getCurrentFragment", "getListTitleFragmentPagerAdapter", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "hideBtnAddHome", "isRefresh", "", "hideBtnAddHomeBackToScreenHome", "initView", "savedInstanceState", "Landroid/os/Bundle;", "initViewPagerAdapter", "loadControlsAndResize", "binding", "observeListLocationUtensilsResult", "observerChangeLanguage", "observerNeedRefreshPostDataInMyHome", "observerNeedUpdateDataPostInFrmNews", "observerNotifyUnread", "onEvent", "event", "onListenerNaviBottom", "onListenerTabLayout", "onListenerViewPager", "onRefresherData", "onStart", "onStop", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showPopupWindow", "statusBarColor", "writeLongToLocal", "key", "value", "", "writeStringToLocal", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmHome extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmHomeBinding> {
    private final kotlin.Lazy authViewModel$delegate = null;
    private final kotlin.Lazy homeViewModel$delegate = null;
    private brite.outdoor.data.local.room.SaveListLocationLocal saveListLocation;
    private brite.outdoor.data.local.room.SaveListUtensilsLocal saveListUtensils;
    private brite.outdoor.adapter.HomePagerAdapter homePagerAdapter;
    private brite.outdoor.ui.fragments.home.FrmNew fragmentNew;
    private brite.outdoor.ui.fragments.home.FrmFollow fragmentFollow;
    private brite.outdoor.ui.fragments.home.FrmHotNews fragmentHotNews;
    private java.lang.Integer indicatorWidth;
    private java.lang.String userId = "";
    public static final int DIALOG_FRM_LOCATION = 1;
    public static final int DIALOG_FRM_UTENSILS = 2;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.FrmHome.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmHomeBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmHomeBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewPagerAdapter() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    private final void observeListLocationUtensilsResult() {
    }
    
    private final void writeStringToLocal(java.lang.String key, java.lang.String value) {
    }
    
    private final void writeLongToLocal(java.lang.String key, long value) {
    }
    
    private final void onListenerTabLayout() {
    }
    
    private final void onListenerViewPager() {
    }
    
    private final void showPopupWindow() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Object event) {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    @java.lang.Override()
    public int statusBarColor() {
        return 0;
    }
    
    private final void hideBtnAddHomeBackToScreenHome() {
    }
    
    private final void hideBtnAddHome(boolean isRefresh) {
    }
    
    private final void onListenerNaviBottom() {
    }
    
    private final void onRefresherData() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void observerNotifyUnread() {
    }
    
    private final void observerNeedUpdateDataPostInFrmNews() {
    }
    
    private final void observerNeedRefreshPostDataInMyHome() {
    }
    
    private final void observerChangeLanguage() {
    }
    
    private final java.util.ArrayList<java.lang.String> getListTitleFragmentPagerAdapter() {
        return null;
    }
    
    public FrmHome() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmHome$Companion;", "", "()V", "DIALOG_FRM_LOCATION", "", "DIALOG_FRM_UTENSILS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}