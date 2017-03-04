package com.bdg.telkom.tesbgservice2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by lacorp on 6/1/2016.
 */
public class MyService extends Service {
    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

//        for (int i = 0; i <5 ; i++) {
            // Let it continue running until it is stopped.
            Toast.makeText(this, "Service Started ", Toast.LENGTH_LONG).show();
//        }
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
}
