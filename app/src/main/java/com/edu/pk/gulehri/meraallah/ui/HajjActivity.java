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
import com.edu.pk.gulehri.meraallah.adapters.ViewPagerHajjAdaptor;
import com.edu.pk.gulehri.meraallah.databinding.ActivityHajjBinding;
import com.google.android.material.tabs.TabLayout;

public class HajjActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private ActivityHajjBinding hajjBinding;
    private ViewPagerHajjAdaptor pagerHajjAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hajjBinding = ActivityHajjBinding.inflate(getLayoutInflater());
        setContentView(hajjBinding.getRoot());

        setToolbar();
        setListeners();
        setAdaptor();
    }

    private void setAdaptor() {
        pagerHajjAdaptor = new ViewPagerHajjAdaptor(getSupportFragmentManager(), hajjBinding.hajjTabLayout.getTabCount());
        hajjBinding.hajjViewPager.setAdapter(pagerHajjAdaptor);
    }

    private void setListeners() {
        hajjBinding.hajjTabLayout.addOnTabSelectedListener(this);
        hajjBinding.hajjViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(hajjBinding.hajjTabLayout));
    }

    private void setToolbar() {
        setSupportActionBar(hajjBinding.toolbarIncludeHajj.mToolbar);
        hajjBinding.toolbarIncludeHajj.mToolbar.setElevation(0);
        hajjBinding.toolbarIncludeHajj.toolbarText.setText(R.string.hajj);
        hajjBinding.toolbarIncludeHajj.toolbarImageFirst.setImageResource(0);
        hajjBinding.toolbarIncludeHajj.toolbarImageSecond.setImageResource(0);

        try {
            final Drawable drawable = ContextCompat.getDrawable(this, R.drawable.back_arrow);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);

            /*Bringing Text To Center*/
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.START;
            hajjBinding.toolbarIncludeHajj.toolbarText.setLayoutParams(params);

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
        hajjBinding.hajjViewPager.setCurrentItem(tab.getPosition());
        if (tab.getPosition() == 0 || tab.getPosition() == 1) {
            pagerHajjAdaptor.notifyDataSetChanged();
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}