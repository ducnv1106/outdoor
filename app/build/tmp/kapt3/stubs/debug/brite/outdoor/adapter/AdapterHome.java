package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 `2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0005`abcdB\'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001e\u0010I\u001a\u00020J2\u0016\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`LJ\u0006\u0010M\u001a\u00020JJ\u001c\u0010N\u001a\u00020J2\n\u0010O\u001a\u00060\u0003R\u00020\u00002\u0006\u0010P\u001a\u00020\u0018H\u0016J\u001c\u0010Q\u001a\u00060\u0003R\u00020\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0018H\u0016J\u000e\u0010U\u001a\u00020J2\u0006\u0010P\u001a\u00020\u0018J\u000e\u0010V\u001a\u00020J2\u0006\u0010W\u001a\u00020\u0018J\u0017\u0010)\u001a\u00020J2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007\u00a2\u0006\u0002\bXJ\u0006\u0010Y\u001a\u00020JJ\u0018\u0010Z\u001a\u00020J2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010[H\u0016J*\u0010\\\u001a\u00020J2\"\u0010]\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180^j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018`_R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00104\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\u001e\u00107\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010\u001cR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010\u001cR\u001e\u0010A\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010\u001cR\u001a\u0010D\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H\u00a8\u0006e"}, d2 = {"Lbrite/outdoor/adapter/AdapterHome;", "Landroidx/recyclerview/widget/ListAdapter;", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "Lbrite/outdoor/adapter/AdapterHome$HomeViewHolder;", "context", "Landroid/content/Context;", "onClickItemListener", "Lbrite/outdoor/adapter/AdapterHome$OnClickItemListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "isShowViewLine", "", "(Landroid/content/Context;Lbrite/outdoor/adapter/AdapterHome$OnClickItemListener;Landroidx/recyclerview/widget/RecyclerView;Z)V", "arrayListNews", "Ljava/util/ArrayList;", "getArrayListNews", "()Ljava/util/ArrayList;", "setArrayListNews", "(Ljava/util/ArrayList;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "extent", "", "getExtent", "()Ljava/lang/Integer;", "setExtent", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isLoading", "()Z", "setLoading", "(Z)V", "lastVisibleItem", "getLastVisibleItem", "setLastVisibleItem", "loadMore", "Lbrite/outdoor/adapter/AdapterHome$ILoadMore;", "getLoadMore", "()Lbrite/outdoor/adapter/AdapterHome$ILoadMore;", "setLoadMore", "(Lbrite/outdoor/adapter/AdapterHome$ILoadMore;)V", "mContext", "mOnClickItemListener", "offset", "getOffset", "setOffset", "getOnClickItemListener", "()Lbrite/outdoor/adapter/AdapterHome$OnClickItemListener;", "setOnClickItemListener", "(Lbrite/outdoor/adapter/AdapterHome$OnClickItemListener;)V", "percentage", "getPercentage", "setPercentage", "range", "getRange", "setRange", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "totalItemCount", "getTotalItemCount", "setTotalItemCount", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "visibleThreshold", "getVisibleThreshold", "()I", "setVisibleThreshold", "(I)V", "addAllItem", "", "list", "Lkotlin/collections/ArrayList;", "clearAllData", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "removeUnFollow", "id", "setLoadMore1", "setLoaded", "submitList", "", "updateListFollowUnFollow", "hashMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Companion", "HomeDiffUtilCallBack", "HomeViewHolder", "ILoadMore", "OnClickItemListener", "app_debug"})
public final class AdapterHome extends androidx.recyclerview.widget.ListAdapter<brite.outdoor.data.api_entities.response.ListPostUserData, brite.outdoor.adapter.AdapterHome.HomeViewHolder> {
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<brite.outdoor.data.api_entities.response.ListPostUserData> arrayListNews;
    private boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.adapter.AdapterHome.ILoadMore loadMore;
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
    private brite.outdoor.adapter.AdapterHome.OnClickItemListener mOnClickItemListener;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private brite.outdoor.adapter.AdapterHome.OnClickItemListener onClickItemListener;
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private final boolean isShowViewLine = false;
    public static final int SCROLL_PERCENTAGE = 98;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.adapter.AdapterHome.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ListPostUserData> getArrayListNews() {
        return null;
    }
    
    public final void setArrayListNews(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ListPostUserData> p0) {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.adapter.AdapterHome.ILoadMore getLoadMore() {
        return null;
    }
    
    public final void setLoadMore(@org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterHome.ILoadMore p0) {
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
    
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<brite.outdoor.data.api_entities.response.ListPostUserData> list) {
    }
    
    public final void clearAllData() {
    }
    
    public final void addAllItem(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ListPostUserData> list) {
    }
    
    public final void updateListFollowUnFollow(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap) {
    }
    
    public final void removeUnFollow(int id) {
    }
    
    public final void removeItem(int position) {
    }
    
    public final void setLoaded() {
    }
    
    public final void setLoadMore1(@org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterHome.ILoadMore loadMore) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.adapter.AdapterHome.HomeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterHome.HomeViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.adapter.AdapterHome.OnClickItemListener getOnClickItemListener() {
        return null;
    }
    
    public final void setOnClickItemListener(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterHome.OnClickItemListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    public AdapterHome(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterHome.OnClickItemListener onClickItemListener, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, boolean isShowViewLine) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0017\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&\u00a2\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u000f"}, d2 = {"Lbrite/outdoor/adapter/AdapterHome$OnClickItemListener;", "", "onClickComment", "", "entityNew", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "position", "", "onClickItem", "onClickItemGoToFrmPersonalPage", "userId", "(Ljava/lang/Integer;)V", "onClickLike", "onClickMenu", "onClickShare", "app_debug"})
    public static abstract interface OnClickItemListener {
        
        public abstract void onClickMenu(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position);
        
        public abstract void onClickItem(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position);
        
        public abstract void onClickLike(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position);
        
        public abstract void onClickComment(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position);
        
        public abstract void onClickShare(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position);
        
        public abstract void onClickItemGoToFrmPersonalPage(@org.jetbrains.annotations.Nullable()
        java.lang.Integer userId);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lbrite/outdoor/adapter/AdapterHome$ILoadMore;", "", "onLoadMore", "", "app_debug"})
    public static abstract interface ILoadMore {
        
        public abstract void onLoadMore();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lbrite/outdoor/adapter/AdapterHome$HomeDiffUtilCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class HomeDiffUtilCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<brite.outdoor.data.api_entities.response.ListPostUserData> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ListPostUserData oldItem, @org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ListPostUserData newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ListPostUserData oldItem, @org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ListPostUserData newItem) {
            return false;
        }
        
        public HomeDiffUtilCallBack() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lbrite/outdoor/adapter/AdapterHome$HomeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemNewsVer2Binding;", "(Lbrite/outdoor/adapter/AdapterHome;Lbrite/outdoor/databinding/ItemNewsVer2Binding;)V", "getBinding", "()Lbrite/outdoor/databinding/ItemNewsVer2Binding;", "binData", "", "item", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "position", "", "setViewInteractive", "app_debug"})
    public final class HomeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final brite.outdoor.databinding.ItemNewsVer2Binding binding = null;
        
        public final void binData(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemNewsVer2Binding binding, @org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ListPostUserData item, int position) {
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void setViewInteractive(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemNewsVer2Binding binding, @org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ListPostUserData item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.databinding.ItemNewsVer2Binding getBinding() {
            return null;
        }
        
        public HomeViewHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemNewsVer2Binding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/adapter/AdapterHome$Companion;", "", "()V", "SCROLL_PERCENTAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}