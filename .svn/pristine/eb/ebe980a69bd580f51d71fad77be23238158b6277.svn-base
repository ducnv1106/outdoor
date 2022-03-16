package brite.outdoor.ui.fragments

import android.app.AlertDialog
import android.content.Intent
import android.content.res.Configuration
import android.content.res.Resources
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatRadioButton
import androidx.core.app.NotificationManagerCompat
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import brite.outdoor.R
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.AppConst.Companion.FRM_SETTING
import brite.outdoor.constants.AppConst.Companion.STATUS_BAR_WHITE
import brite.outdoor.constants.AppConst.Companion.URL_POLICY
import brite.outdoor.constants.AppConst.Companion.URL_REPORT_VIOLATIONS
import brite.outdoor.constants.AppConst.Companion.URL_TERM
import brite.outdoor.constants.PrefConst
import brite.outdoor.constants.PrefConst.Companion.PREF_MULTI_LANGUAGE
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmSettingBinding
import brite.outdoor.ui.dialog.DialogDelete
import brite.outdoor.utils.resizeHeight
import brite.outdoor.utils.resizeLayout
import brite.outdoor.utils.setSingleClick
import brite.outdoor.viewmodel.AuthViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.item_intro.*
import org.greenrobot.eventbus.EventBus
import java.util.*


@AndroidEntryPoint
class FrmSetting : BaseFragment<FrmSettingBinding>(), View.OnClickListener {
    override fun loadControlsAndResize(binding: FrmSettingBinding?) {
        binding?.apply {
            btnBack.resizeLayout(getSizeWithScale(44.00), getSizeWithScale(56.00))
            switchCompat.resizeLayout(getSizeWithScale(53.0), getSizeWithScale(24.0))
            clTopNav.resizeHeight(getSizeWithScale(56.0))
            radioTransEng.resizeLayout(getSizeWithScale(19.5), getSizeWithScale(20.0))
            radioTransVie.resizeLayout(getSizeWithScale(19.5), getSizeWithScale(20.0))

            btnBack.setOnClickListener(this@FrmSetting)
            clLogout.setOnClickListener(this@FrmSetting)
            clReport.setOnClickListener(this@FrmSetting)
            clTerm.setOnClickListener(this@FrmSetting)
            clPolicy.setOnClickListener(this@FrmSetting)
            clIntro.setOnClickListener(this@FrmSetting)
            switchCompat.setOnCheckedChangeListener { _, _ ->
                if (!isCheckedChangeByCode) {
                    turnOnOffNotification()
                } else {
                    isCheckedChangeByCode = false
                }
            }
        }
    }

    private val authViewModel by viewModels<AuthViewModel>()
    private val viewModel by activityViewModels<AuthViewModel>()
    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmSettingBinding {
        return FrmSettingBinding.inflate(inflater, container, false)
    }

    override fun initView(savedInstanceState: Bundle?) {
         observeLogoutResult()
         onListenerRadio()

    }
    override fun onClick(v: View?) {
        if (!isClickAble()) return
        when (v?.id) {
            R.id.btnBack -> backToPrevious()
            R.id.clLogout -> {
                showDialogLogout()
            }
            R.id.clReport -> {
                val statusLanguage = PrefManager.getInstance(mActivity!!).getInt(PrefConst.PREF_LANGUAGE)
                openBrowser("$URL_REPORT_VIOLATIONS$statusLanguage")
            }
            R.id.clPolicy -> {
                openBrowser(URL_POLICY)
            }
            R.id.clTerm -> {
                openBrowser(URL_TERM)
            }
            R.id.clIntro ->{
                mActivity?.showIntro(false)
            }
        }
    }
    private fun openBrowser(link : String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
        startActivity(intent)
    }
    private fun showDialogLogout() {
        val dialogDelete = DialogDelete(requireContext())
        dialogDelete.apply {
            show(true,
                resources.getString(R.string.lblExit),
                resources.getString(R.string.msgConfirmLogout),
                object :
                    DialogDelete.OnDeleteAgreeOrCancel {
                    override fun onAgree() {
                        callApiLogout()
                    }
                })
        }
    }
    private fun callApiLogout() {
        val requestParam = mActivity!!.getRequestParamWithToken()
        authViewModel.requestLogout(requestParam)
    }

