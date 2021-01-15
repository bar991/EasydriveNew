package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
EditText name;
EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1);
        name=findViewById(R.id.PersonName);
        password=findViewById(R.id.Password);
    }
    public void gotosignUp(View view) {
        Intent il=new Intent(this, SignUp.class);
        startActivity(il);
    }
    public void gotomainpage(View view) {
        Toast.makeText(this,"Name: "+ name.getText()+", Password: "+ password.getText(),Toast.LENGTH_LONG).show();
        Intent il=new Intent(this,MainActivitygr.class);
        startActivity(il);
    }



}