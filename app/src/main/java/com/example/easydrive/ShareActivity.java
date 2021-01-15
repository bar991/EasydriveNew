package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShareActivity extends AppCompatActivity {
    TextView tv1;
    GridView gv;
    ArrayMenuIcon ad;
    ArrayList<Menuicon> mdata= new ArrayList<Menuicon>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        gv= findViewById(R.id.gridview3);

        buildArrayData();
        ad= new ArrayMenuIcon(this,R.layout.menuicon ,mdata);
        gv.setAdapter(ad);
        gv.setOnItemClickListener(lst1);
    }
    public void buildArrayData()
    {
        mdata.add(new Menuicon("locat.jpg" ,"Live requests for help"));

        mdata.add(new Menuicon("gas.png" ,"Gas stations or garage "));






    }
    private AdapterView.OnItemClickListener lst1= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            if (mdata.get(position).getMIName()=="Live requests for help")
            {
                Intent i= new Intent(ShareActivity.this,  LiveRequestsActivity.class);
                startActivity(i);
            }
            else
            {
                Intent i= new Intent(ShareActivity.this, GasStationsActivity.class);
                startActivity(i);
            }

        }


    };

}