package brite.outdoor.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u00cc\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\f\u001a\u0010\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u001a\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0016\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0011\u001a \u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0011\u001a\b\u0010\u001b\u001a\u00020\u0004H\u0007\u001aL\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001f0\u001e0\u001d\"\u0004\b\u0000\u0010\u001f2\u0006\u0010 \u001a\u00020!2\"\u0010\"\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001f0\u001e0$\u0012\u0006\u0012\u0004\u0018\u00010%0#\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&\u001a\u0010\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020(\u001a\u001a\u0010*\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u0004\u001a(\u0010-\u001a\u0004\u0018\u00010\u000f*\u00020\u00132\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u0011\u001a\u001b\u00102\u001a\u000203*\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0018H\u0007\u00a2\u0006\u0002\u00106\u001a\u0012\u00107\u001a\u00020\u0018*\u00020(2\u0006\u0010\u0016\u001a\u00020\u0011\u001a\n\u00108\u001a\u000201*\u00020(\u001a6\u00109\u001a\u000203*\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u00042\b\u0010<\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010=\u001a\u0002012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010%H\u0007\u001a\u0012\u0010?\u001a\u000203*\u00020:2\u0006\u0010@\u001a\u00020A\u001a\u0014\u0010B\u001a\u000203*\u00020:2\u0006\u0010>\u001a\u00020%H\u0007\u001a\u0014\u0010C\u001a\u000203*\u00020:2\b\u0010*\u001a\u0004\u0018\u00010\u0004\u001a\u001c\u0010D\u001a\u000203*\u00020:2\b\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010=\u001a\u000201\u001a$\u0010E\u001a\u000203*\u00020:2\b\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010=\u001a\u0002012\u0006\u0010F\u001a\u00020:\u001a(\u0010G\u001a\u000203*\u00020H2\b\u0010G\u001a\u0004\u0018\u00010\u00042\u0006\u0010I\u001a\u0002012\b\u0010J\u001a\u0004\u0018\u00010\u0004H\u0007\u001aL\u0010K\u001a\u000203*\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020N2\b\b\u0002\u0010P\u001a\u00020\u00182\u0006\u0010F\u001a\u00020Q2\u0006\u0010\u0016\u001a\u00020\u00112\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S2\b\b\u0002\u0010T\u001a\u000201H\u0007\u001a&\u0010U\u001a\u000203*\u00020:2\b\u0010V\u001a\u0004\u0018\u00010\u00042\b\u0010W\u001a\u0004\u0018\u00010\u00042\u0006\u0010F\u001a\u00020:\u001a\u001b\u0010X\u001a\u000203*\u00020Y2\b\u0010Z\u001a\u0004\u0018\u000101H\u0007\u00a2\u0006\u0002\u0010[\u001a \u0010\\\u001a\u000203*\u00020]2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u0002030#H\u0007\u001a\u001a\u0010_\u001a\u000203*\u00020]2\f\u0010^\u001a\b\u0012\u0004\u0012\u0002030`H\u0007\u001a\u001a\u0010a\u001a\u000203*\u00020L2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010b\u001a\u00020\u0004\u001a\u0016\u0010c\u001a\u000203*\u00020H2\b\u0010d\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010e\u001a\u000203*\u00020H2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010f\u001a\u000203*\u00020H2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010g\u001a\u000203*\u00020H2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010h\u001a\u000203*\u00020H2\b\u0010i\u001a\u0004\u0018\u00010\u0004H\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006j"}, d2 = {"convertJsonToListLocation", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseListLocation$LocationData;", "source", "", "convertJsonToListUtensil", "Lbrite/outdoor/data/api_entities/response/ResponseListUtensils$UtensilsData;", "convertTimeLongToString", "time", "", "dateFORMAT", "convertTimeStringToLong", "(Ljava/lang/String;)Ljava/lang/Long;", "getDate", "getImageUri", "Landroid/net/Uri;", "inContext", "Landroid/content/Context;", "inImage", "Landroid/graphics/Bitmap;", "getRealPathFromURI", "uri", "context", "isFileExist", "", "pathFile", "fileUri", "localTime", "performGetOperation", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "T", "gson", "Lcom/google/gson/Gson;", "networkCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/google/gson/Gson;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "saveBitmapToFile", "Ljava/io/File;", "file", "urlImage", "image", "urlPrefix", "compress", "format", "Landroid/graphics/Bitmap$CompressFormat;", "quality", "", "customRefreshing", "", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "refreshing", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Ljava/lang/Boolean;)V", "delete", "getSizeInKB", "loadImageAvatar", "Landroid/widget/ImageView;", "avatar_user", "url_prefix_avatar", "radius", "item", "loadImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "loadImagePost", "loadImageUrl", "loadImageWithCustomCorners", "loadImageWithProgressAndCustomCorners", "progress", "nameUser", "Landroid/widget/TextView;", "typeNotification", "comment", "preparePlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "playerView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "playerViewFullscreen", "forceLandscape", "Lbrite/outdoor/ui/widgets/ProgressView;", "viewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "position", "setImage", "avatar", "url_prefix", "setLikeCommentShare", "Lbrite/outdoor/ui/widgets/CustomLayoutInteractive;", "count", "(Lbrite/outdoor/ui/widgets/CustomLayoutInteractive;Ljava/lang/Integer;)V", "setSingleClick", "Landroid/view/View;", "execution", "setSingleClickSwitchScreen", "Lkotlin/Function0;", "setSource", "url", "setText", "name", "setTimeDay", "setTimeMonth", "setTimeNotification", "setTimePostNews", "timeString", "app_debug"})
public final class DataAccessStrategyKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<T>> performGetOperation(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super brite.outdoor.data.remote.ApiResult<? extends T>>, ? extends java.lang.Object> networkCall) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"onSingleClick"})
    public static final void setSingleClick(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setSingleClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> execution) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onSingleClickSwitchScreen"})
    public static final void setSingleClickSwitchScreen(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setSingleClickSwitchScreen, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> execution) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String urlImage(@org.jetbrains.annotations.Nullable()
    java.lang.String image, @org.jetbrains.annotations.Nullable()
    java.lang.String urlPrefix) {
        return null;
    }
    
    public static final void loadImageWithCustomCorners(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImageWithCustomCorners, @org.jetbrains.annotations.Nullable()
    java.lang.String urlImage, int radius) {
    }
    
    public static final void loadImageWithProgressAndCustomCorners(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImageWithProgressAndCustomCorners, @org.jetbrains.annotations.Nullable()
    java.lang.String urlImage, int radius, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView progress) {
    }
    
    public static final void loadImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String urlImage) {
    }
    
    public static final void loadImageDrawable(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImageDrawable, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawable) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDate(@org.jetbrains.annotations.Nullable()
    java.lang.String time) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.databinding.BindingAdapter(value = {"setTimeNotification"})
    public static final void setTimeNotification(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTimeNotification, @org.jetbrains.annotations.Nullable()
    java.lang.String time) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"isRefreshing"})
    public static final void customRefreshing(@org.jetbrains.annotations.NotNull()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout $this$customRefreshing, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean refreshing) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setText"})
    public static final void setText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setText, @org.jetbrains.annotations.Nullable()
    java.lang.String name) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"nameUser", "typeNotification", "comment"})
    public static final void nameUser(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$nameUser, @org.jetbrains.annotations.Nullable()
    java.lang.String nameUser, int typeNotification, @org.jetbrains.annotations.Nullable()
    java.lang.String comment) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.databinding.BindingAdapter(value = {"setTimePostNews"})
    public static final void setTimePostNews(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTimePostNews, @org.jetbrains.annotations.Nullable()
    java.lang.String timeString) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String localTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.Long convertTimeStringToLong(@org.jetbrains.annotations.Nullable()
    java.lang.String time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String convertTimeLongToString(long time, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFORMAT) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"avatar_user", "url_prefix_avatar", "radius", "item"})
    public static final void loadImageAvatar(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImageAvatar, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar_user, @org.jetbrains.annotations.Nullable()
    java.lang.String url_prefix_avatar, int radius, @org.jetbrains.annotations.Nullable()
    java.lang.Object item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadImagePost"})
    public static final void loadImagePost(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImagePost, @org.jetbrains.annotations.NotNull()
    java.lang.Object item) {
    }
    
    public static final void setImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$setImage, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar, @org.jetbrains.annotations.Nullable()
    java.lang.String url_prefix, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView progress) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setTimeDay"})
    public static final void setTimeDay(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTimeDay, @org.jetbrains.annotations.Nullable()
    java.lang.String time) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setTimeMonth"})
    public static final void setTimeMonth(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTimeMonth, @org.jetbrains.annotations.Nullable()
    java.lang.String time) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setLikeCommentShare"})
    public static final void setLikeCommentShare(@org.jetbrains.annotations.NotNull()
    brite.outdoor.ui.widgets.CustomLayoutInteractive $this$setLikeCommentShare, @org.jetbrains.annotations.Nullable()
    java.lang.Integer count) {
    }
    
    @android.annotation.SuppressLint(value = {"SourceLockedOrientationActivity"})
    public static final void preparePlayer(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.SimpleExoPlayer $this$preparePlayer, @org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.ui.PlayerView playerView, @org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.ui.PlayerView playerViewFullscreen, boolean forceLandscape, @org.jetbrains.annotations.NotNull()
    brite.outdoor.ui.widgets.ProgressView progress, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    androidx.viewpager2.widget.ViewPager2 viewPager2, int position) {
    }
    
    public static final void setSource(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.SimpleExoPlayer $this$setSource, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.io.File saveBitmapToFile(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    public static final int getSizeInKB(@org.jetbrains.annotations.NotNull()
    java.io.File $this$getSizeInKB) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> convertJsonToListLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String source) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData> convertJsonToListUtensil(@org.jetbrains.annotations.NotNull()
    java.lang.String source) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getRealPathFromURI(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public static final boolean isFileExist(@org.jetbrains.annotations.NotNull()
    java.lang.String pathFile, @org.jetbrains.annotations.NotNull()
    android.net.Uri fileUri, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.net.Uri compress(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$compress, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap.CompressFormat format, int quality, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.net.Uri getImageUri(@org.jetbrains.annotations.NotNull()
    android.content.Context inContext, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap inImage) {
        return null;
    }
    
    public static final boolean delete(@org.jetbrains.annotations.NotNull()
    java.io.File $this$delete, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}