// Generated code from Butter Knife. Do not modify!
package com.sdk.lxting.dadaapplication.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.mikephil.charting.charts.LineChart;
import com.sdk.lxting.dadaapplication.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TubiaoActivity_ViewBinding<T extends TubiaoActivity> implements Unbinder {
  protected T target;

  @UiThread
  public TubiaoActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mLineChart = Utils.findRequiredViewAsType(source, R.id.mylinechart, "field 'mLineChart'", LineChart.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mLineChart = null;

    this.target = null;
  }
}
