package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Captureandmedia extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captureandmedia);
        b1=(Button)findViewById(R.id.button19);
        b2=(Button)findViewById(R.id.button20);
        b3=(Button)findViewById(R.id.button21);
        b4=(Button)findViewById(R.id.button22);
        b5=(Button)findViewById(R.id.button23);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Captureandmedia.this, Camera.class);
                startActivity(i);
                finish();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Captureandmedia.this, Videorecontroler.class);
                startActivity(j);
                finish();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Captureandmedia.this, Mediaplayer.class);
                startActivity(i1);
                finish();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Captureandmedia.this, Videoplayer.class);
                startActivity(i2);
                finish();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(Captureandmedia.this, Entrypage1.class);
                startActivity(i3);
                finish();

            }
        });

    }
}