package brite.outdoor.ui.fragments.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010&\u001a\u00020\'H\u0016J\u0017\u0010(\u001a\u00020\'2\b\u0010)\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0002\u0010*J\u001a\u0010+\u001a\u00020\'2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010,\u001a\u00020\'H\u0002J\b\u0010-\u001a\u00020\'H\u0014J\b\u0010.\u001a\u00020\'H\u0002J\b\u0010/\u001a\u00020\u0019H\u0014J\u0012\u00100\u001a\u00020\'2\b\b\u0002\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\'H\u0002J\u0012\u00104\u001a\u00020\'2\b\u00105\u001a\u0004\u0018\u000106H\u0014J\b\u00107\u001a\u000202H\u0016J\b\u00108\u001a\u00020\'H\u0002J\b\u00109\u001a\u00020\'H\u0002J\u0012\u0010:\u001a\u00020\'2\b\u0010;\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010<\u001a\u00020\'H\u0002J\b\u0010=\u001a\u00020\'H\u0002J\b\u0010>\u001a\u00020\'H\u0003J\b\u0010?\u001a\u00020\'H\u0002J\b\u0010@\u001a\u00020\'H\u0002J\b\u0010A\u001a\u00020\'H\u0002J\u0012\u0010B\u001a\u00020\'2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\b\u0010E\u001a\u00020\'H\u0016J\u0010\u0010F\u001a\u00020\'2\u0006\u0010G\u001a\u00020HH\u0007J\b\u0010I\u001a\u00020\'H\u0002J\b\u0010J\u001a\u00020\'H\u0016J\b\u0010K\u001a\u00020\'H\u0016J\b\u0010L\u001a\u00020\'H\u0003J\u001a\u0010M\u001a\u00020\u00022\u0006\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QH\u0014J\u0010\u0010R\u001a\u00020\'2\u0006\u0010S\u001a\u00020$H\u0002J\b\u0010T\u001a\u00020\'H\u0002J\b\u0010U\u001a\u00020\'H\u0002J\b\u0010V\u001a\u00020\'H\u0002J\b\u0010W\u001a\u00020\'H\u0002J\b\u0010X\u001a\u00020\'H\u0002J\b\u0010Y\u001a\u00020\u0019H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b \u0010!R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006Z"}, d2 = {"Lbrite/outdoor/ui/fragments/search/FrmSearchVer2;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmSearchVer2Binding;", "Landroid/view/View$OnClickListener;", "()V", "adapterSearch", "Lbrite/outdoor/adapter/AdapterSearchWith;", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "followViewModel", "Lbrite/outdoor/viewmodel/FollowViewModel;", "getFollowViewModel", "()Lbrite/outdoor/viewmodel/FollowViewModel;", "followViewModel$delegate", "key", "", "lastestId", "listSearch", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/ObjectSearch$ResultSearchEntity;", "numberPage", "", "saveListLocation", "Lbrite/outdoor/data/local/room/SaveListLocationLocal;", "saveListUtensils", "Lbrite/outdoor/data/local/room/SaveListUtensilsLocal;", "searchViewModel", "Lbrite/outdoor/viewmodel/SearchViewModel;", "getSearchViewModel", "()Lbrite/outdoor/viewmodel/SearchViewModel;", "searchViewModel$delegate", "status", "Lbrite/outdoor/viewmodel/SearchViewModel$SearchType;", "total", "backToPrevious", "", "callApiFollow", "idUser", "(Ljava/lang/Integer;)V", "callApiSearch", "eventLoadMore", "finish", "followAndUnFollowUser", "getCurrentFragment", "hideBtnAddHome", "isRefresh", "", "hideBtnAddHomeBackToScreenHome", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isBackPreviousEnable", "listenerItemClicked", "listenerSearchView", "loadControlsAndResize", "binding", "observerChangeLanguage", "observerFollowUser", "observerNotifyUnread", "observerSearchLocation", "observerSearchUser", "observerSearchUtensils", "onClick", "p0", "Landroid/view/View;", "onDestroyView", "onEvent", "event", "", "onListenerNaviBottom", "onStart", "onStop", "searchClick", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setClSearchFollow", "statusSearch", "showDataLocationToList", "showDataUserList", "showDataUtensilsToList", "showFilter", "showPopupWindow", "statusBarColor", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmSearchVer2 extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmSearchVer2Binding> implements android.view.View.OnClickListener {
    private brite.outdoor.adapter.AdapterSearchWith adapterSearch;
    private final kotlin.Lazy authViewModel$delegate = null;
    private final kotlin.Lazy searchViewModel$delegate = null;
    private brite.outdoor.data.local.room.SaveListUtensilsLocal saveListUtensils;
    private brite.outdoor.data.local.room.SaveListLocationLocal saveListLocation;
    private final kotlin.Lazy followViewModel$delegate = null;
    private final java.util.ArrayList<brite.outdoor.data.entities.ObjectSearch.ResultSearchEntity> listSearch = null;
    private brite.outdoor.viewmodel.SearchViewModel.SearchType status = brite.outdoor.viewmodel.SearchViewModel.SearchType.LOCATE;
    private int numberPage = 1;
    private java.lang.String key = "";
    private java.lang.String lastestId = "";
    private int total = 0;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.SearchViewModel getSearchViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.FollowViewModel getFollowViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmSearchVer2Binding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmSearchVer2Binding setBinding(@org.jetbrains.annotations.NotNull()
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
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    private final void showFilter() {
    }
    
    private final void callApiSearch(java.lang.String key, java.lang.String lastestId) {
    }
    
    private final void showDataLocationToList() {
    }
    
    private final void setClSearchFollow(brite.outdoor.viewmodel.SearchViewModel.SearchType statusSearch) {
    }
    
    private final void showDataUtensilsToList() {
    }
    
    private final void listenerSearchView() {
    }
    
    private final void showDataUserList() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void searchClick() {
    }
    
    private final void observerSearchUtensils() {
    }
    
    private final void observerSearchUser() {
    }
    
    private final void observerSearchLocation() {
    }
    
    private final void showPopupWindow() {
    }
    
    private final void hideBtnAddHomeBackToScreenHome() {
    }
    
    private final void hideBtnAddHome(boolean isRefresh) {
    }
    
    private final void onListenerNaviBottom() {
    }
    
    private final void observerChangeLanguage() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public int statusBarColor() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Object event) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void observerNotifyUnread() {
    }
    
    private final void followAndUnFollowUser() {
    }
    
    private final void callApiFollow(java.lang.Integer idUser) {
    }
    
    private final void observerFollowUser() {
    }
    
    private final void eventLoadMore() {
    }
    
    private final void listenerItemClicked() {
    }
    
    public FrmSearchVer2() {
        super();
    }
}