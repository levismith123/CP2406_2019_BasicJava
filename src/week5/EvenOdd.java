package week5;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        int Number;
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        Number = input.nextInt();

        if (Number%2 != 0){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }
    }
}
