package brite.outdoor.ui.fragments.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002J \u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\nj\b\u0012\u0004\u0012\u00020!`\"2\u0006\u0010#\u001a\u00020\u0007H\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0014J\b\u0010&\u001a\u00020\u000eH\u0014J\u0012\u0010\'\u001a\u00020\u001f2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\u0012\u0010,\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010.\u001a\u00020\u001fH\u0002J\u0006\u0010/\u001a\u00020\u001fJ\b\u00100\u001a\u00020\u001fH\u0003J\u001a\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0014J\b\u00106\u001a\u00020\u001fH\u0002J\u0006\u00107\u001a\u00020\u001fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lbrite/outdoor/ui/fragments/search/FrmSearchUtensils;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmSearchUtensilsBinding;", "()V", "adapterSearch", "Lbrite/outdoor/adapter/AdapterSearchWith;", "key", "", "lastestId", "listLocations", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/ObjectSearch$ResultSearchEntity;", "listUtensils", "numberPage", "", "getNumberPage", "()I", "setNumberPage", "(I)V", "saveListLocation", "Lbrite/outdoor/data/local/room/SaveListLocationLocal;", "saveListUtensils", "Lbrite/outdoor/data/local/room/SaveListUtensilsLocal;", "searchViewModel", "Lbrite/outdoor/viewmodel/SearchViewModel;", "getSearchViewModel", "()Lbrite/outdoor/viewmodel/SearchViewModel;", "searchViewModel$delegate", "Lkotlin/Lazy;", "total", "callApiSearch", "", "convertJsonToList", "Lbrite/outdoor/data/api_entities/response/ResponseListUtensils$UtensilsData;", "Lkotlin/collections/ArrayList;", "source", "eventLoadMore", "finish", "getCurrentFragment", "initView", "savedInstanceState", "Landroid/os/Bundle;", "listenerItemClicked", "listenerSearchView", "loadControlsAndResize", "binding", "observerSearchUtensils", "onRefreshData", "searchClick", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showDataUtensilsToList", "updateUIAfterChangeLanguage", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmSearchUtensils extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmSearchUtensilsBinding> {
    private brite.outdoor.data.local.room.SaveListLocationLocal saveListLocation;
    private final java.util.ArrayList<brite.outdoor.data.entities.ObjectSearch.ResultSearchEntity> listLocations = null;
    private final kotlin.Lazy searchViewModel$delegate = null;
    private brite.outdoor.data.local.room.SaveListUtensilsLocal saveListUtensils;
    private brite.outdoor.adapter.AdapterSearchWith adapterSearch;
    private final java.util.ArrayList<brite.outdoor.data.entities.ObjectSearch.ResultSearchEntity> listUtensils = null;
    private int numberPage = 1;
    private java.lang.String key = "";
    private java.lang.String lastestId = "";
    private int total = 0;
    public static final int FRM_SEARCH_UTENSILS = 2;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.search.FrmSearchUtensils.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.SearchViewModel getSearchViewModel() {
        return null;
    }
    
    public final int getNumberPage() {
        return 0;
    }
    
    public final void setNumberPage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmSearchUtensilsBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmSearchUtensilsBinding binding) {
    }
    
    private final void callApiSearch(java.lang.String key, java.lang.String lastestId) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void searchClick() {
    }
    
    private final void observerSearchUtensils() {
    }
    
    private final void showDataUtensilsToList() {
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
    
    private final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData> convertJsonToList(java.lang.String source) {
        return null;
    }
    
    public final void updateUIAfterChangeLanguage() {
    }
    
    public FrmSearchUtensils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/ui/fragments/search/FrmSearchUtensils$Companion;", "", "()V", "FRM_SEARCH_UTENSILS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}