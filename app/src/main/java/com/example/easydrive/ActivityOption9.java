package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityOption9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option9);}
        public void gotosignin(View view) {
            Intent i=new Intent(this,ActivityOption1.class);
            startActivity(i);}
            public void gotosignup(View view) {
                Intent i=new Intent(this,ActivityOption10.class);
                startActivity(i);
            }
        }

