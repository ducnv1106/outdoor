package brite.outdoor.utils

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.ActivityInfo
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.SystemClock
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import androidx.viewpager2.widget.ViewPager2
import brite.outdoor.R
import brite.outdoor.app.MyApplication
import brite.outdoor.constants.ApiConst
import brite.outdoor.constants.AppConst
import brite.outdoor.constants.AppConst.Companion.TYPE_NOTIFICATION_QUESTION
import brite.outdoor.data.api_entities.ResponseLikePostHotNews
import brite.outdoor.data.api_entities.response.*
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.entity.EntityLocationSave
import brite.outdoor.ui.widgets.CustomLayoutInteractive
import brite.outdoor.ui.widgets.ProgressView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.google.android.exoplayer2.ExoPlaybackException
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.source.hls.HlsMediaSource
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util
import com.google.gson.Gson
import com.google.gson.internal.LinkedTreeMap
import com.google.gson.reflect.TypeToken
import com.squareup.picasso.Picasso
import kotlinx.coroutines.Dispatchers
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.lang.reflect.Type
import java.text.SimpleDateFormat
import java.util.*


fun <T> performGetOperation(gson: Gson, networkCall: suspend () -> ApiResult<T>): LiveData<ApiResult<T>> =
        liveData(Dispatchers.IO) {
            emit(ApiResult.loading())
            val responseStatus = networkCall.invoke()
            if (responseStatus.data is BaseApiResult) {
                if (responseStatus.status == ApiResult.Status.SUCCESS) {
                    if (responseStatus.data.status == ApiConst.HTTP_OK) { //OK
                        if (responseStatus.data.response is LinkedTreeMap<*,*>) {
                            val dataResponse = gson.toJson(responseStatus.data.response)
                            if (dataResponse.isNotEmpty()) {
                                try {
                                    var responseConvert: Any? = null
                                    when (responseStatus.data) {
                                        is ResponseLogin.LoginResult -> { //TODO: LOGIN
                                            responseConvert = gson.fromJson(dataResponse, ResponseLogin.Response::class.java)
                                        }
                                        is ResponseLogout.LogoutResult -> {
                                            responseConvert = gson.fromJson(dataResponse, ResponseLogout.LogoutResponse::class.java)
                                        }
                                        is ResponseListLocation.LocationResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseListLocation.LocationResponse>(){}.type)
                                        }
                                        is ResponseListUtensils.UtensilsResult ->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseListUtensils.UtensilsResponse>(){}.type)
                                        }
                                        is ResponseSearchLocations.SearchLocationsResult -> {
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseSearchLocations.SearchLocationsResponse>(){}.type)
                                        }
                                        is ResponseSearchUtensils.SearchUtensilsResult -> {
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseSearchUtensils.SearchUtensilsResponse>(){}.type)
                                        }
                                        is ResponseDetail.DetailResult -> {
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseDetail.DetailResponse>(){}.type)
                                        }
                                        is ResponseListPostUser.ListPostUserResult -> {
                                            responseConvert=gson.fromJson(dataResponse,object : TypeToken<ListPostUserResponse>(){}.type)
                                        }
                                        is ResponseDetailPost.DetailPostResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseDetailPost.DetailPostResponse>(){}.type)
                                        }
                                        is ResponseListBookMark.ListBookMarkResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object : TypeToken<ResponseListBookMark.ListBookMarkResponse>(){}.type)
                                        }
                                        is ResponseFollow.FollowResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseFollow.FollowResponse>(){}.type)
                                        }
                                        is ResponseLike.LikesResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseLike.LikeResponse>(){}.type)
                                        }
                                        is ResponseListComment.ListCommentResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseListComment.ListCommentResponse>(){}.type)
                                        }
                                        is ResponseListCommentLevel2.ListCommentLevel2Result ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseListCommentLevel2.ListCommentLevel2Response>(){}.type)
                                        }
                                        is ResponsePostComment.PostCommentResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponsePostComment.ListCommentResponse>(){}.type)
                                        }
                                        is ResponseSearchUser.SearchUserResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseSearchUser.SearchUserResponse>(){}.type)
                                        }
                                        is ResponseReport.ReportResult->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseReport.ReportResponse>(){}.type)
                                        }
                                        is ResponseCreateHash.CreateHashResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseCreateHash.CreateHashResponse>(){}.type)
                                        }

                                        is ResponseListPostLocation.ListPostLocationResult->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseListPostLocation.ListPostLocationResponse>(){}.type)
                                        }
                                        is ResponseBookMart.BookMartResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseBookMart.BookMartResponse>(){}.type)
                                        }
                                        is ResponseDeleteComment.DeleteCommentResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseDeleteComment.DeleteCommentResponse>(){}.type)
                                        }
                                        is ResponseFollowUser.FollowUserResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseFollowUser.FollowUserResponse>(){}.type)
                                        }

                                        is ResponseNotification.NotificationResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseNotification.NotificationResponse>(){}.type)
                                        }

                                        is ResponseListFollower.ListFollowerResult ->{
                                            responseConvert=gson.fromJson(dataResponse,object :TypeToken<ResponseListFollower.ListFollowerResponse>(){}.type)
                                        }

                                        is ResponseShares.SharesResult->{
                                            responseConvert=gson.fromJson(dataResponse,object : TypeToken<ResponseShares.ShareResponse>(){}.type)
                                        }
                                        is ResponseNotifyUnread.NotifyUnreadResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseNotifyUnread.NotifyUnreadResponse>(){}.type)
                                        }
                                        is  ResponseEditPost.EditPostResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseEditPost.EditPostResponse>(){}.type)
                                        }
                                        is ResponseQuestion.QuestionResult->{
                                            responseConvert = gson.fromJson(dataResponse,object : TypeToken<ResponseQuestion.QuestionResponse>(){}.type)
                                        }
                                        is ResponseCreateQuestion.CreateQuestionResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseCreateQuestion.CreateQuestionResponse>(){}.type)
                                        }
                                        is ResponseLikeQuestion.LikeQuestionResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseLikeQuestion.LikeQuestionResponse>(){}.type)
                                        }
                                        is ResponseBookMarkQuestion.BookMarkQuestionResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseBookMarkQuestion.BookMarkQuestionResponse>(){}.type)
                                        }
                                        is ResponseDeleteQuestion.DeleteQuestionResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseDeleteQuestion.DeleteQuestionResponse>(){}.type)
                                        }
                                        is ResponseAnswerQuestion.AnswerQuestionResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseAnswerQuestion.AnswerQuestionResponse>(){}.type)
                                        }
                                        is ResponsePostAnswerQuestion.PostAnswerQuestionResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponsePostAnswerQuestion.PostAnswerQuestionResponse>(){}.type)
                                        }
                                        is ResponseEditQuestion.EditQuestionResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseEditQuestion.EditQuestionResponse>(){}.type)
                                        }
                                        is ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResponse>(){}.type)
                                        }
                                        is ResponseListReplyAnswerQuestion.ListReplyAnswerQuestionResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseListReplyAnswerQuestion.ListReplyAnswerQuestionResponse>(){}.type)
                                        }
                                        is ResponseDetailQuestion.DetailQuestionResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseDetailQuestion.DetailQuestionResponse>(){}.type)
                                        }
                                        is ResponseListCamping.ListCampingResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseListCamping.ListCampingResponse>(){}.type)
                                        }
                                        is ResponseCreateCamping.CreateCampingResult->{
                                        responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseCreateCamping.CreateCampingResponse>(){}.type)
                                        }
                                        is ResponseListCadastral.ListCadastralResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseListCadastral.ListCadastralResponse>(){}.type)
                                        }
                                        is ResponseListPostHotNews.ListPostHotNewsResult->{
                                            responseConvert = gson.fromJson(dataResponse,object : TypeToken<ResponseListPostHotNews.ListPostHotNewsResponse>(){}.type)
                                        }
                                        is ResponseDetailHotNews.DetailHotNewsResult->{
                                            responseConvert = gson.fromJson(dataResponse,object : TypeToken<ResponseDetailHotNews.DetailPostHotNewsResponse>(){}.type)
                                        }
                                        is ResponseLikePostHotNews.LikePostHotNewsResult->{
                                            responseConvert = gson.fromJson(dataResponse,object : TypeToken<ResponseLikePostHotNews.LikePostHotNewsResponse>(){}.type)
                                        }
                                        is ResponseSharePostHotNews.SharePostHotNewsResult->{
                                            responseConvert = gson.fromJson(dataResponse,object : TypeToken<ResponseSharePostHotNews.SharePostHotNewsResponse>(){}.type)
                                        }
                                        is ResponseListCommentHotNews.ListCommentHotNewsResult->{
                                            responseConvert = gson.fromJson(dataResponse,object : TypeToken<ResponseListCommentHotNews.ListCommentHotNewsResponse>(){}.type)
                                        }
                                        is ResponsePostCommentHotNews.PostCommentHotNewsResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponsePostCommentHotNews.PostCommentHotNewsResponse>(){}.type)
                                        }
                                        is ResponseDeleteCommentHotNews.DeleteCommentHotNewsResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseDeleteCommentHotNews.DeleteCommentHotNewsResponse>(){}.type)
                                        }
                                        is ResponseListReplyCommentHotNews.ListReplyCommentHotNewsResult->{
                                            responseConvert = gson.fromJson(dataResponse,object :TypeToken<ResponseListReplyCommentHotNews.ListReplyCommentHotNewsResponse>(){}.type)
                                        }

                                    }
                                    responseConvert?.let { responseStatus.data.response = it }
                                } catch (e: Exception) {
                                    e.printStackTrace()
                                }
                            }
                        }
                        emit(ApiResult.success(responseStatus.data))
                        return@liveData
                    } else if (responseStatus.data.status == ApiConst.HTTP_ERROR_TOKEN) { //Error Token
                        emit(ApiResult.errorToken(responseStatus.data.message, null))
                        return@liveData
                    }
                    else if (responseStatus.data.status == ApiConst.HTTP_ERROR_DELETED_POST) { //Error Token
                        emit(ApiResult.errorDeletedPost(responseStatus.data.message, null))
                        return@liveData
                    }
                    else if (responseStatus.data.status==ApiConst.HTTP_ERROR_DELETED_COMMENT){
                        emit(ApiResult.errorDeleteComment(responseStatus.data.message,null))
                        return@liveData
                    }
                }
                emit(ApiResult.error(responseStatus.data.message, null))
                return@liveData
            }
            if (responseStatus.status==ApiResult.Status.ERROR_NETWORK){
                emit(ApiResult.errorNetwork(null))
                return@liveData
            }else{
                emit(ApiResult.error(responseStatus.message, null))
                return@liveData
            }

        }
