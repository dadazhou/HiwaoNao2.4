package com.example.dada.hiwaonao24.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.example.dada.hiwaonao24.R;
import com.example.dada.hiwaonao24.function.MyView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jay on 2015/8/28 0028.
 */
public class MyFragment_Motion extends Fragment  {
    private GridView gridView;
    private SimpleAdapter sim_adapter;
    private List<Map<String, Object>> data_list;

    // 图片封装为一个数组
    private int[] icon = { R.drawable.motion, R.drawable.dialog};
    private String[] iconName = { "动作", "语音"};


    public MyFragment_Motion() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_motion,container,false);
        gridView = (GridView) view.findViewById(R.id.gv_motion);
        //新建List
        data_list = new ArrayList<Map<String, Object>>();
        //获取数据
        getData();
        //新建适配器
        String [] from ={"image","text"};
        int [] to = {R.id.image,R.id.text};
        sim_adapter = new SimpleAdapter(getActivity(), data_list, R.layout.gv_item, from, to);
        //配置适配器
        gridView.setAdapter(sim_adapter);
        gridView.setOnItemClickListener(new GridView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View arg1, int position, long arg3) {
                //intent
                Intent intent = new Intent(getActivity(), MyView.class);
                intent.putExtra("motion",position);
                //Start activity
                startActivity(intent);
            }

        });
        return view;
    }

    public List<Map<String, Object>> getData(){
        //cion和iconName的长度是相同的，这里任选其一都可以
        for(int i=0;i<icon.length;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon[i]);
            map.put("text", iconName[i]);
            data_list.add(map);
        }

        return data_list;
    }
}
