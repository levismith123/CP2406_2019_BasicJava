package week5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AscendingandDescending {

    public static void main(String[] args){

        int one, two, three;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        one = input.nextInt();
        System.out.println("Enter the second number");
        two = input.nextInt();
        System.out.println("Enter the third number");
        three = input.nextInt();

        List<Integer> list = Arrays.asList(one, two, three);
        Collections.sort(list);
        System.out.println("Ascending order\n" + list);
        list.sort(Collections.reverseOrder());
        System.out.println("Descending order\n" + list);
    }
}
