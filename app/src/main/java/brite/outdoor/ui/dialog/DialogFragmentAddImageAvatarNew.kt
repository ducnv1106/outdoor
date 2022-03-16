package brite.outdoor.ui.dialog

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import brite.outdoor.R
import brite.outdoor.adapter.ImagePickAdapterAvatar
import brite.outdoor.adapter.utils.MarginDecoration
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.AppConst.Companion.DIALOG_AVATAR
import brite.outdoor.constants.ExtraConst
import brite.outdoor.constants.ExtraConst.Companion.EXTRA_TYPE_FRAGMENT
import brite.outdoor.data.entities.ImagePicker
import brite.outdoor.databinding.FrmPickImageNewBinding
import brite.outdoor.entity.Media
import brite.outdoor.ui.activities.CameraActivity
import brite.outdoor.ui.fragments.BaseDialogFragment
import brite.outdoor.utils.*
import brite.outdoor.viewmodel.PushPostViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import org.greenrobot.eventbus.EventBus
import java.io.File

@AndroidEntryPoint
class DialogFragmentAddImageAvatarNew : BaseDialogFragment<FrmPickImageNewBinding>() {
    private lateinit var imagePickerAdapter: ImagePickAdapterAvatar
    private val pushPostViewModel by viewModels<PushPostViewModel>({ requireParentFragment() })
    private val postViewModel by viewModels<PushPostViewModel>()
    private var typeDialogFragment : Int= 0
    private var imagePicker : ImagePicker?=null
    private lateinit var flow: Flow<ImagePicker>
    val listImagePicker: ArrayList<ImagePicker> = ArrayList()
    private val jobInsertImagePicker = CoroutineScope(Dispatchers.Main)
    companion object {
        const val DIALOG_FRM_LOCATION=1
        const val DIALOG_FRM_UTENSILS=2
        private const val TAG = "DialogFragmentAvatar"
        fun getInstance(typeDialogFragment:Int=0):DialogFragment{
            val dialog=DialogFragmentAddImageAvatarNew()
            val bundle = Bundle()
            bundle.putInt(EXTRA_TYPE_FRAGMENT,typeDialogFragment)
            dialog.arguments=bundle
            return dialog
        }
    }

