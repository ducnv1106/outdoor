package brite.outdoor.ui.fragments.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0002\u0010,J\"\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\"2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u000e\u00101\u001a\u00020(2\u0006\u0010+\u001a\u00020\"J\u0012\u00102\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00103\u001a\u00020(H\u0002J\b\u00104\u001a\u00020(H\u0014J\u001c\u00105\u001a\u00020(2\b\u00106\u001a\u0004\u0018\u0001072\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00108\u001a\u00020\"H\u0014J\u0014\u00109\u001a\u0004\u0018\u00010*2\b\u0010:\u001a\u0004\u0018\u00010;H\u0002J\u000e\u0010<\u001a\u00020(2\u0006\u0010+\u001a\u00020\"J\u0006\u0010=\u001a\u00020(J\u0017\u0010>\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0002\u0010?J\b\u0010@\u001a\u00020(H\u0002J\u0012\u0010A\u001a\u00020(2\b\u0010B\u001a\u0004\u0018\u00010CH\u0014J\u0012\u0010D\u001a\u00020(2\b\u0010E\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010F\u001a\u00020(H\u0002J\b\u0010G\u001a\u00020(H\u0002J\b\u0010H\u001a\u00020(H\u0002J\b\u0010I\u001a\u00020(H\u0002J\u0010\u0010J\u001a\u00020(2\u0006\u0010K\u001a\u00020\u001bH\u0002J\u0017\u0010L\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0002\u0010?J\u0017\u0010M\u001a\u00020(2\b\u0010N\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0002\u0010?J\b\u0010O\u001a\u00020(H\u0002J\u0006\u0010P\u001a\u00020(J\u000e\u0010Q\u001a\u00020(2\u0006\u0010+\u001a\u00020\"J\u0017\u0010R\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0002\u0010?J\u001a\u0010S\u001a\u00020\u00022\u0006\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010WH\u0014J\u001a\u0010X\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010;2\u0006\u0010+\u001a\u00020\"H\u0003J\u0018\u0010Y\u001a\u00020(2\u0006\u0010$\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"H\u0002J\u0012\u0010Z\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010[\u001a\u00020(H\u0002J\u0006\u0010\\\u001a\u00020(R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010$\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010%R\u000e\u0010&\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006]"}, d2 = {"Lbrite/outdoor/ui/fragments/home/FrmHotNews;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmHotNewsBinding;", "Lbrite/outdoor/ui/dialog/DialogFragmentReport$CallBackListener;", "Lbrite/outdoor/ui/dialog/DialogComment$OnChangeNumberComment;", "Lbrite/outdoor/ui/fragments/BottomSheetDialogFrHome$CallBackListener;", "()V", "adapter", "Lbrite/outdoor/adapter/AdapterHomeHotNews;", "getAdapter", "()Lbrite/outdoor/adapter/AdapterHomeHotNews;", "setAdapter", "(Lbrite/outdoor/adapter/AdapterHomeHotNews;)V", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "dialogComment", "Lbrite/outdoor/ui/dialog/DialogCommentHotNews;", "hotNewsViewModel", "Lbrite/outdoor/viewmodel/HotNewsViewModel;", "getHotNewsViewModel", "()Lbrite/outdoor/viewmodel/HotNewsViewModel;", "hotNewsViewModel$delegate", "lastestId", "", "myPostViewModel", "Lbrite/outdoor/viewmodel/MyPostViewModel;", "getMyPostViewModel", "()Lbrite/outdoor/viewmodel/MyPostViewModel;", "myPostViewModel$delegate", "numberPage", "", "positionRemoveItem", "postId", "Ljava/lang/Integer;", "totalLoadMoreResult", "badReport", "", "entityNew", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "position", "(Lbrite/outdoor/data/api_entities/response/ListPostUserData;Ljava/lang/Integer;)V", "callApiListPostHotNews", "page", "isRefresher", "", "deleteItemFrmDetailCallBack", "editPost", "eventLoadMore", "finish", "followUnFollowSuccess", "follow", "Lbrite/outdoor/data/api_entities/response/ResponseFollow$FollowResponse;", "getCurrentFragment", "getPostUserData", "entity", "Lbrite/outdoor/data/api_entities/response/ResponseListPostHotNews$HotNewsData;", "hideItemFrmDetailCallBack", "hideLtRetry", "hidePostSuccess", "(Ljava/lang/Integer;)V", "initAdapter", "initView", "savedInstanceState", "Landroid/os/Bundle;", "loadControlsAndResize", "binding", "observerHandleAPILoadingAndErr", "observerLikeUser", "observerListPostNew", "observerSharePost", "onClickShareListener", "content", "onErrorDeletePost", "onNumberComment", "numberComment", "onRefreshListener", "refreshAndScrollToFirstItem", "reportFrmDetailCallBack", "reportSuccess", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showBottomDialog", "showDialogComment", "showDialogConfirmDelete", "updateTotalResultWhenRemoveItem", "updateUIAfterChangLanguage", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmHotNews extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmHotNewsBinding> implements brite.outdoor.ui.dialog.DialogFragmentReport.CallBackListener, brite.outdoor.ui.dialog.DialogComment.OnChangeNumberComment, brite.outdoor.ui.fragments.BottomSheetDialogFrHome.CallBackListener {
    private final kotlin.Lazy hotNewsViewModel$delegate = null;
    private final kotlin.Lazy authViewModel$delegate = null;
    private final kotlin.Lazy myPostViewModel$delegate = null;
    public brite.outdoor.adapter.AdapterHomeHotNews adapter;
    private brite.outdoor.ui.dialog.DialogCommentHotNews dialogComment;
    private java.lang.Integer postId;
    private java.lang.String lastestId = "";
    private int numberPage = 1;
    private int totalLoadMoreResult = 0;
    private int positionRemoveItem = 0;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.HotNewsViewModel getHotNewsViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.MyPostViewModel getMyPostViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.adapter.AdapterHomeHotNews getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterHomeHotNews p0) {
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmHotNewsBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmHotNewsBinding setBinding(@org.jetbrains.annotations.NotNull()
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
    
    public final void callApiListPostHotNews(int page, boolean isRefresher, @org.jetbrains.annotations.NotNull()
    java.lang.String lastestId) {
    }
    
    private final void observerListPostNew() {
    }
    
    private final void observerHandleAPILoadingAndErr() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showBottomDialog(brite.outdoor.data.api_entities.response.ResponseListPostHotNews.HotNewsData entityNew, int position) {
    }
    
    @java.lang.Override()
    public void reportSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
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
    
    private final void showDialogComment(int postId, int position) {
    }
    
    public final void deleteItemFrmDetailCallBack(int position) {
    }
    
    public final void hideItemFrmDetailCallBack(int position) {
    }
    
    public final void reportFrmDetailCallBack(int position) {
    }
    
    public final void refreshAndScrollToFirstItem() {
    }
    
    private final void onRefreshListener() {
    }
    
    private final void updateTotalResultWhenRemoveItem() {
    }
    
    public final void updateUIAfterChangLanguage() {
    }
    
    private final void eventLoadMore() {
    }
    
    private final brite.outdoor.data.api_entities.response.ListPostUserData getPostUserData(brite.outdoor.data.api_entities.response.ResponseListPostHotNews.HotNewsData entity) {
        return null;
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    public FrmHotNews() {
        super();
    }
}