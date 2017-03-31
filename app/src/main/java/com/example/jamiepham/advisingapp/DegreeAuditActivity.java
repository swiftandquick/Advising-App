package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DegreeAuditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree_audit);

        Button BackToUserActivity = (Button) findViewById(R.id.returnToDepartments);
        BackToUserActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DegreeAuditActivity.this, UserAreaActivity.class);
                startActivity(intent);
            }
        });
    }
}