package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FrmNotificationBindingImpl extends FrmNotificationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ltRetry, 2);
        sViewsWithIds.put(R.id.naviBottomHome, 3);
        sViewsWithIds.put(R.id.clTopNav, 4);
        sViewsWithIds.put(R.id.glEndToolBarContent, 5);
        sViewsWithIds.put(R.id.tvTopNavTitle, 6);
        sViewsWithIds.put(R.id.shimmerFrameLayout, 7);
        sViewsWithIds.put(R.id.rcView, 8);
        sViewsWithIds.put(R.id.imgQuestion, 9);
        sViewsWithIds.put(R.id.glW8, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FrmNotificationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FrmNotificationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (bindings[2] != null) ? brite.outdoor.databinding.LayoutApiLoadFailedHomeBinding.bind((android.view.View) bindings[2]) : null
            , (bindings[3] != null) ? brite.outdoor.databinding.LayoutBottomNavigationHomeBinding.bind((android.view.View) bindings[3]) : null
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[7]
            , (brite.outdoor.utils.AutoShrinkTextView) bindings[6]
            );
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.refreshLayout.setTag(null);
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