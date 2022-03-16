package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogReminderBindingImpl extends DialogReminderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clTopNav, 7);
        sViewsWithIds.put(R.id.glStartTopNavButton, 8);
        sViewsWithIds.put(R.id.glEndTopNavButton, 9);
        sViewsWithIds.put(R.id.glTopOfTopNavButton, 10);
        sViewsWithIds.put(R.id.glTopOfTopNavTitle, 11);
        sViewsWithIds.put(R.id.tvTopNavTitle, 12);
        sViewsWithIds.put(R.id.tvOver, 13);
        sViewsWithIds.put(R.id.imgBack, 14);
        sViewsWithIds.put(R.id.clContent, 15);
        sViewsWithIds.put(R.id.glStartContent, 16);
        sViewsWithIds.put(R.id.glEndContent, 17);
        sViewsWithIds.put(R.id.viewLine1, 18);
        sViewsWithIds.put(R.id.clSwitchCompat, 19);
        sViewsWithIds.put(R.id.tvSwitchCompat, 20);
        sViewsWithIds.put(R.id.viewLine2, 21);
        sViewsWithIds.put(R.id.clDate, 22);
        sViewsWithIds.put(R.id.tvReminder, 23);
        sViewsWithIds.put(R.id.viewLine3, 24);
        sViewsWithIds.put(R.id.datePicker, 25);
        sViewsWithIds.put(R.id.time_picker, 26);
        sViewsWithIds.put(R.id.viewLine4, 27);
        sViewsWithIds.put(R.id.tvNote, 28);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtNoteandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mViewModel._contentEditText.getValue()
            //         is mViewModel._contentEditText.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtNote);
            // localize variables for thread safety
            // mViewModel != null
            boolean mViewModelJavaLangObjectNull = false;
            // mViewModel._contentEditText != null
            boolean mViewModelContentEditTextJavaLangObjectNull = false;
            // mViewModel._contentEditText.getValue()
            java.lang.String mViewModelContentEditTextGetValue = null;
            // mViewModel._contentEditText
            androidx.lifecycle.MutableLiveData<java.lang.String> mViewModelContentEditText = null;
            // mViewModel
            brite.outdoor.viewmodel.ReminderViewModel mViewModel = mMViewModel;



            mViewModelJavaLangObjectNull = (mViewModel) != (null);
            if (mViewModelJavaLangObjectNull) {


                mViewModelContentEditText = mViewModel.get_contentEditText();

                mViewModelContentEditTextJavaLangObjectNull = (mViewModelContentEditText) != (null);
                if (mViewModelContentEditTextJavaLangObjectNull) {




                    mViewModelContentEditText.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener switchCompatandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mViewModel._switchCompat.getValue()
            //         is mViewModel._switchCompat.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = switchCompat.isChecked();
            // localize variables for thread safety
            // mViewModel != null
            boolean mViewModelJavaLangObjectNull = false;
            // mViewModel._switchCompat.getValue()
            java.lang.Boolean mViewModelSwitchCompatGetValue = null;
            // mViewModel._switchCompat != null
            boolean mViewModelSwitchCompatJavaLangObjectNull = false;
            // mViewModel
            brite.outdoor.viewmodel.ReminderViewModel mViewModel = mMViewModel;
            // mViewModel._switchCompat
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> mViewModelSwitchCompat = null;



            mViewModelJavaLangObjectNull = (mViewModel) != (null);
            if (mViewModelJavaLangObjectNull) {


                mViewModelSwitchCompat = mViewModel.get_switchCompat();

                mViewModelSwitchCompatJavaLangObjectNull = (mViewModelSwitchCompat) != (null);
                if (mViewModelSwitchCompatJavaLangObjectNull) {




                    mViewModelSwitchCompat.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public DialogReminderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private DialogReminderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (android.widget.DatePicker) bindings[25]
            , (android.widget.EditText) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[17]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[16]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[14]
            , (androidx.appcompat.widget.SwitchCompat) bindings[2]
            , (android.widget.TimePicker) bindings[26]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[28]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[21]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[27]
            );
        this.clReminder.setTag(null);
        this.edtNote.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.switchCompat.setTag(null);
        this.tvContent.setTag(null);
        this.tvDate.setTag(null);
        this.tvTime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setMViewModel((brite.outdoor.viewmodel.ReminderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMViewModel(@Nullable brite.outdoor.viewmodel.ReminderViewModel MViewModel) {
        this.mMViewModel = MViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.mViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMViewModelSwitchCompat((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeMViewModelDateText((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeMViewModelContentEditText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeMViewModelTimeText((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeMViewModelTitle((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMViewModelSwitchCompat(androidx.lifecycle.MutableLiveData<java.lang.Boolean> MViewModelSwitchCompat, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMViewModelDateText(androidx.lifecycle.LiveData<java.lang.String> MViewModelDateText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMViewModelContentEditText(androidx.lifecycle.MutableLiveData<java.lang.String> MViewModelContentEditText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMViewModelTimeText(androidx.lifecycle.LiveData<java.lang.String> MViewModelTimeText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMViewModelTitle(androidx.lifecycle.LiveData<java.lang.String> MViewModelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String mViewModelTitleGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxMViewModelSwitchCompatGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> mViewModelSwitchCompat = null;
        androidx.lifecycle.LiveData<java.lang.String> mViewModelDateText = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> mViewModelContentEditText = null;
        java.lang.String mViewModelTimeTextJavaLangString = null;
        brite.outdoor.viewmodel.ReminderViewModel mViewModel = mMViewModel;
        java.lang.String mViewModelDateTextGetValue = null;
        java.lang.String mViewModelContentEditTextGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> mViewModelTimeText = null;
        java.lang.String mViewModelTimeTextGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> mViewModelTitle = null;
        java.lang.Boolean mViewModelSwitchCompatGetValue = null;
        int mViewModelSwitchCompatViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel._switchCompat
                        mViewModelSwitchCompat = mViewModel.get_switchCompat();
                    }
                    updateLiveDataRegistration(0, mViewModelSwitchCompat);


                    if (mViewModelSwitchCompat != null) {
                        // read mViewModel._switchCompat.getValue()
                        mViewModelSwitchCompatGetValue = mViewModelSwitchCompat.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mViewModel._switchCompat.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxMViewModelSwitchCompatGetValue = androidx.databinding.ViewDataBinding.safeUnbox(mViewModelSwitchCompatGetValue);
                if((dirtyFlags & 0x61L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxMViewModelSwitchCompatGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mViewModel._switchCompat.getValue()) ? View.VISIBLE : View.GONE
                    mViewModelSwitchCompatViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxMViewModelSwitchCompatGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.dateText
                        mViewModelDateText = mViewModel.getDateText();
                    }
                    updateLiveDataRegistration(1, mViewModelDateText);


                    if (mViewModelDateText != null) {
                        // read mViewModel.dateText.getValue()
                        mViewModelDateTextGetValue = mViewModelDateText.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel._contentEditText
                        mViewModelContentEditText = mViewModel.get_contentEditText();
                    }
                    updateLiveDataRegistration(2, mViewModelContentEditText);


                    if (mViewModelContentEditText != null) {
                        // read mViewModel._contentEditText.getValue()
                        mViewModelContentEditTextGetValue = mViewModelContentEditText.getValue();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.timeText
                        mViewModelTimeText = mViewModel.getTimeText();
                    }
                    updateLiveDataRegistration(3, mViewModelTimeText);


                    if (mViewModelTimeText != null) {
                        // read mViewModel.timeText.getValue()
                        mViewModelTimeTextGetValue = mViewModelTimeText.getValue();
                    }


                    // read (mViewModel.timeText.getValue()) + (", ")
                    mViewModelTimeTextJavaLangString = (mViewModelTimeTextGetValue) + (", ");
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (mViewModel != null) {
                        // read mViewModel.title
                        mViewModelTitle = mViewModel.getTitle();
                    }
                    updateLiveDataRegistration(4, mViewModelTitle);


                    if (mViewModelTitle != null) {
                        // read mViewModel.title.getValue()
                        mViewModelTitleGetValue = mViewModelTitle.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.clReminder.setVisibility(mViewModelSwitchCompatViewVISIBLEViewGONE);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.switchCompat, androidxDatabindingViewDataBindingSafeUnboxMViewModelSwitchCompatGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtNote, mViewModelContentEditTextGetValue);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtNote, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtNoteandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.switchCompat, (android.widget.CompoundButton.OnCheckedChangeListener)null, switchCompatandroidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvContent, mViewModelTitleGetValue);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, mViewModelDateTextGetValue);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTime, mViewModelTimeTextJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mViewModel._switchCompat
        flag 1 (0x2L): mViewModel.dateText
        flag 2 (0x3L): mViewModel._contentEditText
        flag 3 (0x4L): mViewModel.timeText
        flag 4 (0x5L): mViewModel.title
        flag 5 (0x6L): mViewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(mViewModel._switchCompat.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(mViewModel._switchCompat.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}