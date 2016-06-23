package com.example.dada.hiwaonao24.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dada.hiwaonao24.R;
import com.example.dada.hiwaonao24.function.MyData;
import com.example.dada.hiwaonao24.function.SearchDeviceAdpter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jay on 2015/8/28 0028.
 */
public class MyFragment_Connect extends Fragment {

    //数据
    private MyData myData;

    private ListView listView;
    private SearchDeviceAdpter mAdapter;
    private List<String> list;
    private int checkNum; // 记录选中的条目数量
    private TextView tv_show;// 用于显示选中的条目数量

    public MyFragment_Connect() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_connect, container, false);
        /* 实例化各个控件 */
        listView = (ListView) view.findViewById(R.id.lv_device);
        tv_show = (TextView) view.findViewById(R.id.array_ip);
        list = new ArrayList<String>();
        // 为Adapter准备数据
        initDate();
        // 实例化自定义的Adapter
        mAdapter = new SearchDeviceAdpter(getActivity(),list);
        // 绑定Adapter
        listView.setAdapter(mAdapter);
        return view;
    }

    // 初始化数据
    private void initDate() {
        myData = new MyData();
        for (int i = 0; i < 8; i++) {
            list.add("data" + "   " + i);
        }
    }

    // 刷新listview和TextView的显示
    private void dataChanged() {
        // 通知listView刷新
        myData.DeviceInfor().clear();
        mAdapter.notifyDataSetChanged();
    }

//    public void setListViewHeightBasedOnChildren(ListView listView) {
//
//        Adapter listAdapter = listView.getAdapter();
//
//        if (listAdapter == null) {
//            return;
//        }
//
//        int totalHeight = 0;
//        int viewCount = listAdapter.getCount();
//        for (int i = 0; i < viewCount; i++) {
//            View listItem = listAdapter.getView(i, null, listView);
//            listItem.measure(0, 0);
//            totalHeight += listItem.getMeasuredHeight();
//        }
//
//        ViewGroup.LayoutParams params = listView.getLayoutParams();
//
//        params.height = totalHeight
//                + (listView.getDividerHeight() * (listAdapter.getCount()-1)) + 10;//加10是为了适配自定义背景
//
//        listView.setLayoutParams(params);
//    }
}
