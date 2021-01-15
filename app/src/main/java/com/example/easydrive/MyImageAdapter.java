package com.example.easydrive;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MyImageAdapter extends BaseAdapter {
    Integer[] images={

    };
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    //@Override
   // public View getView(int i, View view, ViewGroup viewGroup) {
    //    ImageView imageView= new ImageView(MainActivitygr.this);
        //imageView.setImageResource(images[i]);
        //imageView.setLayoutParams(new ViewGroup.LayoutParams(300,280));
       // return imageView;
    }
