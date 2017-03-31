package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HUSDepartmentActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_husdepartment3);

        Button backtoHUSDepartmentActivity2 = (Button) findViewById(R.id.toPreviousHUS2);
        backtoHUSDepartmentActivity2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HUSDepartmentActivity3.this, HUSDepartmentActivity2.class);
                startActivity(intent);
            }
        });

        Button toDepartments = (Button) findViewById(R.id.returnToDepartments);
        toDepartments.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HUSDepartmentActivity3.this, Departments.class);
                startActivity(intent);
            }
        });

    }
}