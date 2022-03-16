package brite.outdoor.ui.dialog

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import brite.outdoor.R
import brite.outdoor.adapter.ImagePickerAdapter
import brite.outdoor.adapter.utils.MarginDecoration
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.ExtraConst
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.databinding.FrmPickImageBinding
import brite.outdoor.databinding.FrmPickImageNewBinding
import brite.outdoor.entity.Media
import brite.outdoor.ui.activities.CameraActivity
import brite.outdoor.ui.fragments.FrmPushPostsNew
import brite.outdoor.ui.widgets.LayoutImagePickedPreview
import brite.outdoor.utils.*
import brite.outdoor.viewmodel.PushPostViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import org.greenrobot.eventbus.EventBus
import java.io.File
import java.util.concurrent.TimeUnit

@AndroidEntryPoint
class DialogFragmentAddImagesNew : DialogFragment() {

    companion object {
        private const val TAG = "TestDialogFragment"
    }

    private var listImagePickerOld: ArrayList<ImagePicker> = ArrayList()
    private var listImagePickerOldEdit: ArrayList<ImagePicker> = ArrayList()
    private var listImagePickerNews: ArrayList<ImagePicker> = ArrayList()
    private var binding: FrmPickImageNewBinding? = null
    private var imagePickerAdapter: ImagePickerAdapter? = null
    private var lisImageDelete: ArrayList<String?>? = ArrayList()
    private var listSelect: ArrayList<ImagePicker>? = ArrayList()
    private val pickImageViewModel by viewModels<PushPostViewModel>({ requireParentFragment() })
    private lateinit var flow: Flow<ImagePicker>
    val listImagePicker: ArrayList<ImagePicker> = ArrayList()
    private val jobInsertImagePicker = CoroutineScope(Dispatchers.Main)


