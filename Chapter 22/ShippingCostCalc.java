import java.util.Scanner;
import java.text.DecimalFormat;
public class ShippingCostCalc {
    public static void main(String[] args) {
        final double handlingFee = 3.00, shippingFee = 0.25;
        double shippingCost;
        int weight = 1;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$0.00");

        while (weight > 0){
            System.out.print("Weight of Order: ");
            weight = scan.nextInt();
            
            if (weight <= 10)
                shippingCost = handlingFee;
            else 
                shippingCost = handlingFee + shippingFee * (weight - 10);
            if (weight > 0){
            System.out.println("Shipping Cost: " + df.format(shippingCost));
            System.out.println();
            }
        }
        System.out.println("Program Terminated.");
        scan.close();
    }
}
