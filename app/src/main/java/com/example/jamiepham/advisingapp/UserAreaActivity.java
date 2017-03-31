package com.example.jamiepham.advisingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class UserAreaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String Major = intent.getStringExtra("Major");
        String Status = intent.getStringExtra("Status");
        int StartingYear  = intent.getIntExtra("StartingYear", -1);

        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMessasge);
        TextView tvStartingYear = (TextView) findViewById(R.id.tvStartingYear);
        TextView tvStatus = (TextView) findViewById(R.id.tvStatus);
        TextView tvMajor = (TextView) findViewById(R.id.tvMajor);


        // Display user details
        String message = "Welcome  " + Name;
        String message2 = "Status: " + Status;
        String message3 = "Year:   " + StartingYear;
        String message4 = "Major:  " + Major;

        tvWelcomeMsg.setText(message);
        tvStatus.setText(message2);
        tvMajor.setText(message3);
        tvStartingYear.setText(message4);


        Button advancetoUserActivity2 = (Button) findViewById(R.id.next);
        advancetoUserActivity2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAreaActivity.this, UserAreaActivity2.class);
                startActivity(intent);
            }
        });

        Button advancetoTrackingSheets = (Button) findViewById(R.id.toTrackingSheets);
        advancetoTrackingSheets.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAreaActivity.this, TrackingSheets.class);
                startActivity(intent);
            }
        });

        Button advancetoDegreeAudit = (Button) findViewById(R.id.toDegreeAudit);
        advancetoDegreeAudit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAreaActivity.this, DegreeAuditActivity.class);
                startActivity(intent);
            }
        });

        /* Take text mode off when StudyAbroadCoorindator page is built.
        Button advancetoStudyAbroadCoordinator = (Button) findViewById(R.id.toStudyAbroadCoordinator);
        advancetoStudyAbroadCoordinator.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAreaActivity.this, TrackSheetActivity.class);
                startActivity(intent);
            }
        });
        */

        Button advancetoFinancialAidAdvisor = (Button) findViewById(R.id.toFinancialAidAdvisor);
        advancetoFinancialAidAdvisor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAreaActivity.this, FinancialAidAdvisor.class);
                startActivity(intent);
            }
        });

        Button advancetoCoopAdvisor = (Button) findViewById(R.id.toCoopAdvisor);
        advancetoCoopAdvisor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAreaActivity.this, CoopAdvisors.class);
                startActivity(intent);
            }
        });

        /* Take text mode off when CommonQuestionActivity page is built.
        Button advancetoCommonQuestions = (Button) findViewById(R.id.toCommonQuestions);
        advancetoCommonQuestions.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAreaActivity.this, CommonQuestionActivity.class);
                startActivity(intent);
            }
        });
        */
        Button toCommonQuestions = (Button) findViewById(R.id.toCommonQuestions);
        toCommonQuestions.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAreaActivity.this, CommonQuestionActivity.class);
                startActivity(intent);
            }
        });

        Button toLogout = (Button) findViewById(R.id.toQuit);
        toLogout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserAreaActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}