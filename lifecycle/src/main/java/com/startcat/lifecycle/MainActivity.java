package com.startcat.lifecycle;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private long elapsedTime;
    private Chronometer chronometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = findViewById(R.id.chronometer);
    }

    @Override
    protected void onResume() {
        super.onResume();
        chronometer.setBase(SystemClock.elapsedRealtime() - elapsedTime);
        chronometer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        elapsedTime = SystemClock.elapsedRealtime() - chronometer.getBase();
        chronometer.stop();
    }
}