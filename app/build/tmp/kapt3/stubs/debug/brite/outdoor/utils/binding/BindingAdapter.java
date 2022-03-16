package brite.outdoor.utils.binding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lbrite/outdoor/utils/binding/BindingAdapter;", "", "()V", "Companion", "app_debug"})
public final class BindingAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.utils.binding.BindingAdapter.Companion Companion = null;
    
    public BindingAdapter() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:setMyTextSpan"})
    public static final void setCustomTextSpan(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:setSelectedImageView"})
    public static final void setSelectedImageView(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSelected) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:changeToBrowser"})
    public static final void changeToBrowser(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:actionGlobal2Home"})
    public static final void actionGlobal2Home(@org.jetbrains.annotations.NotNull()
    android.widget.Button view, int url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"showOrHideShimmerLayout"})
    public static final void setShowOrHideShimmerLayout(@org.jetbrains.annotations.NotNull()
    com.facebook.shimmer.ShimmerFrameLayout $this$setShowOrHideShimmerLayout, @org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> showOrHideShimmerLayout) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setSelectedView"})
    public static final void setSelectedView(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setSelectedView, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSelected) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:showOrHideLoading"})
    public static final void showOrHideLoading(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar view, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowLoading) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.databinding.BindingAdapter(value = {"android:lengthText"})
    public static final void setLiveDataLength(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setLiveDataLength, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Integer> liveData) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"digits"})
    public static final void digits(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$digits, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> liveData) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setImage"})
    public static final void setImage(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView $this$setImage, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<brite.outdoor.entity.EntityLocationSave> liveData) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setImagePicker"})
    public static final void setImagePicker(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView $this$setImagePicker, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<brite.outdoor.data.entities.ImagePicker> liveData) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setText"})
    public static final void setText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setText, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> liveData) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setNameLocation"})
    public static final void setNameLocation(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setNameLocation, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> liveData) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:setSelectedImageViewSend"})
    public static final void setSelectedImageViewSend(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$setSelectedImageViewSend, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isSelected) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"limitLineEdt"})
    public static final void limitLineEdt(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$limitLineEdt, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> content) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000bH\u0007J\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007J\u001e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007J\u001e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007J\u001a\u0010\u001b\u001a\u00020\u0004*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007J\u001a\u0010\u001c\u001a\u00020\u0004*\u00020\u00102\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007J\u001a\u0010\u001e\u001a\u00020\u0004*\u00020\u001f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020 0\u0012H\u0007J\u001c\u0010!\u001a\u00020\u0004*\u00020\u001f2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0012H\u0007J\u001a\u0010#\u001a\u00020\u0004*\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0007J\u001a\u0010$\u001a\u00020\u0004*\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007J\u001a\u0010%\u001a\u00020\u0004*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170&H\u0007J\u001a\u0010\'\u001a\u00020\u0004*\u00020(2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007J\u001c\u0010)\u001a\u00020\u0004*\u00020*2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0007J\u001a\u0010,\u001a\u00020\u0004*\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020-0\u0012H\u0007\u00a8\u0006."}, d2 = {"Lbrite/outdoor/utils/binding/BindingAdapter$Companion;", "", "()V", "actionGlobal2Home", "", "view", "Landroid/widget/Button;", "url", "", "changeToBrowser", "Landroid/widget/TextView;", "", "setCustomTextSpan", "value", "setLiveDataText", "editText", "Landroid/widget/EditText;", "liveData", "Landroidx/lifecycle/LiveData;", "setSelectedImageView", "Landroid/widget/ImageView;", "isSelected", "Landroidx/lifecycle/MutableLiveData;", "", "showOrHideLoading", "Landroid/widget/ProgressBar;", "isShowLoading", "digits", "limitLineEdt", "content", "setImage", "Landroidx/appcompat/widget/AppCompatImageView;", "Lbrite/outdoor/entity/EntityLocationSave;", "setImagePicker", "Lbrite/outdoor/data/entities/ImagePicker;", "setLiveDataLength", "setNameLocation", "setSelectedImageViewSend", "Landroidx/lifecycle/MediatorLiveData;", "setSelectedView", "Landroid/view/View;", "setShowOrHideShimmerLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "showOrHideShimmerLayout", "setText", "Lbrite/outdoor/data/api_entities/response/ResponseListCamping$ListCampingData;", "app_debug"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(value = {"android:setMyTextSpan"})
        public final void setCustomTextSpan(@org.jetbrains.annotations.NotNull()
        android.widget.TextView view, @org.jetbrains.annotations.NotNull()
        java.lang.String value) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"android:setSelectedImageView"})
        public final void setSelectedImageView(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSelected) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"android:changeToBrowser"})
        public final void changeToBrowser(@org.jetbrains.annotations.NotNull()
        android.widget.TextView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"android:actionGlobal2Home"})
        public final void actionGlobal2Home(@org.jetbrains.annotations.NotNull()
        android.widget.Button view, int url) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"showOrHideShimmerLayout"})
        public final void setShowOrHideShimmerLayout(@org.jetbrains.annotations.NotNull()
        com.facebook.shimmer.ShimmerFrameLayout $this$setShowOrHideShimmerLayout, @org.jetbrains.annotations.Nullable()
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> showOrHideShimmerLayout) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"setSelectedView"})
        public final void setSelectedView(@org.jetbrains.annotations.NotNull()
        android.view.View $this$setSelectedView, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSelected) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"android:showOrHideLoading"})
        public final void showOrHideLoading(@org.jetbrains.annotations.NotNull()
        android.widget.ProgressBar view, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowLoading) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"android:text"})
        public final void setLiveDataText(@org.jetbrains.annotations.NotNull()
        android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LiveData<java.lang.String> liveData) {
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        @androidx.databinding.BindingAdapter(value = {"android:lengthText"})
        public final void setLiveDataLength(@org.jetbrains.annotations.NotNull()
        android.widget.TextView $this$setLiveDataLength, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LiveData<java.lang.Integer> liveData) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"digits"})
        public final void digits(@org.jetbrains.annotations.NotNull()
        android.widget.EditText $this$digits, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LiveData<java.lang.String> liveData) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"setImage"})
        public final void setImage(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatImageView $this$setImage, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LiveData<brite.outdoor.entity.EntityLocationSave> liveData) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"setImagePicker"})
        public final void setImagePicker(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatImageView $this$setImagePicker, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LiveData<brite.outdoor.data.entities.ImagePicker> liveData) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"setText"})
        public final void setText(@org.jetbrains.annotations.NotNull()
        android.widget.TextView $this$setText, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LiveData<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> liveData) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"setNameLocation"})
        public final void setNameLocation(@org.jetbrains.annotations.NotNull()
        android.widget.TextView $this$setNameLocation, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LiveData<java.lang.String> liveData) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"android:setSelectedImageViewSend"})
        public final void setSelectedImageViewSend(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView $this$setSelectedImageViewSend, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isSelected) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"limitLineEdt"})
        public final void limitLineEdt(@org.jetbrains.annotations.NotNull()
        android.widget.EditText $this$limitLineEdt, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.LiveData<java.lang.String> content) {
        }
        
        private Companion() {
            super();
        }
    }
}