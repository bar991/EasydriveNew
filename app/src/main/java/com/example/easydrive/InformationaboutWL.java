package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InformationaboutWL extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationabout_w_l);
        tv=findViewById(R.id.textinfoWL);
        Intent i= getIntent();
        String x=i.getExtras().getString("key1");
        tv.setText(x);

     //   checkWhoIs();
    }
    public void btn2click(View view) { Intent i=new Intent(this, Warning_Symbols.class);
        startActivity(i);
    }
    public void checkWhoIs(View view){

    }

}