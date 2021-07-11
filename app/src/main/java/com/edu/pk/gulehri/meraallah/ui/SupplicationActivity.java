package com.edu.pk.gulehri.meraallah.ui;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.ViewPagerAdapterSupplications;
import com.edu.pk.gulehri.meraallah.databinding.ActivitySupplicationBinding;
import com.edu.pk.gulehri.meraallah.fragments.FragmentEnglishSupplications;
import com.edu.pk.gulehri.meraallah.fragments.FragmentUrduSupplications;
import com.edu.pk.gulehri.meraallah.model.Model;
import com.google.android.material.tabs.TabLayout;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.Q;

public class SupplicationActivity extends AppCompatActivity
        implements TabLayout.OnTabSelectedListener, SearchView.OnQueryTextListener {


    /**
     * Vars
     */
    private ViewPagerAdapterSupplications viewPagerAdapterSupplications;
    private ActivitySupplicationBinding supplicationBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supplicationBinding = ActivitySupplicationBinding.inflate(getLayoutInflater());
        setContentView(supplicationBinding.getRoot());

        setToolbar();
        setAdaptor();
        setListeners();
    }

    private void setListeners() {
        supplicationBinding.tabLayoutDua.addOnTabSelectedListener(this);
        supplicationBinding.viewPagerDua.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(supplicationBinding.tabLayoutDua));
    }

    private void setAdaptor() {
        viewPagerAdapterSupplications = new ViewPagerAdapterSupplications(getSupportFragmentManager(), supplicationBinding.tabLayoutDua.getTabCount());
        supplicationBinding.viewPagerDua.setAdapter(viewPagerAdapterSupplications);
    }


    private void setToolbar() {
        try {
            setSupportActionBar(supplicationBinding.toolbarIncludeSupplication.mToolbar);
            supplicationBinding.toolbarIncludeSupplication.mToolbar.setElevation(0);
            supplicationBinding.toolbarIncludeSupplication.toolbarImageFirst.setImageResource(0);
            supplicationBinding.toolbarIncludeSupplication.toolbarImageFirst.setVisibility(View.GONE);
            supplicationBinding.toolbarIncludeSupplication.toolbarImageSecond.setVisibility(View.GONE);
            supplicationBinding.toolbarIncludeSupplication.toolbarText.setText(R.string.supplications);

            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.START;
            supplicationBinding.toolbarIncludeSupplication.toolbarText.setLayoutParams(params);
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

    @Override
    public void onTabSelected(@NonNull TabLayout.Tab tab) {
        int tabPosition = tab.getPosition();
        supplicationBinding.viewPagerDua.setCurrentItem(tabPosition);

        if (tabPosition == 0 || tabPosition == 1) {
            viewPagerAdapterSupplications.notifyDataSetChanged();
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Menu Added
        getMenuInflater().inflate(R.menu.options_menu, menu);
        //Find Specific Item From Menu
        MenuItem menuItem = menu.findItem(R.id.search_ico);
        //What will the Search icon do
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(this);

        EditText txtSearch = searchView.findViewById(androidx.appcompat.R.id.search_src_text);
        ImageView imageClose = searchView.findViewById(androidx.appcompat.R.id.search_close_btn);
        ImageView imageSearch = searchView.findViewById(androidx.appcompat.R.id.search_button);

        try {
            Field field = TextView.class.getDeclaredField("mCursorDrawableRes");
            field.setAccessible(true);
            field.set(txtSearch, R.drawable.my_cursor);
        } catch (Exception e) {
            e.printStackTrace();
        }

        imageClose.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        imageSearch.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        txtSearch.setHint(getResources().getString(R.string.search_title));

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

        String userInput = newText.toLowerCase();

        ArrayList<Model> duaList = new ArrayList<>();
        List<Model> arrayList = new ArrayList<>(Arrays.asList(Model.SUPPLICATIONS));

        for (Model supplications : arrayList) {

            if (supplications.getDUA_ENGLISH().toLowerCase().contains(userInput)
                    && supplicationBinding.viewPagerDua.getCurrentItem() == 0) {
                duaList.add(supplications);

            } else if (supplications.getDUA_URDU().toLowerCase().contains(userInput) &&
                    supplicationBinding.viewPagerDua.getCurrentItem() == 1) {
                duaList.add(supplications);
            }

        }

        FragmentEnglishSupplications.supplicationAdapter.updateDataList(duaList);
        FragmentUrduSupplications.supplicationAdapter.updateDataList(duaList);

        return true;
    }


}