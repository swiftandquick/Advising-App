package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HUSDepartmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_husdepartment);

        Button advancetoHUSDepartmentActivity2 = (Button) findViewById(R.id.toNextHUS2);
        advancetoHUSDepartmentActivity2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HUSDepartmentActivity.this, HUSDepartmentActivity2.class);
                startActivity(intent);
            }
        });

        Button toDepartments = (Button) findViewById(R.id.returnToDepartments);
        toDepartments.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HUSDepartmentActivity.this, Departments.class);
                startActivity(intent);
            }
        });

    }
}