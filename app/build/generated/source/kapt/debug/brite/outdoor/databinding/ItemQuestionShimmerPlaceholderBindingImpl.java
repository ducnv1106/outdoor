package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemQuestionShimmerPlaceholderBindingImpl extends ItemQuestionShimmerPlaceholderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewLine, 1);
        sViewsWithIds.put(R.id.clItem, 2);
        sViewsWithIds.put(R.id.guiH004, 3);
        sViewsWithIds.put(R.id.guiH996, 4);
        sViewsWithIds.put(R.id.clAvatar, 5);
        sViewsWithIds.put(R.id.imgAvatar, 6);
        sViewsWithIds.put(R.id.tvName, 7);
        sViewsWithIds.put(R.id.tvTime, 8);
        sViewsWithIds.put(R.id.clContent, 9);
        sViewsWithIds.put(R.id.tvContent, 10);
        sViewsWithIds.put(R.id.viewLine1, 11);
        sViewsWithIds.put(R.id.layout_bottom, 12);
        sViewsWithIds.put(R.id.layoutLike, 13);
        sViewsWithIds.put(R.id.layoutComment, 14);
        sViewsWithIds.put(R.id.layoutEdit, 15);
        sViewsWithIds.put(R.id.viewLine2, 16);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemQuestionShimmerPlaceholderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ItemQuestionShimmerPlaceholderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[6]
            , (android.widget.LinearLayout) bindings[12]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[1]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[16]
            );
        this.cardView.setTag(null);
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