package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityOption2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option2);
    }
    public void gotoQA(View view) {
        Intent i=new Intent(this,ActivityOption3.class);
        startActivity(i);
    }

    public void gotoCM(View view) {
        Intent i=new Intent(this,ActivityOption7.class);
        startActivity(i);
    }
}