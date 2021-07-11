package com.edu.pk.gulehri.meraallah.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.HijriInfoDetailAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityHijriInfoDetailBinding;

import java.util.Objects;

import static com.edu.pk.gulehri.meraallah.adapters.HijriInfoAdapter.HEADING_TEXT;
import static com.edu.pk.gulehri.meraallah.adapters.HijriInfoAdapter.POSITION_OF_ITEM;

public class HijriInfoDetail extends AppCompatActivity {

    private ActivityHijriInfoDetailBinding binding;
    private String headingOfItem;
    private int positionOfItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHijriInfoDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getValues();
        setToolBar();
        setAdapter();
    }

    private void setAdapter() {
        binding.detailRecycleView.setLayoutManager(new LinearLayoutManager(this));
        binding.detailRecycleView.setAdapter(new HijriInfoDetailAdapter(positionOfItem));
    }

    private void getValues() {
        Intent intent = getIntent();
        headingOfItem = intent.getStringExtra(HEADING_TEXT);
        positionOfItem = intent.getIntExtra(POSITION_OF_ITEM, 0);
    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeHijriInfoDetail.mToolbar);
            binding.toolbarIncludeHijriInfoDetail.mToolbar.setElevation(0);
            binding.toolbarIncludeHijriInfoDetail.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeHijriInfoDetail.toolbarImageFirst.setVisibility(View.GONE);
            binding.toolbarIncludeHijriInfoDetail.toolbarImageSecond.setVisibility(View.GONE);
            binding.toolbarIncludeHijriInfoDetail.toolbarText.setText(headingOfItem);

            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeHijriInfoDetail.toolbarText.setLayoutParams(params);
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
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return true;
    }
}