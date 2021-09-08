package com.example.androidproject;




import androidx.appcompat.app.AppCompatActivity;

        import android.Manifest;
        import android.content.Intent;
        import android.content.pm.PackageManager;
        import android.os.Build;
        import android.os.Bundle;
        import android.os.Trace;
        import android.telephony.SmsManager;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class Message extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        e1=(EditText)findViewById(R.id.editText60);
        e2=(EditText)findViewById(R.id.editText61);
        b1=(Button) findViewById(R.id.button56);
        b2=(Button) findViewById(R.id.button87);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(Message.this,Services.class);
                startActivity(u);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
                    if(checkSelfPermission(Manifest.permission.SEND_SMS)==PackageManager.PERMISSION_GRANTED){
                        MyMessage();
                    }
                    else{
                        requestPermissions(new String[]{Manifest.permission.SEND_SMS},1);
                    }
                }
            }
        });
    }
    private void MyMessage(){
        String phoneNumber=e1.getText().toString().trim();
        String Message=e2.getText().toString().trim();
        try{
            SmsManager smsManager=SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNumber,null,Message,null,null);
            Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show();
        }catch(Exception e){
            e.printStackTrace();
            Toast.makeText(this, "Faild to Send Message", Toast.LENGTH_SHORT).show();

        }

    }
}