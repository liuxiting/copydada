package com.sdk.lxting.dadaapplication.Base;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.sdk.lxting.dadaapplication.R;
import com.sdk.lxting.dadaapplication.tools.StatusBarCompat;
/*
* activiyt基类
*
* */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        //输入法不顶导航栏
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            StatusBarCompat.compat(this);
        }
        initdata();
    }
    /**
     * this activity layout res
     * 设置layout布局,在子类重写该方法.
     * @return res layout xml id
     */
    protected abstract int getLayoutId();

    protected abstract  void initdata();

}
