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
public final class CommentQuestionViewModel_Factory implements Factory<CommentQuestionViewModel> {
  private final Provider<Gson> gsonProvider;

  private final Provider<ApiController> apiControllerProvider;

  public CommentQuestionViewModel_Factory(Provider<Gson> gsonProvider,
      Provider<ApiController> apiControllerProvider) {
    this.gsonProvider = gsonProvider;
    this.apiControllerProvider = apiControllerProvider;
  }

  @Override
  public CommentQuestionViewModel get() {
    return newInstance(gsonProvider.get(), apiControllerProvider.get());
  }

  public static CommentQuestionViewModel_Factory create(Provider<Gson> gsonProvider,
      Provider<ApiController> apiControllerProvider) {
    return new CommentQuestionViewModel_Factory(gsonProvider, apiControllerProvider);
  }

  public static CommentQuestionViewModel newInstance(Gson gson, ApiController apiController) {
    return new CommentQuestionViewModel(gson, apiController);
  }
}
