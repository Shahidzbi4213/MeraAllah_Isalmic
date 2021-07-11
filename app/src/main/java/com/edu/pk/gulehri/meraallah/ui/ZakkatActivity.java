package com.edu.pk.gulehri.meraallah.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.ViewPagerAdapterZakkat;
import com.edu.pk.gulehri.meraallah.databinding.ActivityZakkatBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class ZakkatActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private ActivityZakkatBinding binding;
    private ViewPagerAdapterZakkat adapterZakkat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityZakkatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setToolBar();
        setAdapter();
        setListener();
    }

    private void setListener() {
        binding.zakkatTabLayout.addOnTabSelectedListener(this);
        binding.viewPagerZakkat.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(
                binding.zakkatTabLayout
        ));
    }

    private void setAdapter() {
        adapterZakkat = new ViewPagerAdapterZakkat(getSupportFragmentManager(), binding.zakkatTabLayout.getTabCount());
        binding.viewPagerZakkat.setAdapter(adapterZakkat);
    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeZakkat.mToolbar);
            binding.toolbarIncludeZakkat.mToolbar.setElevation(0);

            binding.toolbarIncludeZakkat.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeZakkat.toolbarImageSecond.setImageResource(0);
            binding.toolbarIncludeZakkat.toolbarText.setText(R.string.zakkat);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.START;
            binding.toolbarIncludeZakkat.toolbarText.setLayoutParams(params);
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

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        binding.viewPagerZakkat.setCurrentItem(tab.getPosition());

        if (tab.getPosition() == 0 || tab.getPosition() == 1) {
            adapterZakkat.notifyDataSetChanged();
        }

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}