package com.example.dada.hiwaonao24.ui;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.dada.hiwaonao24.R;
import com.example.dada.hiwaonao24.function.MyFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, ViewPager.OnPageChangeListener{
    //UI
    private TextView txt_topbar;
    private RadioGroup rg_tab_bar;
    private RadioButton rb_connect;
    private RadioButton rb_function;
    private RadioButton rb_setting;
    private RadioButton rb_about;
    private ViewPager vpager;

    private MyFragmentPagerAdapter mAdapter;

    //几个代表页面的常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
    public static final int PAGE_FOUR = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        bindViews();
        rb_connect.setChecked(true);
    }

    private void bindViews() {
        txt_topbar = (TextView) findViewById(R.id.txt_topbar);
        rg_tab_bar = (RadioGroup) findViewById(R.id.rg_tab_bar);
        rb_connect = (RadioButton) findViewById(R.id.rb_connect);
        rb_about = (RadioButton) findViewById(R.id.rb_about);
        rb_function = (RadioButton) findViewById(R.id.rb_function);
        rb_setting = (RadioButton) findViewById(R.id.rb_setting);
        rg_tab_bar.setOnCheckedChangeListener(this);

        vpager = (ViewPager) findViewById(R.id.vpager);
        vpager.setAdapter(mAdapter);
        vpager.setCurrentItem(0);
        vpager.addOnPageChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb_connect:
                vpager.setCurrentItem(PAGE_ONE);
                break;
            case R.id.rb_function:
                vpager.setCurrentItem(PAGE_TWO);
                break;
            case R.id.rb_setting:
                vpager.setCurrentItem(PAGE_THREE);
                break;
            case R.id.rb_about:
                vpager.setCurrentItem(PAGE_FOUR);
                break;
        }
    }


    //重写ViewPager页面切换的处理方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
        if (state == 2) {
            switch (vpager.getCurrentItem()) {
                case PAGE_ONE:
                    rb_connect.setChecked(true);
                    break;
                case PAGE_TWO:
                    rb_function.setChecked(true);
                    break;
                case PAGE_THREE:
                    rb_setting.setChecked(true);
                    break;
                case PAGE_FOUR:
                    rb_about.setChecked(true);
                    break;
            }
        }
    }
}
