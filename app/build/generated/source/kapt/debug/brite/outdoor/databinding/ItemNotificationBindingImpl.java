package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNotificationBindingImpl extends ItemNotificationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 4);
        sViewsWithIds.put(R.id.clRoot, 5);
        sViewsWithIds.put(R.id.viewFooter, 6);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNotificationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemNotificationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[6]
            );
        this.imgAvatar.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDetail.setTag(null);
        this.tvTitle.setTag(null);
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
            setItem((brite.outdoor.data.api_entities.response.ResponseNotification.ListNotificationData) variable);
        }
        else if (BR.urlAvatar == variableId) {
            setUrlAvatar((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable brite.outdoor.data.api_entities.response.ResponseNotification.ListNotificationData Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setUrlAvatar(@Nullable java.lang.String UrlAvatar) {
        this.mUrlAvatar = UrlAvatar;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.urlAvatar);
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
        brite.outdoor.data.api_entities.response.ResponseNotification.ListNotificationData item = mItem;
        java.lang.String itemCComment = null;
        java.lang.String urlAvatar = mUrlAvatar;
        java.lang.String itemCreatedTime = null;
        java.lang.String itemUserNameCreated = null;
        java.lang.String itemAvatarUser = null;
        int itemType = 0;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (item != null) {
                        // read item.c_comment
                        itemCComment = item.getC_comment();
                        // read item.created_time
                        itemCreatedTime = item.getCreated_time();
                        // read item.user_name_created
                        itemUserNameCreated = item.getUser_name_created();
                        // read item.type
                        itemType = item.getType();
                    }
            }

                if (item != null) {
                    // read item.avatar_user
                    itemAvatarUser = item.getAvatar_user();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            brite.outdoor.utils.DataAccessStrategyKt.loadImageAvatar(this.imgAvatar, itemAvatarUser, urlAvatar, 0, item);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            brite.outdoor.utils.DataAccessStrategyKt.setTimeNotification(this.tvDetail, itemCreatedTime);
            brite.outdoor.utils.DataAccessStrategyKt.nameUser(this.tvTitle, itemUserNameCreated, itemType, itemCComment);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): urlAvatar
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}