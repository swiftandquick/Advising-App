package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MathDepartmentActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_department2);

        Button backtoMathDepartmentActivity = (Button) findViewById(R.id.toPreviousMath1);
        backtoMathDepartmentActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MathDepartmentActivity2.this, MathDepartmentActivity.class);
                startActivity(intent);
            }
        });

        Button toDepartments = (Button) findViewById(R.id.returnToDepartments);
        toDepartments.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MathDepartmentActivity2.this, Departments.class);
                startActivity(intent);
            }
        });

    }
}