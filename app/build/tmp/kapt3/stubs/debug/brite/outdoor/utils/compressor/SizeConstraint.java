package brite.outdoor.utils.compressor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lbrite/outdoor/utils/compressor/SizeConstraint;", "Lbrite/outdoor/utils/compressor/Constraint;", "maxFileSize", "", "stepSize", "", "maxIteration", "minQuality", "(JIII)V", "iteration", "isSatisfied", "", "imageFile", "Ljava/io/File;", "satisfy", "app_debug"})
public final class SizeConstraint implements brite.outdoor.utils.compressor.Constraint {
    private int iteration = 0;
    private final long maxFileSize = 0L;
    private final int stepSize = 0;
    private final int maxIteration = 0;
    private final int minQuality = 0;
    
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
    
    public SizeConstraint(long maxFileSize, int stepSize, int maxIteration, int minQuality) {
        super();
    }
}