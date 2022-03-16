package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCommentQuestionBindingImpl extends ItemCommentQuestionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clAvatar, 4);
        sViewsWithIds.put(R.id.tvContentComment, 5);
        sViewsWithIds.put(R.id.btnSeeTextMore, 6);
        sViewsWithIds.put(R.id.imgComment, 7);
        sViewsWithIds.put(R.id.clInteractive, 8);
        sViewsWithIds.put(R.id.tvSending, 9);
        sViewsWithIds.put(R.id.clDateAndReply, 10);
        sViewsWithIds.put(R.id.tvReply, 11);
        sViewsWithIds.put(R.id.tvDelete, 12);
        sViewsWithIds.put(R.id.rcItemComment, 13);
        sViewsWithIds.put(R.id.btnSeeMore, 14);
        sViewsWithIds.put(R.id.imgIcArrowDown, 15);
        sViewsWithIds.put(R.id.tvSeeMore, 16);
        sViewsWithIds.put(R.id.viewLine, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCommentQuestionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ItemCommentQuestionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[12]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[9]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[3]
            , (android.view.View) bindings[17]
            );
        this.imgAvatar.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvName.setTag(null);
        this.tvTime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setItem((brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestion) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestion Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
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
        brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestion item = mItem;
        java.lang.String itemCreatedTime = null;
        java.lang.String itemUserNameCreated = null;
        java.lang.String itemAvatarUser = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.created_time
                    itemCreatedTime = item.getCreated_time();
                    // read item.user_name_created
                    itemUserNameCreated = item.getUser_name_created();
                    // read item.avatar_user
                    itemAvatarUser = item.getAvatar_user();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            brite.outdoor.utils.DataAccessStrategyKt.loadImageAvatar(this.imgAvatar, itemAvatarUser, (java.lang.String)null, (int)0, (java.lang.Object)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, itemUserNameCreated);
            brite.outdoor.utils.DataAccessStrategyKt.setTimePostNews(this.tvTime, itemCreatedTime);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}