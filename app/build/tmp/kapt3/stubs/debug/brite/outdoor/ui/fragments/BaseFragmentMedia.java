package brite.outdoor.ui.fragments;

import java.lang.System;

/**
 * Parent class of all the fragments in this project
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0004J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0004J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u001fH&J$\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u001fH\u0016J\u001a\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0016R\u0012\u0010\u0007\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00110\u00110\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lbrite/outdoor/ui/fragments/BaseFragmentMedia;", "B", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "fragmentLayout", "", "(I)V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "mActivity", "Lbrite/outdoor/ui/activities/CameraActivity;", "getMActivity", "()Lbrite/outdoor/ui/activities/CameraActivity;", "setMActivity", "(Lbrite/outdoor/ui/activities/CameraActivity;)V", "outputDirectory", "", "getOutputDirectory", "()Ljava/lang/String;", "outputDirectory$delegate", "Lkotlin/Lazy;", "permissionRequest", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "permissions", "", "allPermissionsGranted", "", "deleteAllMedia", "", "getMedia", "", "Lbrite/outdoor/entity/Media;", "getMediaQMinus", "getMediaQPlus", "onAttach", "activity", "Landroid/app/Activity;", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPermissionGranted", "onViewCreated", "view", "app_debug"})
public abstract class BaseFragmentMedia<B extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.ui.activities.CameraActivity mActivity;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy outputDirectory$delegate = null;
    private final java.util.List<java.lang.String> permissions = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permissionRequest = null;
    private final int fragmentLayout = 0;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * Generic ViewBinding of the subclasses
     */
    @org.jetbrains.annotations.NotNull()
    public abstract B getBinding();
    
    @org.jetbrains.annotations.Nullable()
    protected final brite.outdoor.ui.activities.CameraActivity getMActivity() {
        return null;
    }
    
    protected final void setMActivity(@org.jetbrains.annotations.Nullable()
    brite.outdoor.ui.activities.CameraActivity p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getOutputDirectory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<brite.outdoor.entity.Media> getMedia() {
        return null;
    }
    
    protected final void deleteAllMedia() {
    }
    
    private final java.util.List<brite.outdoor.entity.Media> getMediaQPlus() {
        return null;
    }
    
    private final java.util.List<brite.outdoor.entity.Media> getMediaQMinus() {
        return null;
    }
    
    /**
     * Check for the permissions
     */
    protected final boolean allPermissionsGranted() {
        return false;
    }
    
    /**
     * A function which will be called after the permission check
     */
    public void onPermissionGranted() {
    }
    
    /**
     * An abstract function which will be called on the Back button press
     */
    public abstract void onBackPressed();
    
    public BaseFragmentMedia(int fragmentLayout) {
        super();
    }
}