package brite.outdoor.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u0089\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010O\u001a\u00020PH\u0016J\b\u0010Q\u001a\u00020PH\u0002J\u0017\u0010R\u001a\u00020P2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0002\u0010\u0015J\b\u0010T\u001a\u00020PH\u0002J\b\u0010U\u001a\u00020PH\u0002J\u0010\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0011H\u0002J\u000e\u0010Y\u001a\u00020P2\u0006\u0010;\u001a\u00020\u0011J\b\u0010Z\u001a\u00020PH\u0002J\b\u0010[\u001a\u00020PH\u0014J\b\u0010\\\u001a\u00020\u0011H\u0014J\u000e\u0010]\u001a\u00020P2\u0006\u0010;\u001a\u00020\u0011J\u0012\u0010^\u001a\u00020P2\b\u0010_\u001a\u0004\u0018\u00010`H\u0014J\b\u0010a\u001a\u00020bH\u0016J\u0012\u0010c\u001a\u00020P2\b\u0010d\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010e\u001a\u00020PH\u0002J\b\u0010f\u001a\u00020PH\u0002J\b\u0010g\u001a\u00020PH\u0002J\b\u0010h\u001a\u00020PH\u0002J\b\u0010i\u001a\u00020PH\u0002J\b\u0010j\u001a\u00020PH\u0002J\b\u0010k\u001a\u00020PH\u0002J\b\u0010l\u001a\u00020PH\u0002J\b\u0010m\u001a\u00020PH\u0002J\u0012\u0010n\u001a\u00020P2\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J\u0010\u0010q\u001a\u00020P2\u0006\u0010r\u001a\u00020WH\u0002J\u0012\u0010s\u001a\u00020P2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016J\b\u0010t\u001a\u00020PH\u0016J\u0017\u0010u\u001a\u00020P2\b\u0010;\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010v\u001a\u00020P2\u0006\u0010w\u001a\u00020xH\u0007J\u0017\u0010y\u001a\u00020P2\b\u0010z\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0002\u0010\u0015J\b\u0010{\u001a\u00020PH\u0002J\u000e\u0010|\u001a\u00020P2\u0006\u0010;\u001a\u00020\u0011J\u001c\u0010}\u001a\u00020\u00022\u0006\u0010~\u001a\u00020\u007f2\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0014J\u0019\u0010\u0082\u0001\u001a\u00020P2\u0006\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0011H\u0002J\u0012\u0010\u0083\u0001\u001a\u00020P2\u0007\u0010\u0084\u0001\u001a\u00020bH\u0002J\t\u0010\u0085\u0001\u001a\u00020PH\u0002J\t\u0010\u0086\u0001\u001a\u00020\u0011H\u0016J\t\u0010\u0087\u0001\u001a\u00020PH\u0002J\t\u0010\u0088\u0001\u001a\u00020PH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b!\u0010\"R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b-\u0010.R\u001e\u00100\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b1\u0010\u0013\"\u0004\b2\u0010\u0015R\u001e\u00103\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b4\u0010\u0013\"\u0004\b5\u0010\u0015R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\u000b\u001a\u0004\b8\u00109R\u0012\u0010;\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0016R\u0012\u0010<\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0016R\u001e\u0010=\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010\u0015R\u001e\u0010@\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\bA\u0010\u0013\"\u0004\bB\u0010\u0015R\u001a\u0010C\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0012\u0010H\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0016R\u001e\u0010I\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\bJ\u0010\u0013\"\u0004\bK\u0010\u0015R\u001a\u0010L\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010E\"\u0004\bN\u0010G\u00a8\u0006\u008a\u0001"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmPersonalPage;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmPersonalPageBinding;", "Landroid/view/View$OnClickListener;", "Lbrite/outdoor/ui/dialog/DialogComment$OnChangeNumberComment;", "()V", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "detailUser", "Lbrite/outdoor/data/api_entities/response/ResponseDetail$DetailResponse;", "dialogComment", "Lbrite/outdoor/ui/dialog/DialogComment;", "extent", "", "getExtent", "()Ljava/lang/Integer;", "setExtent", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "followViewModel", "Lbrite/outdoor/viewmodel/FollowViewModel;", "getFollowViewModel", "()Lbrite/outdoor/viewmodel/FollowViewModel;", "followViewModel$delegate", "lastVisibleItem", "getLastVisibleItem", "setLastVisibleItem", "likeViewModel", "Lbrite/outdoor/viewmodel/LikeViewModel;", "getLikeViewModel", "()Lbrite/outdoor/viewmodel/LikeViewModel;", "likeViewModel$delegate", "mAdapterPostUser", "Lbrite/outdoor/adapter/AdapterMyPost;", "myPageViewModel", "Lbrite/outdoor/viewmodel/MyPageViewModel;", "getMyPageViewModel", "()Lbrite/outdoor/viewmodel/MyPageViewModel;", "myPageViewModel$delegate", "myPostViewModel", "Lbrite/outdoor/viewmodel/MyPostViewModel;", "getMyPostViewModel", "()Lbrite/outdoor/viewmodel/MyPostViewModel;", "myPostViewModel$delegate", "offset", "getOffset", "setOffset", "percentage", "getPercentage", "setPercentage", "personalPageViewModel", "Lbrite/outdoor/viewmodel/PersonalPageViewModel;", "getPersonalPageViewModel", "()Lbrite/outdoor/viewmodel/PersonalPageViewModel;", "personalPageViewModel$delegate", "position", "postId", "range", "getRange", "setRange", "totalItemCount", "getTotalItemCount", "setTotalItemCount", "totalLoadMoreResult", "getTotalLoadMoreResult", "()I", "setTotalLoadMoreResult", "(I)V", "userId", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "visibleThreshold", "getVisibleThreshold", "setVisibleThreshold", "backToPrevious", "", "callApiDetailUser", "callApiFollow", "idUser", "callApiListPostUser", "checkAndCallApiListMyPostIfNeed", "convertNumberInteractive", "", "counts", "deleteItemFrmDetailCallBack", "eventLoadMore", "finish", "getCurrentFragment", "hideItemFrmDetailCallBack", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isBackPreviousEnable", "", "loadControlsAndResize", "binding", "observerChangeLanguage", "observerComment", "observerCountLike", "observerDetailUser", "observerFollowUser", "observerHandleAPILoadingAndErr", "observerLike", "observerListPostUser", "observerSharePost", "onClick", "v", "Landroid/view/View;", "onClickShareListener", "content", "onCreate", "onDestroyView", "onErrorDeletePost", "onEvent", "event", "", "onNumberComment", "numberComment", "prepareList", "reportFrmDetailCallBack", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showDialogComment", "showOrHideLoadingInItem", "isShown", "startShimmerLayout", "statusBarColor", "stopShimmerLayout", "updateTotalResultWhenRemoveItem", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmPersonalPage extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmPersonalPageBinding> implements android.view.View.OnClickListener, brite.outdoor.ui.dialog.DialogComment.OnChangeNumberComment {
    private final kotlin.Lazy myPageViewModel$delegate = null;
    private final kotlin.Lazy followViewModel$delegate = null;
    private final kotlin.Lazy myPostViewModel$delegate = null;
    private final kotlin.Lazy personalPageViewModel$delegate = null;
    private java.lang.Integer userId;
    private java.lang.Integer position;
    private java.lang.Integer postId;
    private final kotlin.Lazy likeViewModel$delegate = null;
    private final kotlin.Lazy authViewModel$delegate = null;
    private brite.outdoor.ui.dialog.DialogComment dialogComment;
    private brite.outdoor.adapter.AdapterMyPost mAdapterPostUser;
    private brite.outdoor.data.api_entities.response.ResponseDetail.DetailResponse detailUser;
    private int totalLoadMoreResult = 0;
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
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.FrmPersonalPage.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.MyPageViewModel getMyPageViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.FollowViewModel getFollowViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.MyPostViewModel getMyPostViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.PersonalPageViewModel getPersonalPageViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.LikeViewModel getLikeViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    public final int getTotalLoadMoreResult() {
        return 0;
    }
    
    public final void setTotalLoadMoreResult(int p0) {
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
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmPersonalPageBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmPersonalPageBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int statusBarColor() {
        return 0;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean isBackPreviousEnable() {
        return false;
    }
    
    @java.lang.Override()
    public void backToPrevious() {
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Object event) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final java.lang.String convertNumberInteractive(int counts) {
        return null;
    }
    
    private final void callApiDetailUser() {
    }
    
    private final void observerDetailUser() {
    }
    
    private final void callApiListPostUser() {
    }
    
    private final void observerListPostUser() {
    }
    
    private final void prepareList() {
    }
    
    public final void hideItemFrmDetailCallBack(int position) {
    }
    
    public final void reportFrmDetailCallBack(int position) {
    }
    
    public final void deleteItemFrmDetailCallBack(int position) {
    }
    
    private final void observerLike() {
    }
    
    private final void observerSharePost() {
    }
    
    private final void showDialogComment(int postId, int position) {
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
    
    private final void onClickShareListener(java.lang.String content) {
    }
    
    private final void showOrHideLoadingInItem(boolean isShown) {
    }
    
    private final void observerHandleAPILoadingAndErr() {
    }
    
    private final void observerFollowUser() {
    }
    
    private final void startShimmerLayout() {
    }
    
    private final void stopShimmerLayout() {
    }
    
    private final void callApiFollow(java.lang.Integer idUser) {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void eventLoadMore() {
    }
    
    private final void checkAndCallApiListMyPostIfNeed() {
    }
    
    private final void observerCountLike() {
    }
    
    private final void updateTotalResultWhenRemoveItem() {
    }
    
    private final void observerChangeLanguage() {
    }
    
    public FrmPersonalPage() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmPersonalPage$Companion;", "", "()V", "getInstance", "Lbrite/outdoor/ui/fragments/FrmPersonalPage;", "userId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.ui.fragments.FrmPersonalPage getInstance(int userId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}