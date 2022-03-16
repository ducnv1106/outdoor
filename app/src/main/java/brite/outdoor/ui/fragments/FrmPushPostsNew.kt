package brite.outdoor.ui.fragments

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.Rect
import android.location.Address
import android.location.Geocoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.util.TypedValue
import android.view.*
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.res.ResourcesCompat
import androidx.exifinterface.media.ExifInterface
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import brite.outdoor.R
import brite.outdoor.adapter.AdapterPostContentNew
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.ApiConst.Companion.PARAM_API_CONTENT
import brite.outdoor.constants.ApiConst.Companion.PARAM_API_LOCATION_ADDRESS
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.AppConst.Companion.FRM_POST_LOCATION
import brite.outdoor.constants.AppConst.Companion.FRM_POST_UTENSILS
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_EDIT_POST
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_IMAGE_PICK
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_IS_EDIT_POST
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_LOCATION_ENTITY
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_TYPE_FRAGMENT
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_UTENSILS_ENTITY
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.response.ListPostUserData
import brite.outdoor.data.api_entities.response.ResponseEditPost
import brite.outdoor.data.entities.*
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmPushPostsNewBinding
import brite.outdoor.ui.dialog.*
import brite.outdoor.ui.fragments.select_place.FrmMapNew
import brite.outdoor.utils.*
import brite.outdoor.utils.compressor.*
import brite.outdoor.viewmodel.AuthViewModel
import brite.outdoor.viewmodel.PushPostViewModel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.frm_push_posts_new.*
import kotlinx.coroutines.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.util.*
import kotlin.collections.ArrayList


@AndroidEntryPoint
class FrmPushPostsNew : BaseDialogFragment<FrmPushPostsNewBinding>(), View.OnClickListener {

    private var mAdapter: AdapterPostContentNew? = null

