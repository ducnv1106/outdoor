package brite.outdoor.ui.fragments.my_page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001bB\u0005\u00a2\u0006\u0002\u0010\u0005J!\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0002\u00101J\u0017\u00102\u001a\u00020-2\b\u00103\u001a\u0004\u0018\u00010$H\u0002\u00a2\u0006\u0002\u00104J\u000e\u00105\u001a\u00020-2\u0006\u00100\u001a\u00020$J\u0012\u00106\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00107\u001a\u00020-H\u0014J\u001c\u00108\u001a\u00020-2\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u0010;\u001a\u00020$H\u0014J\u0017\u0010<\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0002\u00104J\u0012\u0010=\u001a\u00020-2\b\u0010>\u001a\u0004\u0018\u00010?H\u0014J\u0012\u0010@\u001a\u00020-2\b\u0010A\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010B\u001a\u00020-H\u0002J\b\u0010C\u001a\u00020-H\u0002J\b\u0010D\u001a\u00020-H\u0002J\b\u0010E\u001a\u00020-H\u0002J\b\u0010F\u001a\u00020-H\u0002J\b\u0010G\u001a\u00020-H\u0002J\u0010\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020JH\u0002J\u0017\u0010K\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0002\u00104J\u0017\u0010L\u001a\u00020-2\b\u0010M\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0002\u00104J\b\u0010N\u001a\u00020-H\u0002J\b\u0010O\u001a\u00020-H\u0002J\u0006\u0010P\u001a\u00020-J\b\u0010Q\u001a\u00020-H\u0002J\u000e\u0010R\u001a\u00020-2\u0006\u00100\u001a\u00020$J\u001a\u0010S\u001a\u00020\u00022\u0006\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010WH\u0014J\u001a\u0010X\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020$H\u0003J\u0018\u0010Y\u001a\u00020-2\u0006\u0010%\u001a\u00020$2\u0006\u00100\u001a\u00020$H\u0002J\u0012\u0010Z\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u0010[\u001a\u00020-2\u0006\u0010\\\u001a\u00020]H\u0002J\u0006\u0010^\u001a\u00020-J\u0006\u0010_\u001a\u00020-J\b\u0010`\u001a\u00020-H\u0002J\u0006\u0010a\u001a\u00020-R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b \u0010!R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010&R\u001a\u0010\'\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006c"}, d2 = {"Lbrite/outdoor/ui/fragments/my_page/FrmMyPost;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmMyPostBinding;", "Lbrite/outdoor/ui/dialog/DialogComment$OnChangeNumberComment;", "Lbrite/outdoor/ui/fragments/BottomSheetDialogFrHome$CallBackListener;", "()V", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "dialogComment", "Lbrite/outdoor/ui/dialog/DialogComment;", "likeViewModel", "Lbrite/outdoor/viewmodel/LikeViewModel;", "getLikeViewModel", "()Lbrite/outdoor/viewmodel/LikeViewModel;", "likeViewModel$delegate", "mAdapterMyPost", "Lbrite/outdoor/adapter/AdapterMyPost;", "getMAdapterMyPost", "()Lbrite/outdoor/adapter/AdapterMyPost;", "setMAdapterMyPost", "(Lbrite/outdoor/adapter/AdapterMyPost;)V", "myPageViewModel", "Lbrite/outdoor/viewmodel/MyPageViewModel;", "getMyPageViewModel", "()Lbrite/outdoor/viewmodel/MyPageViewModel;", "myPageViewModel$delegate", "myPostViewModel", "Lbrite/outdoor/viewmodel/MyPostViewModel;", "getMyPostViewModel", "()Lbrite/outdoor/viewmodel/MyPostViewModel;", "myPostViewModel$delegate", "positionRemoveItem", "", "postId", "Ljava/lang/Integer;", "totalLoadMoreResult", "getTotalLoadMoreResult", "()I", "setTotalLoadMoreResult", "(I)V", "badReport", "", "entityNew", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "position", "(Lbrite/outdoor/data/api_entities/response/ListPostUserData;Ljava/lang/Integer;)V", "callApiDeletePost", "idPost", "(Ljava/lang/Integer;)V", "deleteItemFrmDetailCallBack", "editPost", "finish", "followUnFollowSuccess", "follow", "Lbrite/outdoor/data/api_entities/response/ResponseFollow$FollowResponse;", "getCurrentFragment", "hidePostSuccess", "initView", "savedInstanceState", "Landroid/os/Bundle;", "loadControlsAndResize", "binding", "observerComment", "observerDelete", "observerHandleAPILoadingAndErr", "observerLike", "observerListPostUser", "observerSharePost", "onClickShareListener", "content", "", "onErrorDeletePost", "onNumberComment", "numberComment", "onRefreshListener", "onRefresherData", "onRefresherDataScrollToFirst", "prepareList", "reportFrmDetailCallBack", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showBottomDialog", "showDialogComment", "showDialogConfirmDelete", "showOrHideLoadingInItem", "isShown", "", "startShimmerLayout", "stopShimmerLayout", "updateTotalResultWhenRemoveItem", "updateUIAfterChangLanguage", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmMyPost extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmMyPostBinding> implements brite.outdoor.ui.dialog.DialogComment.OnChangeNumberComment, brite.outdoor.ui.fragments.BottomSheetDialogFrHome.CallBackListener {
    private final kotlin.Lazy myPageViewModel$delegate = null;
    private final kotlin.Lazy myPostViewModel$delegate = null;
    private final kotlin.Lazy likeViewModel$delegate = null;
    private brite.outdoor.ui.dialog.DialogComment dialogComment;
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.adapter.AdapterMyPost mAdapterMyPost;
    private final kotlin.Lazy authViewModel$delegate = null;
    private java.lang.Integer postId;
    private int totalLoadMoreResult = 0;
    private int positionRemoveItem = 0;
    public static final int SCROLL_PERCENTAGE = 95;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.my_page.FrmMyPost.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.MyPageViewModel getMyPageViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.MyPostViewModel getMyPostViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.LikeViewModel getLikeViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.adapter.AdapterMyPost getMAdapterMyPost() {
        return null;
    }
    
    public final void setMAdapterMyPost(@org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterMyPost p0) {
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    public final int getTotalLoadMoreResult() {
        return 0;
    }
    
    public final void setTotalLoadMoreResult(int p0) {
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmMyPostBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmMyPostBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void prepareList() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showBottomDialog(brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position) {
    }
    
    private final void callApiDeletePost(java.lang.Integer idPost) {
    }
    
    private final void observerDelete() {
    }
    
    private final void showDialogComment(int postId, int position) {
    }
    
    private final void observerListPostUser() {
    }
    
    private final void showOrHideLoadingInItem(boolean isShown) {
    }
    
    private final void observerLike() {
    }
    
    private final void observerSharePost() {
    }
    
    private final void observerHandleAPILoadingAndErr() {
    }
    
    private final void onClickShareListener(java.lang.String content) {
    }
    
    public final void deleteItemFrmDetailCallBack(int position) {
    }
    
    public final void reportFrmDetailCallBack(int position) {
    }
    
    @java.lang.Override()
    public void onNumberComment(@org.jetbrains.annotations.Nullable()
    java.lang.Integer numberComment) {
    }
    
    private final void observerComment() {
    }
    
    @java.lang.Override()
    public void onErrorDeletePost(@org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    protected void finish() {
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
    
    public final void startShimmerLayout() {
    }
    
    public final void stopShimmerLayout() {
    }
    
    private final void onRefreshListener() {
    }
    
    private final void onRefresherData() {
    }
    
    public final void onRefresherDataScrollToFirst() {
    }
    
    private final void updateTotalResultWhenRemoveItem() {
    }
    
    public final void updateUIAfterChangLanguage() {
    }
    
    public FrmMyPost() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/ui/fragments/my_page/FrmMyPost$Companion;", "", "()V", "SCROLL_PERCENTAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}