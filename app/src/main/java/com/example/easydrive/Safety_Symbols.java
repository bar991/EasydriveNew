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
//     buildArrayData();
//
    Dal dal= new Dal(Safety_Symbols.this);
        if(!dal.Checkdetail2sempty()){
       dal.addwarningalert("air.jpg" ,"Tire Pressure Warning Light","Safety alert");
            dal.addwarningalert("engine.jpg" ,"Check Engine or Malfunction Indicator Light","Safety alert");
        dal.addwarningalert("ABS.jpg" ,"Anti-lock Brake Warning Light","Safety alert");
        dal.addwarningalert("fuel.jpg" ,"Low Fuel Indicator","Safety alert");
        dal.addwarningalert("brake_fluid.jpg" ,"Brake Fluid","Safety alert");
        dal.addwarningalert("brake_pedal.jpg" ,"Engine Warning","Safety alert");
        dal.addwarningalert("esp.jpg" ,"ESP Fault/Traction Control Malfunction","Safety alert");
        dal.addwarningalert("security_alert.jpg" ,"Security alert","Safety alert");
        dal.addwarningalert("parking_brake.jpg" ,"Parking Brake Light","Safety alert");
        dal.addwarningalert("service.jpg" ,"Service Vehicle soon","Safety alert");
        dal.addwarningalert("side_airbag.jpg" ,"Side airbag","Safety alert");
        dal.addwarningalert("seat.jpg" ,"Seat Belt Reminder","Safety alert");
        dal.addwarningalert("temp.jpg" ,"Transmission Temperature","Safety alert");
        dal.addwarningalert("wheel.jpg" ,"Steering Wheel Lock","Safety alert");
        dal.addwarningalert("trailer.jpg" ,"Trailer Tow Hitch Warning","Safety alert");
        dal.addwarningalert("control.jpg" ,"Traction Control Light","Safety alert");}

        mdata1=dal.getAlllsafety();
        ad= new ArrayWarningLight(this,R.layout.warninglight ,mdata1);
        lstView3.setAdapter(ad);
        lstView3.setOnItemClickListener(lst1);
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