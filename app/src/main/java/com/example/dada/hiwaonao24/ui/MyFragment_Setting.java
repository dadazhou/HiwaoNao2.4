package com.example.dada.hiwaonao24.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dada.hiwaonao24.R;

/**
 * Created by Jay on 2015/8/28 0028.
 */
public class MyFragment_Setting extends Fragment {

    public MyFragment_Setting() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_setting,container,false);
        return view;
    }
}
