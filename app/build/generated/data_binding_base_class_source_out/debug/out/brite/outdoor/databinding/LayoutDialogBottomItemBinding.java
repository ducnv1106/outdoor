// Generated by view binder compiler. Do not edit!
package brite.outdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import brite.outdoor.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutDialogBottomItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout clFooter;

  @NonNull
  public final ConstraintLayout clTop;

  @NonNull
  public final TextView tvBadReport;

  @NonNull
  public final TextView tvCancel;

  @NonNull
  public final TextView tvDeleteActivity;

  @NonNull
  public final TextView tvFollow;

  @NonNull
  public final TextView tvHeader;

  @NonNull
  public final TextView tvHideDiary;

  @NonNull
  public final View viewLine;

  @NonNull
  public final View viewLine1;

  @NonNull
  public final View viewLine2;

  private LayoutDialogBottomItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout clFooter, @NonNull ConstraintLayout clTop,
      @NonNull TextView tvBadReport, @NonNull TextView tvCancel, @NonNull TextView tvDeleteActivity,
      @NonNull TextView tvFollow, @NonNull TextView tvHeader, @NonNull TextView tvHideDiary,
      @NonNull View viewLine, @NonNull View viewLine1, @NonNull View viewLine2) {
    this.rootView = rootView;
    this.clFooter = clFooter;
    this.clTop = clTop;
    this.tvBadReport = tvBadReport;
    this.tvCancel = tvCancel;
    this.tvDeleteActivity = tvDeleteActivity;
    this.tvFollow = tvFollow;
    this.tvHeader = tvHeader;
    this.tvHideDiary = tvHideDiary;
    this.viewLine = viewLine;
    this.viewLine1 = viewLine1;
    this.viewLine2 = viewLine2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutDialogBottomItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutDialogBottomItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_dialog_bottom_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutDialogBottomItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.clFooter;
      ConstraintLayout clFooter = rootView.findViewById(id);
      if (clFooter == null) {
        break missingId;
      }

      id = R.id.clTop;
      ConstraintLayout clTop = rootView.findViewById(id);
      if (clTop == null) {
        break missingId;
      }

      id = R.id.tvBadReport;
      TextView tvBadReport = rootView.findViewById(id);
      if (tvBadReport == null) {
        break missingId;
      }

      id = R.id.tvCancel;
      TextView tvCancel = rootView.findViewById(id);
      if (tvCancel == null) {
        break missingId;
      }

      id = R.id.tvDeleteActivity;
      TextView tvDeleteActivity = rootView.findViewById(id);
      if (tvDeleteActivity == null) {
        break missingId;
      }

      id = R.id.tvFollow;
      TextView tvFollow = rootView.findViewById(id);
      if (tvFollow == null) {
        break missingId;
      }

      id = R.id.tvHeader;
      TextView tvHeader = rootView.findViewById(id);
      if (tvHeader == null) {
        break missingId;
      }

      id = R.id.tvHideDiary;
      TextView tvHideDiary = rootView.findViewById(id);
      if (tvHideDiary == null) {
        break missingId;
      }

      id = R.id.viewLine;
      View viewLine = rootView.findViewById(id);
      if (viewLine == null) {
        break missingId;
      }

      id = R.id.viewLine1;
      View viewLine1 = rootView.findViewById(id);
      if (viewLine1 == null) {
        break missingId;
      }

      id = R.id.viewLine2;
      View viewLine2 = rootView.findViewById(id);
      if (viewLine2 == null) {
        break missingId;
      }

      return new LayoutDialogBottomItemBinding((ConstraintLayout) rootView, clFooter, clTop,
          tvBadReport, tvCancel, tvDeleteActivity, tvFollow, tvHeader, tvHideDiary, viewLine,
          viewLine1, viewLine2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
