package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Driven extends AppCompatActivity {


    Button btn;
    Intent intobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driven);
        btn=findViewById(R.id.activity2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intobj=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intobj);
                setContentView(R.layout.activity_main);
            }
        });

    }
}