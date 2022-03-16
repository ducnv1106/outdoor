package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 n2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0005nopqrBs\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00126\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0011\u00a2\u0006\u0002\u0010\u0017J\u001e\u0010U\u001a\u00020\u00162\u0016\u0010V\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0019j\b\u0012\u0004\u0012\u00020\u0002`WJ\u0010\u0010X\u001a\u0004\u0018\u00010\u00022\u0006\u0010Y\u001a\u00020\u000eJ\u001c\u0010Z\u001a\u00020\u00162\n\u0010[\u001a\u00060\u0003R\u00020\u00002\u0006\u0010Y\u001a\u00020\u000eH\u0016J\u001c\u0010\\\u001a\u00060\u0003R\u00020\u00002\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u000eH\u0016J\u0014\u0010`\u001a\u00020\u00162\n\u0010[\u001a\u00060\u0003R\u00020\u0000H\u0016J\u0006\u0010a\u001a\u00020\u0016J\u000e\u0010b\u001a\u00020\u00162\u0006\u0010c\u001a\u00020\u000eJ\u000e\u0010d\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\u000eJ\u000e\u0010e\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000eJ\u0017\u00103\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u000100H\u0007\u00a2\u0006\u0002\bfJ\u0006\u0010g\u001a\u00020\u0016J\u0018\u0010h\u001a\u00020\u00162\u000e\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010iH\u0016J*\u0010j\u001a\u00020\u00162\"\u0010k\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0lj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`mR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00109\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R>\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010@\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010C\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bD\u0010$\"\u0004\bE\u0010&R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001e\u0010J\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bK\u0010$\"\u0004\bL\u0010&R\u001e\u0010M\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bN\u0010$\"\u0004\bO\u0010&R\u001a\u0010P\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T\u00a8\u0006s"}, d2 = {"Lbrite/outdoor/adapter/AdapterHomeNew;", "Landroidx/recyclerview/widget/ListAdapter;", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "Lbrite/outdoor/adapter/AdapterHomeNew$HomeViewHolder;", "context", "Landroid/content/Context;", "onClickItemListener", "Lbrite/outdoor/adapter/AdapterHomeNew$OnClickItemListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "isShowViewLine", "", "playersMap", "", "", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "onPlayVideoIfNeed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "id", "needPlay", "", "(Landroid/content/Context;Lbrite/outdoor/adapter/AdapterHomeNew$OnClickItemListener;Landroidx/recyclerview/widget/RecyclerView;ZLjava/util/Map;Lkotlin/jvm/functions/Function2;)V", "arrayListNews", "Ljava/util/ArrayList;", "getArrayListNews", "()Ljava/util/ArrayList;", "setArrayListNews", "(Ljava/util/ArrayList;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "extent", "getExtent", "()Ljava/lang/Integer;", "setExtent", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isLoading", "()Z", "setLoading", "(Z)V", "lastVisibleItem", "getLastVisibleItem", "setLastVisibleItem", "loadMore", "Lbrite/outdoor/adapter/AdapterHomeNew$ILoadMore;", "getLoadMore", "()Lbrite/outdoor/adapter/AdapterHomeNew$ILoadMore;", "setLoadMore", "(Lbrite/outdoor/adapter/AdapterHomeNew$ILoadMore;)V", "mContext", "mFirstVisibleItem", "mOnClickItemListener", "mVisibleItemCount", "offset", "getOffset", "setOffset", "getOnClickItemListener", "()Lbrite/outdoor/adapter/AdapterHomeNew$OnClickItemListener;", "setOnClickItemListener", "(Lbrite/outdoor/adapter/AdapterHomeNew$OnClickItemListener;)V", "percentage", "getPercentage", "setPercentage", "range", "getRange", "setRange", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "totalItemCount", "getTotalItemCount", "setTotalItemCount", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "visibleThreshold", "getVisibleThreshold", "()I", "setVisibleThreshold", "(I)V", "addAllItem", "list", "Lkotlin/collections/ArrayList;", "getItemAt", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "releaseAllPlayers", "releaseRecycledPlayers", "index", "removeItem", "removeUnFollow", "setLoadMore1", "setLoaded", "submitList", "", "updateListFollowUnFollow", "hashMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Companion", "HomeDiffUtilCallBack", "HomeViewHolder", "ILoadMore", "OnClickItemListener", "app_debug"})
public final class AdapterHomeNew extends androidx.recyclerview.widget.ListAdapter<brite.outdoor.data.api_entities.response.ListPostUserData, brite.outdoor.adapter.AdapterHomeNew.HomeViewHolder> {
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<brite.outdoor.data.api_entities.response.ListPostUserData> arrayListNews;
    private boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.adapter.AdapterHomeNew.ILoadMore loadMore;
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
    private int mFirstVisibleItem = 0;
    private int mVisibleItemCount = 0;
    private brite.outdoor.adapter.AdapterHomeNew.OnClickItemListener mOnClickItemListener;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private brite.outdoor.adapter.AdapterHomeNew.OnClickItemListener onClickItemListener;
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private final boolean isShowViewLine = false;
    private final java.util.Map<java.lang.Integer, com.google.android.exoplayer2.SimpleExoPlayer> playersMap = null;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> onPlayVideoIfNeed = null;
    public static final int SCROLL_PERCENTAGE = 98;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.adapter.AdapterHomeNew.Companion Companion = null;
    
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
    public final brite.outdoor.adapter.AdapterHomeNew.ILoadMore getLoadMore() {
        return null;
    }
    
