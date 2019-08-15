package week3;
import java.util.Random;

public class Game{
    private Random random = new Random();
    int secret = random.nextInt(10) + 1; //Assigns random value from 1-10

    int count;
    int wins;

    void makeGuess(int value){

        count++;
        if (secret == value){
            wins++;
        }
    }
}