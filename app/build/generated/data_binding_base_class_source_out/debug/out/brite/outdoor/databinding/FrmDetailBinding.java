// Generated by view binder compiler. Do not edit!
package brite.outdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import brite.outdoor.R;
import brite.outdoor.ui.widgets.CustomImageButton;
import brite.outdoor.ui.widgets.CustomLayoutInteractive;
import brite.outdoor.ui.widgets.ShowMoreTextView;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FrmDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final CustomImageButton btnBack;

  @NonNull
  public final CustomLayoutInteractive btnComment;

  @NonNull
  public final CustomLayoutInteractive btnLike;

  @NonNull
  public final ImageView btnMenu;

  @NonNull
  public final CustomLayoutInteractive btnShare;

  @NonNull
  public final CoordinatorLayout clBodyDetail;

  @NonNull
  public final ConstraintLayout clBottom;

  @NonNull
  public final ConstraintLayout clBtnTab;

  @NonNull
  public final ConstraintLayout clDetail;

  @NonNull
  public final ConstraintLayout clHeader;

  @NonNull
  public final ConstraintLayout clInteractive;

  @NonNull
  public final ConstraintLayout clPlace;

  @NonNull
  public final Guideline glEndClBottom;

  @NonNull
  public final Guideline glStartClBottom;

  @NonNull
  public final ImageView imgLocation;

  @NonNull
  public final CustomImageButton imgPin;

  @NonNull
  public final CustomImageButton imgSetPlan;

  @NonNull
  public final ImageView imgTopDetail;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final RecyclerView rcDetail;

  @NonNull
  public final TextView tvAddress;

  @NonNull
  public final TextView tvBy;

  @NonNull
  public final TextView tvComment;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvLikes;

  @NonNull
  public final TextView tvPostedBy;

  @NonNull
  public final TextView tvShare;

  @NonNull
  public final ShowMoreTextView tvTitle;

  @NonNull
  public final ConstraintLayout tvViewBlank;

  private FrmDetailBinding(@NonNull ConstraintLayout rootView, @NonNull AppBarLayout appBar,
      @NonNull CustomImageButton btnBack, @NonNull CustomLayoutInteractive btnComment,
      @NonNull CustomLayoutInteractive btnLike, @NonNull ImageView btnMenu,
      @NonNull CustomLayoutInteractive btnShare, @NonNull CoordinatorLayout clBodyDetail,
      @NonNull ConstraintLayout clBottom, @NonNull ConstraintLayout clBtnTab,
      @NonNull ConstraintLayout clDetail, @NonNull ConstraintLayout clHeader,
      @NonNull ConstraintLayout clInteractive, @NonNull ConstraintLayout clPlace,
      @NonNull Guideline glEndClBottom, @NonNull Guideline glStartClBottom,
      @NonNull ImageView imgLocation, @NonNull CustomImageButton imgPin,
      @NonNull CustomImageButton imgSetPlan, @NonNull ImageView imgTopDetail,
      @NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView rcDetail,
      @NonNull TextView tvAddress, @NonNull TextView tvBy, @NonNull TextView tvComment,
      @NonNull TextView tvDate, @NonNull TextView tvLikes, @NonNull TextView tvPostedBy,
      @NonNull TextView tvShare, @NonNull ShowMoreTextView tvTitle,
      @NonNull ConstraintLayout tvViewBlank) {
    this.rootView = rootView;
    this.appBar = appBar;
    this.btnBack = btnBack;
    this.btnComment = btnComment;
    this.btnLike = btnLike;
    this.btnMenu = btnMenu;
    this.btnShare = btnShare;
    this.clBodyDetail = clBodyDetail;
    this.clBottom = clBottom;
    this.clBtnTab = clBtnTab;
    this.clDetail = clDetail;
    this.clHeader = clHeader;
    this.clInteractive = clInteractive;
    this.clPlace = clPlace;
    this.glEndClBottom = glEndClBottom;
    this.glStartClBottom = glStartClBottom;
    this.imgLocation = imgLocation;
    this.imgPin = imgPin;
    this.imgSetPlan = imgSetPlan;
    this.imgTopDetail = imgTopDetail;
    this.nestedScrollView = nestedScrollView;
    this.rcDetail = rcDetail;
    this.tvAddress = tvAddress;
    this.tvBy = tvBy;
    this.tvComment = tvComment;
    this.tvDate = tvDate;
    this.tvLikes = tvLikes;
    this.tvPostedBy = tvPostedBy;
    this.tvShare = tvShare;
    this.tvTitle = tvTitle;
    this.tvViewBlank = tvViewBlank;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FrmDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FrmDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.frm_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FrmDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBar;
      AppBarLayout appBar = rootView.findViewById(id);
      if (appBar == null) {
        break missingId;
      }

      id = R.id.btnBack;
      CustomImageButton btnBack = rootView.findViewById(id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnComment;
      CustomLayoutInteractive btnComment = rootView.findViewById(id);
      if (btnComment == null) {
        break missingId;
      }

      id = R.id.btnLike;
      CustomLayoutInteractive btnLike = rootView.findViewById(id);
      if (btnLike == null) {
        break missingId;
      }

      id = R.id.btnMenu;
      ImageView btnMenu = rootView.findViewById(id);
      if (btnMenu == null) {
        break missingId;
      }

      id = R.id.btnShare;
      CustomLayoutInteractive btnShare = rootView.findViewById(id);
      if (btnShare == null) {
        break missingId;
      }

      id = R.id.clBodyDetail;
      CoordinatorLayout clBodyDetail = rootView.findViewById(id);
      if (clBodyDetail == null) {
        break missingId;
      }

      id = R.id.clBottom;
      ConstraintLayout clBottom = rootView.findViewById(id);
      if (clBottom == null) {
        break missingId;
      }

      id = R.id.clBtnTab;
      ConstraintLayout clBtnTab = rootView.findViewById(id);
      if (clBtnTab == null) {
        break missingId;
      }

      id = R.id.clDetail;
      ConstraintLayout clDetail = rootView.findViewById(id);
      if (clDetail == null) {
        break missingId;
      }

      id = R.id.clHeader;
      ConstraintLayout clHeader = rootView.findViewById(id);
      if (clHeader == null) {
        break missingId;
      }

      id = R.id.clInteractive;
      ConstraintLayout clInteractive = rootView.findViewById(id);
      if (clInteractive == null) {
        break missingId;
      }

      id = R.id.clPlace;
      ConstraintLayout clPlace = rootView.findViewById(id);
      if (clPlace == null) {
        break missingId;
      }

      id = R.id.glEndClBottom;
      Guideline glEndClBottom = rootView.findViewById(id);
      if (glEndClBottom == null) {
        break missingId;
      }

      id = R.id.glStartClBottom;
      Guideline glStartClBottom = rootView.findViewById(id);
      if (glStartClBottom == null) {
        break missingId;
      }

      id = R.id.imgLocation;
      ImageView imgLocation = rootView.findViewById(id);
      if (imgLocation == null) {
        break missingId;
      }

      id = R.id.imgPin;
      CustomImageButton imgPin = rootView.findViewById(id);
      if (imgPin == null) {
        break missingId;
      }

      id = R.id.imgSetPlan;
      CustomImageButton imgSetPlan = rootView.findViewById(id);
      if (imgSetPlan == null) {
        break missingId;
      }

      id = R.id.imgTopDetail;
      ImageView imgTopDetail = rootView.findViewById(id);
      if (imgTopDetail == null) {
        break missingId;
      }

      id = R.id.nestedScrollView;
      NestedScrollView nestedScrollView = rootView.findViewById(id);
      if (nestedScrollView == null) {
        break missingId;
      }

      id = R.id.rcDetail;
      RecyclerView rcDetail = rootView.findViewById(id);
      if (rcDetail == null) {
        break missingId;
      }

      id = R.id.tvAddress;
      TextView tvAddress = rootView.findViewById(id);
      if (tvAddress == null) {
        break missingId;
      }

      id = R.id.tvBy;
      TextView tvBy = rootView.findViewById(id);
      if (tvBy == null) {
        break missingId;
      }

      id = R.id.tvComment;
      TextView tvComment = rootView.findViewById(id);
      if (tvComment == null) {
        break missingId;
      }

      id = R.id.tvDate;
      TextView tvDate = rootView.findViewById(id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tvLikes;
      TextView tvLikes = rootView.findViewById(id);
      if (tvLikes == null) {
        break missingId;
      }

      id = R.id.tvPostedBy;
      TextView tvPostedBy = rootView.findViewById(id);
      if (tvPostedBy == null) {
        break missingId;
      }

      id = R.id.tvShare;
      TextView tvShare = rootView.findViewById(id);
      if (tvShare == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      ShowMoreTextView tvTitle = rootView.findViewById(id);
      if (tvTitle == null) {
        break missingId;
      }

      id = R.id.tvViewBlank;
      ConstraintLayout tvViewBlank = rootView.findViewById(id);
      if (tvViewBlank == null) {
        break missingId;
      }

      return new FrmDetailBinding((ConstraintLayout) rootView, appBar, btnBack, btnComment, btnLike,
          btnMenu, btnShare, clBodyDetail, clBottom, clBtnTab, clDetail, clHeader, clInteractive,
          clPlace, glEndClBottom, glStartClBottom, imgLocation, imgPin, imgSetPlan, imgTopDetail,
          nestedScrollView, rcDetail, tvAddress, tvBy, tvComment, tvDate, tvLikes, tvPostedBy,
          tvShare, tvTitle, tvViewBlank);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
