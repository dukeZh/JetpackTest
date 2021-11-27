package com.startcat.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;

import com.startcat.databinding.databinding.ActivityMainBinding;

/**
 * @author duke_zh
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding viewDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Idol idol = new Idol("test",1);
        viewDataBinding.setIdol(idol);
        viewDataBinding.setEventHandle(new EventHandlerListener(this));
    }
}