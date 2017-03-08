package com.lecture3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SignupActivity extends AppCompatActivity {

    Spinner spnGender, spnBloodGroup;
    String[] genderArray = {"Male", "Female", "Other"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        spnGender = (Spinner) findViewById(R.id.spnGender);
        spnBloodGroup = (Spinner) findViewById(R.id.spnBloodGroup);

        ArrayAdapter<String> genderAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, genderArray);
        spnGender.setAdapter(genderAdapter);

    }
}
