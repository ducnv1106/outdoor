package brite.outdoor.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020+J$\u0010-\u001a\u00020+\"\u0004\b\u0000\u0010.2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H.002\b\b\u0002\u00101\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR(\u0010\u0012\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR(\u0010\u0016\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR(\u0010\u0018\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR(\u0010\u001a\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR(\u0010\u001c\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR(\u0010\u001e\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\rR\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R \u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u000f\u00a8\u00062"}, d2 = {"Lbrite/outdoor/viewmodel/ShareViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "editPost", "Lbrite/outdoor/data/api_entities/response/ResponseEditPost$EditPostResponse;", "getEditPost", "()Lbrite/outdoor/data/api_entities/response/ResponseEditPost$EditPostResponse;", "setEditPost", "(Lbrite/outdoor/data/api_entities/response/ResponseEditPost$EditPostResponse;)V", "isNeedRefreshPostDataInMyBookmark", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "setNeedRefreshPostDataInMyBookmark", "(Landroidx/lifecycle/MutableLiveData;)V", "isNeedRefreshPostDataInMyHome", "setNeedRefreshPostDataInMyHome", "isNeedRefreshPostDataInMyPage", "setNeedRefreshPostDataInMyPage", "isNeedShowErr", "Lbrite/outdoor/data/api_entities/ApiNoticeEntity;", "isNeedUpdateDataWhenEditPostInHome_Hot", "setNeedUpdateDataWhenEditPostInHome_Hot", "isNeedUpdateDataWhenEditPostInHome_News", "setNeedUpdateDataWhenEditPostInHome_News", "isNeedUpdateDataWhenEditPostInListLocation", "setNeedUpdateDataWhenEditPostInListLocation", "isNeedUpdateDataWhenEditPostInMyBookMark", "setNeedUpdateDataWhenEditPostInMyBookMark", "isNeedUpdateDataWhenEditPostInMyPost", "setNeedUpdateDataWhenEditPostInMyPost", "isShowLoading", "listIdFollow", "Ljava/util/HashMap;", "", "getListIdFollow", "()Ljava/util/HashMap;", "syncComment", "Lbrite/outdoor/data/entities/CommentEntity;", "getSyncComment", "setSyncComment", "setNeedRefreshEditDataAllScreen", "", "setNeedRefreshPostDataAllScreen", "showOrHideLoading", "T", "result", "Lbrite/outdoor/data/remote/ApiResult;", "isNeedShowLoading", "app_debug"})
public final class ShareViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedRefreshPostDataInMyPage;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedRefreshPostDataInMyBookmark;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedUpdateDataWhenEditPostInHome_Hot;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedUpdateDataWhenEditPostInHome_News;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedUpdateDataWhenEditPostInMyPost;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedUpdateDataWhenEditPostInMyBookMark;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedUpdateDataWhenEditPostInListLocation;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedRefreshPostDataInMyHome;
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.data.api_entities.response.ResponseEditPost.EditPostResponse editPost;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<java.lang.Integer, java.lang.Integer> listIdFollow = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.CommentEntity> syncComment;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.ApiNoticeEntity> isNeedShowErr = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowLoading = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedRefreshPostDataInMyPage() {
        return null;
    }
    
    public final void setNeedRefreshPostDataInMyPage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedRefreshPostDataInMyBookmark() {
        return null;
    }
    
    public final void setNeedRefreshPostDataInMyBookmark(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedUpdateDataWhenEditPostInHome_Hot() {
        return null;
    }
    
    public final void setNeedUpdateDataWhenEditPostInHome_Hot(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedUpdateDataWhenEditPostInHome_News() {
        return null;
    }
    
    public final void setNeedUpdateDataWhenEditPostInHome_News(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedUpdateDataWhenEditPostInMyPost() {
        return null;
    }
    
    public final void setNeedUpdateDataWhenEditPostInMyPost(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedUpdateDataWhenEditPostInMyBookMark() {
        return null;
    }
    
    public final void setNeedUpdateDataWhenEditPostInMyBookMark(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedUpdateDataWhenEditPostInListLocation() {
        return null;
    }
    
    public final void setNeedUpdateDataWhenEditPostInListLocation(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedRefreshPostDataInMyHome() {
        return null;
    }
    
    public final void setNeedRefreshPostDataInMyHome(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void setNeedRefreshPostDataAllScreen() {
    }
    
    public final void setNeedRefreshEditDataAllScreen() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.data.api_entities.response.ResponseEditPost.EditPostResponse getEditPost() {
        return null;
    }
    
    public final void setEditPost(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.api_entities.response.ResponseEditPost.EditPostResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.Integer, java.lang.Integer> getListIdFollow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.CommentEntity> getSyncComment() {
        return null;
    }
    
    public final void setSyncComment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.CommentEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.ApiNoticeEntity> isNeedShowErr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowLoading() {
        return null;
    }
    
    public final <T extends java.lang.Object>void showOrHideLoading(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiResult<? extends T> result, boolean isNeedShowLoading) {
    }
    
    public ShareViewModel() {
        super();
    }
}