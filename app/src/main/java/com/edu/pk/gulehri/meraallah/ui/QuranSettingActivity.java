package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.SeekBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.ActivityQuranSettingBinding;

import java.util.Objects;

public class QuranSettingActivity extends AppCompatActivity {

    private ActivityQuranSettingBinding binding;
    private SharedPreferences sp;
    private SharedPreferences.Editor edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuranSettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sp = getSharedPreferences("QuranSetting", MODE_PRIVATE);
        edit = sp.edit();


        setToolBar();
        setValue();
        getValue();

    }


    private void setToolBar() {
        try {
            setSupportActionBar(binding.tbQuranSetting.mToolbar);
            binding.tbQuranSetting.mToolbar.setElevation(0);
            binding.tbQuranSetting.toolbarImageFirst.setVisibility(View.GONE);
            binding.tbQuranSetting.toolbarImageSecond.setVisibility(View.GONE);
            binding.tbQuranSetting.toolbarText.setText(R.string.quran_setting);

            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.tbQuranSetting.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void setValue() {
        binding.switchArabic.setOnCheckedChangeListener((compoundButton, b) -> {
            edit.putBoolean("checkArabic", true);
            edit.putBoolean("switchArabic", b);
            edit.apply();
        });

        binding.switchTranslation.setOnCheckedChangeListener((compoundButton, b) -> {
            edit.putBoolean("checkTranslation", true);
            edit.putBoolean("switchTranslation", b);
            edit.apply();
        });

        binding.langGroup.setOnCheckedChangeListener((radioGroup, i) -> {
            edit.putBoolean("checkLang", true);
            edit.putInt("id", radioGroup.getCheckedRadioButtonId());
            edit.apply();
        });

        binding.seekBarArabic.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                binding.arabicPx.setText("" + i + "%");
                edit.putBoolean("checkSeekArabic", true);
                edit.putInt("seekbarArabic", i);
                edit.apply();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        binding.seekBarTranslation.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                binding.translationPx.setText("" + i + "%");
                edit.putBoolean("checkSeekTranslation", true);
                edit.putInt("seekbarTranslation", i);
                edit.apply();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @SuppressLint("SetTextI18n")
    public void getValue() {
        final boolean checkArabic = sp.getBoolean("checkArabic", false);
        final boolean checkTranslation = sp.getBoolean("checkTranslation", false);

        final boolean checkLang = sp.getBoolean("checkLang", false);
        final int id = sp.getInt("id", 0);

        final boolean checkSeekArabic = sp.getBoolean("checkSeekArabic", false);
        final boolean checkSeekTranslation = sp.getBoolean("checkSeekTranslation", false);

        /*Setting Arabic Switch Button */
        if (!checkArabic) {
            binding.switchArabic.setChecked(true);
            edit.putBoolean("switchArabic", true);
            edit.apply();
        } else {
            binding.switchArabic.setChecked(sp.getBoolean("switchArabic", false));
        }

        /*Setting Translation Switch Button */
        if (!checkTranslation) {
            binding.switchTranslation.setChecked(true);
            edit.putBoolean("switchTranslation", true);
            edit.apply();
        } else {
            binding.switchTranslation.setChecked(sp.getBoolean("switchTranslation", false));
        }


        if (!checkSeekArabic) {
            binding.arabicPx.setText("" + 60 + "%");
            binding.seekBarArabic.setProgress(60);
            edit.putInt("seekbarArabic", 60);
            edit.apply();
        } else {
            final int progress = sp.getInt("seekbarArabic", 0);
            binding.arabicPx.setText("" + progress + "%");
            binding.seekBarArabic.setProgress(progress);
        }

        if (!checkSeekTranslation) {
            binding.translationPx.setText("" + 50 + "%");
            binding.seekBarTranslation.setProgress(50);
            edit.putInt("seekbarTranslation", 50);
            edit.apply();
        } else {
            final int progress = sp.getInt("seekbarTranslation", 0);
            binding.translationPx.setText("" + progress + "%");
            binding.seekBarTranslation.setProgress(progress);
        }


        if (!checkLang || id == 0) {
            binding.radioUrdu.setChecked(true);
            edit.putInt("id", R.id.radioUrdu);
            edit.apply();

        } else {

            RadioButton button = (RadioButton) findViewById(id);
            try {
                button.setChecked(true);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, ShowQuranActivity.class));
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return true;
    }
}