package brite.outdoor.ui.fragments.my_page

import android.Manifest
import android.content.pm.PackageManager
import android.graphics.*
import android.location.Address
import android.location.Geocoder
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.viewModels
import brite.outdoor.R
import brite.outdoor.adapter.AdapterLocationSave
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.AppConst.Companion.FRM_LOCATION_SAVE
import brite.outdoor.constants.PrefConst
import brite.outdoor.data.api_entities.response.ResponseListCamping
import brite.outdoor.data.local.pref.PrefManager
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.databinding.FrmLocationSaveBinding
import brite.outdoor.ui.dialog.DialogDelete
import brite.outdoor.ui.dialog.DialogFragmentReminder
import brite.outdoor.ui.fragments.BaseFragment
import brite.outdoor.ui.widgets.anchorbottomsheet.AnchorBottomSheetBehavior
import brite.outdoor.utils.*
import brite.outdoor.utils.extension.ViewExtension.setShowOrHide
import brite.outdoor.viewmodel.LocationSaveViewModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import java.io.ByteArrayOutputStream
import android.graphics.BitmapFactory
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.frm_map.*
import kotlinx.android.synthetic.main.layour_image_picked_preview.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.RelativeLayout

import com.google.android.gms.maps.CameraUpdate
import com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
import com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback

import com.google.android.gms.maps.model.MarkerOptions

import com.google.android.gms.maps.model.LatLng








