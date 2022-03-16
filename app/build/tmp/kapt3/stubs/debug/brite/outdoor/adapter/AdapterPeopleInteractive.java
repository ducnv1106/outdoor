package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 ]2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004]^_`B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010H\u001a\u00060\u0002R\u00020\u00002\u0006\u0010I\u001a\u00020JJ\u0010\u0010K\u001a\u0004\u0018\u00010\u001d2\u0006\u0010L\u001a\u00020\rJ\b\u0010M\u001a\u00020\rH\u0016J\u001a\u0010N\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001eJ\b\u0010O\u001a\u00020:H\u0002J\u000e\u0010P\u001a\u00020\r2\u0006\u0010Q\u001a\u00020RJ\u001e\u0010S\u001a\u00020T2\u0016\u0010U\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eJ\u001c\u0010V\u001a\u00020T2\n\u0010W\u001a\u00060\u0002R\u00020\u00002\u0006\u0010L\u001a\u00020\rH\u0016J\u001c\u0010X\u001a\u00060\u0002R\u00020\u00002\u0006\u0010I\u001a\u00020J2\u0006\u0010Y\u001a\u00020\rH\u0016J\u0017\u0010#\u001a\u00020T2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007\u00a2\u0006\u0002\bZJ\u0006\u0010[\u001a\u00020TJ\"\u0010\\\u001a\u00020T2\u001a\u0010U\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001eR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\"\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0010\u0010\'\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0011R\u001e\u00102\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b<\u0010\u000f\"\u0004\b=\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001e\u0010@\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\bA\u0010\u000f\"\u0004\bB\u0010\u0011R\u001a\u0010C\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G\u00a8\u0006a"}, d2 = {"Lbrite/outdoor/adapter/AdapterPeopleInteractive;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbrite/outdoor/adapter/AdapterPeopleInteractive$PeopleInteractiveViewHolder;", "mContext", "Landroid/content/Context;", "urlPrefixAvatar", "", "onClickItemListener", "Lbrite/outdoor/adapter/AdapterPeopleInteractive$OnClickItemListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroid/content/Context;Ljava/lang/String;Lbrite/outdoor/adapter/AdapterPeopleInteractive$OnClickItemListener;Landroidx/recyclerview/widget/RecyclerView;)V", "extent", "", "getExtent", "()Ljava/lang/Integer;", "setExtent", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isLoading", "", "()Z", "setLoading", "(Z)V", "lastVisibleItem", "getLastVisibleItem", "setLastVisibleItem", "listFollowUser", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseFollowUser$FollowUserData;", "Lkotlin/collections/ArrayList;", "loadMore", "Lbrite/outdoor/adapter/AdapterPeopleInteractive$ILoadMore;", "getLoadMore", "()Lbrite/outdoor/adapter/AdapterPeopleInteractive$ILoadMore;", "setLoadMore", "(Lbrite/outdoor/adapter/AdapterPeopleInteractive$ILoadMore;)V", "getMContext", "()Landroid/content/Context;", "mOnClickItemListener", "offset", "getOffset", "setOffset", "getOnClickItemListener", "()Lbrite/outdoor/adapter/AdapterPeopleInteractive$OnClickItemListener;", "setOnClickItemListener", "(Lbrite/outdoor/adapter/AdapterPeopleInteractive$OnClickItemListener;)V", "percentage", "getPercentage", "setPercentage", "range", "getRange", "setRange", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "scaleValue", "", "totalItemCount", "getTotalItemCount", "setTotalItemCount", "getUrlPrefixAvatar", "()Ljava/lang/String;", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "visibleThreshold", "getVisibleThreshold", "()I", "setVisibleThreshold", "(I)V", "from", "parent", "Landroid/view/ViewGroup;", "getItemAt", "position", "getItemCount", "getListFollowUser", "getScaleValue", "getSizeWithScale", "sizeDesign", "", "insertList", "", "list", "onBindViewHolder", "holder", "onCreateViewHolder", "viewType", "setLoadMore1", "setLoaded", "updateList", "Companion", "ILoadMore", "OnClickItemListener", "PeopleInteractiveViewHolder", "app_debug"})
public final class AdapterPeopleInteractive extends androidx.recyclerview.widget.RecyclerView.Adapter<brite.outdoor.adapter.AdapterPeopleInteractive.PeopleInteractiveViewHolder> {
    private java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseFollowUser.FollowUserData> listFollowUser;
    private boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.adapter.AdapterPeopleInteractive.ILoadMore loadMore;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer lastVisibleItem;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer totalItemCount;
    private int visibleThreshold = 1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer visibleItemCount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer offset;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer extent;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer range;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer percentage;
    private brite.outdoor.adapter.AdapterPeopleInteractive.OnClickItemListener mOnClickItemListener;
    private float scaleValue = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String urlPrefixAvatar = null;
    @org.jetbrains.annotations.NotNull()
    private brite.outdoor.adapter.AdapterPeopleInteractive.OnClickItemListener onClickItemListener;
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    public static final int SCROLL_PERCENTAGE = 98;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.adapter.AdapterPeopleInteractive.Companion Companion = null;
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.adapter.AdapterPeopleInteractive.ILoadMore getLoadMore() {
        return null;
    }
    
    public final void setLoadMore(@org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterPeopleInteractive.ILoadMore p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLastVisibleItem() {
        return null;
    }
    
    public final void setLastVisibleItem(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalItemCount() {
        return null;
    }
    
    public final void setTotalItemCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final int getVisibleThreshold() {
        return 0;
    }
    
    public final void setVisibleThreshold(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVisibleItemCount() {
        return null;
    }
    
    public final void setVisibleItemCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOffset() {
        return null;
    }
    
    public final void setOffset(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getExtent() {
        return null;
    }
    
    public final void setExtent(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRange() {
        return null;
    }
    
    public final void setRange(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPercentage() {
        return null;
    }
    
    public final void setPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseFollowUser.FollowUserData> getListFollowUser() {
        return null;
    }
    
    public final void updateList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseFollowUser.FollowUserData> list) {
    }
    
    public final void insertList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseFollowUser.FollowUserData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.adapter.AdapterPeopleInteractive.PeopleInteractiveViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.adapter.AdapterPeopleInteractive.PeopleInteractiveViewHolder from(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterPeopleInteractive.PeopleInteractiveViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.data.api_entities.response.ResponseFollowUser.FollowUserData getItemAt(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setLoadMore1(@org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterPeopleInteractive.ILoadMore loadMore) {
    }
    
    public final void setLoaded() {
    }
    
    private final float getScaleValue() {
        return 0.0F;
    }
    
    public final int getSizeWithScale(double sizeDesign) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrlPrefixAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.adapter.AdapterPeopleInteractive.OnClickItemListener getOnClickItemListener() {
        return null;
    }
    
    public final void setOnClickItemListener(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterPeopleInteractive.OnClickItemListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    public AdapterPeopleInteractive(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.Nullable()
    java.lang.String urlPrefixAvatar, @org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterPeopleInteractive.OnClickItemListener onClickItemListener, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lbrite/outdoor/adapter/AdapterPeopleInteractive$OnClickItemListener;", "", "onClickFollow", "", "entityFollowUser", "Lbrite/outdoor/data/api_entities/response/ResponseFollowUser$FollowUserData;", "onClickItem", "app_debug"})
    public static abstract interface OnClickItemListener {
        
        public abstract void onClickItem(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ResponseFollowUser.FollowUserData entityFollowUser);
        
        public abstract void onClickFollow(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ResponseFollowUser.FollowUserData entityFollowUser);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbrite/outdoor/adapter/AdapterPeopleInteractive$PeopleInteractiveViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemPeopleInteractiveBinding;", "(Lbrite/outdoor/adapter/AdapterPeopleInteractive;Lbrite/outdoor/databinding/ItemPeopleInteractiveBinding;)V", "bind", "", "position", "", "app_debug"})
    public final class PeopleInteractiveViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final brite.outdoor.databinding.ItemPeopleInteractiveBinding binding = null;
        
        public final void bind(int position) {
        }
        
        public PeopleInteractiveViewHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemPeopleInteractiveBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lbrite/outdoor/adapter/AdapterPeopleInteractive$ILoadMore;", "", "onLoadMore", "", "app_debug"})
    public static abstract interface ILoadMore {
        
        public abstract void onLoadMore();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/adapter/AdapterPeopleInteractive$Companion;", "", "()V", "SCROLL_PERCENTAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}