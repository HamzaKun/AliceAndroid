package com.marlinl.android.aliceandroid.core;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

/**
 * Created by MarlinL on 1/17/16.
 */
public class GPSServices {

    public GPSServices(Activity activity) {
        locationManager = (LocationManager) activity.getSystemService(Context.LOCATION_SERVICE);
        if (locationManager.isProviderEnabled(locationManager.NETWORK_PROVIDER)) {
            if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
        } else {
            Log.e(TAG, "gps has not found");
        }
    }



    public void testingGPS(){
        if (locationManager != null) {

        }
    }

    private LocationManager locationManager = null;
    private static final String TAG = "GPSServices";
    private double x = 0;
    private double y = 0;
}
