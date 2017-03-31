package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CSTrackingSheet20132014 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cstracking_sheet20132014);

        Button backtoCSTrackingSheets = (Button) findViewById(R.id.toCSTrackingSheets);
        backtoCSTrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CSTrackingSheet20132014.this, CSTrackingSheets.class);
                startActivity(intent);
            }
        });

    }
}
