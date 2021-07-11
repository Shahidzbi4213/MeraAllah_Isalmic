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
import com.edu.pk.gulehri.meraallah.adapters.ViewPagerAdapterJanaza;
import com.edu.pk.gulehri.meraallah.databinding.ActivityJanazaBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class JanazaActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private ActivityJanazaBinding binding;
    private ViewPagerAdapterJanaza janazaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJanazaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        setAdapter();
        setListener();
    }

    private void setAdapter() {
        janazaAdapter = new ViewPagerAdapterJanaza(getSupportFragmentManager(), binding.tabLayoutJanaza.getTabCount());
        binding.viewPagerJanaza.setAdapter(janazaAdapter);
    }

    private void setListener() {
        binding.tabLayoutJanaza.addOnTabSelectedListener(this);
        binding.viewPagerJanaza.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabLayoutJanaza));
    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeJanaza.mToolbar);
            binding.toolbarIncludeJanaza.mToolbar.setElevation(0);

            binding.toolbarIncludeJanaza.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeJanaza.toolbarImageSecond.setImageResource(0);
            binding.toolbarIncludeJanaza.toolbarText.setText(R.string.janaza);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.START;
            binding.toolbarIncludeJanaza.toolbarText.setLayoutParams(params);
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
        int pos = tab.getPosition();
        binding.viewPagerJanaza.setCurrentItem(pos);

        if ((pos == 0) || (pos == 1)) {
            janazaAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}