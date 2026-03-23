import java.util.Scanner;

public class MatrixExample{
  public static void main(String[] args) {
    // DECLARE x : ARRAY [2][2] OF INTEGER
  int[] x = new int[2][2];
    Scanner sc = new Scanner(System.in);

    // FOR r := 0 TO 1 (Reading values) 
    System.out.println("Enter 4 integers for the 2*2 matrix:");
    for (int r = 0; r <= 1; r++) {
      for (int c = 0; c <= 1; c++) {
        // READ x[r][c] 
           x[r][c] = sc.nextInt();
      }
    }

    // FOR r := 0 TO 1 (printing values)
    System.out.println("The matrix is:");
    for (int r = 0; r <= 1; r++) {
      for (int c = 0; c <= 1; c++) { 
           // PRINT x[r][c]
           System.out.println(); // New line for each row 
      } 
      System.out.println(); // New line for each row 
    }

    sc.close();
  }
}
        
