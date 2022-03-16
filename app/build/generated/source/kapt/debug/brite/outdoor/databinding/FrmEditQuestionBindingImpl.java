package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FrmEditQuestionBindingImpl extends FrmEditQuestionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clTopNav, 3);
        sViewsWithIds.put(R.id.glStartTopNavButton, 4);
        sViewsWithIds.put(R.id.glEndTopNavButton, 5);
        sViewsWithIds.put(R.id.glEndToolBarContent, 6);
        sViewsWithIds.put(R.id.imgBack, 7);
        sViewsWithIds.put(R.id.tvTopNavTitle, 8);
        sViewsWithIds.put(R.id.tvOver, 9);
        sViewsWithIds.put(R.id.glStartContent, 10);
        sViewsWithIds.put(R.id.glEndContent, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtContentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mViewModel.contentPost.getValue()
            //         is mViewModel.contentPost.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtContent);
            // localize variables for thread safety
            // mViewModel != null
            boolean mViewModelJavaLangObjectNull = false;
            // mViewModel.contentPost.getValue()
            java.lang.String mViewModelContentPostGetValue = null;
            // mViewModel.contentPost != null
            boolean mViewModelContentPostJavaLangObjectNull = false;
            // mViewModel.contentPost
            androidx.lifecycle.MutableLiveData<java.lang.String> mViewModelContentPost = null;
            // mViewModel
            brite.outdoor.viewmodel.EditQuestionViewModel mViewModel = mMViewModel;



            mViewModelJavaLangObjectNull = (mViewModel) != (null);
            if (mViewModelJavaLangObjectNull) {


                mViewModelContentPost = mViewModel.getContentPost();

                mViewModelContentPostJavaLangObjectNull = (mViewModelContentPost) != (null);
                if (mViewModelContentPostJavaLangObjectNull) {




                    mViewModelContentPost.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FrmEditQuestionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FrmEditQuestionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[7]
            , (brite.outdoor.utils.AutoShrinkTextView) bindings[9]
            , (brite.outdoor.utils.AutoShrinkTextView) bindings[8]
            );
        this.edtContent.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
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
            setMViewModel((brite.outdoor.viewmodel.EditQuestionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMViewModel(@Nullable brite.outdoor.viewmodel.EditQuestionViewModel MViewModel) {
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
                return onChangeMViewModelContentPost((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeMViewModelLengthContent((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMViewModelContentPost(androidx.lifecycle.MutableLiveData<java.lang.String> MViewModelContentPost, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMViewModelLengthContent(androidx.lifecycle.LiveData<java.lang.Integer> MViewModelLengthContent, int fieldId) {
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
        java.lang.String mViewModelContentPostGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> mViewModelContentPost = null;
        java.lang.Integer mViewModelLengthContentGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Integer> mViewModelLengthContent = null;
        brite.outdoor.viewmodel.EditQuestionViewModel mViewModel = mMViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.contentPost
                        mViewModelContentPost = mViewModel.getContentPost();
                    }
                    updateLiveDataRegistration(0, mViewModelContentPost);


                    if (mViewModelContentPost != null) {
                        // read mViewModel.contentPost.getValue()
                        mViewModelContentPostGetValue = mViewModelContentPost.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.lengthContent
                        mViewModelLengthContent = mViewModel.getLengthContent();
                    }
                    updateLiveDataRegistration(1, mViewModelLengthContent);


                    if (mViewModelLengthContent != null) {
                        // read mViewModel.lengthContent.getValue()
                        mViewModelLengthContentGetValue = mViewModelLengthContent.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtContent, mViewModelContentPostGetValue);
            brite.outdoor.utils.binding.BindingAdapter.limitLineEdt(this.edtContent, mViewModelContentPost);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtContent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtContentandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            brite.outdoor.utils.binding.BindingAdapter.setLiveDataLength(this.mboundView2, mViewModelLengthContent);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mViewModel.contentPost
        flag 1 (0x2L): mViewModel.lengthContent
        flag 2 (0x3L): mViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}