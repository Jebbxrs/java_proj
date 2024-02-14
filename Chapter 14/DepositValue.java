import java.util.Scanner;
import java.text.DecimalFormat;
public class DepositValue {
    public static void main(String[] args){
        int deposit, timesPerYear, numberOfYears;
        double depositValue, interestRate;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.printf("Initial deposit: ");
        deposit = scan.nextInt();
        System.out.printf("Interest rate  : ");
        interestRate = scan.nextDouble();
        System.out.printf("Times per year : ");
        timesPerYear = scan.nextInt();
        System.out.printf("Number of years: ");
        numberOfYears = scan.nextInt();

        depositValue = deposit * Math.pow((1 + interestRate / timesPerYear), timesPerYear * numberOfYears);

        System.out.println("Value: $" + df.format(depositValue));
        scan.close();
    }
}
