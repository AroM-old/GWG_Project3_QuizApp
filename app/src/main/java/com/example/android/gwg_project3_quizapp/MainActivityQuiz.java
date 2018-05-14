package com.example.android.gwg_project3_quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivityQuiz extends AppCompatActivity {

    int score = 0;
    //Q1
    EditText editQuestionOne = findViewById(R.id.Q1_Ans1);
    String checkQ1 = editQuestionOne.getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if (checkQ1.equalsIgnoreCase("hobbyist")) {
            score = score + 1;
        }

    }

    public void answerSubmit(View view) {
        if (score == 1){
            Log.v("Correct", "Points:" + score);
        }else {
            Log.v("Wrong", "Points:" + score);
        }
    }
}
