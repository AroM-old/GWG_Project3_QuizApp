package com.example.android.gwg_project3_quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // TODO Score show up more than once with the variable new value
    //TODO Fix Variables names
    int score = 0; //Track the score for correct answers

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Check for every answered questions and add the score
    public void answerSubmit(View view) {

        //Question No.1
        EditText editQuestionOne = findViewById(R.id.Q1_Ans1);
        String checkQ1 = editQuestionOne.getText().toString();
        if (checkQ1.equalsIgnoreCase("hobbyist")) {
            score++;
            showToast();
        }

        //Question No.2
        RadioButton radioQuestionTwo = findViewById(R.id.Q2_Ans2);
        if (radioQuestionTwo.isChecked()) {
            score++;
            showToast();
        }

        //Question No.3
        CheckBox checkboxAnswers = findViewById(R.id.checkbox_ans2);
        if (checkboxAnswers.isChecked()) {
            score++;
            showToast();
        }

        //Question No.4
        RadioButton radioQuestionFour = findViewById(R.id.Q4_Ans2);
        if (radioQuestionFour.isChecked()){
            score++;
            showToast();
        }
    }

    //Display final score.
    private void showToast() {
        if (score == 0) {
            Toast.makeText(this, "Sorry your Score is: " + score, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Congrats your Score is: " + score, Toast.LENGTH_LONG).show();
        }
    }

    public void resetScreen(View view){
        score = 0;

    }
}


