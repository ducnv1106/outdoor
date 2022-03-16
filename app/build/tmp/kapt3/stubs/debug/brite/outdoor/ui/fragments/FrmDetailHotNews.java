package brite.outdoor.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 z2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001zBG\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\u0010\rJ\b\u00104\u001a\u00020\nH\u0016J!\u00105\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u0001072\b\u00101\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u00108J\b\u00109\u001a\u00020\nH\u0002J\b\u0010:\u001a\u00020\nH\u0002J\u0017\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0002\u0010>J\u0012\u0010?\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u0010@\u001a\u00020\nH\u0014J\u001c\u0010A\u001a\u00020\n2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u0010D\u001a\u00020\tH\u0014J\u0010\u0010E\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\u0014\u0010F\u001a\u0004\u0018\u0001072\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010G\u001a\u00020\nH\u0002J\u0017\u0010H\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010IJ\u0012\u0010J\u001a\u00020\n2\b\u0010K\u001a\u0004\u0018\u00010LH\u0014J\b\u0010M\u001a\u00020NH\u0016J\u0012\u0010O\u001a\u00020\n2\b\u0010P\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010Q\u001a\u00020\nH\u0002J\b\u0010R\u001a\u00020\nH\u0003J\b\u0010S\u001a\u00020\nH\u0003J\b\u0010T\u001a\u00020\nH\u0002J\b\u0010U\u001a\u00020\nH\u0003J\u0012\u0010V\u001a\u00020\n2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\u0010\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020<H\u0002J\u0012\u0010[\u001a\u00020\n2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\b\u0010\\\u001a\u00020\nH\u0016J\u0017\u0010]\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010IJ\u0010\u0010^\u001a\u00020\n2\u0006\u0010_\u001a\u00020`H\u0007J\u0017\u0010a\u001a\u00020\n2\b\u0010b\u001a\u0004\u0018\u00010\tH\u0017\u00a2\u0006\u0002\u0010IJ\b\u0010c\u001a\u00020\nH\u0016J\b\u0010d\u001a\u00020\nH\u0016J\u0017\u0010e\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010IJ\u001a\u0010f\u001a\u00020\u00022\u0006\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010jH\u0014J\b\u0010k\u001a\u00020\nH\u0002J\u0010\u0010l\u001a\u00020\n2\u0006\u0010m\u001a\u00020\u0002H\u0002J\u001a\u0010n\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u0001072\u0006\u00101\u001a\u00020\tH\u0003J/\u0010o\u001a\u00020\n2\b\b\u0002\u0010p\u001a\u00020N2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0002\u0010rJ\u0012\u0010s\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000107H\u0016J(\u0010t\u001a\u00020\n2\u0016\u0010u\u001a\u0012\u0012\u0004\u0012\u00020w0vj\b\u0012\u0004\u0012\u00020w`x2\u0006\u00101\u001a\u00020\tH\u0002J\b\u0010y\u001a\u00020\tH\u0016R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u0013\u001a\u0004\b\'\u0010(R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\u0013\u001a\u0004\b.\u0010/R\u0012\u00101\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u000e\u00102\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u00103\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015\u00a8\u0006{"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmDetailHotNews;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmDetailBinding;", "Landroid/view/View$OnClickListener;", "Lbrite/outdoor/ui/dialog/DialogComment$OnChangeNumberComment;", "Lbrite/outdoor/ui/fragments/BottomSheetDialogFrHome$CallBackListener;", "Lbrite/outdoor/ui/dialog/DialogFragmentReport$CallBackListener;", "itemDeleteListener", "Lkotlin/Function1;", "", "", "itemHideListener", "itemReportListener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "commentId", "Ljava/lang/Integer;", "detailResponse", "Lbrite/outdoor/data/api_entities/response/ResponseDetailHotNews$DetailPostHotNewsData;", "detailViewModel", "Lbrite/outdoor/viewmodel/DetailHotNewsViewModel;", "getDetailViewModel", "()Lbrite/outdoor/viewmodel/DetailHotNewsViewModel;", "detailViewModel$delegate", "dialogComment", "Lbrite/outdoor/ui/dialog/DialogComment;", "entity", "Lbrite/outdoor/data/api_entities/response/ResponseListPostHotNews$HotNewsData;", "getItemDeleteListener", "()Lkotlin/jvm/functions/Function1;", "getItemHideListener", "getItemReportListener", "likeViewModel", "Lbrite/outdoor/viewmodel/LikeViewModel;", "getLikeViewModel", "()Lbrite/outdoor/viewmodel/LikeViewModel;", "likeViewModel$delegate", "mAdapter", "Lbrite/outdoor/adapter/AdapterContentDetailHotNews;", "myPostViewModel", "Lbrite/outdoor/viewmodel/MyPostViewModel;", "getMyPostViewModel", "()Lbrite/outdoor/viewmodel/MyPostViewModel;", "myPostViewModel$delegate", "position", "postId", "threadId", "backToPrevious", "badReport", "entityNew", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "(Lbrite/outdoor/data/api_entities/response/ListPostUserData;Ljava/lang/Integer;)V", "callApiBookMart", "callApiDetailPost", "convertLikeCommentShare", "", "count", "(Ljava/lang/Integer;)Ljava/lang/String;", "editPost", "finish", "followUnFollowSuccess", "follow", "Lbrite/outdoor/data/api_entities/response/ResponseFollow$FollowResponse;", "getCurrentFragment", "getPostHotNewsData", "getPostUserData", "goToFrmReminder", "hidePostSuccess", "(Ljava/lang/Integer;)V", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isBackPreviousEnable", "", "loadControlsAndResize", "binding", "observerBookMart", "observerChangeLanguage", "observerDetailPost", "observerLikeUser", "observerSharePost", "onClick", "v", "Landroid/view/View;", "onClickShareListener", "content", "onCreate", "onDestroyView", "onErrorDeletePost", "onEvent", "event", "", "onNumberComment", "numberComment", "onStart", "onStop", "reportSuccess", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setViewInteractive", "setupContent", "frmDetailBinding", "showBottomDialog", "showDialogComment", "isNotification", "comment", "(ZLjava/lang/Integer;Ljava/lang/Integer;)V", "showDialogConfirmDelete", "showPopupImages", "list", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/ImagePicker;", "Lkotlin/collections/ArrayList;", "statusBarColor", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmDetailHotNews extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmDetailBinding> implements android.view.View.OnClickListener, brite.outdoor.ui.dialog.DialogComment.OnChangeNumberComment, brite.outdoor.ui.fragments.BottomSheetDialogFrHome.CallBackListener, brite.outdoor.ui.dialog.DialogFragmentReport.CallBackListener {
    private final kotlin.Lazy detailViewModel$delegate = null;
    private final kotlin.Lazy myPostViewModel$delegate = null;
    private brite.outdoor.adapter.AdapterContentDetailHotNews mAdapter;
    private brite.outdoor.ui.dialog.DialogComment dialogComment;
    private final kotlin.Lazy likeViewModel$delegate = null;
    private final kotlin.Lazy authViewModel$delegate = null;
    private int postId = 0;
    private brite.outdoor.data.api_entities.response.ResponseListPostHotNews.HotNewsData entity;
    private java.lang.Integer position;
    private java.lang.Integer commentId;
    private java.lang.Integer threadId;
    private brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsData detailResponse;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> itemDeleteListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> itemHideListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> itemReportListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.FrmDetailHotNews.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.DetailHotNewsViewModel getDetailViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.MyPostViewModel getMyPostViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.LikeViewModel getLikeViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmDetailBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmDetailBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setViewInteractive() {
    }
    
    private final void setupContent(brite.outdoor.databinding.FrmDetailBinding frmDetailBinding) {
    }
    
    private final void showPopupImages(java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> list, int position) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void showDialogComment(boolean isNotification, java.lang.Integer comment, java.lang.Integer position) {
    }
    
    private final void observerLikeUser() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void observerSharePost() {
    }
    
    private final void callApiBookMart() {
    }
    
    private final void observerBookMart() {
    }
    
    private final void callApiDetailPost() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void observerDetailPost() {
    }
    
    private final java.lang.String convertLikeCommentShare(java.lang.Integer count) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onNumberComment(@org.jetbrains.annotations.Nullable()
    java.lang.Integer numberComment) {
    }
    
    @java.lang.Override()
    public void onErrorDeletePost(@org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
    }
    
    @java.lang.Override()
    public boolean isBackPreviousEnable() {
        return false;
    }
    
    @java.lang.Override()
    public void backToPrevious() {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    @java.lang.Override()
    public int statusBarColor() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
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
    
    @java.lang.Override()
    public void reportSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.Integer position) {
    }
    
    private final void onClickShareListener(java.lang.String content) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Object event) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void observerChangeLanguage() {
    }
    
    private final void goToFrmReminder() {
    }
    
    private final brite.outdoor.data.api_entities.response.ListPostUserData getPostUserData(brite.outdoor.data.api_entities.response.ResponseListPostHotNews.HotNewsData entity) {
        return null;
    }
    
    private final brite.outdoor.data.api_entities.response.ResponseListPostHotNews.HotNewsData getPostHotNewsData(brite.outdoor.data.api_entities.response.ResponseDetailHotNews.DetailPostHotNewsData entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getItemDeleteListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getItemHideListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getItemReportListener() {
        return null;
    }
    
    public FrmDetailHotNews(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemDeleteListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemHideListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemReportListener) {
        super();
    }
    
    public FrmDetailHotNews() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Jt\u0010\u0003\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a8\u0006\u0012"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmDetailHotNews$Companion;", "", "()V", "getInstance", "Lbrite/outdoor/ui/fragments/FrmDetailHotNews;", "arrayList", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/BackStackData;", "Lkotlin/collections/ArrayList;", "mapData", "Ljava/util/HashMap;", "", "itemDeleteListener", "Lkotlin/Function1;", "", "", "itemHideListener", "itemReportListener", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.ui.fragments.FrmDetailHotNews getInstance(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<brite.outdoor.data.entities.BackStackData> arrayList, @org.jetbrains.annotations.Nullable()
        java.util.HashMap<java.lang.String, java.lang.Object> mapData, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemDeleteListener, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemHideListener, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemReportListener) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}