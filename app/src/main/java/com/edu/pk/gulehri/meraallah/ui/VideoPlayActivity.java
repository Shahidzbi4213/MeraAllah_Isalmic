package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.edu.pk.gulehri.meraallah.databinding.ActivityVideoPlayBinding;
import com.khizar1556.mkvideoplayer.MKPlayer;

public class VideoPlayActivity extends AppCompatActivity {

    private ActivityVideoPlayBinding binding;
    private int cardID;
    private String path, title;
    private MKPlayer player;
    private SharedPreferences sp;
    private SharedPreferences.Editor edit;

    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVideoPlayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sp = getPreferences(MODE_PRIVATE);
        edit = sp.edit();

        player = new MKPlayer(VideoPlayActivity.this);
        getValue();
        setPaths();
        setPlayer();


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

    private void setPlayer() {
        player.play(path);
        player.setTitle(title);


        player.setPlayerCallbacks(new MKPlayer.playerCallbacks() {
            @Override
            public void onNextClick() {
                //It is the method for next song.It is called when you pressed the next icon
                //Do according to your requirement
                int posForward = player.getCurrentPosition() + 10000;
                player.seekTo(posForward, true);
            }

            @Override
            public void onPreviousClick() {
                //It is the method for previous song.It is called when you pressed the previous icon
                //Do according to your requirement
                int posRewind = player.getCurrentPosition() - 10000;
                player.seekTo(posRewind, true);
            }
        });

        player.onComplete(() -> player.pause());
        player.onError((what, extra) -> Toast.makeText(getApplicationContext(), "video play error", Toast.LENGTH_SHORT).show());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(new Configuration());
        if (player != null) {
            player.onConfigurationChanged(newConfig);
        }

    }


    @Override
    protected void onPause() {
        super.onPause();
        if (player != null) {
            player.onPause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (player != null) {
            player.onResume();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player != null) {

            edit.putLong("time", player.getCurrentPosition());
            edit.apply();
            player.onDestroy();
        }
    }


    @Override
    public void onBackPressed() {

        startActivity(new Intent(this, VideoActivity.class));
        super.onBackPressed();
        finish();

    }
}