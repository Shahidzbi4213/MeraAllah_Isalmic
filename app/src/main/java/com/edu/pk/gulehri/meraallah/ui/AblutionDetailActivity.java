package com.edu.pk.gulehri.meraallah.ui;

import static android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.AblutionAdapter;
import com.edu.pk.gulehri.meraallah.model.Model;

public class AblutionDetailActivity extends AppCompatActivity {

    /**
     * Vars
     */
    private Toolbar mToolbar;
    private int pos;
    private String lang, heading;

    /**
     * Widgets
     */
    private TextView toolbarText, ablutionProcess, ablutionDua, ablutionDuaTranslation, ablutionDuaTransliteration;
    private ImageButton toolbarImage;
    private ImageView ablutionProcessImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ablution_detail);

        setReferences();
        getValues();
        setValues();
        setToolBar();
        setTextJustification();

    }

    private void setValues() {

        if (lang == null) throw new AssertionError();

        if (lang.equals("Urdu")) {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
                ablutionDuaTransliteration.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                ablutionProcess.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._20sdp));
                ablutionDuaTranslation.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._20sdp));
            }

            ablutionProcess.setText("طريقه: "+Model.ABLUTION[pos].getABLUTION_PROCESS_URDU());
            ablutionDua.setText("دعا: "+Model.ABLUTION[pos].getABLUTION_DUA());
            ablutionDuaTranslation.setText("ترجمه: " + Model.ABLUTION[pos].getABLUTION_DUA_TRANSLATION_URDU());
            ablutionDuaTransliteration.setText("Transliteration: " + Model.ABLUTION[pos].getABLUTION_DUA_TRANSLITERATION());
            ablutionProcessImage.setImageResource(Model.ABLUTION[pos].getABLUTION_PROCESS_IMAGE_ID());

        } else if (lang.equals("English")) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                Typeface t = ResourcesCompat.getFont(this, R.font.catamaran_medium);
                ablutionProcess.setTypeface(t);
                ablutionDuaTranslation.setTypeface(t);
                ablutionDuaTransliteration.setTypeface(t);
            } else {
                ablutionProcess.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                ablutionDuaTransliteration.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                ablutionDuaTranslation.setTypeface(Typeface.SERIF, Typeface.ITALIC);
            }

            ablutionProcess.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._16sdp));
            ablutionDuaTransliteration.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._16sdp));
            ablutionDuaTranslation.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._16sdp));

            ablutionProcess.setText("Process: "+Model.ABLUTION[pos].getABLUTION_PROCESS_ENGLISH());
            ablutionDua.setText("دعا: "+Model.ABLUTION[pos].getABLUTION_DUA());
            ablutionDuaTranslation.setText("Translation: " + Model.ABLUTION[pos].getABLUTION_DUA_TRANSLATION_ENGLISH());
            ablutionDuaTransliteration.setText("Transliteration: " + Model.ABLUTION[pos].getABLUTION_DUA_TRANSLITERATION());
            ablutionProcessImage.setImageResource(Model.ABLUTION[pos].getABLUTION_PROCESS_IMAGE_ID());
        }


    }


    private void getValues() {
        Intent intent = getIntent();
        pos = intent.getIntExtra(AblutionAdapter.POSITION, 0);
        lang = intent.getStringExtra(AblutionAdapter.LANGUAGE);
        heading = intent.getStringExtra(AblutionAdapter.HEADING);
    }

    private void setTextJustification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            ablutionProcess.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            ablutionDua.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            ablutionDuaTranslation.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            ablutionDuaTransliteration.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            ablutionProcess.setBreakStrategy(LineBreaker.BREAK_STRATEGY_BALANCED);
            ablutionDua.setBreakStrategy(LineBreaker.BREAK_STRATEGY_BALANCED);
            ablutionDuaTranslation.setBreakStrategy(LineBreaker.BREAK_STRATEGY_BALANCED);
            ablutionDuaTransliteration.setBreakStrategy(LineBreaker.BREAK_STRATEGY_BALANCED);
        }
    }

    private void setToolBar() {
        setSupportActionBar(mToolbar);
        toolbarText.setText(heading);
        toolbarImage.setImageResource(0);

        try {
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            toolbarText.setLayoutParams(params);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void setReferences() {
        mToolbar = findViewById(R.id.mToolbar);
        toolbarText = findViewById(R.id.toolbarText);
        toolbarImage = findViewById(R.id.toolbarImageFirst);
        ablutionProcess = findViewById(R.id.ablutionProcess);
        ablutionDua = findViewById(R.id.ablutionDua);
        ablutionDuaTranslation = findViewById(R.id.ablutionDuaTranslation);
        ablutionDuaTransliteration = findViewById(R.id.ablutionDuaTransliteration);
        ablutionProcessImage = findViewById(R.id.ablutionProcessImage);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}