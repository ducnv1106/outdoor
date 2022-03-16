package brite.outdoor.ui.fragments.my_page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J!\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010\u001dH\u0016\u00a2\u0006\u0002\u0010(J\u0012\u0010)\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0012\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u000e\u0010-\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u001dJ\u0012\u0010.\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010/\u001a\u00020$H\u0014J\u001c\u00100\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u0001022\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u00103\u001a\u00020\u001dH\u0014J\u000e\u00104\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u001dJ\u0017\u00105\u001a\u00020$2\b\u0010\'\u001a\u0004\u0018\u00010\u001dH\u0016\u00a2\u0006\u0002\u00106J\u0012\u00107\u001a\u00020$2\b\u00108\u001a\u0004\u0018\u000109H\u0014J\u0012\u0010:\u001a\u00020$2\b\u0010;\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010<\u001a\u00020$H\u0002J\b\u0010=\u001a\u00020$H\u0002J\b\u0010>\u001a\u00020$H\u0002J\b\u0010?\u001a\u00020$H\u0002J\b\u0010@\u001a\u00020$H\u0002J\u0010\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020$H\u0002J\b\u0010E\u001a\u00020$H\u0002J\u0006\u0010F\u001a\u00020$J\b\u0010G\u001a\u00020$H\u0002J\u000e\u0010H\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u001dJ\u0017\u0010I\u001a\u00020$2\b\u0010\'\u001a\u0004\u0018\u00010\u001dH\u0016\u00a2\u0006\u0002\u00106J\u001a\u0010J\u001a\u00020\u00022\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NH\u0014J\u001a\u0010O\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020\u001dH\u0003J\u001a\u0010P\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010\'\u001a\u00020\u001dH\u0002J\u0012\u0010Q\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010R\u001a\u00020$2\u0006\u0010S\u001a\u00020TH\u0002J\u0006\u0010U\u001a\u00020$J\u0006\u0010V\u001a\u00020$J\b\u0010W\u001a\u00020$H\u0002J\u0006\u0010X\u001a\u00020$R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006Y"}, d2 = {"Lbrite/outdoor/ui/fragments/my_page/FrmMyBookMart;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmMyBookMartBinding;", "Lbrite/outdoor/ui/fragments/BottomSheetDialogFrHome$CallBackListener;", "Lbrite/outdoor/ui/dialog/DialogFragmentReport$CallBackListener;", "()V", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "mAdapterBookMark", "Lbrite/outdoor/adapter/AdapterBookMark;", "getMAdapterBookMark", "()Lbrite/outdoor/adapter/AdapterBookMark;", "setMAdapterBookMark", "(Lbrite/outdoor/adapter/AdapterBookMark;)V", "myBookmarkViewModel", "Lbrite/outdoor/viewmodel/MyBookmarkViewModel;", "getMyBookmarkViewModel", "()Lbrite/outdoor/viewmodel/MyBookmarkViewModel;", "myBookmarkViewModel$delegate", "myPageViewModel", "Lbrite/outdoor/viewmodel/MyPageViewModel;", "getMyPageViewModel", "()Lbrite/outdoor/viewmodel/MyPageViewModel;", "myPageViewModel$delegate", "positionRemoveItem", "", "totalLoadMoreResult", "getTotalLoadMoreResult", "()I", "setTotalLoadMoreResult", "(I)V", "badReport", "", "entityNew", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "position", "(Lbrite/outdoor/data/api_entities/response/ListPostUserData;Ljava/lang/Integer;)V", "callApiDeletePost", "callApiUnBookMark", "entitySavedPost", "Lbrite/outdoor/data/api_entities/response/ResponseListBookMark$ListBookMarkData;", "deleteItemFrmDetailCallBack", "editPost", "finish", "followUnFollowSuccess", "follow", "Lbrite/outdoor/data/api_entities/response/ResponseFollow$FollowResponse;", "getCurrentFragment", "hideItemFrmDetailCallBack", "hidePostSuccess", "(Ljava/lang/Integer;)V", "initView", "savedInstanceState", "Landroid/os/Bundle;", "loadControlsAndResize", "binding", "observerDeletePost", "observerHandleAPILoadingAndErr", "observerListBookMark", "observerSharePost", "observerUnBookMark", "onClickShareListener", "content", "", "onRefreshListener", "onRefresherData", "onRefresherDataScrollToFirst", "prepareList", "reportFrmDetailCallBack", "reportSuccess", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showBottomDialog", "showDialogCancel", "showDialogConfirmDelete", "showOrHideLoadingInItem", "isShown", "", "startShimmerLayout", "stopShimmerLayout", "updateTotalResultWhenRemoveItem", "updateUIAfterChangLanguage", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmMyBookMart extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmMyBookMartBinding> implements brite.outdoor.ui.fragments.BottomSheetDialogFrHome.CallBackListener, brite.outdoor.ui.dialog.DialogFragmentReport.CallBackListener {
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.adapter.AdapterBookMark mAdapterBookMark;
    private final kotlin.Lazy authViewModel$delegate = null;
    private final kotlin.Lazy myBookmarkViewModel$delegate = null;
    private final kotlin.Lazy myPageViewModel$delegate = null;
    private int positionRemoveItem = 0;
    private int totalLoadMoreResult = 0;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.adapter.AdapterBookMark getMAdapterBookMark() {
        return null;
    }
    
    public final void setMAdapterBookMark(@org.jetbrains.annotations.Nullable()
    brite.outdoor.adapter.AdapterBookMark p0) {
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.MyBookmarkViewModel getMyBookmarkViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.MyPageViewModel getMyPageViewModel() {
        return null;
    }
    
    public final int getTotalLoadMoreResult() {
        return 0;
    }
    
    public final void setTotalLoadMoreResult(int p0) {
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmMyBookMartBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmMyBookMartBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void deleteItemFrmDetailCallBack(int position) {
    }
    
    public final void hideItemFrmDetailCallBack(int position) {
    }
    
    public final void reportFrmDetailCallBack(int position) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showBottomDialog(brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position) {
    }
    
    private final void prepareList() {
    }
    
    private final void observerHandleAPILoadingAndErr() {
    }
    
    private final void showOrHideLoadingInItem(boolean isShown) {
    }
    
    private final void observerListBookMark() {
    }
    
    private final void callApiUnBookMark(brite.outdoor.data.api_entities.response.ResponseListBookMark.ListBookMarkData entitySavedPost) {
    }
    
    private final void observerUnBookMark() {
    }
    
    private final void observerSharePost() {
    }
    
    private final void onClickShareListener(java.lang.String content) {
    }
    
    private final void showDialogCancel(brite.outdoor.data.api_entities.response.ResponseListBookMark.ListBookMarkData entitySavedPost, int position) {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    public final void startShimmerLayout() {
    }
    
    public final void stopShimmerLayout() {
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
    
    @java.lang.Override()
    public void reportSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
    }
    
    private final void observerDeletePost() {
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
    
    public FrmMyBookMart() {
        super();
    }
}