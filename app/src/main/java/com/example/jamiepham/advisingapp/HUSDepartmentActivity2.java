package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HUSDepartmentActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_husdepartment2);

        Button backtoHUSDepartmentActivity = (Button) findViewById(R.id.toPreviousHUS1);
        backtoHUSDepartmentActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HUSDepartmentActivity2.this, HUSDepartmentActivity.class);
                startActivity(intent);
            }
        });

        Button advancetoHUSDepartmentActivity3 = (Button) findViewById(R.id.toNextHUS3);
        advancetoHUSDepartmentActivity3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HUSDepartmentActivity2.this, HUSDepartmentActivity3.class);
                startActivity(intent);
            }
        });

        Button toDepartments = (Button) findViewById(R.id.returnToDepartments);
        toDepartments.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HUSDepartmentActivity2.this, Departments.class);
                startActivity(intent);
            }
        });

    }
}