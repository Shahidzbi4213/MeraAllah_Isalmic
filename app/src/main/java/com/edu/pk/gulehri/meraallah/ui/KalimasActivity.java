package com.edu.pk.gulehri.meraallah.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.viewpager.widget.ViewPager;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.ViewPagerAdapterKalimas;
import com.edu.pk.gulehri.meraallah.databinding.ActivityKalimasBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class KalimasActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private ActivityKalimasBinding binding;
    private ViewPagerAdapterKalimas adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityKalimasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        setListeners();
        setAdapter();
    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeKalimas.mToolbar);
            binding.toolbarIncludeKalimas.mToolbar.setElevation(0);

            binding.toolbarIncludeKalimas.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeKalimas.toolbarImageSecond.setImageResource(0);
            binding.toolbarIncludeKalimas.toolbarText.setText(R.string.kalimas);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.START;
            binding.toolbarIncludeKalimas.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void setAdapter() {
        adapter = new ViewPagerAdapterKalimas(getSupportFragmentManager(),binding.tabLayoutKalimas.getTabCount());
        binding.viewPagerKalimas.setAdapter(adapter);
    }

    private void setListeners() {
        binding.tabLayoutKalimas.addOnTabSelectedListener(this);
        binding.viewPagerKalimas.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabLayoutKalimas));
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        int pos = tab.getPosition();
        binding.viewPagerKalimas.setCurrentItem(pos);

        if (pos == 0 || pos == 1) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}