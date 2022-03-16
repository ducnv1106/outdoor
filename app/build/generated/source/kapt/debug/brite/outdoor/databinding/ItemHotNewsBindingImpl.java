package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemHotNewsBindingImpl extends ItemHotNewsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewLine, 7);
        sViewsWithIds.put(R.id.clItemNews, 8);
        sViewsWithIds.put(R.id.guiH004, 9);
        sViewsWithIds.put(R.id.guiH996, 10);
        sViewsWithIds.put(R.id.clAvatar, 11);
        sViewsWithIds.put(R.id.imgMenu, 12);
        sViewsWithIds.put(R.id.clTitleAndImg, 13);
        sViewsWithIds.put(R.id.playView, 14);
        sViewsWithIds.put(R.id.imgPost, 15);
        sViewsWithIds.put(R.id.imgLocation, 16);
        sViewsWithIds.put(R.id.progress, 17);
        sViewsWithIds.put(R.id.glH7, 18);
        sViewsWithIds.put(R.id.layoutDate, 19);
        sViewsWithIds.put(R.id.clTvLikeShareComment, 20);
        sViewsWithIds.put(R.id.clLike, 21);
        sViewsWithIds.put(R.id.imgLike, 22);
        sViewsWithIds.put(R.id.tvLike, 23);
        sViewsWithIds.put(R.id.clShare, 24);
        sViewsWithIds.put(R.id.imgShare, 25);
        sViewsWithIds.put(R.id.tvShare, 26);
        sViewsWithIds.put(R.id.clComment, 27);
        sViewsWithIds.put(R.id.imgComment, 28);
        sViewsWithIds.put(R.id.tvComment, 29);
        sViewsWithIds.put(R.id.viewFooter, 30);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemHotNewsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private ItemHotNewsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[27]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.Guideline) bindings[18]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[1]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[16]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[12]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.LinearLayout) bindings[19]
            , (com.google.android.exoplayer2.ui.PlayerView) bindings[14]
            , (brite.outdoor.ui.widgets.ProgressView) bindings[17]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[29]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[6]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[23]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[5]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[2]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[26]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.view.View) bindings[30]
            , (android.view.View) bindings[7]
            );
        this.imgAvatar.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDay.setTag(null);
        this.tvMonth.setTag(null);
        this.tvName.setTag(null);
        this.tvTime.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((brite.outdoor.data.api_entities.response.ResponseListPostHotNews.HotNewsData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable brite.outdoor.data.api_entities.response.ResponseListPostHotNews.HotNewsData Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        brite.outdoor.data.api_entities.response.ResponseListPostHotNews.HotNewsData item = mItem;
        java.lang.String itemTitle = null;
        java.lang.String itemDataAdminName = null;
        java.lang.String itemUrlPrefixAvatar = null;
        java.lang.String itemCreatedTime = null;
        brite.outdoor.data.api_entities.response.ResponseListPostHotNews.Admin itemDataAdmin = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.url_prefix_avatar
                    itemUrlPrefixAvatar = item.getUrl_prefix_avatar();
                    // read item.created_time
                    itemCreatedTime = item.getCreated_time();
                    // read item.dataAdmin()
                    itemDataAdmin = item.dataAdmin();
                }


                if (itemDataAdmin != null) {
                    // read item.dataAdmin().name
                    itemDataAdminName = itemDataAdmin.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            brite.outdoor.utils.DataAccessStrategyKt.loadImageAvatar(this.imgAvatar, "ff", itemUrlPrefixAvatar, 150, (java.lang.Object)null);
            brite.outdoor.utils.DataAccessStrategyKt.setTimeDay(this.tvDay, itemCreatedTime);
            brite.outdoor.utils.DataAccessStrategyKt.setTimeMonth(this.tvMonth, itemCreatedTime);
            brite.outdoor.utils.DataAccessStrategyKt.setText(this.tvName, itemDataAdminName);
            brite.outdoor.utils.DataAccessStrategyKt.setTimePostNews(this.tvTime, itemCreatedTime);
            brite.outdoor.utils.DataAccessStrategyKt.setText(this.tvTitle, itemTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}