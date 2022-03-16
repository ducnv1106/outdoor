package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010^\u001a\u00020%J\u0006\u0010_\u001a\u00020%J2\u0010`\u001a\u00020a2\"\u0010`\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0017j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`\u00182\u0006\u0010b\u001a\u00020\u0014J*\u0010c\u001a\u00020a2\"\u0010c\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0017j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`\u0018J*\u0010d\u001a\u00020a2\"\u0010d\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0017j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`\u0018J*\u0010e\u001a\u00020a2\"\u0010e\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0017j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`\u0018J\u000e\u0010f\u001a\u00020a2\u0006\u0010g\u001a\u000202J\u0006\u0010h\u001a\u00020aJ\u0006\u0010i\u001a\u00020aJ\u0006\u0010j\u001a\u00020aJ\u0006\u0010k\u001a\u00020aR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010\u0015\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0017j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`\u00180\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0019\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0017j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`\u00180\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u001a\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0017j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`\u00180\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u001b\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0017j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`\u00180\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001a\u0010+\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001a\u0010-\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001a\u0010/\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u001a\u00104\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0012R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020D0?\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010BR\u001d\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0012R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u0002020I\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u0002020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010!R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u0002020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010!R\u001a\u0010P\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010R\"\u0004\bW\u0010TR\u001a\u0010X\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010R\"\u0004\bZ\u0010TR\u001a\u0010[\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010R\"\u0004\b]\u0010T\u00a8\u0006l"}, d2 = {"Lbrite/outdoor/viewmodel/MyPageViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_deletePostResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseDetailPost$DetailPostResult;", "_detailUserResult", "Lbrite/outdoor/data/api_entities/response/ResponseDetail$DetailResult;", "_listBookMarkResult", "Lbrite/outdoor/data/api_entities/response/ResponseListBookMark$ListBookMarkResult;", "_listPostUserResult", "Lbrite/outdoor/data/api_entities/response/ResponseListPostUser$ListPostUserResult;", "get_listPostUserResult", "()Landroidx/lifecycle/LiveData;", "_postId", "", "_requestDeletePost", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_requestDetailUser", "_requestListBookMark", "_requestListPostUser", "deletePostResult", "getDeletePostResult", "detailUser", "Lbrite/outdoor/data/api_entities/response/ResponseDetail$DetailResponse;", "getDetailUser", "()Landroidx/lifecycle/MutableLiveData;", "detailUserResult", "getDetailUserResult", "isCallingApiGetListMyBookmark", "", "()Z", "setCallingApiGetListMyBookmark", "(Z)V", "isCallingApiGetListMyPost", "setCallingApiGetListMyPost", "isExpanded", "setExpanded", "isLoadMoreMyBookMark", "setLoadMoreMyBookMark", "isLoadMoreMyPost", "setLoadMoreMyPost", "itemPosition", "", "getItemPosition", "lastestId", "getLastestId", "()Ljava/lang/String;", "setLastestId", "(Ljava/lang/String;)V", "lastestIdBookmark", "getLastestIdBookmark", "setLastestIdBookmark", "listBookMarkResult", "getListBookMarkResult", "listMyBookmark", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseListBookMark$ListBookMarkData;", "getListMyBookmark", "()Ljava/util/ArrayList;", "listMyPost", "Lbrite/outdoor/data/api_entities/response/ListPostUserData;", "getListMyPost", "listPostUserResult", "getListPostUserResult", "numberLike", "Lbrite/outdoor/utils/SingleLiveEvent;", "getNumberLike", "()Lbrite/outdoor/utils/SingleLiveEvent;", "pageNumberMyBookmark", "getPageNumberMyBookmark", "pageNumberMyPost", "getPageNumberMyPost", "tmpPageNumberMyBookmark", "getTmpPageNumberMyBookmark", "()I", "setTmpPageNumberMyBookmark", "(I)V", "tmpPageNumberMyPost", "getTmpPageNumberMyPost", "setTmpPageNumberMyPost", "totalMyBookmark", "getTotalMyBookmark", "setTotalMyBookmark", "totalMyPost", "getTotalMyPost", "setTotalMyPost", "isNeedGetListMyBookmark", "isNeedGetListMyPost", "requestDeletePost", "", "postId", "requestDetailUser", "requestListBookMark", "requestListPostUser", "setNumberLike", "count", "syncPageNumberMyBookmark", "syncPageNumberMyBookmarkFailed", "syncPageNumberMyPost", "syncPageNumberMyPostFailed", "app_debug"})
public final class MyPageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.response.ResponseDetail.DetailResponse> detailUser = null;
    private boolean isExpanded = true;
    private boolean isLoadMoreMyPost = false;
    private boolean isLoadMoreMyBookMark = false;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDetailUser = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetail.DetailResult>> _detailUserResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetail.DetailResult>> detailUserResult = null;
    @org.jetbrains.annotations.NotNull()
    private final brite.outdoor.utils.SingleLiveEvent<java.lang.Integer> numberLike = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<brite.outdoor.data.api_entities.response.ListPostUserData> listMyPost = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> pageNumberMyPost = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastestId = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastestIdBookmark = "";
    private int tmpPageNumberMyPost = 0;
    private int totalMyPost = 0;
    private boolean isCallingApiGetListMyPost = false;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListPostUser = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> _listPostUserResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> listPostUserResult = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListBookMark.ListBookMarkData> listMyBookmark = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> pageNumberMyBookmark = null;
    private int tmpPageNumberMyBookmark = 0;
    private int totalMyBookmark = 0;
    private boolean isCallingApiGetListMyBookmark = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> itemPosition = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListBookMark = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListBookMark.ListBookMarkResult>> _listBookMarkResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListBookMark.ListBookMarkResult>> listBookMarkResult = null;
    private java.lang.String _postId = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeletePost = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> _deletePostResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> deletePostResult = null;
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.response.ResponseDetail.DetailResponse> getDetailUser() {
        return null;
    }
    
    public final boolean isExpanded() {
        return false;
    }
    
    public final void setExpanded(boolean p0) {
    }
    
    public final boolean isLoadMoreMyPost() {
        return false;
    }
    
    public final void setLoadMoreMyPost(boolean p0) {
    }
    
    public final boolean isLoadMoreMyBookMark() {
        return false;
    }
    
    public final void setLoadMoreMyBookMark(boolean p0) {
    }
    
    public final void requestDetailUser(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDetailUser) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetail.DetailResult>> getDetailUserResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.utils.SingleLiveEvent<java.lang.Integer> getNumberLike() {
        return null;
    }
    
    public final void setNumberLike(int count) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ListPostUserData> getListMyPost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getPageNumberMyPost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastestId() {
        return null;
    }
    
    public final void setLastestId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastestIdBookmark() {
        return null;
    }
    
    public final void setLastestIdBookmark(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTmpPageNumberMyPost() {
        return 0;
    }
    
    public final void setTmpPageNumberMyPost(int p0) {
    }
    
    public final int getTotalMyPost() {
        return 0;
    }
    
    public final void setTotalMyPost(int p0) {
    }
    
    public final boolean isCallingApiGetListMyPost() {
        return false;
    }
    
    public final void setCallingApiGetListMyPost(boolean p0) {
    }
    
    public final boolean isNeedGetListMyPost() {
        return false;
    }
    
    public final void syncPageNumberMyPost() {
    }
    
    public final void syncPageNumberMyPostFailed() {
    }
    
    public final void requestListPostUser(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListPostUser) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> get_listPostUserResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostUser.ListPostUserResult>> getListPostUserResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListBookMark.ListBookMarkData> getListMyBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getPageNumberMyBookmark() {
        return null;
    }
    
    public final int getTmpPageNumberMyBookmark() {
        return 0;
    }
    
    public final void setTmpPageNumberMyBookmark(int p0) {
    }
    
    public final int getTotalMyBookmark() {
        return 0;
    }
    
    public final void setTotalMyBookmark(int p0) {
    }
    
    public final boolean isCallingApiGetListMyBookmark() {
        return false;
    }
    
    public final void setCallingApiGetListMyBookmark(boolean p0) {
    }
    
    public final boolean isNeedGetListMyBookmark() {
        return false;
    }
    
    public final void syncPageNumberMyBookmark() {
    }
    
    public final void syncPageNumberMyBookmarkFailed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getItemPosition() {
        return null;
    }
    
    public final void requestListBookMark(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListBookMark) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListBookMark.ListBookMarkResult>> getListBookMarkResult() {
        return null;
    }
    
    public final void requestDeletePost(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDeletePost, @org.jetbrains.annotations.NotNull()
    java.lang.String postId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailPost.DetailPostResult>> getDeletePostResult() {
        return null;
    }
    
    @javax.inject.Inject()
    public MyPageViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
}