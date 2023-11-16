package com.example.parkingmanager.controller.activity.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.parkingmanager.R;
import com.example.parkingmanager.parkingManager;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

//import com.service.parking.theparker.R;
//import com.service.parking.theparker.Theparker;

//import at.markushi.ui.CircleButton;
//import butterknife.BindView;
//import butterknife.ButterKnife;

public class MobileVerifyActivity extends AppCompatActivity {
    Button mPhoneVerify_btn = findViewById(R.id.btn_phone_verify_next);
    EditText mPhoneNumber = findViewById(R.id.et_phone_number);
    ImageView mMobile_verify_back_btn = findViewById(R.id.mobile_verify_back_btn);
    EditText mPersonName = findViewById(R.id.et_name);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_verify);

        mPhoneVerify_btn.setOnClickListener(v -> {
            String Mobile_no = mPhoneNumber.getText().toString().trim();
            String PersonName = mPersonName.getText().toString().trim();

            if (!TextUtils.isEmpty(Mobile_no)) {

                if (Mobile_no.length() == 11 || !PersonName.isEmpty()) {
                    parkingManager.Mobile_no = Mobile_no;
                    parkingManager.Person_name = PersonName;

                    Intent otpintent = new Intent(MobileVerifyActivity.this, otpVerifyActivity.class);
                }
            }

        });
    }
}