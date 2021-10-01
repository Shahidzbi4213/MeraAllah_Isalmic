package com.edu.pk.gulehri.meraallah.ui;

import static android.graphics.text.LineBreaker.BREAK_STRATEGY_BALANCED;
import static android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.NamazAdapter;
import com.edu.pk.gulehri.meraallah.databinding.ActivityNamazDetailBinding;
import com.edu.pk.gulehri.meraallah.model.Model;

import java.util.Objects;

public class NamazDetailActivity extends AppCompatActivity {
    /**
     * vars
     */
    @Nullable
    private String NAME;
    private int POSITION;
    @Nullable
    private String LANGUAGE;

    private ActivityNamazDetailBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNamazDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        getValues();
        setToolbar();
        setTextJustification();
        setValues();
    }


    private void getValues() {
        //getting Intents
        Intent intent = getIntent();
        NAME = intent.getStringExtra(NamazAdapter.TITLE);
        POSITION = intent.getIntExtra(NamazAdapter.POSITION, 0);
        LANGUAGE = intent.getStringExtra(NamazAdapter.LANGUAGE);

    }

    @SuppressLint("InlinedApi")
    private void setTextJustification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            binding.namazProcess.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            binding.namaz.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            binding.namazTranslation.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            binding.transliteration.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            binding.namazProcess.setBreakStrategy(BREAK_STRATEGY_BALANCED);
            binding.namaz.setBreakStrategy(BREAK_STRATEGY_BALANCED);
            binding.namazTranslation.setBreakStrategy(BREAK_STRATEGY_BALANCED);
            binding.transliteration.setBreakStrategy(BREAK_STRATEGY_BALANCED);
        }
    }

    private void setToolbar() {
        try {
            setSupportActionBar(binding.toolbarIncludeNamazDetail.mToolbar);
            binding.toolbarIncludeNamazDetail.toolbarImageFirst.setImageResource(0);
            binding.toolbarIncludeNamazDetail.toolbarText.setText(NAME);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarIncludeNamazDetail.toolbarText.setLayoutParams(params);
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

    private void setValues() {

        if (POSITION == 14) {
            binding.namazRakkatTableLayout.setVisibility(View.VISIBLE);
            binding.layoutNamaz.setVisibility(View.GONE);
        } else {
            binding.layoutNamaz.setVisibility(View.VISIBLE);
            binding.namazRakkatTableLayout.setVisibility(View.GONE);

            if (LANGUAGE == null) throw new AssertionError();
            if (LANGUAGE.equals("Urdu")) {

                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
                    binding.transliteration.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                    binding.namazProcess.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._20sdp));
                    binding.namazTranslation.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._20sdp));
                }
                binding.namazProcess.setText(Model.NAMAZ[POSITION].getSTEPS_URDU());
                binding.namaz.setText(Model.NAMAZ[POSITION].getNAMAZ_ARABIC());
                binding.namazTranslation.setText(String.format("%s %s ", binding.namazTranslation.getText().toString(), Model.NAMAZ[POSITION].getNAMAZ_URDU()));
                binding.transliteration.setText(String.format("%s %s ", binding.transliteration.getText().toString(), Model.NAMAZ[POSITION].getTRANSLITERATION()));
                binding.processImage.setImageResource(Model.NAMAZ[POSITION].getPROCESS_IMAGE());

            } else if (LANGUAGE.equals("English")) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    Typeface t = ResourcesCompat.getFont(this, R.font.catamaran_medium);
                    binding.namazProcess.setTypeface(t);
                    binding.namazTranslation.setTypeface(t);
                    binding.transliteration.setTypeface(t);
                } else {
                    binding.namazProcess.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                    binding.transliteration.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                    binding.namazTranslation.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                }

                binding.namazProcess.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._16sdp));
                binding.namazTranslation.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._16sdp));


                binding.namazProcess.setText(Model.NAMAZ[POSITION].getSTEPS_ENGLISH());
                binding.namaz.setText(Model.NAMAZ[POSITION].getNAMAZ_ARABIC());
                binding.namazTranslation.setText(String.format("Translation: %s ", Model.NAMAZ[POSITION].getNAMAZ_ENGLISH()));
                binding.transliteration.setText(String.format("%s %s ", binding.transliteration.getText().toString(), Model.NAMAZ[POSITION].getTRANSLITERATION()));
                binding.processImage.setImageResource(Model.NAMAZ[POSITION].getPROCESS_IMAGE());
            }
        }
    }
}