package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class GasStationsActivity extends AppCompatActivity {
    ListView lstView3;
    ArrayWarningLight ad;
    ArrayList<WarningLights> mdata1 = new ArrayList<WarningLights>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_stations);
        lstView3 = findViewById(R.id.listViewGas);
        buildArrayData();
        ad = new ArrayWarningLight(this, R.layout.warninglight, mdata1);
        lstView3.setAdapter(ad);
        lstView3.setOnItemClickListener(lst1);
    }

    public void buildArrayData() {

        mdata1.add(new WarningLights("hf.jpg", "Hafniex Insurance Company", "Insurance Company"));

        mdata1.add(new WarningLights("lock.jpg", "Car locksmith", "Car locksmith"));
        mdata1.add(new WarningLights("grr.png", "Towing and Rescue Ltd.", "Towing and rescue services"));
        mdata1.add(new WarningLights("puncture.jpg", "puncture haifa", "puncture"));
        mdata1.add(new WarningLights("color.png", "Tin and paint haifa", "Tin and paint"));
        mdata1.add(new WarningLights("emgine.jpeg", "Engine care garage", "emgine"));
    }

    private AdapterView.OnItemClickListener lst1 = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View v, int position, long l) {


            if (mdata1.get(position).getWLName().equals("Towing and Rescue Ltd.")) {
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0548303337"));
//                Intent i = new Intent(GasStationsActivity.this, InformationLS.class);
//                i.putExtra("key2", "0584121202");
                startActivity(callIntent);
            }
            if (mdata1.get(position).getWLName().equals("Hafniex Insurance Company")) {
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:*3455"));
//                Intent i = new Intent(GasStationsActivity.this, InformationLS.class);
//                i.putExtra("key2", "0584121202");
                startActivity(callIntent);
            }
            if (mdata1.get(position).getWLName().equals("Car locksmith")) {
                Intent callIntent= new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0549895506"));
//                Intent i = new Intent(GasStationsActivity.this, InformationLS.class);
//                i.putExtra("key2", "0584121202");
               startActivity(callIntent);
            }
//            if (mdata1.get(position).getWLName().equals("Engine care garage"))
//            {
//                Intent i= new Intent(GasStationsActivity.this, MapsActivity2.class);
//                startActivity(i);
//            }



        }

};

    public void back(View view) {
        Intent i=new Intent(this, MainActivitygr.class);
        startActivity(i);
    }
}