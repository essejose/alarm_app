package com.essejose.alarme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

/**
 * Created by essejose on 12/06/2017.
 */

public class AlarmeReceiver extends BroadcastReceiver {

    private  MediaPlayer mp = null;

    public AlarmeReceiver(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        mp = MediaPlayer.create(context, R.raw.para_com_isso);
        mp.start();
        Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show();

    }
}
