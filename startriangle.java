
import java.util.Scanner;

public class startriangle {
   public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // print a decreasing pattern
    // outer loop starts at n and counts down to 1
    for (int i = n; i >= 1; i--) {
        // inner loop prints stars (or numbers) up to the current value of i
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");  // change to j+" " if you prefer numbers
        }
        System.out.println();
    }

   } 
}
