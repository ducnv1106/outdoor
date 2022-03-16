package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u001c\u001a\u00020\u001d2\"\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\r\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00100\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00100\u00100\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019\u00a8\u0006\u001f"}, d2 = {"Lbrite/outdoor/viewmodel/FrequentQuestionViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;)V", "_lengthContent", "Landroidx/lifecycle/LiveData;", "", "_listQuestionResult", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseQuestion$QuestionResult;", "_requestListQuestion", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "content", "kotlin.jvm.PlatformType", "contentPost", "getContentPost", "()Landroidx/lifecycle/MutableLiveData;", "lengthContent", "getLengthContent", "()Landroidx/lifecycle/LiveData;", "listQuestionResult", "getListQuestionResult", "requestListQuest", "", "requestDeletePost", "app_debug"})
public final class FrequentQuestionViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> contentPost = null;
    private final androidx.lifecycle.LiveData<java.lang.Integer> _lengthContent = null;
    private final androidx.lifecycle.LiveData<java.lang.String> content = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> lengthContent = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListQuestion = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionResult>> _listQuestionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionResult>> listQuestionResult = null;
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getContentPost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getLengthContent() {
        return null;
    }
    
    public final void requestListQuest(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestDeletePost) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseQuestion.QuestionResult>> getListQuestionResult() {
        return null;
    }
    
    @javax.inject.Inject()
    public FrequentQuestionViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController) {
        super();
    }
}