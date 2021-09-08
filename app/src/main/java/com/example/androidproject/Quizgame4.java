package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Quizgame4 extends AppCompatActivity {
    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizgame4);
        b1=(Button)findViewById(R.id.button134);
        r1=(RadioButton)findViewById(R.id.radioButton13);
        r2=(RadioButton)findViewById(R.id.radioButton14);
        r3=(RadioButton)findViewById(R.id.radioButton15);
        r4=(RadioButton)findViewById(R.id.radioButton16);
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

                Intent i= new Intent(Quizgame4.this,Quizgame5.class);
                startActivity(i);
                finish();
            }
        });

    }
}