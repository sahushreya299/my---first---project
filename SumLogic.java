import java.util.Scanner;

public class ArrayProcessor {
  public static void main(String[] args) {
      // DECLARE sum, max : INTEGER 
      int sum = 0;
      int max;

      Scanner scanner = new Scanner(System.in);
      // FOR i = 0 TO 4 (READ a[i])
      System.out.println("Enter 5 integers:");
      for (int i = 0; i < 5; i++) {
        a[i] = scanner.nextInt();
        // Typically, sum is calculated inside 
        sum+=  a[i];
      }

      // SET max = a[0]
      max = a[0];

      // logic to find actual max (often follows the SET max line)
      for (int i = 1; i < a.length; i++) {
          if (a[i] > max) {
            max = a[i];
          }
      }

      // PRINT sum
      System.out.println("Sum: " + sum);
      System.out.println("Max value: " + max);

      scanner.close();
  }
}
    
