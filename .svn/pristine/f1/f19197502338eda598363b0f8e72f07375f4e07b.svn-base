package brite.outdoor.ui.widgets.anchorbottomsheet

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2


object ViewPager2Utils {
    fun getCurrentView(viewPager: ViewPager2): View? {
        val currentItem = viewPager.currentItem
        val recyclerView = viewPager.getChildAt(0) as RecyclerView
        return if (recyclerView.childCount > currentItem) {
            recyclerView.getChildAt(currentItem)
        } else null
    }
}