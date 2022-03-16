package brite.outdoor.utils.compressor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lbrite/outdoor/utils/compressor/FormatConstraint;", "Lbrite/outdoor/utils/compressor/Constraint;", "format", "Landroid/graphics/Bitmap$CompressFormat;", "(Landroid/graphics/Bitmap$CompressFormat;)V", "isSatisfied", "", "imageFile", "Ljava/io/File;", "satisfy", "app_debug"})
public final class FormatConstraint implements brite.outdoor.utils.compressor.Constraint {
    private final android.graphics.Bitmap.CompressFormat format = null;
    
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
    
    public FormatConstraint(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap.CompressFormat format) {
        super();
    }
}