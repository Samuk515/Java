
import java.util.Scanner;

public class Fourdigit {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();
    // if(n>999 && n<10000){
    // System.out.println("4 Digit Number");
    // }
    // else {
    //    System.out.println("Not 4 digit number"); 
    // }
     if(n%5 ==0 || n%3 ==0)
        System.out.println("Divisible by 5 and 3");
    else
        System.out.println("Not divsibel by 5 and 3 5");

}    
}
