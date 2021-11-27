package com.startcat.lifecycle;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * @author duke_zh
 */
public class MyLocationObserver implements LifecycleObserver {
    private Context mContext;
    private LocationManager locationManager;
    private LocationListener loactionListner;

    public MyLocationObserver(Context context) {
        this.mContext = context;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void startGetLocation() {
        locationManager = (LocationManager) mContext.getSystemService(Context.LOCATION_SERVICE);
        loactionListner = new MyLocationListener();
        if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 2000, 1, loactionListner);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void stopGetLocation(){
        locationManager.removeUpdates(loactionListner);
    }

    private static class MyLocationListener implements LocationListener {
        @Override
        public void onLocationChanged(@NonNull Location location) {
            Log.d("starCat",location.toString());
        }
    }
}
