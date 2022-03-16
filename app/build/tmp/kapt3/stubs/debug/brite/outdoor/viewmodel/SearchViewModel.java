package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001FB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010>\u001a\u00020?2\"\u0010@\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fJ*\u0010A\u001a\u00020?2\"\u0010A\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fJ*\u0010B\u001a\u00020?2\"\u0010B\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fJ*\u0010C\u001a\u00020?2\"\u0010C\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fJ\u000e\u0010D\u001a\u00020?2\u0006\u0010E\u001a\u00020\u0014R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0010\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0011\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0012\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010!\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010$R\u001f\u0010%\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\'\u0010&\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020(0\'j\b\u0012\u0004\u0012\u00020(`)0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\'\u0010+\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020,0\'j\b\u0012\u0004\u0012\u00020,`)0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\'\u0010.\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020/0\'j\b\u0012\u0004\u0012\u00020/`)0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\b\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u001d\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u001f\u00108\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u00140\u00140\f\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00103\u00a8\u0006G"}, d2 = {"Lbrite/outdoor/viewmodel/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_listCadastralResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseListCadastral$ListCadastralResult;", "_requestListCadastral", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "_requestSearchLocations", "_requestSearchUser", "_requestSearchUtensils", "_resultSearchType", "Lbrite/outdoor/viewmodel/SearchViewModel$SearchType;", "_searchLocationsResult", "Lbrite/outdoor/data/api_entities/response/ResponseSearchLocations$SearchLocationsResult;", "_searchUserResult", "Lbrite/outdoor/data/api_entities/response/ResponseSearchUser$SearchUserResult;", "_searchUtensilsResult", "Lbrite/outdoor/data/api_entities/response/ResponseSearchUtensils$SearchUtensilsResult;", "currentSearchType", "Lkotlin/Pair;", "getCurrentSearchType", "()Lkotlin/Pair;", "setCurrentSearchType", "(Lkotlin/Pair;)V", "isShowHideShimmerLayoutLocationOrTool", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "isShowHideShimmerLayoutUser", "listCadastralCommune", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseListCadastral$ListCadastralDataCommune;", "Lkotlin/collections/ArrayList;", "getListCadastralCommune", "listCadastralDistrict", "Lbrite/outdoor/data/api_entities/response/ResponseListCadastral$ListCadastralDataDistrict;", "getListCadastralDistrict", "listCadastralProvince", "Lbrite/outdoor/data/api_entities/response/ResponseListCadastral$ListCadastralDataProvince;", "getListCadastralProvince", "listCadastralResult", "getListCadastralResult", "()Landroidx/lifecycle/LiveData;", "resultSearchType", "getResultSearchType", "searchLocationsResult", "getSearchLocationsResult", "searchType", "getSearchType", "searchUserResult", "getSearchUserResult", "searchUtensilsResult", "getSearchUtensilsResult", "getListCadastral", "", "requestListCadastral", "requestSearchLocations", "requestSearchUser", "requestSearchUtensils", "setSearchType", "type", "SearchType", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.SearchViewModel.SearchType> searchType = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowHideShimmerLayoutUser = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowHideShimmerLayoutLocationOrTool = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.Pair<java.lang.String, ? extends brite.outdoor.viewmodel.SearchViewModel.SearchType> currentSearchType;
    private final androidx.lifecycle.LiveData<brite.outdoor.viewmodel.SearchViewModel.SearchType> _resultSearchType = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.viewmodel.SearchViewModel.SearchType> resultSearchType = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestSearchLocations = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseSearchLocations.SearchLocationsResult>> _searchLocationsResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseSearchLocations.SearchLocationsResult>> searchLocationsResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestSearchUtensils = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseSearchUtensils.SearchUtensilsResult>> _searchUtensilsResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseSearchUtensils.SearchUtensilsResult>> searchUtensilsResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestSearchUser = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseSearchUser.SearchUserResult>> _searchUserResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseSearchUser.SearchUserResult>> searchUserResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListCadastral = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListCadastral.ListCadastralResult>> _listCadastralResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListCadastral.ListCadastralResult>> listCadastralResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCadastral.ListCadastralDataProvince>> listCadastralProvince = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCadastral.ListCadastralDataDistrict>> listCadastralDistrict = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCadastral.ListCadastralDataCommune>> listCadastralCommune = null;
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.SearchViewModel.SearchType> getSearchType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowHideShimmerLayoutUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowHideShimmerLayoutLocationOrTool() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<java.lang.String, brite.outdoor.viewmodel.SearchViewModel.SearchType> getCurrentSearchType() {
        return null;
    }
    
    public final void setCurrentSearchType(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.String, ? extends brite.outdoor.viewmodel.SearchViewModel.SearchType> p0) {
    }
    
    public final void setSearchType(@org.jetbrains.annotations.NotNull()
    brite.outdoor.viewmodel.SearchViewModel.SearchType type) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.viewmodel.SearchViewModel.SearchType> getResultSearchType() {
        return null;
    }
    
    public final void requestSearchLocations(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestSearchLocations) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseSearchLocations.SearchLocationsResult>> getSearchLocationsResult() {
        return null;
    }
    
    public final void requestSearchUtensils(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestSearchUtensils) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseSearchUtensils.SearchUtensilsResult>> getSearchUtensilsResult() {
        return null;
    }
    
    public final void requestSearchUser(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestSearchUser) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseSearchUser.SearchUserResult>> getSearchUserResult() {
        return null;
    }
    
    public final void getListCadastral(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListCadastral) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListCadastral.ListCadastralResult>> getListCadastralResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCadastral.ListCadastralDataProvince>> getListCadastralProvince() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCadastral.ListCadastralDataDistrict>> getListCadastralDistrict() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListCadastral.ListCadastralDataCommune>> getListCadastralCommune() {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lbrite/outdoor/viewmodel/SearchViewModel$SearchType;", "", "(Ljava/lang/String;I)V", "LOCATE", "TOOL", "USER", "CONSUMED", "app_debug"})
    public static enum SearchType {
        /*public static final*/ LOCATE /* = new LOCATE() */,
        /*public static final*/ TOOL /* = new TOOL() */,
        /*public static final*/ USER /* = new USER() */,
        /*public static final*/ CONSUMED /* = new CONSUMED() */;
        
        SearchType() {
        }
    }
}