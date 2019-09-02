package week5;

import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2 {
    public static void main(String[] args){

        String month;
        String day;
        String year;

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a month as a number");
        month = input.nextLine();
        System.out.println("Please input a day as a number");
        day = input.nextLine();
        System.out.println("Please input a year as a number");
        year = input.nextLine();

        LocalDate date = LocalDate.parse(year + "-" + month + "-" + day);
        LocalDate present = LocalDate.parse("2019-09-01");

        if (date.isAfter(present)){
            System.out.println("That date is in the future");
        }

        else if (date.isBefore(present)){
            System.out.println("That date is in the past");
        }

        else{
            System.out.println("That date is the current date");
        }
    }
}
