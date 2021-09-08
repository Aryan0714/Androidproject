package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Torch extends AppCompatActivity {
    CameraManager cm;
    private boolean t;
    ImageButton ib;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch);
        ib=(ImageButton)findViewById(R.id.imageButton11);
        cm=(CameraManager)getSystemService(CAMERA_SERVICE);
        b1=(Button)findViewById(R.id.button101) ;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Torch.this,Services.class);
                startActivity(i1);
                finish();
            }
        });
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t==false)
                    {
                        try
                        {
                            String s1= cm.getCameraIdList()[0];
                            cm.setTorchMode(s1,true);
                            ib.setImageResource(R.drawable.onn);
                            t= true;

                        }
                        catch(CameraAccessException e)
                        {

                        }
                    }
                else
                {
                    try
                    {
                        String s2= cm.getCameraIdList()[0];
                        cm.setTorchMode(s2,false);
                        ib.setImageResource(R.drawable.off);
                        t= false;
                    }
                    catch (CameraAccessException e)
                    {

                    }
                }


            }
        });

    }
}