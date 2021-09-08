package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videorecontroler extends AppCompatActivity {
    Button b1,b2;
    VideoView v1;
    MediaController m1;
    Uri u1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videorecontroler);
        b1=(Button)findViewById(R.id.button25);
        v1=(VideoView)findViewById(R.id.videoView);
        m1= new MediaController(this);
        b2=(Button)findViewById(R.id.button104);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Videorecontroler.this,Captureandmedia.class);
                startActivity(i);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(i1,0);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
        u1=data.getData();
        v1.setVideoURI(u1);
        v1.setMediaController(m1);
        m1.setAnchorView(v1);
        v1.start();
    }
}