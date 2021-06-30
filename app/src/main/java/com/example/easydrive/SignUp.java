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
        String usr;
        String pas;

        usr = name.getText().toString();
        pas = Password.getText().toString();
        if (usr.equals("")) {
            Toast.makeText(SignUp.this, "Username can't be Blank", Toast.LENGTH_LONG).show();
        } else if (pas.equals("")) {
            Toast.makeText(SignUp.this, "Password can't be Blank", Toast.LENGTH_LONG).show();
        } else

        {Dal dal= new Dal(SignUp.this);
        dal.addUser(
                name.getText().toString(),
              Password.getText().toString(),
               email.getText().toString(),
               phoneNum.getText().toString());


            Intent i=new Intent(this, SignIn.class);
            startActivity(i);
        }


    }
//    public int shtrudelcountandplace(String st) {
//
//        if (st.indexOf('@') ==0 || st.indexOf('@')==st.length()-1)
//            return -1;
//        else if (st.lastIndexOf('@') != st.indexOf('@') ||st.indexOf('@')==-1)
//            return 0;
//        else return 1;
//    }
//

}