package com.edu.pk.gulehri.meraallah.ui;

import android.content.Intent;
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
import com.edu.pk.gulehri.meraallah.adapters.QuranViewer;
import com.edu.pk.gulehri.meraallah.databinding.ActivityShowQuranBinding;
import com.edu.pk.gulehri.meraallah.model.Arabic;
import com.edu.pk.gulehri.meraallah.model.SurahList;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShowQuran extends AppCompatActivity {

    private static int CHAPTER;
    private final ArrayList<Arabic> quranArabic = new ArrayList<>();
    private final ArrayList<Arabic> quranUrdu = new ArrayList<>();
    private final ArrayList<Arabic> quranEnglish = new ArrayList<>();
    private List<SurahList> surahList;
    private ActivityShowQuranBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShowQuranBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setToolbar();
        getValues();
        setAdapter();

    }

    private void setToolbar() {
        try {
            setSupportActionBar(binding.sTBar.mToolbar);
            binding.sTBar.mToolbar.setElevation(0);
            binding.sTBar.toolbarImageFirst.setVisibility(View.GONE);
            binding.sTBar.toolbarImageSecond.setVisibility(View.GONE);
            binding.sTBar.toolbarText.setText(surahList.get(CHAPTER).getName());
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.sTBar.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void getValues() {
        Intent intent = getIntent();
        String itemText = intent.getStringExtra("itemName");
        String sList = intent.getStringExtra("sList");

        Gson gson = new Gson();
        Type type = new TypeToken<List<SurahList>>() {
        }.getType();
        surahList = gson.fromJson(sList, type);

        CHAPTER = findPosition((ArrayList<SurahList>) surahList, itemText);
    }

    private int findPosition(ArrayList<SurahList> arr, String text) {
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

    private void setAdapter() {
        try {
            binding.showQuranView.setLayoutManager(new LinearLayoutManager(this));
            binding.showQuranView.setAdapter(new QuranViewer(this, getQuranArabic(), getQuranUrdu(), getQuranEnglish()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Arabic> getQuranArabic() throws IOException, JSONException {
        String json;
        InputStream stream = getAssets().open("quran.json");
        int size = stream.available();

        byte[] buffer = new byte[size];
        stream.read(buffer);
        stream.close();

        json = new String(buffer, StandardCharsets.UTF_8);
        JSONObject object = new JSONObject(json);
        JSONArray array = object.getJSONArray(String.valueOf(CHAPTER));

        for (int i = 0; i < array.length(); i++) {

            JSONObject metaData = array.getJSONObject(i);
            final String verseNumber = metaData.getString("verse");
            final String verse = metaData.getString("text");

            final Arabic arabic = new Arabic(verseNumber, verse);
            quranArabic.add(arabic);
        }

        return quranArabic;
    }

    private List<Arabic> getQuranUrdu() throws IOException, JSONException {

        String json;
        InputStream stream = getAssets().open("quran_urdu.json");
        int size = stream.available();

        byte[] buffer = new byte[size];
        stream.read(buffer);
        stream.close();

        json = new String(buffer, StandardCharsets.UTF_8);
        JSONObject object = new JSONObject(json);
        JSONArray array = object.getJSONArray(String.valueOf(CHAPTER));

        for (int i = 0; i < array.length(); i++) {

            JSONObject metaData = array.getJSONObject(i);
            final String verseNumber = metaData.getString("verse");
            final String verse = metaData.getString("text");

            final Arabic arabic = new Arabic(verseNumber, verse, 1);
            quranUrdu.add(arabic);
        }

        return quranUrdu;
    }

    private List<Arabic> getQuranEnglish() throws JSONException, IOException {

        String json;
        InputStream stream = getAssets().open("quran_urdu.json");
        int size = stream.available();

        byte[] buffer = new byte[size];
        stream.read(buffer);
        stream.close();

        json = new String(buffer, StandardCharsets.UTF_8);
        JSONObject object = new JSONObject(json);
        JSONArray array = object.getJSONArray(String.valueOf(CHAPTER));

        for (int i = 0; i < array.length(); i++) {

            JSONObject metaData = array.getJSONObject(i);
            final String verseNumber = metaData.getString("verse");
            final String verse = metaData.getString("text");

            final Arabic arabic = new Arabic(verseNumber, verse, 1.0);
            quranEnglish.add(arabic);
        }

        return quranEnglish;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}