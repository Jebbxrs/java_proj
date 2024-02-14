import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args){
        int cents, dollars, quarters, dimes, nickels, remainder;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Input the cents: ");
        cents = scan.nextInt();

        dollars = cents / 100;
        remainder = cents % 100;
        quarters = remainder / 25;
        remainder = remainder % 25;
        dimes = remainder / 10;
        remainder = remainder % 10;
        nickels = remainder / 5;
        remainder = remainder % 5;
        cents = remainder;

        System.out.println("Your change is: " + dollars + " dollar(s), " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel(s), and " + cents + " cents.");
        scan.close();
    }
}
