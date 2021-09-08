package com.example.androidproject;



import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.text.InputType;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ProgressBar;
        import android.widget.Toast;

        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.Task;
        import com.google.firebase.auth.AuthResult;
        import com.google.firebase.auth.FirebaseAuth;

public class Emailsignin  extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    FirebaseAuth firebaseAuth;
    ProgressBar p1;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emailsignin);
        e1=(EditText)findViewById(R.id.editText3);
        e2=(EditText)findViewById(R.id.editText4);
        e2.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        b1=(Button)findViewById(R.id.button12);
        b2=(Button)findViewById(R.id.button13);
        p1=(ProgressBar)findViewById(R.id.progressBar);
        firebaseAuth=FirebaseAuth.getInstance();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Emailsignin.this,Signupoptions.class);
                startActivity(i);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                if(s1.isEmpty())
                {
                    e1.setError("FILL EMAIL");
                    return;
                }
                else
                {
                    if(s2.isEmpty())
                    {
                        e2.setError("FILL PASSWORD");
                        return;
                    }
                }
                p1.setVisibility(View.VISIBLE);
                firebaseAuth.createUserWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @org.jetbrains.annotations.NotNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(Emailsignin.this, "DATABASE UPDATED", Toast.LENGTH_SHORT).show();
                            p1.setVisibility(View.INVISIBLE);
                            Intent j=new Intent(Emailsignin.this,MainActivity.class);
                            startActivity(j);
                            finish();
                        }
                        else {
                            Toast.makeText(Emailsignin.this, "NOT DONE", Toast.LENGTH_SHORT).show();
                            p1.setVisibility(View.INVISIBLE);
                            Intent k = new Intent(Emailsignin.this, MainActivity.class);
                            startActivity(k);
                            finish();
                        }
                    }
                });
            }
        });
    }
}