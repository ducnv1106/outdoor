package brite.outdoor.data.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lbrite/outdoor/data/entities/BackStackData;", "Ljava/io/Serializable;", "from", "", "(I)V", "mapData", "Ljava/util/HashMap;", "", "", "(ILjava/util/HashMap;)V", "fromFragment", "getFromFragment", "()I", "setFromFragment", "getMapData", "()Ljava/util/HashMap;", "setMapData", "(Ljava/util/HashMap;)V", "app_debug"})
public final class BackStackData implements java.io.Serializable {
    private int fromFragment;
    @org.jetbrains.annotations.Nullable()
    private java.util.HashMap<java.lang.String, java.lang.Object> mapData;
    
    public final int getFromFragment() {
        return 0;
    }
    
    public final void setFromFragment(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.HashMap<java.lang.String, java.lang.Object> getMapData() {
        return null;
    }
    
    public final void setMapData(@org.jetbrains.annotations.Nullable()
    java.util.HashMap<java.lang.String, java.lang.Object> p0) {
    }
    
    public BackStackData(int from) {
        super();
    }
    
    public BackStackData(int from, @org.jetbrains.annotations.Nullable()
    java.util.HashMap<java.lang.String, java.lang.Object> mapData) {
        super();
    }
}