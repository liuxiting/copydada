// Generated code from Butter Knife. Do not modify!
package com.sdk.lxting.dadaapplication;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  private View view2131230797;

  private View view2131230832;

  private View view2131230749;

  @UiThread
  public MainActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.layout_back, "field 'layoutBack' and method 'onclick'");
    target.layoutBack = Utils.castView(view, R.id.layout_back, "field 'layoutBack'", RelativeLayout.class);
    view2131230797 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onclick(p0);
      }
    });
    target.txtTitle = Utils.findRequiredViewAsType(source, R.id.txt_title, "field 'txtTitle'", TextView.class);
    view = Utils.findRequiredView(source, R.id.renwu, "field 'renwu' and method 'onclick'");
    target.renwu = Utils.castView(view, R.id.renwu, "field 'renwu'", TextView.class);
    view2131230832 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onclick(p0);
      }
    });
    target.navView = Utils.findRequiredViewAsType(source, R.id.nav_view, "field 'navView'", NavigationView.class);
    target.drawerLayout = Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'drawerLayout'", DrawerLayout.class);
    view = Utils.findRequiredView(source, R.id.btnrefresh, "field 'btnrefresh' and method 'onclick'");
    target.btnrefresh = Utils.castView(view, R.id.btnrefresh, "field 'btnrefresh'", LinearLayout.class);
    view2131230749 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onclick(p0);
      }
    });
    target.imgrefresh = Utils.findRequiredViewAsType(source, R.id.img, "field 'imgrefresh'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.layoutBack = null;
    target.txtTitle = null;
    target.renwu = null;
    target.navView = null;
    target.drawerLayout = null;
    target.btnrefresh = null;
    target.imgrefresh = null;

    view2131230797.setOnClickListener(null);
    view2131230797 = null;
    view2131230832.setOnClickListener(null);
    view2131230832 = null;
    view2131230749.setOnClickListener(null);
    view2131230749 = null;

    this.target = null;
  }
}
