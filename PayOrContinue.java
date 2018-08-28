package com.example.android.movehack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PayOrContinue extends AppCompatActivity {
Button pay,atStation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_or_continue);
        pay = findViewById(R.id.Pay);
        atStation = findViewById(R.id.AtStation);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PayOrContinue.this,Paytm.class);
                startActivity(intent);
            }
        });

        atStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PayOrContinue.this,ThankYouSlot.class);
                startActivity(intent);
            }
        });
    }
}
