package com.lecture3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BloodGroupActivity extends AppCompatActivity {
    Button btnAPositive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_group);

        setTitle("Required Blood Group?");
        btnAPositive = (Button) findViewById(R.id.btnAPositive);
        btnAPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BloodGroupActivity.this, FeaturedDonorsActivity.class);
                startActivity(i);
            }
        });
    }
}
