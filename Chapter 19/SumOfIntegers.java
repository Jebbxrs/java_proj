import java.util.Scanner;
public class SumOfIntegers {
    public static void main(String[] args){
        int input, sum = 0, sum2, i = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N: ");
        input = scan.nextInt();

        while (i <= input){
            sum += i;
            i++;
        }

        sum2 = (input * (input + 1)) / 2;

        System.out.println("Loop Sum = " + sum);
        System.out.println("Formula Sum = " + sum2);
        scan.close();
    }
}