@AndroidEntryPoint
class FrmLocationSave : BaseFragment<FrmLocationSaveBinding>(), GoogleMap.OnMarkerClickListener,
    OnMapReadyCallback {

    private val viewModel by viewModels<LocationSaveViewModel>()
    private var adapter: AdapterLocationSave? = null

    private var mapFragment: SupportMapFragment? = null
    private var initMapPosition: LatLng? = null
    private var midLatLng: LatLng? = null
    private var markerPerth: Marker? = null
    private var behavior: AnchorBottomSheetBehavior<View>? = null
    private var mMap: GoogleMap? = null
    private var urlPrefix: String?=null

    override fun loadControlsAndResize(binding: FrmLocationSaveBinding?) {
        binding?.apply {
            val heightToolBar = getSizeWithScale(80.0)
            toolbar.resizeHeight(heightToolBar)

            clFilter.layoutParams.height = getSizeWithScale(35.0)
            icFilter.resizeLayout(getSizeWithScale(18.0), getSizeWithScale(18.0))
            btnBack.resizeLayout(getSizeWithScale(32.0), getSizeWithScale(24.0))
            closeFilter.resizeLayout(getSizeWithScale(28.0), getSizeWithScale(28.0))
            tvTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, getSizeWithScaleFloat(16.0))
            val whProgressLoading = MyApplication.getInstance().getSizeWithScale(40.0)
            progress.resizeLayout(whProgressLoading,whProgressLoading)
            imgContent.layoutParams.height = getSizeWithScale(220.0)
            rcView.layoutParams.height = getSizeWithScale(200.0)

            rcView.layoutParams.let {
                if (it is ConstraintLayout.LayoutParams) {
                    it.topMargin = getSizeWithScale(65.0)
                }
            }

            btnBack.setSingleClick {
                finish()
            }
            icFilter.setSingleClick {
                showOrHideFilter(true)
            }
            closeFilter.setSingleClick {
                showOrHideFilter(false)
            }
            tvPlan.setSingleClick {
                tvPlan.isSelected = true
                tvDelete.isSelected = false
                goToFrmReminder()

            }
            tvDelete.setSingleClick {
                tvDelete.isSelected = true
                tvPlan.isSelected = false
            }

            btnshare.setSingleClick {
                imgMap.visibility = View.VISIBLE
                    if (allPermissionsGranted()){
                        onPermissionGranted()
                    }else{
                        permissionRequest.launch(permissions.toTypedArray())
                    }

            }

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
    private val permissions = mutableListOf(
        Manifest.permission.CAMERA,
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_EXTERNAL_STORAGE
    ).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            add(Manifest.permission.ACCESS_MEDIA_LOCATION)
        }
    }

    private fun onPermissionGranted(){
        viewModel.isPermissionReadWriteExternalStorage = true
        loadBitmapMap()

        }

    private fun loadBitmapMap(){
        val latLng = LatLng(16.099830736380117, 105.21447016729022)
        val yourLocation = CameraUpdateFactory.newLatLngZoom(latLng, 5.5f)
        mMap?.animateCamera(yourLocation)
        mMap?.setOnMapLoadedCallback {
            mMap?.snapshot { bitmap ->
                if (bitmap != null) {
                    getBinding()?.let {
                        it.imgMap.setImageBitmap(bitmap)
                        mActivity?.onShareImageFacebook(loadBitmapFromView(it.clMap))
                        it.imgMap.visibility = View.GONE
//                        mActivity?.onShareImageFacebook()
                    }
                }
            }
        }
    }

    private fun loadBitmapFromView(v: View): Bitmap {
        val b = Bitmap.createBitmap(
            v.width, v.height, Bitmap.Config.ARGB_8888)
        val c = Canvas(b)
        v.layout(0, 0, v.width, v.height)
        v.draw(c)
        return b
    }
    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FrmLocationSaveBinding {
        return FrmLocationSaveBinding.inflate(inflater)
    }

    override fun initView(savedInstanceState: Bundle?) {
        getBinding()?.apply {
            mViewModel = viewModel
            lifecycleOwner = this@FrmLocationSave
            tvPlan.isSelected = true
        }
        callApiListCamping()
        observerListCamping()
        observerCreateCamping()
//        initData()
        initBottomSheet()
        observerDelete()
        listenerSearchView()
        mActivity?.let {
            mapFragment = childFragmentManager.findFragmentById(R.id.fmrMap) as SupportMapFragment?
        }
        viewModel.actionState.observe(this,{
            when(it){
                LocationSaveViewModel.STATE.NOTIFY_DATA -> {
                    adapter?.notifyDataSetChanged()
                }
            }
        })
    }

    override fun getCurrentFragment() = FRM_LOCATION_SAVE

    override fun finish() {
        mActivity?.closeSettingScreen(this)
    }
    override fun isBackPreviousEnable(): Boolean {
        return true
    }

    override fun backToPrevious() {
        finish()
    }
    override fun onMarkerClick(p0: Marker): Boolean {
        getBinding()?.apply {
            rcView.visibility = View.GONE
            clToolbar.setShowOrHide(false)
            tvTitle.setShowOrHide(false)
            clFilter.setShowOrHide(true)
        }
        viewModel.listLocation.forEach {
            if (p0.position == LatLng(it.lat?.toDouble()!!, it.lng?.toDouble()!!) ) {
                showBottomSheet(it)
            }
        }
        return false
    }

    override fun onMapReady(p0: GoogleMap) {
        p0.clear()
        initGoogleMap(p0)
        setMapStyle(p0)
        viewModel.listLocation.forEach {
            val position = it.lat?.toDouble()?.let { it1 -> it.lng?.toDouble()
                ?.let { it2 -> LatLng(it1, it2) } }
            markerPerth = p0.addMarker(
                MarkerOptions()
                    .position(position)
                    .icon(if (it.plans_status == 1) BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_flag) else BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_flag_prepare))
                    .anchor(0.5f, 1f)
            )
        }

        markerPerth?.tag = 0
        // Set a listener for marker click.
        p0.setOnMarkerClickListener(this)
    }

    private fun showDialogConfirmDelete(entityLocationSave: ResponseListCamping.ListCampingData) {
        val dialogDelete = DialogDelete(requireContext())
        dialogDelete.apply {
            show(true, resources.getString(R.string.msgDeletePost), resources.getString(R.string.msgConfirmDeletePost), object :
                DialogDelete.OnDeleteAgreeOrCancel{
                override fun onAgree() {
                    callApiDelete(entityLocationSave.id)
                }
            })
        }
    }
    private fun callApiDelete(id:Int){
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            viewModel.requestDeleteCamping(requestParam, id.toString())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    private fun observerDelete() {
        viewModel.deleteCampingResult.observe(viewLifecycleOwner, {
            try {
                shareViewModel.showOrHideLoading(it)
                if (it.status == ApiResult.Status.SUCCESS) {
                    it?.data?.message?.let {
                        mActivity?.showDialogSuccess(it)
                        behavior?.state = AnchorBottomSheetBehavior.STATE_COLLAPSED
                        callApiListCamping()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        })
    }
    private fun initGoogleMap(mMap: GoogleMap) {
        this.mMap = mMap
        mMap.uiSettings.isMapToolbarEnabled = false
        mMap.let {
            initMapPosition = LatLng(21.038171768188477, 105.79374694824219)

            it.animateCamera(CameraUpdateFactory.newLatLngZoom(initMapPosition, 7f))
            it.setOnCameraMoveListener(GoogleMap.OnCameraMoveListener {
                midLatLng = mMap.cameraPosition.target
            })
            it.setOnCameraIdleListener {
                try {
                    midLatLng = mMap.cameraPosition.target
                    val geocoder = Geocoder(requireContext(), Locale.getDefault())
                    val addresses: List<Address> =
                        geocoder.getFromLocation(midLatLng?.latitude!!, midLatLng?.longitude!!, 1)

                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }

    private fun setMapStyle(p0: GoogleMap) {
        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            val success: Boolean = p0.setMapStyle(
                MapStyleOptions.loadRawResourceStyle(
                    requireContext(), R.raw.gm_style_no_marker
                )
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun showOrHideFilter(isShow: Boolean) {
        getBinding()?.apply {
            clToolbar.setShowOrHide(isShow)
            tvTitle.setShowOrHide(isShow)
            clFilter.setShowOrHide(!isShow)
            rcView.apply {
                if (!isShow) {
                    this.visibility = View.GONE
                    startAnimation(AnimationUtils.loadAnimation(requireContext(),
                        R.anim.scale_anim_out_top))
                } else {
                    visibility = View.VISIBLE
                    startAnimation(AnimationUtils.loadAnimation(requireContext(),
                        R.anim.scale_anim_to_bot))
                }
            }


            edtFilter.text.clear() //clear text
            AppUtils.hideKeyboard(root) // hide key broad
        }
    }

    private fun initAdapter() {
        getBinding()?.apply {
            adapter = AdapterLocationSave(requireContext()) { _, item, _ ->
                showBottomSheet(item)

                mMap?.animateCamera(CameraUpdateFactory.newLatLngZoom(item.lat?.toDouble()?.let { item.lng?.toDouble()?.let { it1 -> LatLng(it, it1) }
                }, 15f))
                showOrHideFilter(false)

            }
            rcView.adapter = adapter
            adapter?.initData(viewModel.listLocation)
        }
    }

    private fun initBottomSheet() {
        getBinding()?.apply {
            behavior = AnchorBottomSheetBehavior.from(this.bottomSheet)
            behavior?.state = AnchorBottomSheetBehavior.STATE_COLLAPSED

            behavior?.addBottomSheetCallback(object :
                AnchorBottomSheetBehavior.BottomSheetCallback() {
                override fun onStateChanged(bottomSheet: View, oldState: Int, newState: Int) {

                }

                override fun onSlide(bottomSheet: View, slideOffset: Float) {

                }

            })
        }
    }

    private fun showBottomSheet(entityLocationSave: ResponseListCamping.ListCampingData) {
        getBinding()?.apply {
            behavior?.state = AnchorBottomSheetBehavior.STATE_EXPANDED
            if (entityLocationSave.has_plans == 1){
                tvPlan.text = resources.getString(R.string.str_edit_plan)
            }else tvPlan.text = resources.getString(R.string.str_make_a_plan)

            if (entityLocationSave.plans_status == 2){
                tvDelete.visibility = View.GONE
            }else tvDelete.visibility  = View.VISIBLE
            viewModel.setLocation(entityLocationSave)
            imgContent.setImage(entityLocationSave.getListImage()?.get(0), urlPrefix, progress)
            entityLocationSave.name.let {
                if (it != null) {
                    viewModel.setAddress(it)
                }
            }
            tvDelete.setSingleClick {
                tvDelete.isSelected = true
                tvPlan.isSelected = false
                showDialogConfirmDelete(entityLocationSave)
            }
        }
    }

    private fun listenerSearchView() {
        getBinding()?.edtFilter?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                adapter?.filter?.filter(s)

            }

            override fun afterTextChanged(s: Editable?) {
            }

        })
    }

    private fun goToFrmReminder() {
        viewModel.location.value?.let {
            val dialog = DialogFragmentReminder.getInstance(it)
            dialog.show(this.childFragmentManager, "DialogFragmentReminder")
        }


    }

    private fun callApiListCamping() {
        try {
            val requestParam = mActivity!!.getRequestParamWithToken()
            viewModel.requestListCamping(requestParam)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun observerListCamping() {
        try {
            viewModel.listCampingResult.observe(viewLifecycleOwner, { it ->
                shareViewModel.showOrHideLoading(it)
                if (it.status == ApiResult.Status.SUCCESS) {
                    if (it.data?.response is ResponseListCamping.ListCampingResponse) {
                        (it.data.response as ResponseListCamping.ListCampingResponse).let {
                            urlPrefix = it.url_prefix
                                   if (it.url_prefix != null) {
                                       viewModel.setUrlPrefix(it.url_prefix)
                                   }
                                   if (it.url_prefix != null) {
                                       PrefManager.getInstance(requireContext()).writeString(PrefConst.PREF_URL_PREFIX_LOCATION, it.url_prefix)
                                   }
                            viewModel.listLocation.clear()
                            for (i in 0 until it.getListData()?.size!!){
                                it.getListData()?.get(i)?.let { it1 -> viewModel.listLocation.add(it1) }
                            }
                            mapFragment?.getMapAsync(this)
                            initAdapter()
                        }
                    }
                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    private fun observerCreateCamping() {
        try {
            viewModel.entityLocation.observe(viewLifecycleOwner, { it ->
                if (it.has_plans == 1){
                    getBinding()?.tvPlan?.text = "Sửa kế hoạch"
                }else getBinding()?.tvPlan?.text = "Lập kế hoạch"
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}