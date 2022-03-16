package brite.outdoor.databinding;
import brite.outdoor.R;
import brite.outdoor.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNewsBindingImpl extends ItemNewsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewLine, 10);
        sViewsWithIds.put(R.id.clItemNews, 11);
        sViewsWithIds.put(R.id.imgMenu, 12);
        sViewsWithIds.put(R.id.imgLocation, 13);
        sViewsWithIds.put(R.id.clTitleAndImg, 14);
        sViewsWithIds.put(R.id.playView, 15);
        sViewsWithIds.put(R.id.imgPost, 16);
        sViewsWithIds.put(R.id.progress, 17);
        sViewsWithIds.put(R.id.glH7, 18);
        sViewsWithIds.put(R.id.layoutDate, 19);
        sViewsWithIds.put(R.id.viewFooter, 20);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNewsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ItemNewsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (brite.outdoor.ui.widgets.CustomLayoutInteractive) bindings[9]
            , (brite.outdoor.ui.widgets.CustomLayoutInteractive) bindings[7]
            , (brite.outdoor.ui.widgets.CustomLayoutInteractive) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.Guideline) bindings[18]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[1]
            , (android.widget.ImageView) bindings[13]
            , (brite.outdoor.ui.widgets.CustomImageButton) bindings[12]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.LinearLayout) bindings[19]
            , (com.google.android.exoplayer2.ui.PlayerView) bindings[15]
            , (brite.outdoor.ui.widgets.ProgressView) bindings[17]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[6]
            , (brite.outdoor.ui.widgets.NoPaddingTextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[10]
            );
        this.btnComment.setTag(null);
        this.btnLike.setTag(null);
        this.btnShare.setTag(null);
        this.imgAvatar.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDay.setTag(null);
        this.tvMonth.setTag(null);
        this.tvName.setTag(null);
        this.tvTime.setTag(null);
        this.tvTitle.setTag(null);
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
            setItem((brite.outdoor.data.api_entities.response.ListPostUserData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable brite.outdoor.data.api_entities.response.ListPostUserData Item) {
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
        brite.outdoor.data.api_entities.response.ListPostUserData item = mItem;
        java.lang.Integer itemShareCount = null;
        java.lang.String itemAvatarUser = null;
        java.lang.String itemTitle = null;
        java.lang.Integer itemCommentCount = null;
        java.lang.String itemUrlPrefixAvatar = null;
        java.lang.String itemCreatedTime = null;
        java.lang.Integer itemLikeCount = null;
        java.lang.String itemUserNameCreated = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.share_count
                    itemShareCount = item.getShare_count();
                    // read item.avatar_user
                    itemAvatarUser = item.getAvatar_user();
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.comment_count
                    itemCommentCount = item.getComment_count();
                    // read item.url_prefix_avatar
                    itemUrlPrefixAvatar = item.getUrl_prefix_avatar();
                    // read item.created_time
                    itemCreatedTime = item.getCreated_time();
                    // read item.like_count
                    itemLikeCount = item.getLike_count();
                    // read item.user_name_created
                    itemUserNameCreated = item.getUser_name_created();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            brite.outdoor.utils.DataAccessStrategyKt.setLikeCommentShare(this.btnComment, itemCommentCount);
            brite.outdoor.utils.DataAccessStrategyKt.setLikeCommentShare(this.btnLike, itemLikeCount);
            brite.outdoor.utils.DataAccessStrategyKt.setLikeCommentShare(this.btnShare, itemShareCount);
            brite.outdoor.utils.DataAccessStrategyKt.loadImageAvatar(this.imgAvatar, itemAvatarUser, itemUrlPrefixAvatar, 150, (java.lang.Object)null);
            brite.outdoor.utils.DataAccessStrategyKt.setTimeDay(this.tvDay, itemCreatedTime);
            brite.outdoor.utils.DataAccessStrategyKt.setTimeMonth(this.tvMonth, itemCreatedTime);
            brite.outdoor.utils.DataAccessStrategyKt.setText(this.tvName, itemUserNameCreated);
            brite.outdoor.utils.DataAccessStrategyKt.setTimePostNews(this.tvTime, itemCreatedTime);
            brite.outdoor.utils.DataAccessStrategyKt.setText(this.tvTitle, itemTitle);
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