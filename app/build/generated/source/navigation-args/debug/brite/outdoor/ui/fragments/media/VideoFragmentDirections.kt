package brite.outdoor.ui.fragments.media

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import brite.outdoor.R
import brite.outdoor.entity.Media
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class VideoFragmentDirections private constructor() {
  private data class ActionVideoToPreview(
    public val media: Media
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_video_to_preview

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

  private data class ActionVideoToCamera(
    public val type: Int = 0
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_video_to_camera

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("type", this.type)
      return result
    }
  }

  public companion object {
    public fun actionVideoToPreview(media: Media): NavDirections = ActionVideoToPreview(media)

    public fun actionVideoToCamera(type: Int = 0): NavDirections = ActionVideoToCamera(type)
  }
}
