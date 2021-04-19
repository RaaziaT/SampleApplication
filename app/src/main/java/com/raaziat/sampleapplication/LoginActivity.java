package com.raaziat.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.raaziat.sampleapplication.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements GotoSecondScreen {

    ActivityLoginBinding activityLoginBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);

//        activityLoginBinding.buttonSignup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });

        activityLoginBinding.setClickInterface(this);
        activityLoginBinding.setSetButtonText(getString(R.string.create_account));
        Toast.makeText(this, "Camera permission denied", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void openSecondScreen() {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}