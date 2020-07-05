// Generated by Dagger (https://dagger.dev).
package de.ynd.ui.desktop;

import android.app.Application;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DesktopViewModel_Factory implements Factory<DesktopViewModel> {
  private final Provider<Application> applicationProvider;

  public DesktopViewModel_Factory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public DesktopViewModel get() {
    return newInstance(applicationProvider.get());
  }

  public static DesktopViewModel_Factory create(Provider<Application> applicationProvider) {
    return new DesktopViewModel_Factory(applicationProvider);
  }

  public static DesktopViewModel newInstance(Application application) {
    return new DesktopViewModel(application);
  }
}