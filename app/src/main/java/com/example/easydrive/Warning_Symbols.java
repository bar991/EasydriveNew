package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Warning_Symbols extends AppCompatActivity {
    ListView lstView1;
  //  int cnt=0;
    ArrayWarningLight ad;
    ArrayList<WarningLights> mdata1= new ArrayList<WarningLights>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.warning_symbols);
        lstView1 = findViewById(R.id.listview1);

//        int cnt=dal.jjj()
//if (cnt==0){
//    dal.updatejjj()
//
//    Toast.makeText(this, ""+cnt, Toast.LENGTH_SHORT).show();
//        Dal dal = new Dal(Warning_Symbols.this);
//        dal.addwarningalert("brake.jpg", "Brake Warning Light", "Warning alert");
//        dal.addwarningalert("battery_alert.jpg", "Battery Charge Warning Light", "Warning alert");
//        dal.addwarningalert("Engine_Temperature.jpg", "Engine Temperature Warning Light", "Warning alert");
//        dal.addwarningalert("Oil_Pressure.jpg", "Oil Pressure Warning Light"
//                , "Warning alert");
//        mdata1 = dal.getAllalert();
//        ad = new ArrayWarningLight(this, R.layout.warninglight, mdata1);
//    lstView1.setAdapter(ad);
//    lstView1.setOnItemClickListener(Lst1);cnt++;}

      buildArrayData();

        ad= new ArrayWarningLight(this,R.layout.warninglight ,mdata1);
        lstView1.setAdapter(ad);
        lstView1.setOnItemClickListener(lst1);
    }
    public void buildArrayData()
    {

        mdata1.add(new WarningLights("brake.jpg","Brake Warning Light","Warning alert"));
        mdata1.add(new WarningLights("battery_alert.jpg" ,"Battery Charge Warning Light", "Warning alert"));
        mdata1.add(new WarningLights("Engine_Temperature.jpg" ,"Engine Temperature Warning Light", "Warning alert"));
        mdata1.add(new WarningLights("Oil_Pressure.jpg" ,"Oil Pressure Warning Light"
              ,"Warning alert"));


    }






    private AdapterView.OnItemClickListener lst1= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View v, int position, long l) {

         //   Toast.makeText(Warning_Symbols.this, mdata1.get(position).getWLName(), Toast.LENGTH_SHORT).show();
            if (mdata1.get(position).getWLName().equals("Brake Warning Light"))
            {
                Intent i= new Intent(Warning_Symbols.this,  InformationaboutWL.class);
                i.putExtra("key1","Indicator light turns on when the handbrake is on. If it lit continuously, it means that hydraulic pressure has been lost in one side of the brake system or that the fluid level in the master cylinder is dangerously low (due to a leak somewhere in the brake system).");
                startActivity(i);
            }

            if (mdata1.get(position).getWLName().equals("Battery Charge Warning Light"))
            {
                Intent i= new Intent(Warning_Symbols.this,  InformationaboutWL.class);
                i.putExtra("key1","Indicator light means that the car’s charging system is short of power or is not charging properly. It normally indicates a problem with the battery itself or the alternator");
                startActivity(i);
            }

            if (mdata1.get(position).getWLName().equals("Oil Pressure Warning Light")
                   )
            {
                Intent i= new Intent(Warning_Symbols.this,  InformationaboutWL.class);
                i.putExtra("key1","Indicator light means loss of oil pressure, meaning lubrication is low or lost completely. Immediately check the oil level and pressure");
                startActivity(i);
            }

            if (mdata1.get(position).getWLName().equals("Engine Temperature Warning Light"))
            {
                Intent i= new Intent(Warning_Symbols.this,  InformationaboutWL.class);
                i.putExtra("key1","Indicator light means the engine temperature has exceeded normal limits. Check coolant level, fan operation, radiator cap, coolant leaks.");
                startActivity(i);

            }


            }


    };

    public void backtoMenuDashbord(View view) {Intent i=new Intent(this, ActivityOption4.class);
        startActivity(i);
    }
        }