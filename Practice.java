import java.util.Scanner;

public class CheckNumber {
     public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);

    int x ; // declare integer
    System.out.println("Enter the value of x: " );
    x = sc.nextInt(); // read x 

    if ( x>= 5 ) {
       System.out.println(" x is greater than or equal to 5");
       }

       sc.close();
    }
}
