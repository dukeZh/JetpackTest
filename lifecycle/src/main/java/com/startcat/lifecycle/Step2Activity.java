package com.startcat.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Lifecycle 解藕
 */
public class Step2Activity extends AppCompatActivity {
    private MyChronometer chronometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        chronometer = findViewById(R.id.chronometer);
        getLifecycle().addObserver(chronometer);
    }
}