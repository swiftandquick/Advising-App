package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CSDepartmentActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csdepartment2);

        Button backtoCSDepartmentActivity1 = (Button) findViewById(R.id.toPreviousCS1);
        backtoCSDepartmentActivity1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CSDepartmentActivity2.this, CSDepartmentActivity.class);
                startActivity(intent);
            }
        });

        Button toDepartments = (Button) findViewById(R.id.returnToDepartments);
        toDepartments.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CSDepartmentActivity2.this, Departments.class);
                startActivity(intent);
            }
        });
    }
}
