
import java.util.Scanner;

public class AP {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for (int i=2; i<=3*n-1; i+=3) {
            System.out.println(i+" ");
            // int a=2, d=3; for(int i=1; i<=n; i++){sout(a+" ");    a+=d;}
            
        }
    }
}
