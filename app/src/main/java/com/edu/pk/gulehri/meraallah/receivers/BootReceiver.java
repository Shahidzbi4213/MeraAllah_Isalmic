package com.edu.pk.gulehri.meraallah.receivers;

import static android.app.AlarmManager.RTC_WAKEUP;
import static android.app.PendingIntent.getBroadcast;
import static android.content.Context.ALARM_SERVICE;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.DELAY;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.NormalTime;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.Calendar;


public class BootReceiver extends BroadcastReceiver {

    private Context mContext;

    @Override
    public void onReceive(Context context, @NonNull Intent intent) {

        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            mContext = context;
            for (int i = 0; i < 6; i++) {
                SharedPreferences sharedPref = mContext.getSharedPreferences(String.valueOf(i), Context.MODE_PRIVATE);
                int hr = sharedPref.getInt("hr", 0);
                int min = sharedPref.getInt("min", 0);

                setAlarm(hr, min, i);
                Toast.makeText(context, "Boot Completed", Toast.LENGTH_LONG).show();
            }

            setNotificationAlarm();
        }
    }

    private void setNotificationAlarm() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 9);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        Intent intent = new Intent(mContext, NotificationReceiver.class);
        @SuppressLint("UnspecifiedImmutableFlag")
        PendingIntent pendingIntent = PendingIntent.getBroadcast(mContext, 42, intent, 0);
        AlarmManager manager = (AlarmManager) mContext.getSystemService(ALARM_SERVICE);

        if (calendar.before(Calendar.getInstance())) {
            calendar.add(Calendar.DATE, 1);
        }
        manager.setRepeating(RTC_WAKEUP, calendar.getTimeInMillis(), DELAY, pendingIntent);
    }


    private void setAlarm(int hr, int min, int id) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, hr);
        c.set(Calendar.MINUTE, min);
        c.set(Calendar.SECOND, 0);
        startAlarm(c, id);
    }

    private void startAlarm(@NonNull Calendar c, int id) {
        AlarmManager manager = (AlarmManager) mContext.getSystemService(ALARM_SERVICE);
        Intent intent = new Intent(mContext, RingerReceiver.class);
        PendingIntent piFirst = getBroadcast(mContext, id, intent, 0);
        PendingIntent piSecond = getBroadcast(mContext, id + 200, intent, 0);

        if (c.before(Calendar.getInstance())) {
            c.add(Calendar.DATE, 1);
        }
        manager.setRepeating(RTC_WAKEUP, c.getTimeInMillis(), DELAY, piFirst);
        manager.setRepeating(RTC_WAKEUP, c.getTimeInMillis() + NormalTime, DELAY, piSecond);


    }

}

