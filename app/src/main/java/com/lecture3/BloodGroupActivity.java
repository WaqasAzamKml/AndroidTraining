package com.lecture3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BloodGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_group);

        setTitle("Required Blood Group?");
    }
}
