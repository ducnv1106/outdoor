package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FrmCommentQuestionBindingImpl extends FrmCommentQuestionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(29);
        sIncludes.setIncludes(1, 
            new String[] {"item_frequent_question"},
            new int[] {7},
            new int[] {brite.outdoor.R.layout.item_frequent_question});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clTopNav, 8);
        sViewsWithIds.put(R.id.glStartTopNavButton, 9);
        sViewsWithIds.put(R.id.glEndTopNavButton, 10);
        sViewsWithIds.put(R.id.glEndToolBarContent, 11);
        sViewsWithIds.put(R.id.imgBack, 12);
        sViewsWithIds.put(R.id.tvTopNavTitle, 13);
        sViewsWithIds.put(R.id.glStartContent, 14);
        sViewsWithIds.put(R.id.glEndContent, 15);
        sViewsWithIds.put(R.id.rcView, 16);
        sViewsWithIds.put(R.id.btnImage, 17);
        sViewsWithIds.put(R.id.imgIcArrowDownComment, 18);
        sViewsWithIds.put(R.id.tvSeeMoreComment, 19);
        sViewsWithIds.put(R.id.clEdtSendComment, 20);
        sViewsWithIds.put(R.id.clImageView, 21);
        sViewsWithIds.put(R.id.btnCloseImage, 22);
        sViewsWithIds.put(R.id.layoutSend, 23);
        sViewsWithIds.put(R.id.layout_bottom, 24);
        sViewsWithIds.put(R.id.glStart, 25);
        sViewsWithIds.put(R.id.glEnd, 26);
        sViewsWithIds.put(R.id.closeRcViewImage, 27);
        sViewsWithIds.put(R.id.rcViewImage, 28);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView5;
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
            brite.outdoor.viewmodel.CommentQuestionViewModel mViewModel = mMViewModel;



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

    public FrmCommentQuestionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private FrmCommentQuestionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[22]
            , (android.widget.ImageView) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.view.View) bindings[27]
            , (android.widget.EditText) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[26]
            , (androidx.constraintlayout.widget.Guideline) bindings[15]
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[25]
            , (androidx.constraintlayout.widget.Guideline) bindings[14]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[12]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (brite.outdoor.ui.widgets.SwipeToHideLayout) bindings[24]
            , (brite.outdoor.databinding.ItemFrequentQuestionBinding) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[28]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.TextView) bindings[19]
            , (brite.outdoor.utils.AutoShrinkTextView) bindings[13]
            );
        this.btnSeeMoreComment.setTag(null);
        this.edtContent.setTag(null);
        this.imgSend.setTag(null);
        this.imgView.setTag(null);
        setContainedBinding(this.layoutQuestion);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.rootView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        layoutQuestion.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (layoutQuestion.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mViewModel == variableId) {
            setMViewModel((brite.outdoor.viewmodel.CommentQuestionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMViewModel(@Nullable brite.outdoor.viewmodel.CommentQuestionViewModel MViewModel) {
        this.mMViewModel = MViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.mViewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutQuestion.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLayoutQuestion((brite.outdoor.databinding.ItemFrequentQuestionBinding) object, fieldId);
            case 1 :
                return onChangeMViewModelEdtHint((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeMViewModelIsSelectedSend((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeMViewModelLengthContent((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeMViewModelContentPost((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeMViewModelIsShowSeeMoreComment((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeMViewModelImagePickerComment((androidx.lifecycle.LiveData<brite.outdoor.data.entities.ImagePicker>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLayoutQuestion(brite.outdoor.databinding.ItemFrequentQuestionBinding LayoutQuestion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMViewModelEdtHint(androidx.lifecycle.LiveData<java.lang.String> MViewModelEdtHint, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMViewModelIsSelectedSend(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> MViewModelIsSelectedSend, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMViewModelLengthContent(androidx.lifecycle.LiveData<java.lang.Integer> MViewModelLengthContent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMViewModelContentPost(androidx.lifecycle.MutableLiveData<java.lang.String> MViewModelContentPost, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMViewModelIsShowSeeMoreComment(androidx.lifecycle.LiveData<java.lang.Boolean> MViewModelIsShowSeeMoreComment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMViewModelImagePickerComment(androidx.lifecycle.LiveData<brite.outdoor.data.entities.ImagePicker> MViewModelImagePickerComment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxMViewModelIsShowSeeMoreCommentGetValue = false;
        java.lang.Integer mViewModelLengthContentGetValue = null;
        java.lang.Boolean mViewModelIsSelectedSendGetValue = null;
        brite.outdoor.viewmodel.CommentQuestionViewModel mViewModel = mMViewModel;
        java.lang.String mViewModelContentPostGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> mViewModelEdtHint = null;
        java.lang.Boolean mViewModelIsShowSeeMoreCommentGetValue = null;
        java.lang.String mViewModelEdtHintGetValue = null;
        int mViewModelIsShowSeeMoreCommentViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> mViewModelIsSelectedSend = null;
        androidx.lifecycle.LiveData<java.lang.Integer> mViewModelLengthContent = null;
        brite.outdoor.data.entities.ImagePicker mViewModelImagePickerCommentGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> mViewModelContentPost = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> mViewModelIsShowSeeMoreComment = null;
        androidx.lifecycle.LiveData<brite.outdoor.data.entities.ImagePicker> mViewModelImagePickerComment = null;

        if ((dirtyFlags & 0x1feL) != 0) {


            if ((dirtyFlags & 0x182L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.edtHint
                        mViewModelEdtHint = mViewModel.getEdtHint();
                    }
                    updateLiveDataRegistration(1, mViewModelEdtHint);


                    if (mViewModelEdtHint != null) {
                        // read mViewModel.edtHint.getValue()
                        mViewModelEdtHintGetValue = mViewModelEdtHint.getValue();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.isSelectedSend
                        mViewModelIsSelectedSend = mViewModel.isSelectedSend();
                    }
                    updateLiveDataRegistration(2, mViewModelIsSelectedSend);


                    if (mViewModelIsSelectedSend != null) {
                        // read mViewModel.isSelectedSend.getValue()
                        mViewModelIsSelectedSendGetValue = mViewModelIsSelectedSend.getValue();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.lengthContent
                        mViewModelLengthContent = mViewModel.getLengthContent();
                    }
                    updateLiveDataRegistration(3, mViewModelLengthContent);


                    if (mViewModelLengthContent != null) {
                        // read mViewModel.lengthContent.getValue()
                        mViewModelLengthContentGetValue = mViewModelLengthContent.getValue();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.contentPost
                        mViewModelContentPost = mViewModel.getContentPost();
                    }
                    updateLiveDataRegistration(4, mViewModelContentPost);


                    if (mViewModelContentPost != null) {
                        // read mViewModel.contentPost.getValue()
                        mViewModelContentPostGetValue = mViewModelContentPost.getValue();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.isShowSeeMoreComment
                        mViewModelIsShowSeeMoreComment = mViewModel.isShowSeeMoreComment();
                    }
                    updateLiveDataRegistration(5, mViewModelIsShowSeeMoreComment);


                    if (mViewModelIsShowSeeMoreComment != null) {
                        // read mViewModel.isShowSeeMoreComment.getValue()
                        mViewModelIsShowSeeMoreCommentGetValue = mViewModelIsShowSeeMoreComment.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isShowSeeMoreComment.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxMViewModelIsShowSeeMoreCommentGetValue = androidx.databinding.ViewDataBinding.safeUnbox(mViewModelIsShowSeeMoreCommentGetValue);
                if((dirtyFlags & 0x1a0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxMViewModelIsShowSeeMoreCommentGetValue) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isShowSeeMoreComment.getValue()) ? View.VISIBLE : View.GONE
                    mViewModelIsShowSeeMoreCommentViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxMViewModelIsShowSeeMoreCommentGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.imagePickerComment
                        mViewModelImagePickerComment = mViewModel.getImagePickerComment();
                    }
                    updateLiveDataRegistration(6, mViewModelImagePickerComment);


                    if (mViewModelImagePickerComment != null) {
                        // read mViewModel.imagePickerComment.getValue()
                        mViewModelImagePickerCommentGetValue = mViewModelImagePickerComment.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            this.btnSeeMoreComment.setVisibility(mViewModelIsShowSeeMoreCommentViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            this.edtContent.setHint(mViewModelEdtHintGetValue);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtContent, mViewModelContentPostGetValue);
            brite.outdoor.utils.binding.BindingAdapter.limitLineEdt(this.edtContent, mViewModelContentPost);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtContent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtContentandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            brite.outdoor.utils.binding.BindingAdapter.setSelectedImageViewSend(this.imgSend, mViewModelIsSelectedSend);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            brite.outdoor.utils.binding.BindingAdapter.setImagePicker(this.imgView, mViewModelImagePickerComment);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            brite.outdoor.utils.binding.BindingAdapter.setLiveDataLength(this.mboundView5, mViewModelLengthContent);
        }
        executeBindingsOn(layoutQuestion);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutQuestion
        flag 1 (0x2L): mViewModel.edtHint
        flag 2 (0x3L): mViewModel.isSelectedSend
        flag 3 (0x4L): mViewModel.lengthContent
        flag 4 (0x5L): mViewModel.contentPost
        flag 5 (0x6L): mViewModel.isShowSeeMoreComment
        flag 6 (0x7L): mViewModel.imagePickerComment
        flag 7 (0x8L): mViewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isShowSeeMoreComment.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isShowSeeMoreComment.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}