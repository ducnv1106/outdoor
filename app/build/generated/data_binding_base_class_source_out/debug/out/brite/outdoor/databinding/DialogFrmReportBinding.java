// Generated by data binding compiler. Do not edit!
package brite.outdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import brite.outdoor.R;
import brite.outdoor.ui.widgets.CustomImageButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogFrmReportBinding extends ViewDataBinding {
  @NonNull
  public final Guideline glEnd;

  @NonNull
  public final Guideline glStart;

  @NonNull
  public final CustomImageButton imgBack;

  @NonNull
  public final RecyclerView rcView;

  @NonNull
  public final TextView tvLearnMore;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final View viewLine;

  protected DialogFrmReportBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Guideline glEnd, Guideline glStart, CustomImageButton imgBack, RecyclerView rcView,
      TextView tvLearnMore, TextView tvTitle, View viewLine) {
    super(_bindingComponent, _root, _localFieldCount);
    this.glEnd = glEnd;
    this.glStart = glStart;
    this.imgBack = imgBack;
    this.rcView = rcView;
    this.tvLearnMore = tvLearnMore;
    this.tvTitle = tvTitle;
    this.viewLine = viewLine;
  }

  @NonNull
  public static DialogFrmReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_frm_report, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogFrmReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogFrmReportBinding>inflateInternal(inflater, R.layout.dialog_frm_report, root, attachToRoot, component);
  }

  @NonNull
  public static DialogFrmReportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_frm_report, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogFrmReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogFrmReportBinding>inflateInternal(inflater, R.layout.dialog_frm_report, null, false, component);
  }

  public static DialogFrmReportBinding bind(@NonNull View view) {
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
  public static DialogFrmReportBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogFrmReportBinding)bind(component, view, R.layout.dialog_frm_report);
  }
}
