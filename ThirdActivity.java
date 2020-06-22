package com.example.tiatactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent caller = getIntent();
    }

    public void sendmessage (View v) {
        String message = ((EditText)(findViewById(R.id.editText))).getText().toString();
        Uri destination = Uri.parse("smsto:9987263283");
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO, destination);
        smsIntent.putExtra("smsbody", message);
        startActivity(smsIntent);
    }
}
