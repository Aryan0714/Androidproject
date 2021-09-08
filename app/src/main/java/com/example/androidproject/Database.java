package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Database extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b1,b2,b3;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        e1=(EditText)findViewById(R.id.editText501);
        e2=(EditText)findViewById(R.id.editText502);
        e3=(EditText)findViewById(R.id.editText503);
        e4=(EditText)findViewById(R.id.editText504);
        b1=(Button)findViewById(R.id.button444);
        b2=(Button)findViewById(R.id.button333);
        b3=(Button)findViewById(R.id.button555);
        firebaseDatabase = FirebaseDatabase.getInstance();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Database.this,Quizgame.class);
                startActivity(i1);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Database.this,Entrypage1.class);
                startActivity(i2);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference = firebaseDatabase.getReference("users");
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();
                String s3= e3.getText().toString();
                String s4= e4.getText().toString();
                if(s4.length()!= 10)
                {
                    Toast.makeText(Database.this, "Enetr your valid number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    users users =new users(s1,s2,s3,s4);
                    databaseReference.child(s4).setValue(users);
                    Toast.makeText(Database.this, "Datasbe saved", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}