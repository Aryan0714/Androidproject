package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Wifi extends AppCompatActivity {
    WifiManager wm;
    ImageButton ib;
    Button b1;
    private boolean wifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
        ib=(ImageButton)findViewById(R.id.imageButton3);
        wm = (WifiManager)getSystemService(WIFI_SERVICE);
        b1=(Button)findViewById(R.id.button102) ;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Wifi.this,Services.class);
                startActivity(i1);
                finish();
            }
        });
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (wifi==false)
                {
                    wm.setWifiEnabled(true);
                    wifi=true;
                    ib.setImageResource(R.drawable.onn);

                }
                else
                {
                    wm.setWifiEnabled(false);
                    wifi = false;
                    ib.setImageResource(R.drawable.off);
                }
            }
        });

    }
}