package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quizresult extends AppCompatActivity {
    Button b4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizresult);
        b4=(Button)findViewById(R.id.button136);
        t1=(TextView)findViewById(R.id.textView3);
        t1.setText("the result is"+Quizgame.score);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Quizresult.this,Quizgame.class);
                startActivity(i);
                finish();
            }
        });

    }
}