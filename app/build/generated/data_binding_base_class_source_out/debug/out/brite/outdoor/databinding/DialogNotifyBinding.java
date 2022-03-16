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
import androidx.viewbinding.ViewBinding;
import brite.outdoor.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogNotifyBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView btnOk;

  @NonNull
  public final RelativeLayout rlContent;

  @NonNull
  public final ConstraintLayout rlRoot;

  @NonNull
  public final TextView tvMessage;

  @NonNull
  public final View viewCenter;

  private DialogNotifyBinding(@NonNull RelativeLayout rootView, @NonNull TextView btnOk,
      @NonNull RelativeLayout rlContent, @NonNull ConstraintLayout rlRoot,
      @NonNull TextView tvMessage, @NonNull View viewCenter) {
    this.rootView = rootView;
    this.btnOk = btnOk;
    this.rlContent = rlContent;
    this.rlRoot = rlRoot;
    this.tvMessage = tvMessage;
    this.viewCenter = viewCenter;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogNotifyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogNotifyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_notify, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogNotifyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnOk;
      TextView btnOk = rootView.findViewById(id);
      if (btnOk == null) {
        break missingId;
      }

      RelativeLayout rlContent = (RelativeLayout) rootView;

      id = R.id.rlRoot;
      ConstraintLayout rlRoot = rootView.findViewById(id);
      if (rlRoot == null) {
        break missingId;
      }

      id = R.id.tvMessage;
      TextView tvMessage = rootView.findViewById(id);
      if (tvMessage == null) {
        break missingId;
      }

      id = R.id.viewCenter;
      View viewCenter = rootView.findViewById(id);
      if (viewCenter == null) {
        break missingId;
      }

      return new DialogNotifyBinding((RelativeLayout) rootView, btnOk, rlContent, rlRoot, tvMessage,
          viewCenter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
