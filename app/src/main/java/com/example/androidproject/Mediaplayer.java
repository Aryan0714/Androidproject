package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mediaplayer extends AppCompatActivity {
    Button b1, b2,b3;
    MediaPlayer m1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediaplayer);
        b1=(Button)findViewById(R.id.button26);
        b2=(Button)findViewById(R.id.button27);
        m1= MediaPlayer.create(this,R.raw.fa);
        b3=(Button)findViewById(R.id.button103);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Mediaplayer.this,Captureandmedia.class);
                startActivity(i1);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.pause();
            }
        });


    }
}