package com.example.androidproject;


        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

        import com.hbb20.CountryCodePicker;

public class Otpsignin extends AppCompatActivity {
    EditText e1;
    Button b1,b2;
    CountryCodePicker ccp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpsignin);
        e1=(EditText)findViewById(R.id.editText990);
        ccp=(CountryCodePicker)findViewById(R.id.ccp);
        ccp.registerCarrierNumberEditText(e1);
        b1=(Button)findViewById(R.id.button14);
        b2=(Button)findViewById(R.id.button122);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Otpsignin.this,Signupoptions.class);
                startActivity(i1);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Otpsignin.this,Getotp.class);
                i.putExtra("mobile",ccp.getFullNumberWithPlus().trim());
                startActivity(i);
            }
        });
    }
}