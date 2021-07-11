package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.text.LineBreaker;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.ActivityShahadatBinding;

public class ShahadatActivity extends AppCompatActivity implements View.OnClickListener {


    /**
     * Vars
     **/
    private ActivityShahadatBinding shahadatBinding;
    private MediaPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        shahadatBinding = ActivityShahadatBinding.inflate(getLayoutInflater());
        setContentView(shahadatBinding.getRoot());


        setToolBar();
        setListeners();
        createPlayer();
        setTextJustification();

    }

    private void setListeners() {
        shahadatBinding.toolbarIncludeShahadat.toolbarImageFirst.setOnClickListener(ShahadatActivity.this);
        shahadatBinding.toolbarIncludeShahadat.toolbarImageSecond.setOnClickListener(ShahadatActivity.this);
    }

    private void createPlayer() {
        player = MediaPlayer.create(this, R.raw.shahada);
    }

    @SuppressLint("InlinedApi")
    private void setTextJustification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            shahadatBinding.shahadaImportance.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
            shahadatBinding.shahada.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
            shahadatBinding.shahadaTranlitration.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
            shahadatBinding.shahadaTranslation.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        } else {
            shahadatBinding.shahadaImportance.setTypeface(Typeface.SANS_SERIF, Typeface.ITALIC);
            shahadatBinding.shahadaTranslation.setTypeface(Typeface.SANS_SERIF, Typeface.ITALIC);
            shahadatBinding.shahadaTranlitration.setTypeface(Typeface.SANS_SERIF, Typeface.ITALIC);
        }
    }

    private void setToolBar() {
        setSupportActionBar(shahadatBinding.toolbarIncludeShahadat.mToolbar);
        shahadatBinding.toolbarIncludeShahadat.toolbarText.setText(R.string.shahadat);
        shahadatBinding.toolbarIncludeShahadat.toolbarImageSecond.setImageResource(R.drawable.copy);


        try {
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            shahadatBinding.toolbarIncludeShahadat.toolbarText.setLayoutParams(params);

            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.back_arrow);
            getSupportActionBar().setHomeAsUpIndicator(drawable);


        } catch (NullPointerException e) {
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

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.toolbarImageFirst) {
            try {
                if (player.isPlaying()) {
                    player.pause();
                    shahadatBinding.toolbarIncludeShahadat.toolbarImageFirst.setImageResource(0);
                    shahadatBinding.toolbarIncludeShahadat.toolbarImageFirst.setBackgroundResource(R.drawable.play);


                } else {
                    player.start();
                    player.setLooping(true);
                    shahadatBinding.toolbarIncludeShahadat.toolbarImageFirst.setImageResource(0);
                    shahadatBinding.toolbarIncludeShahadat.toolbarImageFirst.setBackgroundResource(R.drawable.pause);

                }
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }

        } else if (v.getId() == R.id.toolbarImageSecond) {
            copyText();
        }
    }

    private void copyText() {
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);

        String str = shahadatBinding.shahadaImportance.getText().toString() + "\n\n" +
                shahadatBinding.shahada.getText().toString() + "\n\n" +
                shahadatBinding.shahadaTranlitration.getText().toString() + "\n\n" +
                shahadatBinding.shahadaTranslation.getText().toString();

        ClipData data = ClipData.newPlainText("Shahadat", str);
        clipboardManager.setPrimaryClip(data);

        Toast.makeText(this, "Copied to Clipboard", Toast.LENGTH_SHORT).show();


    }


    @Override
    protected void onPause() {
        super.onPause();
        try {
            player.pause();
            shahadatBinding.toolbarIncludeShahadat.toolbarImageFirst.setImageResource(0);
            shahadatBinding.toolbarIncludeShahadat.toolbarImageFirst.setBackgroundResource(R.drawable.play);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

    }

}


