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

    int score = 0; //Track the score for correct answers
    Boolean checkSubmit;

    EditText editTextRtfDrone; //Question One

    RadioGroup firstRadioGroup; //Question two radio group
    RadioButton RadioButton1999; //Question two choice one
    RadioButton RadioButton2001; //Question two choice two
    RadioButton RadioButton2004; //Question two choice three

    CheckBox checkbox200Feet; //Question three choice one
    CheckBox checkbox61Meters; //Question three choice two
    CheckBox checkbox600Feet; //Question three choice three

    RadioGroup SecondRadioGroup; //Question four radio group
    RadioButton RadioButtonDoritosBag; //Question four choice one
    RadioButton RadioButtonBeerBottle; //Question four choice two
    RadioButton RadioButtonPizzaBox; //Question four choice three

    RadioGroup ThirdRadioGroup; //Question five radio group
    RadioButton RadioButtonTrue; //Question five choice one
    RadioButton RadioButtonFalse; //Question five choice two

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextRtfDrone = findViewById(R.id.editText_rtf_drones);
        firstRadioGroup = findViewById(R.id.first_radio_group);
        RadioButton1999 = findViewById(R.id.radio_button_1999);
        RadioButton2001 = findViewById(R.id.radio_button_2001);
        RadioButton2004 = findViewById(R.id.radio_button_2004);
        checkbox200Feet = findViewById(R.id.check_box_feet);
        checkbox61Meters = findViewById(R.id.check_box_61_meters);
        checkbox600Feet = findViewById(R.id.check_box_600_feet);
        SecondRadioGroup = findViewById(R.id.second_radio_group);
        RadioButtonDoritosBag = findViewById(R.id.radio_button_doritos_bag);
        RadioButtonBeerBottle = findViewById(R.id.radio_button_beers_bottle);
        RadioButtonPizzaBox = findViewById(R.id.radio_button_pizza_box);
        ThirdRadioGroup = findViewById(R.id.third_radio_group);
        RadioButtonTrue = findViewById(R.id.radio_button_true);
        RadioButtonFalse = findViewById(R.id.radio_button_false);

        checkSubmit = false;
    }

    /**
     * Check for every answered
     * questions and add the score
     */
    public void answerSubmit(View view) {

        /**
         * Question No.1
         * Correct Answer "hobbyist"
         * */
        String checkAnswerQuestion1 = editTextRtfDrone.getText().toString();
        if (checkAnswerQuestion1.equalsIgnoreCase("hobbyist")) {
            score += 1;
        }
        /**
         * Question No.2
         * Correct Answer "2001"
         * */
        if (RadioButton2001.isChecked()) {
            score += 1;
        }

        /**
         * Question No.3
         * Correct Answers "200 feet && 61 meters"
         * */
        if (checkbox200Feet.isChecked() && checkbox61Meters.isChecked() && !checkbox600Feet.isChecked()) {
            score += 1;
        }

        /**
         * Question No.4
         * Correct Answer "beer bottle"
         * */
        if (RadioButtonBeerBottle.isChecked()) {
            score += 1;
        }

        /**
         * Question No.5
         * Correct Answer "True"
         * */
        if (RadioButtonTrue.isChecked()) {
            score += 1;
        }

        showToast();
    }

    // Show the final score and prevent user to resubmit questions
    private void showToast() {
        if (checkSubmit) {
            Toast.makeText(this, getString(R.string.check_submit), Toast.LENGTH_LONG).show();
        } else {

            Toast.makeText(this, getString(R.string.final_score) + score, Toast.LENGTH_LONG).show();
            checkSubmit = true;
        }

    }

    // Reset all variables and scores.
    public void resetScreen(View view) {
        score = 0;
        checkSubmit = false;
        editTextRtfDrone.setText("");
        firstRadioGroup.clearCheck();
        SecondRadioGroup.clearCheck();
        ThirdRadioGroup.clearCheck();
        checkbox200Feet.setChecked(false);
        checkbox61Meters.setChecked(false);
        checkbox600Feet.setChecked(false);

    }
}


