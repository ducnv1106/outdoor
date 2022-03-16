package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010#\u001a\u00020$2\"\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fJ\u000e\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0011J\u0017\u0010\u0018\u001a\u00020$2\b\u0010\'\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0002\b(R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006*"}, d2 = {"Lbrite/outdoor/viewmodel/HotNewsViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_listPostHotNewsResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseListPostHotNews$ListPostHotNewsResult;", "_requestListPostHotNews", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "actionState", "Lbrite/outdoor/viewmodel/HotNewsViewModel$STATE;", "getActionState", "()Landroidx/lifecycle/MutableLiveData;", "contentSelected", "Lbrite/outdoor/data/api_entities/response/ResponseListPostHotNews$HotNewsData;", "getContentSelected", "()Lbrite/outdoor/data/api_entities/response/ResponseListPostHotNews$HotNewsData;", "setContentSelected", "(Lbrite/outdoor/data/api_entities/response/ResponseListPostHotNews$HotNewsData;)V", "listPostHotNewsResult", "getListPostHotNewsResult", "()Landroidx/lifecycle/LiveData;", "positionSelected", "", "getPositionSelected", "()I", "setPositionSelected", "(I)V", "requestListPostHotNews", "", "setActionSate", "state", "content", "setContentSelected1", "STATE", "app_debug"})
public final class HotNewsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.data.api_entities.response.ResponseListPostHotNews.HotNewsData contentSelected;
    private int positionSelected = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.HotNewsViewModel.STATE> actionState = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListPostHotNews = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostHotNews.ListPostHotNewsResult>> _listPostHotNewsResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostHotNews.ListPostHotNewsResult>> listPostHotNewsResult = null;
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.data.api_entities.response.ResponseListPostHotNews.HotNewsData getContentSelected() {
        return null;
    }
    
    public final void setContentSelected(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.api_entities.response.ResponseListPostHotNews.HotNewsData p0) {
    }
    
    public final int getPositionSelected() {
        return 0;
    }
    
    public final void setPositionSelected(int p0) {
    }
    
    public final void setContentSelected1(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.api_entities.response.ResponseListPostHotNews.HotNewsData content) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.HotNewsViewModel.STATE> getActionState() {
        return null;
    }
    
    public final void setActionSate(@org.jetbrains.annotations.NotNull()
    brite.outdoor.viewmodel.HotNewsViewModel.STATE state) {
    }
    
    public final void requestListPostHotNews(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListPostHotNews) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListPostHotNews.ListPostHotNewsResult>> getListPostHotNewsResult() {
        return null;
    }
    
    @javax.inject.Inject()
    public HotNewsViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lbrite/outdoor/viewmodel/HotNewsViewModel$STATE;", "", "(Ljava/lang/String;I)V", "NOTHING", "NOTIFY_DATA", "DELETE", "POST_QUESTION", "EXECUTE_POST_QUESTION", "app_debug"})
    public static enum STATE {
        /*public static final*/ NOTHING /* = new NOTHING() */,
        /*public static final*/ NOTIFY_DATA /* = new NOTIFY_DATA() */,
        /*public static final*/ DELETE /* = new DELETE() */,
        /*public static final*/ POST_QUESTION /* = new POST_QUESTION() */,
        /*public static final*/ EXECUTE_POST_QUESTION /* = new EXECUTE_POST_QUESTION() */;
        
        STATE() {
        }
    }
}