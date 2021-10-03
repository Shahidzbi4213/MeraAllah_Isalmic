package com.edu.pk.gulehri.meraallah.ui;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static android.content.pm.PackageManager.PERMISSION_GRANTED;
import static android.os.Build.VERSION_CODES.M;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.TAG;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.location.LocationManagerCompat;

import com.batoulapps.adhan.CalculationMethod;
import com.batoulapps.adhan.CalculationParameters;
import com.batoulapps.adhan.Coordinates;
import com.batoulapps.adhan.Madhab;
import com.batoulapps.adhan.PrayerTimes;
import com.batoulapps.adhan.data.DateComponents;
import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.ActivityPrayerTimesBinding;
import com.github.msarhan.ummalqura.calendar.UmmalquraCalendar;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

import im.delight.android.location.SimpleLocation;

public class PrayerTime extends AppCompatActivity implements View.OnClickListener {

    private static final String[] perms = {ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION};
    private static final int REQUEST_LOCATION_PERMISSION = 678;
    public static boolean isBackPressed;
    private ActivityPrayerTimesBinding timesBinding;
    private SimpleLocation location;
    private String cityName;

    @RequiresApi(api = M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        timesBinding = ActivityPrayerTimesBinding.inflate(getLayoutInflater());
        setContentView(timesBinding.getRoot());

        requestLocationPermission();
        setToolBar();
        hijriDate();
        setBackgrounds();
        timesBinding.toolbarIncludePrayerTime.toolbarImageFirst.setOnClickListener(this);

        if (isBackPressed) {
            calculateTPrayerTime();
            isBackPressed = false;
        }

    }

    private void setBackgrounds(){

        timesBinding.viewNow.getBackground().setColorFilter(Color.parseColor("#F4B41A"), PorterDuff.Mode.SRC_OVER);
        timesBinding.viewNext.getBackground().setColorFilter(Color.parseColor("#0BEA7E"), PorterDuff.Mode.SRC_OVER);
    }
    @SuppressLint("SetTextI18n")
    private void hijriDate() {

        Calendar cal = new UmmalquraCalendar();
        SimpleDateFormat dateFormat = new SimpleDateFormat("", Locale.ENGLISH);
        dateFormat.setCalendar(cal);

        dateFormat.applyPattern("y");
        String Year = dateFormat.format(cal.getTime());

        dateFormat.applyPattern("MMMM");
        String Month = dateFormat.format(cal.getTime());

        dateFormat.applyPattern("dd");
        String Date = dateFormat.format(cal.getTime());

        timesBinding.dateTxt.setText(Date);
        timesBinding.monthTxt.setText(Month);
        timesBinding.yearTxt.setText(Year);
    }

