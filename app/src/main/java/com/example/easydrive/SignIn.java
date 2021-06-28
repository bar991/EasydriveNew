package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
EditText name;
EditText password;
Button Login;
Dal db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1);
        name=findViewById(R.id.PersonName);
        password=findViewById(R.id.Password);
        Login=findViewById(R.id.loginbtn);
        db= new Dal(this);
    }
    public void gotosignUp(View view) {

        Intent il=new Intent(this, SignUp.class);
        startActivity(il);
    }
    public void resetbtn(View view) {
        name.setText("");
        password.setText("");
        Intent il=new Intent(this,MainActivitygr.class);
        startActivity(il);}


        public void gotomainpage(View v) {
            String usr;
            String pas;

            usr = name.getText().toString();
            pas = password.getText().toString();

            if (usr.equals("")) {
                Toast.makeText(SignIn.this, "Username is Blank", Toast.LENGTH_LONG).show();
            } else if (pas.equals("")) {
                Toast.makeText(SignIn.this, "Password is Blank", Toast.LENGTH_LONG).show();
            } else {

              //  Authenticaion
                Boolean checkUp = db.checkUps(usr, pas);
                if (checkUp == true) {
                  Toast.makeText(SignIn.this, "Successful Login", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(SignIn.this, MainActivitygr.class);
                    startActivity(i);}
                else Toast.makeText(SignIn.this, "Failed to Login", Toast.LENGTH_LONG).show();
            }
        }}



//    public void gotomainpage(View view)  {
//        if (name.getText().length() == 0 || password.getText().length() < 8)
//    S         Toast.makeText(this, "enter values to all areas,password must have at least 8 chars", Toast.LENGTH_SHORT).show();
//        else {
//            Toast.makeText(this,"Name: "+ name.getText()+", Password: "+ password.getText(),Toast.LENGTH_LONG).show();
//            Intent il=new Intent(this,MainActivitygr.class);
//            startActivity(il);
//            } }

//

