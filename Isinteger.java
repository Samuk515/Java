import java.util.Scanner;

public class Isinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x == 0) {
            System.out.println("It is an integer");

        }
        else{
            System.out.println("It is not an integer");
        }
        
    
    }
}
    

