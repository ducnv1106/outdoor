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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import brite.outdoor.R;
import brite.outdoor.ui.widgets.CustomImageButton;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FrmMyPageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final LinearLayout btnFollow;

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
  public final LinearLayout clTabLayout;

  @NonNull
  public final Guideline glW8;

  @NonNull
  public final View imageHolder;

  @NonNull
  public final ImageView imgAvatar;

  @NonNull
  public final ImageView imgNumberLike;

  @NonNull
  public final AppCompatImageView imgQuestion;

  @NonNull
  public final LayoutBottomNavigationHomeBinding naviBottomHome;

  @NonNull
  public final ShimmerFrameLayout shimmerFrameLayout;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final CollapsingToolbarLayout toolbarLayout;

  @NonNull
  public final TextView tvArticlesSave;

  @NonNull
  public final TextView tvLocationSave;

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
  public final TextView tvYourWriting;

  @NonNull
  public final View viewToolbar1;

  @NonNull
  public final ViewPager2 vpPosts;

  private FrmMyPageBinding(@NonNull ConstraintLayout rootView, @NonNull AppBarLayout appBarLayout,
      @NonNull LinearLayout btnFollow, @NonNull LinearLayout btnFollowers,
      @NonNull LinearLayout btnLike, @NonNull CustomImageButton btnSetting,
      @NonNull ConstraintLayout clController, @NonNull ConstraintLayout clInteractive,
      @NonNull LinearLayout clTabLayout, @NonNull Guideline glW8, @NonNull View imageHolder,
      @NonNull ImageView imgAvatar, @NonNull ImageView imgNumberLike,
      @NonNull AppCompatImageView imgQuestion,
      @NonNull LayoutBottomNavigationHomeBinding naviBottomHome,
      @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull Toolbar toolbar,
      @NonNull CollapsingToolbarLayout toolbarLayout, @NonNull TextView tvArticlesSave,
      @NonNull TextView tvLocationSave, @NonNull TextView tvNumberFollow,
      @NonNull TextView tvNumberFollowDes, @NonNull TextView tvNumberFollowers,
      @NonNull TextView tvNumberFollowersDes, @NonNull TextView tvNumberLike,
      @NonNull TextView tvYourWriting, @NonNull View viewToolbar1, @NonNull ViewPager2 vpPosts) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.btnFollow = btnFollow;
    this.btnFollowers = btnFollowers;
    this.btnLike = btnLike;
    this.btnSetting = btnSetting;
    this.clController = clController;
    this.clInteractive = clInteractive;
    this.clTabLayout = clTabLayout;
    this.glW8 = glW8;
    this.imageHolder = imageHolder;
    this.imgAvatar = imgAvatar;
    this.imgNumberLike = imgNumberLike;
    this.imgQuestion = imgQuestion;
    this.naviBottomHome = naviBottomHome;
    this.shimmerFrameLayout = shimmerFrameLayout;
    this.toolbar = toolbar;
    this.toolbarLayout = toolbarLayout;
    this.tvArticlesSave = tvArticlesSave;
    this.tvLocationSave = tvLocationSave;
    this.tvNumberFollow = tvNumberFollow;
    this.tvNumberFollowDes = tvNumberFollowDes;
    this.tvNumberFollowers = tvNumberFollowers;
    this.tvNumberFollowersDes = tvNumberFollowersDes;
    this.tvNumberLike = tvNumberLike;
    this.tvYourWriting = tvYourWriting;
    this.viewToolbar1 = viewToolbar1;
    this.vpPosts = vpPosts;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FrmMyPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FrmMyPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.frm_my_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FrmMyPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = rootView.findViewById(id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.btnFollow;
      LinearLayout btnFollow = rootView.findViewById(id);
      if (btnFollow == null) {
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

      id = R.id.clTabLayout;
      LinearLayout clTabLayout = rootView.findViewById(id);
      if (clTabLayout == null) {
        break missingId;
      }

      id = R.id.glW8;
      Guideline glW8 = rootView.findViewById(id);
      if (glW8 == null) {
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

      id = R.id.imgQuestion;
      AppCompatImageView imgQuestion = rootView.findViewById(id);
      if (imgQuestion == null) {
        break missingId;
      }

      id = R.id.naviBottomHome;
      View naviBottomHome = rootView.findViewById(id);
      if (naviBottomHome == null) {
        break missingId;
      }
      LayoutBottomNavigationHomeBinding binding_naviBottomHome = LayoutBottomNavigationHomeBinding.bind(naviBottomHome);

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

      id = R.id.tvArticlesSave;
      TextView tvArticlesSave = rootView.findViewById(id);
      if (tvArticlesSave == null) {
        break missingId;
      }

      id = R.id.tvLocationSave;
      TextView tvLocationSave = rootView.findViewById(id);
      if (tvLocationSave == null) {
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

      id = R.id.tvYourWriting;
      TextView tvYourWriting = rootView.findViewById(id);
      if (tvYourWriting == null) {
        break missingId;
      }

      id = R.id.viewToolbar1;
      View viewToolbar1 = rootView.findViewById(id);
      if (viewToolbar1 == null) {
        break missingId;
      }

      id = R.id.vpPosts;
      ViewPager2 vpPosts = rootView.findViewById(id);
      if (vpPosts == null) {
        break missingId;
      }

      return new FrmMyPageBinding((ConstraintLayout) rootView, appBarLayout, btnFollow,
          btnFollowers, btnLike, btnSetting, clController, clInteractive, clTabLayout, glW8,
          imageHolder, imgAvatar, imgNumberLike, imgQuestion, binding_naviBottomHome,
          shimmerFrameLayout, toolbar, toolbarLayout, tvArticlesSave, tvLocationSave,
          tvNumberFollow, tvNumberFollowDes, tvNumberFollowers, tvNumberFollowersDes, tvNumberLike,
          tvYourWriting, viewToolbar1, vpPosts);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
