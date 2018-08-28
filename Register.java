package com.example.android.movehack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;
public class Register extends AppCompatActivity {
EditText e;
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e=findViewById(R.id.aadhar);
        b=findViewById(R.id.register);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = e.getText().toString();
                boolean result= Verhoeff.validateVerhoeff(s);
                String s2=String.valueOf(result);
                if(s2=="true")
                {
                    Toast.makeText(getApplicationContext(),"true",Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(getApplicationContext(),"Enter Valid Aadhar Number",Toast.LENGTH_LONG).show();
                }
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);

            }
        });
    }
}
