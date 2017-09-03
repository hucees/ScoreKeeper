package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scoreTeamB;
    int teamAPenalties;
    int teamBPenalties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method resets and displays the score to zero for both teams when the reset button is clicked.
     */
    public void resetGame(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        teamAPenalties = 0;
        teamBPenalties = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayPenaltiesForTeamA(teamAPenalties);
        displayPenaltiesForTeamB(teamBPenalties);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the penalties for Team B.
     */
    public void displayPenaltiesForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAPenalties);
        scoreView.setText(String.valueOf(score));
    }
    public void addOnePenaltyForTeamA(View view) {
        teamAPenalties = teamAPenalties + 1;
        displayPenaltiesForTeamA(teamAPenalties);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the penalties for Team B.
     */
    public void displayPenaltiesForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBPenalties);
        scoreView.setText(String.valueOf(score));
    }
    public void addOnePenaltyForTeamB(View view) {
        teamBPenalties = teamBPenalties + 1;
        displayPenaltiesForTeamB(teamBPenalties);
    }
}
