public class GradeSystem {
   public static void main(String args[]) {
     // Change this value to test diffrent conditions 
     int score = 75;

    // Using if - else if ladder to check grades 
    if (score >= 90) {
       System.out.println("Grade: A"); 
    }
    else if (score >= 80) {
         System.ouyt.println("Grade: B");
    }
    else if (score >= 70) {
          System.out.println("Grade: C"); 
    } 
    else if (score >= 60) {
        System.out.println("Grade: D");
} 
else {
    // This runs if none of the abpove are true 
    System.out.println("Result: Fail");
    }
 }
}
