package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0002uvB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J,\u0010d\u001a\u00020e2\u0006\u0010>\u001a\u00020\u00182\b\b\u0002\u0010S\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u00182\n\b\u0002\u0010Y\u001a\u0004\u0018\u000100J\u001e\u0010f\u001a\u00020e2\u0006\u0010\\\u001a\u00020\u00182\u0006\u0010a\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u0018J\u0006\u0010g\u001a\u00020eJ*\u0010h\u001a\u00020e2\"\u0010h\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fJ*\u0010i\u001a\u00020e2\"\u0010j\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fJ2\u0010k\u001a\u00020e2\"\u0010k\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010l\u001a\u00020\u000eJ*\u0010m\u001a\u00020e2\"\u0010m\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fJ\u000e\u0010n\u001a\u00020e2\u0006\u0010o\u001a\u00020!J\u0015\u00103\u001a\u00020e2\u0006\u0010p\u001a\u000200H\u0007\u00a2\u0006\u0002\bqJ\u000e\u0010r\u001a\u00020e2\u0006\u0010s\u001a\u00020\u001fJ\u0006\u0010t\u001a\u00020eR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u001b\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u001c\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u001d\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001f\u0010,\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u000e0\u000e0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u001f\u00107\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u001f0\u001f0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u001a\u00109\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010>\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010)\"\u0004\b@\u0010+R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00160\f\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010#R\u001f\u0010B\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u00160\u00160\f\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010#R\u001f\u0010C\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u00160\u00160\f\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010#R\u001f\u0010D\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u00160\u00160\f\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010#R\u001f\u0010E\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u00160\u00160\f\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010#R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00160G\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010HR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00180\b\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010&R\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010&R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u0002000N\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u0002000N\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010PR\u001a\u0010S\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010)\"\u0004\bU\u0010+R\u001a\u0010V\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010)\"\u0004\bX\u0010+R\u001c\u0010Y\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u00102\"\u0004\b[\u00104R\u001a\u0010\\\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010)\"\u0004\b^\u0010+R\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010&R\u001a\u0010a\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010)\"\u0004\bc\u0010+\u00a8\u0006w"}, d2 = {"Lbrite/outdoor/viewmodel/QuestionViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_bookMarkQuestionResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseBookMarkQuestion$BookMarkQuestionResult;", "_createQuestion", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "_createQuestionResult", "Lbrite/outdoor/data/api_entities/response/ResponseCreateQuestion$CreateQuestionResult;", "_deleteQuestionResult", "Lbrite/outdoor/data/api_entities/response/ResponseDeleteQuestion$DeleteQuestionResult;", "_idQuestion", "_isSelectedSend", "", "_lengthContent", "", "_likeQuestionResult", "Lbrite/outdoor/data/api_entities/response/ResponseLikeQuestion$LikeQuestionResult;", "_requestBookmarkQuestion", "_requestDeleteQuestion", "_requestLikeQuestion", "_resultTypeFragment", "Lbrite/outdoor/viewmodel/QuestionViewModel$CurrentFragment;", "actionState", "Lbrite/outdoor/viewmodel/QuestionViewModel$STATE;", "getActionState", "()Landroidx/lifecycle/MutableLiveData;", "bookMarkQuestionResult", "getBookMarkQuestionResult", "()Landroidx/lifecycle/LiveData;", "commentId", "getCommentId", "()I", "setCommentId", "(I)V", "contentPost", "kotlin.jvm.PlatformType", "getContentPost", "contentSelected", "Lbrite/outdoor/data/api_entities/response/ResponseQuestion$QuestionData;", "getContentSelected", "()Lbrite/outdoor/data/api_entities/response/ResponseQuestion$QuestionData;", "setContentSelected", "(Lbrite/outdoor/data/api_entities/response/ResponseQuestion$QuestionData;)V", "createQuestionResult", "getCreateQuestionResult", "currentFragment", "getCurrentFragment", "currentFragmentQuestion", "getCurrentFragmentQuestion", "setCurrentFragmentQuestion", "deleteQuestionResult", "getDeleteQuestionResult", "idQuestion", "getIdQuestion", "setIdQuestion", "isFromNotification", "isNeedRefreshDataFreQuestion", "isNeedRefreshDataSaveQuestion", "isSelectedFrequentQuestion", "isSelectedSavedQuestion", "isSelectedSend", "Landroidx/lifecycle/MediatorLiveData;", "()Landroidx/lifecycle/MediatorLiveData;", "lengthContent", "getLengthContent", "likeQuestionResult", "getLikeQuestionResult", "listQuestion", "Ljava/util/ArrayList;", "getListQuestion", "()Ljava/util/ArrayList;", "listQuestionSave", "getListQuestionSave", "positionQuestion", "getPositionQuestion", "setPositionQuestion", "positionSelected", "getPositionSelected", "setPositionSelected", "question", "getQuestion", "setQuestion", "questionId", "getQuestionId", "setQuestionId", "resultTypeFragment", "getResultTypeFragment", "threadId", "getThreadId", "setThreadId", "positionQuestionNeedNotifyChange", "", "prepareDataCommentQuestion", "removeItem", "requestBookmarkQuestion", "requestCreateQuestion", "createQuestion", "requestDeleteQuestion", "id", "requestLikeQuestion", "setActionSate", "state", "content", "setContentSelected1", "setCurrentFragment", "typeCurrentFragment", "setNeedRefreshDataQuestion", "CurrentFragment", "STATE", "app_debug"})
public final class QuestionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> contentPost = null;
    private final androidx.lifecycle.LiveData<java.lang.Integer> _lengthContent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> lengthContent = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> _isSelectedSend = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isSelectedSend = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFromNotification = null;
    private int questionId = 0;
    private int threadId = 0;
    private int commentId = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSelectedFrequentQuestion = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSelectedSavedQuestion = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedRefreshDataFreQuestion = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedRefreshDataSaveQuestion = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.QuestionViewModel.CurrentFragment> currentFragment = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.viewmodel.QuestionViewModel.CurrentFragment> _resultTypeFragment = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.viewmodel.QuestionViewModel.CurrentFragment> resultTypeFragment = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData> listQuestion = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData> listQuestionSave = null;
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData contentSelected;
    private int positionSelected = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.QuestionViewModel.STATE> actionState = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _createQuestion = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCreateQuestion.CreateQuestionResult>> _createQuestionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCreateQuestion.CreateQuestionResult>> createQuestionResult = null;
    private int idQuestion = 0;
    private int positionQuestion = 0;
    private int currentFragmentQuestion = 0;
    @org.jetbrains.annotations.Nullable()
    private brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData question;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestLikeQuestion = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLikeQuestion.LikeQuestionResult>> _likeQuestionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLikeQuestion.LikeQuestionResult>> likeQuestionResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestBookmarkQuestion = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseBookMarkQuestion.BookMarkQuestionResult>> _bookMarkQuestionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseBookMarkQuestion.BookMarkQuestionResult>> bookMarkQuestionResult = null;
    private java.lang.String _idQuestion = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestDeleteQuestion = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteQuestion.DeleteQuestionResult>> _deleteQuestionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteQuestion.DeleteQuestionResult>> deleteQuestionResult = null;
    private final com.google.gson.Gson gson = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFromNotification() {
        return null;
    }
    
    public final int getQuestionId() {
        return 0;
    }
    
    public final void setQuestionId(int p0) {
    }
    
    public final int getThreadId() {
        return 0;
    }
    
    public final void setThreadId(int p0) {
    }
    
    public final int getCommentId() {
        return 0;
    }
    
    public final void setCommentId(int p0) {
    }
    
    public final void prepareDataCommentQuestion(int questionId, int threadId, int commentId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSelectedFrequentQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSelectedSavedQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedRefreshDataFreQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNeedRefreshDataSaveQuestion() {
        return null;
    }
    
    public final void setNeedRefreshDataQuestion() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.QuestionViewModel.CurrentFragment> getCurrentFragment() {
        return null;
    }
    
    public final void setCurrentFragment(@org.jetbrains.annotations.NotNull()
    brite.outdoor.viewmodel.QuestionViewModel.CurrentFragment typeCurrentFragment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.viewmodel.QuestionViewModel.CurrentFragment> getResultTypeFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData> getListQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData> getListQuestionSave() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData getContentSelected() {
        return null;
    }
    
    public final void setContentSelected(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData p0) {
    }
    
    public final int getPositionSelected() {
        return 0;
    }
    
    public final void setPositionSelected(int p0) {
    }
    
    public final void setContentSelected1(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData content) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.viewmodel.QuestionViewModel.STATE> getActionState() {
        return null;
    }
    
    public final void setActionSate(@org.jetbrains.annotations.NotNull()
    brite.outdoor.viewmodel.QuestionViewModel.STATE state) {
    }
    
    public final void removeItem() {
    }
    
    public final void requestCreateQuestion(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> createQuestion) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCreateQuestion.CreateQuestionResult>> getCreateQuestionResult() {
        return null;
    }
    
    public final int getIdQuestion() {
        return 0;
    }
    
    public final void setIdQuestion(int p0) {
    }
    
    public final int getPositionQuestion() {
        return 0;
    }
    
    public final void setPositionQuestion(int p0) {
    }
    
    public final int getCurrentFragmentQuestion() {
        return 0;
    }
    
    public final void setCurrentFragmentQuestion(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData getQuestion() {
        return null;
    }
    
    public final void setQuestion(@org.jetbrains.annotations.Nullable()
    brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData p0) {
    }
    
    public final void positionQuestionNeedNotifyChange(int idQuestion, int positionQuestion, int currentFragmentQuestion, @org.jetbrains.annotations.Nullable()
    brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionData question) {
    }
    
    public final void requestLikeQuestion(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestLikeQuestion) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLikeQuestion.LikeQuestionResult>> getLikeQuestionResult() {
        return null;
    }
    
    public final void requestBookmarkQuestion(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestBookmarkQuestion) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseBookMarkQuestion.BookMarkQuestionResult>> getBookMarkQuestionResult() {
        return null;
    }
    
    public final void requestDeleteQuestion(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDeleteQuestion, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseDeleteQuestion.DeleteQuestionResult>> getDeleteQuestionResult() {
        return null;
    }
    
    @javax.inject.Inject()
    public QuestionViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lbrite/outdoor/viewmodel/QuestionViewModel$CurrentFragment;", "", "(Ljava/lang/String;I)V", "FrequentQuestion", "SavedQuestion", "CONSUMED", "app_debug"})
    public static enum CurrentFragment {
        /*public static final*/ FrequentQuestion /* = new FrequentQuestion() */,
        /*public static final*/ SavedQuestion /* = new SavedQuestion() */,
        /*public static final*/ CONSUMED /* = new CONSUMED() */;
        
        CurrentFragment() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lbrite/outdoor/viewmodel/QuestionViewModel$STATE;", "", "(Ljava/lang/String;I)V", "NOTHING", "NOTIFY_DATA", "DELETE", "POST_QUESTION", "EXECUTE_POST_QUESTION", "app_debug"})
    public static enum STATE {
        /*public static final*/ NOTHING /* = new NOTHING() */,
        /*public static final*/ NOTIFY_DATA /* = new NOTIFY_DATA() */,
        /*public static final*/ DELETE /* = new DELETE() */,
        /*public static final*/ POST_QUESTION /* = new POST_QUESTION() */,
        /*public static final*/ EXECUTE_POST_QUESTION /* = new EXECUTE_POST_QUESTION() */;
        
        STATE() {
        }
    }
}