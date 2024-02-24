import java.util.Scanner;
import java.text.*;
public class TownDump {
    public static void main(String[] args){
        int pounds;
        double cost = 0.00;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$00.00");

        System.out.println("New Britain Town Dump");
        System.out.print("Input amount of trash to be disposed (in pounds): ");
        pounds = scan.nextInt();
        if (pounds <= 0) {
            System.out.println("Invalid amount of trash. Program terminated.");
            System.exit(0);
        }
        if (pounds <= 200)
            cost = 20.00;
        if (pounds > 200)
            cost = 20.00 + (8.00 * (int)(pounds / 100 - 2)); 
        System.out.println("Total Cost: " + df.format(cost));
        scan.close();
    }
}
