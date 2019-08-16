package week3;
import java.util.Random;
import java.util.Scanner;

public class Game{
    private Random random = new Random();
    int secret = random.nextInt(10) + 1; //Assigns random value from 1-10

    int count;
    int wins;
    public static void main(String[] args){

        int Guess;
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1-10");
        Guess = input.nextInt();

        if (makeGuess(Guess)) {
            System.out.println("You won");
        }
        else
            System.out.println("You lost");
    }

    boolean makeGuess(int value){

        count++;
        if (secret == value){
            wins++;
            return true;
        }
        return false;
    }
}