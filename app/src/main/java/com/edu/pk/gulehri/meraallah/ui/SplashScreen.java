package com.edu.pk.gulehri.meraallah.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.edu.pk.gulehri.meraallah.constansts.Constants;

import static com.edu.pk.gulehri.meraallah.constansts.Constants.SPLASH_SCREEN_DELAY;

public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashScreen.this, MainActivity.class));
            finish();
        }, SPLASH_SCREEN_DELAY);
    }

}
