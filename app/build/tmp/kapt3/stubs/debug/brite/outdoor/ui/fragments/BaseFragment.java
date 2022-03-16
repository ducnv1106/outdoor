package brite.outdoor.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH$J\u000f\u0010 \u001a\u0004\u0018\u00018\u0000H\u0004\u00a2\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H$J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0004J\u0010\u0010\'\u001a\u00020&2\u0006\u0010%\u001a\u00020&H\u0004J\u0010\u0010(\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0004J\u0010\u0010)\u001a\u00020#2\u0006\u0010%\u001a\u00020*H\u0004J\u0010\u0010+\u001a\u00020,2\u0006\u0010%\u001a\u00020*H\u0004J\u0012\u0010-\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010/H$J\b\u00100\u001a\u00020\u0016H\u0016J\u0006\u00101\u001a\u00020\u0016J\u0017\u00102\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00018\u0000H$\u00a2\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u000206H\u0016J\u0012\u00107\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J&\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u0010>\u001a\u00020\u001eH\u0016J\b\u0010?\u001a\u00020\u001eH\u0016J\b\u0010@\u001a\u00020\u001eH\u0016J\b\u0010A\u001a\u00020\u001eH\u0016J\b\u0010B\u001a\u00020\u001eH\u0016J\b\u0010C\u001a\u00020\u001eH\u0016J\b\u0010D\u001a\u00020\u001eH\u0016J\u001a\u0010E\u001a\u00020\u001e2\u0006\u0010F\u001a\u0002092\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u001f\u0010G\u001a\u00028\u00002\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H$\u00a2\u0006\u0002\u0010HJ\b\u0010I\u001a\u00020#H\u0016J\b\u0010J\u001a\u00020\u001eH\u0003J\b\u0010K\u001a\u00020\u001eH\u0003R\u001c\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006L"}, d2 = {"Lbrite/outdoor/ui/fragments/BaseFragment;", "T", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "binding", "Ljava/lang/Object;", "changeStateClickAble", "Ljava/lang/Runnable;", "mActivity", "Lbrite/outdoor/ui/activities/MainActivity;", "getMActivity", "()Lbrite/outdoor/ui/activities/MainActivity;", "setMActivity", "(Lbrite/outdoor/ui/activities/MainActivity;)V", "mHandlerClick", "Landroid/os/Handler;", "mIsClickAble", "", "shareViewModel", "Lbrite/outdoor/viewmodel/ShareViewModel;", "getShareViewModel", "()Lbrite/outdoor/viewmodel/ShareViewModel;", "shareViewModel$delegate", "Lkotlin/Lazy;", "backToPrevious", "", "finish", "getBinding", "()Ljava/lang/Object;", "getCurrentFragment", "", "getRealHeight", "sizeDesign", "Lbrite/outdoor/utils/ViewSize;", "getRealSize", "getRealWidth", "getSizeWithScale", "", "getSizeWithScaleFloat", "", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isBackPreviousEnable", "isClickAble", "loadControlsAndResize", "(Ljava/lang/Object;)V", "onAttach", "activity", "Landroid/app/Activity;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onDetach", "onPause", "onResume", "onStart", "onStop", "onViewCreated", "view", "setBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ljava/lang/Object;", "statusBarColor", "statusBarColorMain", "statusBarColorWhite", "app_debug"})
public abstract class BaseFragment<T extends java.lang.Object> extends androidx.fragment.app.Fragment {
    private final java.lang.String TAG = null;
    private T binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy shareViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.ui.activities.MainActivity mActivity;
    private boolean mIsClickAble = true;
    private final android.os.Handler mHandlerClick = null;
    private final java.lang.Runnable changeStateClickAble = null;
    private java.util.HashMap _$_findViewCache;
    
    protected final java.lang.String getTAG() {
        return null;
    }
    
    protected abstract void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    T binding);
    
    protected abstract T setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container);
    
    @org.jetbrains.annotations.Nullable()
    protected final T getBinding() {
        return null;
    }
    
    protected abstract void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    protected abstract int getCurrentFragment();
    
    protected abstract void finish();
    
    public boolean isBackPreviousEnable() {
        return false;
    }
    
    public void backToPrevious() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final brite.outdoor.viewmodel.ShareViewModel getShareViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final brite.outdoor.ui.activities.MainActivity getMActivity() {
        return null;
    }
    
    protected final void setMActivity(@org.jetbrains.annotations.Nullable()
    brite.outdoor.ui.activities.MainActivity p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    protected final int getSizeWithScale(double sizeDesign) {
        return 0;
    }
    
    protected final float getSizeWithScaleFloat(double sizeDesign) {
        return 0.0F;
    }
    
    protected final int getRealWidth(@org.jetbrains.annotations.NotNull()
    brite.outdoor.utils.ViewSize sizeDesign) {
        return 0;
    }
    
    protected final int getRealHeight(@org.jetbrains.annotations.NotNull()
    brite.outdoor.utils.ViewSize sizeDesign) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final brite.outdoor.utils.ViewSize getRealSize(@org.jetbrains.annotations.NotNull()
    brite.outdoor.utils.ViewSize sizeDesign) {
        return null;
    }
    
    public final boolean isClickAble() {
        return false;
    }
    
    public int statusBarColor() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    private final void statusBarColorMain() {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    private final void statusBarColorWhite() {
    }
    
    public BaseFragment() {
        super();
    }
}