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
import com.edu.pk.gulehri.meraallah.adapters.QaidaAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityQaidaViewerBinding;
import com.edu.pk.gulehri.meraallah.model.DataModel;
import com.github.barteksc.pdfviewer.util.FitPolicy;

import java.io.File;
import java.util.Objects;

public class QaidaViewerActivity extends AppCompatActivity {

    private ActivityQaidaViewerBinding binding;
    private int itemPosition;
    private File qaidaFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQaidaViewerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setToolBar();
        getValues();
        setPdfViewer();
    }

    private void getValues() {
        Intent intent = getIntent();
        itemPosition = intent.getIntExtra(QaidaAdapter.ITEM_CLICKED_POSITION, 0);

        String path = "/storage/emulated/0/Android/data/com.edu.pk.gulehri.meraallah/files/Android/Qaida.pdf";
        qaidaFile = new File(path);

    }


    private void setPdfViewer() {
        try {
            int jumpPage = Integer.parseInt(DataModel.NOORANI_QAIDA[itemPosition].getPAGE_NO()) - 1;

            binding.qaidaPdfViewer.fromFile(qaidaFile)
                    .swipeHorizontal(false)
                    .fitEachPage(true)
                    .spacing(7)
                    .pageFitPolicy(FitPolicy.BOTH)
                    .enableAntialiasing(true)
                    .defaultPage(jumpPage)
                    .load();
            binding.qaidaPdfViewer.useBestQuality(true);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void setToolBar() {
        try {
            setSupportActionBar(binding.includeQaidaDetail.mToolbar);
            binding.includeQaidaDetail.mToolbar.setElevation(0);

            binding.includeQaidaDetail.toolbarImageFirst.setImageResource(0);
            binding.includeQaidaDetail.toolbarImageSecond.setImageResource(0);
            binding.includeQaidaDetail.toolbarText.setText(R.string.qaida);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.includeQaidaDetail.toolbarText.setLayoutParams(params);
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
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}