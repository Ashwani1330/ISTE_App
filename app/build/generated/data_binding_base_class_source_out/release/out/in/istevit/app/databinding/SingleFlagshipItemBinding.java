// Generated by data binding compiler. Do not edit!
package in.istevit.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import in.istevit.app.R;
import in.istevit.app.data.model.FlagshipModel;
import in.istevit.app.ui.flagship.FlagshipOnClickCallback;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SingleFlagshipItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  @Bindable
  protected FlagshipModel mFlagshipItem;

  @Bindable
  protected FlagshipOnClickCallback mCallback;

  protected SingleFlagshipItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
  }

  public abstract void setFlagshipItem(@Nullable FlagshipModel flagshipItem);

  @Nullable
  public FlagshipModel getFlagshipItem() {
    return mFlagshipItem;
  }

  public abstract void setCallback(@Nullable FlagshipOnClickCallback callback);

  @Nullable
  public FlagshipOnClickCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static SingleFlagshipItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.single_flagship_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SingleFlagshipItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SingleFlagshipItemBinding>inflateInternal(inflater, R.layout.single_flagship_item, root, attachToRoot, component);
  }

  @NonNull
  public static SingleFlagshipItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.single_flagship_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SingleFlagshipItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SingleFlagshipItemBinding>inflateInternal(inflater, R.layout.single_flagship_item, null, false, component);
  }

  public static SingleFlagshipItemBinding bind(@NonNull View view) {
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
  public static SingleFlagshipItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (SingleFlagshipItemBinding)bind(component, view, R.layout.single_flagship_item);
  }
}
