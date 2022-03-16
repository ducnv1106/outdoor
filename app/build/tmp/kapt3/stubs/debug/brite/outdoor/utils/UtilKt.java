package brite.outdoor.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007\u001a\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0000\u001a\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007\u001a\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0010\u001a\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r\u001a*\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u001a*\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u001a\n\u0010\u001b\u001a\u00020\u0016*\u00020\r\u001a\n\u0010\u001c\u001a\u00020\u0001*\u00020\u0016\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"separator", "", "kotlin.jvm.PlatformType", "cachePath", "context", "Landroid/content/Context;", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "copyToCache", "Ljava/io/File;", "imageFile", "decodeSampledBitmapFromFile", "Landroid/graphics/Bitmap;", "determineImageRotation", "bitmap", "loadBitmap", "overWrite", "format", "Landroid/graphics/Bitmap$CompressFormat;", "quality", "saveBitmap", "", "destination", "compressFormat", "extension", "app_debug"})
public final class UtilKt {
    private static final java.lang.String separator = null;
    
    private static final java.lang.String cachePath(android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap.CompressFormat compressFormat(@org.jetbrains.annotations.NotNull()
    java.io.File $this$compressFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String extension(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap.CompressFormat $this$extension) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap loadBitmap(@org.jetbrains.annotations.NotNull()
    java.io.File imageFile) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap decodeSampledBitmapFromFile(@org.jetbrains.annotations.NotNull()
    java.io.File imageFile, int reqWidth, int reqHeight) {
        return null;
    }
    
    public static final int calculateInSampleSize(@org.jetbrains.annotations.NotNull()
    android.graphics.BitmapFactory.Options options, int reqWidth, int reqHeight) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap determineImageRotation(@org.jetbrains.annotations.NotNull()
    java.io.File imageFile, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File copyToCache(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File imageFile) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File overWrite(@org.jetbrains.annotations.NotNull()
    java.io.File imageFile, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap.CompressFormat format, int quality) {
        return null;
    }
    
    public static final void saveBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    java.io.File destination, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap.CompressFormat format, int quality) {
    }
}