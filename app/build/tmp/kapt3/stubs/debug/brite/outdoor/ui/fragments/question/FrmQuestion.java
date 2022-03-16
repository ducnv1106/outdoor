package brite.outdoor.ui.fragments.question;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001OB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020)H\u0002J\b\u00100\u001a\u00020-H\u0002J\b\u00101\u001a\u00020-H\u0014J\b\u00102\u001a\u00020\u0015H\u0014J\b\u00103\u001a\u00020-H\u0002J\u0012\u00104\u001a\u00020-2\b\u00105\u001a\u0004\u0018\u000106H\u0014J\b\u00107\u001a\u00020-H\u0002J\b\u00108\u001a\u000209H\u0016J\u0012\u0010:\u001a\u00020-2\b\u0010;\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010<\u001a\u00020-H\u0002J\b\u0010=\u001a\u00020-H\u0002J\u0012\u0010>\u001a\u00020-2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010?\u001a\u00020-H\u0016J\u0010\u0010@\u001a\u00020-2\u0006\u0010A\u001a\u00020BH\u0007J\b\u0010C\u001a\u00020-H\u0002J\b\u0010D\u001a\u00020-H\u0016J\b\u0010E\u001a\u00020-H\u0016J\u001a\u0010F\u001a\u00020\u00022\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JH\u0014J\b\u0010K\u001a\u00020-H\u0002J\u0010\u0010L\u001a\u00020-2\u0006\u0010M\u001a\u00020)H\u0002J\b\u0010N\u001a\u00020\u0015H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!R!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\t\u001a\u0004\b%\u0010&R!\u0010(\u001a\b\u0012\u0004\u0012\u00020)0$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\t\u001a\u0004\b*\u0010&\u00a8\u0006P"}, d2 = {"Lbrite/outdoor/ui/fragments/question/FrmQuestion;", "Lbrite/outdoor/ui/fragments/BaseFragment;", "Lbrite/outdoor/databinding/FrmQuestionBinding;", "()V", "authViewModel", "Lbrite/outdoor/viewmodel/AuthViewModel;", "getAuthViewModel", "()Lbrite/outdoor/viewmodel/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "frmFrmQuestion", "Lbrite/outdoor/ui/fragments/question/FrmFrequentQuestion;", "getFrmFrmQuestion", "()Lbrite/outdoor/ui/fragments/question/FrmFrequentQuestion;", "frmFrmQuestion$delegate", "frmSaveQuestion", "Lbrite/outdoor/ui/fragments/question/FrmSaveQuestion;", "getFrmSaveQuestion", "()Lbrite/outdoor/ui/fragments/question/FrmSaveQuestion;", "frmSaveQuestion$delegate", "indicatorWidth", "", "Ljava/lang/Integer;", "mAdapter", "Lbrite/outdoor/adapter/HomePagerAdapter;", "myPostViewModel", "Lbrite/outdoor/viewmodel/MyPostViewModel;", "getMyPostViewModel", "()Lbrite/outdoor/viewmodel/MyPostViewModel;", "myPostViewModel$delegate", "questionViewModel", "Lbrite/outdoor/viewmodel/QuestionViewModel;", "getQuestionViewModel", "()Lbrite/outdoor/viewmodel/QuestionViewModel;", "questionViewModel$delegate", "tabIcon", "Ljava/util/ArrayList;", "getTabIcon", "()Ljava/util/ArrayList;", "tabIcon$delegate", "tabTitle", "", "getTabTitle", "tabTitle$delegate", "backToPrevious", "", "callApiCreateQuestion", "content", "clearEditText", "finish", "getCurrentFragment", "handlerPostQuestion", "initView", "savedInstanceState", "Landroid/os/Bundle;", "initViewPager", "isBackPreviousEnable", "", "loadControlsAndResize", "binding", "observerChangeLanguage", "observerCreateQuestion", "onCreate", "onDestroyView", "onEvent", "event", "", "onListenerTabLayout", "onStart", "onStop", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setupTabIcons", "showDialogSuccess", "tvMessage", "statusBarColor", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FrmQuestion extends brite.outdoor.ui.fragments.BaseFragment<brite.outdoor.databinding.FrmQuestionBinding> {
    private final kotlin.Lazy questionViewModel$delegate = null;
    private final kotlin.Lazy myPostViewModel$delegate = null;
    private final kotlin.Lazy authViewModel$delegate = null;
    private final kotlin.Lazy frmFrmQuestion$delegate = null;
    private final kotlin.Lazy frmSaveQuestion$delegate = null;
    private java.lang.Integer indicatorWidth;
    private brite.outdoor.adapter.HomePagerAdapter mAdapter;
    private final kotlin.Lazy tabIcon$delegate = null;
    private final kotlin.Lazy tabTitle$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.ui.fragments.question.FrmQuestion.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final brite.outdoor.viewmodel.QuestionViewModel getQuestionViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.MyPostViewModel getMyPostViewModel() {
        return null;
    }
    
    private final brite.outdoor.viewmodel.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    private final brite.outdoor.ui.fragments.question.FrmFrequentQuestion getFrmFrmQuestion() {
        return null;
    }
    
    private final brite.outdoor.ui.fragments.question.FrmSaveQuestion getFrmSaveQuestion() {
        return null;
    }
    
    private final java.util.ArrayList<java.lang.Integer> getTabIcon() {
        return null;
    }
    
    private final java.util.ArrayList<java.lang.String> getTabTitle() {
        return null;
    }
    
    @java.lang.Override()
    protected void loadControlsAndResize(@org.jetbrains.annotations.Nullable()
    brite.outdoor.databinding.FrmQuestionBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected brite.outdoor.databinding.FrmQuestionBinding setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected int getCurrentFragment() {
        return 0;
    }
    
    @java.lang.Override()
    protected void finish() {
    }
    
    @java.lang.Override()
    public void backToPrevious() {
    }
    
    @java.lang.Override()
    public boolean isBackPreviousEnable() {
        return false;
    }
    
    private final void initViewPager() {
    }
    
    private final void setupTabIcons() {
    }
    
    private final void handlerPostQuestion() {
    }
    
    private final void clearEditText() {
    }
    
    private final void callApiCreateQuestion(java.lang.String content) {
    }
    
    private final void observerCreateQuestion() {
    }
    
    private final void observerChangeLanguage() {
    }
    
    private final void onListenerTabLayout() {
    }
    
    private final void showDialogSuccess(java.lang.String tvMessage) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public int statusBarColor() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceType"})
    @org.greenrobot.eventbus.Subscribe()
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Object event) {
    }
    
    public FrmQuestion() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u00a8\u0006\b"}, d2 = {"Lbrite/outdoor/ui/fragments/question/FrmQuestion$Companion;", "", "()V", "getInstance", "Lbrite/outdoor/ui/fragments/question/FrmQuestion;", "mapData", "Ljava/util/HashMap;", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final brite.outdoor.ui.fragments.question.FrmQuestion getInstance(@org.jetbrains.annotations.Nullable()
        java.util.HashMap<java.lang.String, java.lang.Object> mapData) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}