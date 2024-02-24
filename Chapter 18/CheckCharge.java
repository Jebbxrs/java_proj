import java.util.Scanner;
import java.text.*;
public class CheckCharge {
    public static void main(String[] args){
        double savings, checking, charge;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\t\tCheck Charge Program");
        System.out.print("Enter checking account balance: $");
        checking = scan.nextDouble();
        System.out.print("Enter savings account balance: $");
        savings = scan.nextDouble();
        
        if (checking >= 1000 || savings >= 1500)
            charge = 0.00;
        else 
            charge = 0.30;
        System.out.println("Service charge: $" + df.format(charge));
        scan.close();
    }
}
