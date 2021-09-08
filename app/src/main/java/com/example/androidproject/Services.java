package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Services extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        b1=(Button)findViewById(R.id.button17);
        b2=(Button)findViewById(R.id.button18);
        b3=(Button)findViewById(R.id.button16);
        b4=(Button)findViewById(R.id.button50);
        b5=(Button)findViewById(R.id.button51);
        b6=(Button)findViewById(R.id.button125);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Services.this,Entrypage1.class);
                startActivity(i1);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Services.this , Bluetooth.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j= new Intent(Services.this ,Wifi.class);
                startActivity(j);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k= new Intent(Services.this,Torch.class);
                startActivity(k);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k1= new Intent(Services.this,Call.class);
                startActivity(k1);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k2= new Intent(Services.this,Message.class);
                startActivity(k2);
                finish();
            }
        });
      







    }
}