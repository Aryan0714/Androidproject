package com.example.androidproject;


import androidx.appcompat.app.AppCompatActivity;
        import androidx.core.app.ActivityCompat;

        import android.Manifest;
        import android.content.Intent;
        import android.content.pm.PackageManager;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageButton;
        import android.widget.Toast;

public class Call extends AppCompatActivity {
    EditText e1;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        e1=(EditText)findViewById(R.id.editText99);
        b1=(Button)findViewById(R.id.button57);
        b2=(Button)findViewById(R.id.button88);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(Call.this,Services.class);
                startActivity(k);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall=new Intent(Intent.ACTION_CALL);
                String number=e1.getText().toString();

                if(number.trim().isEmpty()){
                    Toast.makeText(Call.this, "Please Enter Your Number", Toast.LENGTH_SHORT).show();
                }
                else{
                    intentCall.setData(Uri.parse("tel:"+number));
                }
                if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(Call.this, "Please Grant Permission", Toast.LENGTH_SHORT).show();
                    requestforPermission();
                }
                else{
                    startActivity(intentCall);
                }
            }
        });


    }
    private void requestforPermission(){
        ActivityCompat.requestPermissions(Call.this,new String[]{Manifest.permission.CALL_PHONE},1);


    }
}