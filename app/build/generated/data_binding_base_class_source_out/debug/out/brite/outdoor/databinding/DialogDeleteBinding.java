// Generated by view binder compiler. Do not edit!
package brite.outdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import brite.outdoor.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogDeleteBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView btnAgree;

  @NonNull
  public final TextView btnCancel;

  @NonNull
  public final ConstraintLayout clBtnConfirm;

  @NonNull
  public final Guideline gl50;

  @NonNull
  public final RelativeLayout rlContent;

  @NonNull
  public final ConstraintLayout rlRoot;

  @NonNull
  public final TextView tvConfirm;

  @NonNull
  public final TextView tvTitle;

  private DialogDeleteBinding(@NonNull RelativeLayout rootView, @NonNull TextView btnAgree,
      @NonNull TextView btnCancel, @NonNull ConstraintLayout clBtnConfirm, @NonNull Guideline gl50,
      @NonNull RelativeLayout rlContent, @NonNull ConstraintLayout rlRoot,
      @NonNull TextView tvConfirm, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnAgree = btnAgree;
    this.btnCancel = btnCancel;
    this.clBtnConfirm = clBtnConfirm;
    this.gl50 = gl50;
    this.rlContent = rlContent;
    this.rlRoot = rlRoot;
    this.tvConfirm = tvConfirm;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogDeleteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogDeleteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_delete, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogDeleteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAgree;
      TextView btnAgree = rootView.findViewById(id);
      if (btnAgree == null) {
        break missingId;
      }

      id = R.id.btnCancel;
      TextView btnCancel = rootView.findViewById(id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.clBtnConfirm;
      ConstraintLayout clBtnConfirm = rootView.findViewById(id);
      if (clBtnConfirm == null) {
        break missingId;
      }

      id = R.id.gl50;
      Guideline gl50 = rootView.findViewById(id);
      if (gl50 == null) {
        break missingId;
      }

      RelativeLayout rlContent = (RelativeLayout) rootView;

      id = R.id.rlRoot;
      ConstraintLayout rlRoot = rootView.findViewById(id);
      if (rlRoot == null) {
        break missingId;
      }

      id = R.id.tvConfirm;
      TextView tvConfirm = rootView.findViewById(id);
      if (tvConfirm == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = rootView.findViewById(id);
      if (tvTitle == null) {
        break missingId;
      }

      return new DialogDeleteBinding((RelativeLayout) rootView, btnAgree, btnCancel, clBtnConfirm,
          gl50, rlContent, rlRoot, tvConfirm, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
