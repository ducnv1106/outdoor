// Generated by view binder compiler. Do not edit!
package brite.outdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import brite.outdoor.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FrmHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final Guideline glH098;

  @NonNull
  public final Guideline glH14;

  @NonNull
  public final Guideline glW8;

  @NonNull
  public final AppBarLayout idAppbar;

  @NonNull
  public final AppCompatImageView imgQuestion;

  @NonNull
  public final View indicator;

  @NonNull
  public final View indicator2;

  @NonNull
  public final CoordinatorLayout mainContent;

  @NonNull
  public final LayoutBottomNavigationHomeBinding naviBottHome;

  @NonNull
  public final RelativeLayout rlTopNav;

  @NonNull
  public final TabLayout tab;

  @NonNull
  public final ViewPager viewPager;

  private FrmHomeBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout container,
      @NonNull Guideline glH098, @NonNull Guideline glH14, @NonNull Guideline glW8,
      @NonNull AppBarLayout idAppbar, @NonNull AppCompatImageView imgQuestion,
      @NonNull View indicator, @NonNull View indicator2, @NonNull CoordinatorLayout mainContent,
      @NonNull LayoutBottomNavigationHomeBinding naviBottHome, @NonNull RelativeLayout rlTopNav,
      @NonNull TabLayout tab, @NonNull ViewPager viewPager) {
    this.rootView = rootView;
    this.container = container;
    this.glH098 = glH098;
    this.glH14 = glH14;
    this.glW8 = glW8;
    this.idAppbar = idAppbar;
    this.imgQuestion = imgQuestion;
    this.indicator = indicator;
    this.indicator2 = indicator2;
    this.mainContent = mainContent;
    this.naviBottHome = naviBottHome;
    this.rlTopNav = rlTopNav;
    this.tab = tab;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FrmHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FrmHomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.frm_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FrmHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.glH098;
      Guideline glH098 = rootView.findViewById(id);
      if (glH098 == null) {
        break missingId;
      }

      id = R.id.glH14;
      Guideline glH14 = rootView.findViewById(id);
      if (glH14 == null) {
        break missingId;
      }

      id = R.id.glW8;
      Guideline glW8 = rootView.findViewById(id);
      if (glW8 == null) {
        break missingId;
      }

      id = R.id.id_appbar;
      AppBarLayout idAppbar = rootView.findViewById(id);
      if (idAppbar == null) {
        break missingId;
      }

      id = R.id.imgQuestion;
      AppCompatImageView imgQuestion = rootView.findViewById(id);
      if (imgQuestion == null) {
        break missingId;
      }

      id = R.id.indicator;
      View indicator = rootView.findViewById(id);
      if (indicator == null) {
        break missingId;
      }

      id = R.id.indicator2;
      View indicator2 = rootView.findViewById(id);
      if (indicator2 == null) {
        break missingId;
      }

      id = R.id.main_content;
      CoordinatorLayout mainContent = rootView.findViewById(id);
      if (mainContent == null) {
        break missingId;
      }

      id = R.id.naviBottHome;
      View naviBottHome = rootView.findViewById(id);
      if (naviBottHome == null) {
        break missingId;
      }
      LayoutBottomNavigationHomeBinding binding_naviBottHome = LayoutBottomNavigationHomeBinding.bind(naviBottHome);

      id = R.id.rlTopNav;
      RelativeLayout rlTopNav = rootView.findViewById(id);
      if (rlTopNav == null) {
        break missingId;
      }

      id = R.id.tab;
      TabLayout tab = rootView.findViewById(id);
      if (tab == null) {
        break missingId;
      }

      id = R.id.view_pager;
      ViewPager viewPager = rootView.findViewById(id);
      if (viewPager == null) {
        break missingId;
      }

      return new FrmHomeBinding((ConstraintLayout) rootView, container, glH098, glH14, glW8,
          idAppbar, imgQuestion, indicator, indicator2, mainContent, binding_naviBottHome, rlTopNav,
          tab, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
