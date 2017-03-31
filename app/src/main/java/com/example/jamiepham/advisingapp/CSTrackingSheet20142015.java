package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CSTrackingSheet20142015 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cstracking_sheet20142015);

        Button backtoCSTrackingSheets = (Button) findViewById(R.id.toCSTrackingSheets);
        backtoCSTrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CSTrackingSheet20142015.this, CSTrackingSheets.class);
                startActivity(intent);
            }
        });

    }
}
