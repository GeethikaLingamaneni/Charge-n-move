package com.example.android.movehack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StationDetails extends AppCompatActivity {
Button prebook;
Button cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_details);
        prebook = findViewById(R.id.Prebook);
        prebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StationDetails.this,PayOrContinue.class);
                startActivity(intent);
            }
        });
        cont = findViewById(R.id.Continue);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StationDetails.this,ThankYou.class);
                startActivity(intent);
            }
        });
    }
}
