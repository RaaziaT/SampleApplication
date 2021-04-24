package com.raaziat.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.raaziat.sampleapplication.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
//    implements
//} GotoSecondScreen {

    ActivityLoginBinding activityLoginBinding;
    String[] strings = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        ImageViewAdapter imageViewAdapter = new ImageViewAdapter();
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
//        activityLoginBinding.buttonSignup.setLayoutManager(linearLayoutManager);
//        activityLoginBinding.buttonSignup.setAdapter(imageViewAdapter);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, strings);
        CustomAdapter customAdapter = new CustomAdapter(this);

        activityLoginBinding.listViewNumbers.setAdapter(customAdapter);

//        activityLoginBinding.buttonSignup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });

//        activityLoginBinding.setClickInterface(this);
//        activityLoginBinding.setSetButtonText(getString(R.string.create_account));
//        Toast.makeText(this, "Camera permission denied", Toast.LENGTH_SHORT).show();

    }

//    @Override
//    public void openSecondScreen() {
//        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//        startActivity(intent);
//    }
}