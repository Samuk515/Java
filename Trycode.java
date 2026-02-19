
import java.util.Scanner;

public class Trycode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        if(a%5 == 0){
            System.out.println("Divisible by 5");
        }
        else if(a%3 == 0){
            System.out.println("Divisibel by 3");
        }
        else if(a%3 == 0 && a%5 == 0){
            System.out.println("Divisible by both");
        }
        else {
            System.out.println("Not divisible by both");
        }
    }

    
}
