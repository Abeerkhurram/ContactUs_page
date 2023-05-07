package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imgbtn;
    LinearLayout obj;
    LinearLayout goodbooks;
    LinearLayout web_site;
    LinearLayout whatsapp;
    Intent intobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        imgbtn=(ImageView) findViewById(R.id.back);
        whatsapp=(LinearLayout)findViewById(R.id.what_app);
        goodbooks=(LinearLayout)findViewById(R.id.good_books);
        web_site=(LinearLayout)findViewById(R.id.web_site);
         obj=(LinearLayout)findViewById(R.id.what_app_usa);
        obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener();
            }
        });
        web_site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://github.com/Abeerkhurram/"));
                startActivity(intent);

            }
        });
        goodbooks.setOnClickListener(new View.OnClickListener() {
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
    private void listener()
    {
        boolean isAppInstalled = appInstalledOrNot("com.whatsapp");
        if(isAppInstalled) {
            Intent what = new Intent(Intent.ACTION_VIEW);
            String message = "";
            String number = "tel:+923217865622";
            what.setData(Uri.parse("whatsapp://send?phone=" + number + "&text=" + message));
            startActivity(what);
            }
        }
    private boolean appInstalledOrNot(String uri) {
        PackageManager pm = getPackageManager();
        try {
            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "WhatsApp Not installed", Toast.LENGTH_SHORT).show();
        }

        return false;
    }
}