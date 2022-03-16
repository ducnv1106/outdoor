package brite.outdoor.ui.fragments.media

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import brite.outdoor.entity.Media
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class PreviewFragmentArgs(
  public val media: Media
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PreviewFragmentArgs {
      bundle.setClassLoader(PreviewFragmentArgs::class.java.classLoader)
      val __media : Media?
      if (bundle.containsKey("media")) {
        if (Parcelable::class.java.isAssignableFrom(Media::class.java) ||
            Serializable::class.java.isAssignableFrom(Media::class.java)) {
          __media = bundle.get("media") as Media?
        } else {
          throw UnsupportedOperationException(Media::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__media == null) {
          throw IllegalArgumentException("Argument \"media\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"media\" is missing and does not have an android:defaultValue")
      }
      return PreviewFragmentArgs(__media)
    }
  }
}
