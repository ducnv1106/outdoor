package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000212BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010\u000b2\u0006\u0010!\u001a\u00020\u0006H\u0002J\b\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0016J\u000e\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u000bJ\u000e\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u000bJ\u0018\u0010\'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0006H\u0016J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u0006\u0010*\u001a\u00020\fJ\u0016\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.J)\u0010\u0019\u001a\u00020\f2\u001a\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\u0016H\u0007\u00a2\u0006\u0002\b0R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0015j\b\u0012\u0004\u0012\u00020\u000b`\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lbrite/outdoor/adapter/ImagePickAdapterAvatar;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mContext", "Landroid/content/Context;", "wightItem", "", "wightCheckBox", "mgCheckBox", "itemClickListener", "Lkotlin/Function1;", "Lbrite/outdoor/data/entities/ImagePicker;", "", "textSize", "", "(Landroid/content/Context;IIILkotlin/jvm/functions/Function1;F)V", "TYPE_VIEW_CAMERA", "TYPE_VIEW_MEDIA", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "listImage", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getListImage", "()Ljava/util/ArrayList;", "setListImage", "(Ljava/util/ArrayList;)V", "oldSelectedPosition", "from", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemAt", "position", "getItemCount", "getItemViewType", "insertImagePicker", "item", "insertImagerPickerFirstPosition", "onBindViewHolder", "holder", "onCreateViewHolder", "removeAll", "resetSelected", "imagePicker", "isAdd", "", "newListImage", "setListImage1", "CameraVewHolder", "ImageViewHolder", "app_debug"})
public final class ImagePickAdapterAvatar extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> listImage;
    private final int TYPE_VIEW_CAMERA = 1;
    private final int TYPE_VIEW_MEDIA = 2;
    private int oldSelectedPosition = -1;
    private final android.content.Context mContext = null;
    private final int wightItem = 0;
    private final int wightCheckBox = 0;
    private final int mgCheckBox = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<brite.outdoor.data.entities.ImagePicker, kotlin.Unit> itemClickListener = null;
    private final float textSize = 0.0F;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> getListImage() {
        return null;
    }
    
    public final void setListImage(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> p0) {
    }
    
    public final void setListImage1(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> newListImage) {
    }
    
    public final void removeAll() {
    }
    
    public final void insertImagePicker(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.ImagePicker item) {
    }
    
    public final void insertImagerPickerFirstPosition(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.ImagePicker item) {
    }
    
    public final void resetSelected(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.ImagePicker imagePicker, boolean isAdd) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<brite.outdoor.data.entities.ImagePicker, kotlin.Unit> getItemClickListener() {
        return null;
    }
    
    public ImagePickAdapterAvatar(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, int wightItem, int wightCheckBox, int mgCheckBox, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super brite.outdoor.data.entities.ImagePicker, kotlin.Unit> itemClickListener, float textSize) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lbrite/outdoor/adapter/ImagePickAdapterAvatar$CameraVewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemPickCameraBinding;", "(Lbrite/outdoor/adapter/ImagePickAdapterAvatar;Lbrite/outdoor/databinding/ItemPickCameraBinding;)V", "getBinding", "()Lbrite/outdoor/databinding/ItemPickCameraBinding;", "bind", "", "imagePicker", "Lbrite/outdoor/data/entities/ImagePicker;", "position", "", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lbrite/outdoor/adapter/ImagePickAdapterAvatar$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemPickImageBinding;", "(Lbrite/outdoor/adapter/ImagePickAdapterAvatar;Lbrite/outdoor/databinding/ItemPickImageBinding;)V", "getBinding", "()Lbrite/outdoor/databinding/ItemPickImageBinding;", "bind", "", "imagePicker", "Lbrite/outdoor/data/entities/ImagePicker;", "position", "", "app_debug"})
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