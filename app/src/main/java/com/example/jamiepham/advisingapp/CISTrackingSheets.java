package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CISTrackingSheets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cistracking_sheets);

        Button backtoTrackingSheets = (Button) findViewById(R.id.toTrackingSheets);
        backtoTrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CISTrackingSheets.this, TrackingSheets.class);
                startActivity(intent);
            }
        });

        Button advancetoCISTrackingSheet20132014 = (Button) findViewById(R.id.toCISTrackingSheet20132014);
        advancetoCISTrackingSheet20132014.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CISTrackingSheets.this, CISTrackingSheet20132014.class);
                startActivity(intent);
            }
        });

        Button advancetoCISTrackingSheet20142015 = (Button) findViewById(R.id.toCISTrackingSheet20142015);
        advancetoCISTrackingSheet20142015.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CISTrackingSheets.this, CISTrackingSheet20142015.class);
                startActivity(intent);
            }
        });

        Button advancetoCISTrackingSheet20152016 = (Button) findViewById(R.id.toCISTrackingSheet20152016);
        advancetoCISTrackingSheet20152016.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CISTrackingSheets.this, CISTrackingSheet20152016.class);
                startActivity(intent);
            }
        });

        Button advancetoCISTrackingSheet20162017 = (Button) findViewById(R.id.toCISTrackingSheet20162017);
        advancetoCISTrackingSheet20162017.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CISTrackingSheets.this, CISTrackingSheet20162017.class);
                startActivity(intent);
            }
        });

    }
}
