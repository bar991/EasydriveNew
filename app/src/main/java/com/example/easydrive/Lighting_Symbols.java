package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Lighting_Symbols extends AppCompatActivity {
    ListView lstView3;
    ArrayWarningLight ad;
    ArrayList<WarningLights> mdata1= new ArrayList<WarningLights>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lighting__symbols);
        lstView3= findViewById(R.id.listview4);
        buildArrayData();
        ad= new ArrayWarningLight(this,R.layout.warninglight ,mdata1);
        lstView3.setAdapter(ad);
        lstView3.setOnItemClickListener(lst1);
    }
    public void buildArrayData()
    {

        mdata1.add(new WarningLights("Adaptive_Light.png" ,"Adaptive light system","Lighting symbols"));
        mdata1.add(new WarningLights("Exterior_light.jpg" ,"Exterior Light Fault","Lighting symbols"));
        mdata1.add(new WarningLights("fog2_light.png" ,"Front Fog Lights","Lighting symbols"));
        mdata1.add(new WarningLights("Fog3_light.jpg" ,"Fog Lamp Indicator","Lighting symbols"));
        mdata1.add(new WarningLights("fog_lamp.jpg" ,"Low Fuel Indicator","Lighting symbols"));

        mdata1.add(new WarningLights("headlight_light.png" ,"Headlight Range Control","Lighting symbols"));
        mdata1.add(new WarningLights("highBeam_light.jpg" ,"High Beam Light Indicator","Lighting symbols"));
        mdata1.add(new WarningLights("LampOut.jpg" ,"Lamp Out","Lighting symbols"));
        mdata1.add(new WarningLights("LowBeam_light.jpg" ,"Low Beam Indicator Light","Lighting symbols"));
        mdata1.add(new WarningLights("rain_light.gng" ,"Rain and Light sensor","Lighting symbols"));

        mdata1.add(new WarningLights("Rear_light.jpg" ,"Rear Fog Lights","Lighting symbols"));
        mdata1.add(new WarningLights("side_light.jpg" ,"Side Light Indicator","Lighting symbols"));

    }
    private AdapterView.OnItemClickListener lst1= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View v, int position, long l) {

            if (mdata1.get(position).getWLName()=="Headlight Range Control")
            {
                Intent i= new Intent(Lighting_Symbols.this,  InformationLS.class);
                i.putExtra("key2","Indicator light turns on if there is an issue detected with the headlight range control system.");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName()=="High Beam Light Indicator")
            {
                Intent i= new Intent(Lighting_Symbols.this,  InformationLS.class);
                i.putExtra("key2","Indicator light means your car’s high beam headlights are on, or if the high beam flash function is used.");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName()=="Lamp Out")
            {
                Intent i= new Intent(Lighting_Symbols.this,  InformationLS.class);
                i.putExtra("key2","Indicator light means that there is an exterior light on the vehicle that is not functioning properly.");
                startActivity(i);
            }

            if (mdata1.get(position).getWLName()=="Low Beam Indicator Light")
            {
                Intent i= new Intent(Lighting_Symbols.this,  InformationLS.class);
                i.putExtra("key2","Indicator light means that the vehicles dipped beam is on.");


                startActivity(i);


            }
            if (mdata1.get(position).getWLName()=="Adaptive light system")
            {
                Intent i= new Intent(Lighting_Symbols.this,  InformationLS.class);
                i.putExtra("key2","Indicator light will lit when adaptive headlights are turned on.");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName()=="Exterior Light Fault")
            {
                Intent i= new Intent(Lighting_Symbols.this,  InformationLS.class);
                i.putExtra("key2","Indicator light means any exterior light on your car isn’t working.");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName()=="Front Fog Lights")
            {
                Intent i= new Intent(Lighting_Symbols.this, InformationLS.class);
                i.putExtra("key2","Indicator light means front fog lights are turned on.");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName()=="Rain and Light sensor")
            {
                Intent i= new Intent(Lighting_Symbols.this, InformationLS.class);
                i.putExtra("key2","Indicator light means there is an issue with the sensor system. The wipers and lights will not function automatically");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName()=="Rear Fog Lights")
            {
                Intent i= new Intent(Lighting_Symbols.this,  InformationLS.class);
                i.putExtra("key2","Indicator light means rear fog lights are on.");
                startActivity(i);
            }
            if (mdata1.get(position).getWLName()=="Side Light Indicator")
            {
                Intent i= new Intent(Lighting_Symbols.this,  InformationLS.class);
                i.putExtra("key2","Indicator light will turn on when the normal headlights are in use.");
                startActivity(i);
            }
        }



    };

    public void backtoMenuDashbord(View view) {Intent i=new Intent(this, ActivityOption4.class);
        startActivity(i);
    }
}
