package com.startcat.databinding3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.database.DatabaseUtils;
import android.os.Bundle;

import com.startcat.databinding3.databinding.ActivityMainBinding;

/**
 * @author duke_zh
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setNetworkImage("https://file02.16sucai.com/d/file/2014/0829/b871e1addf5f8e96f3b390ece2b2da0d.jpg");
       // activityMainBinding.setLocalImage(R.drawable.ic_launcher_background);
    }
}