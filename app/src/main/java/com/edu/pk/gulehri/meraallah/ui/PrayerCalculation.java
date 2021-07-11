package com.edu.pk.gulehri.meraallah.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.ActivityPrayerCalculationBinding;

import java.util.Objects;

public class PrayerCalculation extends AppCompatActivity {

    private ActivityPrayerCalculationBinding calculationBinding;

    private String madhab;
    private String calculationMethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        calculationBinding = ActivityPrayerCalculationBinding.inflate(getLayoutInflater());
        setContentView(calculationBinding.getRoot());

        setToolBar();
        setData();
        getSavedMadhabData();
        getSavedMethodData();
    }

    private void setToolBar() {
        try {
            setSupportActionBar(calculationBinding.toolbarIncludePrayerCalculation.mToolbar);
            calculationBinding.toolbarIncludePrayerCalculation.mToolbar.setElevation(0);

            calculationBinding.toolbarIncludePrayerCalculation.toolbarImageFirst.setImageResource(0);
            calculationBinding.toolbarIncludePrayerCalculation.toolbarImageSecond.setImageResource(0);
            calculationBinding.toolbarIncludePrayerCalculation.toolbarText.setText(R.string.salah_times_methods);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.START;
            calculationBinding.toolbarIncludePrayerCalculation.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void setData() {

        calculationBinding.radioGroupMadhab.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.rbHanafi) {
                madhab = "Hanafi";
            } else if (checkedId == R.id.rbShafi) {
                madhab = "Shafi";
            }
        });

        calculationBinding.radioGroupMethod.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.rbMuslimLeague) {
                calculationMethod = "Muslim World League";
            } else if (checkedId == R.id.rbEgyptian) {
                calculationMethod = "Egyptian";
            } else if (checkedId == R.id.rbKarachi) {
                calculationMethod = "University of Islamic Sciences, Karachi";
            } else if (checkedId == R.id.rbMakkah) {
                calculationMethod = "Umm al-Qura University, Makkah";
            } else if (checkedId == R.id.rbDubai) {
                calculationMethod = "Dubai";
            } else if (checkedId == R.id.rbQatar) {
                calculationMethod = "Qatar";
            } else if (checkedId == R.id.rbMoonsighting) {
                calculationMethod = "Moonsighting Committee";
            } else if (checkedId == R.id.rbKuwait) {
                calculationMethod = "Kuwait";
            } else if (checkedId == R.id.rbSingapore) {
                calculationMethod = "Singapore";
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    private void savingMadhabData() {
        SharedPreferences sp = getSharedPreferences("SavingMadhabRadioButtonData", MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean("rbHanafi", calculationBinding.rbHanafi.isChecked());
        edit.putBoolean("rbShafi", calculationBinding.rbShafi.isChecked());
        edit.apply();

    }

    private void savingMethodData() {
        SharedPreferences sp = getSharedPreferences("SavingMethodRadioButtonData", MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean("rbMuslim", calculationBinding.rbMuslimLeague.isChecked());
        edit.putBoolean("rbEgypt", calculationBinding.rbEgyptian.isChecked());
        edit.putBoolean("rbKarachi", calculationBinding.rbKarachi.isChecked());
        edit.putBoolean("rbMakkah", calculationBinding.rbMakkah.isChecked());
        edit.putBoolean("rbDubai", calculationBinding.rbDubai.isChecked());
        edit.putBoolean("rbQatar", calculationBinding.rbQatar.isChecked());
        edit.putBoolean("rbKuwait", calculationBinding.rbKuwait.isChecked());
        edit.putBoolean("rbMoon", calculationBinding.rbMoonsighting.isChecked());
        edit.putBoolean("rbSingapore", calculationBinding.rbSingapore.isChecked());
        edit.apply();
    }

    private void getSavedMethodData() {
        SharedPreferences sp = getSharedPreferences("SavingMethodRadioButtonData", MODE_PRIVATE);

        if (sp.getBoolean("rbMuslim", false)) {
            calculationBinding.rbMuslimLeague.setChecked(true);
        } else if (sp.getBoolean("rbEgypt", false)) {
            calculationBinding.rbEgyptian.setChecked(true);
        } else if (sp.getBoolean("rbKarachi", false)) {
            calculationBinding.rbKarachi.setChecked(true);
        } else if (sp.getBoolean("rbDubai", false)) {
            calculationBinding.rbDubai.setChecked(true);
        } else if (sp.getBoolean("rbQatar", false)) {
            calculationBinding.rbQatar.setChecked(true);
        } else if (sp.getBoolean("rbKuwait", false)) {
            calculationBinding.rbKuwait.setChecked(true);
        } else if (sp.getBoolean("rbMoon", false)) {
            calculationBinding.rbMoonsighting.setChecked(true);
        } else if (sp.getBoolean("rbSingapore", false)) {
            calculationBinding.rbSingapore.setChecked(true);
        } else if (sp.getBoolean("rbMakkah", false)) {
            calculationBinding.rbMakkah.setChecked(true);
        }

    }

    private void getSavedMadhabData() {
        SharedPreferences sp = getSharedPreferences("SavingMadhabRadioButtonData", MODE_PRIVATE);
        boolean HanafiFlag = sp.getBoolean("rbHanafi", false);
        boolean ShafiFlag = sp.getBoolean("rbShafi", false);

        if (HanafiFlag) {
            calculationBinding.rbHanafi.setChecked(true);
        } else if (ShafiFlag) {
            calculationBinding.rbShafi.setChecked(true);
        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        savingMadhabData();
        savingMethodData();
        saveDataForData();
    }

    private void saveDataForData() {
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("school", madhab);
        edit.putString("methodology", calculationMethod);
        edit.apply();
    }

    @Override
    public void onBackPressed() {
        PrayerTime.isBackPressed = true;
        startActivity(new Intent(this, PrayerTime.class));
        PrayerCalculation.this.finish();
    }
}
