package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lbrite/outdoor/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "currentTab", "", "getCurrentTab", "()I", "setCurrentTab", "(I)V", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private int currentTab = -1;
    
    public final int getCurrentTab() {
        return 0;
    }
    
    public final void setCurrentTab(int p0) {
    }
    
    @javax.inject.Inject()
    public HomeViewModel() {
        super();
    }
}