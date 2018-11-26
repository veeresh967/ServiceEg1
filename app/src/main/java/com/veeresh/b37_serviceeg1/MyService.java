package com.veeresh.b37_serviceeg1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "created", Toast.LENGTH_SHORT).show();
    }
    @Override
    public int onStartCommand(Intent intent,  int flags, int startId) {
        Toast.makeText(this, "started", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "destroyed", Toast.LENGTH_SHORT).show();
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
