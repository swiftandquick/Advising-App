package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinancialAidAdvisor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_aid_advisor);

        Button BackToUserActivity = (Button) findViewById(R.id.BackToUserActivity);
        BackToUserActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinancialAidAdvisor.this, UserAreaActivity.class);
                startActivity(intent);
            }
        });
    }
}
