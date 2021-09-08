package com.example.androidproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.jetbrains.annotations.NotNull;

public class Logoutgogglesigin extends AppCompatActivity {
    ImageView i1;
    TextView t1;
    Button b1;
    FirebaseAuth firebaseAuth;
    GoogleSignInClient googleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logoutgogglesigin);
        i1=(ImageView)findViewById(R.id.imageView);
        t1=(TextView)findViewById(R.id.textView);
        b1=(Button)findViewById(R.id.button7);
        firebaseAuth =FirebaseAuth.getInstance();
        googleSignInClient = GoogleSignIn.getClient(Logoutgogglesigin.this, GoogleSignInOptions.DEFAULT_SIGN_IN);
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if(firebaseUser!=null)
        {
            Glide.with(Logoutgogglesigin.this).load(firebaseUser.getPhotoUrl()).into(i1);
            t1.setText(firebaseUser.getDisplayName());
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                googleSignInClient.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<Void> task) {
                        if(task.isSuccessful())
                        {
                            firebaseAuth.signOut();
                            Toast.makeText(Logoutgogglesigin.this, "sign out", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }
                });
            }
        });


    }
}