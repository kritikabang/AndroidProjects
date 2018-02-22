package com.example.kritikabang.notify_kiki;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonClick(View view)
    {
        NotificationCompat.Builder  mgbuilder= new NotificationCompat.Builder(this);
        mgbuilder.setTicker("One new Message").setContentTitle("New Update").setContentText("Please Click to update").setWhen(System.currentTimeMillis()).setSmallIcon(R.drawable.icn);

        Intent intent = new Intent(MainActivity.this,HomePage.class);
        PendingIntent pen = PendingIntent.getActivity(this,0,intent,0);

        mgbuilder.setContentIntent(pen);
        int idn = 001;
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(idn,mgbuilder.build());
    }
}
