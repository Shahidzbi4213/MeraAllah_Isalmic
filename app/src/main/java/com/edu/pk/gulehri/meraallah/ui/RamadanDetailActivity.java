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
import com.edu.pk.gulehri.meraallah.adapters.RamadanAdapter;
import com.edu.pk.gulehri.meraallah.adapters.RamadanDetailAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityRamadanDetailBinding;

public class RamadanDetailActivity extends AppCompatActivity {

    /**
     * Vars
     */
    private int pos;
    private String lang, heading;
    private ActivityRamadanDetailBinding ramadanDetailBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ramadanDetailBinding = ActivityRamadanDetailBinding.inflate(getLayoutInflater());
        setContentView(ramadanDetailBinding.getRoot());

        getValues();
        setAdapter();
        setToolBar();

    }

    private void setAdapter() {
        ramadanDetailBinding.ramadanDetailRecycleView.setLayoutManager(new LinearLayoutManager(this));
        ramadanDetailBinding.ramadanDetailRecycleView.setAdapter(new RamadanDetailAdapter(this,lang, pos));
    }


    private void getValues() {
        Intent intent = getIntent();
        pos = intent.getIntExtra(RamadanAdapter.POSITION, 0);
        lang = intent.getStringExtra(RamadanAdapter.LANGUAGE);
        heading = intent.getStringExtra(RamadanAdapter.HEADING);
    }


    private void setToolBar() {
        setSupportActionBar(ramadanDetailBinding.toolbarIncludeRamadanDetail.mToolbar);
        ramadanDetailBinding.toolbarIncludeRamadanDetail.mToolbar.setElevation(0);
        ramadanDetailBinding.toolbarIncludeRamadanDetail.toolbarText.setText(heading);
        ramadanDetailBinding.toolbarIncludeRamadanDetail.toolbarImageFirst.setImageResource(0);

        try {
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            ramadanDetailBinding.toolbarIncludeRamadanDetail.toolbarText.setLayoutParams(params);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
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