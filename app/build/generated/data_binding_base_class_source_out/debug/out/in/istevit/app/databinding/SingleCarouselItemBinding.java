// Generated by data binding compiler. Do not edit!
package in.istevit.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import in.istevit.app.R;
import in.istevit.app.data.model.home.HomeCarouselData;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SingleCarouselItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView carouselImageView;

  @NonNull
  public final CardView carouselMainCard;

  @NonNull
  public final TextView carouselTitle;

  @Bindable
  protected HomeCarouselData mListItem;

  protected SingleCarouselItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView carouselImageView, CardView carouselMainCard, TextView carouselTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.carouselImageView = carouselImageView;
    this.carouselMainCard = carouselMainCard;
    this.carouselTitle = carouselTitle;
  }

  public abstract void setListItem(@Nullable HomeCarouselData listItem);

  @Nullable
  public HomeCarouselData getListItem() {
    return mListItem;
  }

  @NonNull
  public static SingleCarouselItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.single_carousel_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SingleCarouselItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SingleCarouselItemBinding>inflateInternal(inflater, R.layout.single_carousel_item, root, attachToRoot, component);
  }

  @NonNull
  public static SingleCarouselItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.single_carousel_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SingleCarouselItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SingleCarouselItemBinding>inflateInternal(inflater, R.layout.single_carousel_item, null, false, component);
  }

  public static SingleCarouselItemBinding bind(@NonNull View view) {
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
  public static SingleCarouselItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (SingleCarouselItemBinding)bind(component, view, R.layout.single_carousel_item);
  }
}
