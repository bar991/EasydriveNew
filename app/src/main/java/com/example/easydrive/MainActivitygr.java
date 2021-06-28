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
        mdata.add(new Menuicon("cs.png" ,"Car services"));

        mdata.add(new Menuicon("dash_icon.webp" ,"Car dashboard symbols"));

        mdata.add(new Menuicon("gs.jpg" ,"Gas stations nearby"));
        mdata.add(new Menuicon("zz.jpg" ,"Get your location"));




    }
    private AdapterView.OnItemClickListener lst1= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
    if (mdata.get(position).getMIName().toString()=="Car services")
            {
                Intent i= new Intent(MainActivitygr.this,  GasStationsActivity.class);
                startActivity(i);
            }
   else if (mdata.get(position).getMIName().toString()=="Car dashboard symbols")
            {
                Intent i= new Intent(MainActivitygr.this,  ActivityOption4.class);
                startActivity(i);
            }

 else if    (mdata.get(position).getMIName().toString()=="Get your location")
            {
                Intent i= new Intent(MainActivitygr.this,  LiveRequestsActivity.class);
                startActivity(i);
            }
    else
    {
        Intent i= new Intent(MainActivitygr.this, MapsActivity1.class);
        startActivity(i);
    }
        }


    };
}