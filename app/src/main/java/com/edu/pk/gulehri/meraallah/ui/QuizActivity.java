package com.edu.pk.gulehri.meraallah.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.edu.pk.gulehri.meraallah.database.MyDbHelper;
import com.edu.pk.gulehri.meraallah.databinding.ActivityQuizBinding;
import com.edu.pk.gulehri.meraallah.databinding.ResultLayoutBinding;
import com.google.gson.Gson;

import java.util.Collections;
import java.util.Objects;

import ticker.views.com.ticker.widgets.circular.timer.callbacks.CircularViewCallback;
import ticker.views.com.ticker.widgets.circular.timer.view.CircularView;

import static com.edu.pk.gulehri.meraallah.R.drawable;
import static com.edu.pk.gulehri.meraallah.R.id;
import static com.edu.pk.gulehri.meraallah.R.string;
import static com.edu.pk.gulehri.meraallah.R.style;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.HighScore;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.SHARED_PREFERENCES;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.SHARED_PREFERENCES_HIGH_SCORE;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.TAG;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.answer;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.backPressedTime;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.buttonLabel;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.correctAnswer;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.crossFlag;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.currentQuestion;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.flag;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.mScore;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.menuFlag;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.questionCounter;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.questionList;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.questionTotal;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.showAnswerFlag;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.wrongAnswer;

public class QuizActivity extends AppCompatActivity {


    @SuppressLint("StaticFieldLeak")
    public static Context mContext;
    private ActivityQuizBinding quizBinding;
    //Handler object that will used to call intent
    Handler handler = new Handler();

    private ResultLayoutBinding resultBinding;
    private Dialog myDialog;
    private MyDbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        quizBinding = ActivityQuizBinding.inflate(getLayoutInflater());
        setContentView(quizBinding.getRoot());

        //Here We take create object of our result dialog and sit it view when it called
        myDialog = new Dialog(this, style.Theme_Dialog);

        resultBinding = ResultLayoutBinding.inflate(getLayoutInflater());
        myDialog.setContentView(resultBinding.getRoot());

        //Creating static context variable to call in db class
        QuizActivity.mContext = this.getApplicationContext();

        //helper object that help in creating Database
        dbHelper = new MyDbHelper(this);


        //Getting question of selected category and storing it list

        questionList = dbHelper.getAllData();
        //This giver us the number of total question in the list
        questionTotal = questionList.size();

        //this method is gives Call here to give us next question and shows what option is selected
        // startQuiz();

        //this is gives the default color of radio button which is black and store in ColorState Variable
        buttonLabel = quizBinding.radioButton1.getTextColors();
        Log.d(TAG, "onCreate: QuizActivity");

