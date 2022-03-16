package brite.outdoor.utils.compressor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lbrite/outdoor/utils/compressor/Constraint;", "", "isSatisfied", "", "imageFile", "Ljava/io/File;", "satisfy", "app_debug"})
public abstract interface Constraint {
    
    public abstract boolean isSatisfied(@org.jetbrains.annotations.NotNull()
    java.io.File imageFile);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.io.File satisfy(@org.jetbrains.annotations.NotNull()
    java.io.File imageFile);
}