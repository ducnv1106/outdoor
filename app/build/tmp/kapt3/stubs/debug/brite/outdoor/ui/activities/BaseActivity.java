package brite.outdoor.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0004J \u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0004J \u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0004J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u000f\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0004\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0004J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\fH\u0014J \u0010\u001c\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J \u0010\u001d\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0004J\r\u0010\u001e\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0004R\u001c\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\n\u00a8\u0006 "}, d2 = {"Lbrite/outdoor/ui/activities/BaseActivity;", "T", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "binding", "Ljava/lang/Object;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "idContent", "", "tag", "addFragmentAddBackStack", "addOrReplaceFragment", "findFragmentByTag", "getBinding", "()Ljava/lang/Object;", "hideFragmentByTag", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "replaceFragment", "replaceFragmentAddBackStack", "setBinding", "showFragmentByTag", "app_debug"})
public abstract class BaseActivity<T extends java.lang.Object> extends androidx.appcompat.app.AppCompatActivity {
    private final java.lang.String TAG = null;
    private T binding;
    private java.util.HashMap _$_findViewCache;
    
    protected final java.lang.String getTAG() {
        return null;
    }
    
    protected abstract T setBinding();
    
    @org.jetbrains.annotations.Nullable()
    protected final T getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    protected final void addOrReplaceFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int idContent, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    protected final void addFragmentAddBackStack(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int idContent, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    protected final void addFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int idContent, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    protected final void replaceFragmentAddBackStack(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int idContent, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    private final void replaceFragment(androidx.fragment.app.Fragment fragment, int idContent, java.lang.String tag) {
    }
    
    private final androidx.fragment.app.Fragment findFragmentByTag(java.lang.String tag) {
        return null;
    }
    
    protected final void showFragmentByTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    protected final void hideFragmentByTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public BaseActivity() {
        super();
    }
}