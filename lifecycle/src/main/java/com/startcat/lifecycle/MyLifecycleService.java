package com.startcat.lifecycle;


import android.util.Log;

import androidx.lifecycle.LifecycleService;

/**
 * @author duke_zh
 */
public class MyLifecycleService extends LifecycleService {
    public MyLifecycleService() {
        Log.d("starCat", "MyLifecycleService: ");
        MyLocationObserver myLocationObserver = new MyLocationObserver(this);
        getLifecycle().addObserver(myLocationObserver);
    }
}
