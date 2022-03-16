package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001/Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\f\u0012!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00100\f\u00a2\u0006\u0002\u0010\u0013J\u0012\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0012\u001a\u00020\u0006J\b\u0010\'\u001a\u00020\u0006H\u0016J\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u0019J\u001c\u0010)\u001a\u00020\u00102\n\u0010*\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u001c\u0010+\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010,\u001a\u00020\u0006H\u0016J\"\u0010-\u001a\u00020\u00102\u001a\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u0019R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R,\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R,\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00100\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001e\u00a8\u00060"}, d2 = {"Lbrite/outdoor/adapter/AdapterPostContent;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbrite/outdoor/adapter/AdapterPostContent$PostContentViewHolder;", "mContent", "Landroid/content/Context;", "heightButton", "", "sizeIconAddImages", "sizeTextContent", "", "minHeightContent", "scrollToNewContent", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "lastPosition", "", "transToSelectImages", "position", "(Landroid/content/Context;IIFILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getHeightButton", "()I", "listContent", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/PostContentEntity;", "Lkotlin/collections/ArrayList;", "getMContent", "()Landroid/content/Context;", "getMinHeightContent", "getScrollToNewContent", "()Lkotlin/jvm/functions/Function1;", "getSizeIconAddImages", "getSizeTextContent", "()F", "getTransToSelectImages", "from", "parent", "Landroid/view/ViewGroup;", "getItemAt", "getItemCount", "getListContent", "onBindViewHolder", "holder", "onCreateViewHolder", "viewType", "updateList", "list", "PostContentViewHolder", "app_debug"})
public final class AdapterPostContent extends androidx.recyclerview.widget.RecyclerView.Adapter<brite.outdoor.adapter.AdapterPostContent.PostContentViewHolder> {
    private java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity> listContent;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContent = null;
    private final int heightButton = 0;
    private final int sizeIconAddImages = 0;
    private final float sizeTextContent = 0.0F;
    private final int minHeightContent = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> scrollToNewContent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> transToSelectImages = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity> getListContent() {
        return null;
    }
    
    public final void updateList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.adapter.AdapterPostContent.PostContentViewHolder from(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.adapter.AdapterPostContent.PostContentViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterPostContent.PostContentViewHolder holder, int position) {
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
    
    public final int getSizeIconAddImages() {
        return 0;
    }
    
    public final float getSizeTextContent() {
        return 0.0F;
    }
    
    public final int getMinHeightContent() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getScrollToNewContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getTransToSelectImages() {
        return null;
    }
    
    public AdapterPostContent(@org.jetbrains.annotations.NotNull()
    android.content.Context mContent, int heightButton, int sizeIconAddImages, float sizeTextContent, int minHeightContent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> scrollToNewContent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> transToSelectImages) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lbrite/outdoor/adapter/AdapterPostContent$PostContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemPushPostContentBinding;", "(Lbrite/outdoor/adapter/AdapterPostContent;Lbrite/outdoor/databinding/ItemPushPostContentBinding;)V", "bind", "", "position", "", "getLastPosition", "app_debug"})
    public final class PostContentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final brite.outdoor.databinding.ItemPushPostContentBinding binding = null;
        
        private final int getLastPosition() {
            return 0;
        }
        
        public final void bind(int position) {
        }
        
        public PostContentViewHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemPushPostContentBinding binding) {
            super(null);
        }
    }
}