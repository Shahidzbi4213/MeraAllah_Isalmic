package com.edu.pk.gulehri.meraallah.ui;

import static com.edu.pk.gulehri.meraallah.R.id;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.edu.pk.gulehri.meraallah.databinding.ActivityQuranSettingBinding;

public class QuranSettingActivity extends AppCompatActivity {

    private ActivityQuranSettingBinding binding;
    private SharedPreferences sp;
    private SharedPreferences.Editor edit;
    private boolean checkArabic, checkTranslation, checkLang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuranSettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sp = getSharedPreferences("QuranSetting", MODE_PRIVATE);
        edit = sp.edit();


        setValue();
        getValue();

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
            edit.putInt("rbID", radioGroup.getCheckedRadioButtonId());
            edit.apply();
        });


      /*
        binding.seekBarArabic.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                binding.arabicPx.setText("" + i + "%");
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
                edit.putInt("seekbarTranslation", i);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });*/
    }

    @SuppressLint("SetTextI18n")
    private void getValue() {
        checkArabic = sp.getBoolean("checkArabic", false);
        checkTranslation = sp.getBoolean("checkTranslation", false);
        checkLang = sp.getBoolean("checkLang", false);

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

        //setting Radio Buttons
        if (!checkLang) {
            binding.radioUrdu.setChecked(true);
            edit.putInt("rbID", id.radioUrdu);
            edit.apply();
        } else {
            RadioButton radioButton = findViewById(sp.getInt("rbID", 0));
            radioButton.setChecked(true);
        }

       /* binding.switchArabic.setChecked(sp.getBoolean("switchArabic", false));
        binding.switchTranslation.setChecked(sp.getBoolean("switchTranslation", false));
        RadioButton radioButton = findViewById(sp.getInt("id", 0));
        radioButton.setChecked(true);

        final int seekArabic = sp.getInt("seekbarArabic", 0);

        if (seekArabic > 0) {
            binding.seekBarArabic.setProgress(seekArabic);
            binding.arabicPx.setText("" + seekArabic + "%");
        } else {
            binding.seekBarArabic.setProgress(60);
            binding.arabicPx.setText("" + 60 + "%");
        }


        final int seekTranslation = sp.getInt("seekbarTranslation", 0);

        if (seekArabic > 0) {
            binding.seekBarTranslation.setProgress(seekTranslation);
            binding.translationPx.setText("" + seekTranslation + "%");
        } else {
            binding.seekBarTranslation.setProgress(60);
            binding.translationPx.setText("" + 60 + "%");
        }*/
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, ShowQuranActivity.class));
        finish();
    }
}