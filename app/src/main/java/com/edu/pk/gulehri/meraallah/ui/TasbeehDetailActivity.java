package com.edu.pk.gulehri.meraallah.ui;

import android.content.Intent;
import android.content.SharedPreferences;
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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.TasbeehAdapter;
import com.edu.pk.gulehri.meraallah.constansts.Constants;
import com.edu.pk.gulehri.meraallah.databinding.ActivityTasbeehDetailBinding;
import com.edu.pk.gulehri.meraallah.model.Model;

public class TasbeehDetailActivity extends AppCompatActivity implements View.OnTouchListener,
        GestureDetector.OnGestureListener, View.OnClickListener {


    /**
     * vars
     */
    private Toolbar mToolbar;
    private GestureDetector mGestureDetector;
    private int POSITION;
    private static final String TOTAL_VALUE_COUNTER = "Total Value Count";
    private int progr = 0, totalCount = 0, max = 33;
    private SharedPreferences sharedPreferences;
    private ActivityTasbeehDetailBinding tasbeehDetailBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasbeehDetailBinding = ActivityTasbeehDetailBinding.inflate(getLayoutInflater());
        setContentView(tasbeehDetailBinding.getRoot());


        setToolbar();
        setTextJustification();
        getValues();
        setValues();
        setListener();
        loadData();
    }

    private void setListener() {
        mGestureDetector = new GestureDetector(this, this);
        tasbeehDetailBinding.tasbeehatLayout.setOnTouchListener(this);
        tasbeehDetailBinding.counterIncrease.setOnClickListener(this);
        tasbeehDetailBinding.toolbarIncludeTasbeehDetail.toolbarImageFirst.setOnClickListener(this);
        tasbeehDetailBinding.linearLayoutFirst.setOnClickListener(this);
    }

    /*This method set Animation of Type ZoomIn to text View And here
     *we use Custom library from github YoYo */
    private void setAnimations() {
        YoYo.with(Techniques.ZoomIn).duration(Constants.ANIMATION_CHANGE_DURATION).playOn(tasbeehDetailBinding.duaTasbeeh);
        YoYo.with(Techniques.ZoomIn).duration(Constants.ANIMATION_CHANGE_DURATION).playOn(tasbeehDetailBinding.duaTasbeehTranslation);
        YoYo.with(Techniques.ZoomIn).duration(Constants.ANIMATION_CHANGE_DURATION).playOn(tasbeehDetailBinding.duaTasbeehTransliteration);
    }


    /*This method Check if built in sdk in device has API > 26 the Justify text inside
     *textView */
    private void setTextJustification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            tasbeehDetailBinding.duaTasbeeh.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
            tasbeehDetailBinding.duaTasbeehTranslation.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
            tasbeehDetailBinding.duaTasbeehTransliteration.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        } else {
            tasbeehDetailBinding.duaTasbeehTranslation.setTypeface(Typeface.SERIF, Typeface.ITALIC);
            tasbeehDetailBinding.duaTasbeehTransliteration.setTypeface(Typeface.SERIF, Typeface.ITALIC);
            tasbeehDetailBinding.duaTasbeehTranslation.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._16sdp));
            tasbeehDetailBinding.duaTasbeehTransliteration.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen._16sdp));
        }
    }

    /*This Method is just Simple Assign Values to textView of Tasbeehat*/
    private void setValues() {
        tasbeehDetailBinding.duaTasbeeh.setText(String.format(" ذكر: %s", Model.TASBEEHAT[POSITION].getTASBEEH()));
        tasbeehDetailBinding.duaTasbeehTranslation.setText(String.format("Translation: %s", Model.TASBEEHAT[POSITION].getTASBEEH_TRANSLATION()));
        tasbeehDetailBinding.duaTasbeehTransliteration.setText(String.format("Transliteration: %s", Model.TASBEEHAT[POSITION].getTASBEEH_TRASNLITERATION()));
    }

    /*This method get position of item click from Adaptor class of Tasbeeh Activity  */
    private void getValues() {
        Intent intent = getIntent();
        POSITION = intent.getIntExtra(TasbeehAdapter.TASBEEH_POSITION, 0);
    }


    private void setToolbar() {

        setSupportActionBar(tasbeehDetailBinding.toolbarIncludeTasbeehDetail.mToolbar);
        tasbeehDetailBinding.toolbarIncludeTasbeehDetail.toolbarText.setText(R.string.tasbeehCounter);
        tasbeehDetailBinding.toolbarIncludeTasbeehDetail.toolbarImageFirst.setImageResource(R.drawable.reset);

        try {
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            tasbeehDetailBinding.toolbarIncludeTasbeehDetail.toolbarText.setLayoutParams(params);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            //reset Progressbar
            progr = 0;
            updateProgressBar();

            onBackPressed();
            saveData();

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
        return true;
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
            int length = Model.TASBEEHAT.length;
            float diffX = e2.getX() - e1.getX();

            if (Math.abs(diffX) > Constants.SWIPE_THRESHOLD && Math.abs(velocityX) > Constants.SWIPE_VELOCITY_THRESHOLD) {

                //swipeRight(); else swipeLeft();
                if (diffX > 0) {
                    if (POSITION > length) {
                        POSITION = length;
                    }
                    POSITION++;
                } else {
                    if (POSITION < 0) {
                        POSITION = 0;
                    }
                    POSITION--;
                }
                setAnimations();
                setValues();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mGestureDetector.onTouchEvent(event);
        return true;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.counterIncrease) {

            totalCount += 1;
            updateTotal();
            saveData();

            if (progr < max) {
                progr += 1;
            } else {
                progr = 0;
            }
            updateProgressBar();
            setTextToCounterOutOf();
        } else if (id == R.id.toolbarImageFirst) {
            progr = 0;
            updateProgressBar();
            setTextToCounterOutOf();

            totalCount = 0;
            updateTotal();
            saveData();
        } else if (id == R.id.linearLayoutFirst) {
            setLimit();
            progr = 0;
            updateProgressBar();
            totalCount = 0;
            updateTotal();
            saveData();
        }
    }


    /*This method Update out progress bar and text inside progressbar
     * First we set Maximum limit to pBar by Calling checkTasbeehCount()
     * then we set Set Progress and and and count of progress inside progress text */
    private void updateProgressBar() {
        checkTasbeehCount();
        tasbeehDetailBinding.mProgressBar.setMax(max);
        tasbeehDetailBinding.mProgressBar.setProgress(progr);
        tasbeehDetailBinding.textViewProgress.setText("" + progr);
    }

    /*This method will be trigger when back button is pressed and its saved the total count of Tasbeeh
     * Even if activity is destroyed*/
    private void saveData() {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(TOTAL_VALUE_COUNTER, totalCount);
        editor.apply();
        editor.commit();
    }


    /*This method will Trigger when onCreate method of Activity is called
     * And in this we get the value that saved in saveData() method and
     * assign it ot textView that shows us the total count by Calling
     * updateTotal() method*/
    private void loadData() {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        totalCount = sharedPreferences.getInt(TOTAL_VALUE_COUNTER, 0);
        updateTotal();
    }

    /*This method Update Total Number of Counts*/
    private void updateTotal() {
        tasbeehDetailBinding.totalCountText.setText("" + totalCount);
    }

    /*This method set the max value for progress bar according to User choice
     * For Example 33 or 99*/
    private void checkTasbeehCount() {
        String str = tasbeehDetailBinding.countOutOf.getText().toString();

        if (str.contains("/33")) {
            max = 33;
        } else if (str.contains("/99")) {
            max = 99;
        }
    }

    /*This method will trigger when user click on Card
     * it will check if the limit is set to 33 change to 99 or vice verse*/
    private void setLimit() {
        String str = tasbeehDetailBinding.countOutOf.getText().toString();

        if (str.contains("/33")) {
            tasbeehDetailBinding.countOutOf.setText("0/99");
        } else if (str.contains("/99")) {
            tasbeehDetailBinding.countOutOf.setText("0/33");
        }
    }


    /*This method set Text to TextView counterOutOf
     * For Example 1/33 or 2/33 according to progressbar value
     */
    private void setTextToCounterOutOf() {
        tasbeehDetailBinding.countOutOf.setText(progr + "/" + max);
    }

}