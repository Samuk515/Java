import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cp:");
        int cp = sc.nextInt();
        System.out.println("Enter sp:");
        int sp = sc.nextInt();
        if (sp > cp){
            System.out.println("It's profit");
        }
        if (cp > sp){
            System.out.println("It's loss");
        }
        if (cp == sp){
            System.out.println("No profit no loss");
        }

        
    }

    
}
