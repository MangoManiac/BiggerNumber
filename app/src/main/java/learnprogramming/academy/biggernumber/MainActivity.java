package learnprogramming.academy.biggernumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random rand = new Random();
    private int randomNumberOne = 0;
    private int randomNumberTwo = 0;
    private int score = 0;
    private int lives = 5;
//    TextView tvMain = this.findViewById(R.id.mainView);
//    TextView tvOne = this.findViewById(R.id.numberOneView);
//    TextView tvTwo = this.findViewById(R.id.numberTwoView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void buttonOne_click(View view){
        TextView tvMain = this.findViewById(R.id.mainView);
        boolean liveOrDead = lifeCheck(lives);
        if (liveOrDead==true){
//            tvMain.setText("Game Over! Resetting score");
            score=0;
            lives=5;
            tvMain.setText("Score : " + Integer.toString(score) + " Lives : " + Integer.toString(lives));
        }else{
            randomNumberOne = rand.nextInt(10)+1;
            randomNumberTwo = rand.nextInt(10)+1;

            if (randomNumberOne>randomNumberTwo){
                score++;
                tvMain.setText("Congratulations. Score : " + Integer.toString(score));
            }else if(randomNumberOne == randomNumberTwo){
                lives--;
                tvMain.setText("Number was equal. Lives : " + Integer.toString(lives));
            }else{
                lives--;
                tvMain.setText("Number was smaller. Lives : " + Integer.toString(lives));
            }
        }


    }

    public void buttonTwo_click(View view){
        TextView tvMain = this.findViewById(R.id.mainView);
        boolean liveOrDead = lifeCheck(lives);
        if (liveOrDead==true){
//            tvMain.setText("Game Over! Resetting score");
            score=0;
            lives=5;
            tvMain.setText("Score : " + Integer.toString(score) + " Lives : " + Integer.toString(lives));
        }else{
            randomNumberOne = rand.nextInt(10)+1;
            randomNumberTwo = rand.nextInt(10)+1;
            if (lives <1){
                tvMain.setText("Game Over! Resetting score");
                score=0;
                lives=5;
            }
            if (randomNumberTwo>randomNumberOne){
                score++;
                tvMain.setText("Congratulations. Score : " + Integer.toString(score));
            }else if(randomNumberTwo == randomNumberOne){
                lives--;
                tvMain.setText("Number was equal. Lives: " + Integer.toString(lives));
            }else{
                lives --;
                tvMain.setText("Number was smaller. Lives : " + Integer.toString(lives));
            }
        }


    }

    public boolean lifeCheck(int life){
        life = this.lives;
        if (life <1){
            return true;
        }else{
            return false;
        }

    }




}



