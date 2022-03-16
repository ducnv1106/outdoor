package brite.outdoor.ui.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00e6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0088\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010>\u001a\u00020?H\u0002J \u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\u0013H\u0002J(\u0010E\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020\u00132\u0006\u0010F\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\u0013H\u0002J.\u0010G\u001a\u00020A2\u0006\u0010D\u001a\u00020\u001f2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010H\u001a\u00020\u001f2\b\b\u0002\u0010I\u001a\u00020\u001fH\u0002J\u001a\u0010J\u001a\u00020A2\u0006\u0010D\u001a\u00020\u001f2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010K\u001a\u00020A2\u0006\u0010D\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u001fH\u0002J(\u0010M\u001a\u00020A2\u0006\u0010D\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u001fH\u0002J\b\u0010O\u001a\u00020AH\u0002J\b\u0010P\u001a\u00020AH\u0002J\b\u0010Q\u001a\u00020AH\u0002J*\u0010R\u001a\b\u0012\u0004\u0012\u00020T0S2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020T0S2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020T0SH\u0002J\b\u0010W\u001a\u00020AH\u0002J\u0010\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0002J\b\u0010\\\u001a\u00020AH\u0002J\u0010\u0010]\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0002J\b\u0010`\u001a\u00020AH\u0002J\u0018\u0010a\u001a\u00020A2\u0006\u0010H\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u001fH\u0002J\b\u0010b\u001a\u00020AH\u0002J\b\u0010c\u001a\u00020AH\u0002J\b\u0010d\u001a\u00020AH\u0002J\u0018\u0010e\u001a\u00020A2\u0006\u0010f\u001a\u00020T2\u0006\u0010C\u001a\u00020\u0013H\u0002J\u0006\u0010g\u001a\u00020AJ\b\u0010h\u001a\u00020AH\u0002J\b\u0010i\u001a\u00020AH\u0002J\b\u0010j\u001a\u00020AH\u0002J\b\u0010k\u001a\u00020AH\u0002J\b\u0010l\u001a\u00020AH\u0002J\b\u0010m\u001a\u00020AH\u0002J\u0012\u0010n\u001a\u00020A2\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J\u0012\u0010q\u001a\u00020r2\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J$\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020v2\b\u0010w\u001a\u0004\u0018\u00010x2\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J\b\u0010y\u001a\u00020AH\u0016J\b\u0010z\u001a\u00020AH\u0002J\u001a\u0010{\u001a\u0004\u0018\u00010|2\u0006\u0010}\u001a\u00020\u001f2\u0006\u0010~\u001a\u00020_H\u0002J\u0015\u0010\u007f\u001a\u00020A2\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0011H\u0002J!\u0010\u0081\u0001\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\u0013H\u0002J)\u0010\u0082\u0001\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020\u00132\u0006\u0010F\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\u0013H\u0002J\t\u0010\u0083\u0001\u001a\u00020AH\u0002J\t\u0010\u0084\u0001\u001a\u00020AH\u0002J\u0019\u0010\u0085\u0001\u001a\u00020A2\u0006\u0010f\u001a\u00020T2\u0006\u0010C\u001a\u00020\u0013H\u0002J\t\u0010\u0086\u0001\u001a\u00020AH\u0002J\t\u0010\u0087\u0001\u001a\u00020AH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00110!j\b\u0012\u0004\u0012\u00020\u0011`\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b\'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b,\u0010-R\"\u0010/\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010\u001f0\u001f0100X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f04X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u00105\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u00106R\u000e\u00107\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u0010\f\u001a\u0004\b:\u0010;R\u000e\u0010=\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0089\u0001"}, d2 = {"Lbrite/outdoor/ui/dialog/DialogCommentHotNews;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "adapter", "Lbrite/outdoor/adapter/AdapterCommentHotNews;", "adapterReplyComment", "Lbrite/outdoor/adapter/AdapterCommentReplyHotNews;", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lbrite/outdoor/databinding/LayoutCommentHotNewsBinding;", "flow", "Lkotlinx/coroutines/flow/Flow;", "Lbrite/outdoor/data/entities/ImagePicker;", "heightScreen", "", "hotNewsViewModel", "Lbrite/outdoor/viewmodel/HotNewsViewModel;", "getHotNewsViewModel", "()Lbrite/outdoor/viewmodel/HotNewsViewModel;", "hotNewsViewModel$delegate", "imagePickerAdapter", "Lbrite/outdoor/adapter/ImagePickAdapterAvatar;", "imagePickerAdapterReply", "jobInsertImagePicker", "Lkotlinx/coroutines/CoroutineScope;", "lastestId", "", "listImagePicker", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mActivity", "Lbrite/outdoor/ui/activities/MainActivity;", "mViewModel", "Lbrite/outdoor/viewmodel/CommentHotNewsViewModel;", "getMViewModel", "()Lbrite/outdoor/viewmodel/CommentHotNewsViewModel;", "mViewModel$delegate", "myPostViewModel", "Lbrite/outdoor/viewmodel/MyPostViewModel;", "getMyPostViewModel", "()Lbrite/outdoor/viewmodel/MyPostViewModel;", "myPostViewModel$delegate", "permissionRequest", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "permissions", "", "positionPost", "Ljava/lang/Integer;", "postId", "shareViewModel", "Lbrite/outdoor/viewmodel/ShareViewModel;", "getShareViewModel", "()Lbrite/outdoor/viewmodel/ShareViewModel;", "shareViewModel$delegate", "totalLoadMoreResult", "allPermissionsGranted", "", "callApiDeleteComment", "", "idComment", "positionComment", "idPost", "callApiDeleteReplyComment", "positionReplyComment", "callApiListComment", "threadId", "commentId", "callApiListReplyAnswerQuestion", "callApiPostComment", "content", "callApiPostReplyComment", "replyId", "clearEditText", "eventLoadMore", "focusEdt", "getDistinctComment", "", "Lbrite/outdoor/data/api_entities/response/ResponseListCommentHotNews$CommentHotNews;", "fisrtList", "secondList", "getHeightScreen", "getItemReplyComment", "Lbrite/outdoor/data/api_entities/response/ResponseListCommentHotNews$CommentHotNewsReply;", "item", "Lbrite/outdoor/data/api_entities/response/ResponsePostCommentHotNews$PostCommentHotNewsResponse;", "getPicturePaths", "getRealPathFromURI", "uri", "Landroid/net/Uri;", "handlerPostComment", "handlerPostReplyComment", "initAdapter", "initMainActivity", "initView", "initViewReply", "entity", "loadControlsAndResize", "observerDeleteComment", "observerDeleteReplyComment", "observerListComment", "observerListReplyAnswerQuestion", "observerOpenKeyboard", "observerPostComment", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onPermissionGranted", "prepareFilePart", "Lokhttp3/MultipartBody$Part;", "partName", "fileUri", "setDataToViewImage", "imagePick", "showDialogDeleteComment", "showDialogDeleteReplyComment", "showLayoutComment", "showViewKeyBoard", "showViewReply", "updateTotalResultWhenAddItem", "updateTotalResultWhenRemoveItem", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DialogCommentHotNews extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy authViewModel$delegate = null;
    private final kotlin.Lazy shareViewModel$delegate = null;
    private final kotlin.Lazy hotNewsViewModel$delegate = null;
    private final kotlin.Lazy myPostViewModel$delegate = null;
    private brite.outdoor.adapter.AdapterCommentHotNews adapter;
    private brite.outdoor.adapter.AdapterCommentReplyHotNews adapterReplyComment;
    private brite.outdoor.adapter.ImagePickAdapterAvatar imagePickerAdapter;
    private brite.outdoor.adapter.ImagePickAdapterAvatar imagePickerAdapterReply;
    private brite.outdoor.databinding.LayoutCommentHotNewsBinding binding;
    private brite.outdoor.ui.activities.MainActivity mActivity;
    private int totalLoadMoreResult = 0;
    private java.lang.String lastestId = "";
    private int postId = 0;
    private java.lang.Integer positionPost;
    private int heightScreen = 0;
    private kotlinx.coroutines.flow.Flow<brite.outdoor.data.entities.ImagePicker> flow;
    private final java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> listImagePicker = null;
    private final kotlinx.coroutines.CoroutineScope jobInsertImagePicker = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permissionRequest = null;
    private final java.util.List<java.lang.String> permissions = null;
    public static final int LINES_TEXTVIEW_EXPANDED = 100;
    public static final int LINES_TEXTVIEW_COLLAPSE = 4;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.dialog.DialogCommentHotNews.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.CommentHotNewsViewModel getMViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.ShareViewModel getShareViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.HotNewsViewModel getHotNewsViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.MyPostViewModel getMyPostViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void loadControlsAndResize() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initView() {
    }
    
    private final void initMainActivity() {
    }
    
    private final boolean allPermissionsGranted() {
        return false;
    }
    
    private final void onPermissionGranted() {
    }
    
    private final void getPicturePaths() {
    }
    
    private final okhttp3.MultipartBody.Part prepareFilePart(java.lang.String partName, android.net.Uri fileUri) {
        return null;
    }
    
    private final java.lang.String getRealPathFromURI(android.net.Uri uri) {
        return null;
    }
    
    private final void initAdapter() {
    }
    
    private final void setDataToViewImage(brite.outdoor.data.entities.ImagePicker imagePick) {
    }
    
    private final void callApiListComment(java.lang.String idPost, java.lang.String lastestId, java.lang.String threadId, java.lang.String commentId) {
    }
    
    private final void observerListComment() {
    }
    
    private final void callApiDeleteComment(int idComment, int positionComment, int idPost) {
    }
    
    private final void observerDeleteComment() {
    }
    
    private final void callApiDeleteReplyComment(int idComment, int positionComment, int positionReplyComment, int idPost) {
    }
    
    private final void observerDeleteReplyComment() {
    }
    
    private final void callApiPostComment(java.lang.String idPost, java.lang.String content) {
    }
    
    private final void observerPostComment() {
    }
    
    private final void callApiListReplyAnswerQuestion(java.lang.String idPost, java.lang.String lastestId) {
    }
    
    private final void observerListReplyAnswerQuestion() {
    }
    
    private final void callApiPostReplyComment(java.lang.String idPost, java.lang.String content, java.lang.String threadId, java.lang.String replyId) {
    }
    
    private final void handlerPostComment() {
    }
    
    private final void handlerPostReplyComment(java.lang.String threadId, java.lang.String replyId) {
    }
    
    private final void eventLoadMore() {
    }
    
    private final void updateTotalResultWhenRemoveItem() {
    }
    
    private final void updateTotalResultWhenAddItem() {
    }
    
    private final void focusEdt() {
    }
    
    private final void showViewReply(brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNews entity, int positionComment) {
    }
    
    private final void initViewReply(brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNews entity, int positionComment) {
    }
    
    private final void clearEditText() {
    }
    
    private final void observerOpenKeyboard() {
    }
    
    private final void getHeightScreen() {
    }
    
    private final void showViewKeyBoard() {
    }
    
    private final void showDialogDeleteComment(int idComment, int positionComment, int idPost) {
    }
    
    private final void showDialogDeleteReplyComment(int idComment, int positionComment, int positionReplyComment, int idPost) {
    }
    
    private final void showLayoutComment() {
    }
    
    private final java.util.List<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNews> getDistinctComment(java.util.List<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNews> fisrtList, java.util.List<brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNews> secondList) {
        return null;
    }
    
    private final brite.outdoor.data.api_entities.response.ResponseListCommentHotNews.CommentHotNewsReply getItemReplyComment(brite.outdoor.data.api_entities.response.ResponsePostCommentHotNews.PostCommentHotNewsResponse item) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public DialogCommentHotNews() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lbrite/outdoor/ui/dialog/DialogCommentHotNews$Companion;", "", "()V", "LINES_TEXTVIEW_COLLAPSE", "", "LINES_TEXTVIEW_EXPANDED", "getInstance", "Lbrite/outdoor/ui/dialog/DialogCommentHotNews;", "mapData", "Ljava/util/HashMap;", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.ui.dialog.DialogCommentHotNews getInstance(@org.jetbrains.annotations.Nullable()
        java.util.HashMap<java.lang.String, java.lang.Object> mapData) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}