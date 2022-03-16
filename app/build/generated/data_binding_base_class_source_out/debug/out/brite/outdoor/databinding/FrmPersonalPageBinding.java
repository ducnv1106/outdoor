// Generated by view binder compiler. Do not edit!
package brite.outdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import brite.outdoor.R;
import brite.outdoor.ui.widgets.CustomImageButton;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FrmPersonalPageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final CustomImageButton btnBack;

  @NonNull
  public final LinearLayout btnFollow;

  @NonNull
  public final TextView btnFollowUser;

  @NonNull
  public final LinearLayout btnFollowers;

  @NonNull
  public final LinearLayout btnLike;

  @NonNull
  public final CustomImageButton btnSetting;

  @NonNull
  public final ConstraintLayout clController;

  @NonNull
  public final ConstraintLayout clInteractive;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final View imageHolder;

  @NonNull
  public final ImageView imgAvatar;

  @NonNull
  public final ImageView imgNumberLike;

  @NonNull
  public final LayoutApiLoadFailedBinding ltRetry;

  @NonNull
  public final RecyclerView rcPersonalPage;

  @NonNull
  public final ShimmerFrameLayout rcShimmerFrameLayout;

  @NonNull
  public final ShimmerFrameLayout shimmerFrameLayout;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final CollapsingToolbarLayout toolbarLayout;

  @NonNull
  public final TextView tvNumberFollow;

  @NonNull
  public final TextView tvNumberFollowDes;

  @NonNull
  public final TextView tvNumberFollowers;

  @NonNull
  public final TextView tvNumberFollowersDes;

  @NonNull
  public final TextView tvNumberLike;

  @NonNull
  public final View viewToolbar1;

  private FrmPersonalPageBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayout appBarLayout, @NonNull CustomImageButton btnBack,
      @NonNull LinearLayout btnFollow, @NonNull TextView btnFollowUser,
      @NonNull LinearLayout btnFollowers, @NonNull LinearLayout btnLike,
      @NonNull CustomImageButton btnSetting, @NonNull ConstraintLayout clController,
      @NonNull ConstraintLayout clInteractive, @NonNull ConstraintLayout constraintLayout,
      @NonNull View imageHolder, @NonNull ImageView imgAvatar, @NonNull ImageView imgNumberLike,
      @NonNull LayoutApiLoadFailedBinding ltRetry, @NonNull RecyclerView rcPersonalPage,
      @NonNull ShimmerFrameLayout rcShimmerFrameLayout,
      @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull Toolbar toolbar,
      @NonNull CollapsingToolbarLayout toolbarLayout, @NonNull TextView tvNumberFollow,
      @NonNull TextView tvNumberFollowDes, @NonNull TextView tvNumberFollowers,
      @NonNull TextView tvNumberFollowersDes, @NonNull TextView tvNumberLike,
      @NonNull View viewToolbar1) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.btnBack = btnBack;
    this.btnFollow = btnFollow;
    this.btnFollowUser = btnFollowUser;
    this.btnFollowers = btnFollowers;
    this.btnLike = btnLike;
    this.btnSetting = btnSetting;
    this.clController = clController;
    this.clInteractive = clInteractive;
    this.constraintLayout = constraintLayout;
    this.imageHolder = imageHolder;
    this.imgAvatar = imgAvatar;
    this.imgNumberLike = imgNumberLike;
    this.ltRetry = ltRetry;
    this.rcPersonalPage = rcPersonalPage;
    this.rcShimmerFrameLayout = rcShimmerFrameLayout;
    this.shimmerFrameLayout = shimmerFrameLayout;
    this.toolbar = toolbar;
    this.toolbarLayout = toolbarLayout;
    this.tvNumberFollow = tvNumberFollow;
    this.tvNumberFollowDes = tvNumberFollowDes;
    this.tvNumberFollowers = tvNumberFollowers;
    this.tvNumberFollowersDes = tvNumberFollowersDes;
    this.tvNumberLike = tvNumberLike;
    this.viewToolbar1 = viewToolbar1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FrmPersonalPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FrmPersonalPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.frm_personal_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FrmPersonalPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = rootView.findViewById(id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.btnBack;
      CustomImageButton btnBack = rootView.findViewById(id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnFollow;
      LinearLayout btnFollow = rootView.findViewById(id);
      if (btnFollow == null) {
        break missingId;
      }

      id = R.id.btnFollowUser;
      TextView btnFollowUser = rootView.findViewById(id);
      if (btnFollowUser == null) {
        break missingId;
      }

      id = R.id.btnFollowers;
      LinearLayout btnFollowers = rootView.findViewById(id);
      if (btnFollowers == null) {
        break missingId;
      }

      id = R.id.btnLike;
      LinearLayout btnLike = rootView.findViewById(id);
      if (btnLike == null) {
        break missingId;
      }

      id = R.id.btnSetting;
      CustomImageButton btnSetting = rootView.findViewById(id);
      if (btnSetting == null) {
        break missingId;
      }

      id = R.id.clController;
      ConstraintLayout clController = rootView.findViewById(id);
      if (clController == null) {
        break missingId;
      }

      id = R.id.clInteractive;
      ConstraintLayout clInteractive = rootView.findViewById(id);
      if (clInteractive == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = rootView.findViewById(id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.imageHolder;
      View imageHolder = rootView.findViewById(id);
      if (imageHolder == null) {
        break missingId;
      }

      id = R.id.imgAvatar;
      ImageView imgAvatar = rootView.findViewById(id);
      if (imgAvatar == null) {
        break missingId;
      }

      id = R.id.imgNumberLike;
      ImageView imgNumberLike = rootView.findViewById(id);
      if (imgNumberLike == null) {
        break missingId;
      }

      id = R.id.ltRetry;
      View ltRetry = rootView.findViewById(id);
      if (ltRetry == null) {
        break missingId;
      }
      LayoutApiLoadFailedBinding binding_ltRetry = LayoutApiLoadFailedBinding.bind(ltRetry);

      id = R.id.rcPersonalPage;
      RecyclerView rcPersonalPage = rootView.findViewById(id);
      if (rcPersonalPage == null) {
        break missingId;
      }

      id = R.id.rcShimmerFrameLayout;
      ShimmerFrameLayout rcShimmerFrameLayout = rootView.findViewById(id);
      if (rcShimmerFrameLayout == null) {
        break missingId;
      }

      id = R.id.shimmerFrameLayout;
      ShimmerFrameLayout shimmerFrameLayout = rootView.findViewById(id);
      if (shimmerFrameLayout == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.toolbarLayout;
      CollapsingToolbarLayout toolbarLayout = rootView.findViewById(id);
      if (toolbarLayout == null) {
        break missingId;
      }

      id = R.id.tvNumberFollow;
      TextView tvNumberFollow = rootView.findViewById(id);
      if (tvNumberFollow == null) {
        break missingId;
      }

      id = R.id.tvNumberFollowDes;
      TextView tvNumberFollowDes = rootView.findViewById(id);
      if (tvNumberFollowDes == null) {
        break missingId;
      }

      id = R.id.tvNumberFollowers;
      TextView tvNumberFollowers = rootView.findViewById(id);
      if (tvNumberFollowers == null) {
        break missingId;
      }

      id = R.id.tvNumberFollowersDes;
      TextView tvNumberFollowersDes = rootView.findViewById(id);
      if (tvNumberFollowersDes == null) {
        break missingId;
      }

      id = R.id.tvNumberLike;
      TextView tvNumberLike = rootView.findViewById(id);
      if (tvNumberLike == null) {
        break missingId;
      }

      id = R.id.viewToolbar1;
      View viewToolbar1 = rootView.findViewById(id);
      if (viewToolbar1 == null) {
        break missingId;
      }

      return new FrmPersonalPageBinding((ConstraintLayout) rootView, appBarLayout, btnBack,
          btnFollow, btnFollowUser, btnFollowers, btnLike, btnSetting, clController, clInteractive,
          constraintLayout, imageHolder, imgAvatar, imgNumberLike, binding_ltRetry, rcPersonalPage,
          rcShimmerFrameLayout, shimmerFrameLayout, toolbar, toolbarLayout, tvNumberFollow,
          tvNumberFollowDes, tvNumberFollowers, tvNumberFollowersDes, tvNumberLike, viewToolbar1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
