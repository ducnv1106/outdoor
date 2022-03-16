package brite.outdoor.data.local.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006J\u001e\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lbrite/outdoor/data/local/room/SaveListLocationLocal;", "", "localDataSource", "Lbrite/outdoor/data/local/room/AppDao;", "(Lbrite/outdoor/data/local/room/AppDao;)V", "getListLocation", "Landroidx/lifecycle/LiveData;", "", "Lbrite/outdoor/data/api_entities/response/ResponseListLocation$LocationData;", "getLocationEntity", "Lbrite/outdoor/data/entities/LocationEntityConvert;", "saveListLocation", "", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "saveLocationEntity", "location", "app_debug"})
public final class SaveListLocationLocal {
    private final brite.outdoor.data.local.room.AppDao localDataSource = null;
    
    public final void saveListLocation(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData>> getListLocation() {
        return null;
    }
    
    public final void saveLocationEntity(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.LocationEntityConvert location) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.entities.LocationEntityConvert> getLocationEntity() {
        return null;
    }
    
    @javax.inject.Inject()
    public SaveListLocationLocal(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.local.room.AppDao localDataSource) {
        super();
    }
}