package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000267B\u00d2\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000b0\n\u00126\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000b0\u001b\u00a2\u0006\u0002\u0010\u001fJ\b\u0010-\u001a\u00020\u000eH\u0016J\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\u0006\u0010/\u001a\u00020\u000bJ\u0018\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\u0018\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u000eH\u0016R\u000e\u0010 \u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R%\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\"\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R>\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000b0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lbrite/outdoor/adapter/ImagePagerAdapterMedia;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "list", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/entities/ImagePicker;", "Lkotlin/collections/ArrayList;", "itemClickListener", "Lkotlin/Function1;", "", "playersMap", "", "", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "viewMap", "Landroid/view/View;", "viewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "viewModel", "Lbrite/outdoor/viewmodel/MediaViewModel;", "onShowViewCloseIfNeed", "Lkotlin/ParameterName;", "name", "position", "onPlayVideoIfNeed", "Lkotlin/Function2;", "id", "", "needPlay", "(Landroid/content/Context;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Ljava/util/Map;Landroidx/viewpager2/widget/ViewPager2;Lbrite/outdoor/viewmodel/MediaViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "TYPE_VIEW_IMAGE", "TYPE_VIEW_VIDEO", "getContext", "()Landroid/content/Context;", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "getList", "()Ljava/util/ArrayList;", "listImage", "mContext", "mHandlerImage", "Landroid/os/Handler;", "mHandlerVideo", "getItemCount", "getItemViewType", "handlerMemoryLeaksAdapter", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MediaImageHolder", "SlideImageViewHolder", "app_debug"})
public final class ImagePagerAdapterMedia extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> listImage;
    private android.content.Context mContext;
    private final int TYPE_VIEW_VIDEO = 1;
    private final int TYPE_VIEW_IMAGE = 2;
    private android.os.Handler mHandlerImage;
    private android.os.Handler mHandlerVideo;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> list = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<brite.outdoor.data.entities.ImagePicker, kotlin.Unit> itemClickListener = null;
    private final java.util.Map<java.lang.Integer, com.google.android.exoplayer2.SimpleExoPlayer> playersMap = null;
    private final java.util.Map<java.lang.Integer, android.view.View> viewMap = null;
    private final androidx.viewpager2.widget.ViewPager2 viewPager2 = null;
    private final brite.outdoor.viewmodel.MediaViewModel viewModel = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onShowViewCloseIfNeed = null;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Boolean, kotlin.Unit> onPlayVideoIfNeed = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void handlerMemoryLeaksAdapter() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<brite.outdoor.data.entities.ImagePicker, kotlin.Unit> getItemClickListener() {
        return null;
    }
    
    public ImagePagerAdapterMedia(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<brite.outdoor.data.entities.ImagePicker> list, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super brite.outdoor.data.entities.ImagePicker, kotlin.Unit> itemClickListener, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, com.google.android.exoplayer2.SimpleExoPlayer> playersMap, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, android.view.View> viewMap, @org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 viewPager2, @org.jetbrains.annotations.NotNull()
    brite.outdoor.viewmodel.MediaViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onShowViewCloseIfNeed, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> onPlayVideoIfNeed) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0003J\b\u0010\u001e\u001a\u00020\u0019H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001f"}, d2 = {"Lbrite/outdoor/adapter/ImagePagerAdapterMedia$MediaImageHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lbrite/outdoor/adapter/ImagePagerAdapterMedia;Landroid/view/View;)V", "btnOver", "Landroidx/appcompat/widget/AppCompatButton;", "getBtnOver", "()Landroidx/appcompat/widget/AppCompatButton;", "imgPage", "Landroid/widget/ImageView;", "getImgPage", "()Landroid/widget/ImageView;", "setImgPage", "(Landroid/widget/ImageView;)V", "mDowX", "", "mDowY", "progress", "Lbrite/outdoor/ui/widgets/ProgressView;", "getProgress", "()Lbrite/outdoor/ui/widgets/ProgressView;", "setProgress", "(Lbrite/outdoor/ui/widgets/ProgressView;)V", "binData", "", "position", "", "closeScreen", "eventTouchListener", "showBtnClose", "app_debug"})
    public final class MediaImageHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgPage;
        @org.jetbrains.annotations.NotNull()
        private brite.outdoor.ui.widgets.ProgressView progress;
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.AppCompatButton btnOver = null;
        private float mDowX = 0.0F;
        private float mDowY = 0.0F;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgPage() {
            return null;
        }
        
        public final void setImgPage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.ui.widgets.ProgressView getProgress() {
            return null;
        }
        
        public final void setProgress(@org.jetbrains.annotations.NotNull()
        brite.outdoor.ui.widgets.ProgressView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatButton getBtnOver() {
            return null;
        }
        
        public final void binData(int position) {
        }
        
        @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
        private final void eventTouchListener() {
        }
        
        private final void closeScreen() {
        }
        
        private final void showBtnClose() {
        }
        
        public MediaImageHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0003J\u0018\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010%\u001a\u00020\u001dH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006&"}, d2 = {"Lbrite/outdoor/adapter/ImagePagerAdapterMedia$SlideImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lbrite/outdoor/adapter/ImagePagerAdapterMedia;Landroid/view/View;)V", "btnOver", "Landroidx/appcompat/widget/AppCompatButton;", "getBtnOver", "()Landroidx/appcompat/widget/AppCompatButton;", "clPlayVideo", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getClPlayVideo", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setClPlayVideo", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "mDowX", "", "mDowY", "playerFullScreen", "Lcom/google/android/exoplayer2/ui/PlayerView;", "getPlayerFullScreen", "()Lcom/google/android/exoplayer2/ui/PlayerView;", "playerView", "getPlayerView", "progress", "Lbrite/outdoor/ui/widgets/ProgressView;", "getProgress", "()Lbrite/outdoor/ui/widgets/ProgressView;", "bindData", "", "position", "", "closeScreen", "eventTouchListener", "playVideo", "item", "Lbrite/outdoor/data/entities/ImagePicker;", "showBtnClose", "app_debug"})
    public final class SlideImageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private androidx.constraintlayout.widget.ConstraintLayout clPlayVideo;
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.exoplayer2.ui.PlayerView playerView = null;
        @org.jetbrains.annotations.NotNull()
        private final brite.outdoor.ui.widgets.ProgressView progress = null;
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.exoplayer2.ui.PlayerView playerFullScreen = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.AppCompatButton btnOver = null;
        private float mDowX = 0.0F;
        private float mDowY = 0.0F;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.constraintlayout.widget.ConstraintLayout getClPlayVideo() {
            return null;
        }
        
        public final void setClPlayVideo(@org.jetbrains.annotations.NotNull()
        androidx.constraintlayout.widget.ConstraintLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.exoplayer2.ui.PlayerView getPlayerView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.ui.widgets.ProgressView getProgress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.exoplayer2.ui.PlayerView getPlayerFullScreen() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatButton getBtnOver() {
            return null;
        }
        
        public final void bindData(int position) {
        }
        
        public final void playVideo(@org.jetbrains.annotations.Nullable()
        brite.outdoor.data.entities.ImagePicker item, int position) {
        }
        
        @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
        private final void eventTouchListener() {
        }
        
        private final void closeScreen() {
        }
        
        private final void showBtnClose() {
        }
        
        public SlideImageViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}