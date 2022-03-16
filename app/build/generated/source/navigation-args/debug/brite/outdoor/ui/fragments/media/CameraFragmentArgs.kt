package brite.outdoor.ui.fragments.media

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class CameraFragmentArgs(
  public val type: Int = 0
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("type", this.type)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CameraFragmentArgs {
      bundle.setClassLoader(CameraFragmentArgs::class.java.classLoader)
      val __type : Int
      if (bundle.containsKey("type")) {
        __type = bundle.getInt("type")
      } else {
        __type = 0
      }
      return CameraFragmentArgs(__type)
    }
  }
}
