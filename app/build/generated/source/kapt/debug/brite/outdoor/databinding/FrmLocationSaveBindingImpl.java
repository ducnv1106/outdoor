package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FrmLocationSaveBindingImpl extends FrmLocationSaveBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 3);
        sViewsWithIds.put(R.id.clToolbar, 4);
        sViewsWithIds.put(R.id.btnBack, 5);
        sViewsWithIds.put(R.id.icFilter, 6);
        sViewsWithIds.put(R.id.clFilter, 7);
        sViewsWithIds.put(R.id.edtFilter, 8);
        sViewsWithIds.put(R.id.closeFilter, 9);
        sViewsWithIds.put(R.id.tvTitle, 10);
        sViewsWithIds.put(R.id.clMap, 11);
        sViewsWithIds.put(R.id.imgMap, 12);
        sViewsWithIds.put(R.id.clNote, 13);
        sViewsWithIds.put(R.id.clBtnShare, 14);
        sViewsWithIds.put(R.id.btnshare, 15);
        sViewsWithIds.put(R.id.glW2, 16);
        sViewsWithIds.put(R.id.rootBottom, 17);
        sViewsWithIds.put(R.id.bottom_sheet, 18);
        sViewsWithIds.put(R.id.glStartContent, 19);
        sViewsWithIds.put(R.id.glEndContent, 20);
        sViewsWithIds.put(R.id.imgContent, 21);
        sViewsWithIds.put(R.id.progress, 22);
        sViewsWithIds.put(R.id.viewLineBottom, 23);
        sViewsWithIds.put(R.id.clBottom, 24);
        sViewsWithIds.put(R.id.tvPlan, 25);
        sViewsWithIds.put(R.id.tvDelete, 26);
        sViewsWithIds.put(R.id.rcView, 27);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FrmLocationSaveBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private FrmLocationSaveBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.FrameLayout) bindings[18]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[5]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[9]
            , (android.widget.AutoCompleteTextView) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[20]
            , (androidx.constraintlayout.widget.Guideline) bindings[19]
            , (androidx.constraintlayout.widget.Guideline) bindings[16]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[21]
            , (android.widget.ImageView) bindings[12]
            , (brite.outdoor.ui.widgets.ProgressView) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[27]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[17]
            , (androidx.appcompat.widget.Toolbar) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[10]
            , (android.view.View) bindings[23]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvContent.setTag(null);
        this.tvNameLocation.setTag(null);
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
        if (BR.mViewModel == variableId) {
            setMViewModel((brite.outdoor.viewmodel.LocationSaveViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMViewModel(@Nullable brite.outdoor.viewmodel.LocationSaveViewModel MViewModel) {
        this.mMViewModel = MViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.mViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMViewModelAddress((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeMViewModelLocation((androidx.lifecycle.LiveData<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMViewModelAddress(androidx.lifecycle.LiveData<java.lang.String> MViewModelAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMViewModelLocation(androidx.lifecycle.LiveData<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> MViewModelLocation, int fieldId) {
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
        brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData mViewModelLocationGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> mViewModelAddress = null;
        androidx.lifecycle.LiveData<brite.outdoor.data.api_entities.response.ResponseListCamping.ListCampingData> mViewModelLocation = null;
        java.lang.String mViewModelAddressGetValue = null;
        brite.outdoor.viewmodel.LocationSaveViewModel mViewModel = mMViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.address
                        mViewModelAddress = mViewModel.getAddress();
                    }
                    updateLiveDataRegistration(0, mViewModelAddress);


                    if (mViewModelAddress != null) {
                        // read mViewModel.address.getValue()
                        mViewModelAddressGetValue = mViewModelAddress.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.location
                        mViewModelLocation = mViewModel.getLocation();
                    }
                    updateLiveDataRegistration(1, mViewModelLocation);


                    if (mViewModelLocation != null) {
                        // read mViewModel.location.getValue()
                        mViewModelLocationGetValue = mViewModelLocation.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            brite.outdoor.utils.binding.BindingAdapter.setText(this.tvContent, mViewModelLocation);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            brite.outdoor.utils.binding.BindingAdapter.setNameLocation(this.tvNameLocation, mViewModelAddress);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mViewModel.address
        flag 1 (0x2L): mViewModel.location
        flag 2 (0x3L): mViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}