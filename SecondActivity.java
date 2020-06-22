package com.example.tiatactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent caller = getIntent();
        Button button_help = (Button) findViewById(R.id.button_help);
        Button button_griev = (Button) findViewById(R.id.button_griev);
        webView = (WebView) findViewById(R.id.webView);
    }

    public void display(View v) {
        webView.loadUrl("https://leisure.onehowto.com/article/how-to-play-tic-tac-toe-in-7-easy-steps-461.html");
    }

    public void grievances(View v) {
        Intent gotothird = new Intent();
        gotothird.setClass(this, ThirdActivity.class);
        startActivity(gotothird);
    }
}