        //Starting Quiz Here
        startQuiz();
    }


    @SuppressLint("NonConstantResourceId")
    private void startQuiz() {
        questionTotal = questionList.size();
        Collections.shuffle(questionList);
        showNextQuestion();

        quizBinding.radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId) {
                case id.radio_button1:
                    quizBinding.radioButton1.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.when_option_selected));

                    quizBinding.radioButton1.setTextColor(Color.WHITE);
                    quizBinding.radioButton2.setTextColor(Color.BLACK);
                    quizBinding.radioButton3.setTextColor(Color.BLACK);
                    quizBinding.radioButton4.setTextColor(Color.BLACK);

                    quizBinding.radioButton2.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
                    quizBinding.radioButton3.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
                    quizBinding.radioButton4.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
                    break;
                case id.radio_button2:
                    quizBinding.radioButton1.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
                    quizBinding.radioButton2.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.when_option_selected));

                    quizBinding.radioButton2.setTextColor(Color.WHITE);
                    quizBinding.radioButton1.setTextColor(Color.BLACK);
                    quizBinding.radioButton3.setTextColor(Color.BLACK);
                    quizBinding.radioButton4.setTextColor(Color.BLACK);

                    quizBinding.radioButton3.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
                    quizBinding.radioButton4.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
                    break;
                case id.radio_button3:
                    quizBinding.radioButton1.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
                    quizBinding.radioButton2.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
                    quizBinding.radioButton3.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.when_option_selected));

                    quizBinding.radioButton2.setTextColor(Color.BLACK);
                    quizBinding.radioButton1.setTextColor(Color.BLACK);
                    quizBinding.radioButton3.setTextColor(Color.WHITE);
                    quizBinding.radioButton4.setTextColor(Color.BLACK);

                    quizBinding.radioButton4.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
                    break;
                case id.radio_button4:
                    quizBinding.radioButton1.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
                    quizBinding.radioButton2.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
                    quizBinding.radioButton3.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
                    quizBinding.radioButton4.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.when_option_selected));

                    quizBinding.radioButton2.setTextColor(Color.BLACK);
                    quizBinding.radioButton1.setTextColor(Color.BLACK);
                    quizBinding.radioButton3.setTextColor(Color.BLACK);
                    quizBinding.radioButton4.setTextColor(Color.WHITE);

                    break;

            }
        });

        quizBinding.btnConfirmNext.setOnClickListener(v -> {
            if (!answer) {
                if (quizBinding.radioButton1.isChecked() || quizBinding.radioButton2.isChecked()
                        || quizBinding.radioButton3.isChecked() || quizBinding.radioButton4.isChecked()) {
                    checkAnswer();

                } else {
                    Toast.makeText(getApplicationContext(), "Please Select an Option", Toast.LENGTH_SHORT).show();
                }
            } else {
                showNextQuestion();
            }
        });

    }

    //This method gives us next question
    @SuppressLint("SetTextI18n")
    private void showNextQuestion() {

        quizBinding.radioGroup.clearCheck();
        // setting the background of radio buttons
        quizBinding.radioButton1.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
        quizBinding.radioButton2.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
        quizBinding.radioButton3.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));
        quizBinding.radioButton4.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.button_background));

        //setting the text color inside radio button
        quizBinding.radioButton1.setTextColor(Color.BLACK);
        quizBinding.radioButton2.setTextColor(Color.BLACK);
        quizBinding.radioButton3.setTextColor(Color.BLACK);
        quizBinding.radioButton4.setTextColor(Color.BLACK);


        /*
         * This if condition make sure if number question that appear is less than the total
         * questions in the list if it return true then the next question get called */

        if (questionCounter < questionTotal) {
            currentQuestion = questionList.get(questionCounter);

            //setting the question in textView that is get from database through getQuestion()
            quizBinding.question.setText(currentQuestion.getQuestion());

            //setting up the Option in radioButtons
            quizBinding.radioButton1.setText(currentQuestion.getOption1());
            quizBinding.radioButton2.setText(currentQuestion.getOption2());
            quizBinding.radioButton3.setText(currentQuestion.getOption3());
            quizBinding.radioButton4.setText(currentQuestion.getOption4());


            //increment the number of question that is shown
            questionCounter++;

            //setting the up textView that how many questions is appear out of total
            quizBinding.textViewQuestionCount.setText("" + questionCounter + "/" + questionTotal);

            //Here answer = false mean no answer is selected yet
            answer = false;

            //Here the text of button will be Confirm for verify the answer
            quizBinding.btnConfirmNext.setText(string.changeToConfirm);

            //timer will start as soon the question appear
            setCountDownTimer();

            //start circular timer  to rotate
            quizBinding.circularViewWithTimer.startTimer();

            noOptionSelected();


        }
        /* If all the question appeared thn this else block will run
         * WHICH will disable the radio button and confirm button
         * And show the result dialog after 1 second*/
        else {

            //Disabling the radioButton And ConfirmButton
            quizBinding.radioButton1.setClickable(false);
            quizBinding.radioButton2.setClickable(false);
            quizBinding.radioButton3.setClickable(false);
            quizBinding.radioButton4.setClickable(false);
            quizBinding.btnConfirmNext.setClickable(false);

            //Handler will pop the dialog after 1 second
            //this show result dialog after quiz
            handler.postDelayed(this::setupDialogue, 1000); //1000 milli seconds = 1 second
        }

    }

    //This method set Timer for question
    private void setCountDownTimer() {

        CircularView.OptionsBuilder builderWithTimer =
                new CircularView.OptionsBuilder()

                        //for displaying text inside circleView Timer
                        .shouldDisplayText(true)

                        //Duration for one question
                        .setCounterInSeconds(15)

                        //for showing second/minutes unit down the timer
                        .shouldDisplayTimeUnit(false)

                        .setCircularViewCallback(new CircularViewCallback() {

                            /*This method called when time finish for one question and
                            show us the next question  */
                            @Override
                            public void onTimerFinish() {
                                if (!answer) {
                                    mScore = mScore - 3;
                                    wrongAnswer++;
                                    quizBinding.score.setText(String.valueOf(mScore));
                                }
                                showNextQuestion();
                            }

                            //This called when timer canceled either by pressing backButton or other reason
                            @Override
                            public void onTimerCancelled() {
                                //Stopping the timer
                                quizBinding.circularViewWithTimer.stopTimer();
                            }
                        });

        //Convert Dp in to pixel
        quizBinding.circularViewWithTimer.setOptions(builderWithTimer);
    }

    //Here We Check For Correct Answer
    private void checkAnswer() {

        //When answer is select the the variable value will change to true
        answer = true;

        //Timer will stop
        quizBinding.circularViewWithTimer.stopTimer();

        //it gives the id of selected radio button
        RadioButton rbSelected = quizBinding.radioGroup.findViewById(quizBinding.radioGroup.getCheckedRadioButtonId());

        //it gives the id of selected answer we add 1 to it cuz our answer start from 1 and at first it gives 0.
        int answerCompare = quizBinding.radioGroup.indexOfChild(rbSelected) + 1;

        //this method check if the selected answer is tru or not
        checkSolution(answerCompare, rbSelected);
    }

    private void checkSolution(int answerCompare, RadioButton rbSelected) {
        switch (currentQuestion.getAnswer()) {

            case 1:
                if (currentQuestion.getAnswer() == answerCompare) {
                    quizBinding.radioButton1.setBackground(ContextCompat.getDrawable(this, drawable.when_option_correct));
                    quizBinding.radioButton1.setTextColor(Color.WHITE);
                    correctAnswer++;
                    // textViewCorrect.setText("Correct: " + String.valueOf(correctAnswer));
                    mScore = mScore + 5;
                    quizBinding.score.setText(String.valueOf(mScore));
                } else {
                    changeToWrong(rbSelected);
                }
                handler.postDelayed(this::showNextQuestion, 100);
                break;

            case 2:
                if (currentQuestion.getAnswer() == answerCompare) {
                    quizBinding.radioButton2.setBackground(ContextCompat.getDrawable(this, drawable.when_option_correct));
                    quizBinding.radioButton2.setTextColor(Color.WHITE);
                    correctAnswer++;
                    // textViewCorrect.setText("Correct: " + String.valueOf(correctAnswer));
                    mScore = mScore + 5;
                    quizBinding.score.setText(String.valueOf(mScore));
                } else {
                    changeToWrong(rbSelected);
                }
                handler.postDelayed(this::showNextQuestion, 100);
                break;

            case 3:
                if (currentQuestion.getAnswer() == answerCompare) {
                    quizBinding.radioButton3.setBackground(ContextCompat.getDrawable(this, drawable.when_option_correct));
                    quizBinding.radioButton3.setTextColor(Color.WHITE);
                    correctAnswer++;
                    //textViewCorrect.setText("Correct: " + String.valueOf(correctAnswer));
                    mScore = mScore + 5;
                    quizBinding.score.setText(String.valueOf(mScore));
                } else {
                    changeToWrong(rbSelected);
                }
                handler.postDelayed(this::showNextQuestion, 100);
                break;

            case 4:
                if (currentQuestion.getAnswer() == answerCompare) {
                    quizBinding.radioButton4.setBackground(ContextCompat.getDrawable(this, drawable.when_option_correct));
                    quizBinding.radioButton4.setTextColor(Color.WHITE);
                    correctAnswer++;

                    mScore = mScore + 5;
                    quizBinding.score.setText(String.valueOf(mScore));
                } else {
                    changeToWrong(rbSelected);
                }
                handler.postDelayed(this::showNextQuestion, 100);
                break;
        }

        if (questionCounter < questionTotal) {
            quizBinding.btnConfirmNext.setText(string.changeToNext);
        } else {
            quizBinding.btnConfirmNext.setText(string.changeToFinish);
        }
    }

    private void changeToWrong(RadioButton rbSelected) {
        rbSelected.setBackground(ContextCompat.getDrawable(getApplicationContext(), drawable.when_option_wrong));
        rbSelected.setTextColor(Color.WHITE);
        wrongAnswer++;
        mScore = mScore - 3;
        quizBinding.score.setText(String.valueOf(mScore));

    }

    @Override
    protected void onPause() {
        super.onPause();
        quizBinding.circularViewWithTimer.pauseTimer();
        Log.d(TAG, "onPause: QuizActivity ");

    }

    @Override
    protected void onResume() {
        super.onResume();
        quizBinding.circularViewWithTimer.resumeTimer();
        Log.d(TAG, "onResume: QuizActivity");

    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: QuizActivity");
        quizBinding.circularViewWithTimer.resumeTimer();

        if (flag || menuFlag || crossFlag || showAnswerFlag) {
            finish();
            questionList = dbHelper.getAllData();
            questionTotal = questionList.size();
            questionCounter = 0;
            wrongAnswer = 0;
            mScore = 0;
            quizBinding.score.setText("" + mScore);
        }


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: QuizActivity");

        quizBinding.circularViewWithTimer.stopTimer();
    }


    private void noOptionSelected() {
        if (!quizBinding.radioButton1.isChecked() || !quizBinding.radioButton2.isChecked()
                || !quizBinding.radioButton3.isChecked() || !quizBinding.radioButton4.isChecked()) {
            handler.postDelayed(() -> {
                setCountDownTimer();
                //start circular view to rotate
                quizBinding.circularViewWithTimer.startTimer();

            }, 0);
        }
    }

    private void updateHighScore(int newHighScore) {
        HighScore = newHighScore;
        resultBinding.highScore.setText(String.valueOf(HighScore));

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(SHARED_PREFERENCES_HIGH_SCORE, HighScore);
        editor.apply();
    }

    private void loadHighScore() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);
        HighScore = sharedPreferences.getInt(SHARED_PREFERENCES_HIGH_SCORE, 0);
        resultBinding.highScore.setText(String.valueOf(HighScore));
    }

    @Override
    public void onBackPressed() {


        //The Condition says when back button is pressed twice with in 2 seconds only thn it will send intent StartQuizActivity
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            flag = true;
            startActivity(new Intent(QuizActivity.this, MainActivity.class));
            QuizActivity.this.finish();
        }
        /*if back button is not pressed twice with in the 2 second the toast will appear*/
        else {
            Toast.makeText(getApplicationContext(), "One more tap to exit", Toast.LENGTH_SHORT).show();
        }
        //this gives the current time in milliseconds.
        backPressedTime = System.currentTimeMillis();

    }

    @SuppressLint("SetTextI18n")
    public void setupDialogue() {
        myDialog.setCancelable(false);
        myDialog.setCanceledOnTouchOutside(false);

        Objects.requireNonNull(myDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Window window = myDialog.getWindow();
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        resultBinding.questionSize.setText(String.valueOf(questionTotal));
        resultBinding.myScore.setText((String.valueOf(mScore)));
        resultBinding.correctQuestion.setText((String.valueOf(correctAnswer)));
        resultBinding.wrongQuestion.setText(String.valueOf(wrongAnswer));

        resultBinding.txtClose.setOnClickListener(v -> {
            myDialog.dismiss();
            crossFlag = true;
            QuizActivity.this.startActivity(new Intent(QuizActivity.this, MainActivity.class));
            QuizActivity.this.finish();


        });

        resultBinding.mainMenu.setOnClickListener(v -> {
            menuFlag = true;
            QuizActivity.this.startActivity(new Intent(QuizActivity.this, MainActivity.class));
            QuizActivity.this.finish();
        });

        resultBinding.playAgain.setOnClickListener(v -> {
            myDialog.dismiss();
            questionTotal = questionList.size();
            questionCounter = 0;
            mScore = 0;
            wrongAnswer = 0;
            quizBinding.score.setText("" + mScore);
            questionList = dbHelper.getAllData();
            //Collections.shuffle(questionList);

            //Enabling the radioButton And ConfirmButton
            quizBinding.radioButton1.setClickable(true);
            quizBinding.radioButton2.setClickable(true);
            quizBinding.radioButton3.setClickable(true);
            quizBinding.radioButton4.setClickable(true);
            quizBinding.btnConfirmNext.setClickable(true);

            startQuiz();
        });

        resultBinding.showAnswers.setOnClickListener(v -> {
            showAnswerFlag = true;
            Intent i = new Intent(QuizActivity.this, ShowAnswer.class);
            Gson gson = new Gson();
            String qList = gson.toJson(questionList);
            i.putExtra("QList", qList);
            QuizActivity.this.startActivity(i);
            QuizActivity.this.finish();

        });

        myDialog.show();
        loadHighScore();

        if (mScore > HighScore) {
            updateHighScore(mScore);
        }

    }
}