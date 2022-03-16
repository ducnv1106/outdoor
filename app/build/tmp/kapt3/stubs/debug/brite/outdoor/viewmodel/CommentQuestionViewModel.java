package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001xB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J:\u0010e\u001a\u00020f2\"\u0010e\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100!j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\"2\u0006\u0010g\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020\u0019JB\u0010h\u001a\u00020f2\"\u0010h\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100!j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\"2\u0006\u0010g\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010W\u001a\u00020\u0019J2\u0010i\u001a\u00020f2\"\u0010i\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100!j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\"2\u0006\u0010g\u001a\u00020\u0010J2\u0010j\u001a\u00020f2\"\u0010j\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100!j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\"2\u0006\u0010g\u001a\u00020\u0010J2\u0010k\u001a\u00020f2\"\u0010e\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100!j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\"2\u0006\u0010g\u001a\u00020\u0010J4\u0010l\u001a\u00020f2\"\u0010l\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100!j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\"2\b\u0010m\u001a\u0004\u0018\u00010&J+\u0010n\u001a\u00020f2\u0006\u0010o\u001a\u00020\u00102\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010pJ\u0010\u0010q\u001a\u00020f2\b\u0010r\u001a\u0004\u0018\u00010\u0013J\u000e\u0010s\u001a\u00020f2\u0006\u0010t\u001a\u00020\u0015J\'\u0010u\u001a\u00020f2\u0006\u0010v\u001a\u00020c2\u0006\u0010Q\u001a\u00020\u00192\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010wR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010 \u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100!j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\"0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010#\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100!j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\"0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010$\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100!j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\"0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\'\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100!j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\"0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010(\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100!j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\"0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010)\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100!j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\"0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010*\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u00100\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001d\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001d\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100\b8F\u00a2\u0006\u0006\u001a\u0004\b;\u00105R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\b8F\u00a2\u0006\u0006\u001a\u0004\b=\u00105R\u001a\u0010>\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00150C\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010DR\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00150\b8F\u00a2\u0006\u0006\u001a\u0004\bE\u00105R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00190\b\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00105R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u001d\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00105R\u001d\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00105R\u001e\u0010Q\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010V\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001e\u0010W\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010V\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\u001d\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00105R\u001e\u0010\\\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010V\u001a\u0004\b]\u0010S\"\u0004\b^\u0010UR\u001e\u0010_\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010V\u001a\u0004\b`\u0010S\"\u0004\ba\u0010UR\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020c0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010-\u00a8\u0006y"}, d2 = {"Lbrite/outdoor/viewmodel/CommentQuestionViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_deleteAnswerQuestionResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseDeleteAnswerQuestion$DeleteAnswerQuestionResult;", "_deleteReplyAnswerQuestionResult", "_detailQuestionResult", "Lbrite/outdoor/data/api_entities/response/ResponseDetailQuestion$DetailQuestionResult;", "_edtHint", "Landroidx/lifecycle/MutableLiveData;", "", "_idQuestion", "_imagePickerComment", "Lbrite/outdoor/data/entities/ImagePicker;", "_isSelectedImage", "", "_isSelectedTextView", "_isShowSeeMoreComment", "_lengthContent", "", "_listAnswerQuestionResult", "Lbrite/outdoor/data/api_entities/response/ResponseAnswerQuestion$AnswerQuestionResult;", "_listReplyAnswerQuestionResult", "Lbrite/outdoor/data/api_entities/response/ResponseListReplyAnswerQuestion$ListReplyAnswerQuestionResult;", "_postAnswerQuestionResult", "Lbrite/outdoor/data/api_entities/response/ResponsePostAnswerQuestion$PostAnswerQuestionResult;", "_requestDeleteAnswerQuestion", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "_requestDeleteReplyAnswerQuestion", "_requestDetailQuestion", "_requestImg", "Lokhttp3/MultipartBody$Part;", "_requestListAnswerQuestion", "_requestListReplyAnswerQuestion", "_requestPostAnswerQuestion", "contentPost", "kotlin.jvm.PlatformType", "getContentPost", "()Landroidx/lifecycle/MutableLiveData;", "countCallApiReplyQuestion", "getCountCallApiReplyQuestion", "()I", "setCountCallApiReplyQuestion", "(I)V", "deleteAnswerQuestionResult", "getDeleteAnswerQuestionResult", "()Landroidx/lifecycle/LiveData;", "deleteReplyAnswerQuestionResult", "getDeleteReplyAnswerQuestionResult", "detailQuestionResult", "getDetailQuestionResult", "edtHint", "getEdtHint", "imagePickerComment", "getImagePickerComment", "isPermissionReadWriteExternalStorage", "()Z", "setPermissionReadWriteExternalStorage", "(Z)V", "isSelectedSend", "Landroidx/lifecycle/MediatorLiveData;", "()Landroidx/lifecycle/MediatorLiveData;", "isShowSeeMoreComment", "lengthContent", "getLengthContent", "listAnswerQuestion", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseAnswerQuestion$AnswerQuestion;", "getListAnswerQuestion", "()Ljava/util/ArrayList;", "listAnswerQuestionResult", "getListAnswerQuestionResult", "listReplyAnswerQuestionResult", "getListReplyAnswerQuestionResult", "positionAnswerQuestion", "getPositionAnswerQuestion", "()Ljava/lang/Integer;", "setPositionAnswerQuestion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "positionReplyAnswerQuestion", "getPositionReplyAnswerQuestion", "setPositionReplyAnswerQuestion", "postAnswerQuestionResult", "getPostAnswerQuestionResult", "replyIdAnswerQuestion", "getReplyIdAnswerQuestion", "setReplyIdAnswerQuestion", "threadIdReplyAnswerQuestion", "getThreadIdReplyAnswerQuestion", "setThreadIdReplyAnswerQuestion", "typeReply", "Lbrite/outdoor/viewmodel/CommentQuestionViewModel$TYPE;", "getTypeReply", "requestDeleteAnswerQuestion", "", "id", "requestDeleteReplyAnswerQuestion", "requestDetailQuestion", "requestListAnswerQuestion", "requestListReplyAnswerQuestion", "requestPostAnswerQuestion", "requestImg", "setEdtHint", "content", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setImageImagePickerComment", "imagePicker", "setShowSeerMore", "isShow", "setTypeReply", "type", "(Lbrite/outdoor/viewmodel/CommentQuestionViewModel$TYPE;ILjava/lang/Integer;)V", "TYPE", "app_debug"})
public final class CommentQuestionViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isShowSeeMoreComment = null;
    private int countCallApiReplyQuestion = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.CommentQuestionViewModel.TYPE> typeReply = null;
    private boolean isPermissionReadWriteExternalStorage = false;
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.ImagePicker> _imagePickerComment = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _edtHint = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer threadIdReplyAnswerQuestion;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer replyIdAnswerQuestion;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> contentPost = null;
    private final androidx.lifecycle.LiveData<java.lang.Integer> _lengthContent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> lengthContent = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> _isSelectedTextView = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> _isSelectedImage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isSelectedSend = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer positionAnswerQuestion;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer positionReplyAnswerQuestion;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestion> listAnswerQuestion = null;
    private java.lang.String _idQuestion = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListAnswerQuestion = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestionResult>> _listAnswerQuestionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestionResult>> listAnswerQuestionResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDetailQuestion = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailQuestion.DetailQuestionResult>> _detailQuestionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailQuestion.DetailQuestionResult>> detailQuestionResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestPostAnswerQuestion = null;
    private final androidx.lifecycle.MutableLiveData<okhttp3.MultipartBody.Part> _requestImg = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponsePostAnswerQuestion.PostAnswerQuestionResult>> _postAnswerQuestionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponsePostAnswerQuestion.PostAnswerQuestionResult>> postAnswerQuestionResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeleteAnswerQuestion = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResult>> _deleteAnswerQuestionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResult>> deleteAnswerQuestionResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeleteReplyAnswerQuestion = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResult>> _deleteReplyAnswerQuestionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResult>> deleteReplyAnswerQuestionResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListReplyAnswerQuestion = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListReplyAnswerQuestion.ListReplyAnswerQuestionResult>> _listReplyAnswerQuestionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListReplyAnswerQuestion.ListReplyAnswerQuestionResult>> listReplyAnswerQuestionResult = null;
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isShowSeeMoreComment() {
        return null;
    }
    
    public final void setShowSeerMore(boolean isShow) {
    }
    
    public final int getCountCallApiReplyQuestion() {
        return 0;
    }
    
    public final void setCountCallApiReplyQuestion(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.CommentQuestionViewModel.TYPE> getTypeReply() {
        return null;
    }
    
    public final void setTypeReply(@org.jetbrains.annotations.NotNull()
    brite.outdoor.viewmodel.CommentQuestionViewModel.TYPE type, int positionAnswerQuestion, @org.jetbrains.annotations.Nullable()
    java.lang.Integer positionReplyAnswerQuestion) {
    }
    
    public final boolean isPermissionReadWriteExternalStorage() {
        return false;
    }
    
    public final void setPermissionReadWriteExternalStorage(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.entities.ImagePicker> getImagePickerComment() {
        return null;
    }
    
    public final void setImageImagePickerComment(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.entities.ImagePicker imagePicker) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getEdtHint() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getThreadIdReplyAnswerQuestion() {
        return null;
    }
    
    public final void setThreadIdReplyAnswerQuestion(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReplyIdAnswerQuestion() {
        return null;
    }
    
    public final void setReplyIdAnswerQuestion(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final void setEdtHint(@org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.lang.Integer threadIdReplyAnswerQuestion, @org.jetbrains.annotations.Nullable()
    java.lang.Integer replyIdAnswerQuestion) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getContentPost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getLengthContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isSelectedSend() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPositionAnswerQuestion() {
        return null;
    }
    
    public final void setPositionAnswerQuestion(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPositionReplyAnswerQuestion() {
        return null;
    }
    
    public final void setPositionReplyAnswerQuestion(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestion> getListAnswerQuestion() {
        return null;
    }
    
    public final void requestListAnswerQuestion(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListAnswerQuestion, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseAnswerQuestion.AnswerQuestionResult>> getListAnswerQuestionResult() {
        return null;
    }
    
    public final void requestDetailQuestion(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDetailQuestion, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDetailQuestion.DetailQuestionResult>> getDetailQuestionResult() {
        return null;
    }
    
    public final void requestPostAnswerQuestion(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestPostAnswerQuestion, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part requestImg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponsePostAnswerQuestion.PostAnswerQuestionResult>> getPostAnswerQuestionResult() {
        return null;
    }
    
    public final void requestDeleteAnswerQuestion(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDeleteAnswerQuestion, @org.jetbrains.annotations.NotNull()
    java.lang.String id, int positionAnswerQuestion) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResult>> getDeleteAnswerQuestionResult() {
        return null;
    }
    
    public final void requestDeleteReplyAnswerQuestion(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDeleteReplyAnswerQuestion, @org.jetbrains.annotations.NotNull()
    java.lang.String id, int positionAnswerQuestion, int positionReplyAnswerQuestion) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteAnswerQuestion.DeleteAnswerQuestionResult>> getDeleteReplyAnswerQuestionResult() {
        return null;
    }
    
    public final void requestListReplyAnswerQuestion(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDeleteAnswerQuestion, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListReplyAnswerQuestion.ListReplyAnswerQuestionResult>> getListReplyAnswerQuestionResult() {
        return null;
    }
    
    @javax.inject.Inject()
    public CommentQuestionViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/viewmodel/CommentQuestionViewModel$TYPE;", "", "(Ljava/lang/String;I)V", "REPLY_ANSWER_QUESTION", "REPLY_ANSWER_QUESTION_LEVEL2", "app_debug"})
    public static enum TYPE {
        /*public static final*/ REPLY_ANSWER_QUESTION /* = new REPLY_ANSWER_QUESTION() */,
        /*public static final*/ REPLY_ANSWER_QUESTION_LEVEL2 /* = new REPLY_ANSWER_QUESTION_LEVEL2() */;
        
        TYPE() {
        }
    }
}