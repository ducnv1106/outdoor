// Generated by view binder compiler. Do not edit!
package brite.outdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import brite.outdoor.R;
import com.google.android.exoplayer2.ui.PlayerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPageImageBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ConstraintLayout clPlayVideo;

  @NonNull
  public final PlayerView playerView;

  @NonNull
  public final PlayerView playerViewFullScreen;

  @NonNull
  public final ImageView progress;

  private ItemPageImageBinding(@NonNull RelativeLayout rootView,
      @NonNull ConstraintLayout clPlayVideo, @NonNull PlayerView playerView,
      @NonNull PlayerView playerViewFullScreen, @NonNull ImageView progress) {
    this.rootView = rootView;
    this.clPlayVideo = clPlayVideo;
    this.playerView = playerView;
    this.playerViewFullScreen = playerViewFullScreen;
    this.progress = progress;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPageImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPageImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_page_image, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPageImageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.clPlayVideo;
      ConstraintLayout clPlayVideo = rootView.findViewById(id);
      if (clPlayVideo == null) {
        break missingId;
      }

      id = R.id.playerView;
      PlayerView playerView = rootView.findViewById(id);
      if (playerView == null) {
        break missingId;
      }

      id = R.id.playerViewFullScreen;
      PlayerView playerViewFullScreen = rootView.findViewById(id);
      if (playerViewFullScreen == null) {
        break missingId;
      }

      id = R.id.progress;
      ImageView progress = rootView.findViewById(id);
      if (progress == null) {
        break missingId;
      }

      return new ItemPageImageBinding((RelativeLayout) rootView, clPlayVideo, playerView,
          playerViewFullScreen, progress);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
