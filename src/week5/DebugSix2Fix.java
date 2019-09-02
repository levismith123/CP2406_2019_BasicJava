package week5;
// DebugSix2.java
// Display every character between Unicode 65 and 122
// Start new line after 20 characters
public class DebugSix2Fix
{
   public static void main(String[] args)
   {
      char letter = 'a';
      int a;
      final int MIN = 65;
      final int MAX = 122;
      int i = 0;

      for(a = MIN; a <= MAX; a++) {

          letter = (char) a;
          System.out.print("  " + letter);
          i++;
          if (i == 20){
              i = 0;
              System.out.print("\n");
          }
      }

      System.out.println("\nEnd of application");
    }
}