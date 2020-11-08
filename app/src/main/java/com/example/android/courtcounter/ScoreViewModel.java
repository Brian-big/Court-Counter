package com.example.android.courtcounter;

import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {
    private int scoreTeamA = 0, scoreTeamB = 0;

    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }

    public void addOneToTeamA(){ scoreTeamA += scoreTeamA; }
    public void addTwoToTeamA(){ scoreTeamA = scoreTeamA+2; }
    public void addThreeToTeamA(){ scoreTeamA = scoreTeamA+3; }
    public void addOneToTeamB(){ scoreTeamB += scoreTeamB; }
    public void addTwoToTeamB(){ scoreTeamB = scoreTeamB+2;}
    public void addThreeToTeamB(){ scoreTeamB = scoreTeamB+3;}
    public void reset(){
        scoreTeamA = 0;
         scoreTeamB = 0;
    }
}
