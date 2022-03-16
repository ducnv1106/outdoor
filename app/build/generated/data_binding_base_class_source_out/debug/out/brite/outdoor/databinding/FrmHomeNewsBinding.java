// Generated by data binding compiler. Do not edit!
package brite.outdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import brite.outdoor.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FrmHomeNewsBinding extends ViewDataBinding {
  @NonNull
  public final LayoutApiLoadFailedHomeBinding ltRetry;

  @NonNull
  public final RecyclerView rcView;

  @NonNull
  public final SwipeRefreshLayout refreshLayout;

  @NonNull
  public final ShimmerFrameLayout shimmerFrameLayout;

  protected FrmHomeNewsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LayoutApiLoadFailedHomeBinding ltRetry, RecyclerView rcView, SwipeRefreshLayout refreshLayout,
      ShimmerFrameLayout shimmerFrameLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ltRetry = ltRetry;
    this.rcView = rcView;
    this.refreshLayout = refreshLayout;
    this.shimmerFrameLayout = shimmerFrameLayout;
  }

  @NonNull
  public static FrmHomeNewsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.frm_home_news, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FrmHomeNewsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FrmHomeNewsBinding>inflateInternal(inflater, R.layout.frm_home_news, root, attachToRoot, component);
  }

  @NonNull
  public static FrmHomeNewsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.frm_home_news, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FrmHomeNewsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FrmHomeNewsBinding>inflateInternal(inflater, R.layout.frm_home_news, null, false, component);
  }

  public static FrmHomeNewsBinding bind(@NonNull View view) {
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
  public static FrmHomeNewsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FrmHomeNewsBinding)bind(component, view, R.layout.frm_home_news);
  }
}
