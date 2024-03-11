import java.util.Scanner;
import java.text.DecimalFormat;
public class eToTheXthPower {
    public static void main(String[] args) {
        double sum = 1, term = 1, n = 1.0, x;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

        System.out.print("Enter x: ");
        x = scan.nextDouble();

        while (term > 1.0E-12) {
            term = Math.pow(x, n - 1) / fact(n - 1.0) * (x / n);
            sum += term;
            System.out.println("n:" + df.format(n) + "\tterm: " + term + "\t\tsum: " + sum);
            n++;
        }
        System.out.println("My   e^x: " + sum);
        System.out.println("Real e^x: " + Math.exp(x));
        scan.close();
    }
 
    public static double fact (double n) {
        double fact = 1;
        while (n >= 1) {
            fact *= n;
            n--;
        }
        return fact;
    }
}
