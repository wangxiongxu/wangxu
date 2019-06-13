package com.example.wxxu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    private WebView mWv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        mWv = (WebView) findViewById(R.id.wv);
        Intent intent = new Intent();
        String stringExtra = intent.getStringExtra("1");
        mWv.loadUrl(stringExtra);
        mWv.setWebViewClient(new WebViewClient());
    }
}
