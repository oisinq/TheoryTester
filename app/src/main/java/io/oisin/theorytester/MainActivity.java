package io.oisin.theorytester;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import static io.oisin.theorytester.R.id.group4;
import static io.oisin.theorytester.R.id.group5;

public class MainActivity extends AppCompatActivity {

    // This global variable stores the score
    // When the app is opened, the score is 0
    int score = 0;

    public void resetQuiz(View v) {

        RadioGroup group1 = (RadioGroup) findViewById(R.id.group1);
        for (int i = 0; i < group1.getChildCount(); i++) {
            RadioButton b = (RadioButton)group1.getChildAt(i);

            b.setEnabled(true);
            b.setTextColor(ContextCompat.getColor(this, R.color.black));
        }
        group1.clearCheck();

        RadioGroup group2 = (RadioGroup) findViewById(R.id.group2);
        for (int i = 0; i < group2.getChildCount(); i++) {
            RadioButton b = (RadioButton)group2.getChildAt(i);

            b.setEnabled(true);
            b.setTextColor(ContextCompat.getColor(this, R.color.black));
        }
        group2.clearCheck();

        RadioGroup group3 = (RadioGroup) findViewById(R.id.group3);
        for (int i = 0; i < group3.getChildCount(); i++) {
            RadioButton b = (RadioButton)group3.getChildAt(i);

            b.setEnabled(true);
            b.setTextColor(ContextCompat.getColor(this, R.color.black));
        }
        group3.clearCheck();

        RadioGroup group4 = (RadioGroup) findViewById(R.id.group4);
        for (int i = 0; i < group4.getChildCount(); i++) {
            RadioButton b = (RadioButton)group4.getChildAt(i);

            b.setEnabled(true);
            b.setTextColor(ContextCompat.getColor(this, R.color.black));
        }
        group4.clearCheck();

        RadioGroup group5 = (RadioGroup) findViewById(R.id.group5);
        for (int i = 0; i < group5.getChildCount(); i++) {
            RadioButton b = (RadioButton)group5.getChildAt(i);

            b.setEnabled(true);
            b.setTextColor(ContextCompat.getColor(this, R.color.black));
        }
        group5.clearCheck();

        score = 0;
        setAnswer();


        ScrollView mainScrollView = (ScrollView)findViewById(R.id.activity_main);
        mainScrollView.fullScroll(ScrollView.FOCUS_UP);
    }

    public void share(View v) {

        String message = "";
        if (score > 3) {
            message = "I passed my theory test with a score of " + score + " out of 5 in the Theory Tester app.\nTry it out!";
        } else {
            message = "I scored " + score + " out of 5 in the Theory Tester app.\nTry it out!";
        }

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, message);
        sendIntent.setType("text/plain");
        startActivity(Intent.createChooser(sendIntent, "Share your score with friends!"));
    }

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

        RadioGroup group = (RadioGroup) findViewById(group4);
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

        RadioGroup group = (RadioGroup) findViewById(group5);
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
