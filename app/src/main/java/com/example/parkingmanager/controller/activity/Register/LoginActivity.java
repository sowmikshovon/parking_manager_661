package com.example.parkingmanager.controller.activity.Register;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.parkingmanager.R;

import android.util.Pair;
import android.widget.Button;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    Button mLogin_btn = findViewById(R.id.btn_sign_up);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mLogin_btn.setOnClickListener(v -> {
            Intent toMobileVerifyActivity = new Intent(LoginActivity.this, MobileVerifyActivity.class);
//            Pair pair = new Pair<View, String>(mLogin_btn, "loginTransition");
//            ActivityOptions options =
            startActivity(toMobileVerifyActivity);
        });
    }
}