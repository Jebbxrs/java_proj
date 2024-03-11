import java.util.Scanner;
import java.text.*;

public class NewtonsMethod {
    public static void main(String[] args) {
        double firstGuess, quotient, input;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("This program calculates the approximate value of 1/B without the use of division.");
        System.out.print("Enter the value of B: ");
        input = scan.nextDouble();
        System.out.print("Enter value of first guess: ");
        firstGuess = scan.nextDouble();

        quotient = 1.0 / input;

        if (input == 0) {
            System.out.println("Error: division by zero is undefined.");
            System.exit(1);
        } 
        else if (input < 0) {
            System.out.println("Error: Invalid input value.");
            System.exit(1);
        }
        else if (quotient < firstGuess) {
            System.out.println("Error: estimated guess value of 1/B is too small to handle.");
            System.exit(1);
        }
        while (firstGuess <= quotient - 0.01) {
            firstGuess = firstGuess * (2.0 - input * firstGuess);
            System.out.println(firstGuess);
        }
        System.out.println("Estimated guess value of 1/B is " + df.format(firstGuess));
        scan.close();
    }
}