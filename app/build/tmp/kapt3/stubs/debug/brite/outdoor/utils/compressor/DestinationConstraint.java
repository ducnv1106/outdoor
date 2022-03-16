package brite.outdoor.utils.compressor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbrite/outdoor/utils/compressor/DestinationConstraint;", "Lbrite/outdoor/utils/compressor/Constraint;", "destination", "Ljava/io/File;", "(Ljava/io/File;)V", "isSatisfied", "", "imageFile", "satisfy", "app_debug"})
public final class DestinationConstraint implements brite.outdoor.utils.compressor.Constraint {
    private final java.io.File destination = null;
    
    @java.lang.Override()
    public boolean isSatisfied(@org.jetbrains.annotations.NotNull()
    java.io.File imageFile) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.io.File satisfy(@org.jetbrains.annotations.NotNull()
    java.io.File imageFile) {
        return null;
    }
    
    public DestinationConstraint(@org.jetbrains.annotations.NotNull()
    java.io.File destination) {
        super();
    }
}