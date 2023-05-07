package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageView imgbtn;
    LinearLayout obj;
    LinearLayout whatsapp;
    Intent intobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        imgbtn=(ImageView) findViewById(R.id.back);
        whatsapp=(LinearLayout)findViewById(R.id.what_app);
         obj=(LinearLayout)findViewById(R.id.what_app_usa);
        obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener();
            }
        });
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener();
            }
        });
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void listener()
    {
        Intent what = new Intent (Intent.ACTION_VIEW);
        String message ="Hello... How can i help you ??  ";
        String number = "tel:+923217865622";
        what.setData(Uri.parse("whatsapp://send?phone=" + number + "&text=" + message));
        startActivity(what);
    }
}