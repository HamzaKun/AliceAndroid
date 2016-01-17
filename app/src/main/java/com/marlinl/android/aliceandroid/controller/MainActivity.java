package com.marlinl.android.aliceandroid.controller;

import android.app.Activity;
import android.os.Bundle;

import com.marlinl.android.aliceandroid.core.GPSServices;
import com.marlinl.android.aliceandroid.core.InvokerHttp;

/**
 * Created by MarlinL on 1/17/16.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GPSServices gpsServices = new GPSServices(this);
        InvokerHttp invokerHttp = new InvokerHttp();
        invokerHttp.sendHTTP();
    }
}
