package com.hisnow.fb_like.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.hisnow.fb_like.R;

/**
 * Created by Administrator on 2017/9/29 0029.
 */

public class MyFilpperAdapte extends BaseAdapter {
    private Context mContex;
    private int[] imgIds;

    public MyFilpperAdapte(Context mContex, int[] imgIds) {
        this.mContex = mContex;
        this.imgIds = imgIds;
    }

    @Override
    public int getCount() {
        return imgIds.length;
    }

    @Override
    public Object getItem(int position) {
        return imgIds[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContex);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            convertView = imageView;

        } else {
            imageView = (ImageView) convertView;
        }
        // 给ImageView设置图片资源
        imageView.setImageResource(imgIds[position]);

        return imageView;
    }
}
