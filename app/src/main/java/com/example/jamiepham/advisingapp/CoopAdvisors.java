package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CoopAdvisors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coop_advisors);

        Button advancetoCSAdvisor = (Button) findViewById(R.id.CSAdvisorButton);
        advancetoCSAdvisor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CoopAdvisors.this, CSAdvisor.class);
                startActivity(intent);
            }
        });

        Button advancetoCNAdvisor = (Button) findViewById(R.id.CNAdvisorButton);
        advancetoCNAdvisor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CoopAdvisors.this, CNAdvisor.class);
                startActivity(intent);
            }
        });

        Button advancetoCISAdvisor = (Button) findViewById(R.id.CISAdvisorButton);
        advancetoCISAdvisor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CoopAdvisors.this, CISAdvisor.class);
                startActivity(intent);
            }
        });

        Button advancetoCEAdvisor = (Button) findViewById(R.id.CEAdvisorButton);
        advancetoCEAdvisor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CoopAdvisors.this, CEAdvisor.class);
                startActivity(intent);
            }
        });

        Button BackToUserActivity = (Button) findViewById(R.id.returnToDepartments);
        BackToUserActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CoopAdvisors.this, UserAreaActivity.class);
                startActivity(intent);
            }
        });
    }
}