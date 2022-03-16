package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001=B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J2\u00103\u001a\u0002042\"\u00103\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0014j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u00152\u0006\u00105\u001a\u00020\tJ*\u00106\u001a\u0002042\"\u00106\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0014j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u0015J\u000e\u00107\u001a\u0002042\u0006\u00108\u001a\u00020\u0019J\u000e\u00109\u001a\u0002042\u0006\u0010\u001c\u001a\u00020\tJ\u000e\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020\u0012J\u000e\u0010<\u001a\u0002042\u0006\u0010\u001c\u001a\u00020\tR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0013\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0014j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u00150\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0016\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0014j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u00150\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\t0\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010&\"\u0004\b\'\u0010(R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120,\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001f\u0010/\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00120\u00120\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u001f\u00101\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\t0\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001f\u00a8\u0006>"}, d2 = {"Lbrite/outdoor/viewmodel/LocationSaveViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_address", "Landroidx/lifecycle/MutableLiveData;", "", "_deleteCampingResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseDeleteCamping$DeleteCampingResult;", "_idQuestion", "_listCampingResult", "Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingResult;", "_location", "Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;", "_requestDeleteCamping", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_requestListCamping", "_urlPrefix", "actionState", "Lbrite/outdoor/viewmodel/LocationSaveViewModel$STATE;", "getActionState", "()Landroidx/lifecycle/MutableLiveData;", "address", "kotlin.jvm.PlatformType", "getAddress", "()Landroidx/lifecycle/LiveData;", "deleteCampingResult", "getDeleteCampingResult", "entityLocation", "getEntityLocation", "isPermissionReadWriteExternalStorage", "", "()Z", "setPermissionReadWriteExternalStorage", "(Z)V", "listCampingResult", "getListCampingResult", "listLocation", "Ljava/util/ArrayList;", "getListLocation", "()Ljava/util/ArrayList;", "location", "getLocation", "urlPrefix", "getUrlPrefix", "requestDeleteCamping", "", "id", "requestListCamping", "setActionSate", "state", "setAddress", "setLocation", "entity", "setUrlPrefix", "STATE", "app_debug"})
public final class LocationSaveViewModel extends androidx.lifecycle.ViewModel {
    private boolean isPermissionReadWriteExternalStorage = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> listLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> entityLocation = null;
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> _location = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> location = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.LocationSaveViewModel.STATE> actionState = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListCamping = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingResult>> _listCampingResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingResult>> listCampingResult = null;
    private java.lang.String _idQuestion = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeleteCamping = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteCamping.DeleteCampingResult>> _deleteCampingResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteCamping.DeleteCampingResult>> deleteCampingResult = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _address = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> address = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _urlPrefix = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> urlPrefix = null;
    private final com.google.gson.Gson gson = null;
    
    public final boolean isPermissionReadWriteExternalStorage() {
        return false;
    }
    
    public final void setPermissionReadWriteExternalStorage(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> getListLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> getEntityLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData entity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.LocationSaveViewModel.STATE> getActionState() {
        return null;
    }
    
    public final void setActionSate(@org.jetbrains.annotations.NotNull()
    brite.outdoor.viewmodel.LocationSaveViewModel.STATE state) {
    }
    
    public final void requestListCamping(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListCamping) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingResult>> getListCampingResult() {
        return null;
    }
    
    public final void requestDeleteCamping(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDeleteCamping, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteCamping.DeleteCampingResult>> getDeleteCampingResult() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAddress() {
        return null;
    }
    
    public final void setUrlPrefix(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getUrlPrefix() {
        return null;
    }
    
    @javax.inject.Inject()
    public LocationSaveViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/viewmodel/LocationSaveViewModel$STATE;", "", "(Ljava/lang/String;I)V", "NOTHING", "NOTIFY_DATA", "app_debug"})
    public static enum STATE {
        /*public static final*/ NOTHING /* = new NOTHING() */,
        /*public static final*/ NOTIFY_DATA /* = new NOTIFY_DATA() */;
        
        STATE() {
        }
    }
}