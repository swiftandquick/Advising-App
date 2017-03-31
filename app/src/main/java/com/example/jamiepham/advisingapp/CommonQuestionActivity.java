package com.example.jamiepham.advisingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CommonQuestionActivity extends AppCompatActivity {

    private TextView mytxtvw;
    private Button myButton;
    private TextView mytxtvw2;
    private Button myButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_question);
        mytxtvw = (TextView) findViewById(R.id.myTextView);
        myButton = (Button) findViewById(R.id.mybtn);
        mytxtvw2 = (TextView) findViewById(R.id.myTextView2);
        myButton2 = (Button) findViewById(R.id.mybtn2);


        onBtnClick();
        onBtnClick2();

    }

    public void onBtnClick() {
        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mytxtvw.setVisibility((mytxtvw.getVisibility() == View.VISIBLE)
                        ? View.GONE : View.VISIBLE);

            }
        });
    }

    public void onBtnClick2() {
        myButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mytxtvw2.setVisibility((mytxtvw2.getVisibility() == View.VISIBLE)
                        ? View.GONE : View.VISIBLE);
            }
        });
    }
}