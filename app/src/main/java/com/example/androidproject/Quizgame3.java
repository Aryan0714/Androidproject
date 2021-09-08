package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Quizgame3 extends AppCompatActivity {
    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizgame3);
        b1=(Button)findViewById(R.id.button133);
        r1=(RadioButton)findViewById(R.id.radioButton9);
        r2=(RadioButton)findViewById(R.id.radioButton10);
        r3=(RadioButton)findViewById(R.id.radioButton11);
        r4=(RadioButton)findViewById(R.id.radioButton12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r2.isChecked())
                {
                    ++Quizgame.score;
                }
                else
                {
                    --Quizgame.score;
                }

                Intent i= new Intent(Quizgame3.this,Quizgame4.class);
                startActivity(i);
                finish();
            }
        });

    }
}