package com.prgguru.example;

import android.app.Activity;
import android.os.Bundle;

import ocm.prgguru.example.wbclient.R;

/**
 * Created by Zeng on 2015/9/23.
 */
public class HomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Displays HomeActivity Screen
        setContentView(R.layout.home);
    }
}
