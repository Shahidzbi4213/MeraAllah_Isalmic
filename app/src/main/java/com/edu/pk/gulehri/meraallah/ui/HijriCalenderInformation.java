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
import androidx.recyclerview.widget.LinearLayoutManager;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.HijriInfoAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityHijriCalenderInformationBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HijriCalenderInformation extends AppCompatActivity {

    private ActivityHijriCalenderInformationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHijriCalenderInformationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        setAdapter();
    }


    private void setAdapter() {
        List<String> dataList = new ArrayList<>();
        dataList.add("About Hijri Calender");
        dataList.add("Hijri Calender Days");
        dataList.add("Hijri Calender Months");
        dataList.add("Notable Dates");

        binding.recycleViewHijriInformation.setLayoutManager(new LinearLayoutManager(this));
        binding.recycleViewHijriInformation.setAdapter(new HijriInfoAdapter(dataList));
    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.toolbarIncludeHijriInfor.mToolbar);
            binding.toolbarIncludeHijriInfor.mToolbar.setElevation(0);
            binding.toolbarIncludeHijriInfor.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeHijriInfor.toolbarImageFirst.setVisibility(View.GONE);
            binding.toolbarIncludeHijriInfor.toolbarImageSecond.setVisibility(View.GONE);
            binding.toolbarIncludeHijriInfor.toolbarText.setText(R.string.hijri_calender_info);

            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeHijriInfor.toolbarText.setLayoutParams(params);
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