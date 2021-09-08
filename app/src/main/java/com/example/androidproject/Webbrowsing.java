package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Webbrowsing extends AppCompatActivity {
    WebView w1;
    Button b1,b2;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webbrowsing);
        w1=(WebView)findViewById(R.id.webView);
        b1=(Button)findViewById(R.id.button28);
        e1=(EditText)findViewById(R.id.editText88);
        b2=(Button)findViewById(R.id.button129);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Webbrowsing.this,Entrypage1.class);
                startActivity(i1);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= e1.getText().toString().trim();
                w1.loadUrl(s1);
            }
        });
    }
}