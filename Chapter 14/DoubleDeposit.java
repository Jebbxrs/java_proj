import java.text.DecimalFormat;
import java.util.Scanner;
public class DoubleDeposit {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        int interestRate;
        double time;

        System.out.print("Input interest rate in %: ");
        interestRate = scan.nextInt();

        time = 72.0 / interestRate;

        System.out.println("It would take about " + df.format(time) + " years to double your money.");
        scan.close();
    }
}
