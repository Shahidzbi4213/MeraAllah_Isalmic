package com.edu.pk.gulehri.meraallah.constansts;

import android.content.res.ColorStateList;

import com.edu.pk.gulehri.meraallah.model.Question;

import java.util.List;

public class Constants {


    /*Tag*/
    public static final String TAG = "Tag";


    /**
     * Splash Screen
     */
    public static final int SPLASH_SCREEN_DELAY = 3000;

    /**
     * Gesture Detector Variables
     */
    public static final int SWIPE_THRESHOLD = 100;
    public static final int SWIPE_VELOCITY_THRESHOLD = 100;
    public static final int ANIMATION_CHANGE_DURATION = 1000;

    /**
     * Names Activity
     */
    public static final int ANIMATION_DURATION_A = 2500;
    public static final int ANIMATION_DURATION_B = 1000;

    /**
     * Silent Phone Activity
     */
    public static final String FAJAR_TIME = "Fajar";
    public static final String ZUHUR_TIME = "Zuhur";
    public static final String ASR_TIME = "Asr";
    public static final String MAGHRIB_TIME = "Maghrib";
    public static final String ISHA_TIME = "Isha";
    public static final String JUMMAH_TIME = "Jummah";


    /**
     * Delay of One Day
     */
    public static final long DELAY = 24 * 60 * 60 * 1000;

    /**
     * Bring Back to Normal
     * After 20 min
     */

    public static final int NormalTime = 1200000;

    /**
     * Animation Duration
     */
    public static final int ANIMATION_DURATION_FOR_SILENT_PHONE = 5000;

    /***********************************Quiz Activity*********************************************/
    public static final String SHARED_PREFERENCES = "shared_Prefrence";
    public static final String SHARED_PREFERENCES_HIGH_SCORE = "shared_prefrence_high_score";
    public static long backPressedTime;

    //flag used here to check of back button is pressed and activity in the background
    public static boolean flag;
    //Flag Check if Main Menu Button is Pressed or Not
    public static boolean menuFlag;
    //Flag Here Check if cross button on Dialog is pressed or Not
    public static boolean crossFlag;
    //Flag Here Check if Show Answer button on Dialog is pressed or Not
    public static boolean showAnswerFlag;

    //For Checking Answer
    public static boolean answer;

    //Used for saving high score
    public static int HighScore;
    //For Calculating Scores and Questions
    public static int correctAnswer = 0, wrongAnswer = 0, mScore = 0;
    //Variables for counting questions
    public static int questionCounter;
    public static int questionTotal;
    public static Question currentQuestion;
    //For Storing question
    public static List<Question> questionList;

    //For Saving Current color of view
    public static ColorStateList buttonLabel;


    /* Database Constants */
    public static final String QUESTIONS_TABLE = "quiz_question";

    /*Json File Name*/
    public static final String JSON_FILENAME = "questions.json";

    public static final String UID = "_id";
    public static final String COLUMNS_QUESTION = "Question";
    public static final String COLUMNS_OPTION1 = "Option1";
    public static final String COLUMNS_OPTION2 = "Option2";
    public static final String COLUMNS_OPTION3 = "Option3";
    public static final String COLUMNS_OPTION4 = "Option4";
    public static final String ANSWER = "Answer";


    public static final String DB_NAME = "islamic_quiz";
    public static final int VERSION = 1;


    public static final String CREATE_TABLE_QUESTION = " CREATE TABLE " + QUESTIONS_TABLE +
            "( " + UID + " INTEGER PRIMARY KEY, " + COLUMNS_QUESTION + " TEXT, " + COLUMNS_OPTION1
            + " TEXT, " + COLUMNS_OPTION2 + " TEXT, " + COLUMNS_OPTION3 + " TEXT, " +
            COLUMNS_OPTION4 + " TEXT, " + ANSWER + " INTEGER " + ");";


    public static final String[] ALL_COLUMNS = {COLUMNS_QUESTION, COLUMNS_OPTION1, COLUMNS_OPTION2, COLUMNS_OPTION3,
            COLUMNS_OPTION4, ANSWER};
    public static final String DELETE_TABLE_QUESTIONS = " DROP TABLE IF EXISTS " + QUESTIONS_TABLE;
}
