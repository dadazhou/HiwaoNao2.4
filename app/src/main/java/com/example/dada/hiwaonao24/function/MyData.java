package com.example.dada.hiwaonao24.function;

import android.app.Application;

import java.util.HashMap;

/**
 * Created by dada on 2016/6/22.
 */
public class MyData extends Application {
    private HashMap<String,Integer> DeviceInfor = new HashMap<String,Integer>();
    private HashMap<String,Integer> ConnectInfor = new HashMap<String,Integer>();

    @Override
    public void onCreate(){
        super.onCreate();
    }

    //搜索到的设备
    public HashMap<String,Integer> DeviceInfor(){
        return this.DeviceInfor;
    }
    public void putDeviceInfor(String ip,Integer port){
        this.DeviceInfor.put(ip,port);
    }
    public void rmDeviceInfor(String ip){
        DeviceInfor.remove(ip);
    }

    //连接到的设备
    public HashMap<String,Integer> ConnectInforr(){
        return this.ConnectInfor;
    }
    public void putConnectInfor(String ip,Integer port){
        this.ConnectInfor.put(ip,port);
    }
    public void rmConnectInfor(String ip){
        ConnectInfor.remove(ip);
    }

}
