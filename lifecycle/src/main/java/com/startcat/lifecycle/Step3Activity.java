package com.startcat.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * LifecycleService 解藕
 * @author duke_zh
 */
public class Step3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_three);
    }

    public void stopService(View view) {
        stopService(new Intent(this,MyLifecycleService.class));
    }

    public void startService(View view) {
        startService(new Intent(this,MyLifecycleService.class));
    }
}