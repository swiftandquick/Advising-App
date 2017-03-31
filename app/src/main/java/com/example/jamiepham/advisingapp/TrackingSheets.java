package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrackingSheets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking_sheets);


        Button advancetoCSTrackingSheets = (Button) findViewById(R.id.toCSTrackingSheets);
        advancetoCSTrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrackingSheets.this, CSTrackingSheets.class);
                startActivity(intent);
            }
        });

        Button advancetoCNTrackingSheets = (Button) findViewById(R.id.toCNTrackingSheets);
        advancetoCNTrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrackingSheets.this, CNTrackingSheets.class);
                startActivity(intent);
            }
        });

        Button advancetoCISTrackingSheets = (Button) findViewById(R.id.toCISTrackingSheets);
        advancetoCISTrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrackingSheets.this, CISTrackingSheets.class);
                startActivity(intent);
            }
        });

        Button advancetoCETrackingSheets = (Button) findViewById(R.id.toCETrackingSheets);
        advancetoCETrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrackingSheets.this, CETrackingSheets.class);
                startActivity(intent);
            }
        });

        Button gobacktoUserAreaActivity = (Button) findViewById(R.id.returntoUserAreaActivity);
        gobacktoUserAreaActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrackingSheets.this, UserAreaActivity.class);
                startActivity(intent);
            }
        });

    }
}
