package brite.outdoor.app;

import brite.outdoor.di.AppModule;
import brite.outdoor.ui.activities.CameraActivity_GeneratedInjector;
import brite.outdoor.ui.activities.MainActivity_GeneratedInjector;
import brite.outdoor.ui.activities.MediaActivity_GeneratedInjector;
import brite.outdoor.ui.dialog.DialogCommentHotNews_GeneratedInjector;
import brite.outdoor.ui.dialog.DialogComment_GeneratedInjector;
import brite.outdoor.ui.dialog.DialogFragmentAddImageAvatarNew_GeneratedInjector;
import brite.outdoor.ui.dialog.DialogFragmentAddImagesNew_GeneratedInjector;
import brite.outdoor.ui.dialog.DialogFragmentReminder_GeneratedInjector;
import brite.outdoor.ui.dialog.DialogFragmentReport_GeneratedInjector;
import brite.outdoor.ui.dialog.FrmEditBlockPost_GeneratedInjector;
import brite.outdoor.ui.fragments.BottomSheetDialogFrHome_GeneratedInjector;
import brite.outdoor.ui.fragments.FrmDetailHotNews_GeneratedInjector;
import brite.outdoor.ui.fragments.FrmDetail_GeneratedInjector;
import brite.outdoor.ui.fragments.FrmHome_GeneratedInjector;
import brite.outdoor.ui.fragments.FrmListPeopleInteractive_GeneratedInjector;
import brite.outdoor.ui.fragments.FrmListPostLocation_GeneratedInjector;
import brite.outdoor.ui.fragments.FrmLogin_GeneratedInjector;
import brite.outdoor.ui.fragments.FrmNotification_GeneratedInjector;
import brite.outdoor.ui.fragments.FrmPersonalPage_GeneratedInjector;
import brite.outdoor.ui.fragments.FrmPushPostsNew_GeneratedInjector;
import brite.outdoor.ui.fragments.FrmSelectedUtensilsNew_GeneratedInjector;
import brite.outdoor.ui.fragments.FrmSetting_GeneratedInjector;
import brite.outdoor.ui.fragments.home.FrmFocus_GeneratedInjector;
import brite.outdoor.ui.fragments.home.FrmFollow_GeneratedInjector;
import brite.outdoor.ui.fragments.home.FrmHotNews_GeneratedInjector;
import brite.outdoor.ui.fragments.home.FrmNew_GeneratedInjector;
import brite.outdoor.ui.fragments.media.PreviewFragment_GeneratedInjector;
import brite.outdoor.ui.fragments.my_page.FrmLocationSave_GeneratedInjector;
import brite.outdoor.ui.fragments.my_page.FrmMyBookMart_GeneratedInjector;
import brite.outdoor.ui.fragments.my_page.FrmMyPage_GeneratedInjector;
import brite.outdoor.ui.fragments.my_page.FrmMyPost_GeneratedInjector;
import brite.outdoor.ui.fragments.question.FrmCommentQuestion_GeneratedInjector;
import brite.outdoor.ui.fragments.question.FrmEditQuestion_GeneratedInjector;
import brite.outdoor.ui.fragments.question.FrmFrequentQuestion_GeneratedInjector;
import brite.outdoor.ui.fragments.question.FrmQuestion_GeneratedInjector;
import brite.outdoor.ui.fragments.question.FrmSaveQuestion_GeneratedInjector;
import brite.outdoor.ui.fragments.search.FrmSearchLocation_GeneratedInjector;
import brite.outdoor.ui.fragments.search.FrmSearchUser_GeneratedInjector;
import brite.outdoor.ui.fragments.search.FrmSearchUtensils_GeneratedInjector;
import brite.outdoor.ui.fragments.search.FrmSearchVer2_GeneratedInjector;
import brite.outdoor.ui.fragments.select_place.FrmMapNew_GeneratedInjector;
import brite.outdoor.ui.fragments.select_place.FrmMap_GeneratedInjector;
import brite.outdoor.viewmodel.AuthViewModel_HiltModules;
import brite.outdoor.viewmodel.BottomSheetDialogFrmHomeViewModel_HiltModules;
import brite.outdoor.viewmodel.CameraViewModel_HiltModules;
import brite.outdoor.viewmodel.CommentHotNewsViewModel_HiltModules;
import brite.outdoor.viewmodel.CommentQuestionViewModel_HiltModules;
import brite.outdoor.viewmodel.CommentViewModel_HiltModules;
import brite.outdoor.viewmodel.DetailHotNewsViewModel_HiltModules;
import brite.outdoor.viewmodel.DetailViewModel_HiltModules;
import brite.outdoor.viewmodel.EditQuestionViewModel_HiltModules;
import brite.outdoor.viewmodel.FocusViewModel_HiltModules;
import brite.outdoor.viewmodel.FollowViewModel_HiltModules;
import brite.outdoor.viewmodel.FrequentQuestionViewModel_HiltModules;
import brite.outdoor.viewmodel.HomeViewModel_HiltModules;
import brite.outdoor.viewmodel.HotNewsViewModel_HiltModules;
import brite.outdoor.viewmodel.LikeViewModel_HiltModules;
import brite.outdoor.viewmodel.ListPeopleInteractiveViewModel_HiltModules;
import brite.outdoor.viewmodel.ListPostLocationViewModel_HiltModules;
import brite.outdoor.viewmodel.LocationSaveViewModel_HiltModules;
import brite.outdoor.viewmodel.MediaViewModel_HiltModules;
import brite.outdoor.viewmodel.MyBookmarkViewModel_HiltModules;
import brite.outdoor.viewmodel.MyPageViewModel_HiltModules;
import brite.outdoor.viewmodel.NewViewModel_HiltModules;
import brite.outdoor.viewmodel.NotificationViewModel_HiltModules;
import brite.outdoor.viewmodel.PushPostViewModel_HiltModules;
import brite.outdoor.viewmodel.QuestionViewModel_HiltModules;
import brite.outdoor.viewmodel.ReminderViewModel_HiltModules;
import brite.outdoor.viewmodel.ReportViewModel_HiltModules;
import brite.outdoor.viewmodel.SavedQuestionViewModel_HiltModules;
import brite.outdoor.viewmodel.SearchViewModel_HiltModules;
import brite.outdoor.viewmodel.SelectPlaceViewModel_HiltModules;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.inject.Singleton;

