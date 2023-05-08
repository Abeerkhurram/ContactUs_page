package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

    Button sent;
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
         sent=(Button)findViewById(R.id.send);

         sent.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String to="abeerkhurram123@gmail.com";
                 EditText edt1=(EditText) findViewById(R.id.editTextTextPersonName3);
                 EditText edt2=(EditText) findViewById(R.id.editTextTextPersonName4);
                 Intent email = new Intent(Intent.ACTION_SEND);
                    String subject=edt1.getText().toString();
                    String message=edt2.getText().toString();
                 email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                 email.putExtra(Intent.EXTRA_SUBJECT, subject);
                 email.putExtra(Intent.EXTRA_TEXT, message);
                 email.setType("message/rfc822");
                 startActivity(email);

             }
         });
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
                Intent bk=new Intent(getApplicationContext(),Driven.class);
                startActivity(bk);

                setContentView(R.layout.activity_driven);
            }
        });
    }
    private void listener()
    {


            Intent what = new Intent(Intent.ACTION_VIEW);
            String message = "";
            String number = "tel:+923217865622";
            what.setData(Uri.parse("whatsapp://send?phone=" + number + "&text=" + message));
            startActivity(what);

        }

}