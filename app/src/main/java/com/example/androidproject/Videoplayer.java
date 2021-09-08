package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videoplayer extends AppCompatActivity {
    VideoView v1;
    MediaController m1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoplayer);
        v1=(VideoView)findViewById(R.id.videoView2);
        b1=(Button)findViewById(R.id.button29);
        m1=new MediaController(this);
        v1.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.ug);
        v1.setMediaController(m1);
        m1.setAnchorView(v1);
        v1.start();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Videoplayer.this,Captureandmedia.class);
                startActivity(i);
                finish();
            }
        });

    }
}