package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserAreaActivity2 extends AppCompatActivity {
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_user_area2);
        super.onCreate(savedInstanceState);
        mHandler.postDelayed(new Runnable() {
            public void run() {
                doStuff();
            }
        }, 60000);
    }

    private void doStuff() {
        Intent intent = new Intent(UserAreaActivity2.this, LoginActivity.class);

        startActivity(intent);

        Button backtoUserActivity = (Button) findViewById(R.id.Previous);
        backtoUserActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAreaActivity2.this, UserAreaActivity.class);
                startActivity(intent);
            }
        });

        Button advancetoDepartments = (Button) findViewById(R.id.toDepartments);
        advancetoDepartments.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAreaActivity2.this, Departments.class);
                startActivity(intent);
            }
        });

        Button toLogout = (Button) findViewById(R.id.toQuit);
        toLogout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAreaActivity2.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
