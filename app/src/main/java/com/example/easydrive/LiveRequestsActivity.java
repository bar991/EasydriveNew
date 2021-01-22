package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;

public class LiveRequestsActivity extends Activity implements LocationListener {
    LocationManager lm1;
    EditText et1;
    EditText et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_requests);


        lm1 = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//lm1.requestLocationUpdates("",0,0,this);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);


       // public void onLocationChanged (Location l1){
         //   et1.setText(String.valueOf(l1.getLongitude()));
           // et2.setText(String.valueOf(l1.getLatitude()));
        }

    @Override
    public void onLocationChanged(Location location) {

    }

    public void onStatusChanged (String s, int i, Bundle bundle){

        }

        @Override
        public void onProviderEnabled (String s){

        }

        @Override
        public void onProviderDisabled (String s){

        }
    }