    public final void setLoadMore(@org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterHomeNew.ILoadMore p0) {
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
    
    public final void releaseAllPlayers() {
    }
    
    public final void releaseRecycledPlayers(int index) {
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterHomeNew.HomeViewHolder holder) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.data.api_entities.response.ListPostUserData getItemAt(int position) {
        return null;
    }
    
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<brite.outdoor.data.api_entities.response.ListPostUserData> list) {
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
    brite.outdoor.adapter.AdapterHomeNew.ILoadMore loadMore) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.adapter.AdapterHomeNew.HomeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterHomeNew.HomeViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.adapter.AdapterHomeNew.OnClickItemListener getOnClickItemListener() {
        return null;
    }
    
    public final void setOnClickItemListener(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterHomeNew.OnClickItemListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    public AdapterHomeNew(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterHomeNew.OnClickItemListener onClickItemListener, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, boolean isShowViewLine, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, com.google.android.exoplayer2.SimpleExoPlayer> playersMap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> onPlayVideoIfNeed) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0017\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&\u00a2\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u000f"}, d2 = {"Lbrite/outdoor/adapter/AdapterHomeNew$OnClickItemListener;", "", "onClickComment", "", "entityNew", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "position", "", "onClickItem", "onClickItemGoToFrmPersonalPage", "userId", "(Ljava/lang/Integer;)V", "onClickLike", "onClickMenu", "onClickShare", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lbrite/outdoor/adapter/AdapterHomeNew$ILoadMore;", "", "onLoadMore", "", "app_debug"})
    public static abstract interface ILoadMore {
        
        public abstract void onLoadMore();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lbrite/outdoor/adapter/AdapterHomeNew$HomeDiffUtilCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lbrite/outdoor/adapter/AdapterHomeNew$HomeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemNewsVer2Binding;", "(Lbrite/outdoor/adapter/AdapterHomeNew;Lbrite/outdoor/databinding/ItemNewsVer2Binding;)V", "getBinding", "()Lbrite/outdoor/databinding/ItemNewsVer2Binding;", "binData", "", "item", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "position", "", "setViewInteractive", "app_debug"})
    public final class HomeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final brite.outdoor.databinding.ItemNewsVer2Binding binding = null;
        
        public final void binData(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemNewsVer2Binding binding, @org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ListPostUserData item, int position) {
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        private final void setViewInteractive(brite.outdoor.databinding.ItemNewsVer2Binding binding, brite.outdoor.data.api_entities.response.ListPostUserData item) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/adapter/AdapterHomeNew$Companion;", "", "()V", "SCROLL_PERCENTAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}