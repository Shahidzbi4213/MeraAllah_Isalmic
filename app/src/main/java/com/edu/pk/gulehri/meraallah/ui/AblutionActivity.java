package com.edu.pk.gulehri.meraallah.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.ViewPagerAdapterAblution;
import com.edu.pk.gulehri.meraallah.databinding.ActivityAblutionBinding;
import com.google.android.material.tabs.TabLayout;

public class AblutionActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {


    private ActivityAblutionBinding ablutionBinding;
    private ViewPagerAdapterAblution adapterAblution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ablutionBinding = ActivityAblutionBinding.inflate(getLayoutInflater());
        setContentView( ablutionBinding.getRoot());


        setToolbar();
        setAdapters();
        setListeners();
    }

    private void setAdapters() {
        adapterAblution = new ViewPagerAdapterAblution(getSupportFragmentManager(),
                ablutionBinding.tabLayoutAblution.getTabCount());
        ablutionBinding.viewPagerAblution.setAdapter(adapterAblution);
    }


    private void setToolbar() {
        setSupportActionBar(ablutionBinding.toolbarIncludeAblution.mToolbar);
        ablutionBinding.toolbarIncludeAblution.mToolbar.setElevation(0);
        ablutionBinding.toolbarIncludeAblution.toolbarText.setText("Ablution");
        ablutionBinding.toolbarIncludeAblution.toolbarImageFirst.setImageResource(0);
        try {
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.START;
            ablutionBinding.toolbarIncludeAblution.toolbarText.setLayoutParams(params);
            final Drawable drawable = ContextCompat.getDrawable(this, R.drawable.back_arrow);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setListeners() {
        ablutionBinding.tabLayoutAblution.addOnTabSelectedListener(this);
        ablutionBinding.viewPagerAblution.addOnPageChangeListener(
                new TabLayout.TabLayoutOnPageChangeListener(ablutionBinding.tabLayoutAblution));
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        ablutionBinding.viewPagerAblution.setCurrentItem(tab.getPosition());
        if (tab.getPosition() == 0 || tab.getPosition() == 1) {
            adapterAblution.notifyDataSetChanged();
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