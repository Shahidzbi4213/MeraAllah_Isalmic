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

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.SurahNamesAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityQuranFifteenBinding;
import com.edu.pk.gulehri.meraallah.model.DataModel;
import com.edu.pk.gulehri.meraallah.model.SurahList;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class QuranFifteenActivity extends AppCompatActivity {

    private ActivityQuranFifteenBinding binding;
    private int position;
    private File file;
    private List<SurahList> surahList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuranFifteenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        getValues();
        setPdfViewer();
    }


    private void setToolBar() {
        try {
            setSupportActionBar(binding.includeToolbarQuranFifteen.mToolbar);
            binding.includeToolbarQuranFifteen.mToolbar.setElevation(0);

            binding.includeToolbarQuranFifteen.toolbarImageFirst.setImageResource(0);
            binding.includeToolbarQuranFifteen.toolbarImageSecond.setImageResource(0);
            binding.includeToolbarQuranFifteen.toolbarText.setText(R.string.quranEPak);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.includeToolbarQuranFifteen.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void setPdfViewer() {
        try {
            int jumpPage = Integer.parseInt(DataModel.QURAN_SURAH_PAGES_LIST[position].getSURAH_PAGE_NUMBER()) - 1;

            binding.pdfViewer.fromFile(file)
                    .swipeHorizontal(false)
                    .fitEachPage(true)
                    .spacing(7)
                    .pageFitPolicy(FitPolicy.BOTH)
                    .enableAntialiasing(true)
                    .defaultPage(jumpPage)
                    .load();
            binding.pdfViewer.useBestQuality(true);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private void getValues() {
        Intent intent = getIntent();
        String itemText = intent.getStringExtra(SurahNamesAdapter.ITEM_TEXT);
        String sList = intent.getStringExtra("sList");

        Gson gson = new Gson();
        Type type = new TypeToken<List<SurahList>>() {
        }.getType();
        surahList = gson.fromJson(sList, type);
        String path = "/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Quran.pdf";
        file = new File(path);


        position = findIndex((ArrayList<SurahList>) surahList, itemText);

    }

    private int findIndex(ArrayList<SurahList> arr, String text) {

        int count = 0;
        for (SurahList i : arr) {

            if (i.getEnglishName().equals(text)) {
                return count;
            } else {
                count++;
            }
        }
        return -1;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}