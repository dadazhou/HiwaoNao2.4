package com.example.dada.hiwaonao24.function;

import android.app.Activity;
import android.os.Bundle;

import com.example.dada.hiwaonao24.R;

/**
 * Created by dada on 2016/6/23.
 */
public class MyView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int flag = getIntent().getIntExtra("motion",-1);
        switch (flag){
            case 0:
                setContentView(R.layout.activity_motion);
                break;
            case 1:
                setContentView(R.layout.activity_dialog);
                break;
        }
    }
}
