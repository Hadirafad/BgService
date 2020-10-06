package com.example.bgservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStart,buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart=(Button)findViewById(R.id.buttonStart);
        buttonStop=(Button)findViewById(R.id.buttonStop);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == buttonStart) {
            //start the service here

            startService(new Intent(this, MyService.class));

        } else if (v == buttonStop) {
            //stop the service here

            stopService(new Intent(this, MyService.class));

        }

    }
}