@BindingAdapter("onSingleClick")
fun View.setSingleClick(execution: (View) -> Unit) {
    setOnClickListener(object : View.OnClickListener {
        var lastClickTime: Long = 0
        override fun onClick(p0: View?) {
            if (SystemClock.elapsedRealtime() - lastClickTime < AppConst.THRESHOLD_CLICK_TIME) {
                return
            }
            lastClickTime = SystemClock.elapsedRealtime()
            execution.invoke(this@setSingleClick)
        }
    })
}

@BindingAdapter("onSingleClickSwitchScreen")
fun View.setSingleClickSwitchScreen(execution: () -> Unit) {
    setOnClickListener(object : View.OnClickListener {
        var lastClickTime: Long = 0
        override fun onClick(p0: View?) {
            if (SystemClock.elapsedRealtime() - lastClickTime < AppConst.THRESHOLD_CLICK_TIME_SWITCH_SCREEN) {
                return
            }
            lastClickTime = SystemClock.elapsedRealtime()
            execution.invoke()
        }
    })
}
fun urlImage(image:String?,urlPrefix:String?):String{
    urlPrefix?.let { it ->
        image?.let { _ ->
            return it+image
        }
    }
    return ""
}
fun ImageView.loadImageWithCustomCorners( urlImage: String?, radius: Int){
    Glide.with(context).load(urlImage)
        .placeholder(R.drawable.progress_animation)
        .error(R.drawable.ic_no_image)
        .transform(CenterCrop(),RoundedCorners(radius))
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
        .into(this@loadImageWithCustomCorners)

}
fun ImageView.loadImageWithProgressAndCustomCorners( urlImage: String?, radius: Int,progress:ImageView){
    Glide.with(context).load(urlImage)
            .listener(object :RequestListener<Drawable>{
                override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>?, isFirstResource: Boolean): Boolean {
                    progress.visibility=View.GONE
                    progress.animation = null
                    return false
                }

                override fun onResourceReady(resource: Drawable?, model: Any?, target: Target<Drawable>?, dataSource: com.bumptech.glide.load.DataSource?, isFirstResource: Boolean): Boolean {
                    progress.visibility=View.GONE
                    progress.animation = null
                    return false
                }


            })
            .transform(CenterCrop(),RoundedCorners(radius))
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .into(this@loadImageWithProgressAndCustomCorners)

}