    // The permissions we need for the app to work properly
    private val permissions = mutableListOf(
        Manifest.permission.CAMERA,
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_EXTERNAL_STORAGE
    ).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            add(Manifest.permission.ACCESS_MEDIA_LOCATION)
        }
    }

    private fun allPermissionsGranted() = permissions.all {
        ContextCompat.checkSelfPermission(requireContext(), it) == PackageManager.PERMISSION_GRANTED
    }

    private val permissionRequest = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
        if (permissions.all { it.value }) {
            onPermissionGranted()
        } else {
            Toast.makeText(activity, resources.getString(R.string.str_no_memory_assess), Toast.LENGTH_SHORT)
                .show()
        }
    }

    // handler after the permission check
    private fun onPermissionGranted(){
        getPicturePaths()
        jobInsertImagePicker.launch {
            flow.collect {
                imagePickerAdapter?.insertImagePicker(it)
            }
        }
    }
    private var startForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            try {
                if (result.resultCode == AppConst.RESULT_CODE) {
                    result.data?.let {
                        val media = it.getParcelableExtra<Media>(ExtraConst.EXTRA_MEDIA)
                        media?.let {
                            var imagePicker: ImagePicker? = null
                            imagePicker = if (it.path.isNotEmpty()) ImagePicker(
                                uri = it.uri.toString(),
                                isChecked = true,
                                numberSelect = (listDataDialogFrmImagePager.size + 1),
                                path = it.path,
                                isVideo = it.isVideo,
                                position = 1
                            )
                            else ImagePicker(
                                uri = it.uri.toString(),
                                isChecked = true,
                                numberSelect = (listDataDialogFrmImagePager.size + 1),
                                isVideo = it.isVideo,
                                position = 1
                            )

                            if (!imagePicker.isVideo) {
                                activity?.let {
                                    imagePicker.isFormatImage = AppUtils.isFormatImage(
                                        AppUtils.getRealPathFromURI(
                                            it,
                                            Uri.parse(imagePicker.uri)
                                        )
                                    ) // check format Image
                                }
                            }
                            listDataDialogFrmImagePager.add(imagePicker)
                            imagePickerAdapter?.insertFirstPositionImagePicker(imagePicker)

                        }


                    }
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

    private var listDataDialogFrmImagePager = arrayListOf<ImagePicker>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.FullScreenDialogStyle)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FrmPickImageNewBinding.inflate(inflater, container, false)
        loadControlsAndResize(binding)
        initView()
        return binding!!.root
    }

    override fun getTheme() = R.style.AddImageStyle

    fun loadControlsAndResize(binding: FrmPickImageNewBinding?) {
        binding?.apply {
            setupTopNavigation(this)
            setupOnClickListener(this)
        }
    }

    fun initView() {
        listImagePickerOldEdit.addAll(
            pickImageViewModel.contentSelected.value?.listImg?.value ?: arrayListOf<ImagePicker>()
        )
        pickImageViewModel.contentSelected.value?.listImg?.let { list ->
            list.value?.let {
                listImagePickerOld = it
            }

            removeFileNotExist(list, pickImageViewModel.isEditPost)
            list.value?.let {
                listImagePickerNews = it
            }
            setupListView(list)
            if (allPermissionsGranted()){
                onPermissionGranted()
            }else{
                permissionRequest.launch(permissions.toTypedArray())
            }
            observeListImageSelected(list)
        }
    }

    private fun observeListImageSelected(list: MutableLiveData<ArrayList<ImagePicker>>) {
        list.observe(viewLifecycleOwner, {
            try {
                it?.let {
                    if (!listSelect.isNullOrEmpty()) listSelect?.clear()
                    listSelect?.addAll(it)
                    setDataToView(it)
                    listDataDialogFrmImagePager.clear()
                    listDataDialogFrmImagePager.addAll(it)
                    binding?.tvOver?.isSelected = it.size > 0
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        })
    }

    private fun setupListView(list: MutableLiveData<ArrayList<ImagePicker>>) {
        activity?.let {
            imagePickerAdapter = ImagePickerAdapter(
                pickImageViewModel.isEditPost,
                it,
                list,
                getSizeWithScale(111.0),
                getSizeWithScale(16.0),
                getSizeWithScale(6.0),
                getSizeWithScaleFloat(10.0)
            ) {
                openCamera()
            }
            binding?.rvImagePicker?.apply {
                addItemDecoration(MarginDecoration(getSizeWithScale(9.0), 3))
                layoutManager = GridLayoutManager(
                    it, 3,
                    LinearLayoutManager.VERTICAL, false
                )
                adapter = imagePickerAdapter
            }
        }

    }


    private fun setupOnClickListener(frmPickImageBinding: FrmPickImageNewBinding) {
        frmPickImageBinding.apply {

            tvOver.setSingleClick {
                pickImageViewModel.actionState.value = PushPostViewModel.STATE.NOTIFY_DATA
                if (parentFragment is FrmPushPostsNew) {
                    (parentFragment as FrmPushPostsNew).apply {
                        this.handleAddNewRecord()
                    }
                }
                EventBus.getDefault().post("notifi_data")
                dismiss()
            }
            btnBack.setSingleClick {
                if (!pickImageViewModel.isEditPost) {
                    // check listImagePickerNews contains listImagePickerOld -> result false Notify data push post
                    if (!listImagePickerNews.containsAll(listImagePickerOld) || !listImagePickerOld.containsAll(
                            listImagePickerNews
                        )
                    ) {
                        pickImageViewModel.actionState.value = PushPostViewModel.STATE.NOTIFY_DATA
                    }
                    pickImageViewModel.contentSelected.value?.listImg?.value = listImagePickerNews
                } else pickImageViewModel.contentSelected.value?.listImg?.value =
                    listImagePickerOldEdit
                dismiss()
            }
        }
    }

    private fun setupTopNavigation(frmPickImageBinding: FrmPickImageNewBinding) {
        frmPickImageBinding.apply {
            clTopNav.resizeHeight(getSizeWithScale(56.0))
            tvTopNavTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(16.0))
            tvOver.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(16.0))
            btnBack.resizeLayout(getSizeWithScale(28.0), getSizeWithScale(28.0))
        }

    }

    private fun setDataToView(list: ArrayList<ImagePicker>) {
//        binding?.clImagePreview?.initData(requireContext(), list)
    }

    private var listImage: ArrayList<ImagePicker>? = null

    private fun getPicturePaths() {
        flow = flow {
            //create item camera
            emit(ImagePicker(isCamera = true))
            listImagePicker.add(ImagePicker(isCamera = true))

            val uriExternal = MediaStore.Files.getContentUri("external")
            val projection = arrayOf(
                MediaStore.Files.FileColumns._ID,
                MediaStore.Files.FileColumns.DISPLAY_NAME, MediaStore.Files.FileColumns.MIME_TYPE
            )
            val selection = (MediaStore.Files.FileColumns.MEDIA_TYPE + "="
                    + MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE
                    + " OR "
                    + MediaStore.Files.FileColumns.MEDIA_TYPE + "="
                    + MediaStore.Files.FileColumns.MEDIA_TYPE_VIDEO
                    + " AND " + "${MediaStore.Video.Media.SIZE}<=? AND ${MediaStore.Video.Media.DURATION} <=?")
            // check file video < 100mb and duration <=30s
            val threshold = 100 * 1024 * 1024
            val selectionArgs = arrayOf(
                threshold.toString(),
                TimeUnit.MILLISECONDS.convert(30, TimeUnit.SECONDS).toString()
            )
            val sortOder = " ${MediaStore.Files.FileColumns.DATE_MODIFIED} DESC"
            val cursor: Cursor? =
                activity?.contentResolver?.query(
                    uriExternal,
                    projection,
                    selection,
                    selectionArgs,
                    sortOder
                )
            var columnIndexID: String
            try {
                cursor?.let {
                    cursor.moveToFirst()
                    do {
                        val typeMedia =
                            cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Files.FileColumns.MIME_TYPE))
                        val name =
                            cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Files.FileColumns.DISPLAY_NAME))
                        columnIndexID =
                            cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Files.FileColumns._ID))
                        val uriImage = Uri.withAppendedPath(uriExternal, "" + columnIndexID)
                        val imgPicker = ImagePicker(
                            uriImage.toString(),
                            isVideo = typeMedia.startsWith("video")
                        )
                        if (imgPicker.isVideo) {
                            activity?.apply {
                                imgPicker.isFormatVideo = AppUtils.isFormatVideo(
                                    AppUtils.getRealPathFromURI(
                                        this,
                                        uriImage
                                    )
                                )
                            }
                            if (imgPicker.isFormatVideo) {
                                listImagePicker.add(imgPicker)
                                emit(imgPicker)
                            }

                        } else {
                            activity?.apply {
                                imgPicker.isFormatImage = AppUtils.isFormatImage(
                                    AppUtils.getRealPathFromURI(
                                        this,
                                        uriImage
                                    )
                                )
                            }
                            if (imgPicker.isFormatImage) {
                                listImagePicker.add(imgPicker)
                                emit(imgPicker)
                            } else {
                                val bitmap = MediaStore.Images.Media.getBitmap(
                                    requireContext().contentResolver,
                                    Uri.parse(imgPicker.uri)
                                )
                                val uri =
                                    bitmap.compress(context = requireContext()) // uri photos convert

                                var fDelete: File?
                                if (Build.VERSION.SDK_INT >= 29) {
                                    fDelete = File(Uri.parse(imgPicker.uri).path)
                                } else {
                                    fDelete = File(
                                        getRealPathFromURI(
                                            Uri.parse(imgPicker.uri),
                                            requireContext()
                                        )
                                    )

                                }
                                fDelete.delete(requireContext()) // delete malformed photos

                                imgPicker.uri = uri.toString()
                                imgPicker.isFormatImage = true

                                listImagePicker.add(imgPicker)
                                emit(imgPicker)
                            }
                        }

                    } while (cursor.moveToNext())
                    cursor.close()
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }.flowOn(Dispatchers.IO)

    }

    private fun openCamera() {
        startForResult.launch(Intent(requireContext(), CameraActivity::class.java))
    }

    //Start Resize
    private var scaleValue = 0F
    private fun getScaleValue(): Float {
        if (scaleValue == 0F) {
            scaleValue = resources.displayMetrics.widthPixels * 1f / AppConst.SCREEN_WIDTH_DESIGN
        }
        return scaleValue
    }

    fun getSizeWithScale(sizeDesign: Double): Int {
        return (sizeDesign * getScaleValue()).toInt()
    }

    fun getSizeWithScaleFloat(sizeDesign: Double): Float {
        return (sizeDesign * getScaleValue()).toFloat()
    }

    fun getRealSize(sizeDesign: ViewSize): ViewSize {
        return ViewSize(sizeDesign.width * getScaleValue(), sizeDesign.height * getScaleValue())
    }
    //End Resize

    private fun removeFileNotExist(
        list: MutableLiveData<ArrayList<ImagePicker>>,
        isEditPost: Boolean = false
    ) {
        if (!isEditPost) {
            val tmpListImageSelected = ArrayList<ImagePicker>()
            var numberSelect = 1
            list.value?.forEach {
                if (isFileExist(it.path, Uri.parse(it.uri), requireContext())) {
                    it.numberSelect = numberSelect++
                    tmpListImageSelected.add(it)
                }
            }

            list.value = tmpListImageSelected
        } else {
            val tmpListImageSelected = ArrayList<ImagePicker>()
            var numberSelect = 1
            list.value?.forEach {
                if (it.isFileToSever) {
                    it.numberSelect = numberSelect++
                    tmpListImageSelected.add(it)
                } else {
                    if (isFileExist(it.path, Uri.parse(it.uri), requireContext())) {
                        it.numberSelect = numberSelect++
                        tmpListImageSelected.add(it)
                    }
                }
            }
            list.value = tmpListImageSelected
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        try {
            if (jobInsertImagePicker.isActive) jobInsertImagePicker.cancel() // stop coroutine
            flow.cancellable()  // stop flow
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

}