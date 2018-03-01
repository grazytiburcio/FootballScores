package com.example.android.footballscores;

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
     * Increase the score for Ravens by 6 points.
     */
    public void addSixForRavens(View v) {
        scoreRavens = scoreRavens + 6;
        displayForRavens(scoreRavens);
    }

    /**
     * Increase the score for Texans by 6 points.
     */
    public void addSixForTexans(View v) {
        scoreTexans = scoreTexans + 6;
        displayForTexans(scoreTexans);
    }

    /**
     * Increase the score for Ravens by 3 points.
     */
    public void addThreeForRavens(View v) {
        scoreRavens = scoreRavens + 3;
        displayForRavens(scoreRavens);
    }

    /**
     * Increase the score for Texans by 3 points.
     */
    public void addThreeForTexans(View v) {
        scoreTexans = scoreTexans + 3;
        displayForTexans(scoreTexans);
    }

    /**
     * Increase the score for Ravens by 2 points.
     */
    public void addTwoForRavens(View v) {
        scoreRavens = scoreRavens + 2;
        displayForRavens(scoreRavens);
    }

    /**
     * Increase the score for Texans by 2 points.
     */
    public void addTwoForTexans(View v) {
        scoreTexans = scoreTexans + 2;
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
    public void displayForRavens(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ravens_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Texans.
     */
    public void displayForTexans(int score) {
        TextView scoreView = (TextView) findViewById(R.id.texans_score);
        scoreView.setText(String.valueOf(score));
    }
}