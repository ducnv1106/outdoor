package brite.outdoor.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000v\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\"\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019\u001a\u0012\u0010\u001a\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u001a\n\u0010\u001b\u001a\u00020\u0014*\u00020\u001c\u001a\n\u0010\u001d\u001a\u00020\u001e*\u00020\r\u001a\u001e\u0010\u001f\u001a\u00020\u0014*\u00020 2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140!\u001a$\u0010\"\u001a\u00020\u0014*\u00020\u00032\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140#\u001a\u001c\u0010%\u001a\u00020\u0014*\u00020&2\u0006\u0010\'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*\u001aB\u0010+\u001a\u00020\u0014*\u00020\u00172\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\b\u0001\u00100\u001a\u00020\u00012\b\b\u0001\u00101\u001a\u00020\u00012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00140!\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"(\u0010\b\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\f*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"(\u0010\u0010\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\u0007\u00a8\u00062"}, d2 = {"value", "", "bottomMargin", "Landroid/view/View;", "getBottomMargin", "(Landroid/view/View;)I", "setBottomMargin", "(Landroid/view/View;I)V", "endMargin", "getEndMargin", "setEndMargin", "layoutInflater", "Landroid/view/LayoutInflater;", "Landroid/content/Context;", "getLayoutInflater", "(Landroid/content/Context;)Landroid/view/LayoutInflater;", "topMargin", "getTopMargin", "setTopMargin", "circularClose", "", "Landroid/view/ViewGroup;", "button", "Landroid/widget/ImageButton;", "action", "Lkotlin/Function0;", "circularReveal", "fitSystemWindows", "Landroid/view/Window;", "mainExecutor", "Ljava/util/concurrent/Executor;", "onPageSelected", "Landroidx/viewpager2/widget/ViewPager2;", "Lkotlin/Function1;", "onWindowInsets", "Lkotlin/Function2;", "Landroidx/core/view/WindowInsetsCompat;", "share", "Landroidx/fragment/app/Fragment;", "media", "Lbrite/outdoor/entity/Media;", "title", "", "toggleButton", "flag", "", "rotationAngle", "", "firstIcon", "secondIcon", "app_debug"})
public final class ExtensionsKt {
    
    public static final void toggleButton(@org.jetbrains.annotations.NotNull()
    android.widget.ImageButton $this$toggleButton, boolean flag, float rotationAngle, @androidx.annotation.DrawableRes()
    int firstIcon, @androidx.annotation.DrawableRes()
    int secondIcon, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> action) {
    }
    
    public static final void circularReveal(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $this$circularReveal, @org.jetbrains.annotations.NotNull()
    android.widget.ImageButton button) {
    }
    
    public static final void circularClose(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $this$circularClose, @org.jetbrains.annotations.NotNull()
    android.widget.ImageButton button, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public static final void onWindowInsets(@org.jetbrains.annotations.NotNull()
    android.view.View $this$onWindowInsets, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super android.view.View, ? super androidx.core.view.WindowInsetsCompat, kotlin.Unit> action) {
    }
    
    public static final void fitSystemWindows(@org.jetbrains.annotations.NotNull()
    android.view.Window $this$fitSystemWindows) {
    }
    
    public static final void share(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$share, @org.jetbrains.annotations.NotNull()
    brite.outdoor.entity.Media media, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public static final void onPageSelected(@org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 $this$onPageSelected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> action) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.concurrent.Executor mainExecutor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$mainExecutor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.LayoutInflater getLayoutInflater(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$layoutInflater) {
        return null;
    }
    
    public static final int getTopMargin(@org.jetbrains.annotations.NotNull()
    android.view.View $this$topMargin) {
        return 0;
    }
    
    public static final void setTopMargin(@org.jetbrains.annotations.NotNull()
    android.view.View $this$topMargin, int value) {
    }
    
    public static final int getBottomMargin(@org.jetbrains.annotations.NotNull()
    android.view.View $this$bottomMargin) {
        return 0;
    }
    
    public static final void setBottomMargin(@org.jetbrains.annotations.NotNull()
    android.view.View $this$bottomMargin, int value) {
    }
    
    public static final int getEndMargin(@org.jetbrains.annotations.NotNull()
    android.view.View $this$endMargin) {
        return 0;
    }
    
    public static final void setEndMargin(@org.jetbrains.annotations.NotNull()
    android.view.View $this$endMargin, int value) {
    }
}