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
import com.edu.pk.gulehri.meraallah.adapters.HajjAdapter;
import com.edu.pk.gulehri.meraallah.adapters.HajjDetailAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityHajjDetailBinding;

import java.util.Objects;

public class HajjDetailActivity extends AppCompatActivity {

    private ActivityHajjDetailBinding hajjDetailBinding;
    private int ItemPosition;
    private String SelectedLanguage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hajjDetailBinding = ActivityHajjDetailBinding.inflate(getLayoutInflater());
        setContentView(hajjDetailBinding.getRoot());

        getValues();
        setToolBar();
        setAdapter();
    }

    private void getValues() {
        Intent intent = getIntent();
        ItemPosition = intent.getIntExtra(HajjAdapter.POSITION, 0);
        SelectedLanguage = intent.getStringExtra(HajjAdapter.LANGUAGE);
    }

    private void setAdapter() {
        hajjDetailBinding.hajjDetailRecycleView.setLayoutManager(new LinearLayoutManager(this));
        hajjDetailBinding.hajjDetailRecycleView.setAdapter(new HajjDetailAdapter(ItemPosition, SelectedLanguage));
    }

    private void setToolBar() {
        setSupportActionBar(hajjDetailBinding.toolbarIncludeHajjDetail.mToolbar);
        hajjDetailBinding.toolbarIncludeHajjDetail.mToolbar.setElevation(0);
        hajjDetailBinding.toolbarIncludeHajjDetail.toolbarText.setText(R.string.hajj);
        hajjDetailBinding.toolbarIncludeHajjDetail.toolbarImageFirst.setImageResource(0);

        try {
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            hajjDetailBinding.toolbarIncludeHajjDetail.toolbarText.setLayoutParams(params);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            Objects.requireNonNull(getSupportActionBar()).setHomeAsUpIndicator(drawable);
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