package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

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
       ad= new ArrayMenuIcon(this,R.layout.menuicon, mdata);
       gv.setAdapter(ad);
        gv.setOnItemClickListener(lst1);
    }


    public void buildArrayData()
    {
        mdata.add(new Menuicon("lightning_icon.png" ,"Lighting symbols"));

        mdata.add(new Menuicon("web.png" ,"web"));

        mdata.add(new Menuicon("safety_icon.png" ,"Safety symbols"));
        mdata.add(new Menuicon("warning_icon.jpg" ,"Warning symbols"));




    }
    private AdapterView.OnItemClickListener lst1= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            if (mdata.get(position).getMIName().toString()=="Warning symbols")
            {
                Intent i= new Intent(ActivityOption4.this,  Warning_Symbols.class);
                startActivity(i);
            }
            if (mdata.get(position).getMIName().toString()=="Safety symbols")
            {
                Intent i= new Intent(ActivityOption4.this,  Safety_Symbols.class);
                startActivity(i);
            }
            if (mdata.get(position).getMIName().toString()=="Lighting symbols")
            {
                Intent i= new Intent(ActivityOption4.this,  Lighting_Symbols.class);
                startActivity(i);
            }
            if  (mdata.get(position).getMIName().toString()=="web")
            {
                Intent i= new Intent(ActivityOption4.this,  WebInfo.class);
                startActivity(i);
            }


        }


    };

    public void back(View view) {Intent i=new Intent(this, MainActivitygr.class);
        startActivity(i);
    }
}