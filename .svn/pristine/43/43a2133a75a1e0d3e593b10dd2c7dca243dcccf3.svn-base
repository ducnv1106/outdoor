package brite.outdoor.ui.widgets.anchorbottomsheet

import android.util.Log
import android.view.View
import androidx.viewpager.widget.ViewPager


object ViewPagerUtils {
    fun getCurrentView(viewPager: ViewPager): View? {
        try {
            val currentItem = viewPager.currentItem
            for (i in 0 until viewPager.childCount) {
                val child = viewPager.getChildAt(i)
                val layoutParams = child.layoutParams as ViewPager.LayoutParams
                val f = layoutParams.javaClass.getDeclaredField("position") //NoSuchFieldException
                f.isAccessible = true
                val position = f[layoutParams] as Int //IllegalAccessException
                if (!layoutParams.isDecor && currentItem == position) {
                    return child
                }
            }
        } catch (e: NoSuchFieldException) {
            Log.e("TAG", e.toString())
        } catch (e: IllegalArgumentException) {
            Log.e("TAG", e.toString())
        } catch (e: IllegalAccessException) {
            Log.e("TAG", e.toString())
        }
        return null
    }
}