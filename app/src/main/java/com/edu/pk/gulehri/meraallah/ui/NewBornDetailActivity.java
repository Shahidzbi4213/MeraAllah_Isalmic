package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.NewChildAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityNewBornDetailBinding;
import com.edu.pk.gulehri.meraallah.model.DataModel;

import java.util.Objects;

public class NewBornDetailActivity extends AppCompatActivity {
    private ActivityNewBornDetailBinding binding;
    private int position;
    private String language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewBornDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getValues();
        setToolBar();
        setTextJustification();
        setValues();
    }

    @SuppressLint("InlinedApi")
    private void setTextJustification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            binding.detailNBU.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
            binding.detailNBE.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        }
    }

    @SuppressLint("SetTextI18n")
    private void setValues() {
        if (language.equals("Urdu")) {
            binding.detailNBU.setText("تفصیل:" + " " + DataModel.NEWBORN_CHILD[position].getCHILD_BORN_DETAIL_URDU());
            binding.detailNBE.setVisibility(View.GONE);
        }
        if (language.equals("English")) {
            binding.detailNBE.setText("Explanation:" + " " + DataModel.NEWBORN_CHILD[position].getCHILD_BORN_DETAIL_ENGLISH());
            binding.detailNBU.setVisibility(View.GONE);
        }
    }

    private void getValues() {
        Intent intent = getIntent();
        position = intent.getIntExtra(NewChildAdapter.POSITION, 0);
        language = intent.getStringExtra(NewChildAdapter.USER_LANGUAGE);
    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeNewBornDetail.mToolbar);
            binding.toolbarIncludeNewBornDetail.mToolbar.setElevation(0);
            binding.toolbarIncludeNewBornDetail.toolbarImageFirst.setVisibility(View.GONE);
            binding.toolbarIncludeNewBornDetail.toolbarImageSecond.setVisibility(View.GONE);

            if (language.equals("English")) {
                binding.toolbarIncludeNewBornDetail.toolbarText.setText(DataModel.NEWBORN_CHILD[position].getCHILD_HEADING_ENGLISH());
            } else if (language.equals("Urdu")) {
                binding.toolbarIncludeNewBornDetail.toolbarText.setText(DataModel.NEWBORN_CHILD[position].getCHILD_HEADING_URDU());
            }
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeNewBornDetail.toolbarText.setLayoutParams(params);
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