fun ImageView.loadImageUrl( urlImage: String?){
    Glide.with(context).load(urlImage)
        .placeholder(R.drawable.progress_animation)
        .error(R.drawable.ic_no_images)
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
        .into(this)

}
fun ImageView.loadImageDrawable( drawable:Drawable){
    Glide.with(context).load(drawable)
        .error(R.drawable.ic_no_images)
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
        .into(this)
}
fun getDate(time:String?): String {
    try {
        time?.let {
            val year = time.substring(startIndex = 0, endIndex = 4)
            val month = time.substring(startIndex = 5,endIndex = 7)
            val day = time.substring(startIndex = 8,endIndex = 10)
            return "$day/$month/$year"
        }
    }catch (e:Exception){
        e.printStackTrace()
    }
    return ""

}
@SuppressLint("SetTextI18n")
@BindingAdapter("setTimeNotification")
fun TextView.setTimeNotification(time:String?){
    try {
        time?.let {
            val year = time.substring(startIndex = 0, endIndex = 4)
            val month = time.substring(startIndex = 5,endIndex = 7)
            val day = time.substring(startIndex = 8,endIndex = 10)
            this.text = "$day/$month/$year"
        }
    }catch (e:Exception){
        e.printStackTrace()
    }

}
@BindingAdapter("isRefreshing")
fun SwipeRefreshLayout.customRefreshing(refreshing: Boolean?) {
    isRefreshing = refreshing == true

}
@BindingAdapter("setText")
fun TextView.setText(name:String?){
    name?.let {
        this.text=name
    }
}
@SuppressLint("SetTextI18n")
@BindingAdapter(value = ["nameUser", "typeNotification","comment"], requireAll = false)
fun TextView.nameUser(nameUser:String?,typeNotification:Int,comment:String?){
        nameUser?.let {
            if (typeNotification==AppConst.TYPE_NOTIFICATION_FOLLOW){
                this.text = "$nameUser ${resources.getString(R.string.str_notification_follow)}"
            }else if (typeNotification==AppConst.TYPE_NOTIFICATION_COMMENT){
                if (comment==null){
                    this.text = "$nameUser ${resources.getString(R.string.str_notification_comment)}"
                }else{
                    this.text = "$nameUser ${resources.getString(R.string.str_notification_comment)}: $comment"
                }

            }else if (typeNotification == TYPE_NOTIFICATION_QUESTION){
                this.text =  "$nameUser ${resources.getString(R.string.str_notification_question)}: $comment"
            } else{
                this.text = "$nameUser ${resources.getString(R.string.str_notification_new_post)}"
            }
        }
}
@SuppressLint("SetTextI18n")
@BindingAdapter("setTimePostNews")
fun TextView.setTimePostNews(timeString: String?){
    try {
        convertTimeStringToLong(timeString)?.let {
            val time = convertTimeStringToLong(localTime())?.minus(it)
            val day= time?.div((1000*60*60*24))
            val hours = time?.div((1000*60*60))
            val minute = time?.div((1000*60))
            val seconds = time?.div((1000))
            if (day != null) {
                if (day in 1..6){
                    this.text="$day ${resources.getString(R.string.str_day_item_news)}"
                    return
                }else if (day>6){
                    this.text =  convertTimeLongToString(it,AppConst.DATE_FORMAT_ITEM_NEWS)
                    return
                }
            }
            if (minute==0L){
                this.text = "$minute ${resources.getString(R.string.str_minutes_item_news)}"
                return
            }
            if (minute != null) {
                this.text="$hours ${resources.getString(R.string.str_hours_item_news)} ${minute%60} ${resources.getString(R.string.str_minutes_item_news)}"
            }
            return


        }
    }catch (e:Exception){
        e.printStackTrace()
    }
}

