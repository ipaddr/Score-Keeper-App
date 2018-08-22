package id.iip.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;

    private TextView tvTeamAScore, tvTeamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTeamAScore = (TextView)findViewById(R.id.ScoreA);
        tvTeamBScore = (TextView)findViewById(R.id.ScoreB);
    }

    private void updateScoreA(int point){
        scoreA += point;
        tvTeamAScore.setText(String.valueOf(scoreA));
    }

    private void updateScoreB(int point){
        scoreB += point;
        tvTeamBScore.setText(String.valueOf(scoreB));
    }

    public void threeA(View view){
        updateScoreA(3);
    }

    public void twoA(View view){
        updateScoreA(2);
    }

    public void oneA(View view){
        updateScoreA(1);
    }

    public void threeB(View view){
        updateScoreB(3);
    }

    public void twoB(View view){
        updateScoreB(2);
    }

    public void oneB(View view){
        updateScoreB(1);
    }

    public void reset(View view){
        scoreA = 0;
        updateScoreA(0);
        scoreB = 0;
        updateScoreB(0);
    }
}
