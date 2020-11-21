package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }

    public void gotoGA(View view) {
        Intent i=new Intent(this,ActivityOption6.class);
        startActivity(i);
    }
    public void gotoliverequests(View view) {
        Intent i=new Intent(this,LiveRequestsActivity.class);
        startActivity(i);
    }
}