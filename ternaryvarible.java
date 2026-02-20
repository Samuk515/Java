
import java.util.Scanner;

public class ternaryvarible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int mark = (n>=0) ? 100 :0;
        System.out.println(mark);
    }
    
}
