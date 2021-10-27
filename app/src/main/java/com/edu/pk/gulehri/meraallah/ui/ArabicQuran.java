package com.edu.pk.gulehri.meraallah.ui;

import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.Q;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.ArabicAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityArabicQuranBinding;
import com.edu.pk.gulehri.meraallah.model.SurahList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;

public class ArabicQuran extends AppCompatActivity implements SearchView.OnQueryTextListener {

    private final ArrayList<SurahList> surahList = new ArrayList<>();
    private ActivityArabicQuranBinding binding;
    private ArabicAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityArabicQuranBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        setAdapter();
    }


    private void setToolBar() {
        try {
            setSupportActionBar(binding.arBar.mToolbar);
            binding.arBar.mToolbar.setElevation(0);
            binding.arBar.toolbarImageFirst.setVisibility(View.GONE);
            binding.arBar.toolbarImageSecond.setVisibility(View.GONE);
            binding.arBar.toolbarText.setText(R.string.holy_quran);

            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.arBar.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void setAdapter() {

        try {
            binding.arrView.setLayoutManager(new LinearLayoutManager(this));
            adapter = new ArabicAdapter(readFromJson());
            binding.arrView.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ArrayList<SurahList> readFromJson() throws IOException, JSONException {

        String json;
        InputStream stream = getAssets().open("surah_list.json");
        int size = stream.available();

        byte[] buffer = new byte[size];
        stream.read(buffer);
        stream.close();

        json = new String(buffer, StandardCharsets.UTF_8);
        JSONObject object = new JSONObject(json);
        JSONArray array = object.getJSONArray("data");

        for (int i = 0; i < array.length(); i++) {

            JSONObject metaData = array.getJSONObject(i);

            final String name = metaData.getString("name");
            final String englishName = metaData.getString("englishName");
            final String englishNameTranslation = metaData.getString("englishNameTranslation");
            final String numberOfAyahs = String.valueOf(metaData.getInt("numberOfAyahs"));
            final String type = metaData.getString("revelationType");

            final SurahList listOfSurah = new SurahList(name, englishName, englishNameTranslation, numberOfAyahs, type);
            surahList.add(listOfSurah);
        }
        return surahList;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.options_menu, menu);

        MenuItem menuItem = menu.findItem(R.id.search_ico);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(this);

        EditText txtSearch = searchView.findViewById(androidx.appcompat.R.id.search_src_text);
        ImageView imageClose = searchView.findViewById(androidx.appcompat.R.id.search_close_btn);
        ImageView imageSearch = searchView.findViewById(androidx.appcompat.R.id.search_button);

        try {
            @SuppressLint("SoonBlockedPrivateApi") Field field = TextView.class.getDeclaredField("mCursorDrawableRes");
            field.setAccessible(true);
            field.set(txtSearch, R.drawable.my_cursor);
        } catch (Exception e) {
            e.printStackTrace();
        }

        imageClose.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        imageSearch.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        txtSearch.setHint("Search Surah");

        if (SDK_INT >= Q) {
            txtSearch.setTextCursorDrawable(R.drawable.my_cursor);
        }
        txtSearch.setHintTextColor(Color.LTGRAY);
        txtSearch.setTextColor(Color.WHITE);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.filter(newText);
        return false;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}