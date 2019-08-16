package week3;

public class InchesToFeet {
    public static void main(String[] args) {
        double start_inches = 200.0;
        double feet = start_inches/12.0;
        int whole_number = (int)feet;
        double decimal = feet - whole_number;
        int inches = (int)(decimal*12);

        System.out.println(whole_number + " Feet " + inches + " Inches");
    }
}