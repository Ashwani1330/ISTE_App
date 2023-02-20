// Generated by data binding compiler. Do not edit!
package in.istevit.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import in.istevit.app.R;
import in.istevit.app.data.model.EventDetailsModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityEventDetailsBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final Button button;

  @NonNull
  public final TextView dateTV;

  @NonNull
  public final TextView dateTitle;

  @NonNull
  public final TextView detailsDifficulty;

  @NonNull
  public final TextView detailsScore;

  @NonNull
  public final TextView detailsTV;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView platformTV;

  @NonNull
  public final TextView speakerTV;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView timeTV;

  @NonNull
  public final TextView timeTitle;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final CollapsingToolbarLayout toolbarLayout;

  @Bindable
  protected EventDetailsModel mEvent;

  protected ActivityEventDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appBar, Button button, TextView dateTV, TextView dateTitle,
      TextView detailsDifficulty, TextView detailsScore, TextView detailsTV, ImageView imageView,
      TextView platformTV, TextView speakerTV, TextView textView3, TextView timeTV,
      TextView timeTitle, Toolbar toolbar, CollapsingToolbarLayout toolbarLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBar = appBar;
    this.button = button;
    this.dateTV = dateTV;
    this.dateTitle = dateTitle;
    this.detailsDifficulty = detailsDifficulty;
    this.detailsScore = detailsScore;
    this.detailsTV = detailsTV;
    this.imageView = imageView;
    this.platformTV = platformTV;
    this.speakerTV = speakerTV;
    this.textView3 = textView3;
    this.timeTV = timeTV;
    this.timeTitle = timeTitle;
    this.toolbar = toolbar;
    this.toolbarLayout = toolbarLayout;
  }

  public abstract void setEvent(@Nullable EventDetailsModel event);

  @Nullable
  public EventDetailsModel getEvent() {
    return mEvent;
  }

  @NonNull
  public static ActivityEventDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_event_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEventDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityEventDetailsBinding>inflateInternal(inflater, R.layout.activity_event_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityEventDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_event_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEventDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityEventDetailsBinding>inflateInternal(inflater, R.layout.activity_event_details, null, false, component);
  }

  public static ActivityEventDetailsBinding bind(@NonNull View view) {
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
  public static ActivityEventDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityEventDetailsBinding)bind(component, view, R.layout.activity_event_details);
  }
}
