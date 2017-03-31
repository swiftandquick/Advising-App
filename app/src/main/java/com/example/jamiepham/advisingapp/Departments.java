package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Departments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);

        Button advancetoUserActivity2 = (Button) findViewById(R.id.toUserAreaActivity2);
        advancetoUserActivity2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Departments.this, UserAreaActivity2.class);
                startActivity(intent);
            }
        });

        Button advancetoCSDepartment = (Button) findViewById(R.id.toCSDepartment);
        advancetoCSDepartment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Departments.this, CSDepartmentActivity.class);
                startActivity(intent);
            }
        });

        Button advancetoMathDepartment = (Button) findViewById(R.id.toMathDepartment);
        advancetoMathDepartment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Departments.this, MathDepartmentActivity.class);
                startActivity(intent);
            }
        });

        Button advancetoHUSDepartment = (Button) findViewById(R.id.toHUSDepartment);
        advancetoHUSDepartment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Departments.this, HUSDepartmentActivity.class);
                startActivity(intent);
            }
        });

    }
}
