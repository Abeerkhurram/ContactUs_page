package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Driven extends AppCompatActivity {


    Button btn;
    Button btngit;
    Intent intobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driven);
        btn=findViewById(R.id.activity2);
        btngit=findViewById(R.id.git);
        btngit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://github.com/Abeerkhurram/ContactUs_page"));

                startActivity(intent);
            }
        });
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