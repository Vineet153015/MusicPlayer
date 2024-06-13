package com.example.musicplyerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt;
        Button startbtn, stopbtn;


            startbtn = findViewById(R.id.start_btn);
            stopbtn = findViewById(R.id.stop_btn);
            txt = findViewById(R.id.textView);

            startbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent serviceIntent = new Intent(getApplicationContext(), MyCustomService.class);
                    startService(serviceIntent);
                }
            });

            stopbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent serviceIntent = new Intent(getApplicationContext(), MyCustomService.class);
                    startService(serviceIntent);
                }
            });
        }
    }
}