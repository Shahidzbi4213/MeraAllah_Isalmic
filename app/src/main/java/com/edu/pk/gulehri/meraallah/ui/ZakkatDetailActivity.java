package com.edu.pk.gulehri.meraallah.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.ZakkatAdapter;
import com.edu.pk.gulehri.meraallah.adapters.ZakkatDetailAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityZakkatDetailBinding;

import java.util.Objects;

public class ZakkatDetailActivity extends AppCompatActivity {

    private ActivityZakkatDetailBinding binding;
    private String HEADING, Language;
    private int POSITION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityZakkatDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getValues();
        setToolBar();
        setAdapter();
    }

    private void setAdapter() {
        binding.zakkatDetailRecycleView.setLayoutManager(new LinearLayoutManager(this));
        binding.zakkatDetailRecycleView.setAdapter(new ZakkatDetailAdapter(Language,POSITION));
    }

    private void getValues() {
        Intent intent = getIntent();
        HEADING = intent.getStringExtra(ZakkatAdapter.CLICKED_ITEM_DATA);
        Language = intent.getStringExtra(ZakkatAdapter.SELECTED_LANG);
        POSITION = intent.getIntExtra(ZakkatAdapter.CLICK_ITEM_POSITION, 0);
    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeZakkatDetail.mToolbar);
            binding.toolbarIncludeZakkatDetail.mToolbar.setElevation(0);

            binding.toolbarIncludeZakkatDetail.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeZakkatDetail.toolbarImageSecond.setImageResource(0);
            binding.toolbarIncludeZakkatDetail.toolbarText.setText(HEADING);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT,
                    Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeZakkatDetail.toolbarText.setLayoutParams(params);
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
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}