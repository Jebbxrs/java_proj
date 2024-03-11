import java.util.Scanner;

public class SumOfDivisors {
    public static void main (String[] args) {
        int input, sum = 0;
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter any positive integer:");
        input = scan.nextInt();

        if (input <= 0) {
            System.out.println("Error: Invalid input.");
            System.exit(1);
        }

        for (int i = 1; i < input; i++) {
            if (input % i == 0)
                sum += i;
        }
        System.out.print("Sum of divisors: " + sum);
        if (sum == input)
            System.out.println(" [PERFECT NUMBER]");
        scan.close();
    }
}
