package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\"#BA\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0012\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u001c\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010!\u001a\u00020\u001cR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lbrite/outdoor/adapter/AdapterMyPost;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbrite/outdoor/adapter/AdapterMyPost$MyPostViewHolder;", "listMyPost", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "Lkotlin/collections/ArrayList;", "onClickItemListener", "Lbrite/outdoor/adapter/AdapterMyPost$OnClickItemListener;", "userId", "", "isBottomNav", "", "mContext", "Landroid/content/Context;", "(Ljava/util/ArrayList;Lbrite/outdoor/adapter/AdapterMyPost$OnClickItemListener;Ljava/lang/String;ZLandroid/content/Context;)V", "getListMyPost", "()Ljava/util/ArrayList;", "setListMyPost", "(Ljava/util/ArrayList;)V", "from", "parent", "Landroid/view/ViewGroup;", "getItemAt", "position", "", "getItemCount", "onBindViewHolder", "", "holder", "onCreateViewHolder", "viewType", "removeItem", "updateData", "MyPostViewHolder", "OnClickItemListener", "app_debug"})
public final class AdapterMyPost extends androidx.recyclerview.widget.RecyclerView.Adapter<brite.outdoor.adapter.AdapterMyPost.MyPostViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<brite.outdoor.data.api_entities.response.ListPostUserData> listMyPost;
    private final brite.outdoor.adapter.AdapterMyPost.OnClickItemListener onClickItemListener = null;
    private final java.lang.String userId = null;
    private final boolean isBottomNav = false;
    private final android.content.Context mContext = null;
    
    public final void updateData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.adapter.AdapterMyPost.MyPostViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.adapter.AdapterMyPost.MyPostViewHolder from(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterMyPost.MyPostViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final brite.outdoor.data.api_entities.response.ListPostUserData getItemAt(int position) {
        return null;
    }
    
    public final void removeItem(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ListPostUserData> getListMyPost() {
        return null;
    }
    
    public final void setListMyPost(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ListPostUserData> p0) {
    }
    
    public AdapterMyPost(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ListPostUserData> listMyPost, @org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterMyPost.OnClickItemListener onClickItemListener, @org.jetbrains.annotations.Nullable()
    java.lang.String userId, boolean isBottomNav, @org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J!\u0010\u000b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a2\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u000e"}, d2 = {"Lbrite/outdoor/adapter/AdapterMyPost$OnClickItemListener;", "", "onClickComment", "", "entityNew", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "position", "", "onClickItem", "entityMyPage", "onClickLike", "onClickMenu", "(Lbrite/outdoor/data/api_entities/response/ListPostUserData;Ljava/lang/Integer;)V", "onClickShare", "app_debug"})
    public static abstract interface OnClickItemListener {
        
        public abstract void onClickMenu(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ListPostUserData entityMyPage, @org.jetbrains.annotations.Nullable()
        java.lang.Integer position);
        
        public abstract void onClickItem(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ListPostUserData entityMyPage, int position);
        
        public abstract void onClickLike(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position);
        
        public abstract void onClickComment(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position);
        
        public abstract void onClickShare(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lbrite/outdoor/adapter/AdapterMyPost$MyPostViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemNewsVer2Binding;", "(Lbrite/outdoor/adapter/AdapterMyPost;Lbrite/outdoor/databinding/ItemNewsVer2Binding;)V", "getBinding", "()Lbrite/outdoor/databinding/ItemNewsVer2Binding;", "binData", "", "entityMyPage", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "position", "", "setViewInteractive", "statusLike", "", "listMyPost", "app_debug"})
    public final class MyPostViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final brite.outdoor.databinding.ItemNewsVer2Binding binding = null;
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void binData(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ListPostUserData entityMyPage, int position, @org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemNewsVer2Binding binding) {
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        private final void setViewInteractive(boolean statusLike, brite.outdoor.data.api_entities.response.ListPostUserData listMyPost) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.databinding.ItemNewsVer2Binding getBinding() {
            return null;
        }
        
        public MyPostViewHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemNewsVer2Binding binding) {
            super(null);
        }
    }
}