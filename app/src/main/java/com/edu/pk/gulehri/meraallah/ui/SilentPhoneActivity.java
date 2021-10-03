package com.edu.pk.gulehri.meraallah.ui;

import static android.app.AlarmManager.RTC_WAKEUP;
import static android.app.PendingIntent.FLAG_UPDATE_CURRENT;
import static android.app.PendingIntent.getBroadcast;
import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.M;
import static android.provider.Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS;
import static com.daimajia.androidanimations.library.Techniques.ZoomIn;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.ANIMATION_DURATION_FOR_SILENT_PHONE;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.ASR_TIME;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.DELAY;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.FAJAR_TIME;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.ISHA_TIME;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.JUMMAH_TIME;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.MAGHRIB_TIME;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.NormalTime;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.TAG;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.ZUHUR_TIME;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.daimajia.androidanimations.library.YoYo;
import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.ActivitySilentPhoneBinding;
import com.edu.pk.gulehri.meraallah.databinding.SilentPhoneInfoDialogBinding;
import com.edu.pk.gulehri.meraallah.fragments.FragmentTimePicker;
import com.edu.pk.gulehri.meraallah.receivers.RingerReceiver;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Objects;

public class SilentPhoneActivity extends AppCompatActivity
        implements TimePickerDialog.OnTimeSetListener, View.OnClickListener {


    /**
     * Vars
     */
    private ActivitySilentPhoneBinding binding;
    private SharedPreferences sp;
    private SharedPreferences.Editor edit;
    private int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySilentPhoneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setToolbar();
        setAnimations();
        setListeners();
        askPermission();

    }

    /*Setting Up Toolbar*/
    private void setToolbar() {
        setSupportActionBar(binding.toolbarIncludeSilent.mToolbar);
        binding.toolbarIncludeSilent.toolbarText.setText(R.string.silent_phone);
        binding.toolbarIncludeSilent.toolbarImageFirst.setImageResource(R.drawable.reset);
        binding.toolbarIncludeSilent.toolbarImageSecond.setImageResource(R.drawable.ic_info);
        binding.toolbarIncludeSilent.mToolbar.setElevation(0);


        try {
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT,
                    Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeSilent.toolbarText.setLayoutParams(params);
            final Drawable drawable = ContextCompat.getDrawable(this, R.drawable.back_arrow);
            Objects.requireNonNull(getSupportActionBar()).setHomeAsUpIndicator(drawable);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*Permission that Required*/
    @SuppressLint("BatteryLife")
    private void askPermission() {
        //Do Not Disturb Permission
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (SDK_INT >= M && !notificationManager.isNotificationPolicyAccessGranted()) {
            startActivity(new Intent(android.provider.Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS));
        }
    }

    /*Setting up Animation to Text Fields*/
    private void setAnimations() {
        YoYo.with(ZoomIn).duration(ANIMATION_DURATION_FOR_SILENT_PHONE).playOn(binding.fajarLayout);
        YoYo.with(ZoomIn).duration(ANIMATION_DURATION_FOR_SILENT_PHONE).playOn(binding.zuhurLayout);
        YoYo.with(ZoomIn).duration(ANIMATION_DURATION_FOR_SILENT_PHONE).playOn(binding.asrLayout);
        YoYo.with(ZoomIn).duration(ANIMATION_DURATION_FOR_SILENT_PHONE).playOn(binding.maghribLayout);
        YoYo.with(ZoomIn).duration(ANIMATION_DURATION_FOR_SILENT_PHONE).playOn(binding.ishaLayout);
        YoYo.with(ZoomIn).duration(ANIMATION_DURATION_FOR_SILENT_PHONE).playOn(binding.jummahLayout);
    }

    /*Set onClick to Fields*/
    private void setListeners() {
        binding.clockFajar.setOnClickListener(this);
        binding.clockZuhur.setOnClickListener(this);
        binding.clockAsr.setOnClickListener(this);
        binding.clockMaghrib.setOnClickListener(this);
        binding.clockIsha.setOnClickListener(this);
        binding.clockJummah.setOnClickListener(this);

        binding.resetFajar.setOnClickListener(this);
        binding.resetZuhur.setOnClickListener(this);
        binding.resetAsr.setOnClickListener(this);
        binding.resetMaghrib.setOnClickListener(this);
        binding.resetIsha.setOnClickListener(this);
        binding.resetJummah.setOnClickListener(this);

        binding.toolbarIncludeSilent.toolbarImageFirst.setOnClickListener(this);
        binding.toolbarIncludeSilent.toolbarImageSecond.setOnClickListener(this);

    }

    /*Showing Time Picker Dialog */
    private void getTimeDialog() {
        FragmentTimePicker timePicker = new FragmentTimePicker();
        timePicker.show(getSupportFragmentManager(), TAG);
    }

    /*Setting Click Events*/
    @Override
    public void onClick(View v) {
        batteryPermission();
        if (v.getId() == R.id.clock_fajar) {
            id = 0;
            getTimeDialog();
        } else if (v.getId() == R.id.clock_zuhur) {
            id = 1;
            getTimeDialog();
        } else if (v.getId() == R.id.clock_asr) {
            id = 2;
            getTimeDialog();
        } else if (v.getId() == R.id.clock_maghrib) {
            id = 3;
            getTimeDialog();
        } else if (v.getId() == R.id.clock_isha) {
            id = 4;
            getTimeDialog();
        } else if (v.getId() == R.id.clock_jummah) {
            id = 5;
            getTimeDialog();
        } else if (v.getId() == R.id.toolbarImageFirst) {
            cancelAllAlarms();
            resetTimeFields();
            setSharedPrefs();
            Toast.makeText(this, "All Alarms are Cancelled", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.reset_fajar) {
            id = 0;
            cancelSingleAlarm(id);
            binding.timeFajar.setText("");
        } else if (v.getId() == R.id.reset_zuhur) {
            id = 1;
            cancelSingleAlarm(id);
            binding.timeZuhur.setText("");
        } else if (v.getId() == R.id.reset_asr) {
            id = 2;
            cancelSingleAlarm(id);
            binding.timeAsr.setText("");
        } else if (v.getId() == R.id.reset_maghrib) {
            id = 3;
            cancelSingleAlarm(id);
            binding.timeMaghrib.setText("");
        } else if (v.getId() == R.id.reset_isha) {
            id = 4;
            cancelSingleAlarm(id);
            binding.timeIsha.setText("");
        } else if (v.getId() == R.id.reset_jummah) {
            id = 5;
            cancelSingleAlarm(id);
            binding.timeJummah.setText("");
        } else if (v.getId() == R.id.toolbarImageSecond) {

            SilentPhoneInfoDialogBinding dialogBinding = SilentPhoneInfoDialogBinding.inflate(LayoutInflater.from(this));
            AlertDialog builder = new AlertDialog.Builder(this).setView(dialogBinding.getRoot())
                    .setCancelable(false).create();

            builder.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            builder.getWindow().setWindowAnimations(R.style.DialogAnimation);

            dialogBinding.btnGone.setOnClickListener(v2 -> builder.dismiss());
            builder.show();
        }
    }

    /*Setting Times*/
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);


        updateFields(calendar, id);
        setSharedPrefs();
        setAlarms(calendar);

        //Saving Alarms
        SharedPreferences sharedPref = this.getSharedPreferences(String.valueOf(id), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("hr", hourOfDay);
        editor.putInt("min", minute);
        editor.apply();


    }

    /*Showing time tin Text Fields*/
    private void updateFields(Calendar calendar, int id) {
        String timeText = DateFormat.getTimeInstance(DateFormat.SHORT).format(calendar.getTime());
        switch (id) {
            case 0:
                binding.timeFajar.setText(timeText);
                break;
            case 1:
                binding.timeZuhur.setText(timeText);
                break;
            case 2:
                binding.timeAsr.setText(timeText);
                break;
            case 3:
                binding.timeMaghrib.setText(timeText);
                break;
            case 4:
                binding.timeIsha.setText(timeText);
                break;
            case 5:
                binding.timeJummah.setText(timeText);
                break;
        }
    }

    /*Setting Alarms*/
    public void setAlarms(Calendar c) {
        AlarmManager manager = (AlarmManager) this.getSystemService(ALARM_SERVICE);
        Intent intent = new Intent(this, RingerReceiver.class);
        PendingIntent piFirst = getBroadcast(this, id, intent, 0);
        PendingIntent piSecond = getBroadcast(this, id + 100, intent, 0);

        if (c.before(Calendar.getInstance())) {
            c.add(Calendar.DATE, 1);
        }
        manager.setRepeating(RTC_WAKEUP, c.getTimeInMillis(), DELAY, piFirst);
        manager.setRepeating(RTC_WAKEUP, c.getTimeInMillis() + NormalTime, DELAY, piSecond);
    }

    /*Saving Time value from Text Fields*/
    private void setSharedPrefs() {
        sp = getPreferences(MODE_PRIVATE);
        edit = sp.edit();
        edit.putString(FAJAR_TIME, binding.timeFajar.getText().toString());
        edit.putString(ZUHUR_TIME, binding.timeZuhur.getText().toString());
        edit.putString(ASR_TIME, binding.timeAsr.getText().toString());
        edit.putString(MAGHRIB_TIME, binding.timeMaghrib.getText().toString());
        edit.putString(ISHA_TIME, binding.timeIsha.getText().toString());
        edit.putString(JUMMAH_TIME, binding.timeJummah.getText().toString());

        edit.apply();
        edit.commit();


    }

    /*Getting Save Time Value and Assign back to
     * Text Fields on Activity Recreation*/
    private void getSharedPrefs() {
        sp = getPreferences(MODE_PRIVATE);
        binding.timeFajar.setText(sp.getString(FAJAR_TIME, null));
        binding.timeZuhur.setText(sp.getString(ZUHUR_TIME, null));
        binding.timeAsr.setText(sp.getString(ASR_TIME, null));
        binding.timeMaghrib.setText(sp.getString(MAGHRIB_TIME, null));
        binding.timeIsha.setText(sp.getString(ISHA_TIME, null));
        binding.timeJummah.setText(sp.getString(JUMMAH_TIME, null));
    }


    @Override
    protected void onResume() {
        super.onResume();
        getSharedPrefs();
    }

    //Cancel all Alarm that set by User
    private void cancelAllAlarms() {
        AlarmManager manager = (AlarmManager) getSystemService(ALARM_SERVICE);
        Intent intent = new Intent(this, RingerReceiver.class);

        for (int i = 0; i < 6; i++) {
            PendingIntent piFirst = getBroadcast(this, i, intent, FLAG_UPDATE_CURRENT);
            PendingIntent piSecond = getBroadcast(this, i + 100, intent, FLAG_UPDATE_CURRENT);
            PendingIntent piThird = getBroadcast(this, i + 200, intent, FLAG_UPDATE_CURRENT);

            try {
                if (piFirst != null) {
                    manager.cancel(piFirst);
                }
                if (piSecond != null) {
                    manager.cancel(piSecond);
                }
                if (piThird != null) {
                    manager.cancel(piThird);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //Set Time Fields to Null == No Value
    private void resetTimeFields() {
        binding.timeFajar.setText("");
        binding.timeZuhur.setText("");
        binding.timeAsr.setText("");
        binding.timeMaghrib.setText("");
        binding.timeIsha.setText("");
        binding.timeJummah.setText("");

    }

    /*Cancel Single Alarm one by one*/
    private void cancelSingleAlarm(int id) {
        AlarmManager manager = (AlarmManager) getSystemService(ALARM_SERVICE);
        Intent intent = new Intent(this, RingerReceiver.class);
        PendingIntent pendingIntent = getBroadcast(this, id, intent, FLAG_UPDATE_CURRENT);

        try {
            if (pendingIntent != null) {
                manager.cancel(pendingIntent);
            }
            Toast.makeText(this, "Alarm is Cancelled", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    /*Battery Optimization Permission*/
    @SuppressLint("BatteryLife")
    private void batteryPermission() {
        if (SDK_INT >= M) {
            Intent intent = new Intent();
            String packageName = getPackageName();
            PowerManager pm = (PowerManager) getSystemService(POWER_SERVICE);
            if (!pm.isIgnoringBatteryOptimizations(packageName)) {
                intent.setAction(ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS);
                intent.setData(Uri.parse("package:" + packageName));
                startActivity(intent);
            }
        }
    }
}