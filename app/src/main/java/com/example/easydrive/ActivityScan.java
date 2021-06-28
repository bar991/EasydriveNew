package com.example.easydrive;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityScan extends AppCompatActivity {
ImageView ImageView;
    ListView lstView1;
    Array ad;
    ArrayList<WarningLights> mdata= new ArrayList<WarningLights>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
       // ImageView=findViewById(R.id.ImageView3);
        lstView1= findViewById(R.id.ls);
       // buildArrayData();
        ad= new Array(this,R.layout.warninglight ,mdata);
        lstView1.setAdapter(ad);
        //lstView1.setOnItemClickListener(lst1);
    }

    public void btncamera(View view) {
        Intent Intent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(Intent,100);
    }  @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode==100)&& (resultCode== ActivityScan.RESULT_OK));
        { ImageView= (ImageView) data.getExtras().get("data");
        //ImageView.setImageBitmap(img);

mdata.add(new WarningLights(ImageView, "a","b"));
        }}

}