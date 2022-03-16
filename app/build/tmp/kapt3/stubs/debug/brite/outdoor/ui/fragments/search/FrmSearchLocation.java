package brite.outdoor.ui.fragments.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002J \u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\nj\b\u0012\u0004\u0012\u00020\u001e`\u001f2\u0006\u0010 \u001a\u00020\u0007H\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0014J\b\u0010#\u001a\u00020\rH\u0014J\u0012\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010\'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u001cH\u0002J\u0012\u0010)\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010+\u001a\u00020\u001cH\u0002J\u0006\u0010,\u001a\u00020\u001cJ\b\u0010-\u001a\u00020\u001cH\u0003J\u001a\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020\u001cH\u0002J\u0006\u00104\u001a\u00020\u001cR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lbrite/outdoor/ui/fragments/search/FrmSearchLocation;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmSearchLocationBinding;", "()V", "adapterSearch", "Lbrite/outdoor/adapter/AdapterSearchWith;", "key", "", "lastestId", "listLocations", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/ObjectSearch$ResultSearchEntity;", "numberPage", "", "getNumberPage", "()I", "setNumberPage", "(I)V", "saveListLocation", "Lbrite/outdoor/data/local/room/SaveListLocationLocal;", "searchViewModel", "Lbrite/outdoor/viewmodel/SearchViewModel;", "getSearchViewModel", "()Lbrite/outdoor/viewmodel/SearchViewModel;", "searchViewModel$delegate", "Lkotlin/Lazy;", "total", "callApiSearch", "", "convertJsonToList", "Lbrite/outdoor/data/api_entities/response/ResponseListLocation$LocationData;", "Lkotlin/collections/ArrayList;", "source", "eventLoadMore", "finish", "getCurrentFragment", "initView", "savedInstanceState", "Landroid/os/Bundle;", "listenerItemClicked", "listenerSearchView", "loadControlsAndResize", "binding", "observerSearchLocation", "onRefreshData", "searchClick", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showDataLocationToList", "updateUIAfterChangeLanguage", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmSearchLocation extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmSearchLocationBinding> {
    private brite.outdoor.data.local.room.SaveListLocationLocal saveListLocation;
    private final java.util.ArrayList<brite.outdoor.data.entities.ObjectSearch.ResultSearchEntity> listLocations = null;
    private final kotlin.Lazy searchViewModel$delegate = null;
    private brite.outdoor.adapter.AdapterSearchWith adapterSearch;
    private int numberPage = 1;
    private java.lang.String key = "";
    private java.lang.String lastestId = "";
    private int total = 0;
    public static final int FRM_SEARCH_LOCATION = 1;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.search.FrmSearchLocation.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
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
    brite.outdoor.databinding.FrmSearchLocationBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmSearchLocationBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void callApiSearch(java.lang.String key, java.lang.String lastestId) {
    }
    
    private final void observerSearchLocation() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void searchClick() {
    }
    
    private final void showDataLocationToList() {
    }
    
    public final void onRefreshData() {
    }
    
    private final void listenerSearchView() {
    }
    
    private final void listenerItemClicked() {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    private final void eventLoadMore() {
    }
    
    private final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> convertJsonToList(java.lang.String source) {
        return null;
    }
    
    public final void updateUIAfterChangeLanguage() {
    }
    
    public FrmSearchLocation() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/ui/fragments/search/FrmSearchLocation$Companion;", "", "()V", "FRM_SEARCH_LOCATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}