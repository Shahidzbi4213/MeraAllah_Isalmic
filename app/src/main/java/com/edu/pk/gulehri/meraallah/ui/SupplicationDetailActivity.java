package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.SupplicationAdapter;
import com.edu.pk.gulehri.meraallah.constansts.Constants;
import com.edu.pk.gulehri.meraallah.databinding.ActivitySupplicationDetailBinding;
import com.edu.pk.gulehri.meraallah.model.Model;

import static android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.ANIMATION_CHANGE_DURATION;


public class SupplicationDetailActivity extends AppCompatActivity
        implements View.OnTouchListener, GestureDetector.OnGestureListener, View.OnClickListener {


    /**
     * Vars
     */

    private String language;
    private String itemText;
    private GestureDetector mGestureDetector;
    private int position;
    private ActivitySupplicationDetailBinding supplicationDetailBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        supplicationDetailBinding = ActivitySupplicationDetailBinding.inflate(getLayoutInflater());
        setContentView(supplicationDetailBinding.getRoot());
        mGestureDetector = new GestureDetector(this, this);

        setToolbar();
        getValues();
        setTextJustification();
        setValues();
        setListeners();


    }

    @SuppressLint("ClickableViewAccessibility")
    private void setListeners() {
        supplicationDetailBinding.supplicationLayout.setOnTouchListener(this);
        supplicationDetailBinding.toolbarIncludeSupplicationDetail.toolbarImageSecond.setOnClickListener(this);
    }

    private int findIndex(Model[] arr, String text, String lang) {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;


        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (lang.equals("Urdu")) {
                if (arr[i].getDUA_URDU().equals(text)) {
                    return i;
                } else {
                    i = i + 1;
                }
            } else if (lang.equals("English")) {
                if (arr[i].getDUA_ENGLISH().equals(text)) {
                    return i;
                } else {
                    i = i + 1;
                }
            }

        }
        return -1;
    }

    private void setAnimations() {
        YoYo.with(Techniques.ZoomIn).duration(ANIMATION_CHANGE_DURATION).playOn(supplicationDetailBinding.dua);
        YoYo.with(Techniques.ZoomIn).duration(ANIMATION_CHANGE_DURATION).playOn(supplicationDetailBinding.duaMeaning);
        YoYo.with(Techniques.ZoomIn).duration(ANIMATION_CHANGE_DURATION).playOn(supplicationDetailBinding.title);
        YoYo.with(Techniques.ZoomIn).duration(ANIMATION_CHANGE_DURATION).playOn(supplicationDetailBinding.reference);
    }

    private void getValues() {
        Intent intent = getIntent();
        itemText = intent.getStringExtra(SupplicationAdapter.ITEM_TEXT);
        language = intent.getStringExtra(SupplicationAdapter.SELECTED_LANGUAGE);
        position = findIndex(Model.SUPPLICATIONS, itemText, language);


    }


    @SuppressLint("InlinedApi")
    private void setTextJustification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            supplicationDetailBinding.dua.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            supplicationDetailBinding.duaMeaning.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);

            if (language.equals("English")) {
                Typeface typeface = ResourcesCompat.getFont(this, R.font.dosis_medium);
                supplicationDetailBinding.title.setTypeface(typeface);
                supplicationDetailBinding.duaMeaning.setTypeface(typeface);
            }

        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            supplicationDetailBinding.dua.setBreakStrategy(LineBreaker.BREAK_STRATEGY_BALANCED);
            supplicationDetailBinding.duaMeaning.setBreakStrategy(LineBreaker.BREAK_STRATEGY_BALANCED);
        } else {
            supplicationDetailBinding.title.setTypeface(Typeface.SERIF, Typeface.ITALIC);
            supplicationDetailBinding.duaMeaning.setTypeface(Typeface.SERIF, Typeface.ITALIC);

        }

    }

    private void setValues() {
        if (language == null) throw new AssertionError();
        if (language.equals("Urdu")) {

            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
                supplicationDetailBinding.title.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._20sdp));
                supplicationDetailBinding.duaMeaning.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._20sdp));
            }

            supplicationDetailBinding.title.setText(Model.SUPPLICATIONS[position].getDUA_URDU());
            supplicationDetailBinding.dua.setText(Model.SUPPLICATIONS[position].getDUA());
            supplicationDetailBinding.duaMeaning.setText(String.format("ترجمه: %s", Model.SUPPLICATIONS[position].getDUA_MEANING_URDU()));
            supplicationDetailBinding.reference.setText(String.format("Reference: %s", Model.SUPPLICATIONS[position].getDUA_REFERENCE()));

        } else if (language.equals("English")) {


            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                Typeface typeface = ResourcesCompat.getFont(this, R.font.dosis_medium);
                supplicationDetailBinding.title.setTypeface(typeface);
                supplicationDetailBinding.duaMeaning.setTypeface(typeface);
            } else {
                supplicationDetailBinding.title.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                supplicationDetailBinding.duaMeaning.setTypeface(Typeface.SERIF, Typeface.ITALIC);
                supplicationDetailBinding.reference.setTypeface(Typeface.SERIF, Typeface.ITALIC);
            }

            supplicationDetailBinding.title.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._16sdp));
            supplicationDetailBinding.duaMeaning.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._16sdp));
            supplicationDetailBinding.title.setText(Model.SUPPLICATIONS[position].getDUA_ENGLISH());
            supplicationDetailBinding.dua.setText(Model.SUPPLICATIONS[position].getDUA());
            supplicationDetailBinding.duaMeaning.setText(String.format("Translation:  %s", Model.SUPPLICATIONS[position].getDUA_MEANING_ENGLISH()));
            supplicationDetailBinding.reference.setText(String.format("Reference: %s", Model.SUPPLICATIONS[position].getDUA_REFERENCE()));
        }

    }


    private void setToolbar() {
        setSupportActionBar(supplicationDetailBinding.toolbarIncludeSupplicationDetail.mToolbar);
        supplicationDetailBinding.toolbarIncludeSupplicationDetail.toolbarText.setText(R.string.supplications);
        supplicationDetailBinding.toolbarIncludeSupplicationDetail.toolbarImageFirst.setImageResource(0);
        supplicationDetailBinding.toolbarIncludeSupplicationDetail.toolbarImageSecond.setImageResource(R.drawable.copy);
        Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        supplicationDetailBinding.toolbarIncludeSupplicationDetail.toolbarText.setLayoutParams(params);
        try {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.back_arrow);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
        } catch (Exception e) {
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

            int length = Model.SUPPLICATIONS.length;
            //Checking for distance that user finger covered
            float diffX = e2.getX() - e1.getX();

            //Check if the distance is greater then 100px
            if (Math.abs(diffX) > Constants.SWIPE_THRESHOLD && Math.abs(velocityX) > Constants.SWIPE_VELOCITY_THRESHOLD) {

                setAnimations();
                //Check if value of diffX is positive thn perform swipeRight()
                //else perform swipeLeft()
                if (diffX > 0) {

                    if (position > length) {
                        position = length;
                    }
                    position++;
                } else {

                    if (position < 0) {
                        position = 0;
                    }
                    position--;
                }
                setAnimations();
                setValues();
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

    public boolean dispatchTouchEvent(MotionEvent ev) {
        super.dispatchTouchEvent(ev);
        return mGestureDetector.onTouchEvent(ev);

    }

    private void copyTextOnClick() {
        ClipboardManager clipboardManager = (ClipboardManager) this.getSystemService(Context.CLIPBOARD_SERVICE);
        String supplication = supplicationDetailBinding.title.getText().toString() + ":\n\n" +
                supplicationDetailBinding.dua.getText().toString() + "\n\n" +
                supplicationDetailBinding.duaMeaning.getText().toString() + "\n\n" +
                supplicationDetailBinding.reference.getText().toString();

        ClipData clipData = ClipData.newPlainText("Dua", supplication);
        clipboardManager.setPrimaryClip(clipData);


        Toast.makeText(this, "Copied to Clipboard", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.toolbarImageSecond) {

            copyTextOnClick();
        }
    }
}