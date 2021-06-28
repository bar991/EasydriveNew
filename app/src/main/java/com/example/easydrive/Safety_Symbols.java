package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Safety_Symbols extends AppCompatActivity {
    ListView lstView3;
    ArrayWarningLight ad;
    ArrayList<WarningLights> mdata1= new ArrayList<WarningLights>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning__alert);
        lstView3= findViewById(R.id.listview3);
     buildArrayData();

//        Dal dal= new Dal(Safety_Symbols.this);
//       int cnt= dal.getcnt();
//       if (cnt==0){
//          dal.addwarningalert("brake.jpg","brake.jpg","Warning alert");
//          dal.addwarningalert("battery_alert.jpg" ,"Battery Charge Warning Light", "Warning alert");
//          dal.addwarningalert("Engine_Temperature.jpg" ,"Engine Temperature Warning Light", "Warning alert");
//          dal.addwarningalert("Oil_Pressure.jpg" ,"Oil Pressure Warning Light"
//                  ,"Warning alert");}
//          mdata1=dal.getAllalert();
        ad= new ArrayWarningLight(this,R.layout.warninglight ,mdata1);
        lstView3.setAdapter(ad);
        lstView3.setOnItemClickListener(lst1);
    }
    public void buildArrayData()
    {

        mdata1.add(new WarningLights("air.jpg" ,"Tire Pressure Warning Light","Warning alert"));
        mdata1.add(new WarningLights("engine.jpg" ,"Check Engine or Malfunction Indicator Light","Warning alert"));
        mdata1.add(new WarningLights("ABS.jpg" ,"Anti-lock Brake Warning Light","Warning alert"));
        mdata1.add(new WarningLights("fuel.jpg" ,"Low Fuel Indicator","Warning alert"));
        mdata1.add(new WarningLights("brake_fluid.jpg" ,"Brake Fluid","Warning alert"));
        mdata1.add(new WarningLights("brake_pedal.jpg" ,"Engine Warning","Warning alert"));
        mdata1.add(new WarningLights("esp.jpg" ,"ESP Fault/Traction Control Malfunction","Warning alert"));
        mdata1.add(new WarningLights("parking_brake.jpg" ,"Parking Brake Light","Warning alert"));
        mdata1.add(new WarningLights("service.jpg" ,"Service Vehicle soon","Warning alert"));
        mdata1.add(new WarningLights("security_alert.jpg" ,"Security alert","Warning alert"));
        mdata1.add(new WarningLights("side_airbag.jpg" ,"Side airbag","Warning alert"));
        mdata1.add(new WarningLights("seat.jpg" ,"Seat Belt Reminder","Warning alert"));
        mdata1.add(new WarningLights("temp.jpg" ,"Transmission Temperature","Warning alert"));
        mdata1.add(new WarningLights("wheel.jpg" ,"Steering Wheel Lock","Warning alert"));
        mdata1.add(new WarningLights("trailer.jpg" ,"Trailer Tow Hitch Warning","Warning alert"));
        mdata1.add(new WarningLights("control.jpg" ,"Traction Control Light","Warning alert"));


    }
    private AdapterView.OnItemClickListener lst1= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View v, int position, long l) {

            if (mdata1.get(position).getWLName().equals("Anti-lock Brake Warning Light"))
            {
                Intent i= new Intent(Safety_Symbols.this,  InformationSS.class);
                i.putExtra("key2","Indicator light means there may be a malfunction in the ABS system");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName().equals("Parking Brake Light"))
            {
                Intent i= new Intent(Safety_Symbols.this,  InformationSS.class);
                i.putExtra("key2","Indicator light means park brake is on.");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName().equals("Low Fuel Indicator"))
            {
                Intent i= new Intent(Safety_Symbols.this,  InformationSS.class);
                i.putExtra("key2","Most drivers are very familiar with this symbol. It simply means you’re running low on gas. It’s not a good idea to see if you can make it home if you have a ways to go. You never know how weather or traffic patterns will play out, so it’s best to stop at the nearest gas station and fill up!");
                startActivity(i);
            }

            if (mdata1.get(position).getWLName().equals("Tire Pressure Warning Light"))
            {
                Intent i= new Intent(Safety_Symbols.this,  InformationSS.class);
                i.putExtra("key2","Indicator light means the pressure is low in one of your tires.");


                startActivity(i);


            }
            if (mdata1.get(position).getWLName().equals("Check Engine or Malfunction Indicator Light"))
            {
                Intent i= new Intent(Safety_Symbols.this, InformationSS.class);
                i.putExtra("key2","Indicator light turns on whenever the engine is turned on to check the bulb. If the light stays illuminated, the car’s diagnostic systems have detected a malfunction that needs to be investigated.");
                startActivity(i);
            }

            if (mdata1.get(position).getWLName().equals("Brake Fluid"))
            {
                Intent i= new Intent(Safety_Symbols.this,  InformationSS.class);
                i.putExtra("key2","Indicator light means that the brake fluid level is low");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName().equals("ESP Fault/Traction Control Malfunction"))
            {
                Intent i= new Intent(Safety_Symbols.this,  InformationSS.class);
                i.putExtra("key2","Indicator light means that there is a problem with the vehicle’s traction control.");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName().equals("Transmission Temperature"))
            {
                Intent i= new Intent(Safety_Symbols.this,  InformationSS.class);
                i.putExtra("key2","Indicator light means the engine temperature has exceeded normal limits. Check coolant level, fan operation, radiator cap, coolant leaks.");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName().equals("Steering Wheel Lock"))
            {
                Intent i= new Intent(Safety_Symbols.this,InformationSS.class);
                i.putExtra("key2","Indicator light means your steering wheel is locked and can not be moved. To turn off the steering lock, insert the key into the ignition and turn it to at least the first position while turning the steering wheel in either direction");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName().equals("Trailer Tow Hitch Warning"))
            {
                Intent i= new Intent(Safety_Symbols.this, InformationSS.class);
                i.putExtra("key2","Indicator lights mean that the tow hitch is unlocked or that there’s an issue with the lighting system.");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName().equals("Traction Control Light"))
            {
                Intent i= new Intent(Safety_Symbols.this,  InformationSS.class);
                i.putExtra("key2","Indicator light turns on when the vehicle TCS (traction control system) is activated.");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName().equals("Service Vehicle soon"))
            {
                Intent i= new Intent(Safety_Symbols.this,  InformationSS.class);
                i.putExtra("key2","Indicator light turns on when there is a fault condition in an area of the vehicle chassis systems such ABS brake system,TCS system, the electronic suspension system, or the brake hydraulic system. ");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName().equals("Security alert"))
            {
                Intent i= new Intent(Safety_Symbols.this,  InformationSS.class);
                i.putExtra("key2","Indicator light will turn on momentarily if the ignition switch is locked and will need the proper transponder-equipped key to restart. If the light is visible when the vehicle is on, then it typically indicates a malfunction in the security system. ");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName().equals("Side airbag"))
            {
                Intent i= new Intent(Safety_Symbols.this,  InformationSS.class);
                i.putExtra("key2","Indicator light means a fault with the side airbag.");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName().equals("Seat Belt Reminder"))
            {
                Intent i= new Intent(Safety_Symbols.this,  InformationSS.class);
                i.putExtra("key1","a seat belt has not been secured for a passenger in the vehicle");
                startActivity(i);

            }
        }



    };

    public void backtoMenuDashbord(View view) {Intent i=new Intent(this, ActivityOption4.class);
        startActivity(i);
    }
}