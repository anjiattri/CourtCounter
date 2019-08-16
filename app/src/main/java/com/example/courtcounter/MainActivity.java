package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;





        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void resetScore(View V )
    {
    scoreTeamA=0;
    scoreTeamB=0;
    displayForTeamA(scoreTeamA);
    displayForTeamB(scoreTeamB);
    }
    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));

    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));}


    public void addThreeForTeamA(View V)
    {    scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA(View V)
    {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    } public void addFreeForA(View V)
    {    scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }


    public void addThreeForTeamB(View V)
        {    scoreTeamB=scoreTeamB+3;
            displayForTeamB(scoreTeamB);
        }
        public void addTwoForTeamB(View V)
        {
            scoreTeamB=scoreTeamB+2;
            displayForTeamB(scoreTeamB);
        } public void addFreeForB(View V)
        {    scoreTeamB=scoreTeamB+1;
            displayForTeamB(scoreTeamB);
        }
}
