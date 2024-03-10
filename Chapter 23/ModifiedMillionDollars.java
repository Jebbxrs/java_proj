import java.util.Scanner;
import java.text.DecimalFormat;
public class ModifiedMillionDollars {
  public static void main( String[] args ) {
    double currentValue, rate, initialInvestment, annualContrib;
    int year = 1;     
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("$#,###,###.00");

    System.out.print("Enter the interest rate in percent: "); 
    rate = scan.nextDouble() / 100.0;
    System.out.print("Enter the initial amount invested: $");
    initialInvestment = scan.nextDouble();
    System.out.print("Enter the amount contributed annually: $");
    annualContrib = scan.nextDouble();
    
    currentValue = initialInvestment;
    while (currentValue <= 1000000.00) {
            currentValue += (currentValue * rate) + annualContrib;
            System.out.println("Year " + year + " investment value: " + df.format(currentValue));
            year++;
        }
    scan.close();
    }
}