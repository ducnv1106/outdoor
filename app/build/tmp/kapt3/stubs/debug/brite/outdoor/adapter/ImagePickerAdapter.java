package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000212Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\rJ\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\rH\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001e\u001a\u00020\rH\u0002J\b\u0010$\u001a\u00020\rH\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u000e\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\nJ\u000e\u0010(\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\nJ\u0018\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\rH\u0016J\u0016\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\nR\u000e\u0010\u0016\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lbrite/outdoor/adapter/ImagePickerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "isEditPost", "", "mContext", "Landroid/content/Context;", "listImageSelected", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/ImagePicker;", "Lkotlin/collections/ArrayList;", "wightItem", "", "wightCheckBox", "mgCheckBox", "textSize", "", "onClickItemCameraListener", "Lkotlin/Function0;", "", "(ZLandroid/content/Context;Landroidx/lifecycle/MutableLiveData;IIIFLkotlin/jvm/functions/Function0;)V", "TYPE_VIEW_CAMERA", "TYPE_VIEW_MEDIA", "isUpdateListSelected", "listImage", "tmpListImageSelected", "getTmpListImageSelected", "()Ljava/util/ArrayList;", "findAndRemoveImageSelected", "position", "from", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemAt", "getItemCount", "getItemViewType", "insertFirstPositionImagePicker", "itemInsert", "insertImagePicker", "onBindViewHolder", "holder", "onCreateViewHolder", "resetCountSelected", "imagePicker", "isAdd", "selector", "p", "CameraVewHolder", "ImageViewHolder", "app_debug"})
public final class ImagePickerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> listImage;
    private final int TYPE_VIEW_CAMERA = 1;
    private final int TYPE_VIEW_MEDIA = 2;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> tmpListImageSelected = null;
    private boolean isUpdateListSelected = true;
    private final boolean isEditPost = false;
    private final android.content.Context mContext = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.ImagePicker>> listImageSelected = null;
    private final int wightItem = 0;
    private final int wightCheckBox = 0;
    private final int mgCheckBox = 0;
    private final float textSize = 0.0F;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClickItemCameraListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> getTmpListImageSelected() {
        return null;
    }
    
    public final void insertImagePicker(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.ImagePicker itemInsert) {
    }
    
    public final void insertFirstPositionImagePicker(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.ImagePicker itemInsert) {
    }
    
    public final int selector(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.ImagePicker p) {
        return 0;
    }
    
    public final void resetCountSelected(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.ImagePicker imagePicker, boolean isAdd) {
    }
    
    public final void findAndRemoveImageSelected(int position) {
    }
    
    private final androidx.recyclerview.widget.RecyclerView.ViewHolder from(android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final brite.outdoor.data.entities.ImagePicker getItemAt(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ImagePickerAdapter(boolean isEditPost, @org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.ImagePicker>> listImageSelected, int wightItem, int wightCheckBox, int mgCheckBox, float textSize, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickItemCameraListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lbrite/outdoor/adapter/ImagePickerAdapter$CameraVewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemPickCameraBinding;", "(Lbrite/outdoor/adapter/ImagePickerAdapter;Lbrite/outdoor/databinding/ItemPickCameraBinding;)V", "getBinding", "()Lbrite/outdoor/databinding/ItemPickCameraBinding;", "bind", "", "imagePicker", "Lbrite/outdoor/data/entities/ImagePicker;", "position", "", "app_debug"})
    public final class CameraVewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final brite.outdoor.databinding.ItemPickCameraBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.entities.ImagePicker imagePicker, int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.databinding.ItemPickCameraBinding getBinding() {
            return null;
        }
        
        public CameraVewHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemPickCameraBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lbrite/outdoor/adapter/ImagePickerAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemPickImageBinding;", "(Lbrite/outdoor/adapter/ImagePickerAdapter;Lbrite/outdoor/databinding/ItemPickImageBinding;)V", "getBinding", "()Lbrite/outdoor/databinding/ItemPickImageBinding;", "bind", "", "imagePicker", "Lbrite/outdoor/data/entities/ImagePicker;", "position", "", "app_debug"})
    public final class ImageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final brite.outdoor.databinding.ItemPickImageBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.entities.ImagePicker imagePicker, int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.databinding.ItemPickImageBinding getBinding() {
            return null;
        }
        
        public ImageViewHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemPickImageBinding binding) {
            super(null);
        }
    }
}