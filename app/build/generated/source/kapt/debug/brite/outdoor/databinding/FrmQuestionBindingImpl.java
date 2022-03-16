package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FrmQuestionBindingImpl extends FrmQuestionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rootView, 4);
        sViewsWithIds.put(R.id.clTopNav, 5);
        sViewsWithIds.put(R.id.glStartTopNavButton, 6);
        sViewsWithIds.put(R.id.glEndTopNavButton, 7);
        sViewsWithIds.put(R.id.glEndToolBarContent, 8);
        sViewsWithIds.put(R.id.imgBack, 9);
        sViewsWithIds.put(R.id.tvTopNavTitle, 10);
        sViewsWithIds.put(R.id.glStartContent, 11);
        sViewsWithIds.put(R.id.glEndContent, 12);
        sViewsWithIds.put(R.id.fmTabLayout, 13);
        sViewsWithIds.put(R.id.indicator2, 14);
        sViewsWithIds.put(R.id.indicator, 15);
        sViewsWithIds.put(R.id.tab, 16);
        sViewsWithIds.put(R.id.view_pager, 17);
        sViewsWithIds.put(R.id.layoutSend, 18);
        sViewsWithIds.put(R.id.flContainerQuestion, 19);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtContentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mQuestionViewModel.contentPost.getValue()
            //         is mQuestionViewModel.contentPost.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtContent);
            // localize variables for thread safety
            // mQuestionViewModel.contentPost != null
            boolean mQuestionViewModelContentPostJavaLangObjectNull = false;
            // mQuestionViewModel.contentPost
            androidx.lifecycle.MutableLiveData<java.lang.String> mQuestionViewModelContentPost = null;
            // mQuestionViewModel != null
            boolean mQuestionViewModelJavaLangObjectNull = false;
            // mQuestionViewModel.contentPost.getValue()
            java.lang.String mQuestionViewModelContentPostGetValue = null;
            // mQuestionViewModel
            brite.outdoor.viewmodel.QuestionViewModel mQuestionViewModel = mMQuestionViewModel;



            mQuestionViewModelJavaLangObjectNull = (mQuestionViewModel) != (null);
            if (mQuestionViewModelJavaLangObjectNull) {


                mQuestionViewModelContentPost = mQuestionViewModel.getContentPost();

                mQuestionViewModelContentPostJavaLangObjectNull = (mQuestionViewModelContentPost) != (null);
                if (mQuestionViewModelContentPostJavaLangObjectNull) {




                    mQuestionViewModelContentPost.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FrmQuestionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FrmQuestionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.EditText) bindings[1]
            , (android.widget.FrameLayout) bindings[19]
            , (android.widget.FrameLayout) bindings[13]
            , (androidx.constraintlayout.widget.Guideline) bindings[12]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[9]
            , (android.widget.ImageView) bindings[3]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.google.android.material.tabs.TabLayout) bindings[16]
            , (brite.outdoor.utils.AutoShrinkTextView) bindings[10]
            , (androidx.viewpager.widget.ViewPager) bindings[17]
            );
        this.edtContent.setTag(null);
        this.imgSend.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
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
                mDirtyFlags = 0x10L;
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
        if (BR.mQuestionViewModel == variableId) {
            setMQuestionViewModel((brite.outdoor.viewmodel.QuestionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMQuestionViewModel(@Nullable brite.outdoor.viewmodel.QuestionViewModel MQuestionViewModel) {
        this.mMQuestionViewModel = MQuestionViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.mQuestionViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMQuestionViewModelIsSelectedSend((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeMQuestionViewModelContentPost((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeMQuestionViewModelLengthContent((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMQuestionViewModelIsSelectedSend(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> MQuestionViewModelIsSelectedSend, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMQuestionViewModelContentPost(androidx.lifecycle.MutableLiveData<java.lang.String> MQuestionViewModelContentPost, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMQuestionViewModelLengthContent(androidx.lifecycle.LiveData<java.lang.Integer> MQuestionViewModelLengthContent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.Integer mQuestionViewModelLengthContentGetValue = null;
        brite.outdoor.viewmodel.QuestionViewModel mQuestionViewModel = mMQuestionViewModel;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> mQuestionViewModelIsSelectedSend = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> mQuestionViewModelContentPost = null;
        androidx.lifecycle.LiveData<java.lang.Integer> mQuestionViewModelLengthContent = null;
        java.lang.Boolean mQuestionViewModelIsSelectedSendGetValue = null;
        java.lang.String mQuestionViewModelContentPostGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (mQuestionViewModel != null) {
                        // read mQuestionViewModel.isSelectedSend
                        mQuestionViewModelIsSelectedSend = mQuestionViewModel.isSelectedSend();
                    }
                    updateLiveDataRegistration(0, mQuestionViewModelIsSelectedSend);


                    if (mQuestionViewModelIsSelectedSend != null) {
                        // read mQuestionViewModel.isSelectedSend.getValue()
                        mQuestionViewModelIsSelectedSendGetValue = mQuestionViewModelIsSelectedSend.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (mQuestionViewModel != null) {
                        // read mQuestionViewModel.contentPost
                        mQuestionViewModelContentPost = mQuestionViewModel.getContentPost();
                    }
                    updateLiveDataRegistration(1, mQuestionViewModelContentPost);


                    if (mQuestionViewModelContentPost != null) {
                        // read mQuestionViewModel.contentPost.getValue()
                        mQuestionViewModelContentPostGetValue = mQuestionViewModelContentPost.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (mQuestionViewModel != null) {
                        // read mQuestionViewModel.lengthContent
                        mQuestionViewModelLengthContent = mQuestionViewModel.getLengthContent();
                    }
                    updateLiveDataRegistration(2, mQuestionViewModelLengthContent);


                    if (mQuestionViewModelLengthContent != null) {
                        // read mQuestionViewModel.lengthContent.getValue()
                        mQuestionViewModelLengthContentGetValue = mQuestionViewModelLengthContent.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtContent, mQuestionViewModelContentPostGetValue);
            brite.outdoor.utils.binding.BindingAdapter.limitLineEdt(this.edtContent, mQuestionViewModelContentPost);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtContent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtContentandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            brite.outdoor.utils.binding.BindingAdapter.setSelectedImageViewSend(this.imgSend, mQuestionViewModelIsSelectedSend);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            brite.outdoor.utils.binding.BindingAdapter.setLiveDataLength(this.mboundView2, mQuestionViewModelLengthContent);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mQuestionViewModel.isSelectedSend
        flag 1 (0x2L): mQuestionViewModel.contentPost
        flag 2 (0x3L): mQuestionViewModel.lengthContent
        flag 3 (0x4L): mQuestionViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}