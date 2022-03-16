package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\u0018\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lbrite/outdoor/adapter/AdapterViewPageIntro;", "Landroidx/viewpager/widget/PagerAdapter;", "activity", "Lbrite/outdoor/ui/activities/MainActivity;", "(Lbrite/outdoor/ui/activities/MainActivity;)V", "getActivity", "()Lbrite/outdoor/ui/activities/MainActivity;", "factory", "Lcom/bumptech/glide/request/transition/DrawableCrossFadeFactory;", "kotlin.jvm.PlatformType", "getFactory", "()Lcom/bumptech/glide/request/transition/DrawableCrossFadeFactory;", "setFactory", "(Lcom/bumptech/glide/request/transition/DrawableCrossFadeFactory;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "mImageIds", "", "widthImage", "", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "object", "", "getCount", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "app_debug"})
public final class AdapterViewPageIntro extends androidx.viewpager.widget.PagerAdapter {
    private final android.view.LayoutInflater layoutInflater = null;
    private final int[] mImageIds = {2131231248, 2131231249, 2131231250, 2131231251, 2131231252};
    private int widthImage;
    private com.bumptech.glide.request.transition.DrawableCrossFadeFactory factory;
    @org.jetbrains.annotations.NotNull()
    private final brite.outdoor.ui.activities.MainActivity activity = null;
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
        return false;
    }
    
    public final com.bumptech.glide.request.transition.DrawableCrossFadeFactory getFactory() {
        return null;
    }
    
    public final void setFactory(com.bumptech.glide.request.transition.DrawableCrossFadeFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position) {
        return null;
    }
    
    @java.lang.Override()
    public void destroyItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.ui.activities.MainActivity getActivity() {
        return null;
    }
    
    public AdapterViewPageIntro(@org.jetbrains.annotations.NotNull()
    brite.outdoor.ui.activities.MainActivity activity) {
        super();
    }
}