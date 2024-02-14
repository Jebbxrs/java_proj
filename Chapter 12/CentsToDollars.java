import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args){
        int cents, dollars;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Input the cents: ");
        cents = scan.nextInt();
        
        dollars = cents / 100;

        System.out.println("That is " + dollars + " dollars and " + cents % 100 + " cents.");
        scan.close();
    }
}
