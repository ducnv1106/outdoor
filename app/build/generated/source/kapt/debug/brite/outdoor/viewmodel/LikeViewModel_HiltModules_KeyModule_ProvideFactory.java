// Generated by Dagger (https://dagger.dev).
package brite.outdoor.viewmodel;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LikeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static LikeViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(LikeViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final LikeViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LikeViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
