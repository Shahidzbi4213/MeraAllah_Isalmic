package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.bullhead.quranquotes.QuranQuote;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.ActivityQuranVerseBinding;

import java.util.Objects;

public class QuranVerse extends AppCompatActivity implements View.OnClickListener {
    private ActivityQuranVerseBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuranVerseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        setAnimation();
        setData();
        setListener();

    }

    private void setListener() {
        binding.toolbarIncludeQuranVerse.toolbarImageFirst.setOnClickListener(this);
    }

    private void setData() {
        String arabic = binding.quranVerse.getCurrentVerse().getArabic();
        binding.txtArabic.setText(arabic);

    }

    private void setAnimation() {
        YoYo.with(Techniques.ZoomIn).duration(2500).playOn(binding.quranVerse);
        YoYo.with(Techniques.ZoomIn).duration(2500).playOn(binding.txtArabic);
    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeQuranVerse.mToolbar);
            binding.toolbarIncludeQuranVerse.mToolbar.setElevation(0);
            binding.toolbarIncludeQuranVerse.toolbarImageFirst.setImageResource(R.drawable.copy);
            binding.toolbarIncludeQuranVerse.toolbarImageFirst.setVisibility(View.VISIBLE);
            binding.toolbarIncludeQuranVerse.toolbarImageSecond.setVisibility(View.GONE);
            binding.toolbarIncludeQuranVerse.toolbarText.setText(R.string.quran_verse);

            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeQuranVerse.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void copyText() {
        ClipboardManager manager = (ClipboardManager) this.getSystemService(Context.CLIPBOARD_SERVICE);
        String arabic = binding.quranVerse.getCurrentVerse().getArabic();
        String english = binding.quranVerse.getCurrentVerse().getEnglish();
        String surah = binding.quranVerse.getCurrentVerse().getSurah().getTitle();
        int number = binding.quranVerse.getCurrentVerse().getNumber();

        String CopiedText = arabic + "\n\n" + english + "\n\n" + surah + " | " + number;

        ClipData clipData = ClipData.newPlainText("Text", CopiedText);
        manager.setPrimaryClip(clipData);

        Toast.makeText(this, "Copied to Clipboard", Toast.LENGTH_SHORT).show();

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
        if (v.getId() == R.id.toolbarImageFirst) {
            copyText();
        }
    }
}