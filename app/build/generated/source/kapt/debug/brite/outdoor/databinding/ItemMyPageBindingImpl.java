package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMyPageBindingImpl extends ItemMyPageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgMenu, 1);
        sViewsWithIds.put(R.id.clTitleAndImg, 2);
        sViewsWithIds.put(R.id.imgPost, 3);
        sViewsWithIds.put(R.id.container, 4);
        sViewsWithIds.put(R.id.glH7, 5);
        sViewsWithIds.put(R.id.tvTitle, 6);
        sViewsWithIds.put(R.id.layoutDate, 7);
        sViewsWithIds.put(R.id.tvMonth, 8);
        sViewsWithIds.put(R.id.tvDay, 9);
        sViewsWithIds.put(R.id.btnLike, 10);
        sViewsWithIds.put(R.id.btnComment, 11);
        sViewsWithIds.put(R.id.btnShare, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMyPageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ItemMyPageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (brite.outdoor.ui.widgets.CustomLayoutInteractive) bindings[11]
            , (brite.outdoor.ui.widgets.CustomLayoutInteractive) bindings[10]
            , (brite.outdoor.ui.widgets.CustomLayoutInteractive) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            );
        this.clItemNews.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}