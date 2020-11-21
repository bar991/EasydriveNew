package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void btnOption2(View view) { Intent i=new Intent(this,ActivityOption2.class);
        startActivity(i);
    }



    public void btnOption1(View view) { Intent i=new Intent(this,ActivityOption8.class);
        startActivity(i);
    }


    public void btnOption5(View view) { Intent i=new Intent(this, SettingsAndPermissions.class);
        startActivity(i);
    }

    public void btnOption6(View view) { Intent i=new Intent(this,ShareActivity.class);
        startActivity(i);
    }
}
