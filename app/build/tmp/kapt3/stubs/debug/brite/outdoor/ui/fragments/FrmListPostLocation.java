package brite.outdoor.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 q2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001qB\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u00100\u001a\u000201H\u0016J!\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u00010!H\u0016\u00a2\u0006\u0002\u00106J\u0012\u00107\u001a\u0002012\b\u00103\u001a\u0004\u0018\u000104H\u0002J\"\u00108\u001a\u0002012\u0006\u00109\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0002J\"\u0010:\u001a\u0002012\u0006\u00109\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010;\u001a\u0002012\u0006\u00105\u001a\u00020!J\u0012\u0010<\u001a\u0002012\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010=\u001a\u000201H\u0002J\b\u0010>\u001a\u000201H\u0014J\u001c\u0010?\u001a\u0002012\b\u0010@\u001a\u0004\u0018\u00010A2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010B\u001a\u00020!H\u0014J\u000e\u0010C\u001a\u0002012\u0006\u00105\u001a\u00020!J\u0017\u0010D\u001a\u0002012\b\u00105\u001a\u0004\u0018\u00010!H\u0016\u00a2\u0006\u0002\u0010EJ\b\u0010F\u001a\u000201H\u0002J\u0012\u0010G\u001a\u0002012\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\b\u0010J\u001a\u00020KH\u0016J\u0012\u0010L\u001a\u0002012\b\u0010M\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010N\u001a\u000201H\u0002J\b\u0010O\u001a\u000201H\u0002J\b\u0010P\u001a\u000201H\u0002J\b\u0010Q\u001a\u000201H\u0002J\b\u0010R\u001a\u000201H\u0002J\b\u0010S\u001a\u000201H\u0002J\b\u0010T\u001a\u000201H\u0002J\b\u0010U\u001a\u000201H\u0002J\b\u0010V\u001a\u000201H\u0002J\u0012\u0010W\u001a\u0002012\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u0010\u0010Z\u001a\u0002012\u0006\u0010[\u001a\u00020\u0013H\u0002J\u0012\u0010\\\u001a\u0002012\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0017\u0010]\u001a\u0002012\b\u00105\u001a\u0004\u0018\u00010!H\u0016\u00a2\u0006\u0002\u0010EJ\u0010\u0010^\u001a\u0002012\u0006\u0010_\u001a\u00020`H\u0007J\u0017\u0010a\u001a\u0002012\b\u0010b\u001a\u0004\u0018\u00010!H\u0016\u00a2\u0006\u0002\u0010EJ\b\u0010c\u001a\u000201H\u0002J\b\u0010d\u001a\u000201H\u0016J\b\u0010e\u001a\u000201H\u0016J\u000e\u0010f\u001a\u0002012\u0006\u00105\u001a\u00020!J\u0017\u0010g\u001a\u0002012\b\u00105\u001a\u0004\u0018\u00010!H\u0016\u00a2\u0006\u0002\u0010EJ\u001a\u0010h\u001a\u00020\u00022\u0006\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010lH\u0014J\u001a\u0010m\u001a\u0002012\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020!H\u0002J\u0018\u0010n\u001a\u0002012\u0006\u0010#\u001a\u00020!2\u0006\u00105\u001a\u00020!H\u0002J\u0012\u0010o\u001a\u0002012\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010p\u001a\u000201H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010$R\u001a\u0010%\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0012\u0010*\u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010$R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\u000f\u001a\u0004\b-\u0010.\u00a8\u0006r"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmListPostLocation;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmListPostLocationBinding;", "Lbrite/outdoor/ui/fragments/BottomSheetDialogFrHome$CallBackListener;", "Lbrite/outdoor/ui/dialog/DialogFragmentReport$CallBackListener;", "Lbrite/outdoor/ui/dialog/DialogComment$OnChangeNumberComment;", "Landroid/view/View$OnClickListener;", "()V", "adapter", "Lbrite/outdoor/adapter/AdapterHome;", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "dialogComment", "Lbrite/outdoor/ui/dialog/DialogComment;", "lastest_id", "", "likeViewModel", "Lbrite/outdoor/viewmodel/LikeViewModel;", "getLikeViewModel", "()Lbrite/outdoor/viewmodel/LikeViewModel;", "likeViewModel$delegate", "locationId", "locationName", "myPostViewModel", "Lbrite/outdoor/viewmodel/MyPostViewModel;", "getMyPostViewModel", "()Lbrite/outdoor/viewmodel/MyPostViewModel;", "myPostViewModel$delegate", "numberPage", "", "positionRemoveItem", "postId", "Ljava/lang/Integer;", "totalLoadMoreResult", "getTotalLoadMoreResult", "()I", "setTotalLoadMoreResult", "(I)V", "typeFragment", "viewMode", "Lbrite/outdoor/viewmodel/ListPostLocationViewModel;", "getViewMode", "()Lbrite/outdoor/viewmodel/ListPostLocationViewModel;", "viewMode$delegate", "backToPrevious", "", "badReport", "entityNew", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "position", "(Lbrite/outdoor/data/api_entities/response/ListPostUserData;Ljava/lang/Integer;)V", "callApiDeletePost", "callApiLocation", "page", "callApiUtensils", "deleteItemFrmDetailCallBack", "editPost", "eventLoadMore", "finish", "followUnFollowSuccess", "follow", "Lbrite/outdoor/data/api_entities/response/ResponseFollow$FollowResponse;", "getCurrentFragment", "hideItemFrmDetailCallBack", "hidePostSuccess", "(Ljava/lang/Integer;)V", "initAdapter", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isBackPreviousEnable", "", "loadControlsAndResize", "binding", "observerChangeLanguage", "observerComment", "observerDeletePost", "observerHandleAPILoadingAndErr", "observerLikeUser", "observerListPostLocation", "observerListPostUtensils", "observerNeedUpdateDataPostInListLocation", "observerSharePost", "onClick", "v", "Landroid/view/View;", "onClickShareListener", "content", "onCreate", "onErrorDeletePost", "onEvent", "event", "", "onNumberComment", "numberComment", "onRefreshListener", "onStart", "onStop", "reportFrmDetailCallBack", "reportSuccess", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showBottomDialog", "showDialogComment", "showDialogConfirmDelete", "updateTotalResultWhenRemoveItem", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmListPostLocation extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmListPostLocationBinding> implements brite.outdoor.ui.fragments.BottomSheetDialogFrHome.CallBackListener, brite.outdoor.ui.dialog.DialogFragmentReport.CallBackListener, brite.outdoor.ui.dialog.DialogComment.OnChangeNumberComment, android.view.View.OnClickListener {
    private final kotlin.Lazy viewMode$delegate = null;
    private final kotlin.Lazy likeViewModel$delegate = null;
    private int numberPage = 1;
    private java.lang.String locationId;
    private java.lang.Integer typeFragment;
    private final kotlin.Lazy myPostViewModel$delegate = null;
    private final kotlin.Lazy authViewModel$delegate = null;
    private brite.outdoor.adapter.AdapterHome adapter;
    private int totalLoadMoreResult = 0;
    private brite.outdoor.ui.dialog.DialogComment dialogComment;
    private java.lang.Integer postId;
    private int positionRemoveItem = 0;
    private java.lang.String lastest_id = "";
    private java.lang.String locationName;
    public static final int FRM_SEARCH_UTENSILS = 2;
    public static final int FRM_SEARCH_LOCATION = 1;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.FrmListPostLocation.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.ListPostLocationViewModel getViewMode() {
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
    
    public final int getTotalLoadMoreResult() {
        return 0;
    }
    
    public final void setTotalLoadMoreResult(int p0) {
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmListPostLocationBinding binding) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmListPostLocationBinding setBinding(@org.jetbrains.annotations.NotNull()
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
    
    private final void callApiLocation(int page, java.lang.String locationId, java.lang.String lastest_id) {
    }
    
    private final void callApiUtensils(int page, java.lang.String locationId, java.lang.String lastest_id) {
    }
    
    private final void observerLikeUser() {
    }
    
    private final void observerSharePost() {
    }
    
    private final void observerListPostLocation() {
    }
    
    private final void observerListPostUtensils() {
    }
    
    private final void observerHandleAPILoadingAndErr() {
    }
    
    private final void onRefreshListener() {
    }
    
    private final void eventLoadMore() {
    }
    
    private final void showBottomDialog(brite.outdoor.data.api_entities.response.ListPostUserData entityNew, int position) {
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
    
    @java.lang.Override()
    public void reportSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
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
    
    public final void deleteItemFrmDetailCallBack(int position) {
    }
    
    public final void hideItemFrmDetailCallBack(int position) {
    }
    
    public final void reportFrmDetailCallBack(int position) {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
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
    
    private final void observerNeedUpdateDataPostInListLocation() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void updateTotalResultWhenRemoveItem() {
    }
    
    private final void observerChangeLanguage() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Object event) {
    }
    
    public FrmListPostLocation() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0006\u001a\u00020\u00072\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmListPostLocation$Companion;", "", "()V", "FRM_SEARCH_LOCATION", "", "FRM_SEARCH_UTENSILS", "getInstance", "Lbrite/outdoor/ui/fragments/FrmListPostLocation;", "arrayList", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/BackStackData;", "Lkotlin/collections/ArrayList;", "mapData", "Ljava/util/HashMap;", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.ui.fragments.FrmListPostLocation getInstance(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<brite.outdoor.data.entities.BackStackData> arrayList, @org.jetbrains.annotations.Nullable()
        java.util.HashMap<java.lang.String, java.lang.Object> mapData) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}