@SuppressLint("SimpleDateFormat")
fun localTime(): String {
    try {
        val time = System.currentTimeMillis()
        val sdf = SimpleDateFormat(AppConst.DATE_FORMAT)
        sdf.timeZone = TimeZone.getTimeZone("GMT+7")
        return sdf.format(Date(time))
    } catch (e: Exception) {
    }
    return ""
}
@SuppressLint("SimpleDateFormat")
fun convertTimeStringToLong(time:String?):Long?{
    try {
        val f = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
        val parse=f.parse(time!!)
        return parse?.time
    }catch (e:Exception){
        e.printStackTrace()
    }
    return null
}

@SuppressLint("SimpleDateFormat")
fun convertTimeLongToString(time:Long, dateFORMAT:String = AppConst.DATE_FORMAT): String {
    try {
        val sdf = SimpleDateFormat(dateFORMAT)
        sdf.timeZone = TimeZone.getTimeZone("GMT+7")
        return sdf.format(Date(time))
    } catch (e: Exception) {
    }
    return ""
}

@BindingAdapter(value = ["avatar_user", "url_prefix_avatar","radius","item"], requireAll = false)
fun ImageView.loadImageAvatar(avatar_user:String?,url_prefix_avatar:String?,radius:Int=0,item: Any?=null){
    try{
        if (item !=null && item is ResponseNotification.ListNotificationData){ // load  CircleImageView
            item.apply {
                Picasso.with(context).load(urlImage(this.avatar_user,url_prefix_avatar))
                    .placeholder(R.drawable.progress_animation)
                    .error(R.drawable.ic_avatar_default)
                    .into(this@loadImageAvatar)
            }
        }
        else{
            Glide.with(context).load(urlImage(avatar_user,url_prefix_avatar))
                .placeholder(R.drawable.progress_animation)
                .error(
                    Glide.with(context)
                        .load(R.drawable.ic_avatar_default)
                        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                        .transform(CenterCrop(), RoundedCorners(radius))
                )
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .transform(CenterCrop(), RoundedCorners(radius))
                .into(this@loadImageAvatar)
        }
    }catch (e:Exception){
        e.printStackTrace()
    }
}
@BindingAdapter("loadImagePost")
fun ImageView.loadImagePost(item:Any){
    try {
        if (item is ListPostUserData){
            item.apply {
                if (this.getListContent()?.size?:0 > 0 && (this.getListContent()?.get(0)?.listImg?.size?:0 > 0)){
                    this.getListContent()?.get(0)?.listImg?.get(0)?.let {
                        this@loadImagePost.loadImageWithCustomCorners(urlImage(it,this.url_prefix),1)
                    }
                }else this@loadImagePost.loadImageWithCustomCorners("",1)
            }
        }
    }catch (e:Exception){
        e.printStackTrace()
    }
}

