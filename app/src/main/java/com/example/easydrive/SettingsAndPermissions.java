package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SettingsAndPermissions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }

    public void toast_examle(View view) {
     //   Toast.makeText(this,"Name: "+ name.getText()+", Password: "+Password.getText()+", email: "+ email.getText()+", Phone number: "+phoneNum.getText(),Toast.LENGTH_LONG).show();
    }
}