package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001cB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u000eJ\u001e\u0010Y\u001a\u00020W2\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020&2\u0006\u0010L\u001a\u00020MJ\u0016\u0010[\u001a\u00020W2\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020MJJ\u0010\\\u001a\u00020W2\"\u0010]\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0013j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u00142\u0016\u0010^\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00182\u0006\u0010X\u001a\u00020\u000eJB\u0010_\u001a\u00020W2\"\u0010_\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0013j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u00142\u0016\u0010^\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018J\u0006\u0010`\u001a\u00020WJ\u0016\u0010a\u001a\u00020W2\u0006\u0010b\u001a\u00020M2\u0006\u0010L\u001a\u00020MR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0011\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0013j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u001a\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0013j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\'\"\u0004\b(\u0010)R \u0010*\u001a\b\u0012\u0004\u0012\u00020&0+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00160\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u00107R(\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00160\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u00107R.\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00101\"\u0004\b=\u00103R\"\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u00107R \u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001e\"\u0004\bE\u00107R \u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u00107R\u001d\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010$R\u001a\u0010L\u001a\u00020MX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u001e\"\u0004\bU\u00107\u00a8\u0006d"}, d2 = {"Lbrite/outdoor/viewmodel/PushPostViewModel;", "Landroidx/lifecycle/ViewModel;", "appRepository", "Lbrite/outdoor/data/repository/AppRepository;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "gson", "Lcom/google/gson/Gson;", "(Lbrite/outdoor/data/repository/AppRepository;Lbrite/outdoor/data/remote/ApiController;Lcom/google/gson/Gson;)V", "_editPostResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseEditPost$EditPostResult;", "_id", "", "_pushPostResult", "Lbrite/outdoor/data/api_entities/response/ResponsePushPosts$PushPostResult;", "_requestEditPost", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_requestListImg", "Ljava/util/ArrayList;", "Lokhttp3/MultipartBody$Part;", "Lkotlin/collections/ArrayList;", "_requestListImgEdit", "_requestPushPost", "actionState", "Lbrite/outdoor/viewmodel/PushPostViewModel$STATE;", "getActionState", "()Landroidx/lifecycle/MutableLiveData;", "contentSelected", "Lbrite/outdoor/data/entities/PostContentEntity;", "getContentSelected", "editPostResult", "getEditPostResult", "()Landroidx/lifecycle/LiveData;", "isEditPost", "", "()Z", "setEditPost", "(Z)V", "isHaveLocalData", "Lbrite/outdoor/utils/SingleLiveEvent;", "()Lbrite/outdoor/utils/SingleLiveEvent;", "setHaveLocalData", "(Lbrite/outdoor/utils/SingleLiveEvent;)V", "listDelete", "getListDelete", "()Ljava/util/ArrayList;", "setListDelete", "(Ljava/util/ArrayList;)V", "listImgDelete", "getListImgDelete", "setListImgDelete", "(Landroidx/lifecycle/MutableLiveData;)V", "listImgEdit", "getListImgEdit", "setListImgEdit", "listNameImage", "getListNameImage", "setListNameImage", "location", "Lbrite/outdoor/data/entities/LocationEntity;", "getLocation", "setLocation", "postContentPlace", "Lbrite/outdoor/data/entities/SelectPlace;", "getPostContentPlace", "setPostContentPlace", "postContentUtensils", "Lbrite/outdoor/data/entities/SelectUtensils;", "getPostContentUtensils", "setPostContentUtensils", "pushPostResult", "getPushPostResult", "typePost", "", "getTypePost", "()I", "setTypePost", "(I)V", "urlAvatar", "Lbrite/outdoor/data/entities/ImagePicker;", "getUrlAvatar", "setUrlAvatar", "createNewPost", "", "id", "deletePost", "isNeedBackPrev", "getPostContentInDB", "requestEdtPost", "requestEditPost", "requestListImg", "requestPushPost", "savePost", "setContentSelected", "position", "STATE", "app_debug"})
public final class PushPostViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.LocationEntity> location;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.ImagePicker> urlAvatar;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> listNameImage;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> listDelete;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> listImgDelete;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> listImgEdit;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.SelectPlace> postContentPlace;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.SelectUtensils> postContentUtensils;
    @org.jetbrains.annotations.NotNull()
    private brite.outdoor.utils.SingleLiveEvent<java.lang.Boolean> isHaveLocalData;
    private boolean isEditPost = false;
    private int typePost = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.PostContentEntity> contentSelected = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.PushPostViewModel.STATE> actionState = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestPushPost = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<okhttp3.MultipartBody.Part>> _requestListImg = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponsePushPosts.PushPostResult>> _pushPostResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponsePushPosts.PushPostResult>> pushPostResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestEditPost = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<okhttp3.MultipartBody.Part>> _requestListImgEdit = null;
    private java.lang.String _id = "";
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseEditPost.EditPostResult>> _editPostResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseEditPost.EditPostResult>> editPostResult = null;
    private final brite.outdoor.data.repository.AppRepository appRepository = null;
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.LocationEntity> getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.LocationEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.ImagePicker> getUrlAvatar() {
        return null;
    }
    
    public final void setUrlAvatar(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.ImagePicker> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getListNameImage() {
        return null;
    }
    
    public final void setListNameImage(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getListDelete() {
        return null;
    }
    
    public final void setListDelete(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getListImgDelete() {
        return null;
    }
    
    public final void setListImgDelete(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> getListImgEdit() {
        return null;
    }
    
    public final void setListImgEdit(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.entities.PostContentEntity>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.SelectPlace> getPostContentPlace() {
        return null;
    }
    
    public final void setPostContentPlace(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.SelectPlace> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.SelectUtensils> getPostContentUtensils() {
        return null;
    }
    
    public final void setPostContentUtensils(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.SelectUtensils> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final brite.outdoor.utils.SingleLiveEvent<java.lang.Boolean> isHaveLocalData() {
        return null;
    }
    
    public final void setHaveLocalData(@org.jetbrains.annotations.NotNull()
    brite.outdoor.utils.SingleLiveEvent<java.lang.Boolean> p0) {
    }
    
    public final boolean isEditPost() {
        return false;
    }
    
    public final void setEditPost(boolean p0) {
    }
    
    public final int getTypePost() {
        return 0;
    }
    
    public final void setTypePost(int p0) {
    }
    
    public final void getPostContentInDB(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int typePost) {
    }
    
    public final void createNewPost(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void savePost() {
    }
    
    public final void deletePost(@org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean isNeedBackPrev, int typePost) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.PostContentEntity> getContentSelected() {
        return null;
    }
    
    public final void setContentSelected(int position, int typePost) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.PushPostViewModel.STATE> getActionState() {
        return null;
    }
    
    public final void requestPushPost(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestPushPost, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<okhttp3.MultipartBody.Part> requestListImg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponsePushPosts.PushPostResult>> getPushPostResult() {
        return null;
    }
    
    public final void requestEdtPost(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestEditPost, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<okhttp3.MultipartBody.Part> requestListImg, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseEditPost.EditPostResult>> getEditPostResult() {
        return null;
    }
    
    @javax.inject.Inject()
    public PushPostViewModel(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.repository.AppRepository appRepository, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lbrite/outdoor/viewmodel/PushPostViewModel$STATE;", "", "(Ljava/lang/String;I)V", "NOTHING", "NOTIFY_DATA", "SAVED", "DELETED", "app_debug"})
    public static enum STATE {
        /*public static final*/ NOTHING /* = new NOTHING() */,
        /*public static final*/ NOTIFY_DATA /* = new NOTIFY_DATA() */,
        /*public static final*/ SAVED /* = new SAVED() */,
        /*public static final*/ DELETED /* = new DELETED() */;
        
        STATE() {
        }
    }
}