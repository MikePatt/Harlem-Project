package com.lorentzos.swipecards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MultipleEvents extends AppCompatActivity implements View.OnClickListener{

    Button bFood,bEntertainment,bVolunteering;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_events);

        bFood = (Button) findViewById(R.id.bFood);
        bFood.setOnClickListener(this);

        bEntertainment = (Button) findViewById(R.id.bEntertainment);
        bEntertainment.setOnClickListener(this);

        bVolunteering = (Button) findViewById(R.id.bVolunteering);
        bVolunteering.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bVolunteering:

                startActivity( new Intent(MultipleEvents.this, Hackathon.class));


        }
    }
}
