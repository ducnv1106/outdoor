package brite.outdoor.secret;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006J\u001e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lbrite/outdoor/secret/SecretHelper;", "", "()V", "ivParameterSpec", "Ljavax/crypto/spec/IvParameterSpec;", "keyHash", "", "randomVector", "secretKey", "secretKeySpec", "Ljavax/crypto/spec/SecretKeySpec;", "decrypt", "context", "Landroid/content/Context;", "encrypted", "encrypt", "value", "getIvParameterSpec", "getKeyHash", "getRandomVector", "getSecretKey", "hash", "length", "", "getSecretKeySpec", "getTextDecrypt", "text", "tag", "printTextEncrypted", "", "app_debug"})
public final class SecretHelper {
    private javax.crypto.spec.SecretKeySpec secretKeySpec;
    private java.lang.String secretKey;
    private java.lang.String keyHash;
    private javax.crypto.spec.IvParameterSpec ivParameterSpec;
    private java.lang.String randomVector;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextDecrypt(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        return null;
    }
    
    public final void printTextEncrypted(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    private final java.lang.String encrypt(android.content.Context context, java.lang.String value) {
        return null;
    }
    
    private final java.lang.String decrypt(android.content.Context context, java.lang.String encrypted) {
        return null;
    }
    
    private final javax.crypto.spec.SecretKeySpec getSecretKeySpec(android.content.Context context) {
        return null;
    }
    
    private final java.lang.String getSecretKey(android.content.Context context) {
        return null;
    }
    
    private final java.lang.String getSecretKey(java.lang.String hash, int length) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyHash(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final javax.crypto.spec.IvParameterSpec getIvParameterSpec(android.content.Context context) {
        return null;
    }
    
    private final java.lang.String getRandomVector(android.content.Context context) {
        return null;
    }
    
    public SecretHelper() {
        super();
    }
}