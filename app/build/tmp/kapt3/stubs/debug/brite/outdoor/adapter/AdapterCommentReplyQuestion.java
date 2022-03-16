package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 W2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003VWXBO\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\b\u0010J\u001a\u00020\u0011H\u0016J\u000e\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0005J\u001c\u0010N\u001a\u00020L2\n\u0010O\u001a\u00060\u0002R\u00020\u00002\u0006\u0010P\u001a\u00020\u0011H\u0016J\u001c\u0010Q\u001a\u00060\u0002R\u00020\u00002\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0011H\u0016J\u000e\u0010U\u001a\u00020L2\u0006\u0010P\u001a\u00020\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001e\u00100\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR\u001e\u00103\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001e\u00108\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0013\u0010B\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010@R\u001e\u0010D\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bE\u0010\u0019\"\u0004\bF\u0010\u001bR\u001a\u0010G\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010<\"\u0004\bI\u0010>\u00a8\u0006Y"}, d2 = {"Lbrite/outdoor/adapter/AdapterCommentReplyQuestion;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbrite/outdoor/adapter/AdapterCommentReplyQuestion$CommentReplyQuestionHolder;", "listAnswerQuestion", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseAnswerQuestion$AnswerQuestionReply;", "Lkotlin/collections/ArrayList;", "urlPrefixAvatar", "", "urlPrefixComment", "context", "Landroid/content/Context;", "listener", "Lbrite/outdoor/adapter/AdapterCommentReplyQuestion$OnClickItemListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "total_children", "", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lbrite/outdoor/adapter/AdapterCommentReplyQuestion$OnClickItemListener;Landroidx/recyclerview/widget/RecyclerView;I)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "extent", "getExtent", "()Ljava/lang/Integer;", "setExtent", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isLoading", "", "()Z", "setLoading", "(Z)V", "lastVisibleItem", "getLastVisibleItem", "setLastVisibleItem", "getListAnswerQuestion", "()Ljava/util/ArrayList;", "setListAnswerQuestion", "(Ljava/util/ArrayList;)V", "getListener", "()Lbrite/outdoor/adapter/AdapterCommentReplyQuestion$OnClickItemListener;", "setListener", "(Lbrite/outdoor/adapter/AdapterCommentReplyQuestion$OnClickItemListener;)V", "offset", "getOffset", "setOffset", "percentage", "getPercentage", "setPercentage", "range", "getRange", "setRange", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "totalItemCount", "getTotalItemCount", "setTotalItemCount", "getTotal_children", "()I", "setTotal_children", "(I)V", "getUrlPrefixAvatar", "()Ljava/lang/String;", "getUrlPrefixComment", "userId", "getUserId", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "visibleThreshold", "getVisibleThreshold", "setVisibleThreshold", "getItemCount", "insertItem", "", "item", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "CommentReplyQuestionHolder", "Companion", "OnClickItemListener", "app_debug"})
public final class AdapterCommentReplyQuestion extends androidx.recyclerview.widget.RecyclerView.Adapter<brite.outdoor.adapter.AdapterCommentReplyQuestion.CommentReplyQuestionHolder> {
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
    private java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestionReply> listAnswerQuestion;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String urlPrefixAvatar = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String urlPrefixComment = null;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private brite.outdoor.adapter.AdapterCommentReplyQuestion.OnClickItemListener listener;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.RecyclerView recyclerView = null;
    private int total_children;
    public static final int SCROLL_PERCENTAGE = 98;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.adapter.AdapterCommentReplyQuestion.Companion Companion = null;
    
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
    brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestionReply item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.adapter.AdapterCommentReplyQuestion.CommentReplyQuestionHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterCommentReplyQuestion.CommentReplyQuestionHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void removeItem(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestionReply> getListAnswerQuestion() {
        return null;
    }
    
    public final void setListAnswerQuestion(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestionReply> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrlPrefixAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrlPrefixComment() {
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
    public final brite.outdoor.adapter.AdapterCommentReplyQuestion.OnClickItemListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterCommentReplyQuestion.OnClickItemListener p0) {
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
    
    public AdapterCommentReplyQuestion(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestionReply> listAnswerQuestion, @org.jetbrains.annotations.NotNull()
    java.lang.String urlPrefixAvatar, @org.jetbrains.annotations.Nullable()
    java.lang.String urlPrefixComment, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterCommentReplyQuestion.OnClickItemListener listener, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int total_children) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lbrite/outdoor/adapter/AdapterCommentReplyQuestion$OnClickItemListener;", "", "onClickDelete", "", "entity", "Lbrite/outdoor/data/api_entities/response/ResponseAnswerQuestion$AnswerQuestionReply;", "position", "", "onClickReply", "onClickUserName", "app_debug"})
    public static abstract interface OnClickItemListener {
        
        public abstract void onClickReply(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestionReply entity, int position);
        
        public abstract void onClickDelete(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestionReply entity, int position);
        
        public abstract void onClickUserName(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestionReply entity);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lbrite/outdoor/adapter/AdapterCommentReplyQuestion$CommentReplyQuestionHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemReplyCommentQuestionBinding;", "(Lbrite/outdoor/adapter/AdapterCommentReplyQuestion;Lbrite/outdoor/databinding/ItemReplyCommentQuestionBinding;)V", "getBinding", "()Lbrite/outdoor/databinding/ItemReplyCommentQuestionBinding;", "binData", "", "item", "Lbrite/outdoor/data/api_entities/response/ResponseAnswerQuestion$AnswerQuestionReply;", "app_debug"})
    public final class CommentReplyQuestionHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final brite.outdoor.databinding.ItemReplyCommentQuestionBinding binding = null;
        
        public final void binData(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestionReply item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.databinding.ItemReplyCommentQuestionBinding getBinding() {
            return null;
        }
        
        public CommentReplyQuestionHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemReplyCommentQuestionBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/adapter/AdapterCommentReplyQuestion$Companion;", "", "()V", "SCROLL_PERCENTAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}