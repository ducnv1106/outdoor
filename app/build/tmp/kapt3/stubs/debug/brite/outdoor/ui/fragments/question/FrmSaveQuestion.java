package brite.outdoor.ui.fragments.question;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0002J\u0012\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0014J\b\u0010$\u001a\u00020\u0019H\u0014J\b\u0010%\u001a\u00020\u001bH\u0002J\u0012\u0010&\u001a\u00020\u001b2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0012\u0010)\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010+\u001a\u00020\u001bH\u0002J\b\u0010,\u001a\u00020\u001bH\u0002J\b\u0010-\u001a\u00020\u001bH\u0002J\b\u0010.\u001a\u00020\u001bH\u0002J\b\u0010/\u001a\u00020\u001bH\u0002J\b\u00100\u001a\u00020\u001bH\u0002J\u0006\u00101\u001a\u00020\u001bJ\u001a\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0014J\u0006\u00107\u001a\u00020\u001bJ\u0006\u00108\u001a\u00020\u001bJ\b\u00109\u001a\u00020\u001bH\u0002J\u0006\u0010:\u001a\u00020\u001bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lbrite/outdoor/ui/fragments/question/FrmSaveQuestion;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmSaveQuestionBinding;", "()V", "adapter", "Lbrite/outdoor/adapter/AdapterFreQuestion;", "lastestId", "", "mViewModel", "Lbrite/outdoor/viewmodel/SavedQuestionViewModel;", "getMViewModel", "()Lbrite/outdoor/viewmodel/SavedQuestionViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "myPostViewModel", "Lbrite/outdoor/viewmodel/MyPostViewModel;", "getMyPostViewModel", "()Lbrite/outdoor/viewmodel/MyPostViewModel;", "myPostViewModel$delegate", "questionViewModel", "Lbrite/outdoor/viewmodel/QuestionViewModel;", "getQuestionViewModel", "()Lbrite/outdoor/viewmodel/QuestionViewModel;", "questionViewModel$delegate", "totalLoadMoreResult", "", "callApiBookMark", "", "idQuestion", "callApiDeleteQuestion", "callApiLike", "callApiListQuestion", "deleteItemFrmCommentCallBack", "position", "eventLoadMore", "finish", "getCurrentFragment", "initAdapter", "initView", "savedInstanceState", "Landroid/os/Bundle;", "loadControlsAndResize", "binding", "observerBookMarkQuestion", "observerDeleteQuestion", "observerLikeQuestion", "observerListQuestion", "observerNeedRefreshData", "onRefreshListener", "refreshAndScrollToFirstItem", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "startShimmerLayout", "stopShimmerLayout", "updateTotalResultWhenRemoveItem", "updateUIAfterChangLanguage", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmSaveQuestion extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmSaveQuestionBinding> {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final kotlin.Lazy questionViewModel$delegate = null;
    private brite.outdoor.adapter.AdapterFreQuestion adapter;
    private int totalLoadMoreResult = 0;
    private java.lang.String lastestId = "";
    private final kotlin.Lazy myPostViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUESTION_YOU = "2";
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.question.FrmSaveQuestion.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.SavedQuestionViewModel getMViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.QuestionViewModel getQuestionViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.MyPostViewModel getMyPostViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmSaveQuestionBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmSaveQuestionBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    private final void initAdapter() {
    }
    
    private final void callApiListQuestion(java.lang.String lastestId) {
    }
    
    private final void observerListQuestion() {
    }
    
    private final void callApiLike(int idQuestion) {
    }
    
    private final void observerLikeQuestion() {
    }
    
    private final void callApiBookMark(int idQuestion) {
    }
    
    private final void observerBookMarkQuestion() {
    }
    
    private final void callApiDeleteQuestion(int idQuestion) {
    }
    
    private final void observerDeleteQuestion() {
    }
    
    private final void observerNeedRefreshData() {
    }
    
    private final void eventLoadMore() {
    }
    
    private final void updateTotalResultWhenRemoveItem() {
    }
    
    public final void updateUIAfterChangLanguage() {
    }
    
    private final void deleteItemFrmCommentCallBack(int position) {
    }
    
    private final void onRefreshListener() {
    }
    
    public final void refreshAndScrollToFirstItem() {
    }
    
    public final void startShimmerLayout() {
    }
    
    public final void stopShimmerLayout() {
    }
    
    public FrmSaveQuestion() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lbrite/outdoor/ui/fragments/question/FrmSaveQuestion$Companion;", "", "()V", "QUESTION_YOU", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}