package brite.outdoor.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lbrite/outdoor/viewmodel/LoadingInPageViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_isNeedShowErr", "Landroidx/lifecycle/MutableLiveData;", "Lbrite/outdoor/data/api_entities/ApiNoticeEntity;", "isNeedShowErr", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isShowLoading", "", "()Landroidx/lifecycle/MutableLiveData;", "showOrHideLoading", "", "T", "result", "Lbrite/outdoor/data/remote/ApiResult;", "isNeedShowLoading", "app_debug"})
public abstract class LoadingInPageViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.data.api_entities.ApiNoticeEntity> _isNeedShowErr = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.api_entities.ApiNoticeEntity> isNeedShowErr = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowLoading = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.api_entities.ApiNoticeEntity> isNeedShowErr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowLoading() {
        return null;
    }
    
    public final <T extends java.lang.Object>void showOrHideLoading(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiResult<? extends T> result, boolean isNeedShowLoading) {
    }
    
    public LoadingInPageViewModel() {
        super();
    }
}