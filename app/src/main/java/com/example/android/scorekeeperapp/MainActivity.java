package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for Ravens
    int scoreRavens = 0;
    // Tracks the score for Texans
    int scoreTexans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Ravens by 6 points when the user hit the touchdown button.
     */
    public void addSixForRavens(View v) {
        scoreRavens += 6;
        displayForRavens(scoreRavens);
    }

    /**
     * Increase the score for Texans by 6 points when the user hit the touchdown button.
     */
    public void addSixForTexans(View v) {
        scoreTexans += 6;
        displayForTexans(scoreTexans);
    }

    /**
     * Increase the score for Ravens by 3 points when the user hit the field goal button.
     */
    public void addThreeForRavens(View v) {
        scoreRavens += 3;
        displayForRavens(scoreRavens);
    }

    /**
     * Increase the score for Texans by 3 points when the user hit the field goal button.
     */
    public void addThreeForTexans(View v) {
        scoreTexans += 3;
        displayForTexans(scoreTexans);
    }

    /**
     * Increase the score for Ravens by 2 points when the user hit the safety button.
     */
    public void addTwoForRavens(View v) {
        scoreRavens += 2;
        displayForRavens(scoreRavens);
    }

    /**
     * Increase the score for Texans by 2 points when the user hit the safety button.
     */
    public void addTwoForTexans(View v) {
        scoreTexans += 2;
        displayForTexans(scoreTexans);
    }

    /**
     * Reset the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreRavens = 0;
        scoreTexans = 0;
        displayForRavens(scoreRavens);
        displayForTexans(scoreTexans);
    }

    /**
     * Displays the given score for Ravens.
     */
    private void displayForRavens(int score) {
        TextView scoreView = findViewById(R.id.ravens_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Texans.
     */
    private void displayForTexans(int score) {
        TextView scoreView = findViewById(R.id.texans_score);
        scoreView.setText(String.valueOf(score));
    }
}