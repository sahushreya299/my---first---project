import java.util.Scanner;

public class ArrayExample {
  public static void main(String[] args) {
    // DECLARE a : ARRAY [0 : 4] OF INTEGER 
    int[] a = new int[5];
    Scanner scanner = new Scanner(System.in);

    // FOR i := 0 to 4 (READ a[i])
    System.out.println("Enter 5 integers: "):
      for (int i = 0; i < 5; i++) {
      a[i] = scanner.nextInt();
    }

    // FOR i  := 0 TO 4  (PRINT a[i])
    System.out.println("The elements in the array are: ");
    for (int i = 0; i < 5; i++) {
      System.out.println(a[i]);
    }

    scanner.close();
  }
}
      
