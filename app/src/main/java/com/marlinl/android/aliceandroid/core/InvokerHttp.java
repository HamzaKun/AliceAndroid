package com.marlinl.android.aliceandroid.core;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by MarlinL on 1/18/16.
 */
public class InvokerHttp {

    public InvokerHttp(){

    }

    public void sendHTTP(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                InvokerHttp.invok("http://hk.marlinl.com");
            }
        }).start();
    }

    private static final String TAG = "INVOKER_HTTP";

    private static void invok(String httpUrl){
        URL url = null;
        try {
            url = new URL(httpUrl);
        } catch (MalformedURLException e) {
            Log.e(TAG,"url instance error");
            e.printStackTrace();
        }
        if (url != null){
            try {
                URLConnection urlConnection = (URLConnection)url.openConnection();
                urlConnection.connect();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                String line = "";
                if ((line = bufferedReader.readLine())!= null) {
                    Log.d(TAG,line);
                }
            } catch (IOException e) {
                Log.e(TAG,"connection error");
                e.printStackTrace();
            }
        }

    }
}
