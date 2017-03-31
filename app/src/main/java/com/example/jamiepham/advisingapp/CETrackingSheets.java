package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CETrackingSheets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cetracking_sheets);

        Button backtoTrackingSheets = (Button) findViewById(R.id.toTrackingSheets);
        backtoTrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CETrackingSheets.this, TrackingSheets.class);
                startActivity(intent);
            }
        });

        Button advancetoCETrackingSheet20122013 = (Button) findViewById(R.id.toCETrackingSheet20122013);
        advancetoCETrackingSheet20122013.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CETrackingSheets.this, CETrackingSheet20122013.class);
                startActivity(intent);
            }
        });

        Button advancetoCETrackingSheet20132014 = (Button) findViewById(R.id.toCETrackingSheet20132014);
        advancetoCETrackingSheet20132014.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CETrackingSheets.this, CETrackingSheet20132014.class);
                startActivity(intent);
            }
        });

        Button advancetoCETrackingSheet20142015 = (Button) findViewById(R.id.toCETrackingSheet20142015);
        advancetoCETrackingSheet20142015.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CETrackingSheets.this, CETrackingSheet20142015.class);
                startActivity(intent);
            }
        });

        Button advancetoCETrackingSheet20152016 = (Button) findViewById(R.id.toCETrackingSheet20152016);
        advancetoCETrackingSheet20152016.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CETrackingSheets.this, CETrackingSheet20152016.class);
                startActivity(intent);
            }
        });

        Button advancetoCETrackingSheet20162017 = (Button) findViewById(R.id.toCETrackingSheet20162017);
        advancetoCETrackingSheet20162017.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CETrackingSheets.this, CETrackingSheet20162017.class);
                startActivity(intent);
            }
        });

    }
}
