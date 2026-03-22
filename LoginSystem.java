import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
      // create a Scannner object for user input 
      Scanner scanner = new Scanner(System.in);

      // DECLARE uid : STRING 
      // DECLARE pass: STRING
      String uid;
      String pass;

      // READ uid 
      System.out.println("Enter User ID: ");
      uid = scanner.nextLine();

      // READ pass
      System.out.println("Enter the Password: ");
      pass = scanner.nextLine();

      // IF uid = "TIT" THEN
      if (uid.equals("TIT")) {
        // IF pass = "TIT" THEN
         if //(pass.equals("TIT)) {
            System.out.println("Welcome");
      }
      // ElSE 
      else {
        System.out.println("Invaild password");
      }
      // END IF 

    } 
    // ELSE 
    else {
      System.out.println("Invaild uid");
    }
    // END IF 
  
      scanner.close();
    } 
}
