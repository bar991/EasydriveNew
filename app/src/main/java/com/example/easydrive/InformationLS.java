package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InformationLS extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_l_s);

    tv =findViewById(R.id.textinfoWL1);
    Intent i= getIntent();
    String x=i.getExtras().getString("key2");
        tv.setText(x);

    //   checkWhoIs();
}
    public void btn2click(View view) { Intent i=new Intent(this, Lighting_Symbols.class);
        startActivity(i);
    }
}