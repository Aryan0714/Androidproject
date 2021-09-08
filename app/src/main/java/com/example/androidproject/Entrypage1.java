package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Entrypage1 extends AppCompatActivity {
    Button b1,b2,b3, b5,b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrypage1);
        b1=(Button)findViewById(R.id.button6);
        b2=(Button)findViewById(R.id.button8);
        b3=(Button)findViewById(R.id.button9);
        b6=(Button)findViewById(R.id.button123);
        b7=(Button)findViewById(R.id.button124);
        b5=(Button)findViewById(R.id.button11);
       
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2= new Intent(Entrypage1.this,Database.class);
                startActivity(i2);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Entrypage1.this,Logoutgogglesigin.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Entrypage1.this,Services.class);
                startActivity(j);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(Entrypage1.this, Captureandmedia.class);
                startActivity(m);
                finish();

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(Entrypage1.this,  Webbrowsing.class);
                startActivity(p);
                finish();

            }
        });



    }
}