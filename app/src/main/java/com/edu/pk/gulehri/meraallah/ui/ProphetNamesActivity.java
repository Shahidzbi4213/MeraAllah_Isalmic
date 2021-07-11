package com.edu.pk.gulehri.meraallah.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.GridLayoutManager;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.ProphetNamesAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityProphetNamesBinding;

import java.util.Objects;

public class ProphetNamesActivity extends AppCompatActivity {

    private ActivityProphetNamesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProphetNamesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        setAdapter();
    }

    private void setAdapter() {
        binding.prophetNamesRecycleView.setLayoutManager(new GridLayoutManager(this, 3));
        binding.prophetNamesRecycleView.setAdapter(new ProphetNamesAdapter());
    }

    private void setToolBar() {

        try {
            setSupportActionBar(binding.toolbarIncludeProphetNames.mToolbar);
            binding.toolbarIncludeProphetNames.toolbarText.setText(R.string.prophet_names);
            binding.toolbarIncludeProphetNames.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeProphetNames.toolbarImageSecond.setImageResource(0);

            /*Bringing Text To Center*/
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeProphetNames.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);


            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
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