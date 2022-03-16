package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 [2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003Z[\\BY\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\b\u0010N\u001a\u00020\u0012H\u0016J\u000e\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u0005J\u001c\u0010R\u001a\u00020P2\n\u0010S\u001a\u00060\u0002R\u00020\u00002\u0006\u0010T\u001a\u00020\u0012H\u0016J\u001c\u0010U\u001a\u00060\u0002R\u00020\u00002\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0012H\u0016J\u000e\u0010Y\u001a\u00020P2\u0006\u0010T\u001a\u00020\u0012R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u001e\u00101\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR\u001e\u00104\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001e\u00109\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010AR\u0013\u0010E\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u001e\u0010H\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\bI\u0010\u001a\"\u0004\bJ\u0010\u001cR\u001a\u0010K\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010=\"\u0004\bM\u0010?\u00a8\u0006]"}, d2 = {"Lbrite/outdoor/adapter/AdapterCommentReplyHotNews;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbrite/outdoor/adapter/AdapterCommentReplyHotNews$CommentReplyHotNewsHolder;", "listComment", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseListCommentHotNews$CommentHotNewsReply;", "Lkotlin/collections/ArrayList;", "urlPrefixAvatar", "Landroidx/lifecycle/MutableLiveData;", "", "urlPrefixComment", "context", "Landroid/content/Context;", "listener", "Lbrite/outdoor/adapter/AdapterCommentReplyHotNews$OnClickItemListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "total_children", "", "(Ljava/util/ArrayList;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Landroid/content/Context;Lbrite/outdoor/adapter/AdapterCommentReplyHotNews$OnClickItemListener;Landroidx/recyclerview/widget/RecyclerView;I)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "extent", "getExtent", "()Ljava/lang/Integer;", "setExtent", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isLoading", "", "()Z", "setLoading", "(Z)V", "lastVisibleItem", "getLastVisibleItem", "setLastVisibleItem", "getListComment", "()Ljava/util/ArrayList;", "setListComment", "(Ljava/util/ArrayList;)V", "getListener", "()Lbrite/outdoor/adapter/AdapterCommentReplyHotNews$OnClickItemListener;", "setListener", "(Lbrite/outdoor/adapter/AdapterCommentReplyHotNews$OnClickItemListener;)V", "offset", "getOffset", "setOffset", "percentage", "getPercentage", "setPercentage", "range", "getRange", "setRange", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "totalItemCount", "getTotalItemCount", "setTotalItemCount", "getTotal_children", "()I", "setTotal_children", "(I)V", "getUrlPrefixAvatar", "()Landroidx/lifecycle/MutableLiveData;", "setUrlPrefixAvatar", "(Landroidx/lifecycle/MutableLiveData;)V", "getUrlPrefixComment", "userId", "getUserId", "()Ljava/lang/String;", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "visibleThreshold", "getVisibleThreshold", "setVisibleThreshold", "getItemCount", "insertItem", "", "item", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "CommentReplyHotNewsHolder", "Companion", "OnClickItemListener", "app_debug"})
public final class AdapterCommentReplyHotNews extends androidx.recyclerview.widget.RecyclerView.Adapter<brite.outdoor.adapter.AdapterCommentReplyHotNews.CommentReplyHotNewsHolder> {
    private boolean isLoading = false;
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
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply> listComment;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> urlPrefixAvatar;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> urlPrefixComment = null;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private brite.outdoor.adapter.AdapterCommentReplyHotNews.OnClickItemListener listener;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.RecyclerView recyclerView = null;
    private int total_children;
    public static final int SCROLL_PERCENTAGE = 98;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.adapter.AdapterCommentReplyHotNews.Companion Companion = null;
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
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
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void insertItem(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.adapter.AdapterCommentReplyHotNews.CommentReplyHotNewsHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterCommentReplyHotNews.CommentReplyHotNewsHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void removeItem(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply> getListComment() {
        return null;
    }
    
    public final void setListComment(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUrlPrefixAvatar() {
        return null;
    }
    
    public final void setUrlPrefixAvatar(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUrlPrefixComment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.adapter.AdapterCommentReplyHotNews.OnClickItemListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterCommentReplyHotNews.OnClickItemListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final int getTotal_children() {
        return 0;
    }
    
    public final void setTotal_children(int p0) {
    }
    
    public AdapterCommentReplyHotNews(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply> listComment, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> urlPrefixAvatar, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> urlPrefixComment, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterCommentReplyHotNews.OnClickItemListener listener, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int total_children) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lbrite/outdoor/adapter/AdapterCommentReplyHotNews$OnClickItemListener;", "", "onClickDelete", "", "entity", "Lbrite/outdoor/data/api_entities/response/ResponseListCommentHotNews$CommentHotNewsReply;", "position", "", "onClickReply", "onClickUserName", "app_debug"})
    public static abstract interface OnClickItemListener {
        
        public abstract void onClickReply(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply entity, int position);
        
        public abstract void onClickDelete(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply entity, int position);
        
        public abstract void onClickUserName(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply entity);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lbrite/outdoor/adapter/AdapterCommentReplyHotNews$CommentReplyHotNewsHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemReplyCommentHotNewsBinding;", "(Lbrite/outdoor/adapter/AdapterCommentReplyHotNews;Lbrite/outdoor/databinding/ItemReplyCommentHotNewsBinding;)V", "getBinding", "()Lbrite/outdoor/databinding/ItemReplyCommentHotNewsBinding;", "binData", "", "item", "Lbrite/outdoor/data/api_entities/response/ResponseListCommentHotNews$CommentHotNewsReply;", "app_debug"})
    public final class CommentReplyHotNewsHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final brite.outdoor.databinding.ItemReplyCommentHotNewsBinding binding = null;
        
        public final void binData(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.databinding.ItemReplyCommentHotNewsBinding getBinding() {
            return null;
        }
        
        public CommentReplyHotNewsHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemReplyCommentHotNewsBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/adapter/AdapterCommentReplyHotNews$Companion;", "", "()V", "SCROLL_PERCENTAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}