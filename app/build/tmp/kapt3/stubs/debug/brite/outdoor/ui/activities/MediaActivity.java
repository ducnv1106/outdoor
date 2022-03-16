package brite.outdoor.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0003J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0015H\u0014J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\tH\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0014J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006$"}, d2 = {"Lbrite/outdoor/ui/activities/MediaActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lbrite/outdoor/adapter/ImagePagerAdapterMedia;", "binding", "Lbrite/outdoor/databinding/ActMediaBinding;", "listImage", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/ImagePicker;", "Lkotlin/collections/ArrayList;", "position", "", "Ljava/lang/Integer;", "viewModel", "Lbrite/outdoor/viewmodel/MediaViewModel;", "getViewModel", "()Lbrite/outdoor/viewmodel/MediaViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initView", "", "initViewPager", "loadLocale", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onItemClickListener", "item", "onPause", "setLocale", "lang", "", "showViewClose", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MediaActivity extends androidx.appcompat.app.AppCompatActivity {
    private brite.outdoor.databinding.ActMediaBinding binding;
    private java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> listImage;
    private brite.outdoor.adapter.ImagePagerAdapterMedia adapter;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.Integer position;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.MediaViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void initView() {
    }
    
    private final void onItemClickListener(brite.outdoor.data.entities.ImagePicker item) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void initViewPager() {
    }
    
    private final void showViewClose(int position) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final void loadLocale() {
    }
    
    private final void setLocale(java.lang.String lang) {
    }
    
    public MediaActivity() {
        super();
    }
}