    private fun observeLogoutResult() {
        authViewModel.logoutResult.observe(viewLifecycleOwner, {
            try {
                shareViewModel.showOrHideLoading(it)
                if (it.status == ApiResult.Status.SUCCESS) {
                    mActivity?.logoutSNS()

                    //remove notification
                    NotificationManagerCompat.from(requireContext()).cancelAll()

                    // change locale
                    val language = PrefManager.getInstance(mActivity!!).getString(PrefConst.PREF_MULTI_LANGUAGE)
                    if (language != null) {
                        viewModel.locale=language
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        })
    }

    override fun onResume() {
        super.onResume()
        if (!isShowOnOffNotification) {
            changeStateNotificationSetting()
        }
    }

    private var isShowOnOffNotification = false
    private fun turnOnOffNotification() {
        try {
            mActivity?.let { nonNullActivity ->
                isShowOnOffNotification = true
                MaterialAlertDialogBuilder(nonNullActivity,R.style.MyThemeOverlay_MaterialComponents_MaterialAlertDialog).apply {
                    val message = resources.getString(R.string.msgNotificationTurnOn)
                    setMessage(message)
                    setPositiveButton(resources.getString(R.string.lblNavSetting)) { _, _ ->
                        try {
                            isShowOnOffNotification = false
                            val intent = Intent()
                            intent.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                            val uri = Uri.fromParts("package", nonNullActivity.packageName, null)
                            intent.data = uri
                            nonNullActivity.startActivity(intent)
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                    setNegativeButton(resources.getString(R.string.lblDeny)) { _, _ ->
                        isShowOnOffNotification = false
                        changeStateNotificationSetting()

                    }
                    setOnCancelListener {
                        isShowOnOffNotification = false
                        changeStateNotificationSetting()
                    }

                }.show()
            }
        } catch (e: Resources.NotFoundException) {
            e.printStackTrace()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * check and change state notification setting
     */
    private var isCheckedChangeByCode = false
    private fun changeStateNotificationSetting() {
        if (mActivity != null && getBinding() != null) {
            try {
                val newState = if (NotificationManagerCompat.from(mActivity!!)
                        .areNotificationsEnabled()
                ) 1 else 0

                getBinding()?.switchCompat?.apply {
                    val currentState = if (isChecked) 1 else 0
                    if (currentState != newState) {
                        isCheckedChangeByCode = true
                    }
                    isChecked = newState == 1
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
    private fun onListenerRadio(){
        try {
            getBinding()?.apply {
                var currentSelected : AppCompatRadioButton? = if (PrefManager.getInstance(requireContext()).getString(PREF_MULTI_LANGUAGE)=="vi") this.radioTransVie else this.radioTransEng
                currentSelected?.isChecked=true
                listOf<AppCompatRadioButton>(
                    this.radioTransVie, this.radioTransEng
                ).forEach {
                    it.setSingleClick { view ->
                        currentSelected?.isChecked = false
                        currentSelected = it
                        currentSelected?.isChecked = true
                        when(view.id){
                            radioTransVie.id->{
                                PrefManager.getInstance(mActivity!!).writeInt(PrefConst.PREF_LANGUAGE,
                                    AppConst.STATUS_LANGUAGE_VI
                                )
                                val language = PrefManager.getInstance(mActivity!!).getString(PrefConst.PREF_MULTI_LANGUAGE)
                                language?.let {
                                    if (it != "vi"){
                                        setLocale("vi")
                                    }
                                }
                            }
                            radioTransEng.id->{
                                PrefManager.getInstance(mActivity!!).writeInt(PrefConst.PREF_LANGUAGE,
                                    AppConst.STATUS_LANGUAGE_EN
                                )
                                val language = PrefManager.getInstance(mActivity!!).getString(PrefConst.PREF_MULTI_LANGUAGE)
                                language?.let {
                                    if (it != "en"){
                                        setLocale("en")
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    private fun setLocale(lang:String){
        val locale = Locale(lang)
        Locale.setDefault(locale)
        val config= Configuration()
        config.setLocale(locale)
        mActivity?.let {
            PrefManager.getInstance(it).writeString(PrefConst.PREF_MULTI_LANGUAGE,lang)
        }

        mActivity?.baseContext?.resources?.updateConfiguration(config,mActivity?.baseContext?.resources?.displayMetrics)

        updateUIAfterChangeLanguage()


    }
    private fun updateUIAfterChangeLanguage(){
        getBinding()?.apply {
            tvTopNavTitle.text = resources.getString(R.string.lblSetting)
            tvNotifi.text=resources.getString(R.string.lblGetNotification)
            tvPolicy.text=resources.getString(R.string.lbPolicy)
            tvTerm.text=resources.getText(R.string.lbTerm)
            tvReport.text=resources.getString(R.string.lbReportViolation)
            tvLanguage.text=resources.getString(R.string.lbTranslation)
            tvLogout.text=resources.getString(R.string.lblExit)
            tvIntro.text = resources.getString(R.string.lblIntro)
        }
    }

    override fun getCurrentFragment(): Int {
        return FRM_SETTING
    }

    override fun isBackPreviousEnable(): Boolean {
        return true
    }

    override fun backToPrevious() {
        finish()
    }


    override fun finish() {
        mActivity?.closeSettingScreen(this)
        mActivity?.clearLightStatusBar()
        val language = PrefManager.getInstance(mActivity!!).getString(PrefConst.PREF_MULTI_LANGUAGE)
        language?.let {
            if (viewModel.locale != language){
                 viewModel.locale=language
                viewModel.isChangeLanguage.value=true

            }
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.getDefault().post(true)
    }

    override fun statusBarColor() = STATUS_BAR_WHITE

}
