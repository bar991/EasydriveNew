package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LiveRequestsActivity extends Activity implements LocationListener {
    LocationManager lm1;
    EditText et1;
    EditText et2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_requests);
        //  myContext = getApplicationContext();

        lm1 = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(LiveRequestsActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
       ) {
            lm1.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
        }
            et1 = findViewById(R.id.et1);
            et2 = findViewById(R.id.et2);




    }


    @Override
    public void onLocationChanged(Location l1) {
      //  currentLocation=l1;
        et1.setText(String.valueOf(l1.getLongitude()));
         et2.setText(String.valueOf(l1.getLatitude()));
//        String whatsAppMessage = "http://maps.google.com/maps?saddr=" + l1.getLatitude() + "," + l1.getLongitude();
//        Intent sendIntent = new Intent();
//        sendIntent.setAction(Intent.ACTION_SEND);
//        sendIntent.putExtra(Intent.EXTRA_TEXT, whatsAppMessage);
//        sendIntent.setType("text/plain");
//        sendIntent.setPackage("com.whatsapp");
//        startActivity(sendIntent);

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }


}