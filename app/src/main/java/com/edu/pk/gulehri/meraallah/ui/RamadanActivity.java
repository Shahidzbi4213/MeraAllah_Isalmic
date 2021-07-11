package com.edu.pk.gulehri.meraallah.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.ViewPagerAdapterRamadan;
import com.edu.pk.gulehri.meraallah.databinding.ActivityRamadanBinding;
import com.google.android.material.tabs.TabLayout;

public class RamadanActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {


    /**
     * Vars
     */
    private ActivityRamadanBinding ramadanBinding;
    private ViewPagerAdapterRamadan adapterRamadan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ramadanBinding = ActivityRamadanBinding.inflate(getLayoutInflater());
        setContentView(ramadanBinding.getRoot());


        setToolbar();
        setAdapters();
        setListeners();


    }

    private void setListeners() {

        ramadanBinding.ramadanTabLayout.addOnTabSelectedListener(this);
        ramadanBinding.viewPagerRamadan.addOnPageChangeListener
                (new TabLayout.TabLayoutOnPageChangeListener(ramadanBinding.ramadanTabLayout));

    }

    private void setAdapters() {
        adapterRamadan = new ViewPagerAdapterRamadan(getSupportFragmentManager(), ramadanBinding.ramadanTabLayout.getTabCount());
        ramadanBinding.viewPagerRamadan.setAdapter(adapterRamadan);
    }


    private void setToolbar() {
        setSupportActionBar(ramadanBinding.toolbarIncludeRamadan.mToolbar);
        ramadanBinding.toolbarIncludeRamadan.mToolbar.setElevation(0);
        ramadanBinding.toolbarIncludeRamadan.toolbarText.setText("Fasting");
        ramadanBinding.toolbarIncludeRamadan.toolbarImageFirst.setImageResource(0);
        try {
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.START;
            ramadanBinding.toolbarIncludeRamadan.toolbarText.setLayoutParams(params);
            final Drawable drawable = ContextCompat.getDrawable(this, R.drawable.back_arrow);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        ramadanBinding.viewPagerRamadan.setCurrentItem(tab.getPosition());

        if ((tab.getPosition() == 0) || (tab.getPosition() == 1)) {
            adapterRamadan.notifyDataSetChanged();
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