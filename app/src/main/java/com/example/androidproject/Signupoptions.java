package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signupoptions extends AppCompatActivity {
    Button b1, b2, b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupoptions);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        b3=(Button)findViewById(R.id.button5);
        b4=(Button)findViewById(R.id.button121);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Signupoptions.this,MainActivity.class);
                startActivity(i1);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Signupoptions.this,Googlesignin.class);
                startActivity(i);
                finish();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent j = new Intent(Signupoptions.this,Emailsignin.class);
              startActivity(j);
              finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(Signupoptions.this,Otpsignin.class);
                startActivity(k);
                finish();
            }
        });

    }
}