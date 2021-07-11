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
import com.edu.pk.gulehri.meraallah.adapters.TasbeehAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityTasbeehBinding;

public class TasbeehActivity extends AppCompatActivity {

    /**
     * vars
     */
    private ActivityTasbeehBinding tasbeehBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasbeehBinding = ActivityTasbeehBinding.inflate(getLayoutInflater());
        View view = tasbeehBinding.getRoot();
        setContentView(view);

        setToolbar();
        setRecycleViewAdaptor();
    }


    private void setToolbar() {

        setSupportActionBar(tasbeehBinding.toolbarIncludeTasbeeh.mToolbar);
        tasbeehBinding.toolbarIncludeTasbeeh.mToolbar.setElevation(0);
        tasbeehBinding.toolbarIncludeTasbeeh.toolbarText.setText(R.string.tasbeeh);
        tasbeehBinding.toolbarIncludeTasbeeh.toolbarImageFirst.setImageResource(0);

        try {
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            tasbeehBinding.toolbarIncludeTasbeeh.toolbarText.setLayoutParams(params);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return true;
    }


    private void setRecycleViewAdaptor() {
        tasbeehBinding.tasbeehSupplications.setLayoutManager(new LinearLayoutManager(this));
        tasbeehBinding.tasbeehSupplications.setAdapter(new TasbeehAdapter(this));
    }
}