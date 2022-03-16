package brite.outdoor.ui.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020 J\b\u0010\"\u001a\u00020\u001fH\u0016J\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020$2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J&\u0010&\u001a\u00020$2\u001c\u0010\'\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\n0(H\u0002J\u0012\u0010)\u001a\u00020$2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J$\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00102\u001a\u00020$H\u0016J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u000205H\u0007J\b\u00106\u001a\u00020$H\u0016J\b\u00107\u001a\u00020$H\u0016J&\u00108\u001a\u00020$2\u001c\u0010\'\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\n0(H\u0002J\u0010\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020\u0006H\u0002J\u0010\u0010;\u001a\u00020$2\u0006\u0010:\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001`\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lbrite/outdoor/ui/dialog/FrmEditBlockPost;", "Landroidx/fragment/app/DialogFragment;", "()V", "adapter", "Lbrite/outdoor/adapter/AdapterContentBlock;", "binding", "Lbrite/outdoor/databinding/FrmEditBlockPostBinding;", "lisImageDelete", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "listDataDialogFrmImagePager", "Lbrite/outdoor/data/entities/ImagePicker;", "listImagePicker", "getListImagePicker", "()Ljava/util/ArrayList;", "listImagePickerOldEdit", "listSelect", "pickImageViewModel", "Lbrite/outdoor/viewmodel/PushPostViewModel;", "getPickImageViewModel", "()Lbrite/outdoor/viewmodel/PushPostViewModel;", "pickImageViewModel$delegate", "Lkotlin/Lazy;", "scaleValue", "", "getRealSize", "Lbrite/outdoor/utils/ViewSize;", "sizeDesign", "getScaleValue", "getSizeWithScale", "", "", "getSizeWithScaleFloat", "getTheme", "initView", "", "loadControlsAndResize", "observeListImageSelected", "list", "Landroidx/lifecycle/MutableLiveData;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onEvent", "event", "", "onStart", "onStop", "setupListView", "setupOnClickListener", "frmPickImageBinding", "setupTopNavigation", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmEditBlockPost extends androidx.fragment.app.DialogFragment {
    private brite.outdoor.databinding.FrmEditBlockPostBinding binding;
    private brite.outdoor.adapter.AdapterContentBlock adapter;
    private java.util.ArrayList<java.lang.String> lisImageDelete;
    private java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> listSelect;
    private final kotlin.Lazy pickImageViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> listImagePicker = null;
    private java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> listImagePickerOldEdit;
    private java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> listDataDialogFrmImagePager;
    private float scaleValue = 0.0F;
    private static final java.lang.String TAG = "TestDialogFragment";
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.dialog.FrmEditBlockPost.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.PushPostViewModel getPickImageViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> getListImagePicker() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    public int getTheme() {
        return 0;
    }
    
    public final void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmEditBlockPostBinding binding) {
    }
    
    public final void initView() {
    }
    
    private final void observeListImageSelected(androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.ImagePicker>> list) {
    }
    
    private final void setupListView(androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.ImagePicker>> list) {
    }
    
    private final void setupOnClickListener(brite.outdoor.databinding.FrmEditBlockPostBinding frmPickImageBinding) {
    }
    
    private final void setupTopNavigation(brite.outdoor.databinding.FrmEditBlockPostBinding frmPickImageBinding) {
    }
    
    private final float getScaleValue() {
        return 0.0F;
    }
    
    public final int getSizeWithScale(double sizeDesign) {
        return 0;
    }
    
    public final float getSizeWithScaleFloat(double sizeDesign) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.utils.ViewSize getRealSize(@org.jetbrains.annotations.NotNull()
    brite.outdoor.utils.ViewSize sizeDesign) {
        return null;
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
    
    public FrmEditBlockPost() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/ui/dialog/FrmEditBlockPost$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}