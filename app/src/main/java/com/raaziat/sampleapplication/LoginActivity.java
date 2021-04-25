package com.raaziat.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
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

        ImageViewAdapter imageViewAdapter = new ImageViewAdapter((String string) -> Toast.makeText(this, "Item clicked " + string, Toast.LENGTH_SHORT).show());
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        CustomAdapter customAdapter = new CustomAdapter(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);


        activityLoginBinding.buttonSignup.setLayoutManager(linearLayoutManager);
        activityLoginBinding.buttonSignup.setAdapter(imageViewAdapter);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, strings);
        // Specify the layout to use when the list of choices appears
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        activityLoginBinding.checkbox.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(LoginActivity.this, "Item isChecked " + (isChecked ? "true" : "false"), Toast.LENGTH_SHORT).show());

//        activityLoginBinding.spinnerCountry.setAdapter(arrayAdapter);..................0


//        activityLoginBinding.listViewNumbers.setAdapter(customAdapter);

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