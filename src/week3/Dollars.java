package week3;
import java.util.Scanner;

class Dollars {
    public static void main(String[] args) {

        //Initializing variables
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a dollar value");
        int dollar = input.nextInt();
        double twenties = dollar/20.0;
        double tens = 0.0;
        double fives = 0.0;
        double ones = 0.0;
        double remainder = 0.0;

        //Process to figure out how much to give for each note, the program breaks if the input isnt a whole number
        if (dollar%20.0 != 0) {

            remainder = twenties - (int)twenties;

            if (remainder*20.0%10.0 !=0){

                tens = remainder*20.0/10.0;
                remainder = tens - (int)tens;

                if (remainder*10.0%5.0 !=0){

                    fives = remainder*10.0/5.0;
                    remainder = fives - (int)fives;
                    ones = remainder*5.0;

                }
                else
                    fives = remainder*10.0/5.0;
            }
            else
                tens = remainder*20.0/10.0;
        }
        else
            twenties = dollar/20.0;

        System.out.println((int)twenties +" twenties "+ (int)tens + " tens " + (int)fives + " fives " + (int)ones + " ones");
    }
}