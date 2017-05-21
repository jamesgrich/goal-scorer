package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.team_a_foul;
import static com.example.android.courtcounter.R.id.team_a_penalty;
import static com.example.android.courtcounter.R.id.team_b_foul;
import static com.example.android.courtcounter.R.id.team_b_penalty;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int penaltyTeamA = 0;
    int penaltyTeamB = 0;
    TextView teamAScore;
    TextView teamBScore;
    TextView teamAFoul;
    TextView teamAPenalty;
    TextView teamBFoul;
    TextView teamBPenalty;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAScore = (TextView) findViewById(R.id.team_a_score);
        teamAFoul = (TextView) findViewById(team_a_foul);
        teamAPenalty = (TextView) findViewById(team_a_penalty);
        teamBScore = (TextView) findViewById(R.id.team_b_score);
        teamBFoul = (TextView) findViewById(team_b_foul);
        teamBPenalty = (TextView) findViewById(team_b_penalty);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        teamAScore.setText(String.valueOf(score));
    }

    public void addGoalForTeamA (View v) {
        scoreTeamA = scoreTeamA + 1 ;
        displayGoalForTeamA(scoreTeamA);
    }

    public void displayFoulForTeamA(int score) {
        teamAFoul.setText(String.valueOf(score));
    }

    public void addFoulForTeamA (View v) {
        foulTeamA = foulTeamA + 1 ;
        displayFoulForTeamA(foulTeamA);
    }

    public void displayPenaltyForTeamA(int score) {
        teamAPenalty.setText(String.valueOf(score));
    }

    public void addPenaltyForTeamA (View v) {
        penaltyTeamA = penaltyTeamA + 1 ;
        displayPenaltyForTeamA(penaltyTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayGoalForTeamB(int score) {
        teamBScore.setText(String.valueOf(score));
    }

    public void addGoalForTeamB (View v) {
        scoreTeamB = scoreTeamB + 1 ;
        displayGoalForTeamB(scoreTeamB);
    }

    public void displayFoulForTeamB(int score) {
        teamBFoul.setText(String.valueOf(score));
    }

    public void addFoulForTeamB (View v) {
        foulTeamB = foulTeamB + 1 ;
        displayFoulForTeamB(foulTeamB);
    }

    public void displayPenaltyForTeamB(int score) {
        teamBPenalty.setText(String.valueOf(score));
    }

    public void addPenaltyForTeamB (View v) {
        penaltyTeamB = penaltyTeamB + 1 ;
        displayPenaltyForTeamB(penaltyTeamB);
    }

    // Resets the score for both teams back to zero //

    public void resetScore (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        penaltyTeamA = 0;
        penaltyTeamB = 0;

        displayGoalForTeamA(scoreTeamA);
        displayGoalForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
        displayPenaltyForTeamA(penaltyTeamA);
        displayPenaltyForTeamB(penaltyTeamB);

    }
}