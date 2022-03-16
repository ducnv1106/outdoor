package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u001d\u001eBN\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\t0\u0007\u0012!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0013\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lbrite/outdoor/adapter/AdapterContentBlock;", "Landroidx/recyclerview/widget/ListAdapter;", "Lbrite/outdoor/data/entities/ImagePicker;", "Lbrite/outdoor/adapter/AdapterContentBlock$ContentBlockViewHolder;", "mContext", "Landroid/content/Context;", "listImageSelected", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onClickItemRemoveListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "(Landroid/content/Context;Landroidx/lifecycle/MutableLiveData;Lkotlin/jvm/functions/Function1;)V", "listData", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "list", "", "updateData", "BlockUtilCallBack", "ContentBlockViewHolder", "app_debug"})
public final class AdapterContentBlock extends androidx.recyclerview.widget.ListAdapter<brite.outdoor.data.entities.ImagePicker, brite.outdoor.adapter.AdapterContentBlock.ContentBlockViewHolder> {
    private java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> listData;
    private final android.content.Context mContext = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.ImagePicker>> listImageSelected = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onClickItemRemoveListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.adapter.AdapterContentBlock.ContentBlockViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterContentBlock.ContentBlockViewHolder holder, int position) {
    }
    
    public final void updateData() {
    }
    
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<brite.outdoor.data.entities.ImagePicker> list) {
    }
    
    public AdapterContentBlock(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.ImagePicker>> listImageSelected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickItemRemoveListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lbrite/outdoor/adapter/AdapterContentBlock$ContentBlockViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemImageContentBlockBinding;", "(Lbrite/outdoor/adapter/AdapterContentBlock;Lbrite/outdoor/databinding/ItemImageContentBlockBinding;)V", "getBinding", "()Lbrite/outdoor/databinding/ItemImageContentBlockBinding;", "binData", "", "item", "Lbrite/outdoor/data/entities/ImagePicker;", "app_debug"})
    public final class ContentBlockViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final brite.outdoor.databinding.ItemImageContentBlockBinding binding = null;
        
        public final void binData(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.entities.ImagePicker item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.databinding.ItemImageContentBlockBinding getBinding() {
            return null;
        }
        
        public ContentBlockViewHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemImageContentBlockBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lbrite/outdoor/adapter/AdapterContentBlock$BlockUtilCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lbrite/outdoor/data/entities/ImagePicker;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class BlockUtilCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<brite.outdoor.data.entities.ImagePicker> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.entities.ImagePicker oldItem, @org.jetbrains.annotations.NotNull()
        brite.outdoor.data.entities.ImagePicker newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.entities.ImagePicker oldItem, @org.jetbrains.annotations.NotNull()
        brite.outdoor.data.entities.ImagePicker newItem) {
            return false;
        }
        
        public BlockUtilCallBack() {
            super();
        }
    }
}