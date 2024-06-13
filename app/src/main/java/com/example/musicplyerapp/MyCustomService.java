package com.example.musicplyerapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class MyCustomService extends Service {

    //    Mediaplayer
    private MediaPlayer player;


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
//        THIS WILL PLAY THE AUDIO OF DEFAULT RINGTONE IN THE DEVICE
        player = MediaPlayer.create(
                this,
                Settings.System.DEFAULT_RINGTONE_URI
        );
//        PLAY THE AUDIO ON LOOP
        player.setLooping(true);
        player.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        player.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
