package com.sdk.lxting.dadaapplication.method;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.util.List;

/**
 * Created by Administrator on 2018/4/25 0025.
 * 自定义x轴
 */

public class xFormatter  implements IAxisValueFormatter {
    private List<String> mvalue;
    public xFormatter(List<String> values){
        this.mvalue=values;
    }
    private  static  String TAG="xformatter";
    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        return mvalue.get((int)value%mvalue.size());
    }
}
