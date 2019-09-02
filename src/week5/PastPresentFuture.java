package week5;

import java.util.Scanner;

public class PastPresentFuture {

    public static void main(String[] args){

        int month;
        int day;
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a month as a number");
        month = input.nextInt();
        System.out.println("Please input a day as a number");
        day = input.nextInt();
        System.out.println("Please input a year as a number");
        year = input.nextInt();




        if (year == 2019){

            if (month > 8){
                System.out.println("The date is this year at a later month");
            }

            else if (month < 8){
                System.out.println("The date is this year in an earlier month");
            }

            else{
                System.out.println("The date is this year in this month");
            }
        }

        else {
            System.out.println("The date is not this year");
        }
    }
}
