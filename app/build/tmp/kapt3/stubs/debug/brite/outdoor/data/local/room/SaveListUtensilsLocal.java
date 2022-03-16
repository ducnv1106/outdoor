package brite.outdoor.data.local.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbrite/outdoor/data/local/room/SaveListUtensilsLocal;", "", "localDataSource", "Lbrite/outdoor/data/local/room/AppDao;", "(Lbrite/outdoor/data/local/room/AppDao;)V", "getListUtensils", "Landroidx/lifecycle/LiveData;", "", "Lbrite/outdoor/data/api_entities/response/ResponseListUtensils$UtensilsData;", "getUtensilEntity", "Lbrite/outdoor/data/entities/UtensilEntityConvert;", "saveListUtensils", "", "list", "saveUtensilEntity", "entity", "app_debug"})
public final class SaveListUtensilsLocal {
    private final brite.outdoor.data.local.room.AppDao localDataSource = null;
    
    public final void saveListUtensils(@org.jetbrains.annotations.NotNull()
    java.util.List<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData>> getListUtensils() {
        return null;
    }
    
    public final void saveUtensilEntity(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.UtensilEntityConvert entity) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.entities.UtensilEntityConvert> getUtensilEntity() {
        return null;
    }
    
    @javax.inject.Inject()
    public SaveListUtensilsLocal(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.local.room.AppDao localDataSource) {
        super();
    }
}