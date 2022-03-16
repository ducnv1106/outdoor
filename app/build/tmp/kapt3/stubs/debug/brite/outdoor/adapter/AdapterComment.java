package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002?@B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0012\u0010,\u001a\u00060\u0002R\u00020\u00002\u0006\u0010-\u001a\u00020.J\u0012\u0010/\u001a\u0004\u0018\u00010\u00102\u0006\u00100\u001a\u00020\u0006H\u0002J\b\u00101\u001a\u00020\u0006H\u0016J\b\u00102\u001a\u00020%H\u0002J\u000e\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u000205J\u001e\u00106\u001a\u0002072\u0016\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011J\u001c\u00109\u001a\u0002072\n\u0010:\u001a\u00060\u0002R\u00020\u00002\u0006\u00100\u001a\u00020\u0006H\u0016J\u001c\u0010;\u001a\u00060\u0002R\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010<\u001a\u00020\u0006H\u0016J\u000e\u0010=\u001a\u0002072\u0006\u00100\u001a\u00020\u0006J(\u0010>\u001a\u0002072\u0016\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00112\b\u0010(\u001a\u0004\u0018\u00010\bR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0010\u0010(\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*\u00a8\u0006A"}, d2 = {"Lbrite/outdoor/adapter/AdapterComment;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbrite/outdoor/adapter/AdapterComment$ViewHolder;", "context", "Landroid/content/Context;", "userId", "", "urlPrefixAvatar", "", "onClickReplyListener", "Lbrite/outdoor/adapter/AdapterComment$OnClickReplyListener;", "onClickCommentReplyListener", "Lbrite/outdoor/adapter/AdapterCommentReply$OnClickCommentReplyListener;", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;Lbrite/outdoor/adapter/AdapterComment$OnClickReplyListener;Lbrite/outdoor/adapter/AdapterCommentReply$OnClickCommentReplyListener;)V", "arrayListComment", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseListComment$ListCommentData;", "Lkotlin/collections/ArrayList;", "getArrayListComment", "()Ljava/util/ArrayList;", "setArrayListComment", "(Ljava/util/ArrayList;)V", "getContext", "()Landroid/content/Context;", "isLoading", "", "()Z", "setLoading", "(Z)V", "mContext", "mOnClickCommentReplyListener", "mOnClickReplyListener", "getOnClickReplyListener", "()Lbrite/outdoor/adapter/AdapterComment$OnClickReplyListener;", "setOnClickReplyListener", "(Lbrite/outdoor/adapter/AdapterComment$OnClickReplyListener;)V", "scaleValue", "", "getUrlPrefixAvatar", "()Ljava/lang/String;", "urlPrefixComment", "getUserId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "from", "parent", "Landroid/view/ViewGroup;", "getItemAt", "position", "getItemCount", "getScaleValue", "getSizeWithScale", "sizeDesign", "", "insertList", "", "list", "onBindViewHolder", "holder", "onCreateViewHolder", "viewType", "removeItem", "updateList", "OnClickReplyListener", "ViewHolder", "app_debug"})
public final class AdapterComment extends androidx.recyclerview.widget.RecyclerView.Adapter<brite.outdoor.adapter.AdapterComment.ViewHolder> {
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentData> arrayListComment;
    private boolean isLoading = false;
    private java.lang.String urlPrefixComment;
    private brite.outdoor.adapter.AdapterComment.OnClickReplyListener mOnClickReplyListener;
    private brite.outdoor.adapter.AdapterCommentReply.OnClickCommentReplyListener mOnClickCommentReplyListener;
    private float scaleValue = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer userId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String urlPrefixAvatar = null;
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.adapter.AdapterComment.OnClickReplyListener onClickReplyListener;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentData> getArrayListComment() {
        return null;
    }
    
    public final void setArrayListComment(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentData> p0) {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.adapter.AdapterComment.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.adapter.AdapterComment.ViewHolder from(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterComment.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentData> list, @org.jetbrains.annotations.Nullable()
    java.lang.String urlPrefixComment) {
    }
    
    public final void insertList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentData> list) {
    }
    
    private final brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentData getItemAt(int position) {
        return null;
    }
    
    private final float getScaleValue() {
        return 0.0F;
    }
    
    public final int getSizeWithScale(double sizeDesign) {
        return 0;
    }
    
    public final void removeItem(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrlPrefixAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.adapter.AdapterComment.OnClickReplyListener getOnClickReplyListener() {
        return null;
    }
    
    public final void setOnClickReplyListener(@org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterComment.OnClickReplyListener p0) {
    }
    
    public AdapterComment(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.Integer userId, @org.jetbrains.annotations.Nullable()
    java.lang.String urlPrefixAvatar, @org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterComment.OnClickReplyListener onClickReplyListener, @org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterCommentReply.OnClickCommentReplyListener onClickCommentReplyListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\n"}, d2 = {"Lbrite/outdoor/adapter/AdapterComment$OnClickReplyListener;", "", "onClickDelete", "", "comment", "Lbrite/outdoor/data/api_entities/response/ResponseListComment$ListCommentData;", "position", "", "onClickReply", "onClickUserName", "app_debug"})
    public static abstract interface OnClickReplyListener {
        
        public abstract void onClickReply(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentData comment, int position);
        
        public abstract void onClickDelete(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentData comment, int position);
        
        public abstract void onClickUserName(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentData comment);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbrite/outdoor/adapter/AdapterComment$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemCommentBinding;", "(Lbrite/outdoor/adapter/AdapterComment;Lbrite/outdoor/databinding/ItemCommentBinding;)V", "binData", "", "entityComment", "Lbrite/outdoor/data/api_entities/response/ResponseListComment$ListCommentData;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final brite.outdoor.databinding.ItemCommentBinding binding = null;
        
        @android.annotation.SuppressLint(value = {"SetTextI18n", "LogNotTimber"})
        public final void binData(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ResponseListComment.ListCommentData entityComment) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemCommentBinding binding) {
            super(null);
        }
    }
}