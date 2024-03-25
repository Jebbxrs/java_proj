import java.util.Scanner;

public class OrderChecker {
    public static void main (String[] args){
        final int boltPrice = 5;
        final int nutPrice = 3;
        final int washerPrice = 1;
        int boltAmount, nutAmount, washerAmount, cost;
        Scanner scan = new Scanner (System.in);

        System.out.printf("Number of bolts: ");
        boltAmount = scan.nextInt();
        System.out.printf("Number of nuts: ");
        nutAmount = scan.nextInt();
        System.out.printf("Number of washers: ");
        washerAmount = scan.nextInt();

        if ((nutAmount >= boltAmount) && (boltAmount * 2 >= washerAmount))
            System.out.println("\nCheck the order: too few nuts, too few washers");
        else if (nutAmount <= boltAmount)
            System.out.println("\nCheck the order: too few nuts");
        else if (boltAmount * 2 >= washerAmount)
            System.out.println("\nCheck the order: too few washers");
        else 
            System.out.println("\nCheck the order: Order is OK");

        cost = (boltAmount * boltPrice) + (nutAmount * nutPrice) + (washerAmount * washerPrice);

        System.out.println("\nTotal cost: " + cost);
        scan.close();
    }
} 
