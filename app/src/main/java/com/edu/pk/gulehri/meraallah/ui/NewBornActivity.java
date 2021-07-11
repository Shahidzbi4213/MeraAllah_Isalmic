package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.ViewPagerAdapterChild;
import com.edu.pk.gulehri.meraallah.databinding.ActivityNewBornBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class NewBornActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private ActivityNewBornBinding binding;
    private ViewPagerAdapterChild adapterChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewBornBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        setAdapter();
        setListeners();
    }


    @SuppressLint("SetTextI18n")
    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeNewBorn.mToolbar);
            binding.toolbarIncludeNewBorn.mToolbar.setElevation(0);
            binding.toolbarIncludeNewBorn.toolbarImageFirst.setVisibility(View.GONE);
            binding.toolbarIncludeNewBorn.toolbarImageSecond.setVisibility(View.GONE);
            binding.toolbarIncludeNewBorn.toolbarText.setText("Practices for Newborn child");

            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.START;
            binding.toolbarIncludeNewBorn.toolbarText.setLayoutParams(params);
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

    private void setListeners() {
        binding.tBNewBorn.addOnTabSelectedListener(this);
        binding.vPNewBorn.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tBNewBorn));
    }

    private void setAdapter() {
        adapterChild = new ViewPagerAdapterChild(getSupportFragmentManager(), binding.tBNewBorn.getTabCount());
        binding.vPNewBorn.setAdapter(adapterChild);
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        int tabPosition = tab.getPosition();
        binding.vPNewBorn.setCurrentItem(tabPosition);

        if (tabPosition == 0 || tabPosition == 1) {
            adapterChild.notifyDataSetChanged();
        }

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}