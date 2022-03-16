package brite.outdoor.ui.fragments.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J!\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010*H\u0016\u00a2\u0006\u0002\u0010:J\u0012\u0010;\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0018\u0010<\u001a\u0002062\u0006\u0010=\u001a\u00020*2\b\b\u0002\u0010>\u001a\u00020?J\u000e\u0010@\u001a\u0002062\u0006\u00109\u001a\u00020*J\u0012\u0010A\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010B\u001a\u000206H\u0002J\b\u0010C\u001a\u000206H\u0014J\u001c\u0010D\u001a\u0002062\b\u0010E\u001a\u0004\u0018\u00010F2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010G\u001a\u00020*H\u0014J\u000e\u0010H\u001a\u0002062\u0006\u00109\u001a\u00020*J\u0006\u0010I\u001a\u000206J\u0017\u0010J\u001a\u0002062\b\u00109\u001a\u0004\u0018\u00010*H\u0016\u00a2\u0006\u0002\u0010KJ\b\u0010L\u001a\u000206H\u0002J\u0012\u0010M\u001a\u0002062\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\u0012\u0010P\u001a\u0002062\b\u0010Q\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010R\u001a\u000206H\u0002J\b\u0010S\u001a\u000206H\u0002J\b\u0010T\u001a\u000206H\u0002J\b\u0010U\u001a\u000206H\u0002J\b\u0010V\u001a\u000206H\u0002J\b\u0010W\u001a\u000206H\u0002J\u0010\u0010X\u001a\u0002062\u0006\u0010Y\u001a\u00020ZH\u0002J\u0017\u0010[\u001a\u0002062\b\u00109\u001a\u0004\u0018\u00010*H\u0016\u00a2\u0006\u0002\u0010KJ\u0017\u0010\\\u001a\u0002062\b\u0010]\u001a\u0004\u0018\u00010*H\u0016\u00a2\u0006\u0002\u0010KJ\b\u0010^\u001a\u000206H\u0016J\b\u0010_\u001a\u000206H\u0002J\b\u0010`\u001a\u000206H\u0002J\u0006\u0010a\u001a\u000206J\u000e\u0010b\u001a\u0002062\u0006\u00109\u001a\u00020*J\u0017\u0010c\u001a\u0002062\b\u00109\u001a\u0004\u0018\u00010*H\u0016\u00a2\u0006\u0002\u0010KJ\u001a\u0010d\u001a\u00020\u00022\u0006\u0010e\u001a\u00020f2\b\u0010g\u001a\u0004\u0018\u00010hH\u0014J\u001a\u0010i\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020*H\u0003J\u0018\u0010j\u001a\u0002062\u0006\u00100\u001a\u00020*2\u0006\u00109\u001a\u00020*H\u0002J\u0012\u0010k\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010l\u001a\u000206H\u0002J\u0006\u0010m\u001a\u000206R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u0012\u001a\u0004\b&\u0010\'R\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u00100\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u00101R\u001a\u00102\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.\u00a8\u0006n"}, d2 = {"Lbrite/outdoor/ui/fragments/home/FrmFocus;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmHomeFocusBinding;", "Lbrite/outdoor/ui/dialog/DialogFragmentReport$CallBackListener;", "Lbrite/outdoor/ui/dialog/DialogComment$OnChangeNumberComment;", "Lbrite/outdoor/ui/fragments/BottomSheetDialogFrHome$CallBackListener;", "()V", "adapter", "Lbrite/outdoor/adapter/AdapterHomeNew;", "getAdapter", "()Lbrite/outdoor/adapter/AdapterHomeNew;", "setAdapter", "(Lbrite/outdoor/adapter/AdapterHomeNew;)V", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "dialogComment", "Lbrite/outdoor/ui/dialog/DialogComment;", "focusViewMode", "Lbrite/outdoor/viewmodel/FocusViewModel;", "getFocusViewMode", "()Lbrite/outdoor/viewmodel/FocusViewModel;", "focusViewMode$delegate", "homeViewModel", "Lbrite/outdoor/viewmodel/HomeViewModel;", "getHomeViewModel", "()Lbrite/outdoor/viewmodel/HomeViewModel;", "homeViewModel$delegate", "likeViewModel", "Lbrite/outdoor/viewmodel/LikeViewModel;", "getLikeViewModel", "()Lbrite/outdoor/viewmodel/LikeViewModel;", "likeViewModel$delegate", "myPostViewModel", "Lbrite/outdoor/viewmodel/MyPostViewModel;", "getMyPostViewModel", "()Lbrite/outdoor/viewmodel/MyPostViewModel;", "myPostViewModel$delegate", "numberPage", "", "getNumberPage", "()I", "setNumberPage", "(I)V", "positionRemoveItem", "postId", "Ljava/lang/Integer;", "totalLoadMoreResult", "getTotalLoadMoreResult", "setTotalLoadMoreResult", "badReport", "", "entityNew", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "position", "(Lbrite/outdoor/data/api_entities/response/ListPostUserData;Ljava/lang/Integer;)V", "callApiDeletePost", "callApiListPostFocus", "page", "isRefresher", "", "deleteItemFrmDetailCallBack", "editPost", "eventLoadMore", "finish", "followUnFollowSuccess", "follow", "Lbrite/outdoor/data/api_entities/response/ResponseFollow$FollowResponse;", "getCurrentFragment", "hideItemCallBackFrmDetailCallBack", "hideLtRetry", "hidePostSuccess", "(Ljava/lang/Integer;)V", "initAdapter", "initView", "savedInstanceState", "Landroid/os/Bundle;", "loadControlsAndResize", "binding", "observerComment", "observerDeletePost", "observerHandleAPILoadingAndErr", "observerLikeUser", "observerListPostFocus", "observerSharePost", "onClickShareListener", "content", "", "onErrorDeletePost", "onNumberComment", "numberComment", "onPause", "onRefreshListener", "pauseCurrentVideo", "refreshAndScrollToFirstItem", "reportFrmDetailCallBack", "reportSuccess", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showBottomDialog", "showDialogComment", "showDialogConfirmDelete", "updateTotalResultWhenRemoveItem", "updateUIAfterChangLanguage", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmFocus extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmHomeFocusBinding> implements brite.outdoor.ui.dialog.DialogFragmentReport.CallBackListener, brite.outdoor.ui.dialog.DialogComment.OnChangeNumberComment, brite.outdoor.ui.fragments.BottomSheetDialogFrHome.CallBackListener {
    private final kotlin.Lazy homeViewModel$delegate = null;
    private final kotlin.Lazy focusViewMode$delegate = null;
    private final kotlin.Lazy likeViewModel$delegate = null;
    private final kotlin.Lazy authViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.adapter.AdapterHomeNew adapter;
    private brite.outdoor.ui.dialog.DialogComment dialogComment;
    private final kotlin.Lazy myPostViewModel$delegate = null;
    private java.lang.Integer postId;
    private int numberPage = 1;
    private int totalLoadMoreResult = 0;
    private int positionRemoveItem = 0;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.FocusViewModel getFocusViewMode() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.LikeViewModel getLikeViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.adapter.AdapterHomeNew getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterHomeNew p0) {
    }
    
    private final brite.outdoor.viewmodel.MyPostViewModel getMyPostViewModel() {
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
    brite.outdoor.databinding.FrmHomeFocusBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmHomeFocusBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initAdapter() {
    }
    
    private final void observerLikeUser() {
    }
    
    private final void observerSharePost() {
    }
    
    private final void observerComment() {
    }
    
    private final void showDialogComment(int postId, int position) {
    }
    
    public final void callApiListPostFocus(int page, boolean isRefresher) {
    }
    
    private final void observerListPostFocus() {
    }
    
    private final void observerHandleAPILoadingAndErr() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showBottomDialog(brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position) {
    }
    
    private final void eventLoadMore() {
    }
    
    @java.lang.Override()
    public void reportSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
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
    
    private final void callApiDeletePost(brite.outdoor.data.api_entities.response.ListPostUserData entityNew) {
    }
    
    private final void observerDeletePost() {
    }
    
    public final void deleteItemFrmDetailCallBack(int position) {
    }
    
    public final void hideItemCallBackFrmDetailCallBack(int position) {
    }
    
    public final void reportFrmDetailCallBack(int position) {
    }
    
    @java.lang.Override()
    public void onNumberComment(@org.jetbrains.annotations.Nullable()
    java.lang.Integer numberComment) {
    }
    
    @java.lang.Override()
    public void onErrorDeletePost(@org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
    }
    
    public final void refreshAndScrollToFirstItem() {
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
    
    private final void pauseCurrentVideo() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void updateTotalResultWhenRemoveItem() {
    }
    
    public final void updateUIAfterChangLanguage() {
    }
    
    private final void onRefreshListener() {
    }
    
    public FrmFocus() {
        super();
    }
}