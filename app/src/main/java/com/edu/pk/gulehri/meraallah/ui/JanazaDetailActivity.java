package com.edu.pk.gulehri.meraallah.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.JanazaDetailAdapter;
import com.edu.pk.gulehri.meraallah.constansts.Constants;
import com.edu.pk.gulehri.meraallah.databinding.ActivityJanazaDetailBinding;
import com.edu.pk.gulehri.meraallah.model.DataModel;

import java.util.Objects;

import static com.edu.pk.gulehri.meraallah.adapters.JanazaAdapter.ITEM_POSITION;
import static com.edu.pk.gulehri.meraallah.adapters.JanazaAdapter.SELECTED_LANGUAGE;

public class JanazaDetailActivity extends AppCompatActivity {

    private ActivityJanazaDetailBinding binding;
    private String language;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJanazaDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        getValues();
        setAdapter();

        Log.i(Constants.TAG, "" + DataModel.FUNERAL_PRAYER_PROCESS[0].getFUNERAL_PRAYER_PROCESS_IN_ENGLISH());
    }

    private void setAdapter() {
        binding.recycleViewJanazaDetail.setLayoutManager(new LinearLayoutManager(this));
        binding.recycleViewJanazaDetail.setAdapter(new JanazaDetailAdapter(position, language));
    }

    private void getValues() {
        Intent intent = getIntent();
        language = intent.getStringExtra(SELECTED_LANGUAGE);
        position = intent.getIntExtra(ITEM_POSITION, 0);


    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeJanazaDetail.mToolbar);
            binding.toolbarIncludeJanazaDetail.mToolbar.setElevation(0);

            binding.toolbarIncludeJanazaDetail.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeJanazaDetail.toolbarImageSecond.setImageResource(0);
            binding.toolbarIncludeJanazaDetail.toolbarText.setText(R.string.janaza_Detail);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams
                    (Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeJanazaDetail.toolbarText.setLayoutParams(params);
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
}