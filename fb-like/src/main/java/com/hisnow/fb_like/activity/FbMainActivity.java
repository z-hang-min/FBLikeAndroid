package com.hisnow.fb_like.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hisnow.fb_like.R;

public class FbMainActivity extends AppCompatActivity {

    public static String returnStr(String string) {
        return string;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fb_main);
    }
}
