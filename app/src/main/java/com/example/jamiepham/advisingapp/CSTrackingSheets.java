package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CSTrackingSheets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cstracking_sheets);

        Button backtoTrackingSheets = (Button) findViewById(R.id.toTrackingSheets);
        backtoTrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CSTrackingSheets.this, TrackingSheets.class);
                startActivity(intent);
            }
        });

        Button advancetoCSTrackingSheet20122013 = (Button) findViewById(R.id.toCSTrackingSheet20122013);
        advancetoCSTrackingSheet20122013.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CSTrackingSheets.this, CSTrackingSheet20122013.class);
                startActivity(intent);
            }
        });

        Button advancetoCSTrackingSheet20132014 = (Button) findViewById(R.id.toCSTrackingSheet20132014);
        advancetoCSTrackingSheet20132014.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CSTrackingSheets.this, CSTrackingSheet20132014.class);
                startActivity(intent);
            }
        });

        Button advancetoCSTrackingSheet20142015 = (Button) findViewById(R.id.toCSTrackingSheet20142015);
        advancetoCSTrackingSheet20142015.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CSTrackingSheets.this, CSTrackingSheet20142015.class);
                startActivity(intent);
            }
        });

        Button advancetoCSTrackingSheet20152016 = (Button) findViewById(R.id.toCSTrackingSheet20152016);
        advancetoCSTrackingSheet20152016.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CSTrackingSheets.this, CSTrackingSheet20152016.class);
                startActivity(intent);
            }
        });

        Button advancetoCSTrackingSheet20162017 = (Button) findViewById(R.id.toCSTrackingSheet20162017);
        advancetoCSTrackingSheet20162017.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CSTrackingSheets.this, CSTrackingSheet20162017.class);
                startActivity(intent);
            }
        });

    }
}
