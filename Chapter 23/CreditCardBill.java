import java.util.Scanner;
import java.text.DecimalFormat;
public class CreditCardBill {
    public static void main(String[] args) {
        double startBalance, interestRate, monthlyPay, outstandingBalance, totalPay = 0.00;
        int month = 1;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$00.00"), df2 = new DecimalFormat("00");

        System.out.print("Enter the initial balance: $");
        startBalance = scan.nextDouble();
        System.out.print("Enter the interest rate in percent: ");
        interestRate = scan.nextDouble() / 100.00;
        System.out.print("Enter the monthly payment: $");
        monthlyPay = scan.nextDouble();
        System.out.println();

        outstandingBalance = startBalance;

        while (outstandingBalance > 0) {
            outstandingBalance = outstandingBalance + (outstandingBalance * interestRate) - monthlyPay;
            if (outstandingBalance < 0) {
                totalPay += 100 - Math.abs(outstandingBalance);
                outstandingBalance += Math.abs(outstandingBalance);
            }
            else 
                totalPay += monthlyPay;
            System.out.println("Month " + df2.format(month) + "\tOutstanding Balance: " + df.format(outstandingBalance) + "\tTotal Amount Paid: " + df.format(totalPay));
            month++;
        }
        scan.close();
    }
}
