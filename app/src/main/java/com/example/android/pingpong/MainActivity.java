package com.example.android.pingpong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Methods for Team A Scoring
     */
    public void addOneForTeamA(View view) {
        scoreForTeamA = scoreForTeamA + 1;
        displayForTeamA(scoreForTeamA);
    }

    public void subtractOneForTeamA(View view) {
        scoreForTeamA = scoreForTeamA - 1;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Methods for Team B Scoring
     */
    public void addOneForTeamB(View view) {
        scoreForTeamB = scoreForTeamB + 1;
        displayForTeamB(scoreForTeamB);
    }

    public void subtractOneForTeamB(View view) {
        scoreForTeamB = scoreForTeamB - 1;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * OnClick reset scores for Team A and Team B
     */
    public void resetScore(View view) {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamB(scoreForTeamB);
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}



