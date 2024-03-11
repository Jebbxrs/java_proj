import java.util.Scanner;
public class SumOfOddIntegers {
    public static void main(String[] args) {
        int input, sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        input = scan.nextInt();

        for (int i = 0; i <= input; i++) {
            if (i % 2 == 1) 
                sum += i;
        }
        System.out.println("Sum of all odd integers: " + sum);
        System.out.println(input + " to the second power is " + (int)Math.pow(input, 2));
        scan.close();
    }
}
