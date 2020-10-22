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

    public void btnOption3(View view) { Intent i=new Intent(this,ActivityOption3.class);
        startActivity(i);
    }

    public void btnOption4(View view) { Intent i=new Intent(this,ActivityOption4.class);
        startActivity(i);
    }

    public void btnOption7(View view) { Intent i=new Intent(this,ActivityOption7.class);
        startActivity(i);
    }

    public void btnOption10(View view) { Intent i=new Intent(this,ActivityOption10.class);
        startActivity(i);
    }

    public void btnOption9(View view) { Intent i=new Intent(this,ActivityOption9.class);
        startActivity(i);
    }

    public void btnOption1(View view) { Intent i=new Intent(this,ActivityOption1.class);
        startActivity(i);
    }

    public void btnOption8(View view) {
        Intent i=new Intent(this,ActivityOption8.class);
        startActivity(i);
    }

    public void btnOption5(View view) { Intent i=new Intent(this,ActivityOption5.class);
        startActivity(i);
    }

    public void btnOption6(View view) { Intent i=new Intent(this,ActivityOption6.class);
        startActivity(i);
    }
}
