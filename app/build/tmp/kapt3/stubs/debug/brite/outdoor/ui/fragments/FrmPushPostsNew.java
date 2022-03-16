package brite.outdoor.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 ~2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001~B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000208H\u0002J\b\u0010:\u001a\u000208H\u0002J\b\u0010;\u001a\u000208H\u0002J\b\u0010<\u001a\u00020\u0014H\u0002J\u0018\u0010=\u001a\u0002082\u0006\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u000208H\u0014J\u0018\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020)H\u0002J\b\u0010F\u001a\u000208H\u0002J\u0006\u0010G\u001a\u000208J\b\u0010H\u001a\u000208H\u0002J\u0012\u0010I\u001a\u0002082\b\u0010J\u001a\u0004\u0018\u00010KH\u0014J$\u0010L\u001a\u00020\u00102\u001a\u0010M\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u001b\u0018\u0001`\u001cH\u0002J\u0012\u0010N\u001a\u0002082\b\u0010O\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010P\u001a\u000208H\u0002J\b\u0010Q\u001a\u000208H\u0002J\b\u0010R\u001a\u000208H\u0002J\u0012\u0010S\u001a\u0002082\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010T\u001a\u000208H\u0002J\u0012\u0010U\u001a\u0002082\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\u0012\u0010X\u001a\u0002082\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010Y\u001a\u000208H\u0016J\u0010\u0010Z\u001a\u0002082\u0006\u0010[\u001a\u00020\\H\u0007J\b\u0010]\u001a\u000208H\u0016J\b\u0010^\u001a\u000208H\u0016J4\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010>\u001a\u00020\u00102\u0006\u0010a\u001a\u00020@2\b\b\u0002\u0010b\u001a\u00020\u00102\u0006\u0010c\u001a\u00020\u00142\u0006\u0010d\u001a\u00020\u0014H\u0002J\b\u0010e\u001a\u000208H\u0002J\u001a\u0010f\u001a\u00020\u00022\u0006\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010jH\u0014J\b\u0010k\u001a\u000208H\u0003J\b\u0010l\u001a\u000208H\u0002J\u0010\u0010m\u001a\u0002082\u0006\u0010n\u001a\u00020\u0002H\u0002J\u0010\u0010o\u001a\u0002082\u0006\u0010n\u001a\u00020\u0002H\u0002J\b\u0010p\u001a\u000208H\u0002J\b\u0010q\u001a\u000208H\u0003J\u0010\u0010r\u001a\u0002082\u0006\u0010s\u001a\u00020\u0010H\u0002J\b\u0010t\u001a\u000208H\u0002J\b\u0010u\u001a\u000208H\u0002J\b\u0010v\u001a\u000208H\u0002J\b\u0010w\u001a\u000208H\u0002J\b\u0010x\u001a\u000208H\u0002J\b\u0010y\u001a\u00020\u000eH\u0002J\b\u0010z\u001a\u00020\u0014H\u0002J\b\u0010{\u001a\u00020\u0014H\u0002J\b\u0010|\u001a\u00020\u0014H\u0002J\b\u0010}\u001a\u00020\u0014H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u001b\u0018\u0001`\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R&\u0010!\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u001aj\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u0001`\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010*R\u0012\u0010+\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010*R\u0010\u0010,\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b/\u00100R\u000e\u00102\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u00103\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u007f"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmPushPostsNew;", "Lbrite/outdoor/ui/fragments/BaseDialogFragment;", "Lbrite/outdoor/databinding/FrmPushPostsNewBinding;", "Landroid/view/View$OnClickListener;", "()V", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "entityPostNeedEdit", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "heightScreen", "", "idUser", "", "imagePicker", "Lbrite/outdoor/data/entities/ImagePicker;", "isCheckFileExist", "", "isCheckPushPost", "isEditPost", "isFirstOpenScreenLocationOrUtensil", "language", "listContent", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/PostContentEntity;", "Lkotlin/collections/ArrayList;", "getListContent", "()Ljava/util/ArrayList;", "setListContent", "(Ljava/util/ArrayList;)V", "listImageDelete", "locationEntity", "Lbrite/outdoor/data/entities/LocationEntity;", "locationId", "locationName", "mAdapter", "Lbrite/outdoor/adapter/AdapterPostContentNew;", "mLat", "", "Ljava/lang/Double;", "mLng", "nameAvatar", "pushPostViewModel", "Lbrite/outdoor/viewmodel/PushPostViewModel;", "getPushPostViewModel", "()Lbrite/outdoor/viewmodel/PushPostViewModel;", "pushPostViewModel$delegate", "typeFragment", "typeVideo", "Ljava/lang/Integer;", "utensilsEntity", "Lbrite/outdoor/data/entities/UtensilsEntity;", "callApiEditPost", "", "callApiPushPost", "closeScreen", "createPostContent", "enablePushPost", "fetchLocationImage", "partName", "uri", "Landroid/net/Uri;", "finish", "getAddress", "Landroid/location/Address;", "latitute", "longitude", "getHeightScreen", "handleAddNewRecord", "handlePushPost", "initView", "savedInstanceState", "Landroid/os/Bundle;", "listToJson", "list", "loadControlsAndResize", "binding", "observerEditPost", "observerListImageDelete", "observerPushPost", "onActivityCreated", "onBackListener", "onClick", "v", "Landroid/view/View;", "onCreate", "onDestroyView", "onEvent", "event", "", "onStart", "onStop", "prepareFilePart", "Lokhttp3/MultipartBody$Part;", "fileUri", "pathFile", "isVideo", "isFormatImage", "saveCachePoshPost", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setLatAndLng", "setUtensils", "setupContent", "frmPushPostsBinding", "setupTopNavigation", "showDialogCancel", "showDialogDeletePostIfNeed", "showDialogSuccess", "tvMessage", "showFirstScreenSelectedLocationOrUtensil", "showPopupAddImages", "showPopupEditBlock", "showProgressDialogSave", "showViewKeyBoard", "transToSelectPositionBlock", "validateAvatar", "validateContent", "validateLocationOrUtensil", "validateTitle", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmPushPostsNew extends brite.outdoor.ui.fragments.BaseDialogFragment<brite.outdoor.databinding.FrmPushPostsNewBinding> implements android.view.View.OnClickListener {
    private brite.outdoor.adapter.AdapterPostContentNew mAdapter;
    private java.lang.String idUser = "";
    private java.lang.Double mLat;
    private java.lang.Double mLng;
    private java.lang.String locationId = "";
    private java.lang.String locationName = "";
    private final kotlin.Lazy pushPostViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity> listContent;
    private brite.outdoor.data.entities.ImagePicker imagePicker;
    private brite.outdoor.data.entities.UtensilsEntity utensilsEntity;
    private brite.outdoor.data.entities.LocationEntity locationEntity;
    private int typeFragment = 0;
    private brite.outdoor.data.api_entities.response.ListPostUserData entityPostNeedEdit;
    private final kotlin.Lazy authViewModel$delegate = null;
    private boolean isEditPost = false;
    private java.util.ArrayList<java.lang.String> listImageDelete;
    private java.lang.String nameAvatar;
    private java.lang.Integer typeVideo;
    private boolean isCheckPushPost = false;
    private int language = 1;
    private boolean isCheckFileExist = true;
    private int heightScreen = 0;
    private boolean isFirstOpenScreenLocationOrUtensil = false;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.FrmPushPostsNew.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.PushPostViewModel getPushPostViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity> getListContent() {
        return null;
    }
    
    public final void setListContent(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity> p0) {
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    private final void showPopupAddImages() {
    }
    
    private final void showPopupEditBlock() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmPushPostsNewBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmPushPostsNewBinding binding) {
    }
    
    private final void handlePushPost() {
    }
    
    private final boolean enablePushPost() {
        return false;
    }
    
    private final boolean validateTitle() {
        return false;
    }
    
    private final boolean validateContent() {
        return false;
    }
    
    private final boolean validateAvatar() {
        return false;
    }
    
    private final boolean validateLocationOrUtensil() {
        return false;
    }
    
    public final void handleAddNewRecord() {
    }
    
    private final void setupTopNavigation(brite.outdoor.databinding.FrmPushPostsNewBinding frmPushPostsBinding) {
    }
    
    private final void setupContent(brite.outdoor.databinding.FrmPushPostsNewBinding frmPushPostsBinding) {
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void setLatAndLng() {
    }
    
    private final void setUtensils() {
    }
    
    private final void showDialogCancel() {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    private final void showDialogDeletePostIfNeed() {
    }
    
    private final void saveCachePoshPost() {
    }
    
    private final void showProgressDialogSave() {
    }
    
    private final void callApiPushPost() {
    }
    
    private final void callApiEditPost() {
    }
    
    private final void observerPushPost() {
    }
    
    private final void showDialogSuccess(java.lang.String tvMessage) {
    }
    
    private final void observerEditPost() {
    }
    
    private final java.lang.String listToJson(java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity> list) {
        return null;
    }
    
    private final okhttp3.MultipartBody.Part prepareFilePart(java.lang.String partName, android.net.Uri fileUri, java.lang.String pathFile, boolean isVideo, boolean isFormatImage) {
        return null;
    }
    
    private final void closeScreen() {
    }
    
    private final void onBackListener() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Object event) {
    }
    
    private final void showFirstScreenSelectedLocationOrUtensil() {
    }
    
    private final void createPostContent() {
    }
    
    private final void observerListImageDelete() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void getHeightScreen() {
    }
    
    private final void showViewKeyBoard() {
    }
    
    private final int transToSelectPositionBlock() {
        return 0;
    }
    
    private final void fetchLocationImage(java.lang.String partName, android.net.Uri uri) {
    }
    
    private final android.location.Address getAddress(double latitute, double longitude) {
        return null;
    }
    
    public FrmPushPostsNew() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ2\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u0011"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmPushPostsNew$Companion;", "", "()V", "getInstance", "Landroidx/fragment/app/DialogFragment;", "postNeedEdit", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "typeFragment", "", "isEditPost", "", "location", "Lbrite/outdoor/data/entities/LocationEntity;", "imagePicker", "Lbrite/outdoor/data/entities/ImagePicker;", "utensils", "Lbrite/outdoor/data/entities/UtensilsEntity;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.DialogFragment getInstance(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.entities.LocationEntity location, @org.jetbrains.annotations.Nullable()
        brite.outdoor.data.entities.ImagePicker imagePicker, @org.jetbrains.annotations.Nullable()
        brite.outdoor.data.entities.UtensilsEntity utensils, int typeFragment) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.DialogFragment getInstance(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.api_entities.response.ListPostUserData postNeedEdit, int typeFragment, boolean isEditPost) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}