package com.edu.pk.gulehri.meraallah.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;

import androidx.annotation.NonNull;

import static android.content.Context.AUDIO_SERVICE;
import static android.media.AudioManager.RINGER_MODE_NORMAL;
import static android.media.AudioManager.RINGER_MODE_SILENT;
import static android.media.AudioManager.RINGER_MODE_VIBRATE;

/**
 * Created by Shahid Iqbal on 6/10/2021
 */

public class RingerReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        setRinger(context);
    }

    private void setRinger(@NonNull Context context) {
        AudioManager audio = (AudioManager) context.getSystemService(AUDIO_SERVICE);

        if ((audio.getRingerMode() == RINGER_MODE_NORMAL) ||
                (audio.getRingerMode() == RINGER_MODE_VIBRATE)) {
            audio.setRingerMode(RINGER_MODE_SILENT);

        } else if (audio.getRingerMode() == RINGER_MODE_SILENT) {
            audio.setRingerMode(RINGER_MODE_NORMAL);
        }
    }
}
