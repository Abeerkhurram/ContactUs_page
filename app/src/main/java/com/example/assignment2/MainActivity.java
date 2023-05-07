package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgbtn;
    Intent intobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        imgbtn=(ImageView) findViewById(R.id.back);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intobj=new Intent(getApplicationContext(),Driven.class);
                startActivity(intobj);
                setContentView(R.layout.activity_driven);
            }
        });
    }
}