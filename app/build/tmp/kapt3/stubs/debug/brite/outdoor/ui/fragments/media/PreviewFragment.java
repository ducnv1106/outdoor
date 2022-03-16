package brite.outdoor.ui.fragments.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u001a\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lbrite/outdoor/ui/fragments/media/PreviewFragment;", "Lbrite/outdoor/ui/fragments/BaseFragmentMedia;", "Lbrite/outdoor/databinding/FrmPreviewBinding;", "()V", "args", "Lbrite/outdoor/ui/fragments/media/PreviewFragmentArgs;", "getArgs", "()Lbrite/outdoor/ui/fragments/media/PreviewFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lbrite/outdoor/databinding/FrmPreviewBinding;", "binding$delegate", "Lkotlin/Lazy;", "media", "Lbrite/outdoor/entity/Media;", "viewMode", "Lbrite/outdoor/viewmodel/CameraViewModel;", "getViewMode", "()Lbrite/outdoor/viewmodel/CameraViewModel;", "viewMode$delegate", "adjustInsets", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onViewCreated", "view", "Landroid/view/View;", "playVideo", "shareImage", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PreviewFragment extends brite.outdoor.ui.fragments.BaseFragmentMedia<brite.outdoor.databinding.FrmPreviewBinding> {
    private final kotlin.Lazy viewMode$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private brite.outdoor.entity.Media media;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.CameraViewModel getViewMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.databinding.FrmPreviewBinding getBinding() {
        return null;
    }
    
    private final brite.outdoor.ui.fragments.media.PreviewFragmentArgs getArgs() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void playVideo() {
    }
    
    /**
     * This methods adds all necessary margins to some views based on window insets and screen orientation
     */
    private final void adjustInsets() {
    }
    
    private final void shareImage() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public PreviewFragment() {
        super(0);
    }
}