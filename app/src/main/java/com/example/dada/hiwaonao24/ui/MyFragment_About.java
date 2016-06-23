package com.example.dada.hiwaonao24.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dada.hiwaonao24.R;

/**
 * Created by Jay on 2015/8/28 0028.
 */
public class MyFragment_About extends Fragment {

    public MyFragment_About() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_about,container,false);
        return view;
    }
}
