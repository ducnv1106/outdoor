package brite.outdoor.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import brite.outdoor.R
import brite.outdoor.adapter.AdapterIntro
import brite.outdoor.adapter.AdapterViewPageIntro
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.AppConst.Companion.FRM_INTRO
import brite.outdoor.constants.AppConst.Companion.STATUS_BAR_MAIN
import brite.outdoor.constants.AppConst.Companion.STATUS_BAR_WHITE
import brite.outdoor.constants.ExtraConst
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_IS_FROM_LOGIN
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.entities.BackStackData
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.databinding.FrmIntroBinding
import brite.outdoor.entity.EntityIntro
import brite.outdoor.utils.setSingleClick
import java.util.ArrayList
import java.util.HashMap

class FrmIntro : BaseFragment<FrmIntroBinding>() {
    private var counterPageScroll = 0
    private var isFromLogin: Boolean=false
    companion object{
        fun getInstance(
            isFromLogin:Boolean
        ): FrmIntro {
            val fragment = FrmIntro()
            val data=Bundle()
            data.putBoolean(EXTRA_IS_FROM_LOGIN,isFromLogin)
            fragment.arguments = data
            return fragment
        }
    }

    private var arrayListIntro = arrayListOf<EntityIntro>(
        EntityIntro(R.string.lblTextTitleIntro1,R.string.lblTextIntro1,R.drawable.img_onboarding1),
        EntityIntro(R.string.lblTextTitleIntro2,R.string.lblTextIntro2,R.drawable.img_onboarding2),
        EntityIntro(R.string.lblTextTitleIntro3,R.string.lblTextIntro3,R.drawable.img_onboarding3),
        EntityIntro(R.string.lblTextTitleIntro4,R.string.lblTextIntro4,R.drawable.img_onboarding4),
        EntityIntro(R.string.lblTextTitleIntro6,R.string.lblTextIntro6,R.drawable.img_onboarding6),
        EntityIntro(R.string.lblTextTitleIntro5,R.string.lblTextIntro5,R.drawable.img_onboarding5)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.apply {
            isFromLogin=getBoolean(EXTRA_IS_FROM_LOGIN)
        }
    }

    override fun loadControlsAndResize(binding: FrmIntroBinding?) {
        binding?.apply {
            imgNext.layoutParams.width=getSizeWithScale(32.0)
            imgNext.layoutParams.height=getSizeWithScale(32.0)
        }
    }

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmIntroBinding {
        return FrmIntroBinding.inflate(inflater, container, false)

    }

    override fun initView(savedInstanceState: Bundle?) {
//        val mWidthImages = getSizeWithScale(375.5)
//        val mHeightImages = getSizeWithScale(812.0)
        getBinding()?.apply {
            viewPager.adapter = AdapterIntro(requireContext(),arrayListIntro)
            viewPager.apply {
                offscreenPageLimit=3
                clipChildren = false
                clipToPadding = false
                getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
//                val compositePageTransformer = CompositePageTransformer()
//                compositePageTransformer.addTransformer(MarginPageTransformer(MyApplication.getInstance().getSizeWithScale(20.0)))
//                setPageTransformer(compositePageTransformer)

            }

            viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {
                    if (position == arrayListIntro.size-1) {
                        if (counterPageScroll != 0) {
                            if (isFromLogin) gotoHome()
                            else mActivity?.closeSettingScreen(this@FrmIntro)
                        }
                        counterPageScroll++
                    } else {
                        counterPageScroll = 0
                    }

                    super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                }
            })
            imgNext.setSingleClick {
               try {
                   if (counterPageScroll != 0) {
                       if (isFromLogin) gotoHome()
                       else mActivity?.closeSettingScreen(this@FrmIntro)
                   }
                   viewPager.currentItem = viewPager.currentItem.plus(1)
               }catch (e:Exception){
                   e.printStackTrace()
               }

            }
        }
    }

    private fun gotoHome(){
        PrefManager.getInstance(mActivity!!).writeBoolean(PrefConst.PREF_IS_FIRST_OPEN_APP, true)
        mActivity?.showHome()
    }

    override fun getCurrentFragment(): Int {
        return FRM_INTRO
    }

    override fun finish() {
    }

    override fun statusBarColor() = STATUS_BAR_WHITE
}
