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
import androidx.recyclerview.widget.LinearLayoutManager;

import com.edu.pk.gulehri.meraallah.R;
import com.edu.pk.gulehri.meraallah.adapters.AnswerAdapter;
import com.edu.pk.gulehri.meraallah.database.MyDbHelper;
import com.edu.pk.gulehri.meraallah.databinding.ActivityShowAnswerBinding;
import com.edu.pk.gulehri.meraallah.model.Question;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

public class ShowAnswer extends AppCompatActivity {
    private ActivityShowAnswerBinding answerBinding;
    private List<Question> questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        answerBinding = ActivityShowAnswerBinding.inflate(getLayoutInflater());
        setContentView(answerBinding.getRoot());

        setToolbar();
        getValue();
        setRecycleView();

    }

    private void setToolbar() {
        try {
            setSupportActionBar(answerBinding.toolbarIncludeShowsAnswer.mToolbar);

            answerBinding.toolbarIncludeShowsAnswer.toolbarImageFirst.setImageResource(0);
            answerBinding.toolbarIncludeShowsAnswer.toolbarText.setText(R.string.answers);
            Toolbar.LayoutParams params = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            answerBinding.toolbarIncludeShowsAnswer.toolbarText.setLayoutParams(params);
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(false);
            final Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.back_arrow, null);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void setRecycleView() {
        answerBinding.showAnswersRecycleView.setLayoutManager(new LinearLayoutManager(this));
        answerBinding.showAnswersRecycleView.setAdapter(new AnswerAdapter(questionList));
    }

    private void getValue() {
        Intent intent = getIntent();
        String questionsData = intent.getStringExtra("QList");
        Gson gson = new Gson();
        Type type = new TypeToken<List<Question>>() {
        }.getType();
        questionList = gson.fromJson(questionsData, type);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}