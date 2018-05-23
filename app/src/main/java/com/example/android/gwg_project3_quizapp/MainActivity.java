package com.example.android.gwg_project3_quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // TODO Score show up more than once with the variable new value
    //TODO Fix Variables names
    int score = 0; //Track the score for correct answers
    Boolean checkSubmit;

    EditText editQuestionOne; //Question One

    RadioGroup radioQuestionTwo; //Question two radio group
    RadioButton q2radioChoiceOne; //Question two choice one
    RadioButton q2radioChoiceTwo; //Question two choice two
    RadioButton q2radioChoiceThree; //Question two choice three

    CheckBox checkboxChoiceOne; //Question three choice one
    CheckBox checkboxChoiceTwo; //Question three choice two
    CheckBox checkboxChoiceThree; //Question three choice three

    RadioGroup radioQuestionFour; //Question four radio group
    RadioButton q4radioChoiceOne; //Question four choice one
    RadioButton q4radioChoiceTwo; //Question four choice two
    RadioButton q4radioChoiceThree; //Question four choice three

    RadioGroup radioQuestionFive; //Question five radio group
    RadioButton q5_choice_one; //Question five choice one
    RadioButton q5_choice_two; //Question five choice two



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editQuestionOne = findViewById(R.id.q1_answer);
        radioQuestionTwo = findViewById(R.id.q2_radio_group);
        q2radioChoiceOne = findViewById(R.id.q2_choice_one);
        q2radioChoiceTwo = findViewById(R.id.q2_choice_two);
        q2radioChoiceThree = findViewById(R.id.q2_choice_three);
        checkboxChoiceOne  = findViewById(R.id.q3_choice_one);
        checkboxChoiceTwo = findViewById(R.id.q3_choice_two);
        checkboxChoiceThree = findViewById(R.id.q3_choice_three);
        radioQuestionFour = findViewById(R.id.q4_radio_group);
        q4radioChoiceOne = findViewById(R.id.q4_choice_one);
        q4radioChoiceTwo = findViewById(R.id.q4_choice_two);
        q4radioChoiceThree = findViewById(R.id.q4_choice_three);
        radioQuestionFive = findViewById(R.id.radioQuestionFive);
        q5_choice_one = findViewById(R.id.q5_choice_one);
        q5_choice_two = findViewById(R.id.q5_choice_two);

        checkSubmit = false;
    }

    /**
     * Check for every answered
     * questions and add the score
     * */
    public void answerSubmit(View view) {

        /**
         * Question No.1
         * Correct Answer hobbyist
         * */
        String checkQ1 = editQuestionOne.getText().toString();
        if (checkQ1.equalsIgnoreCase("hobbyist")) {
            score += 1;
        }
        /**
         * Question No.2
         * Correct Answer 2001
         * */
        if (q2radioChoiceTwo.isChecked()) {
            score += 1;
        }

        /**
         * Question No.3
         * Correct Answers 200 feet & 61 meters
         * */
        // TODO Score give points when user select just one checkbox
        if (checkboxChoiceOne.isChecked() && checkboxChoiceTwo.isChecked()) {
            score += 1;
        }

        /**
         * Question No.4
         * Correct Answer beers
         * */
        if (q4radioChoiceTwo.isChecked()){
            score += 1;
        }

        /**
         * Question No.5
         * Correct Answer True
         * */
        if (q5_choice_one.isChecked()){
            score += 1;
        }

        showToast();
    }

    // Show the final score and prevent user to resubmit questions
    private void showToast() {
        if (checkSubmit) {
            Toast.makeText(this, getString(R.string.check_submit), Toast.LENGTH_LONG).show();
        }else {

            Toast.makeText(this, getString(R.string.final_score) + score, Toast.LENGTH_LONG).show();
            checkSubmit = true;
        }

    }

    // Reset all variables and scores.
    public void resetScreen(View view){
        score = 0;
        checkSubmit = false;
        editQuestionOne.setText("");
        radioQuestionTwo.clearCheck();
        radioQuestionFour.clearCheck();
        radioQuestionFive.clearCheck();
        checkboxChoiceOne.setChecked(false);
        checkboxChoiceTwo.setChecked(false);
        checkboxChoiceThree.setChecked(false);

    }
}


