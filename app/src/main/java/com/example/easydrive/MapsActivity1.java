package com.example.easydrive;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.ConnectionResult;

import com.google.android.gms.tasks.Task;

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback, LocationListener
{    private GoogleMap mMap1;

    private GoogleMap mMap;
    LocationManager lm1;
    double Longtiude;
    double Lattitude;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        lm1 = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(MapsActivity1.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
        ) {
            lm1.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 20000, this);
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



        // Add a marker in Sydney and move the camera
       LatLng Haifa = new LatLng(32.794044, 34.989571);
      mMap.addMarker(new MarkerOptions().position(Haifa).title("תחנת דלק מיקה\n"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Haifa));
        LatLng gas1 = new LatLng(32.831764781655785, 35.061753644946954);
        mMap.addMarker(new MarkerOptions().position(gas1).title("תחנת דלק קרית חיים\n"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gas1));
        LatLng gas2= new LatLng(32.807086357283794, 35.047849120290266);
        mMap.addMarker(new MarkerOptions().position(gas2).title("תחנת דלק סונול משה דיין\n"));
        LatLng gas3= new LatLng(32.80679779418418, 35.014718473438585);
        mMap.addMarker(new MarkerOptions().position(gas3).title("   תחנת דלק דור אלון (גשר פז)"));
        LatLng gas4= new LatLng(32.79915053069559, 35.04184097189748);
        mMap.addMarker(new MarkerOptions().position(gas4).title("  דלק ארגמן קישון\n"));
        LatLng gas5= new LatLng(32.7913583024483, 35.042355957162236);
        mMap.addMarker(new MarkerOptions().position(gas5).title("  דלק חרמש"));
        LatLng gas6= new LatLng(32.81199178657168, 35.06484359731516);
        mMap.addMarker(new MarkerOptions().position(gas6).title("   פז חיפה"));
        LatLng gas7= new LatLng(32.805066395848606, 35.08286804249354);
        mMap.addMarker(new MarkerOptions().position(gas7).title("  תחנת דלק טן קרית אתא\n"));
        LatLng gas8= new LatLng(32.815021475507756, 35.101922454799734);
        mMap.addMarker(new MarkerOptions().position(gas8).title("  סונול קרית אתא"));
        LatLng gas9= new LatLng(32.80016058432824, 35.018838348377166);
                mMap.addMarker(new MarkerOptions().position(gas9).title(" סונול בר יהודה"));
        LatLng gas10= new LatLng(32.79294566352509, 34.994805754743325);
        mMap.addMarker(new MarkerOptions().position(gas10).title("  סונול ורדיה"));
    }

    @Override
    public void onLocationChanged(Location l1) {


        //   LatLng sydney=new LatLng(location.getLatitude(),location.getLongitude());
        //    LatLng  = new LatLng(-34, 151);
        //   mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //   mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        //   mMap.animateCamera(CameraUpdateFactory.zoomTo(12));


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