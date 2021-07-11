package com.edu.pk.gulehri.meraallah.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.edu.pk.gulehri.meraallah.constansts.Constants;
import com.edu.pk.gulehri.meraallah.model.Question;
import com.edu.pk.gulehri.meraallah.ui.QuizActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static com.edu.pk.gulehri.meraallah.constansts.Constants.ANSWER;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.COLUMNS_OPTION1;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.COLUMNS_OPTION2;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.COLUMNS_OPTION3;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.COLUMNS_OPTION4;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.COLUMNS_QUESTION;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.CREATE_TABLE_QUESTION;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.DB_NAME;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.DELETE_TABLE_QUESTIONS;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.JSON_FILENAME;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.TAG;
import static com.edu.pk.gulehri.meraallah.constansts.Constants.VERSION;

public class MyDbHelper extends SQLiteOpenHelper {


    private SQLiteDatabase db;
    ArrayList<String> questions = new ArrayList<>();
    ArrayList<String> option1 = new ArrayList<>();
    ArrayList<String> option2 = new ArrayList<>();
    ArrayList<String> option3 = new ArrayList<>();
    ArrayList<String> option4 = new ArrayList<>();
    ArrayList<Integer> answers = new ArrayList<>();

    public MyDbHelper(@Nullable Context context) {
        super(context, DB_NAME, null, VERSION);
        db = getReadableDatabase();
        db = getWritableDatabase();

    }

    public void addQuestion(String qText, String op1, String op2, String op3, String op4, int answerIndex) {

        ContentValues values = new ContentValues();
        values.put(COLUMNS_QUESTION, qText);
        values.put(COLUMNS_OPTION1, op1);
        values.put(COLUMNS_OPTION2, op2);
        values.put(COLUMNS_OPTION3, op3);
        values.put(COLUMNS_OPTION4, op4);
        values.put(ANSWER, answerIndex);

        long insert = db.insert(Constants.QUESTIONS_TABLE, null, values);
        Log.i(TAG, "addQuestion: " + insert);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        db.execSQL(CREATE_TABLE_QUESTION);
        Log.i(TAG, "onCreate: Database Created");

        try {
            addEntriesFromJSON();
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DELETE_TABLE_QUESTIONS);
        Log.i(TAG, "onUpgrade: Database Deleted");
        onCreate(db);
    }

    public void addEntriesFromJSON() throws IOException, JSONException {
        //read entries json file
        String jsonData = "";
        InputStream in = QuizActivity.mContext.getAssets().open(JSON_FILENAME);
        int size = in.available();

        byte[] buffer = new byte[size];
        in.read(buffer);
        in.close();

        jsonData = new String(buffer, StandardCharsets.UTF_8);

        JSONObject jsonObject = new JSONObject(jsonData);
        JSONArray jsonArray = jsonObject.getJSONArray("questions");
        jsonArray.length();

        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject userDetail = jsonArray.getJSONObject(i);
            questions.add(userDetail.getString("qText"));
            option1.add(userDetail.getString("op1"));
            option2.add(userDetail.getString("op2"));
            option3.add(userDetail.getString("op3"));
            option4.add(userDetail.getString("op4"));
            answers.add(userDetail.getInt("answerIndex"));


            addQuestion(questions.get(i), option1.get(i), option2.get(i), option3.get(i), option4.get(i), answers.get(i));
        }

    }

    public List<Question> getAllData() {
        List<Question> questionsList = new ArrayList<>();
        db = getReadableDatabase();

        String orderBy = " RANDOM() LIMIT " + 20;


        Cursor c = db.query(Constants.QUESTIONS_TABLE, Constants.ALL_COLUMNS, null, null, null, null,orderBy);
        if (c.moveToFirst()) {
            do {
                Question questions = new Question();
                questions.setQuestion(c.getString(c.getColumnIndex(Constants.COLUMNS_QUESTION)));
                questions.setOption1(c.getString(c.getColumnIndex(Constants.COLUMNS_OPTION1)));
                questions.setOption2(c.getString(c.getColumnIndex(Constants.COLUMNS_OPTION2)));
                questions.setOption3(c.getString(c.getColumnIndex(Constants.COLUMNS_OPTION3)));
                questions.setOption4(c.getString(c.getColumnIndex(Constants.COLUMNS_OPTION4)));
                questions.setAnswer(c.getInt(c.getColumnIndex(Constants.ANSWER)));
                questionsList.add(questions);
            } while (c.moveToNext());
        }
        c.close();
        return questionsList;
    }


}
