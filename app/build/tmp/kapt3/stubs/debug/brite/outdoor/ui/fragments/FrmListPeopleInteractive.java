package brite.outdoor.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001?B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0016J\u0017\u0010!\u001a\u00020 2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001bH\u0002\u00a2\u0006\u0002\u0010\"J\u0012\u0010#\u001a\u00020 2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010$\u001a\u00020 2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020 H\u0014J\b\u0010\'\u001a\u00020\u001bH\u0014J\b\u0010(\u001a\u00020 H\u0002J\u0012\u0010)\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u00100\u001a\u00020 H\u0002J\b\u00101\u001a\u00020 H\u0002J\b\u00102\u001a\u00020 H\u0002J\b\u00103\u001a\u00020 H\u0002J\u0012\u00104\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00108\u001a\u00020 H\u0016J\u001a\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0014J\b\u0010>\u001a\u00020\u001bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmListPeopleInteractive;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmListPeopleInteractiveBinding;", "Landroid/view/View$OnClickListener;", "()V", "adapterPeopleInteractive", "Lbrite/outdoor/adapter/AdapterPeopleInteractive;", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "followViewModel", "Lbrite/outdoor/viewmodel/FollowViewModel;", "getFollowViewModel", "()Lbrite/outdoor/viewmodel/FollowViewModel;", "followViewModel$delegate", "idUser", "", "lastest_id", "listPeopleInteractiveViewModel", "Lbrite/outdoor/viewmodel/ListPeopleInteractiveViewModel;", "getListPeopleInteractiveViewModel", "()Lbrite/outdoor/viewmodel/ListPeopleInteractiveViewModel;", "listPeopleInteractiveViewModel$delegate", "numberPage", "", "statusPeople", "Ljava/lang/Integer;", "total", "backToPrevious", "", "callApiFollow", "(Ljava/lang/Integer;)V", "callApiListFollower", "callApiListUserFollow", "eventLoadMore", "finish", "getCurrentFragment", "initAdapter", "initView", "savedInstanceState", "Landroid/os/Bundle;", "isBackPreviousEnable", "", "loadControlsAndResize", "binding", "observerChangeLanguage", "observerFollowUser", "observerListFollower", "observerListUserFollow", "onClick", "v", "Landroid/view/View;", "onCreate", "onDestroyView", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "statusBarColor", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmListPeopleInteractive extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmListPeopleInteractiveBinding> implements android.view.View.OnClickListener {
    private brite.outdoor.adapter.AdapterPeopleInteractive adapterPeopleInteractive;
    private final kotlin.Lazy listPeopleInteractiveViewModel$delegate = null;
    private final kotlin.Lazy followViewModel$delegate = null;
    private final kotlin.Lazy authViewModel$delegate = null;
    private java.lang.Integer statusPeople;
    private java.lang.String idUser;
    private int total = 0;
    private java.lang.String lastest_id = "";
    private int numberPage = 1;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.FrmListPeopleInteractive.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.ListPeopleInteractiveViewModel getListPeopleInteractiveViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.FollowViewModel getFollowViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmListPeopleInteractiveBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmListPeopleInteractiveBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int statusBarColor() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isBackPreviousEnable() {
        return false;
    }
    
    @java.lang.Override()
    public void backToPrevious() {
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void initAdapter() {
    }
    
    private final void callApiListUserFollow(java.lang.String lastest_id) {
    }
    
    private final void observerListUserFollow() {
    }
    
    private final void callApiListFollower(java.lang.String lastest_id) {
    }
    
    private final void observerListFollower() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void observerFollowUser() {
    }
    
    private final void eventLoadMore() {
    }
    
    private final void callApiFollow(java.lang.Integer idUser) {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    private final void observerChangeLanguage() {
    }
    
    public FrmListPeopleInteractive() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a8\u0006\r"}, d2 = {"Lbrite/outdoor/ui/fragments/FrmListPeopleInteractive$Companion;", "", "()V", "getInstance", "Lbrite/outdoor/ui/fragments/FrmListPeopleInteractive;", "arrayList", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/BackStackData;", "Lkotlin/collections/ArrayList;", "status", "", "idUser", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.ui.fragments.FrmListPeopleInteractive getInstance(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<brite.outdoor.data.entities.BackStackData> arrayList, int status, @org.jetbrains.annotations.Nullable()
        java.lang.String idUser) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}