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
public final class MyBookmarkViewModel_Factory implements Factory<MyBookmarkViewModel> {
  private final Provider<ApiController> apiControllerProvider;

  private final Provider<Gson> gsonProvider;

  public MyBookmarkViewModel_Factory(Provider<ApiController> apiControllerProvider,
      Provider<Gson> gsonProvider) {
    this.apiControllerProvider = apiControllerProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public MyBookmarkViewModel get() {
    return newInstance(apiControllerProvider.get(), gsonProvider.get());
  }

  public static MyBookmarkViewModel_Factory create(Provider<ApiController> apiControllerProvider,
      Provider<Gson> gsonProvider) {
    return new MyBookmarkViewModel_Factory(apiControllerProvider, gsonProvider);
  }

  public static MyBookmarkViewModel newInstance(ApiController apiController, Gson gson) {
    return new MyBookmarkViewModel(apiController, gson);
  }
}
