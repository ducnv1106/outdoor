// Generated by Dagger (https://dagger.dev).
package brite.outdoor.viewmodel;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  @Override
  public HomeViewModel get() {
    return newInstance();
  }

  public static HomeViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HomeViewModel newInstance() {
    return new HomeViewModel();
  }

  private static final class InstanceHolder {
    private static final HomeViewModel_Factory INSTANCE = new HomeViewModel_Factory();
  }
}
