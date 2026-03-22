import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
      // Create a scanner for input (maps to READ) 
      Scanner input = new Scanner(System.in);

     // DECLARE num1 : INTEGER 
     int num1;

     System.out.println("Enter a number: ");
     // READ num1
     num1 = input.nextInt();

    // condition Logic 
    if (num1 > 0) {
         // PRINT "Positive"
         System.out.println("Positive"); 
    }
    else if {
      // ELSE IF num < 0 THEN PRINT "Negative"
      System.out.println("Negative");
    }
    else {
      // ELSE PRINT "Zero"
      System.out.println("Zero");
    }

    input.close();
    }
}
