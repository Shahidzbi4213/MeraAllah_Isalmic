package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.VideoAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityVideoBinding;
import com.edu.pk.gulehri.meraallah.model.Videos;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.Objects;

public class VideoActivity extends AppCompatActivity {

    private ActivityVideoBinding binding;
    private VideoAdapter adapter;
    private FirebaseRecyclerOptions<Videos> options;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVideoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        try {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        setToolBar();
        setDesign();

    }

    private void setDesign() {
        Query query = FirebaseDatabase.getInstance()
                .getReference()
                .child("Islamic Videos");

        options
                = new FirebaseRecyclerOptions.Builder<Videos>()
                .setQuery(query, Videos.class)
                .build();

        adapter = new VideoAdapter(options, this);

        binding.videosRecycler.setItemAnimator(null);
        binding.videosRecycler.setAdapter(adapter);


    }

    @SuppressLint("SetTextI18n")
    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeVideo.mToolbar);
            binding.toolbarIncludeVideo.mToolbar.setElevation(0);

            binding.toolbarIncludeVideo.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeVideo.toolbarImageSecond.setImageResource(0);
            binding.toolbarIncludeVideo.toolbarText.setText(R.string.islamic_videos);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeVideo.toolbarText.setLayoutParams(params);
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
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }


}