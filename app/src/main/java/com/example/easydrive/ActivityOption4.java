package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityOption4 extends AppCompatActivity {
    TextView tv1;
    GridView gv;
    ArrayMenuIcon ad;
    ArrayList<Menuicon> mdata= new ArrayList<Menuicon>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option4);
        gv= findViewById(R.id.gridview2);
tv1= findViewById(R.id.AlertLightstext1);
       buildArrayData();


       ad= new ArrayMenuIcon(this,R.layout.menuicon,mdata);
       gv.setAdapter(ad);
        gv.setOnItemClickListener(lst1);
    }


    public void buildArrayData()
    {
        mdata.add(new Menuicon("light.png" ,"Lighting symbols"));

        mdata.add(new Menuicon("goweb.jpg" ,"web"));

        mdata.add(new Menuicon("yellow1alert.png" ,"Safety symbols"));
        mdata.add(new Menuicon("redalert.jpg" ,"Warning symbols"));




    }
    private AdapterView.OnItemClickListener lst1= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

            if (mdata.get(position).getMIName().equals("Warning symbols"))
            {
                Intent i= new Intent(ActivityOption4.this,  Warning_Symbols.class);
                startActivity(i);
            }
            if (mdata.get(position).getMIName().equals("Safety symbols"))
            {
                Intent i= new Intent(ActivityOption4.this,  Safety_Symbols.class);
                startActivity(i);
            }
            if (mdata.get(position).getMIName().equals("Lighting symbols"))
            {
                Intent i= new Intent(ActivityOption4.this,  Lighting_Symbols.class);
                startActivity(i);
            }
            if  (mdata.get(position).getMIName().equals("web"))
            {
                Intent i= new Intent(ActivityOption4.this,  WebActivity.class);
                startActivity(i);
            }


        }


    };

    public void back(View view) {Intent i=new Intent(this, MainActivitygr.class);
        startActivity(i);
    }
}