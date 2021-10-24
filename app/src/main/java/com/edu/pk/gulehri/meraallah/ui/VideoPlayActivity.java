package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.databinding.ActivityVideoPlayBinding;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;

public class VideoPlayActivity extends AppCompatActivity {

    private ActivityVideoPlayBinding binding;
    private int cardID;
    private SimpleExoPlayer player;
    private boolean fullScreen = false;
    private ImageView fullScreenView;
    private String path, title;
    private SharedPreferences sp;
    private SharedPreferences.Editor edit;

    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityVideoPlayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sp = getPreferences(MODE_PRIVATE);
        edit = sp.edit();


        getValue();
        setPaths();
        initializePlayer(Uri.parse(path));


    }

    private void getValue() {
        Intent intent = getIntent();
        cardID = intent.getIntExtra(VideoActivity.CARD_ID, 0);
    }

    private void setPaths() {
        if (cardID == 1) {
            path = "/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic First.mp4";
            title = "Allah Attributes Explained";
        } else if (cardID == 2) {
            path = "/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Second.mp4";
            title = "99 Attributes of Allah";
        } else if (cardID == 3) {
            path = "/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Third.mp4";
            title = "How Allah Helps the Youth?";
        } else if (cardID == 4) {
            path = "/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Fourth.mp4";
            title = "99 Names of Prophet Muhammad(SAW)";
        } else if (cardID == 5) {
            path = "/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Fifth.mp4";
            title = "Who is Allah ?";
        } else if (cardID == 6) {
            path = "/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Sixth.mp4";
            title = "The Story of Prophet Muhammad (SAW)";
        } else if (cardID == 7) {
            path = "/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Seventh.mp4";
            title = "Don't Be Sad - Allah Knows";
        } else if (cardID == 8) {
            path = "/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Eighth.mp4";
            title = "The Most Beautiful Things You Will Get In Heaven !!";
        } else if (cardID == 9) {
            path = "/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Ninth.mp4";
            title = "Surah Al Fatiha [Explained]";
        } else if (cardID == 10) {
            path = "/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Islamic Tenth.mp4";
            title = "Hell (Jahanum)";
        }
    }

    private void initializePlayer(Uri uri) {
        player = new SimpleExoPlayer.Builder(VideoPlayActivity.this).build();
        binding.playerView.setPlayer(player);


        MediaItem mediaItem = MediaItem.fromUri(uri);
        player.setMediaItem(mediaItem);
        player.prepare();
        player.play();

        fullScreenView = binding.playerView.findViewById(R.id.exo_fullscreen_icon);


        fullScreenView.setOnClickListener(v -> {
            if (!fullScreen) {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                fullScreenView.setImageDrawable(ContextCompat.
                        getDrawable(VideoPlayActivity.this, R.drawable.exo_ic_fullscreen_exit));
                fullScreen = true;
            } else {
                fullScreenView.setImageDrawable(ContextCompat.
                        getDrawable(VideoPlayActivity.this, R.drawable.exo_ic_fullscreen_enter));
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
            }

        });

    }


    @Override
    protected void onPause() {
        super.onPause();
        player.stop();
        player.clearMediaItems();
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, VideoActivity.class));
        super.onBackPressed();
        finish();

    }
}