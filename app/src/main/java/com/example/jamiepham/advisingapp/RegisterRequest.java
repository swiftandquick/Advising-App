package com.example.jamiepham.advisingapp;

// Created by Yong Chen on 3/11.

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "https://advising-app.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String Username, String Password, String ConfirmPassword,
                           String Name, String Email,
                           String Major, int StartingYear,
                           String Status, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("Username", Username);
        params.put("Password", Password);
        params.put("ConfirmPassword", ConfirmPassword);
        params.put("Name", Name);
        params.put("Email", Email);
        params.put("Major", Major);
        params.put("StartingYear", StartingYear + "");
        params.put("Status", Status);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
