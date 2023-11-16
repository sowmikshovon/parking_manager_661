package com.example.parkingmanager;

import android.app.Application;
import android.content.Intent;

import com.example.parkingmanager.controller.activity.Register.LoginActivity;
import com.google.firebase.auth.FirebaseAuth;

public class parkingManager extends Application {
    public static String Mobile_no;
    public  static String Person_name;

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        if (firebaseAuth.getCurrentUser() == null){
            Intent LoginIntent = new Intent(this, LoginActivity.class);
            LoginIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(LoginIntent);
        }
        else {
            String uid = firebaseAuth.getCurrentUser().getUid();

        }
    }
}


