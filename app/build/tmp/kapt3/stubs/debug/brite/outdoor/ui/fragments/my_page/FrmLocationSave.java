package brite.outdoor.ui.fragments.my_page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020%H\u0002J\b\u0010*\u001a\u00020%H\u0014J\b\u0010+\u001a\u00020(H\u0014J\b\u0010,\u001a\u00020%H\u0002J\b\u0010-\u001a\u00020%H\u0002J\b\u0010.\u001a\u00020%H\u0002J\u0010\u0010/\u001a\u00020%2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u00100\u001a\u00020%2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020#H\u0016J\b\u00104\u001a\u00020%H\u0002J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\nH\u0002J\b\u00108\u001a\u00020%H\u0002J\u0012\u00109\u001a\u00020%2\b\u0010:\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010;\u001a\u00020%H\u0002J\b\u0010<\u001a\u00020%H\u0002J\b\u0010=\u001a\u00020%H\u0002J\u0010\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020\u000eH\u0016J\u0010\u0010@\u001a\u00020#2\u0006\u0010?\u001a\u00020\u0012H\u0016J\b\u0010A\u001a\u00020%H\u0002J\u001a\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\u0010\u0010G\u001a\u00020%2\u0006\u0010?\u001a\u00020\u000eH\u0002J\u0010\u0010H\u001a\u00020%2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020%2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010L\u001a\u00020%2\u0006\u0010M\u001a\u00020#H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006N"}, d2 = {"Lbrite/outdoor/ui/fragments/my_page/FrmLocationSave;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmLocationSaveBinding;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "adapter", "Lbrite/outdoor/adapter/AdapterLocationSave;", "behavior", "Lbrite/outdoor/ui/widgets/anchorbottomsheet/AnchorBottomSheetBehavior;", "Landroid/view/View;", "initMapPosition", "Lcom/google/android/gms/maps/model/LatLng;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "markerPerth", "Lcom/google/android/gms/maps/model/Marker;", "midLatLng", "permissionRequest", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "kotlin.jvm.PlatformType", "permissions", "", "urlPrefix", "viewModel", "Lbrite/outdoor/viewmodel/LocationSaveViewModel;", "getViewModel", "()Lbrite/outdoor/viewmodel/LocationSaveViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "allPermissionsGranted", "", "backToPrevious", "", "callApiDelete", "id", "", "callApiListCamping", "finish", "getCurrentFragment", "goToFrmReminder", "initAdapter", "initBottomSheet", "initGoogleMap", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isBackPreviousEnable", "listenerSearchView", "loadBitmapFromView", "Landroid/graphics/Bitmap;", "v", "loadBitmapMap", "loadControlsAndResize", "binding", "observerCreateCamping", "observerDelete", "observerListCamping", "onMapReady", "p0", "onMarkerClick", "onPermissionGranted", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setMapStyle", "showBottomSheet", "entityLocationSave", "Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;", "showDialogConfirmDelete", "showOrHideFilter", "isShow", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmLocationSave extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmLocationSaveBinding> implements com.google.android.gms.maps.GoogleMap.OnMarkerClickListener, com.google.android.gms.maps.OnMapReadyCallback {
    private final kotlin.Lazy viewModel$delegate = null;
    private brite.outdoor.adapter.AdapterLocationSave adapter;
    private com.google.android.gms.maps.SupportMapFragment mapFragment;
    private com.google.android.gms.maps.model.LatLng initMapPosition;
    private com.google.android.gms.maps.model.LatLng midLatLng;
    private com.google.android.gms.maps.model.Marker markerPerth;
    private brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior<android.view.View> behavior;
    private com.google.android.gms.maps.GoogleMap mMap;
    private java.lang.String urlPrefix;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permissionRequest = null;
    private final java.util.List<java.lang.String> permissions = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.LocationSaveViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmLocationSaveBinding binding) {
    }
    
    private final boolean allPermissionsGranted() {
        return false;
    }
    
    private final void onPermissionGranted() {
    }
    
    private final void loadBitmapMap() {
    }
    
    private final android.graphics.Bitmap loadBitmapFromView(android.view.View v) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmLocationSaveBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    @java.lang.Override()
    public boolean isBackPreviousEnable() {
        return false;
    }
    
    @java.lang.Override()
    public void backToPrevious() {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker p0) {
        return false;
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    private final void showDialogConfirmDelete(brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData entityLocationSave) {
    }
    
    private final void callApiDelete(int id) {
    }
    
    private final void observerDelete() {
    }
    
    private final void initGoogleMap(com.google.android.gms.maps.GoogleMap mMap) {
    }
    
    private final void setMapStyle(com.google.android.gms.maps.GoogleMap p0) {
    }
    
    private final void showOrHideFilter(boolean isShow) {
    }
    
    private final void initAdapter() {
    }
    
    private final void initBottomSheet() {
    }
    
    private final void showBottomSheet(brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData entityLocationSave) {
    }
    
    private final void listenerSearchView() {
    }
    
    private final void goToFrmReminder() {
    }
    
    private final void callApiListCamping() {
    }
    
    private final void observerListCamping() {
    }
    
    private final void observerCreateCamping() {
    }
    
    public FrmLocationSave() {
        super();
    }
}