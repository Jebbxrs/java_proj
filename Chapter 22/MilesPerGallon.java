import java.util.Scanner;
import java.text.*;
public class MilesPerGallon {
    public static void main(String[] args) {
        int startMiles = 0, finalMiles, gallons;
        double milesPerGallon;
        char loopConfirm;
        boolean loopCheck = false;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        while (startMiles >= 0) {
            System.out.println("Miles Per Gallon Program");
            System.out.print("Initial miles: ");
            startMiles = scan.nextInt();
            
            if (startMiles < 0) {
                System.out.println("Error: Invalid input.\nTerminating Program...");
                System.exit(0);
            } 
            System.out.print("Final Miles: ");
            finalMiles = scan.nextInt();
            if (startMiles > finalMiles) {
                System.out.println("Error: Initial miles cannot be greater than final miles.\nTerminating Program...");
                System.exit(0);
            }
            System.out.print("Number of Gallons: ");
            gallons = scan.nextInt();

            milesPerGallon = (double)(finalMiles - startMiles) / gallons;
            
            System.out.println("Miles per gallon: " + df.format(milesPerGallon));
            while (loopCheck == false){
                System.out.print("Would you like to make another entry? ([Y] for Yes and [N] for No): ");
                loopConfirm = scan.next().charAt(0);
                if (loopConfirm == 'Y' || loopConfirm == 'y') {
                    loopCheck = true;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush(); 
                }
                else if (loopConfirm == 'N' || loopConfirm == 'n') {
                    System.out.println("Terminating Program...");
                    System.exit(1);
                }
                else {
                    System.out.println("Warning: Invalid input. Please try again.");
                }
            }
        }
        scan.close();
    }
}