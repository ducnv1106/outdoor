package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002&\'B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001c\u001a\u00020\u0006J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u0011J\u001c\u0010\u001f\u001a\u00020 2\n\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0006H\u0016J\"\u0010$\u001a\u00020 2\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006("}, d2 = {"Lbrite/outdoor/adapter/AdapterContentDetail;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbrite/outdoor/adapter/AdapterContentDetail$ContentDetailViewHolder;", "mContent", "Landroid/content/Context;", "heightButton", "", "sizeTextContent", "", "onClickImageListener", "Lbrite/outdoor/adapter/AdapterContentDetail$OnClickImageListener;", "(Landroid/content/Context;IFLbrite/outdoor/adapter/AdapterContentDetail$OnClickImageListener;)V", "getHeightButton", "()I", "listContent", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/PostContentEntity;", "Lkotlin/collections/ArrayList;", "getMContent", "()Landroid/content/Context;", "getOnClickImageListener", "()Lbrite/outdoor/adapter/AdapterContentDetail$OnClickImageListener;", "getSizeTextContent", "()F", "from", "parent", "Landroid/view/ViewGroup;", "getItemAt", "position", "getItemCount", "getListContent", "onBindViewHolder", "", "holder", "onCreateViewHolder", "viewType", "updateList", "list", "ContentDetailViewHolder", "OnClickImageListener", "app_debug"})
public final class AdapterContentDetail extends androidx.recyclerview.widget.RecyclerView.Adapter<brite.outdoor.adapter.AdapterContentDetail.ContentDetailViewHolder> {
    private java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity> listContent;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContent = null;
    private final int heightButton = 0;
    private final float sizeTextContent = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final brite.outdoor.adapter.AdapterContentDetail.OnClickImageListener onClickImageListener = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity> getListContent() {
        return null;
    }
    
    public final void updateList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.adapter.AdapterContentDetail.ContentDetailViewHolder from(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.adapter.AdapterContentDetail.ContentDetailViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterContentDetail.ContentDetailViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.data.entities.PostContentEntity getItemAt(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContent() {
        return null;
    }
    
    public final int getHeightButton() {
        return 0;
    }
    
    public final float getSizeTextContent() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.adapter.AdapterContentDetail.OnClickImageListener getOnClickImageListener() {
        return null;
    }
    
    public AdapterContentDetail(@org.jetbrains.annotations.NotNull()
    android.content.Context mContent, int heightButton, float sizeTextContent, @org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterContentDetail.OnClickImageListener onClickImageListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lbrite/outdoor/adapter/AdapterContentDetail$OnClickImageListener;", "", "onClick", "", "entityNew", "Lbrite/outdoor/data/entities/PostContentEntity;", "position", "", "app_debug"})
    public static abstract interface OnClickImageListener {
        
        public abstract void onClick(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.entities.PostContentEntity entityNew, int position);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lbrite/outdoor/adapter/AdapterContentDetail$ContentDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemContentDetailBinding;", "(Lbrite/outdoor/adapter/AdapterContentDetail;Lbrite/outdoor/databinding/ItemContentDetailBinding;)V", "bind", "", "position", "", "getLastPosition", "app_debug"})
    public final class ContentDetailViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final brite.outdoor.databinding.ItemContentDetailBinding binding = null;
        
        private final int getLastPosition() {
            return 0;
        }
        
        public final void bind(int position) {
        }
        
        public ContentDetailViewHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemContentDetailBinding binding) {
            super(null);
        }
    }
}