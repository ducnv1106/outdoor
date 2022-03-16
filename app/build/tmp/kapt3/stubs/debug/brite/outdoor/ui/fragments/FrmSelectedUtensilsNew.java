package brite.outdoor.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001GB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010*\u001a\u00020)H\u0002J\b\u0010+\u001a\u00020\u0016H\u0016J\u0012\u0010,\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\b\u0010/\u001a\u00020)H\u0002J\b\u00100\u001a\u00020)H\u0002J\u0012\u00101\u001a\u00020)2\b\u00102\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u00103\u001a\u00020)H\u0002J\u0012\u00104\u001a\u00020)2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00108\u001a\u00020)H\u0016J\b\u00109\u001a\u00020)H\u0003J\u0010\u0010:\u001a\u00020)2\u0006\u0010;\u001a\u00020<H\u0002J\u001a\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020\u0002H\u0002J\b\u0010D\u001a\u00020)H\u0002J\u0006\u0010E\u001a\u00020)J\u0006\u0010F\u001a\u00020)R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b$\u0010%R\u000e\u0010\'\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmSelectedUtensilsNew;", "Lbrite/outdoor/ui/fragments/BaseDialogFragment;", "Lbrite/outdoor/databinding/DialogSelectedUtensilsBinding;", "Landroid/view/View$OnClickListener;", "()V", "adapterSearch", "Lbrite/outdoor/adapter/AdapterSearchLocation;", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "imagePicker", "Lbrite/outdoor/data/entities/ImagePicker;", "key", "", "lastestId", "listUtensils", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/ObjectSearch$ResultSearchEntity;", "numberPage", "", "getNumberPage", "()I", "setNumberPage", "(I)V", "saveListUtensils", "Lbrite/outdoor/data/local/room/SaveListUtensilsLocal;", "searchViewModel", "Lbrite/outdoor/viewmodel/SearchViewModel;", "getSearchViewModel", "()Lbrite/outdoor/viewmodel/SearchViewModel;", "searchViewModel$delegate", "selectPlaceViewModel", "Lbrite/outdoor/viewmodel/SelectPlaceViewModel;", "getSelectPlaceViewModel", "()Lbrite/outdoor/viewmodel/SelectPlaceViewModel;", "selectPlaceViewModel$delegate", "total", "callApiSearch", "", "eventLoadMore", "getTheme", "initView", "savedInstanceState", "Landroid/os/Bundle;", "listenerItemClicked", "listenerSearchView", "loadControlsAndResize", "binding", "observerSearchUtensils", "onClick", "v", "Landroid/view/View;", "onCreate", "onDestroyView", "searchClick", "sendDataToPushPostNew", "utensilsEntity", "Lbrite/outdoor/data/entities/UtensilsEntity;", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setupNavigation", "frmSelectPlaceUtensilsBinding", "showDataUtensilsToListLocation", "startShimmerLayout", "stopShimmerLayout", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmSelectedUtensilsNew extends brite.outdoor.ui.fragments.BaseDialogFragment<brite.outdoor.databinding.DialogSelectedUtensilsBinding> implements android.view.View.OnClickListener {
    private final kotlin.Lazy selectPlaceViewModel$delegate = null;
    private final kotlin.Lazy authViewModel$delegate = null;
    private brite.outdoor.adapter.AdapterSearchLocation adapterSearch;
    private final kotlin.Lazy searchViewModel$delegate = null;
    private brite.outdoor.data.local.room.SaveListUtensilsLocal saveListUtensils;
    private final java.util.ArrayList<brite.outdoor.data.entities.ObjectSearch.ResultSearchEntity> listUtensils = null;
    private brite.outdoor.data.entities.ImagePicker imagePicker;
    private int numberPage = 1;
    private java.lang.String key = "";
    private java.lang.String lastestId = "";
    private int total = 0;
    public static final int FRM_POST_UTENSILS = 2;
    public static final int TYPE_SEARCH_UTENSILS = 2;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.FrmSelectedUtensilsNew.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.SelectPlaceViewModel getSelectPlaceViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
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
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.DialogSelectedUtensilsBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.DialogSelectedUtensilsBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showDataUtensilsToListLocation() {
    }
    
    private final void setupNavigation(brite.outdoor.databinding.DialogSelectedUtensilsBinding frmSelectPlaceUtensilsBinding) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void searchClick() {
    }
    
    private final void callApiSearch(java.lang.String key, java.lang.String lastestId) {
    }
    
    private final void observerSearchUtensils() {
    }
    
    private final void listenerSearchView() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void listenerItemClicked() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void eventLoadMore() {
    }
    
    private final void sendDataToPushPostNew(brite.outdoor.data.entities.UtensilsEntity utensilsEntity) {
    }
    
    public final void startShimmerLayout() {
    }
    
    public final void stopShimmerLayout() {
    }
    
    public FrmSelectedUtensilsNew() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmSelectedUtensilsNew$Companion;", "", "()V", "FRM_POST_UTENSILS", "", "TYPE_SEARCH_UTENSILS", "getInstance", "Landroidx/fragment/app/DialogFragment;", "imagePicker", "Lbrite/outdoor/data/entities/ImagePicker;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.DialogFragment getInstance(@org.jetbrains.annotations.NotNull()
        brite.outdoor.data.entities.ImagePicker imagePicker) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}