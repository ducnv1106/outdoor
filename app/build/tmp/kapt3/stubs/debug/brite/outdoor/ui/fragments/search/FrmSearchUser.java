package brite.outdoor.ui.fragments.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0017\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010\"J\u001a\u0010#\u001a\u00020 2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020 H\u0014J\b\u0010&\u001a\u00020 H\u0002J\b\u0010\'\u001a\u00020\u0014H\u0014J\b\u0010(\u001a\u00020 H\u0002J\u0012\u0010)\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\u0012\u0010,\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020 H\u0002J\u0006\u00100\u001a\u00020 J\b\u00101\u001a\u00020 H\u0003J\u001a\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0014J\b\u00107\u001a\u00020 H\u0002J\u0006\u00108\u001a\u00020 R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lbrite/outdoor/ui/fragments/search/FrmSearchUser;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmSearchUserBinding;", "()V", "adapterSearch", "Lbrite/outdoor/adapter/AdapterSearchWith;", "followViewModel", "Lbrite/outdoor/viewmodel/FollowViewModel;", "getFollowViewModel", "()Lbrite/outdoor/viewmodel/FollowViewModel;", "followViewModel$delegate", "Lkotlin/Lazy;", "key", "", "lastestId", "listLocations", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/ObjectSearch$ResultSearchEntity;", "listUser", "numberPage", "", "getNumberPage", "()I", "setNumberPage", "(I)V", "searchViewModel", "Lbrite/outdoor/viewmodel/SearchViewModel;", "getSearchViewModel", "()Lbrite/outdoor/viewmodel/SearchViewModel;", "searchViewModel$delegate", "total", "callApiFollow", "", "idUser", "(Ljava/lang/Integer;)V", "callApiSearch", "eventLoadMore", "finish", "followAndUnFollowUser", "getCurrentFragment", "goToFrmPersonalPage", "initView", "savedInstanceState", "Landroid/os/Bundle;", "loadControlsAndResize", "binding", "observerFollowUser", "observerSearchUser", "onRefreshData", "searchClick", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showDataUserList", "updateUIAfterChangeLanguage", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmSearchUser extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmSearchUserBinding> {
    private final kotlin.Lazy followViewModel$delegate = null;
    private final java.util.ArrayList<brite.outdoor.data.entities.ObjectSearch.ResultSearchEntity> listLocations = null;
    private final kotlin.Lazy searchViewModel$delegate = null;
    private brite.outdoor.adapter.AdapterSearchWith adapterSearch;
    private final java.util.ArrayList<brite.outdoor.data.entities.ObjectSearch.ResultSearchEntity> listUser = null;
    private int numberPage = 1;
    private java.lang.String key = "";
    private java.lang.String lastestId = "";
    private int total = 0;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.FollowViewModel getFollowViewModel() {
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
    brite.outdoor.databinding.FrmSearchUserBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmSearchUserBinding setBinding(@org.jetbrains.annotations.NotNull()
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
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void searchClick() {
    }
    
    private final void showDataUserList() {
    }
    
    private final void observerSearchUser() {
    }
    
    private final void followAndUnFollowUser() {
    }
    
    private final void observerFollowUser() {
    }
    
    private final void callApiFollow(java.lang.Integer idUser) {
    }
    
    public final void onRefreshData() {
    }
    
    private final void goToFrmPersonalPage() {
    }
    
    private final void eventLoadMore() {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    public final void updateUIAfterChangeLanguage() {
    }
    
    public FrmSearchUser() {
        super();
    }
}