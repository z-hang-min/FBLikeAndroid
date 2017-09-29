package com.hisnow.fb_like.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.Button;

import com.hisnow.fb_like.R;
import com.hisnow.fb_like.adapter.MyFilpperAdapte;

import butterknife.ButterKnife;

public class AdapterViewFilperActivity extends AppCompatActivity implements View.OnClickListener {


    AdapterViewFlipper avfFlipper;
    Button prevBtn;
    Button nextBtn;
    Button autoBtn;
    private MyFilpperAdapte myFilpperAdapte;
    private int[] imgIDs = {R.drawable.img_guide1, R.drawable.img_free_phone, R.drawable.img_guide1, R.drawable.img_free_phone};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_view_filper);
        ButterKnife.bind(this);
        myFilpperAdapte = new MyFilpperAdapte(this, imgIDs);
        avfFlipper=(AdapterViewFlipper)findViewById(R.id.avf_flipper);
        avfFlipper.setAdapter(myFilpperAdapte);
        prevBtn=(Button)findViewById(R.id.prev_btn);
        nextBtn=(Button)findViewById(R.id.next_btn);
        autoBtn=(Button)findViewById(R.id.auto_btn);
        prevBtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);
        autoBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if (id==R.id.prev_btn){
            avfFlipper.showPrevious();
            avfFlipper.stopFlipping();

        }else if (id==R.id.next_btn){
            avfFlipper.showNext();
            avfFlipper.stopFlipping();


        }else if (id==R.id.auto_btn){
            avfFlipper.startFlipping();
        }

    }


}
