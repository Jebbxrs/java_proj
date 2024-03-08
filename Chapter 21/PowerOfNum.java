import java.util.Scanner;
import java.text.DecimalFormat;
public class PowerOfNum {
    public static void main(String[] args) {
        int power, i = 0;
        float base, result = 1;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");

        System.out.print("Enter the base of the exponent: ");
        base = scan.nextFloat();
        System.out.print("Enter the power of the exponent: ");
        power = scan.nextInt();
        System.out.println();
        if (power < 0){
            System.out.println("The power must be a positive integer.");
            System.exit(0);
        }
        else 
            while (i < power) {
                result *= base;
                i++; 
            }
        System.out.println(base + " raised to the power of " + power + " is: " + df.format(result));
        scan.close();
    }
}
