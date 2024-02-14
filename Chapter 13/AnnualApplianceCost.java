import java.util.Scanner;
public class AnnualApplianceCost {
    public static void main(String[] args){
        double cost, annualCost;
        int kwhUsed;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cost per kilowatt-hour");
        cost = scan.nextDouble();
        System.out.println("Enter kilowatt-hours used per year");
        kwhUsed = scan.nextInt();

        annualCost = kwhUsed * cost;

        System.out.println("Annual cost: " + annualCost);
        scan.close();
    }
}
