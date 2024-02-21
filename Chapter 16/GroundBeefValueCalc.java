import java.util.Scanner;
import java.text.DecimalFormat;
public class GroundBeefValueCalc {
    public static void main(String[] args){
        double priceA, priceB, costPerPoundA, costPerPoundB;
        int percentA, percentB;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        DecimalFormat df2 = new DecimalFormat("0.000000");
        
        System.out.println("Price per pound package A: ");
        priceA = scan.nextDouble();
        System.out.println("Percent lean package A: ");
        percentA = scan.nextInt();
        System.out.println("Price per pound package B: ");
        priceB = scan.nextDouble();
        System.out.println("Percent lean package B: ");
        percentB = scan.nextInt();

        costPerPoundA = priceA / (percentA / 100.0);
        costPerPoundB = priceB / (percentB / 100.0);

        System.out.println("Package A cost per pound of lean: " + df.format(costPerPoundA));
        System.out.println("Package B cost per pound of lean: " + df2.format(costPerPoundB));

        if (costPerPoundA > costPerPoundB)
            System.out.println("Package B is the best value");
        else 
            System.out.println("Package A is the best value");
        scan.close();
    }   
}