    private void setToolBar() {
        try {
            setSupportActionBar(timesBinding.toolbarIncludePrayerTime.mToolbar);
            timesBinding.toolbarIncludePrayerTime.mToolbar.setElevation(0);

            timesBinding.toolbarIncludePrayerTime.toolbarImageFirst.setImageResource(R.drawable.ic_settings);
            timesBinding.toolbarIncludePrayerTime.toolbarImageSecond.setImageResource(0);
            timesBinding.toolbarIncludePrayerTime.toolbarText.setText(R.string.salah_times);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.START;
            timesBinding.toolbarIncludePrayerTime.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @SuppressLint({"SimpleDateFormat", "SetTextI18n"})
    private void calculateTPrayerTime() {

        try {
            SharedPreferences sp = getSharedPreferences("MyData", MODE_PRIVATE);
            String Data = sp.getString("school", null);
            String MethodData = sp.getString("methodology", null);

            float latitude;
            float longitude;
            if (haveNetworkConnection() && isLocationEnabled()) {

                latitude = (float) location.getLatitude();
                longitude = (float) location.getLongitude();


                SharedPreferences.Editor edit = sp.edit();
                edit.putFloat("lat", latitude);
                edit.putFloat("lon", longitude);
                edit.apply();

            } else {
                latitude = sp.getFloat("lat", 0);
                longitude = sp.getFloat("lon", 0);
            }

            Coordinates coordinates = new Coordinates(latitude, longitude);
            DateComponents date = DateComponents.from(new Date());
            CalculationParameters params = CalculationMethod.KARACHI.getParameters();

            if (Data.isEmpty() && MethodData.isEmpty()) {
                params.madhab = Madhab.HANAFI;
                params = CalculationMethod.KARACHI.getParameters();
            } else {

                if ("Muslim World League".equals(MethodData)) {
                    params = CalculationMethod.MUSLIM_WORLD_LEAGUE.getParameters();
                } else if ("Egyptian".equals(MethodData)) {
                    params = CalculationMethod.EGYPTIAN.getParameters();
                } else if ("University of Islamic Sciences, Karachi".equals(MethodData)) {
                    params = CalculationMethod.KARACHI.getParameters();
                } else if ("Umm al-Qura University, Makkah".equals(MethodData)) {
                    params = CalculationMethod.UMM_AL_QURA.getParameters();
                } else if ("Dubai".equals(MethodData)) {
                    params = CalculationMethod.DUBAI.getParameters();
                } else if ("Qatar".equals(MethodData)) {
                    params = CalculationMethod.QATAR.getParameters();
                } else if ("Moonsighting Committee".equals(MethodData)) {
                    params = CalculationMethod.MOON_SIGHTING_COMMITTEE.getParameters();
                } else if ("Kuwait".equals(MethodData)) {
                    params = CalculationMethod.KUWAIT.getParameters();
                } else if ("Singapore".equals(MethodData)) {
                    params = CalculationMethod.SINGAPORE.getParameters();
                }

                if (Data.equals("Hanafi")) {
                    params.madhab = Madhab.HANAFI;
                } else if (Data.equals("Shafi")) {
                    params.madhab = Madhab.SHAFI;
                }

                PrayerTimes prayerTimes = new PrayerTimes(coordinates, date, params);
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
                formatter.setTimeZone(TimeZone.getDefault());


                String FajarTime = formatter.format(prayerTimes.fajr);
                String ZuhurTime = formatter.format(prayerTimes.dhuhr);
                String AsrTime = formatter.format(prayerTimes.asr);
                String MaghribTime = formatter.format(prayerTimes.maghrib);
                String IshaTime = formatter.format(prayerTimes.isha);
                String SunRise = formatter.format(prayerTimes.sunrise.getTime());


                //Assigning Data to TextViews
                timesBinding.tvFajarTime.setText(FajarTime);
                timesBinding.tvZuhurTime.setText(ZuhurTime);
                timesBinding.tvAsrTime.setText(AsrTime);
                timesBinding.tvMaghribTime.setText(MaghribTime);
                timesBinding.tvIshaTime.setText(IshaTime);
                timesBinding.nextPrayer.setText("" + prayerTimes.nextPrayer());
                timesBinding.sunRise.setText("" + SunRise);
                String cityAddress = getAddress(latitude, longitude);
                timesBinding.loc.setText(cityAddress);

                Log.i(TAG, "calculateTPrayerTime:  is Called");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    @Override
    protected void onResume() {
        super.onResume();

        try {
            if (ContextCompat.checkSelfPermission(this, perms[0]) == PERMISSION_GRANTED ||
                    (ContextCompat.checkSelfPermission(this, perms[1]) == PERMISSION_GRANTED)) {
                // make the device update its location
                if (isLocationEnabled() && haveNetworkConnection()) {
                    location.beginUpdates();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onPause() {
        try {
            if (isLocationEnabled() && haveNetworkConnection()) {
                location = new SimpleLocation(this);
                // stop location updates (saves battery)
                location.endUpdates();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onPause();
    }


    public String getAddress(double lat, double lng) {
        Geocoder geocoder = new Geocoder(PrayerTime.this, Locale.getDefault());
        try {
            List<Address> addresses = geocoder.getFromLocation(lat, lng, 1);
            Address obj = addresses.get(0);
            cityName = obj.getLocality();

        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return cityName;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.toolbarImageFirst) {
            startActivity(new Intent(this, PrayerCalculation.class));
            finish();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_LOCATION_PERMISSION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                location = new SimpleLocation(this);
                calculateTPrayerTime();

            } else {
                startActivity(new Intent(this, MainActivity.class));
            }
        }
    }

    public void requestLocationPermission() {

        if ((ContextCompat.checkSelfPermission(this, perms[0]) == PERMISSION_GRANTED) ||
                (ContextCompat.checkSelfPermission(this, perms[1]) == PERMISSION_GRANTED)) {
            location = new SimpleLocation(this);
            calculateTPrayerTime();
        } else {
            ActivityCompat.requestPermissions(this, perms, REQUEST_LOCATION_PERMISSION);
        }
    }


    private boolean isLocationEnabled() {
        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        return LocationManagerCompat.isLocationEnabled(locationManager);
    }

    private boolean haveNetworkConnection() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        return (wifi != null && wifi.isConnected()) || (mobile != null && mobile.isConnected());

    }

}
