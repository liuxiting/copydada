package com.sdk.lxting.dadaapplication.Base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sdk.lxting.dadaapplication.R;
/*
* activiyt基类
*
* */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
    /**
     * this activity layout res
     * 设置layout布局,在子类重写该方法.
     * @return res layout xml id
     */
    protected abstract int getLayoutId();
}
