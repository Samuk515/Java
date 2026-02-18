import java.util.Scanner;

public class oddeven {
    public static void main(String[] args){
        try (Scanner sb = new Scanner(System.in)) {
            System.out.println("Enter Number:");
            int n = sb.nextInt();
            if(n%2 == 0) {
                System.out.println("Even number");
            }
            else {
                 System.out.println("Odd number");
                }
        }



    }
    
}
