package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MathDepartmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_department);

        Button advancetoMathDepartmentActivity2 = (Button) findViewById(R.id.toNextMath2);
        advancetoMathDepartmentActivity2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MathDepartmentActivity.this, MathDepartmentActivity2.class);
                startActivity(intent);
            }
        });

        Button toDepartments = (Button) findViewById(R.id.returnToDepartments);
        toDepartments.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MathDepartmentActivity.this, Departments.class);
                startActivity(intent);
            }
        });

    }
}