public final class MyApplication_HiltComponents {
  private MyApplication_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          AppModule.class,
          ApplicationContextModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements MyApplication_GeneratedInjector,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AuthViewModel_HiltModules.KeyModule.class,
          BottomSheetDialogFrmHomeViewModel_HiltModules.KeyModule.class,
          CameraViewModel_HiltModules.KeyModule.class,
          CommentHotNewsViewModel_HiltModules.KeyModule.class,
          CommentQuestionViewModel_HiltModules.KeyModule.class,
          CommentViewModel_HiltModules.KeyModule.class,
          DetailHotNewsViewModel_HiltModules.KeyModule.class,
          DetailViewModel_HiltModules.KeyModule.class,
          EditQuestionViewModel_HiltModules.KeyModule.class,
          FocusViewModel_HiltModules.KeyModule.class,
          FollowViewModel_HiltModules.KeyModule.class,
          FrequentQuestionViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          HomeViewModel_HiltModules.KeyModule.class,
          HotNewsViewModel_HiltModules.KeyModule.class,
          LikeViewModel_HiltModules.KeyModule.class,
          ListPeopleInteractiveViewModel_HiltModules.KeyModule.class,
          ListPostLocationViewModel_HiltModules.KeyModule.class,
          LocationSaveViewModel_HiltModules.KeyModule.class,
          MediaViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          MyBookmarkViewModel_HiltModules.KeyModule.class,
          MyPageViewModel_HiltModules.KeyModule.class,
          NewViewModel_HiltModules.KeyModule.class,
          NotificationViewModel_HiltModules.KeyModule.class,
          PushPostViewModel_HiltModules.KeyModule.class,
          QuestionViewModel_HiltModules.KeyModule.class,
          ReminderViewModel_HiltModules.KeyModule.class,
          ReportViewModel_HiltModules.KeyModule.class,
          SavedQuestionViewModel_HiltModules.KeyModule.class,
          SearchViewModel_HiltModules.KeyModule.class,
          SelectPlaceViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements CameraActivity_GeneratedInjector,
      MainActivity_GeneratedInjector,
      MediaActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AuthViewModel_HiltModules.BindsModule.class,
          BottomSheetDialogFrmHomeViewModel_HiltModules.BindsModule.class,
          CameraViewModel_HiltModules.BindsModule.class,
          CommentHotNewsViewModel_HiltModules.BindsModule.class,
          CommentQuestionViewModel_HiltModules.BindsModule.class,
          CommentViewModel_HiltModules.BindsModule.class,
          DetailHotNewsViewModel_HiltModules.BindsModule.class,
          DetailViewModel_HiltModules.BindsModule.class,
          EditQuestionViewModel_HiltModules.BindsModule.class,
          FocusViewModel_HiltModules.BindsModule.class,
          FollowViewModel_HiltModules.BindsModule.class,
          FrequentQuestionViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          HomeViewModel_HiltModules.BindsModule.class,
          HotNewsViewModel_HiltModules.BindsModule.class,
          LikeViewModel_HiltModules.BindsModule.class,
          ListPeopleInteractiveViewModel_HiltModules.BindsModule.class,
          ListPostLocationViewModel_HiltModules.BindsModule.class,
          LocationSaveViewModel_HiltModules.BindsModule.class,
          MediaViewModel_HiltModules.BindsModule.class,
          MyBookmarkViewModel_HiltModules.BindsModule.class,
          MyPageViewModel_HiltModules.BindsModule.class,
          NewViewModel_HiltModules.BindsModule.class,
          NotificationViewModel_HiltModules.BindsModule.class,
          PushPostViewModel_HiltModules.BindsModule.class,
          QuestionViewModel_HiltModules.BindsModule.class,
          ReminderViewModel_HiltModules.BindsModule.class,
          ReportViewModel_HiltModules.BindsModule.class,
          SavedQuestionViewModel_HiltModules.BindsModule.class,
          SearchViewModel_HiltModules.BindsModule.class,
          SelectPlaceViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements DialogCommentHotNews_GeneratedInjector,
      DialogComment_GeneratedInjector,
      DialogFragmentAddImageAvatarNew_GeneratedInjector,
      DialogFragmentAddImagesNew_GeneratedInjector,
      DialogFragmentReminder_GeneratedInjector,
      DialogFragmentReport_GeneratedInjector,
      FrmEditBlockPost_GeneratedInjector,
      BottomSheetDialogFrHome_GeneratedInjector,
      FrmDetailHotNews_GeneratedInjector,
      FrmDetail_GeneratedInjector,
      FrmHome_GeneratedInjector,
      FrmListPeopleInteractive_GeneratedInjector,
      FrmListPostLocation_GeneratedInjector,
      FrmLogin_GeneratedInjector,
      FrmNotification_GeneratedInjector,
      FrmPersonalPage_GeneratedInjector,
      FrmPushPostsNew_GeneratedInjector,
      FrmSelectedUtensilsNew_GeneratedInjector,
      FrmSetting_GeneratedInjector,
      FrmFocus_GeneratedInjector,
      FrmFollow_GeneratedInjector,
      FrmHotNews_GeneratedInjector,
      FrmNew_GeneratedInjector,
      PreviewFragment_GeneratedInjector,
      FrmLocationSave_GeneratedInjector,
      FrmMyBookMart_GeneratedInjector,
      FrmMyPage_GeneratedInjector,
      FrmMyPost_GeneratedInjector,
      FrmCommentQuestion_GeneratedInjector,
      FrmEditQuestion_GeneratedInjector,
      FrmFrequentQuestion_GeneratedInjector,
      FrmQuestion_GeneratedInjector,
      FrmSaveQuestion_GeneratedInjector,
      FrmSearchLocation_GeneratedInjector,
      FrmSearchUser_GeneratedInjector,
      FrmSearchUtensils_GeneratedInjector,
      FrmSearchVer2_GeneratedInjector,
      FrmMapNew_GeneratedInjector,
      FrmMap_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
