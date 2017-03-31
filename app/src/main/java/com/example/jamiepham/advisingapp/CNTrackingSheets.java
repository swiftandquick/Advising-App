package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CNTrackingSheets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cntracking_sheets);

        Button backtoTrackingSheets = (Button) findViewById(R.id.toTrackingSheets);
        backtoTrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CNTrackingSheets.this, TrackingSheets.class);
                startActivity(intent);
            }
        });

        Button advancetoCNTrackingSheet20122013 = (Button) findViewById(R.id.toCNTrackingSheet20122013);
        advancetoCNTrackingSheet20122013.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CNTrackingSheets.this, CNTrackingSheet20122013.class);
                startActivity(intent);
            }
        });

        Button advancetoCNTrackingSheet20132014 = (Button) findViewById(R.id.toCNTrackingSheet20132014);
        advancetoCNTrackingSheet20132014.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CNTrackingSheets.this, CNTrackingSheet20132014.class);
                startActivity(intent);
            }
        });

        Button advancetoCNTrackingSheet20142015 = (Button) findViewById(R.id.toCNTrackingSheet20142015);
        advancetoCNTrackingSheet20142015.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CNTrackingSheets.this, CNTrackingSheet20142015.class);
                startActivity(intent);
            }
        });

        Button advancetoCNTrackingSheet20152016 = (Button) findViewById(R.id.toCNTrackingSheet20152016);
        advancetoCNTrackingSheet20152016.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CNTrackingSheets.this, CNTrackingSheet20152016.class);
                startActivity(intent);
            }
        });

        Button advancetoCNTrackingSheet20162017 = (Button) findViewById(R.id.toCNTrackingSheet20162017);
        advancetoCNTrackingSheet20162017.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CNTrackingSheets.this, CNTrackingSheet20162017.class);
                startActivity(intent);
            }
        });

    }
}
