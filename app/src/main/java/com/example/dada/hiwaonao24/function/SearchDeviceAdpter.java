package com.example.dada.hiwaonao24.function;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dada.hiwaonao24.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dada on 2016/6/21.
 */
public class SearchDeviceAdpter extends BaseAdapter {
    private Context context;
    private List<Boolean> mChecked;
    private List<String> DeviceList;
    private static HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();

    public SearchDeviceAdpter(Context context, List<String> DeviceList){
        this.context = context;
        this.DeviceList = DeviceList;
        // 初始化数据
        mChecked = new ArrayList<Boolean>();
        initDate();
    }

    // 初始化isSelected的数据
    private void initDate(){
        for(int i=0; i<DeviceList.size();i++) {
            mChecked.add(false);
        }
    }

    @Override
    public View getView(int position, View converView, ViewGroup viewGroup) {
        ViewHolder holder = null;
        //判断是否缓存
        if (converView == null){
            holder = new ViewHolder();
            //通过LayoutInflater实例化布局
            converView = LayoutInflater.from(context).inflate(R.layout.lv_devicelist,null);
            holder.background = (LinearLayout) converView.findViewById(R.id.serch_device_list_item);
            holder.deviceIP = (TextView) converView.findViewById(R.id.array_ip);
            holder.cb = (CheckBox) converView.findViewById(R.id.item_cb);
            final int p = position;
            holder.cb.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    CheckBox cb = (CheckBox)v;
                    mChecked.set(p, cb.isChecked());
                }
            });
            converView.setTag(holder);
        }else {
            holder=(ViewHolder) converView.getTag();
        }
        //设置布局中控件要显示的视图
        holder.deviceIP.setText(DeviceList.get(position));
//        //根据Item位置分配不同背景
//        if(DeviceList.size() > 0)
//        {
//            if(DeviceList.size() == 1)
//            {
//                holder.background.setBackgroundColor(Color.parseColor("#FFFFFF"));
//            }
//            else{
//                if(position == 0){
//                    holder.background.setBackgroundColor(Color.parseColor("#6699FF"));
//                }
//                else if(position == DeviceList.size()-1){
//                    holder.background.setBackgroundColor(Color.parseColor("#CC0000"));
//                }
//                else{
//                    holder.background.setBackgroundColor(Color.parseColor("#00CC00"));
//                }
//            }
//        }

//        // 根据isSelected来设置的选中状况
//        holder.cb.setChecked(getIsSelected().get(position));
        return converView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return DeviceList.get(position);
    }

    @Override
    public int getCount() {
        return DeviceList.size();
    }

    static class ViewHolder {
        LinearLayout background;
        TextView deviceIP;
        CheckBox cb;
    }
}
