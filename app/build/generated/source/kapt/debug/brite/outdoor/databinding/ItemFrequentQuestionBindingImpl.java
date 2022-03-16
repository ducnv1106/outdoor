package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFrequentQuestionBindingImpl extends ItemFrequentQuestionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewLine, 7);
        sViewsWithIds.put(R.id.clItem, 8);
        sViewsWithIds.put(R.id.guiH004, 9);
        sViewsWithIds.put(R.id.guiH996, 10);
        sViewsWithIds.put(R.id.clAvatar, 11);
        sViewsWithIds.put(R.id.clContent, 12);
        sViewsWithIds.put(R.id.viewLine1, 13);
        sViewsWithIds.put(R.id.layout_bottom, 14);
        sViewsWithIds.put(R.id.layoutLike, 15);
        sViewsWithIds.put(R.id.imgLike, 16);
        sViewsWithIds.put(R.id.tvLike, 17);
        sViewsWithIds.put(R.id.layoutComment, 18);
        sViewsWithIds.put(R.id.imgComment, 19);
        sViewsWithIds.put(R.id.imgSaved, 20);
        sViewsWithIds.put(R.id.tvSave, 21);
        sViewsWithIds.put(R.id.layoutEdit, 22);
        sViewsWithIds.put(R.id.imgEdit, 23);
        sViewsWithIds.put(R.id.tvEdit, 24);
        sViewsWithIds.put(R.id.imgTrash, 25);
        sViewsWithIds.put(R.id.tvTrash, 26);
        sViewsWithIds.put(R.id.viewLine2, 27);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFrequentQuestionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private ItemFrequentQuestionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[19]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[23]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[20]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[25]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[17]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[2]
            , (android.widget.TextView) bindings[21]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[3]
            , (android.widget.TextView) bindings[26]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[27]
            );
        this.cardView.setTag(null);
        this.imgAvatar.setTag(null);
        this.layoutSave.setTag(null);
        this.layoutTrash.setTag(null);
        this.tvContent.setTag(null);
        this.tvName.setTag(null);
        this.tvTime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.item == variableId) {
            setItem((brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData) variable);
        }
        else if (BR.isQuestionYou == variableId) {
            setIsQuestionYou((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setIsQuestionYou(@Nullable java.lang.Boolean IsQuestionYou) {
        this.mIsQuestionYou = IsQuestionYou;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isQuestionYou);
        super.requestRebind();
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
        brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData item = mItem;
        java.lang.Boolean isQuestionYou = mIsQuestionYou;
        java.lang.String itemAvatarUser = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsQuestionYou = false;
        int isQuestionYouViewGONEViewVISIBLE = 0;
        java.lang.String itemUrlPrefixAvatar = null;
        java.lang.String itemCreatedTime = null;
        java.lang.String itemUserNameCreated = null;
        int isQuestionYouViewVISIBLEViewGONE = 0;
        java.lang.String itemContent = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.avatar_user
                    itemAvatarUser = item.getAvatar_user();
                    // read item.url_prefix_avatar
                    itemUrlPrefixAvatar = item.getUrl_prefix_avatar();
                    // read item.created_time
                    itemCreatedTime = item.getCreated_time();
                    // read item.user_name_created
                    itemUserNameCreated = item.getUser_name_created();
                    // read item.content
                    itemContent = item.getContent();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isQuestionYou)
                androidxDatabindingViewDataBindingSafeUnboxIsQuestionYou = androidx.databinding.ViewDataBinding.safeUnbox(isQuestionYou);
            if((dirtyFlags & 0x6L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsQuestionYou) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isQuestionYou) ? View.GONE : View.VISIBLE
                isQuestionYouViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxIsQuestionYou) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isQuestionYou) ? View.VISIBLE : View.GONE
                isQuestionYouViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsQuestionYou) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            brite.outdoor.utils.DataAccessStrategyKt.loadImageAvatar(this.imgAvatar, itemAvatarUser, itemUrlPrefixAvatar, 150, (java.lang.Object)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvContent, itemContent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, itemUserNameCreated);
            brite.outdoor.utils.DataAccessStrategyKt.setTimePostNews(this.tvTime, itemCreatedTime);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.layoutSave.setVisibility(isQuestionYouViewGONEViewVISIBLE);
            this.layoutTrash.setVisibility(isQuestionYouViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): isQuestionYou
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(isQuestionYou) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isQuestionYou) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isQuestionYou) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isQuestionYou) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}