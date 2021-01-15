package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivitygr extends AppCompatActivity {
TextView tv1;
   GridView gv;
    ArrayMenuIcon ad;
    ArrayList<Menuicon> mdata= new ArrayList<Menuicon>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitygr);
       // tv1=findViewById(R.id.);
        gv= findViewById(R.id.gridview1);

        buildArrayData();
        ad= new ArrayMenuIcon(this,R.layout.menuicon ,mdata);
       gv.setAdapter(ad);
        gv.setOnItemClickListener(lst1);
    }


    public void buildArrayData()
    {
        mdata.add(new Menuicon("qr.png" ,"Scan a warning light"));

        mdata.add(new Menuicon("dash_icon.webp" ,"Car dashboard symbols"));

        mdata.add(new Menuicon("settings.png" ,"Settings and permissions"));
        mdata.add(new Menuicon("location.jpg" ,"Share your location"));




    }
    private AdapterView.OnItemClickListener lst1= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
    if (mdata.get(position).getMIName().toString()=="Scan a warning light")
            {
                Intent i= new Intent(MainActivitygr.this,  ActivityScan.class);
                startActivity(i);
            }
   else if (mdata.get(position).getMIName().toString()=="Car dashboard symbols")
            {
                Intent i= new Intent(MainActivitygr.this,  ActivityOption4.class);
                startActivity(i);
            }
     else if(  mdata.get(position).getMIName().toString()=="Settings and permissions")
            {
                Intent i= new Intent(MainActivitygr.this,  SettingsAndPermissions.class);
                startActivity(i);
            }
 else if    (mdata.get(position).getMIName().toString()=="Share your location")
            {
                Intent i= new Intent(MainActivitygr.this,  ShareActivity.class);
                startActivity(i);
            }
        }


    };
}