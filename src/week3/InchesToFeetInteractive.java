package week3;
import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        double start_inches = input.nextInt();
        double feet = start_inches/12.0;
        int whole_number = (int)feet;
        double decimal = feet - whole_number;
        int inches = (int)(decimal*12);
        System.out.println(whole_number + " Feet " + inches + " Inches");
    }
}