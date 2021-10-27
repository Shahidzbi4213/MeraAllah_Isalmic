package com.edu.pk.gulehri.meraallah.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import com.edu.pk.gulehri.meraallah.adapters.ShowQuranAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityShowQuranBinding;
import com.edu.pk.gulehri.meraallah.model.Arabic;
import com.edu.pk.gulehri.meraallah.model.SurahList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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

public class ShowQuranActivity extends AppCompatActivity {

    private static int chapter;
    private final ArrayList<SurahList> surahLists = new ArrayList<>();
    private final ArrayList<Arabic> quranArabic = new ArrayList<>();
    private final ArrayList<String> quranUrdu = new ArrayList<>();
    private final ArrayList<String> quranEnglish = new ArrayList<>();
    private String clickItem;
    private String surahName;
    private ActivityShowQuranBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShowQuranBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getValues();
        //Getting Chapter
        chapter = findChapter(surahLists, clickItem);

        //setting Toolbar
        setToolBar();

    }

    @Override
    protected void onResume() {
        super.onResume();

        try {
            getQuranArabic(chapter + 1);
            surahName = surahLists.get(chapter).getName();
            binding.rvShowQuran.setLayoutManager(new LinearLayoutManager(this));
            binding.rvShowQuran.setAdapter(new ShowQuranAdapter(ShowQuranActivity.this, surahName, chapter, quranArabic, quranUrdu, quranEnglish));
            binding.rvShowQuran.clearAnimation();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.tBarShowQuran.mToolbar);

            binding.tBarShowQuran.toolbarImageFirst.setVisibility(View.GONE);
            binding.tBarShowQuran.toolbarImageSecond.setVisibility(View.VISIBLE);
            binding.tBarShowQuran.toolbarImageSecond.setImageResource(R.drawable.ic_settings);
            binding.tBarShowQuran.toolbarImageSecond.setOnClickListener(v -> {
                startActivity(new Intent(ShowQuranActivity.this, QuranSettingActivity.class));
                finish();
            });

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                binding.tBarShowQuran.toolbarText.setTypeface(getResources().getFont(R.font.q_font));
            }
            binding.tBarShowQuran.toolbarText.setText(surahLists.get(chapter).getName());


            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.tBarShowQuran.toolbarText.setLayoutParams(params);

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
        SharedPreferences sharedPreferences = getSharedPreferences("saveList", MODE_PRIVATE);
        final String str = sharedPreferences.getString("list", null);
        clickItem = sharedPreferences.getString("itemName", null);


        final Gson gson = new Gson();
        final Type type = new TypeToken<List<SurahList>>() {
        }.getType();
        surahLists.clear();
        surahLists.addAll(gson.fromJson(str, type));
    }

    private int findChapter(@NonNull ArrayList<SurahList> list, @NonNull String surah) {
        int count = 0;

        for (SurahList s : list) {

            if (s.getEnglishName().equalsIgnoreCase(surah)) {
                return count;
            } else {
                count++;
            }

        }
        return -1;
    }

    private void getQuranArabic(int chapter) throws IOException, JSONException {
        String json;
        InputStream stream = getAssets().open("quran.json");
        int size = stream.available();

        byte[] buffer = new byte[size];
        stream.read(buffer);
        stream.close();

        json = new String(buffer, StandardCharsets.UTF_8);
        JSONObject object = new JSONObject(json);
        JSONArray arabic = object.getJSONArray("arabic");
        JSONArray urdu = object.getJSONArray("urdu");
        JSONArray english = object.getJSONArray("english");


        for (int i = 0; i < arabic.length(); i++) {
            JSONObject metaData = arabic.getJSONObject(i);
            JSONArray data = metaData.getJSONArray(String.valueOf(chapter));

            for (int j = 0; j < data.length(); j++) {
                JSONObject quranData = data.getJSONObject(j);
                final String verseNumber = String.valueOf(quranData.getInt("verse"));
                final String verse = quranData.getString("text");

                final Arabic obj = new Arabic(verseNumber, verse);
                quranArabic.add(obj);
            }


        }
        for (int i = 0; i < urdu.length(); i++) {
            JSONObject metaData = urdu.getJSONObject(i);
            JSONArray data = metaData.getJSONArray(String.valueOf(chapter));

            for (int j = 0; j < data.length(); j++) {
                JSONObject quranData = data.getJSONObject(j);
                final String verse = quranData.getString("text");
                quranUrdu.add(verse);
            }


        }
        for (int i = 0; i < english.length(); i++) {
            JSONObject metaData = english.getJSONObject(i);
            JSONArray data = metaData.getJSONArray(String.valueOf(chapter));

            for (int j = 0; j < data.length(); j++) {
                JSONObject quranData = data.getJSONObject(j);
                final String verse = quranData.getString("text");
                quranEnglish.add(verse);
            }
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