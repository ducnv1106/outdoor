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
public final class CommentHotNewsViewModel_Factory implements Factory<CommentHotNewsViewModel> {
  private final Provider<Gson> gsonProvider;

  private final Provider<ApiController> apiControllerProvider;

  public CommentHotNewsViewModel_Factory(Provider<Gson> gsonProvider,
      Provider<ApiController> apiControllerProvider) {
    this.gsonProvider = gsonProvider;
    this.apiControllerProvider = apiControllerProvider;
  }

  @Override
  public CommentHotNewsViewModel get() {
    return newInstance(gsonProvider.get(), apiControllerProvider.get());
  }

  public static CommentHotNewsViewModel_Factory create(Provider<Gson> gsonProvider,
      Provider<ApiController> apiControllerProvider) {
    return new CommentHotNewsViewModel_Factory(gsonProvider, apiControllerProvider);
  }

  public static CommentHotNewsViewModel newInstance(Gson gson, ApiController apiController) {
    return new CommentHotNewsViewModel(gson, apiController);
  }
}
