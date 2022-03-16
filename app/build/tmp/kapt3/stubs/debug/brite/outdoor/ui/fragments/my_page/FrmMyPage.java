package brite.outdoor.ui.fragments.my_page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0016J\u0006\u0010#\u001a\u00020\"J\u0010\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020&J\u0010\u0010\'\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020&J\u0006\u0010)\u001a\u00020\"J\u0006\u0010*\u001a\u00020\"J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\"H\u0014J\b\u0010/\u001a\u00020-H\u0014J\u0012\u00100\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020&H\u0002J\b\u00102\u001a\u00020\"H\u0002J\u0012\u00103\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u000105H\u0015J\b\u00106\u001a\u00020&H\u0016J\u0012\u00107\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u00109\u001a\u00020\"H\u0002J\b\u0010:\u001a\u00020\"H\u0002J\b\u0010;\u001a\u00020\"H\u0002J\b\u0010<\u001a\u00020\"H\u0002J\b\u0010=\u001a\u00020\"H\u0003J\u0012\u0010>\u001a\u00020\"2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010A\u001a\u00020\"H\u0016J\u0010\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020DH\u0007J\b\u0010E\u001a\u00020\"H\u0002J\b\u0010F\u001a\u00020\"H\u0002J\b\u0010G\u001a\u00020\"H\u0016J\b\u0010H\u001a\u00020\"H\u0016J\u001a\u0010I\u001a\u00020\u00022\u0006\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0014J\b\u0010N\u001a\u00020\"H\u0002J\b\u0010O\u001a\u00020-H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006P"}, d2 = {"Lbrite/outdoor/ui/fragments/my_page/FrmMyPage;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmMyPageBinding;", "Landroid/view/View$OnClickListener;", "()V", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "frmMyBookMart", "Lbrite/outdoor/ui/fragments/my_page/FrmMyBookMart;", "getFrmMyBookMart", "()Lbrite/outdoor/ui/fragments/my_page/FrmMyBookMart;", "frmMyBookMart$delegate", "frmMyPosts", "Lbrite/outdoor/ui/fragments/my_page/FrmMyPost;", "getFrmMyPosts", "()Lbrite/outdoor/ui/fragments/my_page/FrmMyPost;", "frmMyPosts$delegate", "myPageViewModel", "Lbrite/outdoor/viewmodel/MyPageViewModel;", "getMyPageViewModel", "()Lbrite/outdoor/viewmodel/MyPageViewModel;", "myPageViewModel$delegate", "myPostViewModel", "Lbrite/outdoor/viewmodel/MyPostViewModel;", "getMyPostViewModel", "()Lbrite/outdoor/viewmodel/MyPostViewModel;", "myPostViewModel$delegate", "urlAvatar", "", "backToPrevious", "", "callApiDetailUser", "callApiListMyBookMark", "isNeedRefreshPostDataInMyBookMart", "", "callApiListMyPost", "isNeedRefreshPostDataInMyPage", "checkAndApiListMyBookMarkIfNeed", "checkAndCallApiListMyPostIfNeed", "convertNumberInteractive", "counts", "", "finish", "getCurrentFragment", "hideBtnAddHome", "isRefresh", "hideBtnAddHomeBackToScreenHome", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isBackPreviousEnable", "loadControlsAndResize", "binding", "observerChangeLanguage", "observerCountLike", "observerDetailUser", "observerHandleAPILoadingAndErr", "observerNotifyUnread", "onClick", "v", "Landroid/view/View;", "onDestroyView", "onEvent", "event", "", "onListenerNaviBottom", "onRefreshData", "onStart", "onStop", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showPopupWindow", "statusBarColor", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmMyPage extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmMyPageBinding> implements android.view.View.OnClickListener {
    private final kotlin.Lazy myPageViewModel$delegate = null;
    private java.lang.String urlAvatar;
    private final kotlin.Lazy authViewModel$delegate = null;
    private final kotlin.Lazy myPostViewModel$delegate = null;
    private final kotlin.Lazy frmMyPosts$delegate = null;
    private final kotlin.Lazy frmMyBookMart$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.MyPageViewModel getMyPageViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.MyPostViewModel getMyPostViewModel() {
        return null;
    }
    
    private final brite.outdoor.ui.fragments.my_page.FrmMyPost getFrmMyPosts() {
        return null;
    }
    
    private final brite.outdoor.ui.fragments.my_page.FrmMyBookMart getFrmMyBookMart() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isBackPreviousEnable() {
        return false;
    }
    
    @java.lang.Override()
    public void backToPrevious() {
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmMyPageBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmMyPageBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void checkAndCallApiListMyPostIfNeed() {
    }
    
    public final void callApiListMyPost(boolean isNeedRefreshPostDataInMyPage) {
    }
    
    public final void checkAndApiListMyBookMarkIfNeed() {
    }
    
    public final void callApiListMyBookMark(boolean isNeedRefreshPostDataInMyBookMart) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final void callApiDetailUser() {
    }
    
    private final void observerDetailUser() {
    }
    
    private final void observerCountLike() {
    }
    
    private final void observerHandleAPILoadingAndErr() {
    }
    
    private final java.lang.String convertNumberInteractive(int counts) {
        return null;
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
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void onListenerNaviBottom() {
    }
    
    private final void hideBtnAddHomeBackToScreenHome() {
    }
    
    private final void hideBtnAddHome(boolean isRefresh) {
    }
    
    private final void showPopupWindow() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Object event) {
    }
    
    private final void onRefreshData() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void observerNotifyUnread() {
    }
    
    private final void observerChangeLanguage() {
    }
    
    public FrmMyPage() {
        super();
    }
}