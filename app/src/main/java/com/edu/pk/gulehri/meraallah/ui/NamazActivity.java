package com.edu.pk.gulehri.meraallah.ui;

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
import com.edu.pk.gulehri.meraallah.adapters.ViewPagerAdapterNamaz;
import com.edu.pk.gulehri.meraallah.databinding.ActivityNamazBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class NamazActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    /**
     * Vars
     */
    private ActivityNamazBinding namazBinding;
    private ViewPagerAdapterNamaz adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        namazBinding = ActivityNamazBinding.inflate(getLayoutInflater());
        setContentView(namazBinding.getRoot());

        setToolbar();
        setAdaptor();
        setListeners();


    }


    private void setAdaptor() {
        adapter = new ViewPagerAdapterNamaz(getSupportFragmentManager(), namazBinding.tabLayout.getTabCount());
        namazBinding.viewPager.setAdapter(adapter);
    }

    @Override
    public void onTabSelected(@NonNull TabLayout.Tab tab) {
        int tabPosition = tab.getPosition();
        namazBinding.viewPager.setCurrentItem(tabPosition);

        if (tabPosition == 0 || tabPosition == 1) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }

    private void setListeners() {
        namazBinding.tabLayout.addOnTabSelectedListener(this);
        namazBinding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener
                (namazBinding.tabLayout));
    }

    private void setToolbar() {
        try {
            setSupportActionBar(namazBinding.toolbarIncludeNamaz.mToolbar);
            namazBinding.toolbarIncludeNamaz.mToolbar.setElevation(0);

            namazBinding.toolbarIncludeNamaz.toolbarImageFirst.setImageResource(0);
            namazBinding.toolbarIncludeNamaz.toolbarText.setText(R.string.namaz);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.START;
            namazBinding.toolbarIncludeNamaz.toolbarText.setLayoutParams(params);
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
