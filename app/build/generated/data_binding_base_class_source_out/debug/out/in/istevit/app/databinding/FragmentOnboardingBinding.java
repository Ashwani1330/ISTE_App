// Generated by data binding compiler. Do not edit!
package in.istevit.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import in.istevit.app.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentOnboardingBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout layoutDots;

  @NonNull
  public final TextView textView;

  protected FragmentOnboardingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView, LinearLayout layoutDots, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
    this.layoutDots = layoutDots;
    this.textView = textView;
  }

  @NonNull
  public static FragmentOnboardingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOnboardingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentOnboardingBinding>inflateInternal(inflater, R.layout.fragment_onboarding, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOnboardingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOnboardingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentOnboardingBinding>inflateInternal(inflater, R.layout.fragment_onboarding, null, false, component);
  }

  public static FragmentOnboardingBinding bind(@NonNull View view) {
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
  public static FragmentOnboardingBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentOnboardingBinding)bind(component, view, R.layout.fragment_onboarding);
  }
}
