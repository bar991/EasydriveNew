package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityOption1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1);
    }
    public void gotosignUp(View view) {
        Intent il=new Intent(this,ActivityOption10.class);
        startActivity(il);
    }
    public void gotomainpage(View view) {
        Intent il=new Intent(this,MainActivity.class);
        startActivity(il);
    }
}