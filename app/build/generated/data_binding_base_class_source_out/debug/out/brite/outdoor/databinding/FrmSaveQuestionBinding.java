// Generated by data binding compiler. Do not edit!
package brite.outdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import brite.outdoor.R;
import brite.outdoor.viewmodel.SavedQuestionViewModel;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FrmSaveQuestionBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rcView;

  @NonNull
  public final SwipeRefreshLayout refreshLayout;

  @NonNull
  public final ShimmerFrameLayout shimmerFrameLayout;

  @Bindable
  protected SavedQuestionViewModel mMViewModel;

  protected FrmSaveQuestionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView rcView, SwipeRefreshLayout refreshLayout,
      ShimmerFrameLayout shimmerFrameLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rcView = rcView;
    this.refreshLayout = refreshLayout;
    this.shimmerFrameLayout = shimmerFrameLayout;
  }

  public abstract void setMViewModel(@Nullable SavedQuestionViewModel mViewModel);

  @Nullable
  public SavedQuestionViewModel getMViewModel() {
    return mMViewModel;
  }

  @NonNull
  public static FrmSaveQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.frm_save_question, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FrmSaveQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FrmSaveQuestionBinding>inflateInternal(inflater, R.layout.frm_save_question, root, attachToRoot, component);
  }

  @NonNull
  public static FrmSaveQuestionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.frm_save_question, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FrmSaveQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FrmSaveQuestionBinding>inflateInternal(inflater, R.layout.frm_save_question, null, false, component);
  }

  public static FrmSaveQuestionBinding bind(@NonNull View view) {
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
  public static FrmSaveQuestionBinding bind(@NonNull View view, @Nullable Object component) {
    return (FrmSaveQuestionBinding)bind(component, view, R.layout.frm_save_question);
  }
}
