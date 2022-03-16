package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lbrite/outdoor/viewmodel/CameraViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "actionState", "Landroidx/lifecycle/MutableLiveData;", "Lbrite/outdoor/viewmodel/CameraViewModel$STATE;", "getActionState", "()Landroidx/lifecycle/MutableLiveData;", "mediaData", "", "Lbrite/outdoor/entity/Media;", "getMediaData", "setMediaData", "(Landroidx/lifecycle/MutableLiveData;)V", "STATE", "app_debug"})
public final class CameraViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.CameraViewModel.STATE> actionState = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<brite.outdoor.entity.Media>> mediaData;
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.CameraViewModel.STATE> getActionState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<brite.outdoor.entity.Media>> getMediaData() {
        return null;
    }
    
    public final void setMediaData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<brite.outdoor.entity.Media>> p0) {
    }
    
    @javax.inject.Inject()
    public CameraViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/viewmodel/CameraViewModel$STATE;", "", "(Ljava/lang/String;I)V", "NOTHING", "CONSUMED", "app_debug"})
    public static enum STATE {
        /*public static final*/ NOTHING /* = new NOTHING() */,
        /*public static final*/ CONSUMED /* = new CONSUMED() */;
        
        STATE() {
        }
    }
}