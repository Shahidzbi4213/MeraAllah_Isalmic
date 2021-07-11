package com.edu.pk.gulehri.meraallah.ui;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.MenuAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityMainBinding;
import com.edu.pk.gulehri.meraallah.databinding.SampleDialogBinding;
import com.edu.pk.gulehri.meraallah.model.Model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.Q;


public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    /**
     * Vars
     */
    private ActivityMainBinding binding;
    private SampleDialogBinding dialogBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setRecycleViewAdapter();
        setToolbar();

    }

    private void setRecycleViewAdapter() {
        binding.menu.setLayoutManager(new GridLayoutManager(this, 2));
        binding.menu.setAdapter(new MenuAdapter(this, Arrays.asList(Model.MENU)));
        binding.menu.setNestedScrollingEnabled(false);
    }


    private void setToolbar() {

        try {
            setSupportActionBar(binding.toolbarInclude.mToolbar);
            binding.toolbarInclude.toolbarText.setText(R.string.menu);
            binding.toolbarInclude.toolbarImageFirst.setImageResource(0);

            /*Bringing Text To Center*/
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarInclude.toolbarText.setLayoutParams(params);

            getSupportActionBar().setDisplayShowTitleEnabled(false);


            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }


    private void setAlertDialog() {

        dialogBinding = SampleDialogBinding.inflate(getLayoutInflater());

        //Taking Reference of Alert Dialog
        //Giving Xml View To our Alert Dialog
        AlertDialog builder = new AlertDialog.Builder(this).setView(dialogBinding.getRoot())
                .setCancelable(false).create();

        //setting Background Transparent
        builder.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        builder.getWindow().setWindowAnimations(R.style.DialogAnimation);

        dialogBinding.yesBtn.setOnClickListener(v -> finishAffinity());
        dialogBinding.noBtn.setOnClickListener(v -> builder.dismiss());

        builder.show();
    }

    @Override
    public void onBackPressed() {
        setAlertDialog();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
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
            Field field = TextView.class.getDeclaredField("mCursorDrawableRes");
            field.setAccessible(true);
            field.set(txtSearch, R.drawable.my_cursor);
        } catch (Exception e) {
            e.printStackTrace();
        }

        imageClose.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        imageSearch.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        txtSearch.setHint(getResources().getString(R.string.search_menu));

        if (SDK_INT >= Q) {
            txtSearch.setTextCursorDrawable(R.drawable.my_cursor);
        }
        txtSearch.setHintTextColor(Color.LTGRAY);
        txtSearch.setTextColor(Color.WHITE);


        return super.onCreateOptionsMenu(menu);
    }

    private List<Model> searchItem(String newText) {
        //Text userType in searchBar
        String userInput = newText.toLowerCase();

        ArrayList<Model> itemNames = new ArrayList<>();

        //Convert Array to list
        List<Model> itemList = new ArrayList<>(Arrays.asList(Model.MENU));

        try {
            //Array Iteration || Array Traverse
            for (Model MenuData : itemList) {
                if (MenuData.getMENU_NAME().toLowerCase().contains(userInput)) {
                    itemNames.add(MenuData);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemNames;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        List<Model> menuModel = searchItem(newText);
        binding.menu.setAdapter(new MenuAdapter(this, menuModel));
        return true;
    }
}