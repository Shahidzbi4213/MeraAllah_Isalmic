package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.edu.pk.gulehri.meraallah.Details.Details;
import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.ProphetNamesAdapter;
import com.edu.pk.gulehri.meraallah.constansts.Constants;
import com.edu.pk.gulehri.meraallah.databinding.ActivityProphetNamesDetailBinding;
import com.edu.pk.gulehri.meraallah.model.Model;

import java.util.Objects;

import static com.edu.pk.gulehri.meraallah.constansts.Constants.ANIMATION_DURATION_A;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.ANIMATION_DURATION_B;

public class ProphetNamesDetailActivity extends AppCompatActivity
        implements View.OnClickListener, View.OnTouchListener, GestureDetector.OnGestureListener {

    private ActivityProphetNamesDetailBinding binding;
    private GestureDetector mGestureDetector;
    private int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProphetNamesDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Creating Object
        mGestureDetector = new GestureDetector(this, this);


        getValues();
        setToolbar();
        setTextJustification();
        assigningValues();
        buttonHideSeek();
        setListeners();
    }

    private void getValues() {
        Intent intent = getIntent();
        position = intent.getIntExtra(ProphetNamesAdapter.ITEM_CLICKED, 0);

    }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    private void assigningValues() {
        setAnimations();
        binding.counterViewProphet.setText(String.format("%d", position + 1));
        binding.nameInArabicProphet.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ARABIC());
        binding.nameInEnglishProphet.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ENGLISH());
        binding.meaningOfNameProphet.setText("Meaning:" + " " + Model.MUHAMMAD[position].getMUHAMMAD_NAMES_MEANING());
        binding.referenceInUrduProphet.setText(Details.MUHAMMAD_NAMES_DETAIL[position].getDETAIL_URDU());
        binding.referenceInEnglishProphet.setText(Details.MUHAMMAD_NAMES_DETAIL[position].getDETAIL_ENGLISH());
        binding.toolbarProphetNames.toolbarText.setText(Model.MUHAMMAD[position].getMUHAMMAD_NAMES_ENGLISH());
    }

    private void buttonHideSeek() {
        if (position == 0) {
            binding.btnMinus.setVisibility(View.GONE);
        } else {
            binding.btnMinus.setVisibility(View.VISIBLE);
        }
        if (position == Model.MUHAMMAD.length - 1) {
            binding.btnPlus.setVisibility(View.GONE);
        } else {
            binding.btnPlus.setVisibility(View.VISIBLE);
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    private void setListeners() {
        binding.btnPlus.setOnClickListener(this);
        binding.btnMinus.setOnClickListener(this);
        binding.detailView.setOnTouchListener(this);
    }

    @SuppressLint("InlinedApi")
    private void setTextJustification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            binding.referenceInUrduProphet.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
            binding.referenceInEnglishProphet.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        }
    }

    private void setToolbar() {
        try {
            setSupportActionBar(binding.toolbarProphetNames.mToolbar);
            binding.toolbarProphetNames.toolbarImageFirst.setImageResource(0);
            binding.toolbarProphetNames.toolbarImageFirst.setImageResource(0);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            binding.toolbarProphetNames.toolbarText.setLayoutParams(params);
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

    private void setAnimations() {
        YoYo.with(Techniques.ZoomIn).duration(ANIMATION_DURATION_B).playOn(binding.nameInArabicProphet);
        YoYo.with(Techniques.FadeIn).duration(ANIMATION_DURATION_A).playOn(binding.nameInEnglishProphet);
        YoYo.with(Techniques.FadeIn).duration(ANIMATION_DURATION_A).playOn(binding.meaningOfNameProphet);
        YoYo.with(Techniques.ZoomIn).duration(ANIMATION_DURATION_B).playOn(binding.referenceInUrduProphet);
        YoYo.with(Techniques.FadeIn).duration(ANIMATION_DURATION_A).playOn(binding.referenceInEnglishProphet);

    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        try {
            //Checking for the distance user finger covered
            float diffX = e2.getX() - e1.getX();

            //Check if covered distance > 100 px/unit
            if (Math.abs(diffX) > Constants.SWIPE_THRESHOLD && Math.abs(velocityX) > Constants.SWIPE_VELOCITY_THRESHOLD) {

                //if diffX == positive then perform swipe right
                if (diffX > 0) {

                    position++;

                    if (position == Model.MUHAMMAD.length) {
                        position = Model.MUHAMMAD.length - 1;
                    }

                }
                //if diffX is negative then perform swipe left
                else {
                    position--;
                    if (position == -1) {
                        position = 0;
                    }
                }
                buttonHideSeek();
                assigningValues();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_plus) {
            position++;

            if (position >= Model.MUHAMMAD.length) {
                position = Model.MUHAMMAD.length - 1;
            }
            assigningValues();
            buttonHideSeek();


        }
        if (v.getId() == R.id.btn_minus) {
            position--;
            if (position < 0) {
                position = 0;
            }
            assigningValues();
            buttonHideSeek();

        }

    }


    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mGestureDetector.onTouchEvent(event);
        return true;
    }

}