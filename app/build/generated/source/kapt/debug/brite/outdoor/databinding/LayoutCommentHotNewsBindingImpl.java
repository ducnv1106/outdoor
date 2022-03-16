package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutCommentHotNewsBindingImpl extends LayoutCommentHotNewsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(42);
        sIncludes.setIncludes(4, 
            new String[] {"item_commnet_hot_news"},
            new int[] {7},
            new int[] {brite.outdoor.R.layout.item_commnet_hot_news});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clHeaderComment, 8);
        sViewsWithIds.put(R.id.tvTitleComment, 9);
        sViewsWithIds.put(R.id.btnClose, 10);
        sViewsWithIds.put(R.id.rcComment, 11);
        sViewsWithIds.put(R.id.clSendComment, 12);
        sViewsWithIds.put(R.id.btnImage, 13);
        sViewsWithIds.put(R.id.clEdtSendComment, 14);
        sViewsWithIds.put(R.id.clImageView, 15);
        sViewsWithIds.put(R.id.btnCloseImage, 16);
        sViewsWithIds.put(R.id.btnSend, 17);
        sViewsWithIds.put(R.id.icBackReply, 18);
        sViewsWithIds.put(R.id.tvTitleCommentReply, 19);
        sViewsWithIds.put(R.id.btnCloseReply, 20);
        sViewsWithIds.put(R.id.rcCommentReply, 21);
        sViewsWithIds.put(R.id.btnSeeMoreComment, 22);
        sViewsWithIds.put(R.id.imgIcArrowDownComment, 23);
        sViewsWithIds.put(R.id.clSendCommentReply, 24);
        sViewsWithIds.put(R.id.btnImageReply, 25);
        sViewsWithIds.put(R.id.clEdtSendCommentReply, 26);
        sViewsWithIds.put(R.id.clImageViewReply, 27);
        sViewsWithIds.put(R.id.imgViewReply, 28);
        sViewsWithIds.put(R.id.btnCloseImageReply, 29);
        sViewsWithIds.put(R.id.btnSendReply, 30);
        sViewsWithIds.put(R.id.layout_bottom, 31);
        sViewsWithIds.put(R.id.glStart, 32);
        sViewsWithIds.put(R.id.glEnd, 33);
        sViewsWithIds.put(R.id.closeRcViewImage, 34);
        sViewsWithIds.put(R.id.rcViewImage, 35);
        sViewsWithIds.put(R.id.layout_bottomReply, 36);
        sViewsWithIds.put(R.id.glStartReply, 37);
        sViewsWithIds.put(R.id.glEndReply, 38);
        sViewsWithIds.put(R.id.closeRcViewImageReply, 39);
        sViewsWithIds.put(R.id.rcViewImageReply, 40);
        sViewsWithIds.put(R.id.layout_bottom_keyboard, 41);
    }
    // views
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
            brite.outdoor.viewmodel.CommentHotNewsViewModel mViewModel = mMViewModel;



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
    private androidx.databinding.InverseBindingListener edtContentReplyandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mViewModel.contentPost.getValue()
            //         is mViewModel.contentPost.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtContentReply);
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
            brite.outdoor.viewmodel.CommentHotNewsViewModel mViewModel = mMViewModel;



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

    public LayoutCommentHotNewsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 42, sIncludes, sViewsWithIds));
    }
    private LayoutCommentHotNewsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[10]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[16]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[29]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[20]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[30]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[26]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[27]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[24]
            , (android.view.View) bindings[34]
            , (android.view.View) bindings[39]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[33]
            , (androidx.constraintlayout.widget.Guideline) bindings[38]
            , (androidx.constraintlayout.widget.Guideline) bindings[32]
            , (androidx.constraintlayout.widget.Guideline) bindings[37]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[18]
            , (android.widget.ImageView) bindings[23]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[28]
            , (brite.outdoor.databinding.ItemCommnetHotNewsBinding) bindings[7]
            , (brite.outdoor.ui.widgets.SwipeToHideLayout) bindings[31]
            , (brite.outdoor.ui.widgets.SwipeToHideLayout) bindings[41]
            , (brite.outdoor.ui.widgets.SwipeToHideLayout) bindings[36]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[21]
            , (androidx.recyclerview.widget.RecyclerView) bindings[35]
            , (androidx.recyclerview.widget.RecyclerView) bindings[40]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[19]
            );
        this.clComment.setTag(null);
        this.clCommentReply.setTag(null);
        this.edtContent.setTag(null);
        this.edtContentReply.setTag(null);
        this.imgView.setTag(null);
        setContainedBinding(this.itemComment);
        this.rootView.setTag(null);
        this.tvSeeMoreComment.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        itemComment.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (itemComment.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mViewModel == variableId) {
            setMViewModel((brite.outdoor.viewmodel.CommentHotNewsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMViewModel(@Nullable brite.outdoor.viewmodel.CommentHotNewsViewModel MViewModel) {
        this.mMViewModel = MViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.mViewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        itemComment.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMViewModelIsNotification((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeMViewModelEdtHint((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeMViewModelIsShowHideLayoutComment((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeItemComment((brite.outdoor.databinding.ItemCommnetHotNewsBinding) object, fieldId);
            case 4 :
                return onChangeMViewModelContentPost((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeMViewModelImagePickerComment((androidx.lifecycle.LiveData<brite.outdoor.data.entities.ImagePicker>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMViewModelIsNotification(androidx.lifecycle.LiveData<java.lang.Boolean> MViewModelIsNotification, int fieldId) {
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
    private boolean onChangeMViewModelIsShowHideLayoutComment(androidx.lifecycle.LiveData<java.lang.Boolean> MViewModelIsShowHideLayoutComment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItemComment(brite.outdoor.databinding.ItemCommnetHotNewsBinding ItemComment, int fieldId) {
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
    private boolean onChangeMViewModelImagePickerComment(androidx.lifecycle.LiveData<brite.outdoor.data.entities.ImagePicker> MViewModelImagePickerComment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        androidx.lifecycle.LiveData<java.lang.Boolean> mViewModelIsNotification = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxMViewModelIsNotificationGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxMViewModelIsShowHideLayoutCommentGetValue = false;
        java.lang.Boolean mViewModelIsShowHideLayoutCommentGetValue = null;
        int mViewModelIsNotificationViewVISIBLEViewGONE = 0;
        int mViewModelIsShowHideLayoutCommentViewVISIBLEViewGONE = 0;
        brite.outdoor.viewmodel.CommentHotNewsViewModel mViewModel = mMViewModel;
        java.lang.String mViewModelContentPostGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> mViewModelEdtHint = null;
        int mViewModelIsShowHideLayoutCommentViewGONEViewVISIBLE = 0;
        java.lang.String mViewModelEdtHintGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> mViewModelIsShowHideLayoutComment = null;
        java.lang.Boolean mViewModelIsNotificationGetValue = null;
        brite.outdoor.data.entities.ImagePicker mViewModelImagePickerCommentGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> mViewModelContentPost = null;
        androidx.lifecycle.LiveData<brite.outdoor.data.entities.ImagePicker> mViewModelImagePickerComment = null;

        if ((dirtyFlags & 0xf7L) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.isNotification
                        mViewModelIsNotification = mViewModel.isNotification();
                    }
                    updateLiveDataRegistration(0, mViewModelIsNotification);


                    if (mViewModelIsNotification != null) {
                        // read mViewModel.isNotification.getValue()
                        mViewModelIsNotificationGetValue = mViewModelIsNotification.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isNotification.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxMViewModelIsNotificationGetValue = androidx.databinding.ViewDataBinding.safeUnbox(mViewModelIsNotificationGetValue);
                if((dirtyFlags & 0xc1L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxMViewModelIsNotificationGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isNotification.getValue()) ? View.VISIBLE : View.GONE
                    mViewModelIsNotificationViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxMViewModelIsNotificationGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc2L) != 0) {

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
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.isShowHideLayoutComment
                        mViewModelIsShowHideLayoutComment = mViewModel.isShowHideLayoutComment();
                    }
                    updateLiveDataRegistration(2, mViewModelIsShowHideLayoutComment);


                    if (mViewModelIsShowHideLayoutComment != null) {
                        // read mViewModel.isShowHideLayoutComment.getValue()
                        mViewModelIsShowHideLayoutCommentGetValue = mViewModelIsShowHideLayoutComment.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isShowHideLayoutComment.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxMViewModelIsShowHideLayoutCommentGetValue = androidx.databinding.ViewDataBinding.safeUnbox(mViewModelIsShowHideLayoutCommentGetValue);
                if((dirtyFlags & 0xc4L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxMViewModelIsShowHideLayoutCommentGetValue) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isShowHideLayoutComment.getValue()) ? View.VISIBLE : View.GONE
                    mViewModelIsShowHideLayoutCommentViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxMViewModelIsShowHideLayoutCommentGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isShowHideLayoutComment.getValue()) ? View.GONE : View.VISIBLE
                    mViewModelIsShowHideLayoutCommentViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxMViewModelIsShowHideLayoutCommentGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xd0L) != 0) {

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
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.imagePickerComment
                        mViewModelImagePickerComment = mViewModel.getImagePickerComment();
                    }
                    updateLiveDataRegistration(5, mViewModelImagePickerComment);


                    if (mViewModelImagePickerComment != null) {
                        // read mViewModel.imagePickerComment.getValue()
                        mViewModelImagePickerCommentGetValue = mViewModelImagePickerComment.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            this.clComment.setVisibility(mViewModelIsShowHideLayoutCommentViewVISIBLEViewGONE);
            this.clCommentReply.setVisibility(mViewModelIsShowHideLayoutCommentViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.edtContent.setHint(mViewModelEdtHintGetValue);
            this.edtContentReply.setHint(mViewModelEdtHintGetValue);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtContent, mViewModelContentPostGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtContentReply, mViewModelContentPostGetValue);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtContent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtContentandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtContentReply, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtContentReplyandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            brite.outdoor.utils.binding.BindingAdapter.setImagePicker(this.imgView, mViewModelImagePickerComment);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            this.tvSeeMoreComment.setVisibility(mViewModelIsNotificationViewVISIBLEViewGONE);
        }
        executeBindingsOn(itemComment);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mViewModel.isNotification
        flag 1 (0x2L): mViewModel.edtHint
        flag 2 (0x3L): mViewModel.isShowHideLayoutComment
        flag 3 (0x4L): itemComment
        flag 4 (0x5L): mViewModel.contentPost
        flag 5 (0x6L): mViewModel.imagePickerComment
        flag 6 (0x7L): mViewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isNotification.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isNotification.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isShowHideLayoutComment.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isShowHideLayoutComment.getValue()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isShowHideLayoutComment.getValue()) ? View.GONE : View.VISIBLE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(mViewModel.isShowHideLayoutComment.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}