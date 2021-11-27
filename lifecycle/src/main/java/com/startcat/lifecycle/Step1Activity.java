package com.startcat.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

/**
 * Lifecycle 解藕
 */
public class Step1Activity extends AppCompatActivity {
    private MyChronometer chronometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);
        chronometer = findViewById(R.id.chronometer);
        getLifecycle().addObserver(chronometer);
    }
}