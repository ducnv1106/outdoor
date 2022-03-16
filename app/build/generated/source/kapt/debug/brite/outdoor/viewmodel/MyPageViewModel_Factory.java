// Generated by Dagger (https://dagger.dev).
package brite.outdoor.viewmodel;

import brite.outdoor.data.remote.ApiController;
import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyPageViewModel_Factory implements Factory<MyPageViewModel> {
  private final Provider<Gson> gsonProvider;

  private final Provider<ApiController> apiControllerProvider;

  public MyPageViewModel_Factory(Provider<Gson> gsonProvider,
      Provider<ApiController> apiControllerProvider) {
    this.gsonProvider = gsonProvider;
    this.apiControllerProvider = apiControllerProvider;
  }

  @Override
  public MyPageViewModel get() {
    return newInstance(gsonProvider.get(), apiControllerProvider.get());
  }

  public static MyPageViewModel_Factory create(Provider<Gson> gsonProvider,
      Provider<ApiController> apiControllerProvider) {
    return new MyPageViewModel_Factory(gsonProvider, apiControllerProvider);
  }

  public static MyPageViewModel newInstance(Gson gson, ApiController apiController) {
    return new MyPageViewModel(gson, apiController);
  }
}
