package brite.outdoor.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import brite.outdoor.constants.AppConst.Companion.FRM_WELCOME
import brite.outdoor.constants.AppConst.Companion.STATUS_BAR_WHITE
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.databinding.FrmWelcomeBinding
import brite.outdoor.utils.setSingleClick

class FrmWelcome : BaseFragment<FrmWelcomeBinding>() {

    override fun loadControlsAndResize(binding: FrmWelcomeBinding?) {
        binding?.apply {
            imgNext.layoutParams.width=getSizeWithScale(32.0)
            imgNext.layoutParams.height=getSizeWithScale(32.0)
        }
    }

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmWelcomeBinding {
       return FrmWelcomeBinding.inflate(inflater, container, false)
    }

    override fun initView(savedInstanceState: Bundle?) {
        getBinding()?.apply {
            imgNext.setSingleClick {
                mActivity?.showLogin()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        PrefManager.getInstance(mActivity!!).writeBoolean(PrefConst.PREF_IS_FIRST_OPEN_SCREEN_WELCOME, true)
    }

    override fun getCurrentFragment(): Int = FRM_WELCOME

    override fun finish() {

    }

    override fun statusBarColor()= STATUS_BAR_WHITE
}