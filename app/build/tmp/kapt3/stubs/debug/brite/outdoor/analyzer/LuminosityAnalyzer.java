package brite.outdoor.analyzer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbrite/outdoor/analyzer/LuminosityAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "()V", "lastAnalyzedTimestamp", "", "analyze", "", "image", "Landroidx/camera/core/ImageProxy;", "toByteArray", "", "Ljava/nio/ByteBuffer;", "app_debug"})
public final class LuminosityAnalyzer implements androidx.camera.core.ImageAnalysis.Analyzer {
    private long lastAnalyzedTimestamp = 0L;
    
    private final byte[] toByteArray(java.nio.ByteBuffer $this$toByteArray) {
        return null;
    }
    
    @java.lang.Override()
    public void analyze(@org.jetbrains.annotations.NotNull()
    androidx.camera.core.ImageProxy image) {
    }
    
    public LuminosityAnalyzer() {
        super();
    }
}