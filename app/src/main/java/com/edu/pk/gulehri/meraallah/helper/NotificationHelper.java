package com.edu.pk.gulehri.meraallah.helper;

import static android.app.NotificationManager.IMPORTANCE_HIGH;
import static android.app.PendingIntent.FLAG_UPDATE_CURRENT;
import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.O;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.ui.HadithOfDay;

/**
 * Created by Shahid Iqbal on 6/10/2021
 */

public class NotificationHelper extends ContextWrapper {

    public static final String channelID = "Hadith421";
    public static final String channelName = "Hadith of the day";
    private NotificationManager manager;

    public NotificationHelper(Context base) {
        super(base);
        if (SDK_INT >= O) {
            createChannel();
        }
    }

    @RequiresApi(api = O)
    private void createChannel() {
        NotificationChannel channel = new NotificationChannel(channelID, channelName,
                IMPORTANCE_HIGH);
        getManager().createNotificationChannel(channel);
    }

    public NotificationManager getManager() {
        if (manager == null) {
            manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        }
        return manager;
    }

    public NotificationCompat.Builder getChannelNotification() {
        Intent intent = new Intent(this, HadithOfDay.class);
        @SuppressLint("UnspecifiedImmutableFlag") PendingIntent pendingIntent = PendingIntent.getActivity(this,
                78, intent, FLAG_UPDATE_CURRENT);
        return new NotificationCompat.Builder(getApplicationContext(), channelID)
                .setContentTitle("Hadith of the Day")
                .setContentText("Check today's hadith of our Holy Prophet(SAW)")
                .setSmallIcon(R.drawable.ic_notifications)
                .setAutoCancel(true)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setLights(Color.GREEN, 0, 0)
                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                .setContentIntent(pendingIntent);
    }
}
