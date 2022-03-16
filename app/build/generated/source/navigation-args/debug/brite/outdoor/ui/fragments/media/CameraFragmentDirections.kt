package brite.outdoor.ui.fragments.media

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import brite.outdoor.R
import brite.outdoor.entity.Media
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class CameraFragmentDirections private constructor() {
  private data class ActionCameraToPreview(
    public val media: Media
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_camera_to_preview

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Media::class.java)) {
        result.putParcelable("media", this.media as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Media::class.java)) {
        result.putSerializable("media", this.media as Serializable)
      } else {
        throw UnsupportedOperationException(Media::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionCameraToPreview(media: Media): NavDirections = ActionCameraToPreview(media)

    public fun actionCameraToVideo(): NavDirections =
        ActionOnlyNavDirections(R.id.action_camera_to_video)
  }
}
