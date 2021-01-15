package com.example.easydrive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class WebInfo extends AppCompatActivity {
WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_info);
        web=findViewById(R.id.Web);
        web.getSettings().setBuiltInZoomControls(true);
        web.setWebChromeClient(new WebChromeClient());
        web.getSettings().setJavaScriptEnabled(true);
    }

    public void WebClick(View view) {
        web.loadUrl("https://vatire.com/car-maintenance-tips/what-all-the-symbols-on-your-dashboard-mean/");
    }
}