package com.sdk.lxting.dadaapplication.activity;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.sdk.lxting.dadaapplication.Base.BaseActivity;
import com.sdk.lxting.dadaapplication.R;
import com.sdk.lxting.dadaapplication.method.xFormatter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindArray;
import butterknife.BindView;
import butterknife.ButterKnife;

public class TubiaoActivity extends BaseActivity {
    @BindView(R.id.mylinechart)
    LineChart mLineChart;
    ArrayList<String> xValueList=new ArrayList<>();
    ArrayList<Integer> yValuelLst=new ArrayList<>();
    private LineDataSet set1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_tubiao;
    }

    @Override
    protected void initdata() {
        ButterKnife.bind(this);
        xValueList.add("10");
        xValueList.add("23");
        xValueList.add("32");
        xValueList.add("34");
        xValueList.add("52");
        xValueList.add("62");
        xValueList.add("37");
        xValueList.add("34");
        xValueList.add("52");
        xValueList.add("62");
        xValueList.add("37");
        yValuelLst.add(19);
        yValuelLst.add(33);
        yValuelLst.add(24);
        yValuelLst.add(36);
        yValuelLst.add(16);
        yValuelLst.add(28);
        yValuelLst.add(31);
        yValuelLst.add(36);
        yValuelLst.add(16);
        yValuelLst.add(28);
        yValuelLst.add(31);
        setChartProperties();
        setChartXAxis();
        setChartYAxis();
        setData1(xValueList,yValuelLst);
    }

    private void setChartProperties() {
        //设置描述文本不显示
        mLineChart.getDescription().setEnabled(false);
        //设置是否显示表格背景
        mLineChart.setDrawGridBackground(true);
        //设置是否可以触摸
        mLineChart.setTouchEnabled(true);
        mLineChart.setDragDecelerationFrictionCoef(0.9f);
        //设置是否可以拖拽
        mLineChart.setDragEnabled(true);
        //设置是否可以缩放
        mLineChart.setScaleEnabled(false);
        mLineChart.setDrawGridBackground(false);
        mLineChart.setHighlightPerDragEnabled(true);
        mLineChart.setPinchZoom(true);
        //设置背景颜色
        mLineChart.setBackgroundColor(Color.parseColor("#D3E8FF"));
        //设置一页最大显示个数为6，超出部分就滑动
        float ratio = (float) xValueList.size()/(float) 6;
        //显示的时候是按照多大的比率缩放显示,1f表示不放大缩小
        mLineChart.zoom(ratio,1f,0,0);
        //设置从X轴出来的动画时间
        //mLineChart.animateX(1500);
        //设置XY轴动画
        mLineChart.animateXY(1500,1500, Easing.EasingOption.EaseInSine, Easing.EasingOption.EaseInSine);

    }


    private void setChartXAxis() {
        ArrayList<String> list=new ArrayList<>();
        list.add("4月");
        list.add("5月");
        list.add("6月");
        list.add("7月");
        list.add("8月");
        list.add("9月");
        list.add("10月");
        list.add("11月");
        list.add("12月");
        list.add("1月");
        list.add("2月");
        IAxisValueFormatter xValueFormatter=new xFormatter(list);
        XAxis xAxis=mLineChart.getXAxis();
        //设置字体大小
        xAxis.setTextSize(10f);
        xAxis.setTextColor(Color.parseColor("#ffffff"));
        //设置从x轴发出的横线
        xAxis.setDrawGridLines(true);
        xAxis.setGridColor(Color.GRAY);
        //设置网格线宽度
        xAxis.setGridLineWidth(1);
        //设置显示X轴
        xAxis.setDrawAxisLine(true);
        //设置X轴显示的位置
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        //设置自定义X轴值
        xAxis.setValueFormatter(xValueFormatter);
        //一个界面显示6个Lable，那么这里要设置11个
        xAxis.setLabelCount(6);
        //设置最小间隔，防止当放大时出现重复标签
        xAxis.setGranularity(1f);
        //设置为true当一个页面显示条目过多，X轴值隔一个显示一个
        xAxis.setGranularityEnabled(true);
        //设置X轴的颜色
        xAxis.setAxisLineColor(Color.parseColor("#000000"));
        //设置X轴的宽度
        xAxis.setAxisLineWidth(1f);
        mLineChart.invalidate();

    }
    private  void setChartYAxis(){
        //设置y轴
        YAxis leftAxis=mLineChart.getAxisLeft();
        //设置从Y轴发出横向直线(网格线)
        leftAxis.setDrawGridLines(true);
        //设置网格线的颜色
        leftAxis.setGridColor(Color.GRAY);
        //设置网格线宽度
        leftAxis.setGridLineWidth(1);
        //设置Y轴最小值是0，从0开始
        leftAxis.setAxisMinimum(0f);
        leftAxis.setGranularityEnabled(true);
        //设置最小间隔，防止当放大时出现重复标签
        leftAxis.setGranularity(1f);
        //如果沿着轴线的线应该被绘制，则将其设置为true,隐藏Y轴
        leftAxis.setDrawAxisLine(false);
        leftAxis.setDrawZeroLine(false);
        leftAxis.setTextSize(10f);
        leftAxis.setTextColor(Color.parseColor("#ffffff"));
        //设置左边X轴显示
        leftAxis.setEnabled(true);
        //设置Y轴的颜色
        leftAxis.setAxisLineColor(Color.parseColor("#000000"));
        //设置Y轴的宽度
        leftAxis.setAxisLineWidth(1f);
        YAxis rightAxis = mLineChart.getAxisRight();
        //设置右边Y轴不显示
        rightAxis.setEnabled(false);


    }
    private  void setData1(ArrayList<String> xValueList,ArrayList<Integer> yValuelLst){
        ArrayList<Entry> yValues=new ArrayList<>();
        for (int i=0;i<xValueList.size();i++){
            yValues.add(new Entry(i,yValuelLst.get(i)));
        }
        LineDataSet set;
        if(mLineChart.getData() != null && mLineChart.getData().getDataSetCount() > 0){
            set = (LineDataSet) mLineChart.getData().getDataSetByIndex(0);
            set.setValues(yValues);
            mLineChart.getData().notifyDataChanged();
            mLineChart.notifyDataSetChanged();
        }else{
            //设置值给图表
            set = new LineDataSet(yValues, "学习笔记");
            //设置图标不显示
            set.setDrawIcons(false);
            //设置Y值使用左边Y轴的坐标值
            set.setAxisDependency(YAxis.AxisDependency.LEFT);
            //设置线的颜色
            set.setColors(Color.BLACK);
            //设置数据点圆形的颜色
            set.setCircleColor(Color.BLUE);
            //设置填充圆形中间的颜色
            set.setCircleColorHole(Color.BLACK);
            //设置折线宽度
            set.setLineWidth(1f);
            //设置折现点圆点半径
            set.setCircleRadius(4f);
            //设置十字线颜色
            //set.setHighLightColor(Color.parseColor("#47DBCC"));
            //设置显示十字线，必须显示十字线，否则MarkerView不生效
            set.setHighlightEnabled(true);
            //设置是否在数据点中间显示一个孔
            set.setDrawCircleHole(false);

            //设置填充
            //设置允许填充
            set.setDrawFilled(true);
            set.setFillAlpha(50);
            //设置背景渐变
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2){
                //设置渐变
                //设置渐变
              /*  Drawable drawable = ContextCompat.getDrawable(this, R.drawable.bg_gradient_color);
                set.setFillDrawable(drawable);*/

                set.setFillColor(Color.parseColor("#0E7AD4"));
            }else {
                set.setFillColor(Color.parseColor("#0E7AD4"));
            }

            LineData data = new LineData(set);
            //设置不显示数据点的值
            data.setDrawValues(false);

            mLineChart.setData(data);
            mLineChart.invalidate();
        }
    }



}