fun ImageView.setImage(avatar:String?,url_prefix:String?,progress:ImageView){
    var requestOptions = RequestOptions()
    requestOptions = requestOptions.transforms(CenterCrop(),
        GranularRoundedCorners(70f, 70f, 0f, 0f))
    Glide.with(context).load("$url_prefix$avatar")
        .apply(requestOptions)
        .listener(object :RequestListener<Drawable>{
            override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>?, isFirstResource: Boolean): Boolean {
                progress.visibility=View.GONE
                progress.animation = null
                return false
            }

            override fun onResourceReady(resource: Drawable?, model: Any?, target: Target<Drawable>?, dataSource: com.bumptech.glide.load.DataSource?, isFirstResource: Boolean): Boolean {
                progress.visibility=View.GONE
                progress.animation = null
                return false
            }


        })
        .error(R.drawable.ic_no_image)
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
        .into(this)
}

@BindingAdapter("setTimeDay")
fun TextView.setTimeDay(time:String?){
    time?.let {
        try {
            this.text = it.substring(startIndex = 8,endIndex = 10)
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}
@BindingAdapter("setTimeMonth")
fun TextView.setTimeMonth(time:String?){
    time?.let {
        try {
            val monthNumber = time.substring(startIndex = 5,endIndex = 7)
            var month=""
            when(monthNumber){
                "01" -> month = resources.getString(R.string.str_month1)
                "02" -> month = resources.getString(R.string.str_month2)
                "03" -> month = resources.getString(R.string.str_month3)
                "04" -> month = resources.getString(R.string.str_month4)
                "05" -> month = resources.getString(R.string.str_month5)
                "06" -> month = resources.getString(R.string.str_month6)
                "07" -> month = resources.getString(R.string.str_month7)
                "08" -> month = resources.getString(R.string.str_month8)
                "09" -> month = resources.getString(R.string.str_month9)
                "10" -> month = resources.getString(R.string.str_month10)
                "11" -> month = resources.getString(R.string.str_month11)
                "12" -> month = resources.getString(R.string.str_month12)
            }
           this.text=month
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

}
@BindingAdapter("setLikeCommentShare")
fun CustomLayoutInteractive.setLikeCommentShare(count : Int?){
    try {
        if (count==null) this.setText("0")
        else {
            if (count>1000){
                this.setText((count/1000).toString()+" K"+(count%1000/100).toString().replace("0",""))
            }
            else this.setText(count.toString())
        }
    }catch (e:Exception){
        e.printStackTrace()
    }
}
@SuppressLint("SourceLockedOrientationActivity")
fun SimpleExoPlayer.preparePlayer(playerView: PlayerView,playerViewFullscreen: PlayerView ,forceLandscape:Boolean = false,progress:ProgressView,context: Context,viewPager2: ViewPager2?=null,position:Int=0) {
    try {
        (playerView.context as AppCompatActivity).apply {

            // view player Normal
            val fullScreenButton: ImageView = playerView.findViewById(R.id.exo_fullscreen_icon)
            val exoRewindNormal: ImageView = playerView.findViewById(R.id.exo_rew)
            val exoFastForNormal: ImageView = playerView.findViewById(R.id.exo_ffwd)
            val exoPlayNormal: ImageView = playerView.findViewById(R.id.exo_play)
            val exoPauseNormal: ImageView = playerView.findViewById(R.id.exo_pause)
            val muteNormalScreen: ImageView = playerView.findViewById(R.id.exo_mute)
            val volumeNormalScreen: ImageView = playerView.findViewById(R.id.exo_volume)

            //view player Fullscreen
            val normalScreenButton: ImageView = playerViewFullscreen.findViewById(R.id.exo_fullscreen_icon)
            val exoRewindFullScreen: ImageView = playerViewFullscreen.findViewById(R.id.exo_rew)
            val exoFastForFullScreen: ImageView = playerViewFullscreen.findViewById(R.id.exo_ffwd)
            val exoPlayFullScreen: ImageView = playerViewFullscreen.findViewById(R.id.exo_play)
            val exoPauseFullScreen: ImageView = playerViewFullscreen.findViewById(R.id.exo_pause)
            val muteFullScreen: ImageView = playerViewFullscreen.findViewById(R.id.exo_mute)
            val volumeFullScreen: ImageView = playerViewFullscreen.findViewById(R.id.exo_volume)

            // resize player Normal
            fullScreenButton.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)
            fullScreenButton.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)
            muteNormalScreen.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)
            muteFullScreen.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)
            volumeNormalScreen.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)
            volumeFullScreen.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)
            exoRewindNormal.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)
            exoRewindNormal.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)
            exoFastForNormal.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)
            exoFastForNormal.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)
            exoPlayNormal.layoutParams.height = MyApplication.getInstance().getSizeWithScale(25.0)
            exoPlayNormal.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)
            exoPauseNormal.layoutParams.height = MyApplication.getInstance().getSizeWithScale(25.0)
            exoPauseNormal.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)

            //resize player FullScreen
            normalScreenButton.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)
            normalScreenButton.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)
            muteFullScreen.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)
            muteFullScreen.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)
            volumeFullScreen.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)
            volumeFullScreen.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)
            exoRewindFullScreen.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)
            exoRewindFullScreen.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)
            exoFastForFullScreen.layoutParams.height = MyApplication.getInstance().getSizeWithScale(20.0)
            exoFastForFullScreen.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)
            exoPlayFullScreen.layoutParams.height = MyApplication.getInstance().getSizeWithScale(25.0)
            exoPlayFullScreen.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)
            exoPauseFullScreen.layoutParams.height = MyApplication.getInstance().getSizeWithScale(25.0)
            exoPauseFullScreen.layoutParams.width = MyApplication.getInstance().getSizeWithScale(20.0)

            ContextCompat.getDrawable(this, R.drawable.ic_fullscreen_open)?.let {
                fullScreenButton.loadImageDrawable(it)
            }
            ContextCompat.getDrawable(this, R.drawable.ic_fullscreen_open)?.let {
                normalScreenButton.loadImageDrawable(it)
            }
            ContextCompat.getDrawable(this, R.drawable.ic_mute)?.let {
                muteNormalScreen.loadImageDrawable(it)
            }
            ContextCompat.getDrawable(this, R.drawable.ic_volume)?.let {
                volumeNormalScreen.loadImageDrawable(it)
            }
            ContextCompat.getDrawable(this, R.drawable.ic_mute)?.let {
                muteFullScreen.loadImageDrawable(it)
            }
            ContextCompat.getDrawable(this, R.drawable.ic_volume)?.let {
                volumeFullScreen.loadImageDrawable(it)
            }
            fullScreenButton.setOnClickListener {
                window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
                supportActionBar?.hide()
                if (forceLandscape)
                    requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                playerView.visibility = View.GONE
                playerViewFullscreen.visibility = View.VISIBLE
                PlayerView.switchTargetView(this@preparePlayer, playerView, playerViewFullscreen)
                playerView.player?.volume?.let {
                    playerViewFullscreen.player?.volume = it
                }
                if (this@preparePlayer.volume == 0f) {
                    muteFullScreen.visibility = View.VISIBLE
                    volumeFullScreen.visibility = View.GONE
                } else {
                    muteFullScreen.visibility = View.GONE
                    volumeFullScreen.visibility = View.VISIBLE
                }
                viewPager2?.isUserInputEnabled=false
            }
            normalScreenButton.setOnClickListener {
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
                supportActionBar?.show()
                if (forceLandscape)
                    requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                ContextCompat.getDrawable(this, R.drawable.ic_fullscreen_open)?.let {
                    normalScreenButton.loadImageDrawable(it)
                }
                playerView.visibility = View.VISIBLE
                playerViewFullscreen.visibility = View.GONE
                playerViewFullscreen.player?.volume?.let {
                    playerView.player?.volume = it
                }
                PlayerView.switchTargetView(this@preparePlayer, playerViewFullscreen, playerView)

                if (this@preparePlayer.volume == 0f) {
                    muteNormalScreen.visibility = View.VISIBLE
                    volumeNormalScreen.visibility = View.GONE
                } else {
                    muteNormalScreen.visibility = View.GONE
                    volumeNormalScreen.visibility = View.VISIBLE
                }
                viewPager2?.isUserInputEnabled=true

            }
            playerView.resizeMode = AspectRatioFrameLayout.RESIZE_MODE_FIXED_HEIGHT
            playerView.player = this@preparePlayer

            this@preparePlayer.addListener(object : Player.Listener {
                override fun onPlayerError(error: ExoPlaybackException) {
                    super.onPlayerError(error)
                    progress.visibility = View.VISIBLE
                    progress.setAnimation(8,800)

                }
                override fun onPlaybackStateChanged(state: Int) {
                    super.onPlaybackStateChanged(state)
                    if (state == Player.STATE_BUFFERING) {
                        progress.visibility = View.VISIBLE
                        progress.setAnimation(8,800)



                    } else if (state == Player.STATE_READY) {
                        progress.visibility = View.GONE
                        progress.animation=null

                    }else if (state == Player.STATE_IDLE){

                    }
                }
            })
            muteNormalScreen.setOnClickListener {
                this@preparePlayer.volume = 1f
                volumeNormalScreen.visibility = View.VISIBLE
                muteNormalScreen.visibility = View.GONE

            }

            volumeNormalScreen.setOnClickListener {
                this@preparePlayer.volume = 0f
                volumeNormalScreen.visibility = View.GONE
                muteNormalScreen.visibility = View.VISIBLE
            }
            muteFullScreen.setOnClickListener {
                this@preparePlayer.volume = 1f
                volumeFullScreen.visibility = View.VISIBLE
                muteFullScreen.visibility = View.GONE

            }

            volumeFullScreen.setOnClickListener {
                this@preparePlayer.volume = 0f
                volumeFullScreen.visibility = View.GONE
                muteFullScreen.visibility = View.VISIBLE

            }

        }
    }catch (e:Exception){
        e.printStackTrace()
    }

}
fun SimpleExoPlayer.setSource(context: Context, url: String){
    try {
        val dataSourceFactory: DataSource.Factory = DefaultDataSourceFactory(context, Util.getUserAgent(context, "app"))
        val videoSource: MediaSource =
                if (url.endsWith("m3u8") || url.endsWith("m3u"))
                    HlsMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse(url))
                else
                    ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse(url))
        this.prepare(videoSource)
    }catch (e:Exception){
        e.printStackTrace()
    }
}
fun saveBitmapToFile(file: File): File? {
    return try {

        // BitmapFactory options to downsize the image
        val o = BitmapFactory.Options()
        o.inJustDecodeBounds = true
        o.inSampleSize = 6
        // factor of downsizing the image
        var inputStream = FileInputStream(file)
        //Bitmap selectedBitmap = null;
        BitmapFactory.decodeStream(inputStream, null, o)
        inputStream.close()

        // The new size we want to scale to
        val REQUIRED_SIZE = 75

        // Find the correct scale value. It should be the power of 2.
        var scale = 1
        while (o.outWidth / scale / 2 >= REQUIRED_SIZE &&
            o.outHeight / scale / 2 >= REQUIRED_SIZE
        ) {
            scale *= 2
        }
        val o2 = BitmapFactory.Options()
        o2.inSampleSize = scale
        inputStream = FileInputStream(file)
        val selectedBitmap = BitmapFactory.decodeStream(inputStream, null, o2)
        inputStream.close()

        // here i override the original image file
        file.createNewFile()
        val outputStream = FileOutputStream(file)
        selectedBitmap!!.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
        file
    } catch (e:Exception) {
        null
    }
}
fun File.getSizeInKB(): Int {
    return (this.length() / (1024)).toInt()
}
fun convertJsonToListLocation(source:String):ArrayList<ResponseListLocation.LocationData>{
    val type : Type =object : TypeToken<ArrayList<ResponseListLocation.LocationData>>(){}.type
    return Gson().fromJson(source,type)
}
fun convertJsonToListUtensil(source:String):ArrayList<ResponseListUtensils.UtensilsData>{
    val type : Type =object : TypeToken<ArrayList<ResponseListUtensils.UtensilsData>>(){}.type
    return Gson().fromJson(source,type)
}
fun getRealPathFromURI(uri: Uri,context: Context): String {
    try {
        var path = ""
        val proj = arrayOf(MediaStore.MediaColumns.DATA)
        val cursor: Cursor? = context.contentResolver?.query(uri, proj, null, null, null)
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                val columnIndex: Int =
                    cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATA)
                path = cursor.getString(columnIndex)
            }
        }
        cursor?.close()
        return path
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return ""
}
fun isFileExist(pathFile: String = "",fileUri: Uri,context: Context):Boolean{
    val file = if (pathFile.isEmpty()) File(getRealPathFromURI(fileUri,context))
    else File(pathFile)

    return file.exists() // check file exist
}
// Extension function to compress and change bitmap image format programmatically
fun Bitmap.compress(format:Bitmap.CompressFormat = Bitmap.CompressFormat.JPEG, quality:Int = 100,context: Context):Uri?{
    // Initialize a new ByteArrayStream
    val stream = ByteArrayOutputStream()
    // Compress the bitmap with JPEG format and quality 50%
    this.compress(
        format,
        quality,
        stream
    )

    val byteArray = stream.toByteArray()

    return getImageUri(context,BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size))

}
fun getImageUri(inContext: Context, inImage: Bitmap): Uri? {
    val path =
        MediaStore.Images.Media.insertImage(inContext.contentResolver, inImage, System.currentTimeMillis().toString(), null)
    return Uri.parse(path)
}
fun File.delete(context: Context): Boolean {
    var selectionArgs = arrayOf(this.absolutePath)
    val contentResolver = context.getContentResolver()
    var where: String? = null
    var filesUri: Uri? = null
    if (android.os.Build.VERSION.SDK_INT >= 29) {
        filesUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        where = MediaStore.Images.Media._ID + "=?"
        selectionArgs = arrayOf(this.name)
    } else {
        where = MediaStore.MediaColumns.DATA + "=?"
        filesUri = MediaStore.Files.getContentUri("external")
    }

    val int = contentResolver.delete(filesUri!!, where, selectionArgs)

    return !this.exists()
}




