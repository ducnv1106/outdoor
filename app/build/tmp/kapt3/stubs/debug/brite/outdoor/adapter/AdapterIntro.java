package brite.outdoor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lbrite/outdoor/adapter/AdapterIntro;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbrite/outdoor/adapter/AdapterIntro$IntroHolder;", "mContext", "Landroid/content/Context;", "arrayListIntro", "Ljava/util/ArrayList;", "Lbrite/outdoor/entity/EntityIntro;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getMContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "IntroHolder", "app_debug"})
public final class AdapterIntro extends androidx.recyclerview.widget.RecyclerView.Adapter<brite.outdoor.adapter.AdapterIntro.IntroHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    private final java.util.ArrayList<brite.outdoor.entity.EntityIntro> arrayListIntro = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public brite.outdoor.adapter.AdapterIntro.IntroHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    brite.outdoor.adapter.AdapterIntro.IntroHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public AdapterIntro(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.entity.EntityIntro> arrayListIntro) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lbrite/outdoor/adapter/AdapterIntro$IntroHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lbrite/outdoor/databinding/ItemIntroBinding;", "(Lbrite/outdoor/adapter/AdapterIntro;Lbrite/outdoor/databinding/ItemIntroBinding;)V", "getBinding", "()Lbrite/outdoor/databinding/ItemIntroBinding;", "binData", "", "item", "Lbrite/outdoor/entity/EntityIntro;", "app_debug"})
    public final class IntroHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final brite.outdoor.databinding.ItemIntroBinding binding = null;
        
        public final void binData(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemIntroBinding binding, @org.jetbrains.annotations.NotNull()
        brite.outdoor.entity.EntityIntro item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.databinding.ItemIntroBinding getBinding() {
            return null;
        }
        
        public IntroHolder(@org.jetbrains.annotations.NotNull()
        brite.outdoor.databinding.ItemIntroBinding binding) {
            super(null);
        }
    }
}