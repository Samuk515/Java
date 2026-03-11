
import java.util.Scanner;

public class samir {
    public static int calculateAdd(int a, int b){
        int sam = a +b;
        return sam;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        

        System.out.println("The sum of the two numbers is: "+ calculateAdd(a, b));
    }
}