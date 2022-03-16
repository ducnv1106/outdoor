package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FrmSearchVer2BindingImpl extends FrmSearchVer2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.naviBottomHome, 3);
        sViewsWithIds.put(R.id.clHeader, 4);
        sViewsWithIds.put(R.id.tvTitle, 5);
        sViewsWithIds.put(R.id.icFilter, 6);
        sViewsWithIds.put(R.id.clFilter, 7);
        sViewsWithIds.put(R.id.clSearchUser, 8);
        sViewsWithIds.put(R.id.icClSearchUser, 9);
        sViewsWithIds.put(R.id.tvSearchUser, 10);
        sViewsWithIds.put(R.id.clSearchLocation, 11);
        sViewsWithIds.put(R.id.icClLocation, 12);
        sViewsWithIds.put(R.id.tvSearchLocation, 13);
        sViewsWithIds.put(R.id.clSearchTool, 14);
        sViewsWithIds.put(R.id.icClTool, 15);
        sViewsWithIds.put(R.id.tvSearchTool, 16);
        sViewsWithIds.put(R.id.clEdtSearch, 17);
        sViewsWithIds.put(R.id.clSearchFollow, 18);
        sViewsWithIds.put(R.id.icClSearchFollow, 19);
        sViewsWithIds.put(R.id.tvSearchFollow, 20);
        sViewsWithIds.put(R.id.edtSearch, 21);
        sViewsWithIds.put(R.id.img_search, 22);
        sViewsWithIds.put(R.id.tvNoData, 23);
        sViewsWithIds.put(R.id.rvSearchWith, 24);
        sViewsWithIds.put(R.id.imgQuestion, 25);
        sViewsWithIds.put(R.id.glW8, 26);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FrmSearchVer2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FrmSearchVer2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.AutoCompleteTextView) bindings[21]
            , (androidx.constraintlayout.widget.Guideline) bindings[26]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[25]
            , (android.widget.ImageView) bindings[22]
            , (bindings[3] != null) ? brite.outdoor.databinding.LayoutBottomNavigationHomeBinding.bind((android.view.View) bindings[3]) : null
            , (androidx.recyclerview.widget.RecyclerView) bindings[24]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[1]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[2]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.shimmerFrameLayoutLocationOrUtensil.setTag(null);
        this.shimmerFrameLayoutUser.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.mSearchViewModel == variableId) {
            setMSearchViewModel((brite.outdoor.viewmodel.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMSearchViewModel(@Nullable brite.outdoor.viewmodel.SearchViewModel MSearchViewModel) {
        this.mMSearchViewModel = MSearchViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.mSearchViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMSearchViewModelIsShowHideShimmerLayoutLocationOrTool((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeMSearchViewModelIsShowHideShimmerLayoutUser((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMSearchViewModelIsShowHideShimmerLayoutLocationOrTool(androidx.lifecycle.MutableLiveData<java.lang.Boolean> MSearchViewModelIsShowHideShimmerLayoutLocationOrTool, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMSearchViewModelIsShowHideShimmerLayoutUser(androidx.lifecycle.MutableLiveData<java.lang.Boolean> MSearchViewModelIsShowHideShimmerLayoutUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        java.lang.Boolean mSearchViewModelIsShowHideShimmerLayoutUserGetValue = null;
        brite.outdoor.viewmodel.SearchViewModel mSearchViewModel = mMSearchViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> mSearchViewModelIsShowHideShimmerLayoutLocationOrTool = null;
        java.lang.Boolean mSearchViewModelIsShowHideShimmerLayoutLocationOrToolGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> mSearchViewModelIsShowHideShimmerLayoutUser = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (mSearchViewModel != null) {
                        // read mSearchViewModel.isShowHideShimmerLayoutLocationOrTool()
                        mSearchViewModelIsShowHideShimmerLayoutLocationOrTool = mSearchViewModel.isShowHideShimmerLayoutLocationOrTool();
                    }
                    updateLiveDataRegistration(0, mSearchViewModelIsShowHideShimmerLayoutLocationOrTool);


                    if (mSearchViewModelIsShowHideShimmerLayoutLocationOrTool != null) {
                        // read mSearchViewModel.isShowHideShimmerLayoutLocationOrTool().getValue()
                        mSearchViewModelIsShowHideShimmerLayoutLocationOrToolGetValue = mSearchViewModelIsShowHideShimmerLayoutLocationOrTool.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (mSearchViewModel != null) {
                        // read mSearchViewModel.isShowHideShimmerLayoutUser()
                        mSearchViewModelIsShowHideShimmerLayoutUser = mSearchViewModel.isShowHideShimmerLayoutUser();
                    }
                    updateLiveDataRegistration(1, mSearchViewModelIsShowHideShimmerLayoutUser);


                    if (mSearchViewModelIsShowHideShimmerLayoutUser != null) {
                        // read mSearchViewModel.isShowHideShimmerLayoutUser().getValue()
                        mSearchViewModelIsShowHideShimmerLayoutUserGetValue = mSearchViewModelIsShowHideShimmerLayoutUser.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            brite.outdoor.utils.binding.BindingAdapter.setShowOrHideShimmerLayout(this.shimmerFrameLayoutLocationOrUtensil, mSearchViewModelIsShowHideShimmerLayoutLocationOrTool);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            brite.outdoor.utils.binding.BindingAdapter.setShowOrHideShimmerLayout(this.shimmerFrameLayoutUser, mSearchViewModelIsShowHideShimmerLayoutUser);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mSearchViewModel.isShowHideShimmerLayoutLocationOrTool()
        flag 1 (0x2L): mSearchViewModel.isShowHideShimmerLayoutUser()
        flag 2 (0x3L): mSearchViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}