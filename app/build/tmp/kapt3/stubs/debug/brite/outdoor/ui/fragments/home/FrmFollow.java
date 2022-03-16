package brite.outdoor.ui.fragments.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u00010#H\u0016\u00a2\u0006\u0002\u00102J\"\u00103\u001a\u00020.2\u0006\u00104\u001a\u00020#2\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u000e\u00107\u001a\u00020.2\u0006\u00101\u001a\u00020#J\u0012\u00108\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00109\u001a\u00020.H\u0002J\b\u0010:\u001a\u00020.H\u0014J\u001c\u0010;\u001a\u00020.2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u0010>\u001a\u00020#H\u0014J\u000e\u0010?\u001a\u00020.2\u0006\u00101\u001a\u00020#J\u0006\u0010@\u001a\u00020.J\u0017\u0010A\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u00010#H\u0016\u00a2\u0006\u0002\u0010BJ\b\u0010C\u001a\u00020.H\u0002J\u0012\u0010D\u001a\u00020.2\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\u0012\u0010G\u001a\u00020.2\b\u0010H\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010I\u001a\u00020.H\u0002J\b\u0010J\u001a\u00020.H\u0002J\b\u0010K\u001a\u00020.H\u0002J\b\u0010L\u001a\u00020.H\u0002J\b\u0010M\u001a\u00020.H\u0002J\u0010\u0010N\u001a\u00020.2\u0006\u0010O\u001a\u00020\u0017H\u0002J\u0017\u0010P\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u00010#H\u0016\u00a2\u0006\u0002\u0010BJ\u0017\u0010Q\u001a\u00020.2\b\u0010R\u001a\u0004\u0018\u00010#H\u0016\u00a2\u0006\u0002\u0010BJ\b\u0010S\u001a\u00020.H\u0002J\u0006\u0010T\u001a\u00020.J\u000e\u0010U\u001a\u00020.2\u0006\u00101\u001a\u00020#J\u0017\u0010V\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u00010#H\u0016\u00a2\u0006\u0002\u0010BJ\u001a\u0010W\u001a\u00020\u00022\u0006\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0014J\u001a\u0010\\\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020#H\u0002J\u0018\u0010]\u001a\u00020.2\u0006\u0010(\u001a\u00020#2\u0006\u00101\u001a\u00020#H\u0002J\u0012\u0010^\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u0010_\u001a\u00020.H\u0002J\u0006\u0010`\u001a\u00020.R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0012\u0010(\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010)R\u001a\u0010*\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010%\"\u0004\b,\u0010\'\u00a8\u0006a"}, d2 = {"Lbrite/outdoor/ui/fragments/home/FrmFollow;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmHomeFollowBinding;", "Lbrite/outdoor/ui/dialog/DialogFragmentReport$CallBackListener;", "Lbrite/outdoor/ui/dialog/DialogComment$OnChangeNumberComment;", "Lbrite/outdoor/ui/fragments/BottomSheetDialogFrHome$CallBackListener;", "()V", "adapter", "Lbrite/outdoor/adapter/AdapterHome;", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "dialogComment", "Lbrite/outdoor/ui/dialog/DialogComment;", "followViewModel", "Lbrite/outdoor/viewmodel/FollowViewModel;", "getFollowViewModel", "()Lbrite/outdoor/viewmodel/FollowViewModel;", "followViewModel$delegate", "lastestId", "", "likeViewModel", "Lbrite/outdoor/viewmodel/LikeViewModel;", "getLikeViewModel", "()Lbrite/outdoor/viewmodel/LikeViewModel;", "likeViewModel$delegate", "myPostViewModel", "Lbrite/outdoor/viewmodel/MyPostViewModel;", "getMyPostViewModel", "()Lbrite/outdoor/viewmodel/MyPostViewModel;", "myPostViewModel$delegate", "numberPage", "", "getNumberPage", "()I", "setNumberPage", "(I)V", "postId", "Ljava/lang/Integer;", "totalLoadMoreResult", "getTotalLoadMoreResult", "setTotalLoadMoreResult", "badReport", "", "entityNew", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "position", "(Lbrite/outdoor/data/api_entities/response/ListPostUserData;Ljava/lang/Integer;)V", "callApiListPostUserFollow", "page", "isRefresher", "", "deleteItemFrmDetailCallBack", "editPost", "eventLoadMore", "finish", "followUnFollowSuccess", "follow", "Lbrite/outdoor/data/api_entities/response/ResponseFollow$FollowResponse;", "getCurrentFragment", "hideItemFrmDetailCallBack", "hideLtRetry", "hidePostSuccess", "(Ljava/lang/Integer;)V", "initAdapter", "initView", "savedInstanceState", "Landroid/os/Bundle;", "loadControlsAndResize", "binding", "observerComment", "observerHandleAPILoadingAndErr", "observerLikeUser", "observerListPostUserFollow", "observerSharePost", "onClickShareListener", "content", "onErrorDeletePost", "onNumberComment", "numberComment", "onRefreshListener", "refreshAndScrollToFirstItem", "reportFrmDetailCallBack", "reportSuccess", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showBottomDialog", "showDialogComment", "showDialogConfirmDelete", "updateTotalResultWhenRemoveItem", "updateUIAfterChangLanguage", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmFollow extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmHomeFollowBinding> implements brite.outdoor.ui.dialog.DialogFragmentReport.CallBackListener, brite.outdoor.ui.dialog.DialogComment.OnChangeNumberComment, brite.outdoor.ui.fragments.BottomSheetDialogFrHome.CallBackListener {
    private final kotlin.Lazy followViewModel$delegate = null;
    private final kotlin.Lazy likeViewModel$delegate = null;
    private final kotlin.Lazy myPostViewModel$delegate = null;
    private final kotlin.Lazy authViewModel$delegate = null;
    private brite.outdoor.adapter.AdapterHome adapter;
    private brite.outdoor.ui.dialog.DialogComment dialogComment;
    private int numberPage = 1;
    private int totalLoadMoreResult = 0;
    private java.lang.Integer postId;
    private java.lang.String lastestId = "";
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.FollowViewModel getFollowViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.LikeViewModel getLikeViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.MyPostViewModel getMyPostViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    public final int getNumberPage() {
        return 0;
    }
    
    public final void setNumberPage(int p0) {
    }
    
    public final int getTotalLoadMoreResult() {
        return 0;
    }
    
    public final void setTotalLoadMoreResult(int p0) {
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmHomeFollowBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmHomeFollowBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showDialogComment(int postId, int position) {
    }
    
    private final void initAdapter() {
    }
    
    private final void observerLikeUser() {
    }
    
    private final void observerSharePost() {
    }
    
    private final void observerComment() {
    }
    
    public final void callApiListPostUserFollow(int page, boolean isRefresher, @org.jetbrains.annotations.NotNull()
    java.lang.String lastestId) {
    }
    
    private final void observerListPostUserFollow() {
    }
    
    private final void observerHandleAPILoadingAndErr() {
    }
    
    private final void showBottomDialog(brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position) {
    }
    
    private final void eventLoadMore() {
    }
    
    @java.lang.Override()
    public void followUnFollowSuccess(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.api_entities.response.ResponseFollow.FollowResponse follow, @org.jetbrains.annotations.Nullable()
    brite.outdoor.data.api_entities.response.ListPostUserData entityNew) {
    }
    
    @java.lang.Override()
    public void badReport(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.api_entities.response.ListPostUserData entityNew, @org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
    }
    
    @java.lang.Override()
    public void hidePostSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
    }
    
    @java.lang.Override()
    public void editPost(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.api_entities.response.ListPostUserData entityNew) {
    }
    
    @java.lang.Override()
    public void showDialogConfirmDelete(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.api_entities.response.ListPostUserData entityNew) {
    }
    
    @java.lang.Override()
    public void reportSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
    }
    
    public final void deleteItemFrmDetailCallBack(int position) {
    }
    
    public final void hideItemFrmDetailCallBack(int position) {
    }
    
    public final void reportFrmDetailCallBack(int position) {
    }
    
    public final void refreshAndScrollToFirstItem() {
    }
    
    @java.lang.Override()
    public void onNumberComment(@org.jetbrains.annotations.Nullable()
    java.lang.Integer numberComment) {
    }
    
    @java.lang.Override()
    public void onErrorDeletePost(@org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
    }
    
    private final void onClickShareListener(java.lang.String content) {
    }
    
    public final void hideLtRetry() {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    private final void updateTotalResultWhenRemoveItem() {
    }
    
    public final void updateUIAfterChangLanguage() {
    }
    
    private final void onRefreshListener() {
    }
    
    public FrmFollow() {
        super();
    }
}