    private var binding: FrmPickImageNewBinding? = null

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
                imagePickerAdapter.insertImagePicker(it)
            }
        }
    }

    private var startForResult =  registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
        try {
            if (result.resultCode == AppConst.RESULT_CODE) {
                result.data?.let {
                    val media = it.getParcelableExtra<Media>(ExtraConst.EXTRA_MEDIA)
                    media?.let {
                        val imagePicker = ImagePicker(uri = it.uri.toString(),isChecked = true,path = it.path,isVideo = it.isVideo)

                        if (!imagePicker.isVideo){
                            activity?.let {
                                imagePicker.isFormatImage = AppUtils.isFormatImage(AppUtils.getRealPathFromURI(it,
                                    Uri.parse(imagePicker.uri))) // check format Image
                            }
                        }
                        this.imagePicker = imagePicker
                        binding?.tvOver?.isSelected = imagePicker.isChecked==true
                        imagePickerAdapter.resetSelected(imagePicker,true)
                        imagePickerAdapter.insertImagerPickerFirstPosition(imagePicker)
                    }


                }
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FrmPickImageNewBinding.inflate(inflater, container, false)
        loadControlsAndResize(binding)
        initView()
        return binding!!.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.FullScreenDialogStyle)
        arguments?.apply {
            typeDialogFragment = getInt(EXTRA_TYPE_FRAGMENT)
        }
    }

    override fun getThemeDialog(): Int = R.style.AddImageStyle

    private fun initView() {
        setupListView()
        if(allPermissionsGranted()){
            onPermissionGranted()
        }else{
            permissionRequest.launch(permissions.toTypedArray())
        }
        setDataToView()
    }

    override fun loadControlsAndResize(binding: FrmPickImageNewBinding?) {
        binding?.apply {
            setupTopNavigation(this)
            setupOnClickListener(this)

        }
    }
    private fun setDataToView(imagePick:ImagePicker?=null) {
        if (imagePick?.isCamera==true){
            val intent = Intent(requireContext(), CameraActivity::class.java)
            val bundle = Bundle()
            bundle.putInt(ExtraConst.EXTRA_MEDIA,DIALOG_AVATAR)
            intent.putExtras(bundle)
            startForResult.launch(intent)
        }else{
            imagePick?.let {
                if (it.isChecked) this.imagePicker = it
                else this.imagePicker = null
            }
            binding?.tvOver?.isSelected = imagePick?.isChecked==true
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
    private fun setupOnClickListener(frmPickImageBinding: FrmPickImageNewBinding) {
        frmPickImageBinding.apply {
            btnBack.setSingleClick {
                dismissAllowingStateLoss()
            }
            tvOver.setSingleClick {
                if (it.isSelected && imagePicker!=null) {
                    EventBus.getDefault().post(imagePicker)
                    dismissAllowingStateLoss()
                    flow.cancellable()  // stop flow
                    jobInsertImagePicker.cancel() // stop coroutine
                }
            }
        }
    }
    private fun setupListView() {
        activity?.let {
            imagePickerAdapter = ImagePickAdapterAvatar(
                it,
                getSizeWithScale(111.0),
                getSizeWithScale(16.0),
                getSizeWithScale(6.0),
                itemClickListener = {imagePicker: ImagePicker -> setDataToView(imagePicker) },
                getSizeWithScaleFloat(10.0)
            )
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

    private fun getPicturePaths(){
        flow = flow {
            //create item camera
            emit(ImagePicker(isCamera = true))
            listImagePicker.add(ImagePicker(isCamera = true))

            val uriExternal = MediaStore.Files.getContentUri("external")

            //read file local image
            val collectionImage = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            val projectionImage = arrayOf(
                MediaStore.Images.Media._ID,
                MediaStore.Images.Media.DISPLAY_NAME,
                MediaStore.Images.Media.SIZE,
            )

            // check file image <5mb
            val thresholdImage = 5 * 1024 * 1024
            val selectionImage = "${MediaStore.Images.ImageColumns.SIZE} <= ?"
            val selectionArgsImage = arrayOf(thresholdImage.toString())
            val sortOder = "${MediaStore.Images.ImageColumns.DATE_MODIFIED} DESC"
            val cursorImage: Cursor? =
                activity?.contentResolver?.query(
                    collectionImage,
                    projectionImage,
                    null,
                    null,
                    sortOder
                )
            var columnIndexIDImage: String
            try {
                cursorImage?.let {
                    cursorImage.moveToFirst()
                    do {
                        val name =
                            cursorImage.getString(cursorImage.getColumnIndexOrThrow(MediaStore.Images.Media.DISPLAY_NAME))
                        columnIndexIDImage =
                            cursorImage.getString(cursorImage.getColumnIndexOrThrow(MediaStore.Images.Media._ID))
                        val uriImage =
                            Uri.withAppendedPath(uriExternal, "" + columnIndexIDImage)
                        val imgPicker = ImagePicker(uriImage.toString(),isVideo = false)
                        activity?.apply {
                            imgPicker.isFormatImage = AppUtils.isFormatImage(AppUtils.getRealPathFromURI(this,uriImage))
                        }
                        if (imgPicker.isFormatImage){
                            listImagePicker.add(imgPicker)
                            emit(imgPicker)
                        }else{
                            val bitmap = MediaStore.Images.Media.getBitmap(requireContext().contentResolver, Uri.parse(imgPicker.uri))
                            val uri = bitmap.compress(context = requireContext()) // uri photos convert
                            var fDelete:File?

                            if(android.os.Build.VERSION.SDK_INT >= 29){
                                fDelete = File(Uri.parse(imgPicker.uri).path)
                            }else{
                                fDelete = File(getRealPathFromURI(Uri.parse(imgPicker.uri),requireContext()))

                            }

                            fDelete.delete(requireContext()) // delete malformed photos

                            imgPicker.uri=uri.toString()
                            imgPicker.isFormatImage=true

                            listImagePicker.add(imgPicker)
                            emit(imgPicker)
                        }
                    } while (cursorImage.moveToNext())
                    cursorImage.close()
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }.flowOn(Dispatchers.IO)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.getDefault().post(true)
    }
    //Start Resize
    private var scaleValue = 0F
    private fun getScaleValue(): Float {
        if (scaleValue == 0F) {
            scaleValue = resources.displayMetrics.widthPixels * 1f / AppConst.SCREEN_WIDTH_DESIGN
        }
        return scaleValue
    }
    //End Resize
    private fun showConfirmChooseImage(){
        val dialog = DialogExit(requireContext())
        dialog.show(false,resources.getString(R.string.titleConfirm),resources.getString(R.string.msgConfirmChooseImage),object : DialogExit.CallbackListenerExit{
            override fun onOk() {
                mActivity?.dismissDialogs()
            }

            override fun onCancel() {}
        },true)
    }

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmPickImageNewBinding {
        return FrmPickImageNewBinding.inflate(inflater,container,false)
    }

    override fun initView(savedInstanceState: Bundle?) {

    }

    override fun onDestroy() {
        super.onDestroy()
        try {
            if ( jobInsertImagePicker.isActive)   jobInsertImagePicker.cancel() // stop coroutine
            flow.cancellable()  // stop flow
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

}