    private var idUser: String = ""
    private var mLat: Double? = null
    private var mLng: Double? = null
    private var locationId: String = ""
    private var locationName: String = ""
    private val pushPostViewModel by viewModels<PushPostViewModel>()
    var listContent: ArrayList<PostContentEntity>? = null
    private var imagePicker: ImagePicker? = null
    private var utensilsEntity: UtensilsEntity? = null
    private var locationEntity: LocationEntity? = null
    private var typeFragment: Int = 0
    private var entityPostNeedEdit: ListPostUserData? = null
    private val authViewModel by activityViewModels<AuthViewModel>()
    private var isEditPost: Boolean = false
    private var listImageDelete: ArrayList<String?>? = ArrayList()
    private var nameAvatar: String? = null
    private var typeVideo: Int? = null
    private var isCheckPushPost = false
    private var language: Int = 1
    private var isCheckFileExist = true
    private var heightScreen = 0
    private var isFirstOpenScreenLocationOrUtensil = false
    private fun showPopupAddImages() {
        try {
            val dlgAddImage = DialogFragmentAddImagesNew()
            dlgAddImage.show(childFragmentManager, "DialogFragmentAddImagesNew")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun showPopupEditBlock() {
        try {
            val dlgBlockContent = FrmEditBlockPost()
            dlgBlockContent.show(childFragmentManager, "FrmEditBlockPost")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    companion object {
        fun getInstance(
            location: LocationEntity? = null,
            imagePicker: ImagePicker? = null,
            utensils: UtensilsEntity? = null,
            typeFragment: Int
        ): DialogFragment {
            val fragment = FrmPushPostsNew()
            val bundle = Bundle()
            imagePicker?.let {
                bundle.putParcelable(EXTRA_IMAGE_PICK, it)
            }
            location?.let {
                bundle.putParcelable(EXTRA_LOCATION_ENTITY, it)
            }
            utensils?.let {
                bundle.putParcelable(EXTRA_UTENSILS_ENTITY, it)
            }
            bundle.putInt(EXTRA_TYPE_FRAGMENT, typeFragment)
            fragment.arguments = bundle
            return fragment
        }

        fun getInstance(
            postNeedEdit: ListPostUserData?,
            typeFragment: Int,
            isEditPost: Boolean
        ): DialogFragment {
            val fragment = FrmPushPostsNew()
            val bundle = Bundle()
            postNeedEdit?.let {
                bundle.putParcelable(EXTRA_EDIT_POST, it)
            }
            bundle.putInt(EXTRA_TYPE_FRAGMENT, typeFragment)
            bundle.putBoolean(EXTRA_IS_EDIT_POST, isEditPost)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.apply {
            utensilsEntity = this.getParcelable(EXTRA_UTENSILS_ENTITY)
            typeFragment = this.getInt(EXTRA_TYPE_FRAGMENT)
            entityPostNeedEdit = this.getParcelable(EXTRA_EDIT_POST)
            isEditPost = this.getBoolean(EXTRA_IS_EDIT_POST)
            pushPostViewModel.isEditPost = isEditPost

            language = if (PrefManager.getInstance(requireContext())
                    .getString(PrefConst.PREF_MULTI_LANGUAGE) == "vi"
            ) 1 else 2
            getHeightScreen()
            showViewKeyBoard()

        }
    }

    override fun finish() {
        showDialogCancel()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        dialog?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING)
        super.onActivityCreated(savedInstanceState)
    }

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FrmPushPostsNewBinding {
        return FrmPushPostsNewBinding.inflate(inflater, container, false)
    }

    override fun loadControlsAndResize(binding: FrmPushPostsNewBinding?) {
        binding?.apply {
            setupTopNavigation(this)
            setupContent(this)

            rlAvatar.resizeHeight(getSizeWithScale(205.0))
            btnCloseImage.resizeLayout(getSizeWithScale(24.0), getSizeWithScale(24.0))
            clTopNav.resizeHeight(getSizeWithScale(56.0))
            imgBlock.resizeHeight(getSizeWithScale(24.0))
            imgLocation.resizeHeight(getSizeWithScale(24.0))

            imagePicker?.let {
                getBinding()?.clImgAvatar?.visibility = View.VISIBLE
                imgAvatar.loadImageUrl(it.uri)
            }

            btnPushPost.setOnClickListener(this@FrmPushPostsNew)
            btnBack.setOnClickListener(this@FrmPushPostsNew)
            imgAvatar.setOnClickListener(this@FrmPushPostsNew)
            tvUpload.setOnClickListener(this@FrmPushPostsNew)
            imgBlock.setOnClickListener(this@FrmPushPostsNew)

            imgLocation.setSingleClick {
                if (typeFragment == FRM_POST_LOCATION) FrmMapNew().show(
                    childFragmentManager,
                    "FrmPushPostsNew"
                )
                else if (typeFragment == FRM_POST_UTENSILS) FrmSelectedUtensilsNew().show(
                    childFragmentManager,
                    "FrmPushPostsNew"
                )
                isFirstOpenScreenLocationOrUtensil = true
            }
            tvLocationOrUtensil.setSingleClick {
                if (typeFragment == FRM_POST_LOCATION) FrmMapNew().show(
                    childFragmentManager,
                    "FrmPushPostsNew"
                )
                else if (typeFragment == FRM_POST_UTENSILS) FrmSelectedUtensilsNew().show(
                    childFragmentManager,
                    "FrmPushPostsNew"
                )
                isFirstOpenScreenLocationOrUtensil = true
            }

        }
    }

    private fun handlePushPost() {
        val enablePushPost = enablePushPost()
        if (enablePushPost) {

            mActivity?.showProgress(false) // show progress when wait resize image
            if (pushPostViewModel.isEditPost) {
                if (imagePicker?.isFileToSever == false) {
                    if (imagePicker == null || !isFileExist(
                            imagePicker?.path ?: "",
                            Uri.parse(imagePicker?.uri),
                            requireContext()
                        )
                    ) { // check avatar null
                        val title = resources.getString(R.string.titlePostNoLongerExists)
                        val message = resources.getString(R.string.msgConfirmAvatarNotNull)
                        mActivity?.hideProgress()
                        mActivity?.showDialogExit(
                            title,
                            message,
                            object : DialogExit.CallbackListenerExit {
                                override fun onOk() {
                                    DialogFragmentAddImageAvatarNew.getInstance()
                                        .show(childFragmentManager, "DialogFragmentAddImageAvatarNew")
                                }

                                override fun onCancel() {
                                    closeScreen()
                                }

                            })
                        return
                    }
                }
                GlobalScope.launch(Dispatchers.IO) { callApiEditPost() }
            } else {
                if (imagePicker == null || !isFileExist(
                        imagePicker?.path ?: "",
                        Uri.parse(imagePicker?.uri),
                        requireContext()
                    )
                ) { // check avatar null
                    val title = resources.getString(R.string.titlePostNoLongerExists)
                    val message = resources.getString(R.string.msgConfirmAvatarNotNull)
                    mActivity?.hideProgress()
                    mActivity?.showDialogExit(
                        title,
                        message,
                        object : DialogExit.CallbackListenerExit {
                            override fun onOk() {
                                DialogFragmentAddImageAvatarNew.getInstance()
                                    .show(childFragmentManager, "DialogFragmentAddImageAvatarNew")
                            }

                            override fun onCancel() {
                                closeScreen()
                            }

                        })
                    return
                }
                GlobalScope.launch(Dispatchers.IO) { callApiPushPost() }
            }
        }
    }

    private fun enablePushPost(): Boolean {
        if (!validateAvatar() or !validateContent() or !validateTitle() or !validateLocationOrUtensil()) return false
        return true
    }

    private fun validateTitle(): Boolean {
        getBinding()?.run {
            val title = getBinding()?.edtTitle?.text.toString().trim()
            if (title.isBlank()) {
                edtTitle.isSelected = true
                tvTitleErr.visibility = View.VISIBLE
                tvTitleErr.text = resources.getString(R.string.str_you_create_title)
                return false
            }
            edtTitle.isSelected = false
            tvTitleErr.visibility = View.GONE
            return true
        }
        return false

    }

    private fun validateContent(): Boolean {
        getBinding()?.run {
            listContent?.forEach {
                if (it.content.isNotBlank() || it.listImg.value?.size ?: 0 > 0) {
                    tvContentErr.visibility = View.GONE
                    rvPostContents.isSelected = false
                    return true
                }
            }
            rvPostContents.isSelected = true
            tvContentErr.visibility = View.VISIBLE
            tvContentErr.text = resources.getString(R.string.str_you_create_content)
            return false
        }
        return false

    }

    private fun validateAvatar(): Boolean {
        getBinding().run {
            imagePicker?.let {
                rlAvatar.isSelected = false
                tvAvatarErr.visibility = View.GONE
                return true
            }
            rlAvatar.isSelected = true
            tvAvatarErr.visibility = View.VISIBLE
            tvAvatarErr.text = resources.getString(R.string.str_you_create_avatar)
            return false
        }

    }

    private fun validateLocationOrUtensil(): Boolean {
        getBinding()?.run {
            if (typeFragment == FRM_POST_LOCATION) {
                if (locationName.isEmpty()) {
                    tvLocationOrUtensil.background = ResourcesCompat.getDrawable(
                        resources,
                        R.drawable.bg_edt_title_push_post_err,
                        null
                    )
                    tvLocationOrUtensilErr.visibility = View.VISIBLE
                    tvLocationOrUtensilErr.text =
                        resources.getString(R.string.str_you_create_location)
                    return false
                }
                tvLocationOrUtensil.background = null
                tvLocationOrUtensilErr.visibility = View.GONE
                return true
            } else {
                if (utensilsEntity == null) {
                    tvLocationOrUtensil.background = ResourcesCompat.getDrawable(
                        resources,
                        R.drawable.bg_edt_title_push_post_err,
                        null
                    )
                    tvLocationOrUtensilErr.visibility = View.VISIBLE
                    tvLocationOrUtensilErr.text =
                        resources.getString(R.string.str_you_create_utensil)
                    return false
                }
                tvLocationOrUtensil.background = null
                tvLocationOrUtensilErr.visibility = View.GONE
                return true
            }

        }
        return false

    }

    fun handleAddNewRecord() {
        try {
            mAdapter?.getListContent()?.let { it ->
                it.lastOrNull()?.let {
                    if (it.listImg.value?.size ?: -1 == 0) return
                }
            } // check last block have image. If last block have data new Block

            getBinding()?.rvPostContents?.isSelected = false //block have data isSelected = false
            getBinding()?.tvContentErr?.visibility = View.GONE

            // new Block
            listContent?.add(PostContentEntity())
            val lastPosition = listContent?.lastIndex ?: -1
            if (lastPosition >= 0) {
                mAdapter?.notifyItemInserted(lastPosition)
                getBinding()?.rvPostContents?.scrollToPosition(lastPosition)
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun setupTopNavigation(frmPushPostsBinding: FrmPushPostsNewBinding) {
        try {
            frmPushPostsBinding.apply {
                tvTopNavTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(16.0))
                btnBack.resizeLayout(getSizeWithScale(28.0), getSizeWithScale(28.0))
                btnPushPost.resizeLayout(getSizeWithScale(24.0), getSizeWithScale(24.0))
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun setupContent(frmPushPostsBinding: FrmPushPostsNewBinding) {
        try {
            frmPushPostsBinding.apply {
                mAdapter = AdapterPostContentNew(
                    mActivity!!,
                    heightButton = getSizeWithScale(35.0),
                    sizeIconAddImages = getSizeWithScale(14.81),
                    sizeTextContent = getSizeWithScaleFloat(14.0),
                    minHeightContent = getSizeWithScale(50.0), {
                        rvPostContents.scrollToPosition(it)
                    }, {
                        pushPostViewModel.setContentSelected(it, typeFragment)
                        if (pushPostViewModel.isEditPost) {
                            try {
                                entityPostNeedEdit?.getListContent()
                                    ?.get(it.plus(1))?.listImg?.let { it1 ->
                                        if (!pushPostViewModel.listNameImage.isNullOrEmpty()) pushPostViewModel.listNameImage?.clear()
                                        pushPostViewModel.listNameImage?.addAll(it1)
                                    }
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                            showPopupEditBlock()
                        } else {
                            showPopupAddImages()
                        }

                    }
                )
                rvPostContents.apply {
                    layoutManager =
                        LinearLayoutManager(mActivity!!, LinearLayoutManager.VERTICAL, false)
                    adapter = mAdapter
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun initView(savedInstanceState: Bundle?) {
        try {
            pushPostViewModel.isHaveLocalData.observe(viewLifecycleOwner, {
                if (it) {
                    showDialogDeletePostIfNeed()
                }
            })
            setUtensils()
            observerListImageDelete()
            observerPushPost()
            observerEditPost()
            idUser =
                PrefManager.getInstance(mActivity!!).getString(PrefConst.PREF_USER_ID).toString()
            if (pushPostViewModel.isEditPost) {
                getBinding()?.run {
                    tvTopNavTitle.text = resources.getString(R.string.lblEditPost)
                    tvLocationOrUtensil.isSelected = true
                }

                entityPostNeedEdit?.apply {
                    if (typeFragment == FRM_POST_LOCATION) {
                        val listConTent: MutableLiveData<ArrayList<PostContentEntity>> =
                            MutableLiveData(arrayListOf())
                        for (i in 1 until this.getListContent()?.size!!) {
                            val imgPicker: MutableLiveData<ArrayList<ImagePicker>> =
                                MutableLiveData(ArrayList())
                            for (j in 0 until this.getListContent()?.get(i)?.listImg?.size!!) {
                                val url = "${this.url_prefix}${
                                    this.getListContent()
                                        ?.get(i)?.listImg!![j]
                                }"
                                imgPicker.value?.add(
                                    ImagePicker(
                                        url,
                                        isVideo = AppUtils.isVideo(url),
                                        isFileToSever = true
                                    )
                                )
                            }
                            try {
                                var index = i
                                listConTent.value?.add(
                                    PostContentEntity(
                                        (++index),
                                        this.getListContent()?.get(i)?.content!!,
                                        imgPicker
                                    )
                                )
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                        }
                        nameAvatar = this.getListContent()?.get(0)?.listImg!![0]
                        val urlAvatar = "${this.url_prefix}${nameAvatar}"
                        val imgPickerAvatar = ImagePicker(
                            urlAvatar,
                            isVideo = AppUtils.isVideo(urlAvatar),
                            isFileToSever = true
                        )
                        pushPostViewModel.postContentPlace.postValue(
                            SelectPlace(
                                idUser,
                                this.title,
                                listConTent,
                                imgPickerAvatar,
                                LocationEntity(
                                    0.0,
                                    0.0,
                                    this.location_id.toString(),
                                    locationName="${this.name_locations.toString()}\n${this.address_locations ?: ""}"
                                )
                            )
                        )

                    } else {
                        val listConTent: MutableLiveData<ArrayList<PostContentEntity>> =
                            MutableLiveData(arrayListOf())
                        for (i in 1 until this.getListContent()?.size!!) {
                            val imgPicker: MutableLiveData<ArrayList<ImagePicker>> =
                                MutableLiveData(ArrayList())
                            for (j in 0 until this.getListContent()?.get(i)?.listImg?.size!!) {
                                val url = "${this.url_prefix}${
                                    this.getListContent()
                                        ?.get(i)?.listImg!![j]
                                }"
                                imgPicker.value?.add(
                                    ImagePicker(
                                        url,
                                        isVideo = AppUtils.isVideo(url),
                                        isFileToSever = true
                                    )
                                )
                            }
                            try {
                                var index = i
                                listConTent.value?.add(
                                    PostContentEntity(
                                        (++index),
                                        this.getListContent()?.get(i)?.content!!,
                                        imgPicker
                                    )
                                )
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                        }
                        nameAvatar = this.getListContent()?.get(0)?.listImg!![0]
                        val urlAvatar = "${this.url_prefix}${nameAvatar}"
                        val imgPickerAvatar = ImagePicker(
                            urlAvatar,
                            isVideo = AppUtils.isVideo(urlAvatar),
                            isFileToSever = true
                        )
                        pushPostViewModel.postContentUtensils.postValue(
                            SelectUtensils(idUser, this.title, listConTent, imgPickerAvatar,
                                utensil_id?.let { UtensilsEntity(it, name_utensils) })
                        )

                    }

                }
            } else {
                pushPostViewModel.getPostContentInDB(idUser, typeFragment)
            }
            createPostContent()

            pushPostViewModel.actionState.observe(viewLifecycleOwner, {
                try {
                    when (it) {
                        PushPostViewModel.STATE.NOTIFY_DATA -> {
                            mAdapter?.notifyDataSetChanged()
                        }
                        PushPostViewModel.STATE.SAVED -> {
                            showProgressDialogSave()
                        }
                        PushPostViewModel.STATE.DELETED -> {
                            closeScreen()
                        }
                        else -> {
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
        }
        getBinding()?.edtTitle?.clearFocus()
        mActivity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
        AppUtils.hideKeyboard(getBinding()?.root)
        getBinding()?.rlContent?.setSingleClick {
            AppUtils.hideKeyboard(view)
        }

//        setLatAndLng()

    }

    @SuppressLint("SetTextI18n")
    private fun setLatAndLng() {
        try {
            var place: String
            GlobalScope.launch(Dispatchers.Unconfined) {
                if (mLat != null && mLng != null) {
                    try {
                        val geocoder = Geocoder(requireContext(), Locale.getDefault())
                        val addresses: List<Address> =
                            geocoder.getFromLocation(mLat ?: 0.0, mLng ?: 0.0, 5)
                        if (addresses.isNotEmpty()) {
                            val address: Address = addresses[0]
                            place = address.getAddressLine(0)
                            if (typeFragment == FRM_POST_LOCATION) {
                                if (locationName.isNotEmpty()) {
                                    getBinding()?.tvLocationOrUtensil?.text = locationName
                                } else {
                                    locationName = place.replace("Unnamed Road, ", "")
                                    getBinding()?.tvLocationOrUtensil?.text =
                                        place.replace("Unnamed Road, ", "")
                                }
                            }
                        }

                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun setUtensils() {
        if (typeFragment == FRM_POST_UTENSILS) {
            getBinding()?.run {
                val leftDrawable = AppCompatResources.getDrawable(
                    requireContext(),
                    R.drawable.bg_ic_utensils_push_post_selector
                )
                tvLocationOrUtensil.setCompoundDrawablesWithIntrinsicBounds(
                    leftDrawable,
                    null,
                    null,
                    null
                );
                tvLocationOrUtensil.text = resources.getString(R.string.str_popup_utensils)

                imgLocation.setImageDrawable(
                    ResourcesCompat.getDrawable(
                        resources,
                        R.drawable.ic_utensil_push_post,
                        null
                    )
                )
            }

        }
    }

    private fun showDialogCancel() {
        if (pushPostViewModel.isEditPost) {
            dismissAllowingStateLoss()
        } else {
            val title = getBinding()?.edtTitle?.text.toString()
            if (title.isBlank()) {
                onBackListener()
            } else {
                val dialogSave = DialogSavePushPost(requireContext())
                dialogSave.show(false, object : DialogSavePushPost.OnListenerDialog {
                    override fun onClickSaveDraft() {
                        if (typeFragment == FRM_POST_LOCATION) authViewModel.isHaveLocalDataSelectPlace =
                            true
                        else authViewModel.isHaveLocalDataSelectUtensils = true
                        saveCachePoshPost()
                    }

                    override fun onClickDiscardPost() {
                        if (idUser != "") {
                            if (typeFragment == FRM_POST_LOCATION) authViewModel.isHaveLocalDataSelectPlace =
                                false
                            else authViewModel.isHaveLocalDataSelectUtensils = false
                            pushPostViewModel.deletePost(idUser, true, typeFragment)
                        } else {
                            closeScreen()
                        }
                    }

                    override fun onClickKeepEditing() {}

                })
            }
        }
    }

    @SuppressLint("ResourceType")
    private fun showDialogDeletePostIfNeed() {
        val title = resources.getString(R.string.titleConfirm)
        val message = resources.getString(R.string.msgConfirmResetPost)
        mActivity?.showDialogExit(title, message, object : DialogExit.CallbackListenerExit {
            override fun onOk() {}

            override fun onCancel() {
                if (idUser.isNotEmpty()) {
                    if (typeFragment == FRM_POST_LOCATION) {
                        pushPostViewModel.deletePost(idUser, false, typeFragment)
//
                        mActivity?.let {
                            getInstance(typeFragment = FRM_POST_LOCATION).show(it.supportFragmentManager,"FrmPushPostNew")
                        }
                        authViewModel.isHaveLocalDataSelectPlace = false

                    } else {
                        pushPostViewModel.deletePost(idUser, false, typeFragment)
//
                        mActivity?.let {
                            getInstance(typeFragment = FRM_POST_UTENSILS).show(it.supportFragmentManager,"FrmPushPostNew")
                        }
                        authViewModel.isHaveLocalDataSelectUtensils = false
                    }
                }
            }

        })
    }

    private fun saveCachePoshPost() {
        try {
            if (typeFragment == FRM_POST_LOCATION) {
                val title = getBinding()?.edtTitle?.text.toString()
                pushPostViewModel.postContentPlace.value?.title = title
                imagePicker?.let {
                    pushPostViewModel.postContentPlace.value?.avatar = it
                }
                locationEntity?.let {
                    pushPostViewModel.postContentPlace.value?.location = it
                }
                pushPostViewModel.savePost()
            } else {
                val title = getBinding()?.edtTitle?.text.toString()
                pushPostViewModel.postContentUtensils.value?.title = title
                imagePicker?.let {
                    pushPostViewModel.postContentUtensils.value?.avatar = it
                }
                this.utensilsEntity?.let {
                    pushPostViewModel.postContentUtensils.value?.utensils = it

                }
                pushPostViewModel.savePost()
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun showProgressDialogSave() {
        try {
            val toast =
                Toast.makeText(
                    requireContext(),
                    resources.getString(R.string.str_save_post_success),
                    Toast.LENGTH_SHORT
                )
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
            closeScreen()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun callApiPushPost() {
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            val title = getBinding()?.edtTitle?.text.toString()
            val listImg: ArrayList<MultipartBody.Part> = ArrayList()
            var indexPushPostImage = 0
            var countVideo = 0
            var countImage = 0

            prepareFilePart(
                "listImg_0[]",
                Uri.parse(imagePicker!!.uri),
                imagePicker?.path ?: "",
                isVideo = imagePicker?.isVideo ?: false,
                isFormatImage = imagePicker?.isFormatImage ?: false
            )?.let {
                listImg.add(it)
            }
            listContent?.let {
                for (i in 0 until it.size) {

                    val postContentEntity: PostContentEntity = it[i]
                    if (postContentEntity.content.isNotEmpty() || postContentEntity.listImg.value?.size ?: 0 > 0) {
                        ++indexPushPostImage
                        for (j in 0 until it[i].listImg.value?.size!!) {
                            if (listContent?.get(i)?.listImg?.value?.get(j)?.isVideo == true) {
                                countVideo++
                            } else countImage++
                            // check type Video post
                            typeVideo =
                                if (listContent?.get(i)?.listImg?.value?.get(j)?.isVideo == true) {
                                    if (listContent?.get(i)?.listImg?.value?.get(j)?.path?.isEmpty() == true) 1 //  video upload
                                    else 2 // video quay
                                } else null // type video = null when not Video in list post
                            //
                            prepareFilePart(
                                "listImg_${indexPushPostImage}[]",
                                Uri.parse(listContent?.get(i)?.listImg?.value?.get(j)?.uri),
                                pathFile = listContent?.get(i)?.listImg?.value?.get(j)?.path!!,
                                isVideo = listContent?.get(i)?.listImg?.value?.get(j)?.isVideo
                                    ?: false,
                                isFormatImage = listContent?.get(i)?.listImg?.value?.get(j)?.isFormatImage
                                    ?: false
                            )?.let {
                                listImg.add(
                                    it
                                )
                            }
                        }
                    }

                }
            }
            typeVideo?.let {
                requestParam[ApiConst.PARAM_TYPE_VIDEO] = it.toString()
            }
            requestParam[ApiConst.PARAM_API_TITLE] = title
            requestParam[PARAM_API_CONTENT] = listToJson(listContent)
            if (typeFragment == FRM_POST_LOCATION) {
                if (locationEntity != null) {
                    requestParam[ApiConst.PARAM_API_LOCATION_ID] = if (locationId.toInt()>0) locationId else ""
                } else {
                    requestParam[ApiConst.PARAM_API_LOCATION_ID] = ""
                }
                val splitLocationName = locationName.split("\n")

                requestParam[ApiConst.PARAM_API_LOCATION_NAME] = splitLocationName.get(0)
                requestParam[ApiConst.PARAM_API_LOCATION_ADDRESS] = if (splitLocationName.size>1) splitLocationName.get(1) else ""

                requestParam[ApiConst.PARAM_API_LAT] = mLat.toString()
                requestParam[ApiConst.PARAM_API_LNG] = mLng.toString()
                requestParam[ApiConst.PARAM_API_TYPE_PUSH_POST] = AppConst.TYPE_PUSH_POST_LOCATION
            }
            if (typeFragment == FRM_POST_UTENSILS) {
                if (utensilsEntity != null) {
                    requestParam[ApiConst.PARAM_API_UTENSIL_ID] = utensilsEntity?.id.toString()
                } else {
                    requestParam[ApiConst.PARAM_API_UTENSIL_ID] = ""
                }
                requestParam[ApiConst.PARAM_API_UTENSIL_NAME] = utensilsEntity?.name.toString()
                requestParam[ApiConst.PARAM_API_TYPE_PUSH_POST] = AppConst.TYPE_PUSH_POST_UTENSIL
            }
            requestParam[ApiConst.PARAM_API_HASHTAG_ID] = ""
            requestParam[ApiConst.PARAM_API_HASHTAG_NAME] = ""


            if (!isCheckFileExist) { // file not found
                GlobalScope.launch(Dispatchers.Main) {
                    mActivity?.hideProgress()
                    mActivity?.showDialogErrorPushPost(resources.getString(R.string.msgConfirmFileNotExist))
                    isCheckFileExist = true
                }
                return

            }

            if (countVideo > AppConst.DEFAULT_NUMBER_VIDEO_POST || countImage > AppConst.DEFAULT_NUMBER_IMAGE_POST || (countImage + countVideo) > AppConst.DEFAULT_NUMBER_MEDIA_POST) {
                GlobalScope.launch(Dispatchers.Main) {
                    mActivity?.hideProgress()
                    val dialogWarning = DialogWarning(requireContext())
                    if (dialogWarning.isShowing) return@launch
                    dialogWarning.show(
                        false,
                        countImage.toString(),
                        countVideo.toString(),
                        (countImage + countVideo).toString()
                    )
                }
            } else {
                GlobalScope.launch(Dispatchers.Main) {
                    pushPostViewModel.requestPushPost(requestParam, listImg)
                }

            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun callApiEditPost() {
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            val title = getBinding()?.edtTitle?.text.toString()
            val listImg: ArrayList<MultipartBody.Part> = ArrayList()
            val listKeyBlockDelete: ArrayList<Int> = ArrayList()
            var indexPushPostImage = 0
            var countVideo = 0
            var countImage = 0
            if (imagePicker?.isChecked == true) {
                prepareFilePart(
                    "listImg_0[]",
                    Uri.parse(imagePicker!!.uri),
                    imagePicker?.path ?: "",
                    imagePicker?.isVideo ?: false,
                    imagePicker?.isFormatImage ?: false
                )?.let {
                    listImg.add(it)
                }
                if (!nameAvatar.isNullOrEmpty()) {
                    listImageDelete?.add(nameAvatar)
                }

            }
            listContent?.let {
                for (i in 0 until it.size) {
                    val postContentEntity: PostContentEntity = it[i]
                    if (postContentEntity.content.isNotEmpty() || postContentEntity.listImg.value?.size ?: 0 > 0) {
                        ++indexPushPostImage
                        for (j in 0 until it[i].listImg.value?.size!!) {
                            if (listContent?.get(i)?.listImg?.value?.get(j)?.isVideo == true) {
                                countVideo++
                            } else countImage++

                            if (listContent?.get(i)?.listImg?.value?.get(j)?.isChecked == true) {
                                // check type Video post
                                typeVideo =
                                    if (listContent?.get(i)?.listImg?.value?.get(j)?.isVideo == true) {
                                        if (listContent?.get(i)?.listImg?.value?.get(j)?.path?.isEmpty() == true) 1 //  video upload
                                        else 2 // video quay
                                    } else null // type video = null when not Video in list post
                                //

                                prepareFilePart(
                                    "listImg_${indexPushPostImage}[]",
                                    Uri.parse(listContent?.get(i)?.listImg?.value?.get(j)?.uri),
                                    pathFile = listContent?.get(i)?.listImg?.value?.get(j)?.path!!,
                                    isVideo = listContent?.get(i)?.listImg?.value?.get(j)?.isVideo
                                        ?: false,
                                    isFormatImage = listContent?.get(i)?.listImg?.value?.get(j)?.isFormatImage
                                        ?: false
                                )?.let {
                                    listImg.add(
                                        it
                                    )
                                }
                            }
                        }
                    } else {
                        listKeyBlockDelete.add(i + 1)
                    }

                }
            }
            val listBlockDelete = Gson().toJson(listKeyBlockDelete)
            requestParam[ApiConst.PARAM_API_TITLE] = title
            requestParam[PARAM_API_CONTENT] = listToJson(listContent)
            requestParam[ApiConst.PARAM_API_HASHTAG_ID] = ""
            requestParam[ApiConst.PARAM_LANGUAGE] = language.toString()
            requestParam[ApiConst.PARAM_CONTENT_KEY_DEL] = listBlockDelete

            if (typeFragment == FRM_POST_LOCATION) {
                if (locationEntity != null) {
                    requestParam[ApiConst.PARAM_API_LOCATION_ID] = if (locationId.toInt()>0) locationId else ""
                } else {
                    requestParam[ApiConst.PARAM_API_LOCATION_ID] = ""
                }
                val splitLocationName = locationName.split("\n")

                requestParam[ApiConst.PARAM_API_LOCATION_NAME] = splitLocationName.get(0)
                requestParam[ApiConst.PARAM_API_LOCATION_ADDRESS] = if (splitLocationName.size>1) splitLocationName.get(1) else ""
                requestParam[ApiConst.PARAM_API_LAT] = mLat.toString()
                requestParam[ApiConst.PARAM_API_LNG] = mLng.toString()
            }
            if (typeFragment == FRM_POST_UTENSILS) {
                if (utensilsEntity != null) {
                    requestParam[ApiConst.PARAM_API_UTENSIL_ID] = utensilsEntity?.id.toString()
                } else {
                    requestParam[ApiConst.PARAM_API_UTENSIL_ID] = ""
                }
                requestParam[ApiConst.PARAM_API_UTENSIL_NAME] = utensilsEntity?.name.toString()
            }
            requestParam[ApiConst.PARAM_API_HASHTAG_NAME] = ""
            if (!listImageDelete.isNullOrEmpty()) {
                val gson = Gson()
                val jsonList = gson.toJson(listImageDelete)
                requestParam[ApiConst.PARAM_API_IMG_DELETE] = jsonList
            }

            if (!isCheckFileExist) { // file not found
                GlobalScope.launch(Dispatchers.Main) {
                    mActivity?.hideProgress()
                    mActivity?.showDialogErrorPushPost(resources.getString(R.string.msgConfirmFileNotExist))
                    isCheckFileExist = true
                }
                return

            }

            if (countVideo > AppConst.DEFAULT_NUMBER_VIDEO_POST || countImage > AppConst.DEFAULT_NUMBER_IMAGE_POST || (countImage + countVideo) > AppConst.DEFAULT_NUMBER_MEDIA_POST) {
                GlobalScope.launch(Dispatchers.Main) {
                    mActivity?.hideProgress()
                    val dialogWarning = DialogWarning(requireContext())
                    if (dialogWarning.isShowing) return@launch
                    dialogWarning.show(
                        false,
                        countImage.toString(),
                        countVideo.toString(),
                        (countImage + countVideo).toString()
                    )
                }

            } else {
                GlobalScope.launch(Dispatchers.Main) {
                    pushPostViewModel.requestEdtPost(
                        requestParam,
                        listImg,
                        entityPostNeedEdit?.id.toString()
                    )
                }

            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun observerPushPost() {
        try {
            pushPostViewModel.pushPostResult.observe(viewLifecycleOwner, {
                try {
                    shareViewModel.showOrHideLoading(it)
                    if (it.status == ApiResult.Status.SUCCESS) {
                        it.data?.message?.let { message->
                            showDialogSuccess(message)
                        }
                        shareViewModel.setNeedRefreshPostDataAllScreen()
                        isCheckPushPost = true
                        //clear data local and isCheckdatalocal = false
                        if (typeFragment == FRM_POST_LOCATION) authViewModel.isHaveLocalDataSelectPlace =
                            false
                        else authViewModel.isHaveLocalDataSelectUtensils = false


                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
        }
    }

    private fun showDialogSuccess(tvMessage: String) {
        try {
            val dialogSuccess = DialogSuccess(requireContext())
            dialogSuccess.show(tvMessage, false)
            val timeDismiss = Timer()
            timeDismiss.schedule(object : TimerTask() {
                override fun run() {
                    dialogSuccess.dismiss()
                    dialogSuccess.cancel()
                }
            }, 2000)
            dialogSuccess.setOnDismissListener {
                pushPostViewModel.deletePost(idUser, true, typeFragment)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun observerEditPost() {
        try {
            pushPostViewModel.editPostResult.observe(viewLifecycleOwner, {
                try {
                    shareViewModel.showOrHideLoading(it)
                    if (it.status == ApiResult.Status.SUCCESS) {
                        if (it.data?.response is ResponseEditPost.EditPostResponse) {
                            (it.data.response as ResponseEditPost.EditPostResponse).let { response ->
                                shareViewModel.editPost = response
                            }
                        }
                        shareViewModel.setNeedRefreshEditDataAllScreen()
                        if (typeFragment == FRM_POST_LOCATION) authViewModel.isHaveLocalDataSelectPlace =
                            false
                        else authViewModel.isHaveLocalDataSelectUtensils = false
                        it?.data?.message?.let {
                            showDialogSuccess(it)
                        }

                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            })
        } catch (e: Exception) {
        }
    }

    private fun listToJson(list: ArrayList<PostContentEntity>?): String {
        val jsonArray = JSONArray()
        val jsonObjectImage = JSONObject()
        jsonObjectImage.put(PARAM_API_CONTENT, "")
        jsonArray.put(jsonObjectImage)
        try {
            list?.let {
                for (i in 0 until it.size) {
                    val postContentEntity: PostContentEntity = it[i]
                    postContentEntity.content = postContentEntity.content.trim()
                    val jsonObject = JSONObject()
                    if (postContentEntity.content.isNotEmpty() || postContentEntity.listImg.value?.size ?: 0 > 0) {
                        jsonObject.put(PARAM_API_CONTENT, postContentEntity.content)
                        jsonArray.put(jsonObject)
                    }

                }
            }

        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return jsonArray.toString()
    }

    private fun prepareFilePart(
        partName: String,
        fileUri: Uri,
        pathFile: String = "",
        isVideo: Boolean,
        isFormatImage: Boolean
    ): MultipartBody.Part? {
        try {
            var file = if (pathFile.isEmpty()) File(getRealPathFromURI(fileUri, requireContext()))
            else File(pathFile)

            if (isCheckFileExist) {
                isCheckFileExist = file.exists()
            } // check file exist

            if (!isVideo && !isFormatImage) { // check malformed photos
                val bitmap =
                    MediaStore.Images.Media.getBitmap(requireContext().contentResolver, fileUri)
                val uri = bitmap.compress(context = requireContext())  // uri photos convert

                val fDelete = if (pathFile.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        File(fileUri.path)
                    } else File(getRealPathFromURI(fileUri, requireContext()))

                } else File(pathFile)
                fDelete.delete(requireContext()) // delete malformed photos
                uri?.let {
                    file = File(getRealPathFromURI(it, requireContext()))
                }

            }

            if (file.getSizeInKB() > (5 * 1024) && !isVideo) { // check file photo and > 5mb
                runBlocking(Dispatchers.IO) {
                    file = Compressor.compress(requireContext(), file) {
                        resolution(1280, 720)
                        quality(80)
                        format(Bitmap.CompressFormat.JPEG)
                        size(5_242_880)
                    }

                }
            }
            val requestFile: RequestBody =
                RequestBody.create(
                    mActivity?.contentResolver?.getType(fileUri)?.toMediaTypeOrNull(),
                    file
                )
            return MultipartBody.Part.createFormData(
                partName, file.name.replace(" ".toRegex(), "%20"), requestFile
            )
        } catch (e: Exception) {
        }
        return null
    }

    private fun closeScreen() {
        if (parentFragment is FrmDetail) {
            (parentFragment as FrmDetail).apply {
                this.backToPrevious()
            }
        } else {
            // dismiss all DialogFragments
            mActivity?.dismissDialogs()
        }

    }

    private fun onBackListener() {
        val title = resources.getString(R.string.titleConfirm)
        val message = resources.getString(R.string.msgConfirmExit)
        mActivity?.showDialogExit(title, message, object : DialogExit.CallbackListenerExit {
            override fun onOk() {
                mActivity?.dismissDialogs()
            }

            override fun onCancel() {}

        })
    }

    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    @Subscribe
    fun onEvent(event: Any) {
        if (event is LocationEntity) {
            event.apply {
                this@FrmPushPostsNew.locationEntity = this
                this@FrmPushPostsNew.locationId = this.locationId
                this@FrmPushPostsNew.mLat = this.lat
                this@FrmPushPostsNew.mLng = this.long
                if (this.isLocationGoogleMap){
                    try {
                        val index = locationName.indexOf(",",startIndex = 0,false)
                        this@FrmPushPostsNew.locationName = "${locationName.substring(0, index)}\n${locationName.substring(index+1,locationName.length).trim()}"
                    }catch (e:Exception){
                        e.printStackTrace()
                    }
                }else{
                    this@FrmPushPostsNew.locationName = this.locationName
                }
            }
            setLatAndLng()
            getBinding()?.run {
                tvLocationOrUtensilErr.visibility = View.GONE
                tvLocationOrUtensil.isSelected = true
                tvLocationOrUtensil.background = null
            }

        }
        if (event is UtensilsEntity) {
            event.apply {
                this@FrmPushPostsNew.utensilsEntity = this

            }
            getBinding()?.run {
                tvLocationOrUtensil.text = this@FrmPushPostsNew.utensilsEntity?.name
                tvLocationOrUtensilErr.visibility = View.GONE
                getBinding()?.tvLocationOrUtensil?.isSelected = true
                tvLocationOrUtensil.background = null
            }


        }
        if (event is ImagePicker) {
            event.apply {
                this@FrmPushPostsNew.imagePicker = this
                val uriImage = Uri.parse(imagePicker?.uri)

                Glide.with(requireContext()).load(uriImage)
                    .transform(CenterCrop(), RoundedCorners(10))
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                    .into(imgAvatar)

                getBinding()?.clImgAvatar?.visibility = View.VISIBLE
                getBinding()?.tvAvatarErr?.visibility = View.GONE
                if (locationName.isEmpty()) {
                    fetchLocationImage(
                        getRealPathFromURI(Uri.parse(this.uri), requireContext()),
                        Uri.parse(this.uri)
                    )
                }

                showFirstScreenSelectedLocationOrUtensil()

            }
        }
    }
    private fun showFirstScreenSelectedLocationOrUtensil(){ // show khi chọn avatar lần đầu tiên

        if (isFirstOpenScreenLocationOrUtensil) return

        if (locationName.isEmpty() && !isFirstOpenScreenLocationOrUtensil){
            Handler(Looper.getMainLooper()).postDelayed({
                if (typeFragment == FRM_POST_LOCATION) FrmMapNew().show(
                    childFragmentManager,
                    "FrmPushPostsNew"
                )
                else if (typeFragment == FRM_POST_UTENSILS) FrmSelectedUtensilsNew().show(
                    childFragmentManager,
                    "FrmPushPostsNew"
                )
            },350L)

        }

        isFirstOpenScreenLocationOrUtensil = true
    }

    private fun createPostContent() {
        if (typeFragment == FRM_POST_LOCATION) {
            pushPostViewModel.postContentPlace.observe(viewLifecycleOwner, {
                try {
                    it.listConTent.observe(viewLifecycleOwner, { listContent ->
                        this.listContent = listContent
                        mAdapter?.apply {
                            updateList(listContent)
                            if (entityPostNeedEdit?.getListContent()
                                    ?.last()?.listImg?.size ?: 0 > 0
                            ) handleAddNewRecord() //new block
                        }
                    })
                    getBinding()?.edtTitle?.setText(it.title)

                    it.avatar?.let { imagePicker->
                        getBinding()?.clImgAvatar?.visibility = View.VISIBLE
                        getBinding()?.imgAvatar?.loadImageUrl(imagePicker.uri)
                        this.imagePicker = imagePicker

                    }
                    it.location?.let { locationEntity->
                        this.locationEntity = locationEntity
                        this.locationName = locationEntity.locationName
                        this.locationId = locationEntity.locationId
                        getBinding()?.tvLocationOrUtensil?.text = this.locationName
                        getBinding()?.tvLocationOrUtensil?.isSelected=true
                    }


                } catch (e: Exception) {
                    e.printStackTrace()
                }

            })
        } else {
            pushPostViewModel.postContentUtensils.observe(viewLifecycleOwner, {
                try {
                    it.listConTent.observe(viewLifecycleOwner, { listContent ->
                        this.listContent = listContent
                        mAdapter?.apply {
                            updateList(listContent)
                            if (entityPostNeedEdit?.getListContent()
                                    ?.last()?.listImg?.size ?: 0 > 0
                            ) handleAddNewRecord() //new block
                        }
                    })

                    getBinding()?.edtTitle?.setText(it.title)


                    it.avatar?.let { imagePicker->
                        getBinding()?.clImgAvatar?.visibility = View.VISIBLE
                        getBinding()?.imgAvatar?.loadImageUrl(imagePicker.uri)
                        this.imagePicker = imagePicker
                    }
                    it.utensils?.let { utensil->
                        this.utensilsEntity = utensil
                        utensil.name?.let { name ->
                            this.locationName = name
                        }
                        this.locationId = utensil.id.toString()
                        getBinding()?.tvLocationOrUtensil?.text = utensil.name
                        getBinding()?.tvLocationOrUtensil?.isSelected=true
                    }

                } catch (e: Exception) {
                    e.printStackTrace()
                }

            })
        }
    }

    private fun observerListImageDelete() {
        pushPostViewModel.listImgDelete.observe(viewLifecycleOwner, {
            if (it != null) {
                listImageDelete = it
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.getDefault().post(true)
    }

    override fun onClick(v: View?) {
        if (!isClickAble()) return
        when (v?.id) {
            R.id.btnPushPost -> {
                if (!isCheckPushPost)
                    handlePushPost()
            }
            R.id.btnBack -> {
                showDialogCancel()
            }
            R.id.imgAvatar -> {
                DialogFragmentAddImageAvatarNew.getInstance()
                    .show(childFragmentManager, "DialogFragmentAddImageAvatarNew")
            }
            R.id.tvUpload -> {
                DialogFragmentAddImageAvatarNew.getInstance()
                    .show(childFragmentManager, "DialogFragmentAddImageAvatarNew")
            }
            R.id.imgBlock -> {
                val transToSelectPositionBlock =
                    if (getBinding()?.edtTitle?.isFocused == true) (mAdapter?.getListContent()?.size
                        ?: 1).minus(1) else transToSelectPositionBlock()
                pushPostViewModel.setContentSelected(transToSelectPositionBlock, typeFragment)
                showPopupAddImages()
            }
        }
    }

    private fun getHeightScreen() {
        val mRootWindow: Window = mActivity?.window!!
        val mRootView: View = mRootWindow.decorView.findViewById(android.R.id.content)

        val r = Rect()
        val view = mRootWindow.decorView
        view.getWindowVisibleDisplayFrame(r)
        heightScreen = r.height()
    }

    private fun showViewKeyBoard() {
        val mRootWindow: Window = mActivity?.window!!
        val mRootView: View = mRootWindow.decorView.findViewById(android.R.id.content)

        mRootView.viewTreeObserver.addOnGlobalLayoutListener {
            val r = Rect()
            val view = mRootWindow.decorView
            view.getWindowVisibleDisplayFrame(r)
            val heightKeyboard = heightScreen - r.height()
            getBinding()?.keyboard?.layoutParams?.height = heightKeyboard
            getBinding()?.keyboard?.show()


        }
    }

    private fun transToSelectPositionBlock(): Int {
        mAdapter?.getListContent()?.let {
            for (index in it.indices) {
                val view = rvPostContents.findViewHolderForAdapterPosition(index)
                (view as AdapterPostContentNew.PostContentViewHolder).run {
                    if (this.binding.edtContent.isFocused) return index
                }
            }
        }
        return (mAdapter?.getListContent()?.size?.minus(1) ?: 0)

    }


    private fun fetchLocationImage(partName: String, uri: Uri) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            val photoUri = MediaStore.setRequireOriginal(uri)
            val stream: InputStream? =
                requireContext().applicationContext.contentResolver.openInputStream(photoUri)
            if (stream != null) {
                val exifInterface: ExifInterface = ExifInterface(stream)
                // Don't reuse the stream associated with the instance of "ExifInterface".
                val latLng = FloatArray(2)
                if (exifInterface.getLatLong(latLng)) { //file has exif latlong info
                    //etc, latLng[0] is your latitute value and latLng[1] your longitude value
                    getAddress(latLng[0].toDouble(), latLng[1].toDouble())
                }
                stream.close()
            } else {
                // Failed to load the stream, so return the coordinates (0, 0).
                val latLng = DoubleArray(2)
                getAddress(latLng[0], latLng[1])
            }

        } else {
            val exifInterface = ExifInterface(partName)
            val latLng = FloatArray(2)
            if (exifInterface.getLatLong(latLng)) { //file has exif latlong info
                getAddress(latLng[0].toDouble(), latLng[1].toDouble())
            }
        }


    }

    private fun getAddress(latitute: Double, longitude: Double): Address {
        val myLocation = Geocoder(requireContext(), Locale.getDefault())
        val myList =
            myLocation.getFromLocation(latitute, longitude, 1)
        locationName = myList[0].getAddressLine(0)
        getBinding()?.run {
            tvLocationOrUtensil.text = locationName
            tvLocationOrUtensil.isSelected = true

            tvLocationOrUtensilErr.visibility = View.GONE
            tvLocationOrUtensil.background = null
        }

        return myList[0]
    }


}