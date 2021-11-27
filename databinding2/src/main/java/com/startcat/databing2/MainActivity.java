package com.startcat.databing2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.startcat.databing2.databinding.ActivityMainBinding;


/**
 * @author duke_zh
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding viewDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Idol idol = new Idol("test2",1);
        viewDataBinding.setIdol(idol);

    }
}