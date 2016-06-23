package com.example.dada.hiwaonao24.function;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.example.dada.hiwaonao24.ui.MainActivity;
import com.example.dada.hiwaonao24.ui.MyFragment_Connect;
import com.example.dada.hiwaonao24.ui.MyFragment_Motion;
import com.example.dada.hiwaonao24.ui.MyFragment_Setting;
import com.example.dada.hiwaonao24.ui.MyFragment_About;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int PAGER_COUNT = 4;
    private MyFragment_Connect myFragmentConnect = null;
    private MyFragment_Motion myFragmentMotion = null;
    private MyFragment_Setting myFragmentDialog = null;
    private MyFragment_About myFragmentAbout = null;


    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        myFragmentConnect = new MyFragment_Connect();
        myFragmentMotion = new MyFragment_Motion();
        myFragmentDialog = new MyFragment_Setting();
        myFragmentAbout = new MyFragment_About();
    }


    @Override
    public int getCount() {
        return PAGER_COUNT;
    }

    @Override
    public Object instantiateItem(ViewGroup vg, int position) {
        return super.instantiateItem(vg, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        System.out.println("position Destory" + position);
        super.destroyItem(container, position, object);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case MainActivity.PAGE_ONE:
                fragment = myFragmentConnect;
                break;
            case MainActivity.PAGE_TWO:
                fragment = myFragmentMotion;
                break;
            case MainActivity.PAGE_THREE:
                fragment = myFragmentDialog;
                break;
            case MainActivity.PAGE_FOUR:
                fragment = myFragmentAbout;
                break;
        }
        return fragment;
    }


}

