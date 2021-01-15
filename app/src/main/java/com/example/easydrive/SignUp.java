package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText name;
    EditText Password;
    EditText email;
    EditText phoneNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        name=findViewById(R.id.PersonName2);
        Password=findViewById(R.id.Password2);
        email=findViewById(R.id.EmailAddress);
        phoneNum=findViewById(R.id.editTextPhone);
    }

    public void gotologinpage(View view) {
        Toast.makeText(this,"Name: "+ name.getText()+", Password: "+Password.getText()+", email: "+ email.getText()+", Phone number: "+phoneNum.getText(),Toast.LENGTH_LONG).show();
        Intent i=new Intent(this, SignIn.class);
        startActivity(i);
    }

}