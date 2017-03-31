package com.example.jamiepham.advisingapp;

// Modified by Yong Chen on 3/11/2017.

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
        final EditText etName = (EditText) findViewById(R.id.tvName);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etMajor = (EditText) findViewById(R.id.etMajor);
        final EditText etStartingYear = (EditText) findViewById(R.id.etStartingYear);
        final EditText etStatus = (EditText) findViewById(R.id.etStatus);
        final Button bRegister = (Button) findViewById(R.id.etRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String Username = etUsername.getText().toString();
                final String Password = etPassword.getText().toString();
                final String ConfirmPassword = etConfirmPassword.getText().toString();
                final String Name = etName.getText().toString();
                final String Email = etEmail.getText().toString();
                final String Major = etMajor.getText().toString();
                final int StartingYear = Integer.parseInt(etStartingYear.getText().toString());
                final String Status = etStatus.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                RegisterActivity.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Register Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(Username, Password, ConfirmPassword, Name, Email, Major, StartingYear, Status, responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });
    }
}