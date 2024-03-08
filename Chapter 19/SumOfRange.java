import java.util.Scanner;
public class SumOfRange {
    public static void main(String[] args){
        int low, high, sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter low: ");
        low = scan.nextInt();
        System.out.print("Enter high: ");
        high = scan.nextInt();

        while (low <= high){
            sum += low;
            low++;
        }

        System.out.println("Sum = " + sum);
        scan.close();
    }
}
