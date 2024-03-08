import java.util.Scanner;
public class FloatFactorial{
    public static void main(String[] args){
        float fact = 1;
        long n, i = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Float Factorial");
        System.out.println("Enter a number: ");
        n = scan.nextInt();

        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of "  + n + ": " + fact);
        scan.close();
    }
}