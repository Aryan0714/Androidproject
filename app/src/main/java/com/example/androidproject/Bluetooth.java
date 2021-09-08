package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Bluetooth extends AppCompatActivity {
    ImageButton i1;
    BluetoothAdapter ba;
    Button b1;
    private boolean bluetooth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        i1 = (ImageButton) findViewById(R.id.imageButton3);
        ba = BluetoothAdapter.getDefaultAdapter();
        b1=(Button)findViewById(R.id.button100);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Bluetooth.this,Services.class);
                startActivity(i1);
                finish();
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bluetooth == false) {
                    ba.enable();
                    bluetooth = true;
                    i1.setImageResource(R.drawable.onn);
                } else {
                    ba.disable();
                    bluetooth = false;
                    i1.setImageResource(R.drawable.off);

                }

            }
        });


    }
}