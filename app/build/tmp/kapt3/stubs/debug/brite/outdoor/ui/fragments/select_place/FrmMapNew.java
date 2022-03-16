package brite.outdoor.ui.fragments.select_place;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001bB\u001b\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\b\u0010;\u001a\u00020\u0007H\u0002J\u001a\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010>\u001a\u00020\u0007H\u0002J\b\u0010?\u001a\u00020\'H\u0016J\b\u0010@\u001a\u00020\u0007H\u0002J\b\u0010A\u001a\u00020\u0007H\u0002J\u0012\u0010B\u001a\u00020\u00072\b\u0010C\u001a\u0004\u0018\u00010DH\u0014J$\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u001b2\b\u0010H\u001a\u0004\u0018\u00010\u001b2\b\u0010I\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010J\u001a\u00020FH\u0002J\b\u0010K\u001a\u00020\u0007H\u0002J\u0012\u0010L\u001a\u00020\u00072\b\u0010M\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010N\u001a\u00020\u0007H\u0002J\b\u0010O\u001a\u00020\u0007H\u0002J\b\u0010P\u001a\u00020\u0007H\u0002J\b\u0010Q\u001a\u00020\u0007H\u0002J\b\u0010R\u001a\u00020\u0007H\u0002J\u0012\u0010S\u001a\u00020\u00072\b\u0010T\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010U\u001a\u00020\u0007H\u0003J\u0010\u0010V\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u001bH\u0002J\u0010\u0010X\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u0006H\u0002J\u001a\u0010Z\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^H\u0014J\b\u0010_\u001a\u00020\u0007H\u0002J\u0006\u0010`\u001a\u00020\u0007J\u0006\u0010a\u001a\u00020\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\u0010\u001a\u0004\b2\u00103R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010\u0010\u001a\u0004\b7\u00108R\u000e\u0010:\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006c"}, d2 = {"Lbrite/outdoor/ui/fragments/select_place/FrmMapNew;", "Lbrite/outdoor/ui/fragments/BaseDialogFragment;", "Lbrite/outdoor/databinding/FrmMapNewBinding;", "Landroid/view/View$OnClickListener;", "onShowPushPost", "Lkotlin/Function1;", "Lbrite/outdoor/data/entities/LocationEntity;", "", "(Lkotlin/jvm/functions/Function1;)V", "adapterSearch", "Lbrite/outdoor/adapter/AdapterSearchLocation;", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "behavior", "Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior;", "Landroid/view/View;", "callback", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "initMapPosition", "Lcom/google/android/gms/maps/model/LatLng;", "isFirstSearchGoogleMap", "", "keySearch", "", "lastestId", "listNameCommune", "Ljava/util/ArrayList;", "listNameDistrict", "listNameProvince", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "midLatLng", "numberPage", "", "getNumberPage", "()I", "setNumberPage", "(I)V", "getOnShowPushPost", "()Lkotlin/jvm/functions/Function1;", "saveListLocation", "Lbrite/outdoor/data/local/room/SaveListLocationLocal;", "searchViewModel", "Lbrite/outdoor/viewmodel/SearchViewModel;", "getSearchViewModel", "()Lbrite/outdoor/viewmodel/SearchViewModel;", "searchViewModel$delegate", "selectPlaceViewModel", "Lbrite/outdoor/viewmodel/SelectPlaceViewModel;", "getSelectPlaceViewModel", "()Lbrite/outdoor/viewmodel/SelectPlaceViewModel;", "selectPlaceViewModel$delegate", "total", "callApiListCadastral", "callApiSearch", "key", "eventLoadMore", "getTheme", "initAdapter", "initBottomSheet", "initView", "savedInstanceState", "Landroid/os/Bundle;", "itemSearchGoogleMap", "Lbrite/outdoor/data/api_entities/response/ResponseSearchLocations$SearchLocationData;", "name", "lat", "lng", "itemSearchGoogleMapNotFound", "listenerSearchView", "loadControlsAndResize", "binding", "observerListCadastral", "observerListSpinnerCommune", "observerListSpinnerDistrict", "observerListSpinnerProvince", "observerSearchLocation", "onClick", "v", "searchClick", "searchPlace", "keySeach", "sendDataToPushPostNew", "locationEntity", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showDataLocationToListLocal", "startShimmerLayout", "stopShimmerLayout", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmMapNew extends brite.outdoor.ui.fragments.BaseDialogFragment<brite.outdoor.databinding.FrmMapNewBinding> implements android.view.View.OnClickListener {
    private com.google.android.gms.maps.model.LatLng midLatLng;
    private com.google.android.gms.maps.SupportMapFragment mapFragment;
    private final kotlin.Lazy authViewModel$delegate = null;
    private brite.outdoor.data.local.room.SaveListLocationLocal saveListLocation;
    private final kotlin.Lazy selectPlaceViewModel$delegate = null;
    private final kotlin.Lazy searchViewModel$delegate = null;
    private com.google.android.gms.maps.model.LatLng initMapPosition;
    private com.google.android.gms.maps.GoogleMap mMap;
    private brite.outdoor.adapter.AdapterSearchLocation adapterSearch;
    private int numberPage = 1;
    private int total = 0;
    private java.lang.String lastestId = "";
    private java.lang.String keySearch = "";
    private brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior<android.view.View> behavior;
    private boolean isFirstSearchGoogleMap = false;
    private final com.google.android.gms.maps.OnMapReadyCallback callback = null;
    private final java.util.ArrayList<java.lang.String> listNameCommune = null;
    private final java.util.ArrayList<java.lang.String> listNameProvince = null;
    private final java.util.ArrayList<java.lang.String> listNameDistrict = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<brite.outdoor.data.entities.LocationEntity, kotlin.Unit> onShowPushPost = null;
    public static final int SEARCH_GOOGLE_MAP = -1;
    public static final int SEARCH_GOOGLE_MAP_NOT_FOUND = -2;
    public static final int TYPE_SEARCH_LOCATION = 1;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.select_place.FrmMapNew.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.SelectPlaceViewModel getSelectPlaceViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.SearchViewModel getSearchViewModel() {
        return null;
    }
    
    public final int getNumberPage() {
        return 0;
    }
    
    public final void setNumberPage(int p0) {
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmMapNewBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmMapNewBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    private final void showDataLocationToListLocal() {
    }
    
    private final void initAdapter() {
    }
    
    private final void initBottomSheet() {
    }
    
    private final void searchPlace(java.lang.String keySeach) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void callApiSearch(java.lang.String key, java.lang.String lastestId) {
    }
    
    private final void observerSearchLocation() {
    }
    
    private final void listenerSearchView() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void searchClick() {
    }
    
    private final void eventLoadMore() {
    }
    
    private final brite.outdoor.data.api_entities.response.ResponseSearchLocations.SearchLocationData itemSearchGoogleMap(java.lang.String name, java.lang.String lat, java.lang.String lng) {
        return null;
    }
    
    private final brite.outdoor.data.api_entities.response.ResponseSearchLocations.SearchLocationData itemSearchGoogleMapNotFound() {
        return null;
    }
    
    private final void sendDataToPushPostNew(brite.outdoor.data.entities.LocationEntity locationEntity) {
    }
    
    public final void startShimmerLayout() {
    }
    
    public final void stopShimmerLayout() {
    }
    
    private final void callApiListCadastral() {
    }
    
    private final void observerListCadastral() {
    }
    
    private final void observerListSpinnerProvince() {
    }
    
    private final void observerListSpinnerDistrict() {
    }
    
    private final void observerListSpinnerCommune() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<brite.outdoor.data.entities.LocationEntity, kotlin.Unit> getOnShowPushPost() {
        return null;
    }
    
    public FrmMapNew(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super brite.outdoor.data.entities.LocationEntity, kotlin.Unit> onShowPushPost) {
        super();
    }
    
    public FrmMapNew() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lbrite/outdoor/ui/fragments/select_place/FrmMapNew$Companion;", "", "()V", "SEARCH_GOOGLE_MAP", "", "SEARCH_GOOGLE_MAP_NOT_FOUND", "TYPE_SEARCH_LOCATION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}