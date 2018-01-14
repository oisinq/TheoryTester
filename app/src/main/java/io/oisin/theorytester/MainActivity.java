package io.oisin.theorytester;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // This global variable stores the score
    // When the app is opened, the score is 0
    int score = 0;

    /**
     * This checks if the selected answer for Q1 is correct, changes the score, and disables the RadioGroup
     */
    public void correctAnswerQ1(View v) {

        // This checks if the correct button is checked
        RadioButton button = (RadioButton) findViewById(R.id.q1correct);
        // If it is, we increment the score
        if (button.isChecked()) {
            score++;
        }

        // This changes the colour of the correct answer to green
        button.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));

        RadioGroup group = (RadioGroup) findViewById(R.id.group1);
        // This iterates through the RadioGroup to disable each RadioButton
        // We do this as we don't want the user to change their answer after selecting it
        for (int i = 0; i < group.getChildCount(); i++) {
            group.getChildAt(i).setEnabled(false);
        }

        // This sets the answer text at the bottom of the screen
        setAnswer();
    }

    /**
     * This checks if the selected answer for Q2 is correct, changes the score, and disables the RadioGroup
     */
    public void correctAnswerQ2(View v) {

        // This checks if the correct button is checked
        RadioButton button = (RadioButton) findViewById(R.id.q2correct);
        // If it is, we increment the score
        if (button.isChecked()) {
            score++;
        }

        // This changes the colour of the correct answer to green
        button.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));

        RadioGroup group = (RadioGroup) findViewById(R.id.group2);
        // This iterates through the RadioGroup to disable each RadioButton
        // We do this as we don't want the user to change their answer after selecting it
        for (int i = 0; i < group.getChildCount(); i++) {
            group.getChildAt(i).setEnabled(false);
        }

        // This sets the answer text at the bottom of the screen
        setAnswer();
    }

    /**
     * This checks if the selected answer for Q3 is correct, changes the score, and disables the RadioGroup
     */
    public void correctAnswerQ3(View v) {

        // This checks if the correct button is checked
        RadioButton button = (RadioButton) findViewById(R.id.q3correct);
        // If it is, we increment the score
        if (button.isChecked()) {
            score++;
        }

        // This changes the colour of the correct answer to green
        button.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));

        RadioGroup group = (RadioGroup) findViewById(R.id.group3);
        // This iterates through the RadioGroup to disable each RadioButton
        // We do this as we don't want the user to change their answer after selecting it
        for (int i = 0; i < group.getChildCount(); i++) {
            group.getChildAt(i).setEnabled(false);
        }

        // This sets the answer text at the bottom of the screen
        setAnswer();
    }

    /**
     * This checks if the selected answer for Q4 is correct, changes the score, and disables the RadioGroup
     */
    public void correctAnswerQ4(View v) {

        // This checks if the correct button is checked
        RadioButton button = (RadioButton) findViewById(R.id.q4correct);
        // If it is, we increment the score
        if (button.isChecked()) {
            score++;
        }

        // This changes the colour of the correct answer to green
        button.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));

        RadioGroup group = (RadioGroup) findViewById(R.id.group4);
        // This iterates through the RadioGroup to disable each RadioButton
        // We do this as we don't want the user to change their answer after selecting it
        for (int i = 0; i < group.getChildCount(); i++) {
            group.getChildAt(i).setEnabled(false);
        }

        // This sets the answer text at the bottom of the screen
        setAnswer();
    }

    /**
     * This checks if the selected answer for Q5 is correct, changes the score, and disables the RadioGroup
     */
    public void correctAnswerQ5(View v) {

        // This checks if the correct button is checked
        RadioButton button = (RadioButton) findViewById(R.id.q5correct);
        // If it is, we increment the score
        if (button.isChecked()) {
            score++;
        }

        // This changes the colour of the correct answer to green
        button.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));

        RadioGroup group = (RadioGroup) findViewById(R.id.group5);
        // This iterates through the RadioGroup to disable each RadioButton
        // We do this as we don't want the user to change their answer after selecting it
        for (int i = 0; i < group.getChildCount(); i++) {
            group.getChildAt(i).setEnabled(false);
        }

        TextView answer = (TextView) findViewById(R.id.answer);
        String answerValue = "Result: " + score + "/5";

        // If you score more than 3 points, you pass the test
        // Otherwise, you fail. Try not to do that!
        if(score > 3) {
            answerValue += "\nCongrats, you've passed!";
            answer.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
        } else {
            answerValue += "\nSorry, you've failed. Better luck next time!";
        }
        answer.setText(answerValue);
    }

    /**
     * This sets the value of the answer TextView at the bottom of the app
     */
    public void setAnswer() {
        TextView answer = (TextView) findViewById(R.id.answer);
        String answerValue = getString(R.string.result, score);


        answer.setText(answerValue);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAnswer();
    }
}
