package com.example.android.gwg_project3_quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void answerSubmit(View view) {

        //Q1
        EditText editQuestionOne = findViewById(R.id.Q1_Ans1);
        String checkQ1 = editQuestionOne.getText().toString();
        if (checkQ1.equalsIgnoreCase("hobbyist")){
            score++;
            Log.v("Correct", "Points:" + score);
        }else {
            Log.v("Wrong", "Points:" + score);
        }

        //Q2
        RadioButton radioQuestionTwo = findViewById(R.id.Q2_Ans2);
        if (radioQuestionTwo.isChecked()){
            score++;
            Log.v("Correct", "Points" + score);
        }

        //Q3
        CheckBox checkboxAnswers = findViewById(R.id.checkbox_ans2);
        if (checkboxAnswers.isChecked()){
            score++;
            Log.v("Correct", "Points" + score);
        }
        //Q4
        EditText editQuestionTwo = findViewById(R.id.Q4_Ans1);
        String checkQ4 = editQuestionTwo.getText().toString();
        if (checkQ4.equalsIgnoreCase("Beers")){
            score++;
            Log.v("Correct", "Points: " + score);
        }

    }
}
