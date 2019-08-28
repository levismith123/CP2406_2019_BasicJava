package week5;

import java.util.Scanner;

public class CellPhoneService {

    public static void main(String[] args){

        int talkMinutes;
        int textSent;
        int gbData;

        Scanner input = new Scanner(System.in);
        System.out.println("Please input your monthly value for talk minutes");
        talkMinutes = input.nextInt();
        System.out.println("Please input your monthly value for texts sent");
        textSent = input.nextInt();
        System.out.println("Please input your monthly value for GB data used");
        gbData = input.nextInt();

        if (talkMinutes <=500 && textSent == 0 && gbData == 0){
            System.out.println("Plan A for $49 per month is recommended");
        }

        else if (talkMinutes <=500 && textSent != 0 && gbData == 0){
            System.out.println("Plan B for $55 per month is recommended");
        }

        else if (talkMinutes >= 500 && gbData == 0){
            System.out.println("Plan C for $61 per month with 100 text messages or Plan D " +
                    "with 100 texts or more for $70 per month is recommended");
        }

        else if (gbData > 0){
            System.out.println("Plan E with 2gb of data for $79 or Plan F with 2gb or more data for $87 is recommended");
        }

        else{
            System.out.println("Error");
        }

    }
}
