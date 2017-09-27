package com.hisnow.fblikeandroid;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.hisnow.fb_like.FbMainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_jump)
    TextView tvJump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.tv_jump)
    public void sayHi() {
        tvJump.setTextColor(Color.BLUE);
        tvJump.setText(FbMainActivity.returnStr("你好"));
    }

}
