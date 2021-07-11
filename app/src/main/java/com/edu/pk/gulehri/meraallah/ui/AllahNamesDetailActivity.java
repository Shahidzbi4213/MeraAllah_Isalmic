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
import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.AllahNamesAdapter;
import com.edu.pk.gulehri.meraallah.constansts.Constants;
import com.edu.pk.gulehri.meraallah.databinding.ActivityAllahNamesDetailBinding;
import com.edu.pk.gulehri.meraallah.model.Model;

import java.util.Objects;

import static com.edu.pk.gulehri.meraallah.constansts.Constants.ANIMATION_DURATION_A;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.ANIMATION_DURATION_B;

public class AllahNamesDetailActivity extends AppCompatActivity
        implements View.OnClickListener, View.OnTouchListener, GestureDetector.OnGestureListener {

    private int position;
    private GestureDetector mGestureDetector;
    private ActivityAllahNamesDetailBinding detailBinding;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        detailBinding = ActivityAllahNamesDetailBinding.inflate(getLayoutInflater());
        setContentView(detailBinding.getRoot());

        //Creating Object
        mGestureDetector = new GestureDetector(this, this);

        getValues();
        setToolbar();
        assigningValues();
        setAnimations();
        buttonHideSeek();
        setTextJustification();
        setListeners();

    }

    private void getValues() {
        Intent intent = getIntent();
        position = intent.getIntExtra(AllahNamesAdapter.ITEM_CLICKED, 0);

    }

    @SuppressLint("ClickableViewAccessibility")
    private void setListeners() {
        detailBinding.buttonPlus.setOnClickListener(this);
        detailBinding.buttonMinus.setOnClickListener(this);
        detailBinding.detailView.setOnTouchListener(this);
    }

    @SuppressLint("InlinedApi")
    private void setTextJustification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            detailBinding.referenceInArabic.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
            detailBinding.referenceInEnglish.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        }
    }

    private void buttonHideSeek() {
        if (position == 0) {
            detailBinding.buttonMinus.setVisibility(View.GONE);
        } else {
            detailBinding.buttonMinus.setVisibility(View.VISIBLE);
        }
        if (position == Model.ALLAH.length - 1) {
            detailBinding.buttonPlus.setVisibility(View.GONE);
        } else {
            detailBinding.buttonPlus.setVisibility(View.VISIBLE);
        }
    }


    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    private void assigningValues() {
        setAnimations();
        detailBinding.counterView.setText(String.format("%d", position + 1));
        detailBinding.nameInArabic.setText(Model.ALLAH[position].getALLAH_NAMES_ARABIC());
        detailBinding.nameInEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_ENGLISH());
        detailBinding.meaningOfName.setText("Meaning:" + " " + Model.ALLAH[position].getALLAH_NAMES_MEANING());
        detailBinding.referenceInArabic.setText(Model.ALLAH[position].getALLAH_NAMES_REFERENCE_ARABIC());
        detailBinding.referenceInEnglish.setText(Model.ALLAH[position].getALLAH_NAMES_REFERENCE_ENGLISH());
        detailBinding.toolbarAllahName.toolbarText.setText(Model.ALLAH[position].getALLAH_NAMES_ENGLISH());
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onClick(@NonNull View v) {
        if (v.getId() == R.id.buttonPlus) {
            position++;
            assigningValues();
            buttonHideSeek();


        }
        if (v.getId() == R.id.buttonMinus) {
            position--;
            assigningValues();
            buttonHideSeek();

        }
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

    /**
     * Performing Swipe Gestures
     */
    @SuppressLint("DefaultLocale")
    @Override
    public boolean onFling(@NonNull MotionEvent e1, @NonNull MotionEvent e2, float velocityX, float velocityY) {

        try {
            //Checking for the distance user finger covered
            float diffX = e2.getX() - e1.getX();

            //Check if covered distance > 100 px/unit
            if (Math.abs(diffX) > Constants.SWIPE_THRESHOLD && Math.abs(velocityX) > Constants.SWIPE_VELOCITY_THRESHOLD) {

                //if diffX == positive then perform swipe right
                if (diffX > 0) {

                    position++;
                    if (position >= Model.ALLAH.length) {
                        position = Model.ALLAH.length - 1;
                    }
                }
                //if diffX is negative then perform swipe left
                else {
                    position--;
                    if (position == -1) {
                        position = 0;
                    }
                }
                assigningValues();
                buttonHideSeek();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mGestureDetector.onTouchEvent(event);

        return true;
    }

    private void setToolbar() {
        try {
            setSupportActionBar(detailBinding.toolbarAllahName.mToolbar);
            detailBinding.toolbarAllahName.toolbarImageSecond.setImageResource(0);
            detailBinding.toolbarAllahName.toolbarImageFirst.setImageResource(0);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            detailBinding.toolbarAllahName.toolbarText.setLayoutParams(params);
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
        YoYo.with(Techniques.ZoomIn).duration(ANIMATION_DURATION_B).playOn(detailBinding.nameInArabic);
        YoYo.with(Techniques.FadeIn).duration(ANIMATION_DURATION_A).playOn(detailBinding.nameInEnglish);
        YoYo.with(Techniques.FadeIn).duration(ANIMATION_DURATION_A).playOn(detailBinding.meaningOfName);
        YoYo.with(Techniques.ZoomIn).duration(ANIMATION_DURATION_B).playOn(detailBinding.referenceInArabic);
        YoYo.with(Techniques.FadeIn).duration(ANIMATION_DURATION_A).playOn(detailBinding.referenceInEnglish);

    }



}