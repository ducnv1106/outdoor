package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 X2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004XYZ[B5\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u000e\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0005J\b\u0010M\u001a\u00020\u0013H\u0016J\u001c\u0010N\u001a\u00020K2\n\u0010O\u001a\u00060\u0002R\u00020\u00002\u0006\u0010P\u001a\u00020\u0013H\u0016J\u001c\u0010Q\u001a\u00060\u0002R\u00020\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0013H\u0016J\u000e\u0010U\u001a\u00020K2\u0006\u0010P\u001a\u00020\u0013J\u0017\u0010-\u001a\u00020K2\b\u0010)\u001a\u0004\u0018\u00010*H\u0007\u00a2\u0006\u0002\bVJ\u0006\u0010W\u001a\u00020KR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00100\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R\u001e\u00103\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017R\u001e\u00106\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001e\u0010;\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u0010\u0017R\u0013\u0010>\u001a\u0004\u0018\u00010?\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001e\u0010B\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\bC\u0010\u0015\"\u0004\bD\u0010\u0017R\u001a\u0010E\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I\u00a8\u0006\\"}, d2 = {"Lbrite/outdoor/adapter/AdapterFreQuestion;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbrite/outdoor/adapter/AdapterFreQuestion$FreQuestionHolder;", "listFreQuestion", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseQuestion$QuestionData;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "listener", "Lbrite/outdoor/adapter/AdapterFreQuestion$OnClickItemListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Ljava/util/ArrayList;Landroid/content/Context;Lbrite/outdoor/adapter/AdapterFreQuestion$OnClickItemListener;Landroidx/recyclerview/widget/RecyclerView;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "extent", "", "getExtent", "()Ljava/lang/Integer;", "setExtent", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isLoading", "", "()Z", "setLoading", "(Z)V", "lastVisibleItem", "getLastVisibleItem", "setLastVisibleItem", "getListFreQuestion", "()Ljava/util/ArrayList;", "setListFreQuestion", "(Ljava/util/ArrayList;)V", "getListener", "()Lbrite/outdoor/adapter/AdapterFreQuestion$OnClickItemListener;", "setListener", "(Lbrite/outdoor/adapter/AdapterFreQuestion$OnClickItemListener;)V", "loadMore", "Lbrite/outdoor/adapter/AdapterFreQuestion$ILoadMore;", "getLoadMore", "()Lbrite/outdoor/adapter/AdapterFreQuestion$ILoadMore;", "setLoadMore", "(Lbrite/outdoor/adapter/AdapterFreQuestion$ILoadMore;)V", "mOnClickItemListener", "offset", "getOffset", "setOffset", "percentage", "getPercentage", "setPercentage", "range", "getRange", "setRange", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "totalItemCount", "getTotalItemCount", "setTotalItemCount", "userId", "", "getUserId", "()Ljava/lang/String;", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "visibleThreshold", "getVisibleThreshold", "()I", "setVisibleThreshold", "(I)V", "addItemFirstPosition", "", "item", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "setLoadMore1", "setLoaded", "Companion", "FreQuestionHolder", "ILoadMore", "OnClickItemListener", "app_debug"})
public final class AdapterFreQuestion extends androidx.recyclerview.widget.RecyclerView.Adapter<brite.outdoor.adapter.AdapterFreQuestion.FreQuestionHolder> {
    private boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.adapter.AdapterFreQuestion.ILoadMore loadMore;
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
    private brite.outdoor.adapter.AdapterFreQuestion.OnClickItemListener mOnClickItemListener;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData> listFreQuestion;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private brite.outdoor.adapter.AdapterFreQuestion.OnClickItemListener listener;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.RecyclerView recyclerView = null;
    public static final int SCROLL_PERCENTAGE = 98;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.adapter.AdapterFreQuestion.Companion Companion = null;
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.adapter.AdapterFreQuestion.ILoadMore getLoadMore() {
        return null;
    }
    
    public final void setLoadMore(@org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterFreQuestion.ILoadMore p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.adapter.AdapterFreQuestion.FreQuestionHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterFreQuestion.FreQuestionHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setLoaded() {
    }
    
    public final void setLoadMore1(@org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterFreQuestion.ILoadMore loadMore) {
    }
    
    public final void removeItem(int position) {
    }
    
    public final void addItemFirstPosition(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData> getListFreQuestion() {
        return null;
    }
    
    public final void setListFreQuestion(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.adapter.AdapterFreQuestion.OnClickItemListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterFreQuestion.OnClickItemListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public AdapterFreQuestion(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData> listFreQuestion, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterFreQuestion.OnClickItemListener listener, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Lbrite/outdoor/adapter/AdapterFreQuestion$OnClickItemListener;", "", "onClickComment", "", "entityQuestion", "Lbrite/outdoor/data/api_entities/response/ResponseQuestion$QuestionData;", "position", "", "onClickDelete", "onClickItem", "onClickLike", "onClickSaved", "app_debug"})
    public static abstract interface OnClickItemListener {
        
        public abstract void onClickLike(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData entityQuestion, int position);
        
        public abstract void onClickComment(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData entityQuestion, int position);
        
        public abstract void onClickSaved(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData entityQuestion, int position);
        
        public abstract void onClickDelete(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData entityQuestion, int position);
        
        public abstract void onClickItem(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData entityQuestion);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lbrite/outdoor/adapter/AdapterFreQuestion$FreQuestionHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemFrequentQuestionBinding;", "(Lbrite/outdoor/adapter/AdapterFreQuestion;Lbrite/outdoor/databinding/ItemFrequentQuestionBinding;)V", "getBinding", "()Lbrite/outdoor/databinding/ItemFrequentQuestionBinding;", "binData", "", "item", "Lbrite/outdoor/data/api_entities/response/ResponseQuestion$QuestionData;", "app_debug"})
    public final class FreQuestionHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final brite.outdoor.databinding.ItemFrequentQuestionBinding binding = null;
        
        public final void binData(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.databinding.ItemFrequentQuestionBinding getBinding() {
            return null;
        }
        
        public FreQuestionHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemFrequentQuestionBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lbrite/outdoor/adapter/AdapterFreQuestion$ILoadMore;", "", "onLoadMore", "", "app_debug"})
    public static abstract interface ILoadMore {
        
        public abstract void onLoadMore();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/adapter/AdapterFreQuestion$Companion;", "", "()V", "SCROLL_PERCENTAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}