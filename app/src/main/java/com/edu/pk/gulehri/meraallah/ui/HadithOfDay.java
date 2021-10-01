package com.edu.pk.gulehri.meraallah.ui;

import static android.app.AlarmManager.RTC_WAKEUP;
import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.M;
import static android.provider.Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.DELAY;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.ActivityHadithOfDayBinding;
import com.edu.pk.gulehri.meraallah.databinding.InfoDialogboxBinding;
import com.edu.pk.gulehri.meraallah.receivers.NotificationReceiver;

import java.util.Calendar;
import java.util.Objects;

public class HadithOfDay extends AppCompatActivity implements View.OnClickListener {

    private ActivityHadithOfDayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHadithOfDayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setToolBar();
        batteryPermission();
        setAnimation();
        setListener();
        setNotification();

    }

    private void setNotification() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 9);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        Intent intent = new Intent(this, NotificationReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 42, intent, 0);
        AlarmManager manager = (AlarmManager) this.getSystemService(ALARM_SERVICE);

        if (calendar.before(Calendar.getInstance())) {
            calendar.add(Calendar.DATE, 1);
        }
        manager.setRepeating(RTC_WAKEUP, calendar.getTimeInMillis(), DELAY, pendingIntent);
    }


    private void setListener() {
        binding.toolbarIncludeHadithOfDay.toolbarImageFirst.setOnClickListener(this);
        binding.toolbarIncludeHadithOfDay.toolbarImageSecond.setOnClickListener(this);
    }


    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeHadithOfDay.mToolbar);
            binding.toolbarIncludeHadithOfDay.mToolbar.setElevation(0);
            binding.toolbarIncludeHadithOfDay.toolbarImageFirst.setImageResource(R.drawable.ic_info);
            binding.toolbarIncludeHadithOfDay.toolbarImageFirst.
                    setColorFilter(ContextCompat.getColor(this, R.color.white),
                            android.graphics.PorterDuff.Mode.SRC_IN);
            binding.toolbarIncludeHadithOfDay.toolbarImageSecond.setImageResource(R.drawable.copy);
            binding.toolbarIncludeHadithOfDay.toolbarImageFirst.setVisibility(View.VISIBLE);
            binding.toolbarIncludeHadithOfDay.toolbarImageSecond.setVisibility(View.VISIBLE);
            binding.toolbarIncludeHadithOfDay.toolbarText.setText(R.string.hadith);

            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeHadithOfDay.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.toolbarImageSecond) {
            copyText();
        } else if (v.getId() == R.id.toolbarImageFirst) {
            showDialog();
        }
    }

    private void showDialog() {
        com.edu.pk.gulehri.meraallah.databinding.InfoDialogboxBinding dialogBoxBinding = InfoDialogboxBinding.inflate(getLayoutInflater());

        //Taking Reference of Alert Dialog
        //Giving Xml View To our Alert Dialog
        AlertDialog builder = new AlertDialog.Builder(this).setView(dialogBoxBinding.getRoot())
                .setCancelable(false).create();

        //setting Background Transparent
        builder.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        builder.getWindow().setWindowAnimations(R.style.DialogAnimation);

        dialogBoxBinding.yesBtn.setOnClickListener(v -> {
            builder.cancel();
            builder.dismiss();

        });

        builder.show();
    }

    private void copyText() {
        ClipboardManager manager = (ClipboardManager) this.getSystemService(Context.CLIPBOARD_SERVICE);
        String hadith = binding.hadithDay.getCurrentHadith().getText();
        String info = binding.hadithDay.getCurrentHadith().getInfo();


        String data = hadith + "\n\n" + "Sahih al-Bukhari: " + info;

        ClipData clipData = ClipData.newPlainText("Text", data);
        manager.setPrimaryClip(clipData);

        Toast.makeText(this, "Copied to Clipboard", Toast.LENGTH_SHORT).show();
    }

    private void setAnimation() {
        YoYo.with(Techniques.ZoomIn).duration(2500).playOn(binding.hadithDay);
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