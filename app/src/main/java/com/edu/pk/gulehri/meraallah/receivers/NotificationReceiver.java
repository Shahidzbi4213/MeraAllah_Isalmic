package com.edu.pk.gulehri.meraallah.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;

import com.edu.pk.gulehri.meraallah.helper.NotificationHelper;

/**
 * Created by Shahid Iqbal on 6/10/2021
 */

public class NotificationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationHelper notificationHelper = new NotificationHelper(context);
        NotificationCompat.Builder builder = notificationHelper.getChannelNotification();
        notificationHelper.getManager().notify(42, builder.build());
    }
}
