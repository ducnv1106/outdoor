package brite.outdoor.ui.fragments.select_place;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0007H\u0003J\b\u0010#\u001a\u00020\u0007H\u0002J\u001a\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006)"}, d2 = {"Lbrite/outdoor/ui/fragments/select_place/FrmMap;", "Lbrite/outdoor/ui/fragments/BaseDialogFragment;", "Lbrite/outdoor/databinding/FrmMapBinding;", "Landroid/view/View$OnClickListener;", "onShowPushPost", "Lkotlin/Function1;", "Lbrite/outdoor/data/entities/LocationEntity;", "", "(Lkotlin/jvm/functions/Function1;)V", "callback", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "initMapPosition", "Lcom/google/android/gms/maps/model/LatLng;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "midLatLng", "getOnShowPushPost", "()Lkotlin/jvm/functions/Function1;", "selectPlaceViewModel", "Lbrite/outdoor/viewmodel/SelectPlaceViewModel;", "getSelectPlaceViewModel", "()Lbrite/outdoor/viewmodel/SelectPlaceViewModel;", "selectPlaceViewModel$delegate", "Lkotlin/Lazy;", "initView", "savedInstanceState", "Landroid/os/Bundle;", "loadControlsAndResize", "binding", "onClick", "v", "Landroid/view/View;", "searchClick", "searchPlace", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmMap extends brite.outdoor.ui.fragments.BaseDialogFragment<brite.outdoor.databinding.FrmMapBinding> implements android.view.View.OnClickListener {
    private com.google.android.gms.maps.model.LatLng midLatLng;
    private com.google.android.gms.maps.SupportMapFragment mapFragment;
    private final kotlin.Lazy selectPlaceViewModel$delegate = null;
    private com.google.android.gms.maps.model.LatLng initMapPosition;
    private com.google.android.gms.maps.GoogleMap mMap;
    private final com.google.android.gms.maps.OnMapReadyCallback callback = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<brite.outdoor.data.entities.LocationEntity, kotlin.Unit> onShowPushPost = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.SelectPlaceViewModel getSelectPlaceViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmMapBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmMapBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void searchPlace() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void searchClick() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<brite.outdoor.data.entities.LocationEntity, kotlin.Unit> getOnShowPushPost() {
        return null;
    }
    
    public FrmMap(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super brite.outdoor.data.entities.LocationEntity, kotlin.Unit> onShowPushPost) {
        super();
    }
    
    public FrmMap() {
        super();
    }
}