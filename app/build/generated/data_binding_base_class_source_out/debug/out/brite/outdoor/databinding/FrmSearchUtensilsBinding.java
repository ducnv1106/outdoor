// Generated by data binding compiler. Do not edit!
package brite.outdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import brite.outdoor.R;
import brite.outdoor.viewmodel.SearchViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FrmSearchUtensilsBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView btnSearch;

  @NonNull
  public final ConstraintLayout clFindBox;

  @NonNull
  public final Guideline glEndContent;

  @NonNull
  public final Guideline glEndFindBox;

  @NonNull
  public final Guideline glStartContent;

  @NonNull
  public final Guideline glStartFindBox;

  @NonNull
  public final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView rvSearchWith;

  @NonNull
  public final AutoCompleteTextView searchEdit;

  @NonNull
  public final TextView tvDescFindWith;

  @Bindable
  protected SearchViewModel mMSearchViewModel;

  protected FrmSearchUtensilsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView btnSearch, ConstraintLayout clFindBox, Guideline glEndContent,
      Guideline glEndFindBox, Guideline glStartContent, Guideline glStartFindBox,
      ConstraintLayout rootView, RecyclerView rvSearchWith, AutoCompleteTextView searchEdit,
      TextView tvDescFindWith) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSearch = btnSearch;
    this.clFindBox = clFindBox;
    this.glEndContent = glEndContent;
    this.glEndFindBox = glEndFindBox;
    this.glStartContent = glStartContent;
    this.glStartFindBox = glStartFindBox;
    this.rootView = rootView;
    this.rvSearchWith = rvSearchWith;
    this.searchEdit = searchEdit;
    this.tvDescFindWith = tvDescFindWith;
  }

  public abstract void setMSearchViewModel(@Nullable SearchViewModel mSearchViewModel);

  @Nullable
  public SearchViewModel getMSearchViewModel() {
    return mMSearchViewModel;
  }

  @NonNull
  public static FrmSearchUtensilsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.frm_search_utensils, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FrmSearchUtensilsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FrmSearchUtensilsBinding>inflateInternal(inflater, R.layout.frm_search_utensils, root, attachToRoot, component);
  }

  @NonNull
  public static FrmSearchUtensilsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.frm_search_utensils, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FrmSearchUtensilsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FrmSearchUtensilsBinding>inflateInternal(inflater, R.layout.frm_search_utensils, null, false, component);
  }

  public static FrmSearchUtensilsBinding bind(@NonNull View view) {
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
  public static FrmSearchUtensilsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FrmSearchUtensilsBinding)bind(component, view, R.layout.frm_search_utensils);
  }
}
