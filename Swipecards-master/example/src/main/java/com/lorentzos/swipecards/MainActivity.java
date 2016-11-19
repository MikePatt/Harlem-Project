package com.lorentzos.swipecards;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView tvScoreMate;
    ImageView ivLogo;

    private final int SPLASH_TIME =2000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(MainActivity.this, MainScreen.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        }, SPLASH_TIME);

        tvScoreMate = (TextView) findViewById(R.id.tvScoreMate);

        ivLogo = (ImageView) findViewById(R.id.ivLogo);
    }
}
