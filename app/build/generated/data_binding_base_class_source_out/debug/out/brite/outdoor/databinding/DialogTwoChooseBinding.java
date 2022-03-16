// Generated by data binding compiler. Do not edit!
package brite.outdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import brite.outdoor.R;
import brite.outdoor.ui.widgets.CustomImageButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogTwoChooseBinding extends ViewDataBinding {
  @NonNull
  public final CustomImageButton btnClose;

  @NonNull
  public final TextView btnLeft;

  @NonNull
  public final TextView btnRight;

  @NonNull
  public final RelativeLayout rlContent;

  @NonNull
  public final TextView tvMessage;

  @NonNull
  public final View vHolder;

  @NonNull
  public final View viewLine;

  protected DialogTwoChooseBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomImageButton btnClose, TextView btnLeft, TextView btnRight, RelativeLayout rlContent,
      TextView tvMessage, View vHolder, View viewLine) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnClose = btnClose;
    this.btnLeft = btnLeft;
    this.btnRight = btnRight;
    this.rlContent = rlContent;
    this.tvMessage = tvMessage;
    this.vHolder = vHolder;
    this.viewLine = viewLine;
  }

  @NonNull
  public static DialogTwoChooseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_two_choose, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogTwoChooseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogTwoChooseBinding>inflateInternal(inflater, R.layout.dialog_two_choose, root, attachToRoot, component);
  }

  @NonNull
  public static DialogTwoChooseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_two_choose, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogTwoChooseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogTwoChooseBinding>inflateInternal(inflater, R.layout.dialog_two_choose, null, false, component);
  }

  public static DialogTwoChooseBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static DialogTwoChooseBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogTwoChooseBinding)bind(component, view, R.layout.dialog_two_choose);
  }
}
